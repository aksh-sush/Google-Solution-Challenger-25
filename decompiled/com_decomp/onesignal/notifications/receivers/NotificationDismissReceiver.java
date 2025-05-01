package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import db.t;
import g7.b;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public final class NotificationDismissReceiver extends BroadcastReceiver {

    static final class a extends l implements cb.l {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ t $notificationOpenedProcessor;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, Context context, Intent intent, d dVar) {
            super(1, dVar);
            this.$notificationOpenedProcessor = tVar;
            this.$context = context;
            this.$intent = intent;
        }

        public final d create(d dVar) {
            return new a(this.$notificationOpenedProcessor, this.$context, this.$intent, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                if (((m9.a) this.$notificationOpenedProcessor.f9426e).processFromContext(context, intent, this) == c10) {
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

    public void onReceive(Context context, Intent intent) {
        db.l.e(context, "context");
        db.l.e(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        db.l.d(applicationContext, "context.applicationContext");
        if (b.f(applicationContext)) {
            t tVar = new t();
            tVar.f9426e = b.f10823a.c().getService(m9.a.class);
            com.onesignal.common.threading.a.suspendifyBlocking(new a(tVar, context, intent, (d) null));
        }
    }
}
