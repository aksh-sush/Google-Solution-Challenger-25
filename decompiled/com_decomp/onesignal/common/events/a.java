package com.onesignal.common.events;

import cb.p;
import kotlin.coroutines.jvm.internal.l;
import mb.h;
import mb.h0;
import mb.w0;
import sa.o;
import sa.t;
import va.d;

public class a implements c {
    /* access modifiers changed from: private */
    public Object callback;

    /* renamed from: com.onesignal.common.events.a$a  reason: collision with other inner class name */
    static final class C0115a extends l implements cb.l {
        final /* synthetic */ cb.l $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0115a(a aVar, cb.l lVar, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
            this.$callback = lVar;
        }

        public final d create(d dVar) {
            return new C0115a(this.this$0, this.$callback, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                if (this.this$0.callback != null) {
                    cb.l lVar = this.$callback;
                    Object access$getCallback$p = this.this$0.callback;
                    db.l.b(access$getCallback$p);
                    lVar.invoke(access$getCallback$p);
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(d dVar) {
            return ((C0115a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends l implements p {
        final /* synthetic */ p $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, a aVar, d dVar) {
            super(2, dVar);
            this.$callback = pVar;
            this.this$0 = aVar;
        }

        public final d create(Object obj, d dVar) {
            return new b(this.$callback, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                p pVar = this.$callback;
                Object access$getCallback$p = this.this$0.callback;
                db.l.b(access$getCallback$p);
                this.label = 1;
                if (pVar.invoke(access$getCallback$p, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public final void fire(cb.l lVar) {
        db.l.e(lVar, "callback");
        Object obj = this.callback;
        if (obj != null) {
            db.l.b(obj);
            lVar.invoke(obj);
        }
    }

    public final void fireOnMain(cb.l lVar) {
        db.l.e(lVar, "callback");
        com.onesignal.common.threading.a.suspendifyOnMain(new C0115a(this, lVar, (d) null));
    }

    public boolean getHasCallback() {
        return this.callback != null;
    }

    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(p pVar, d dVar) {
        Object obj = this.callback;
        if (obj == null) {
            return t.f15300a;
        }
        db.l.b(obj);
        Object invoke = pVar.invoke(obj, dVar);
        return invoke == d.c() ? invoke : t.f15300a;
    }

    public final Object suspendingFireOnMain(p pVar, d dVar) {
        if (this.callback == null) {
            return t.f15300a;
        }
        Object g10 = h.g(w0.c(), new b(pVar, this, (d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }
}
