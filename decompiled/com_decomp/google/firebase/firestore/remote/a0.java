package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import fa.d1;
import java.util.Locale;

class a0 {

    /* renamed from: a  reason: collision with root package name */
    private OnlineState f8178a = OnlineState.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private int f8179b;

    /* renamed from: c  reason: collision with root package name */
    private AsyncQueue.DelayedTask f8180c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8181d = true;

    /* renamed from: e  reason: collision with root package name */
    private final AsyncQueue f8182e;

    /* renamed from: f  reason: collision with root package name */
    private final a f8183f;

    interface a {
        void handleOnlineStateChange(OnlineState onlineState);
    }

    a0(AsyncQueue asyncQueue, a aVar) {
        this.f8182e = asyncQueue;
        this.f8183f = aVar;
    }

    private void b() {
        AsyncQueue.DelayedTask delayedTask = this.f8180c;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.f8180c = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f8180c = null;
        Assert.hardAssert(this.f8178a == OnlineState.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", new Object[]{10}));
        h(OnlineState.OFFLINE);
    }

    private void g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", new Object[]{str});
        Object[] objArr = new Object[1];
        if (this.f8181d) {
            objArr[0] = format;
            Logger.warn("OnlineStateTracker", "%s", objArr);
            this.f8181d = false;
            return;
        }
        objArr[0] = format;
        Logger.debug("OnlineStateTracker", "%s", objArr);
    }

    private void h(OnlineState onlineState) {
        if (onlineState != this.f8178a) {
            this.f8178a = onlineState;
            this.f8183f.handleOnlineStateChange(onlineState);
        }
    }

    /* access modifiers changed from: package-private */
    public OnlineState c() {
        return this.f8178a;
    }

    /* access modifiers changed from: package-private */
    public void d(d1 d1Var) {
        boolean z10 = true;
        if (this.f8178a == OnlineState.ONLINE) {
            h(OnlineState.UNKNOWN);
            Assert.hardAssert(this.f8179b == 0, "watchStreamFailures must be 0", new Object[0]);
            if (this.f8180c != null) {
                z10 = false;
            }
            Assert.hardAssert(z10, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i10 = this.f8179b + 1;
        this.f8179b = i10;
        if (i10 >= 1) {
            b();
            g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", new Object[]{1, d1Var}));
            h(OnlineState.OFFLINE);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f8179b == 0) {
            h(OnlineState.UNKNOWN);
            Assert.hardAssert(this.f8180c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f8180c = this.f8182e.enqueueAfterDelay(AsyncQueue.TimerId.ONLINE_STATE_TIMEOUT, 10000, new z(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void i(OnlineState onlineState) {
        b();
        this.f8179b = 0;
        if (onlineState == OnlineState.ONLINE) {
            this.f8181d = false;
        }
        h(onlineState);
    }
}
