package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import db.t;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public abstract class a extends Activity {

    /* renamed from: com.onesignal.notifications.activities.a$a  reason: collision with other inner class name */
    static final class C0165a extends l implements cb.l {
        final /* synthetic */ t $self;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0165a(t tVar, a aVar, d dVar) {
            super(1, dVar);
            this.$self = tVar;
            this.this$0 = aVar;
        }

        public final d create(d dVar) {
            return new C0165a(this.$self, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                Intent intent = this.this$0.getIntent();
                db.l.d(intent, "intent");
                this.label = 1;
                if (((m9.a) g7.b.f10823a.c().getService(m9.a.class)).processFromContext((Context) this.$self.f9426e, intent, this) == c10) {
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
            return ((C0165a) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class b extends l implements cb.l {
        final /* synthetic */ t $self;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, a aVar, d dVar) {
            super(1, dVar);
            this.$self = tVar;
            this.this$0 = aVar;
        }

        public final d create(d dVar) {
            return new b(this.$self, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                Intent intent = this.this$0.getIntent();
                db.l.d(intent, "getIntent()");
                this.label = 1;
                if (((m9.a) g7.b.f10823a.c().getService(m9.a.class)).processFromContext((Context) this.$self.f9426e, intent, this) == c10) {
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        db.l.d(applicationContext, "applicationContext");
        if (g7.b.f(applicationContext)) {
            t tVar = new t();
            tVar.f9426e = this;
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0165a(tVar, this, (d) null), 1, (Object) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        db.l.e(intent, "intent");
        super.onNewIntent(intent);
        Context applicationContext = getApplicationContext();
        db.l.d(applicationContext, "applicationContext");
        if (g7.b.f(applicationContext)) {
            t tVar = new t();
            tVar.f9426e = this;
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(tVar, this, (d) null), 1, (Object) null);
            finish();
        }
    }
}
