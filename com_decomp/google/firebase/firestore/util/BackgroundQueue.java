package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

public class BackgroundQueue implements Executor {
    private Semaphore completedTasks = new Semaphore(0);
    private int pendingTaskCount = 0;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.completedTasks.release();
    }

    public void drain() {
        this.completedTasks.acquire(this.pendingTaskCount);
        this.pendingTaskCount = 0;
    }

    public void execute(Runnable runnable) {
        this.pendingTaskCount++;
        Executors.BACKGROUND_EXECUTOR.execute(new l(this, runnable));
    }
}
