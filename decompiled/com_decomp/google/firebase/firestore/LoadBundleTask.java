package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import n4.c;
import n4.d;
import n4.e;
import n4.f;
import n4.h;
import n4.i;
import n4.j;
import n4.k;

public class LoadBundleTask extends i {
    private final j completionSource;
    private final i delegate;
    private final Object lock = new Object();
    private final Queue<a> progressListeners;
    private LoadBundleTaskProgress snapshot = LoadBundleTaskProgress.INITIAL;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        Executor f7823a;

        /* renamed from: b  reason: collision with root package name */
        OnProgressListener f7824b;

        a(Executor executor, OnProgressListener onProgressListener) {
            this.f7823a = executor == null ? k.f13518a : executor;
            this.f7824b = onProgressListener;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(LoadBundleTaskProgress loadBundleTaskProgress) {
            this.f7824b.onProgress(loadBundleTaskProgress);
        }

        public void b(LoadBundleTaskProgress loadBundleTaskProgress) {
            this.f7823a.execute(new n(this, loadBundleTaskProgress));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f7824b.equals(((a) obj).f7824b);
        }

        public int hashCode() {
            return this.f7824b.hashCode();
        }
    }

    public LoadBundleTask() {
        j jVar = new j();
        this.completionSource = jVar;
        this.delegate = jVar.a();
        this.progressListeners = new ArrayDeque();
    }

    /* access modifiers changed from: private */
    /* renamed from: removeOnProgressListener */
    public void lambda$addOnProgressListener$0(OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
        synchronized (this.lock) {
            this.progressListeners.remove(new a((Executor) null, onProgressListener));
        }
    }

    public i addOnCanceledListener(Activity activity, c cVar) {
        return this.delegate.addOnCanceledListener(activity, cVar);
    }

    public i addOnCompleteListener(Activity activity, d dVar) {
        return this.delegate.addOnCompleteListener(activity, dVar);
    }

    public i addOnFailureListener(Activity activity, e eVar) {
        return this.delegate.addOnFailureListener(activity, eVar);
    }

    public LoadBundleTask addOnProgressListener(Activity activity, OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
        a aVar = new a((Executor) null, onProgressListener);
        synchronized (this.lock) {
            this.progressListeners.add(aVar);
        }
        com.google.android.gms.common.api.internal.a.a(activity).b(new m(this, onProgressListener));
        return this;
    }

    public i addOnSuccessListener(Activity activity, f fVar) {
        return this.delegate.addOnSuccessListener(activity, fVar);
    }

    public <TContinuationResult> i continueWith(Executor executor, n4.a aVar) {
        return this.delegate.continueWith(executor, aVar);
    }

    public <TContinuationResult> i continueWithTask(Executor executor, n4.a aVar) {
        return this.delegate.continueWithTask(executor, aVar);
    }

    public Exception getException() {
        return this.delegate.getException();
    }

    public LoadBundleTaskProgress getResult() {
        return (LoadBundleTaskProgress) this.delegate.getResult();
    }

    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    public boolean isComplete() {
        return this.delegate.isComplete();
    }

    public boolean isSuccessful() {
        return this.delegate.isSuccessful();
    }

    public <TContinuationResult> i onSuccessTask(Executor executor, h hVar) {
        return this.delegate.onSuccessTask(executor, hVar);
    }

    public void setException(Exception exc) {
        synchronized (this.lock) {
            LoadBundleTaskProgress loadBundleTaskProgress = new LoadBundleTaskProgress(this.snapshot.getDocumentsLoaded(), this.snapshot.getTotalDocuments(), this.snapshot.getBytesLoaded(), this.snapshot.getTotalBytes(), exc, LoadBundleTaskProgress.TaskState.ERROR);
            this.snapshot = loadBundleTaskProgress;
            for (a b10 : this.progressListeners) {
                b10.b(loadBundleTaskProgress);
            }
            this.progressListeners.clear();
        }
        this.completionSource.b(exc);
    }

    public void setResult(LoadBundleTaskProgress loadBundleTaskProgress) {
        boolean equals = loadBundleTaskProgress.getTaskState().equals(LoadBundleTaskProgress.TaskState.SUCCESS);
        Assert.hardAssert(equals, "Expected success, but was " + loadBundleTaskProgress.getTaskState(), new Object[0]);
        synchronized (this.lock) {
            this.snapshot = loadBundleTaskProgress;
            for (a b10 : this.progressListeners) {
                b10.b(this.snapshot);
            }
            this.progressListeners.clear();
        }
        this.completionSource.c(loadBundleTaskProgress);
    }

    public void updateProgress(LoadBundleTaskProgress loadBundleTaskProgress) {
        synchronized (this.lock) {
            this.snapshot = loadBundleTaskProgress;
            for (a b10 : this.progressListeners) {
                b10.b(loadBundleTaskProgress);
            }
        }
    }

    public i addOnCanceledListener(Executor executor, c cVar) {
        return this.delegate.addOnCanceledListener(executor, cVar);
    }

    public i addOnCompleteListener(Executor executor, d dVar) {
        return this.delegate.addOnCompleteListener(executor, dVar);
    }

    public i addOnFailureListener(Executor executor, e eVar) {
        return this.delegate.addOnFailureListener(executor, eVar);
    }

    public LoadBundleTask addOnProgressListener(OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
        a aVar = new a((Executor) null, onProgressListener);
        synchronized (this.lock) {
            this.progressListeners.add(aVar);
        }
        return this;
    }

    public i addOnSuccessListener(Executor executor, f fVar) {
        return this.delegate.addOnSuccessListener(executor, fVar);
    }

    public <TContinuationResult> i continueWith(n4.a aVar) {
        return this.delegate.continueWith(aVar);
    }

    public <TContinuationResult> i continueWithTask(n4.a aVar) {
        return this.delegate.continueWithTask(aVar);
    }

    public <X extends Throwable> LoadBundleTaskProgress getResult(Class<X> cls) {
        return (LoadBundleTaskProgress) this.delegate.getResult(cls);
    }

    public <TContinuationResult> i onSuccessTask(h hVar) {
        return this.delegate.onSuccessTask(hVar);
    }

    public i addOnCanceledListener(c cVar) {
        return this.delegate.addOnCanceledListener(cVar);
    }

    public i addOnCompleteListener(d dVar) {
        return this.delegate.addOnCompleteListener(dVar);
    }

    public i addOnFailureListener(e eVar) {
        return this.delegate.addOnFailureListener(eVar);
    }

    public LoadBundleTask addOnProgressListener(Executor executor, OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
        a aVar = new a(executor, onProgressListener);
        synchronized (this.lock) {
            this.progressListeners.add(aVar);
        }
        return this;
    }

    public i addOnSuccessListener(f fVar) {
        return this.delegate.addOnSuccessListener(fVar);
    }
}
