package com.onesignal.session.internal;

import kotlin.coroutines.jvm.internal.l;
import sa.o;
import sa.t;
import va.d;

public class a implements s9.a {
    /* access modifiers changed from: private */
    public final u9.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a  reason: collision with other inner class name */
    static final class C0185a extends l implements cb.l {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0185a(a aVar, String str, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
            this.$name = str;
        }

        public final d create(d dVar) {
            return new C0185a(this.this$0, this.$name, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                u9.b access$get_outcomeController$p = this.this$0._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (access$get_outcomeController$p.sendOutcomeEvent(str, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((C0185a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends l implements cb.l {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str, float f10, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
            this.$name = str;
            this.$value = f10;
        }

        public final d create(d dVar) {
            return new b(this.this$0, this.$name, this.$value, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                u9.b access$get_outcomeController$p = this.this$0._outcomeController;
                String str = this.$name;
                float f10 = this.$value;
                this.label = 1;
                if (access$get_outcomeController$p.sendOutcomeEventWithValue(str, f10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class c extends l implements cb.l {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
            this.$name = str;
        }

        public final d create(d dVar) {
            return new c(this.this$0, this.$name, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                u9.b access$get_outcomeController$p = this.this$0._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (access$get_outcomeController$p.sendUniqueOutcomeEvent(str, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((c) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(u9.b bVar) {
        db.l.e(bVar, "_outcomeController");
        this._outcomeController = bVar;
    }

    public void addOutcome(String str) {
        db.l.e(str, "name");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "sendOutcome(name: " + str + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0185a(this, str, (d) null), 1, (Object) null);
    }

    public void addOutcomeWithValue(String str, float f10) {
        db.l.e(str, "name");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "sendOutcomeWithValue(name: " + str + ", value: " + f10 + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(this, str, f10, (d) null), 1, (Object) null);
    }

    public void addUniqueOutcome(String str) {
        db.l.e(str, "name");
        c8.b bVar = c8.b.DEBUG;
        com.onesignal.debug.internal.logging.a.log(bVar, "sendUniqueOutcome(name: " + str + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c(this, str, (d) null), 1, (Object) null);
    }
}
