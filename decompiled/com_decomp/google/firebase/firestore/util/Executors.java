package com.google.firebase.firestore.util;

import android.os.AsyncTask;
import androidx.profileinstaller.h;
import java.util.concurrent.Executor;
import n4.k;

public final class Executors {
    private static final int ASYNC_THREAD_POOL_MAXIMUM_CONCURRENCY = 4;
    public static final Executor BACKGROUND_EXECUTOR = new q(4, AsyncTask.THREAD_POOL_EXECUTOR);
    public static final Executor DEFAULT_CALLBACK_EXECUTOR = k.f13518a;
    public static final Executor DIRECT_EXECUTOR = new h();

    private Executors() {
    }
}
