package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import fa.b;
import fa.c;
import fa.n;
import fa.o0;
import fa.p0;
import fa.s0;
import j4.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import n4.i;
import q3.l;
import q3.m;
import t5.o;

public class GrpcCallProvider {
    private static final int CONNECTIVITY_ATTEMPT_TIMEOUT_MS = 15000;
    private static final String LOG_TAG = "GrpcCallProvider";
    private static Supplier<p0> overrideChannelBuilderSupplier;
    private final AsyncQueue asyncQueue;
    private c callOptions;
    private i channelTask;
    private AsyncQueue.DelayedTask connectivityAttemptTimer;
    private final Context context;
    private final DatabaseInfo databaseInfo;
    private final b firestoreHeaders;

    GrpcCallProvider(AsyncQueue asyncQueue2, Context context2, DatabaseInfo databaseInfo2, b bVar) {
        this.asyncQueue = asyncQueue2;
        this.context = context2;
        this.databaseInfo = databaseInfo2;
        this.firestoreHeaders = bVar;
        initChannelTask();
    }

    private void clearConnectivityAttemptTimer() {
        if (this.connectivityAttemptTimer != null) {
            Logger.debug(LOG_TAG, "Clearing the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer.cancel();
            this.connectivityAttemptTimer = null;
        }
    }

    private o0 initChannel(Context context2, DatabaseInfo databaseInfo2) {
        p0 p0Var;
        try {
            a.a(context2);
        } catch (IllegalStateException | l | m e10) {
            Logger.warn(LOG_TAG, "Failed to update ssl context: %s", e10);
        }
        Supplier<p0> supplier = overrideChannelBuilderSupplier;
        if (supplier != null) {
            p0Var = supplier.get();
        } else {
            p0 b10 = p0.b(databaseInfo2.getHost());
            if (!databaseInfo2.isSslEnabled()) {
                b10.d();
            }
            p0Var = b10;
        }
        p0Var.c(30, TimeUnit.SECONDS);
        return ga.a.k(p0Var).i(context2).a();
    }

    private void initChannelTask() {
        this.channelTask = n4.l.c(Executors.BACKGROUND_EXECUTOR, new s(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i lambda$createClientCall$0(s0 s0Var, i iVar) {
        return n4.l.e(((o0) iVar.getResult()).h(s0Var, this.callOptions));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ o0 lambda$initChannelTask$6() {
        o0 initChannel = initChannel(this.context, this.databaseInfo);
        this.asyncQueue.enqueueAndForget(new t(this, initChannel));
        this.callOptions = ((o.b) ((o.b) o.e(initChannel).c(this.firestoreHeaders)).d(this.asyncQueue.getExecutor())).b();
        Logger.debug(LOG_TAG, "Channel successfully reset.", new Object[0]);
        return initChannel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$1(o0 o0Var) {
        Logger.debug(LOG_TAG, "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        clearConnectivityAttemptTimer();
        resetChannel(o0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$3(o0 o0Var) {
        this.asyncQueue.enqueueAndForget(new w(this, o0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetChannel$4(o0 o0Var) {
        o0Var.o();
        initChannelTask();
    }

    /* access modifiers changed from: private */
    /* renamed from: onConnectivityStateChange */
    public void lambda$onConnectivityStateChange$2(o0 o0Var) {
        n k10 = o0Var.k(true);
        Logger.debug(LOG_TAG, "Current gRPC connectivity state: " + k10, new Object[0]);
        clearConnectivityAttemptTimer();
        if (k10 == n.CONNECTING) {
            Logger.debug(LOG_TAG, "Setting the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.CONNECTIVITY_ATTEMPT_TIMER, 15000, new u(this, o0Var));
        }
        o0Var.l(k10, new v(this, o0Var));
    }

    public static void overrideChannelBuilder(Supplier<p0> supplier) {
        overrideChannelBuilderSupplier = supplier;
    }

    private void resetChannel(o0 o0Var) {
        this.asyncQueue.enqueueAndForget(new r(this, o0Var));
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> i createClientCall(s0 s0Var) {
        return this.channelTask.continueWithTask(this.asyncQueue.getExecutor(), new x(this, s0Var));
    }

    /* access modifiers changed from: package-private */
    public void shutdown() {
        Class<FirestoreChannel> cls = FirestoreChannel.class;
        try {
            o0 o0Var = (o0) n4.l.a(this.channelTask);
            o0Var.n();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!o0Var.i(1, timeUnit)) {
                    Logger.debug(cls.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                    o0Var.o();
                    if (!o0Var.i(60, timeUnit)) {
                        Logger.warn(cls.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                o0Var.o();
                Logger.warn(cls.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (ExecutionException e10) {
            Logger.warn(cls.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e10);
        } catch (InterruptedException unused2) {
            Logger.warn(cls.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
