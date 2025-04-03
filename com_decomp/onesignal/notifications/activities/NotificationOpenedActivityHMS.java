package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import db.t;
import kotlin.coroutines.jvm.internal.l;
import m9.b;
import sa.o;
import va.d;

public final class NotificationOpenedActivityHMS extends Activity {

    static final class a extends l implements cb.l {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ t $notificationPayloadProcessorHMS;
        final /* synthetic */ NotificationOpenedActivityHMS $self;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, d dVar) {
            super(1, dVar);
            this.$notificationPayloadProcessorHMS = tVar;
            this.$self = notificationOpenedActivityHMS;
            this.$intent = intent;
        }

        public final d create(d dVar) {
            return new a(this.$notificationPayloadProcessorHMS, this.$self, this.$intent, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.$self;
                Intent intent = this.$intent;
                this.label = 1;
                if (((b) this.$notificationPayloadProcessorHMS.f9426e).handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == c10) {
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

    private final void processIntent() {
        processOpen(getIntent());
        finish();
    }

    private final void processOpen(Intent intent) {
        Context applicationContext = getApplicationContext();
        db.l.d(applicationContext, "applicationContext");
        if (g7.b.f(applicationContext)) {
            t tVar = new t();
            tVar.f9426e = g7.b.f10823a.c().getService(b.class);
            com.onesignal.common.threading.a.suspendifyBlocking(new a(tVar, this, intent, (d) null));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        db.l.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
