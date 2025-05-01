package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.google.firebase.messaging.Constants;
import db.t;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public final class ADMMessageHandler extends ADMMessageHandlerBase {

    static final class a extends l implements cb.l {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ t $registerer;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, String str, d dVar) {
            super(1, dVar);
            this.$registerer = tVar;
            this.$newRegistrationId = str;
        }

        public final d create(d dVar) {
            return new a(this.$registerer, this.$newRegistrationId, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                String str = this.$newRegistrationId;
                this.label = 1;
                if (((com.onesignal.notifications.internal.registration.impl.d) this.$registerer.f9426e).fireCallback(str, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class b extends l implements cb.l {
        final /* synthetic */ t $registerer;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, d dVar) {
            super(1, dVar);
            this.$registerer = tVar;
        }

        public final d create(d dVar) {
            return new b(this.$registerer, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                this.label = 1;
                if (((com.onesignal.notifications.internal.registration.impl.d) this.$registerer.f9426e).fireCallback((String) null, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        db.l.e(intent, "intent");
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        db.l.d(applicationContext, "context");
        db.l.b(extras);
        ((c9.a) g7.b.f10823a.c().getService(c9.a.class)).processBundleFromReceiver(applicationContext, extras);
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        db.l.e(str, "newRegistrationId");
        com.onesignal.debug.internal.logging.a.info$default("ADM registration ID: " + str, (Throwable) null, 2, (Object) null);
        t tVar = new t();
        tVar.f9426e = g7.b.f10823a.c().getService(com.onesignal.notifications.internal.registration.impl.d.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, str, (d) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        db.l.e(str, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        com.onesignal.debug.internal.logging.a.error$default("ADM:onRegistrationError: " + str, (Throwable) null, 2, (Object) null);
        if (db.l.a("INVALID_SENDER", str)) {
            com.onesignal.debug.internal.logging.a.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", (Throwable) null, 2, (Object) null);
        }
        t tVar = new t();
        tVar.f9426e = g7.b.f10823a.c().getService(com.onesignal.notifications.internal.registration.impl.d.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar, (d) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
        db.l.e(str, "info");
        com.onesignal.debug.internal.logging.a.info$default("ADM:onUnregistered: " + str, (Throwable) null, 2, (Object) null);
    }
}
