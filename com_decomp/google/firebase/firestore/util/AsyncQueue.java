package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import n4.i;
import n4.j;

public class AsyncQueue {
    private final ArrayList<DelayedTask> delayedTasks = new ArrayList<>();
    /* access modifiers changed from: private */
    public final b executor = new b();
    private final ArrayList<TimerId> timerIdsToSkip = new ArrayList<>();

    public class DelayedTask {
        private ScheduledFuture scheduledFuture;
        /* access modifiers changed from: private */
        public final long targetTimeMs;
        private final Runnable task;
        /* access modifiers changed from: private */
        public final TimerId timerId;

        private DelayedTask(TimerId timerId2, long j10, Runnable runnable) {
            this.timerId = timerId2;
            this.targetTimeMs = j10;
            this.task = runnable;
        }

        /* access modifiers changed from: private */
        public void handleDelayElapsed() {
            AsyncQueue.this.verifyIsCurrentThread();
            if (this.scheduledFuture != null) {
                markDone();
                this.task.run();
            }
        }

        private void markDone() {
            Assert.hardAssert(this.scheduledFuture != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.scheduledFuture = null;
            AsyncQueue.this.removeDelayedTask(this);
        }

        /* access modifiers changed from: private */
        public void start(long j10) {
            this.scheduledFuture = AsyncQueue.this.executor.schedule(new h(this), j10, TimeUnit.MILLISECONDS);
        }

        public void cancel() {
            AsyncQueue.this.verifyIsCurrentThread();
            ScheduledFuture scheduledFuture2 = this.scheduledFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                markDone();
            }
        }

        /* access modifiers changed from: package-private */
        public void skipDelay() {
            handleDelayElapsed();
        }
    }

    public enum TimerId {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER
    }

    private class b implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f8242e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8243f = false;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Thread f8244g;

        class a extends ScheduledThreadPoolExecutor {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AsyncQueue f8246e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(int i10, ThreadFactory threadFactory, AsyncQueue asyncQueue) {
                super(i10, threadFactory);
                this.f8246e = asyncQueue;
            }

            /* access modifiers changed from: protected */
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (CancellationException unused) {
                    } catch (ExecutionException e10) {
                        th = e10.getCause();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (th != null) {
                    AsyncQueue.this.panic(th);
                }
            }
        }

        /* renamed from: com.google.firebase.firestore.util.AsyncQueue$b$b  reason: collision with other inner class name */
        private class C0105b implements Runnable, ThreadFactory {

            /* renamed from: e  reason: collision with root package name */
            private final CountDownLatch f8248e;

            /* renamed from: f  reason: collision with root package name */
            private Runnable f8249f;

            private C0105b() {
                this.f8248e = new CountDownLatch(1);
            }

            public Thread newThread(Runnable runnable) {
                Assert.hardAssert(this.f8249f == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f8249f = runnable;
                this.f8248e.countDown();
                return b.this.f8244g;
            }

            public void run() {
                try {
                    this.f8248e.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f8249f.run();
            }
        }

        b() {
            C0105b bVar = new C0105b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f8244g = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new i(this));
            a aVar = new a(1, bVar, AsyncQueue.this);
            this.f8242e = aVar;
            aVar.setKeepAliveTime(3, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: private */
        public synchronized i l(Runnable runnable) {
            if (o()) {
                j jVar = new j();
                jVar.c((Object) null);
                return jVar.a();
            }
            i m10 = m(new j(runnable));
            this.f8243f = true;
            return m10;
        }

        /* access modifiers changed from: private */
        public i m(Callable callable) {
            j jVar = new j();
            try {
                execute(new k(jVar, callable));
            } catch (RejectedExecutionException unused) {
                Logger.warn(AsyncQueue.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return jVar.a();
        }

        /* access modifiers changed from: private */
        public synchronized boolean o() {
            return this.f8243f;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void q(j jVar, Callable callable) {
            try {
                jVar.c(callable.call());
            } catch (Exception e10) {
                jVar.b(e10);
                throw new RuntimeException(e10);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Thread thread, Throwable th) {
            AsyncQueue.this.panic(th);
        }

        /* access modifiers changed from: private */
        public void s(int i10) {
            this.f8242e.setCorePoolSize(i10);
        }

        /* access modifiers changed from: private */
        public synchronized ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f8243f) {
                return null;
            }
            return this.f8242e.schedule(runnable, j10, timeUnit);
        }

        /* access modifiers changed from: private */
        public void t() {
            this.f8242e.shutdownNow();
        }

        public synchronized void execute(Runnable runnable) {
            if (!this.f8243f) {
                this.f8242e.execute(runnable);
            }
        }

        public void n(Runnable runnable) {
            try {
                this.f8242e.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Logger.warn(AsyncQueue.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    public static <TResult> i callTask(Executor executor2, Callable<i> callable) {
        j jVar = new j();
        executor2.execute(new e(callable, executor2, jVar));
        return jVar.a();
    }

    private DelayedTask createAndScheduleDelayedTask(TimerId timerId, long j10, Runnable runnable) {
        DelayedTask delayedTask = new DelayedTask(timerId, System.currentTimeMillis() + j10, runnable);
        delayedTask.start(j10);
        return delayedTask;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$callTask$0(j jVar, i iVar) {
        if (iVar.isSuccessful()) {
            jVar.c(iVar.getResult());
            return null;
        }
        jVar.b(iVar.getException());
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$callTask$1(Callable callable, Executor executor2, j jVar) {
        try {
            ((i) callable.call()).continueWith(executor2, new c(jVar));
        } catch (Exception e10) {
            jVar.b(e10);
        } catch (Throwable th) {
            jVar.b(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$panic$3(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (23.0.3) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
            outOfMemoryError.initCause(th);
            throw outOfMemoryError;
        }
        throw new RuntimeException("Internal error in Cloud Firestore (23.0.3).", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runDelayedTasksUntil$6(TimerId timerId) {
        Assert.hardAssert(timerId == TimerId.ALL || containsDelayedTask(timerId), "Attempted to run tasks until missing TimerId: %s", timerId);
        Collections.sort(this.delayedTasks, new b());
        Iterator it = new ArrayList(this.delayedTasks).iterator();
        while (it.hasNext()) {
            DelayedTask delayedTask = (DelayedTask) it.next();
            delayedTask.skipDelay();
            if (timerId != TimerId.ALL && delayedTask.timerId == timerId) {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSync$4(Runnable runnable, Throwable[] thArr, Semaphore semaphore) {
        try {
            runnable.run();
        } catch (Throwable th) {
            thArr[0] = th;
        }
        semaphore.release();
    }

    /* access modifiers changed from: private */
    public void removeDelayedTask(DelayedTask delayedTask) {
        Assert.hardAssert(this.delayedTasks.remove(delayedTask), "Delayed task not found.", new Object[0]);
    }

    public boolean containsDelayedTask(TimerId timerId) {
        Iterator<DelayedTask> it = this.delayedTasks.iterator();
        while (it.hasNext()) {
            if (it.next().timerId == timerId) {
                return true;
            }
        }
        return false;
    }

    public i enqueue(Runnable runnable) {
        return enqueue(new a(runnable));
    }

    public DelayedTask enqueueAfterDelay(TimerId timerId, long j10, Runnable runnable) {
        if (this.timerIdsToSkip.contains(timerId)) {
            j10 = 0;
        }
        DelayedTask createAndScheduleDelayedTask = createAndScheduleDelayedTask(timerId, j10, runnable);
        this.delayedTasks.add(createAndScheduleDelayedTask);
        return createAndScheduleDelayedTask;
    }

    public void enqueueAndForget(Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueueAndForgetEvenAfterShutdown(Runnable runnable) {
        this.executor.n(runnable);
    }

    public i enqueueAndInitiateShutdown(Runnable runnable) {
        return this.executor.l(runnable);
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public boolean isShuttingDown() {
        return this.executor.o();
    }

    public void panic(Throwable th) {
        this.executor.t();
        new Handler(Looper.getMainLooper()).post(new g(th));
    }

    public void runDelayedTasksUntil(TimerId timerId) {
        runSync(new d(this, timerId));
    }

    public void runSync(Runnable runnable) {
        Semaphore semaphore = new Semaphore(0);
        Throwable[] thArr = new Throwable[1];
        enqueueAndForget(new f(runnable, thArr, semaphore));
        semaphore.acquire(1);
        if (thArr[0] != null) {
            throw new RuntimeException("Synchronous task failed", thArr[0]);
        }
    }

    public void shutdown() {
        this.executor.s(0);
    }

    public void skipDelaysForTimerId(TimerId timerId) {
        this.timerIdsToSkip.add(timerId);
    }

    public void verifyIsCurrentThread() {
        Thread currentThread = Thread.currentThread();
        if (this.executor.f8244g != currentThread) {
            throw Assert.fail("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.executor.f8244g.getName(), Long.valueOf(this.executor.f8244g.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }

    public <T> i enqueue(Callable<T> callable) {
        return this.executor.m(callable);
    }
}
