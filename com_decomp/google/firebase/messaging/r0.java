package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class r0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8449a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f8450b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseMessaging f8451c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstallationsApi f8452d;

    /* renamed from: e  reason: collision with root package name */
    private final i0 f8453e;

    /* renamed from: f  reason: collision with root package name */
    private final e0 f8454f;

    r0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, i0 i0Var, e0 e0Var) {
        this.f8449a = context;
        this.f8450b = scheduledExecutorService;
        this.f8451c = firebaseMessaging;
        this.f8452d = firebaseInstallationsApi;
        this.f8453e = i0Var;
        this.f8454f = e0Var;
    }

    public Object call() {
        return s0.i(this.f8449a, this.f8450b, this.f8451c, this.f8452d, this.f8453e, this.f8454f);
    }
}
