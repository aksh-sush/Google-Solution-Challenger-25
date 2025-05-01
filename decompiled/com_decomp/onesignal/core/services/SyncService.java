package com.onesignal.core.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import db.t;
import g7.b;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public final class SyncService extends Service {

    static final class a extends l implements cb.l {
        final /* synthetic */ t $backgroundService;
        int label;
        final /* synthetic */ SyncService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, SyncService syncService, d dVar) {
            super(1, dVar);
            this.$backgroundService = tVar;
            this.this$0 = syncService;
        }

        public final d create(d dVar) {
            return new a(this.$backgroundService, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                this.label = 1;
                if (((n7.a) this.$backgroundService.f9426e).runBackgroundServices(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.onesignal.debug.internal.logging.a.debug$default("LegacySyncRunnable:Stopped", (Throwable) null, 2, (Object) null);
            this.this$0.stopSelf();
            return sa.t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    public IBinder onBind(Intent intent) {
        db.l.e(intent, "intent");
        return null;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        db.l.e(intent, "intent");
        if (!b.f(this)) {
            return 1;
        }
        t tVar = new t();
        tVar.f9426e = b.f10823a.c().getService(n7.a.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, this, (d) null), 1, (Object) null);
        return 1;
    }
}
