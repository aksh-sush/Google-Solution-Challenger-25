package com.onesignal.common.events;

import cb.p;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import mb.h;
import mb.h0;
import mb.w0;
import sa.o;
import sa.t;
import va.d;

public class b implements d {
    /* access modifiers changed from: private */
    public final List<Object> subscribers;

    static final class a extends l implements cb.l {
        final /* synthetic */ cb.l $callback;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, cb.l lVar, d dVar) {
            super(1, dVar);
            this.this$0 = bVar;
            this.$callback = lVar;
        }

        public final d create(d dVar) {
            return new a(this.this$0, this.$callback, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                for (Object invoke : this.this$0.subscribers) {
                    this.$callback.invoke(invoke);
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    /* renamed from: com.onesignal.common.events.b$b  reason: collision with other inner class name */
    static final class C0116b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0116b(b bVar, d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendingFire((p) null, this);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ p $callback;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, p pVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$callback = pVar;
        }

        public final d create(Object obj, d dVar) {
            return new c(this.this$0, this.$callback, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                it = this.this$0.subscribers.iterator();
            } else if (i10 == 1) {
                it = (Iterator) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Object next = it.next();
                p pVar = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (pVar.invoke(next, this) == c10) {
                    return c10;
                }
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        db.l.d(synchronizedList, "synchronizedList(mutableListOf())");
        this.subscribers = synchronizedList;
    }

    public final void fire(cb.l lVar) {
        db.l.e(lVar, "callback");
        synchronized (this.subscribers) {
            for (Object invoke : this.subscribers) {
                lVar.invoke(invoke);
            }
            t tVar = t.f15300a;
        }
    }

    public final void fireOnMain(cb.l lVar) {
        db.l.e(lVar, "callback");
        com.onesignal.common.threading.a.suspendifyOnMain(new a(this, lVar, (d) null));
    }

    public boolean getHasSubscribers() {
        return w.p(this.subscribers);
    }

    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b bVar) {
        db.l.e(bVar, Constants.MessagePayloadKeys.FROM);
        synchronized (this.subscribers) {
            for (Object subscribe : bVar.subscribers) {
                subscribe(subscribe);
            }
            t tVar = t.f15300a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object suspendingFire(cb.p r6, va.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.common.events.b.C0116b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.common.events.b$b r0 = (com.onesignal.common.events.b.C0116b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.common.events.b$b r0 = new com.onesignal.common.events.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$0
            cb.p r2 = (cb.p) r2
            sa.o.b(r7)
            r7 = r2
            goto L_0x0046
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            sa.o.b(r7)
            java.util.List<java.lang.Object> r7 = r5.subscribers
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0046:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r6.next()
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r2 = r7.invoke(r2, r0)
            if (r2 != r1) goto L_0x0046
            return r1
        L_0x005d:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.common.events.b.suspendingFire(cb.p, va.d):java.lang.Object");
    }

    public final Object suspendingFireOnMain(p pVar, d dVar) {
        Object g10 = h.g(w0.c(), new c(this, pVar, (d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
