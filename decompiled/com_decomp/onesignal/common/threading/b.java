package com.onesignal.common.threading;

import cb.l;
import cb.p;
import mb.h0;
import ob.e;
import ob.f;
import ob.g;
import sa.o;
import sa.t;
import va.d;

public final class b {
    /* access modifiers changed from: private */
    public final f channel = g.b(-1, (e) null, (l) null, 6, (Object) null);

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final d create(Object obj, d dVar) {
            return new a(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                f access$getChannel$p = this.this$0.channel;
                this.label = 1;
                if (access$getChannel$p.b((Object) null, this) == c10) {
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
            return ((a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public final Object waitForWake(d dVar) {
        return this.channel.a(dVar);
    }

    public final void wake() {
        Object unused = i.b((va.g) null, new a(this, (d) null), 1, (Object) null);
    }
}
