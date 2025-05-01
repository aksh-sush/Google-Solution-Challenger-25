package com.onesignal.common.threading;

import cb.p;
import db.m;
import kotlin.coroutines.jvm.internal.l;
import mb.h;
import mb.h0;
import mb.w0;
import mb.z1;
import sa.o;
import sa.t;
import va.g;

public abstract class a {

    /* renamed from: com.onesignal.common.threading.a$a  reason: collision with other inner class name */
    static final class C0117a extends l implements p {
        final /* synthetic */ cb.l $block;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0117a(cb.l lVar, va.d dVar) {
            super(2, dVar);
            this.$block = lVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new C0117a(this.$block, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                cb.l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((C0117a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class b extends m implements cb.a {
        final /* synthetic */ cb.l $block;

        /* renamed from: com.onesignal.common.threading.a$b$a  reason: collision with other inner class name */
        static final class C0118a extends l implements p {
            final /* synthetic */ cb.l $block;
            int label;

            /* renamed from: com.onesignal.common.threading.a$b$a$a  reason: collision with other inner class name */
            static final class C0119a extends l implements p {
                final /* synthetic */ cb.l $block;
                int label;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0119a(cb.l lVar, va.d dVar) {
                    super(2, dVar);
                    this.$block = lVar;
                }

                public final va.d create(Object obj, va.d dVar) {
                    return new C0119a(this.$block, dVar);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c10 = d.c();
                    int i10 = this.label;
                    if (i10 == 0) {
                        o.b(obj);
                        cb.l lVar = this.$block;
                        this.label = 1;
                        if (lVar.invoke(this) == c10) {
                            return c10;
                        }
                    } else if (i10 == 1) {
                        o.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return t.f15300a;
                }

                public final Object invoke(h0 h0Var, va.d dVar) {
                    return ((C0119a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0118a(cb.l lVar, va.d dVar) {
                super(2, dVar);
                this.$block = lVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new C0118a(this.$block, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    z1 c11 = w0.c();
                    C0119a aVar = new C0119a(this.$block, (va.d) null);
                    this.label = 1;
                    if (h.g(c11, aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((C0118a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(cb.l lVar) {
            super(0);
            this.$block = lVar;
        }

        public final void invoke() {
            try {
                Object unused = i.b((g) null, new C0118a(this.$block, (va.d) null), 1, (Object) null);
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.a.error("Exception on thread with switch to main", e10);
            }
        }
    }

    static final class c extends m implements cb.a {
        final /* synthetic */ cb.l $block;

        /* renamed from: com.onesignal.common.threading.a$c$a  reason: collision with other inner class name */
        static final class C0120a extends l implements p {
            final /* synthetic */ cb.l $block;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0120a(cb.l lVar, va.d dVar) {
                super(2, dVar);
                this.$block = lVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new C0120a(this.$block, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    cb.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((C0120a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(cb.l lVar) {
            super(0);
            this.$block = lVar;
        }

        public final void invoke() {
            try {
                Object unused = i.b((g) null, new C0120a(this.$block, (va.d) null), 1, (Object) null);
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.a.error("Exception on thread", e10);
            }
        }
    }

    static final class d extends m implements cb.a {
        final /* synthetic */ cb.l $block;
        final /* synthetic */ String $name;

        /* renamed from: com.onesignal.common.threading.a$d$a  reason: collision with other inner class name */
        static final class C0121a extends l implements p {
            final /* synthetic */ cb.l $block;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0121a(cb.l lVar, va.d dVar) {
                super(2, dVar);
                this.$block = lVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new C0121a(this.$block, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    cb.l lVar = this.$block;
                    this.label = 1;
                    if (lVar.invoke(this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((C0121a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, cb.l lVar) {
            super(0);
            this.$name = str;
            this.$block = lVar;
        }

        public final void invoke() {
            try {
                Object unused = i.b((g) null, new C0121a(this.$block, (va.d) null), 1, (Object) null);
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.a.error("Exception on thread '" + this.$name + '\'', e10);
            }
        }
    }

    public static final void suspendifyBlocking(cb.l lVar) {
        db.l.e(lVar, "block");
        Object unused = i.b((g) null, new C0117a(lVar, (va.d) null), 1, (Object) null);
    }

    public static final void suspendifyOnMain(cb.l lVar) {
        db.l.e(lVar, "block");
        ua.a.b(false, false, (ClassLoader) null, (String) null, 0, new b(lVar), 31, (Object) null);
    }

    public static final void suspendifyOnThread(int i10, cb.l lVar) {
        db.l.e(lVar, "block");
        ua.a.b(false, false, (ClassLoader) null, (String) null, i10, new c(lVar), 15, (Object) null);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i10, cb.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(i10, lVar);
    }

    public static final void suspendifyOnThread(String str, int i10, cb.l lVar) {
        db.l.e(str, "name");
        db.l.e(lVar, "block");
        ua.a.b(false, false, (ClassLoader) null, str, i10, new d(str, lVar), 7, (Object) null);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i10, cb.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(str, i10, lVar);
    }
}
