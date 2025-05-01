package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class LruGarbageCollector {
    /* access modifiers changed from: private */
    public static final long INITIAL_GC_DELAY_MS;
    /* access modifiers changed from: private */
    public static final long REGULAR_GC_DELAY_MS;
    private final LruDelegate delegate;
    /* access modifiers changed from: private */
    public final Params params;

    public static class Params {
        private static final long COLLECTION_DISABLED = -1;
        private static final long DEFAULT_CACHE_SIZE_BYTES = 104857600;
        private static final int DEFAULT_COLLECTION_PERCENTILE = 10;
        private static final int DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT = 1000;
        final int maximumSequenceNumbersToCollect;
        final long minBytesThreshold;
        final int percentileToCollect;

        Params(long j10, int i10, int i11) {
            this.minBytesThreshold = j10;
            this.percentileToCollect = i10;
            this.maximumSequenceNumbersToCollect = i11;
        }

        public static Params Default() {
            return new Params(DEFAULT_CACHE_SIZE_BYTES, 10, DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT);
        }

        public static Params Disabled() {
            return new Params(-1, 0, 0);
        }

        public static Params WithCacheSizeBytes(long j10) {
            return new Params(j10, 10, DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT);
        }
    }

    public static class Results {
        private final int documentsRemoved;
        private final boolean hasRun;
        private final int sequenceNumbersCollected;
        private final int targetsRemoved;

        Results(boolean z10, int i10, int i11, int i12) {
            this.hasRun = z10;
            this.sequenceNumbersCollected = i10;
            this.targetsRemoved = i11;
            this.documentsRemoved = i12;
        }

        static Results DidNotRun() {
            return new Results(false, 0, 0, 0);
        }

        public int getDocumentsRemoved() {
            return this.documentsRemoved;
        }

        public int getSequenceNumbersCollected() {
            return this.sequenceNumbersCollected;
        }

        public int getTargetsRemoved() {
            return this.targetsRemoved;
        }

        public boolean hasRun() {
            return this.hasRun;
        }
    }

    public class Scheduler implements GarbageCollectionScheduler {
        private final AsyncQueue asyncQueue;
        private AsyncQueue.DelayedTask gcTask;
        private boolean hasRun = false;
        private final LocalStore localStore;

        public Scheduler(AsyncQueue asyncQueue2, LocalStore localStore2) {
            this.asyncQueue = asyncQueue2;
            this.localStore = localStore2;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleGC$0() {
            this.localStore.collectGarbage(LruGarbageCollector.this);
            this.hasRun = true;
            scheduleGC();
        }

        private void scheduleGC() {
            this.gcTask = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.GARBAGE_COLLECTION, this.hasRun ? LruGarbageCollector.REGULAR_GC_DELAY_MS : LruGarbageCollector.INITIAL_GC_DELAY_MS, new x(this));
        }

        public void start() {
            if (LruGarbageCollector.this.params.minBytesThreshold != -1) {
                scheduleGC();
            }
        }

        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.gcTask;
            if (delayedTask != null) {
                delayedTask.cancel();
            }
        }
    }

    private static class a {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator f7927c = new w();

        /* renamed from: a  reason: collision with root package name */
        private final PriorityQueue f7928a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7929b;

        a(int i10) {
            this.f7929b = i10;
            this.f7928a = new PriorityQueue(i10, f7927c);
        }

        /* access modifiers changed from: package-private */
        public void b(Long l10) {
            if (this.f7928a.size() >= this.f7929b) {
                if (l10.longValue() < ((Long) this.f7928a.peek()).longValue()) {
                    this.f7928a.poll();
                } else {
                    return;
                }
            }
            this.f7928a.add(l10);
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return ((Long) this.f7928a.peek()).longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        INITIAL_GC_DELAY_MS = timeUnit.toMillis(1);
        REGULAR_GC_DELAY_MS = timeUnit.toMillis(5);
    }

    LruGarbageCollector(LruDelegate lruDelegate, Params params2) {
        this.delegate = lruDelegate;
        this.params = params2;
    }

    private Results runGarbageCollection(SparseArray<?> sparseArray) {
        long currentTimeMillis = System.currentTimeMillis();
        int calculateQueryCount = calculateQueryCount(this.params.percentileToCollect);
        if (calculateQueryCount > this.params.maximumSequenceNumbersToCollect) {
            Logger.debug("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.params.maximumSequenceNumbersToCollect + " from " + calculateQueryCount, new Object[0]);
            calculateQueryCount = this.params.maximumSequenceNumbersToCollect;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long nthSequenceNumber = getNthSequenceNumber(calculateQueryCount);
        long currentTimeMillis3 = System.currentTimeMillis();
        int removeTargets = removeTargets(nthSequenceNumber, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int removeOrphanedDocuments = removeOrphanedDocuments(nthSequenceNumber);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (Logger.isDebugEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LRU Garbage Collection:\n" + "\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", new Object[]{Integer.valueOf(calculateQueryCount), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)}));
            Logger.debug("LruGarbageCollector", ((sb2.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", new Object[]{Integer.valueOf(removeTargets), Long.valueOf(currentTimeMillis4 - currentTimeMillis3)})) + String.format(locale, "\tRemoved %d documents in %dms\n", new Object[]{Integer.valueOf(removeOrphanedDocuments), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)})) + String.format(locale, "Total Duration: %dms", new Object[]{Long.valueOf(currentTimeMillis5 - currentTimeMillis)}), new Object[0]);
        }
        return new Results(true, calculateQueryCount, removeTargets, removeOrphanedDocuments);
    }

    /* access modifiers changed from: package-private */
    public int calculateQueryCount(int i10) {
        return (int) ((((float) i10) / 100.0f) * ((float) this.delegate.getSequenceNumberCount()));
    }

    /* access modifiers changed from: package-private */
    public Results collect(SparseArray<?> sparseArray) {
        if (this.params.minBytesThreshold == -1) {
            Logger.debug("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
        } else {
            long byteSize = getByteSize();
            if (byteSize >= this.params.minBytesThreshold) {
                return runGarbageCollection(sparseArray);
            }
            Logger.debug("LruGarbageCollector", "Garbage collection skipped; Cache size " + byteSize + " is lower than threshold " + this.params.minBytesThreshold, new Object[0]);
        }
        return Results.DidNotRun();
    }

    /* access modifiers changed from: package-private */
    public long getByteSize() {
        return this.delegate.getByteSize();
    }

    /* access modifiers changed from: package-private */
    public long getNthSequenceNumber(int i10) {
        if (i10 == 0) {
            return -1;
        }
        a aVar = new a(i10);
        this.delegate.forEachTarget(new u(aVar));
        this.delegate.forEachOrphanedDocumentSequenceNumber(new v(aVar));
        return aVar.c();
    }

    public Scheduler newScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
        return new Scheduler(asyncQueue, localStore);
    }

    /* access modifiers changed from: package-private */
    public int removeOrphanedDocuments(long j10) {
        return this.delegate.removeOrphanedDocuments(j10);
    }

    /* access modifiers changed from: package-private */
    public int removeTargets(long j10, SparseArray<?> sparseArray) {
        return this.delegate.removeTargets(j10, sparseArray);
    }
}
