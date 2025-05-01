package com.google.firebase.messaging;

import com.google.android.gms.internal.firebase_messaging.zzi;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z3.b;

abstract class m {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Firebase-Messaging-Trigger-Topics-Io"));
    }

    static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Init"));
    }

    static ExecutorService c() {
        zzi.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService f() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Topics-Io"));
    }

    static Executor g() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
