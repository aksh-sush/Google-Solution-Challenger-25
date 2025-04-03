package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import db.t;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

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

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        db.l.b(context);
        db.l.b(extras);
        ((c9.a) g7.b.f10823a.c().getService(c9.a.class)).processBundleFromReceiver(context, extras);
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        com.onesignal.debug.internal.logging.a.info$default("ADM registration ID: " + str, (Throwable) null, 2, (Object) null);
        t tVar = new t();
        tVar.f9426e = g7.b.f10823a.c().getService(com.onesignal.notifications.internal.registration.impl.d.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, str, (d) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        com.onesignal.debug.internal.logging.a.error$default("ADM:onRegistrationError: " + str, (Throwable) null, 2, (Object) null);
        if (db.l.a("INVALID_SENDER", str)) {
            com.onesignal.debug.internal.logging.a.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", (Throwable) null, 2, (Object) null);
        }
        t tVar = new t();
        tVar.f9426e = g7.b.f10823a.c().getService(com.onesignal.notifications.internal.registration.impl.d.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar, (d) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        com.onesignal.debug.internal.logging.a.info$default("ADM:onUnregistered: " + str, (Throwable) null, 2, (Object) null);
    }
}
