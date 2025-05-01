package com.onesignal.inAppMessages.internal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k implements e8.j, z7.b, com.onesignal.user.internal.subscriptions.a, com.onesignal.common.modeling.e, j8.a, com.onesignal.inAppMessages.internal.triggers.b, com.onesignal.session.internal.session.a {
    private final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final f8.b _backend;
    /* access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b _configModelStore;
    private final h8.a _displayer;
    private final t9.a _influenceManager;
    private final t7.a _languageContext;
    private final j8.b _lifecycle;
    private final u9.b _outcomeEventsController;
    /* access modifiers changed from: private */
    public final k8.a _prefs;
    /* access modifiers changed from: private */
    public final n8.a _repository;
    private final com.onesignal.session.internal.session.b _sessionService;
    private final o8.a _state;
    /* access modifiers changed from: private */
    public final com.onesignal.user.internal.subscriptions.b _subscriptionManager;
    private final a8.a _time;
    private final com.onesignal.inAppMessages.internal.triggers.a _triggerController;
    private final com.onesignal.inAppMessages.internal.triggers.d _triggerModelStore;
    private final v9.a _userManager;
    private final Set<String> clickedClickIds = new LinkedHashSet();
    private final Set<String> dismissedMessages = new LinkedHashSet();
    private final kotlinx.coroutines.sync.b fetchIAMMutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);
    /* access modifiers changed from: private */
    public final Set<String> impressionedMessages = new LinkedHashSet();
    private Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b messageClickCallback = new com.onesignal.common.events.b();
    private final List<a> messageDisplayQueue = new ArrayList();
    private final kotlinx.coroutines.sync.b messageDisplayQueueMutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);
    private List<a> messages = o.e();
    /* access modifiers changed from: private */
    public final List<a> redisplayedInAppMessages = new ArrayList();
    private final Set<String> viewedPageIds = new LinkedHashSet();

    static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.attemptToShowInAppMessage(this);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a0(k kVar, a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        public final va.d create(va.d dVar) {
            return new a0(this.this$0, this.$inAppMessage, this.$prompts, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                a aVar = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar, list, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((a0) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.evaluateInAppMessages(this);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b0(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showMultiplePrompts((a) null, (List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b>) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchMessages(this);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.l implements cb.l {
        Object L$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c0(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new c0(this.this$0, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[LOOP:0: B:17:0x0061->B:19:0x0067, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                sa.o.b(r6)
                goto L_0x0080
            L_0x0015:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001d:
                java.lang.Object r1 = r5.L$0
                java.util.List r1 = (java.util.List) r1
                sa.o.b(r6)
                goto L_0x0052
            L_0x0025:
                sa.o.b(r6)
                goto L_0x003b
            L_0x0029:
                sa.o.b(r6)
                com.onesignal.inAppMessages.internal.k r6 = r5.this$0
                n8.a r6 = r6._repository
                r5.label = r4
                java.lang.Object r6 = r6.cleanCachedInAppMessages(r5)
                if (r6 != r0) goto L_0x003b
                return r0
            L_0x003b:
                com.onesignal.inAppMessages.internal.k r6 = r5.this$0
                java.util.List r1 = r6.redisplayedInAppMessages
                com.onesignal.inAppMessages.internal.k r6 = r5.this$0
                n8.a r6 = r6._repository
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.listInAppMessages(r5)
                if (r6 != r0) goto L_0x0052
                return r0
            L_0x0052:
                java.util.Collection r6 = (java.util.Collection) r6
                r1.addAll(r6)
                com.onesignal.inAppMessages.internal.k r6 = r5.this$0
                java.util.List r6 = r6.redisplayedInAppMessages
                java.util.Iterator r6 = r6.iterator()
            L_0x0061:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0072
                java.lang.Object r1 = r6.next()
                com.onesignal.inAppMessages.internal.a r1 = (com.onesignal.inAppMessages.internal.a) r1
                r3 = 0
                r1.setDisplayedInSession(r3)
                goto L_0x0061
            L_0x0072:
                com.onesignal.inAppMessages.internal.k r6 = r5.this$0
                r1 = 0
                r5.L$0 = r1
                r5.label = r2
                java.lang.Object r6 = r6.fetchMessages(r5)
                if (r6 != r0) goto L_0x0080
                return r0
            L_0x0080:
                sa.t r6 = sa.t.f15300a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(va.d dVar) {
            return ((c0) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fireOutcomesForClick((String) null, (List<f>) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements cb.p {
        final /* synthetic */ b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, va.d dVar) {
            super(2, dVar);
            this.$result = bVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            e eVar = new e(this.$result, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        public final Object invoke(e8.c cVar, va.d dVar) {
            return ((e) create(cVar, dVar)).invokeSuspend(sa.t.f15300a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sa.o.b(obj);
            android.support.v4.media.session.b.a(this.L$0);
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            return invoke((e8.c) null, (va.d) obj2);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fireRESTCallForClick((a) null, (c) null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fireRESTCallForPageChange((a) null, (g) null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.messageWasDismissed((a) null, false, this);
        }
    }

    static final class i extends db.m implements cb.l {
        final /* synthetic */ a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((e8.g) null);
            return sa.t.f15300a;
        }

        public final void invoke(e8.g gVar) {
            db.l.e(gVar, "it");
            gVar.a(new e(this.$message));
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, a aVar, k kVar, va.d dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new j(this.$action, this.$message, this.this$0, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r7.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r5) goto L_0x0029
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                sa.o.b(r8)
                goto L_0x0091
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                sa.o.b(r8)
                goto L_0x0073
            L_0x0025:
                sa.o.b(r8)
                goto L_0x005d
            L_0x0029:
                sa.o.b(r8)
                goto L_0x004a
            L_0x002d:
                sa.o.b(r8)
                com.onesignal.inAppMessages.internal.c r8 = r7.$action
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                boolean r1 = r1.takeActionAsUnique()
                r8.setFirstClick(r1)
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r6 = r7.$action
                r7.label = r5
                java.lang.Object r8 = r8.firePublicClickHandler(r1, r6, r7)
                if (r8 != r0) goto L_0x004a
                return r0
            L_0x004a:
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r5 = r7.$action
                java.util.List r5 = r5.getPrompts()
                r7.label = r4
                java.lang.Object r8 = r8.beginProcessingPrompts(r1, r5, r7)
                if (r8 != r0) goto L_0x005d
                return r0
            L_0x005d:
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.c r1 = r7.$action
                r8.fireClickAction(r1)
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r4 = r7.$action
                r7.label = r3
                java.lang.Object r8 = r8.fireRESTCallForClick(r1, r4, r7)
                if (r8 != r0) goto L_0x0073
                return r0
            L_0x0073:
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.c r1 = r7.$action
                r8.fireTagCallForClick(r1)
                com.onesignal.inAppMessages.internal.k r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                java.lang.String r1 = r1.getMessageId()
                com.onesignal.inAppMessages.internal.c r3 = r7.$action
                java.util.List r3 = r3.getOutcomes()
                r7.label = r2
                java.lang.Object r8 = r8.fireOutcomesForClick(r1, r3, r7)
                if (r8 != r0) goto L_0x0091
                return r0
            L_0x0091:
                sa.t r8 = sa.t.f15300a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(va.d dVar) {
            return ((j) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$k  reason: collision with other inner class name */
    static final class C0145k extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0145k(c cVar, a aVar, k kVar, va.d dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new C0145k(this.$action, this.$message, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar = this.$message;
                c cVar = this.$action;
                this.label = 1;
                if (kVar.firePublicClickHandler(aVar, cVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else if (i10 == 2) {
                sa.o.b(obj);
                this.this$0.fireClickAction(this.$action);
                this.this$0.logInAppMessagePreviewActions(this.$action);
                return sa.t.f15300a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar2 = this.this$0;
            a aVar2 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
            if (kVar2.beginProcessingPrompts(aVar2, prompts, this) == c10) {
                return c10;
            }
            this.this$0.fireClickAction(this.$action);
            this.this$0.logInAppMessagePreviewActions(this.$action);
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((C0145k) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ a $message;
        final /* synthetic */ g $page;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(k kVar, a aVar, g gVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
            this.$message = aVar;
            this.$page = gVar;
        }

        public final va.d create(va.d dVar) {
            return new l(this.this$0, this.$message, this.$page, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                a aVar = this.$message;
                g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar, gVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((l) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(k kVar, a aVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
            this.$message = aVar;
        }

        public final va.d create(va.d dVar) {
            return new m(this.this$0, this.$message, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                a aVar = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar, false, this, 2, (Object) null) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((m) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class n extends db.m implements cb.l {
        final /* synthetic */ a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((e8.g) null);
            return sa.t.f15300a;
        }

        public final void invoke(e8.g gVar) {
            db.l.e(gVar, "it");
            gVar.b(new e(this.$message));
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ a $message;
        final /* synthetic */ String $variantId;
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(k kVar, String str, a aVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
            this.$variantId = str;
            this.$message = aVar;
        }

        public final va.d create(va.d dVar) {
            return new o(this.this$0, this.$variantId, this.$message, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                f8.b access$get_backend$p = this.this$0._backend;
                String appId = ((com.onesignal.core.internal.config.a) this.this$0._configModelStore.getModel()).getAppId();
                String id = this.this$0._subscriptionManager.getSubscriptions().getPush().getId();
                String str = this.$variantId;
                String messageId = this.$message.getMessageId();
                this.label = 1;
                if (access$get_backend$p.sendIAMImpression(appId, id, str, messageId, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    sa.o.b(obj);
                } catch (h7.a unused) {
                    this.this$0.impressionedMessages.remove(this.$message.getMessageId());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0._prefs.setImpressionesMessagesId(this.this$0.impressionedMessages);
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((o) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class p extends db.m implements cb.l {
        final /* synthetic */ a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((e8.g) null);
            return sa.t.f15300a;
        }

        public final void invoke(e8.g gVar) {
            db.l.e(gVar, "it");
            gVar.d(new e(this.$message));
        }
    }

    static final class q extends db.m implements cb.l {
        final /* synthetic */ a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            invoke((e8.g) null);
            return sa.t.f15300a;
        }

        public final void invoke(e8.g gVar) {
            db.l.e(gVar, "it");
            gVar.c(new e(this.$message));
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new r(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.fetchMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((r) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new s(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.fetchMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((s) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new t(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.fetchMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((t) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new u(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.fetchMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((u) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new v(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((v) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new w(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((w) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(k kVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = kVar;
        }

        public final va.d create(va.d dVar) {
            return new x(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sa.o.b(obj);
                k kVar = this.this$0;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sa.o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((x) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.persistInAppMessage((a) null, this);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(k kVar, va.d dVar) {
            super(dVar);
            this.this$0 = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.queueMessageForDisplay((a) null, this);
        }
    }

    public k(l7.f fVar, com.onesignal.session.internal.session.b bVar, t9.a aVar, com.onesignal.core.internal.config.b bVar2, v9.a aVar2, com.onesignal.user.internal.subscriptions.b bVar3, u9.b bVar4, o8.a aVar3, k8.a aVar4, n8.a aVar5, f8.b bVar5, com.onesignal.inAppMessages.internal.triggers.a aVar6, com.onesignal.inAppMessages.internal.triggers.d dVar, h8.a aVar7, j8.b bVar6, t7.a aVar8, a8.a aVar9) {
        l7.f fVar2 = fVar;
        com.onesignal.session.internal.session.b bVar7 = bVar;
        t9.a aVar10 = aVar;
        com.onesignal.core.internal.config.b bVar8 = bVar2;
        v9.a aVar11 = aVar2;
        com.onesignal.user.internal.subscriptions.b bVar9 = bVar3;
        u9.b bVar10 = bVar4;
        o8.a aVar12 = aVar3;
        k8.a aVar13 = aVar4;
        n8.a aVar14 = aVar5;
        f8.b bVar11 = bVar5;
        com.onesignal.inAppMessages.internal.triggers.a aVar15 = aVar6;
        com.onesignal.inAppMessages.internal.triggers.d dVar2 = dVar;
        h8.a aVar16 = aVar7;
        t7.a aVar17 = aVar8;
        db.l.e(fVar2, "_applicationService");
        db.l.e(bVar7, "_sessionService");
        db.l.e(aVar10, "_influenceManager");
        db.l.e(bVar8, "_configModelStore");
        db.l.e(aVar11, "_userManager");
        db.l.e(bVar9, "_subscriptionManager");
        db.l.e(bVar10, "_outcomeEventsController");
        db.l.e(aVar12, "_state");
        db.l.e(aVar13, "_prefs");
        db.l.e(aVar14, "_repository");
        db.l.e(bVar11, "_backend");
        db.l.e(aVar15, "_triggerController");
        db.l.e(dVar2, "_triggerModelStore");
        db.l.e(aVar16, "_displayer");
        db.l.e(bVar6, "_lifecycle");
        db.l.e(aVar8, "_languageContext");
        db.l.e(aVar9, "_time");
        this._applicationService = fVar2;
        this._sessionService = bVar7;
        this._influenceManager = aVar10;
        this._configModelStore = bVar8;
        this._userManager = aVar11;
        this._subscriptionManager = bVar9;
        this._outcomeEventsController = bVar10;
        this._state = aVar12;
        this._prefs = aVar13;
        this._repository = aVar14;
        this._backend = bVar11;
        this._triggerController = aVar15;
        this._triggerModelStore = dVar2;
        this._displayer = aVar16;
        this._lifecycle = bVar6;
        this._languageContext = aVar8;
        this._time = aVar9;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object attemptToShowInAppMessage(va.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.onesignal.inAppMessages.internal.k.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.onesignal.inAppMessages.internal.k$a r0 = (com.onesignal.inAppMessages.internal.k.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$a r0 = new com.onesignal.inAppMessages.internal.k$a
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            r9 = 0
            if (r2 == 0) goto L_0x006d
            if (r2 == r7) goto L_0x0065
            if (r2 == r8) goto L_0x0052
            if (r2 == r6) goto L_0x0045
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            sa.o.b(r15)
            goto L_0x015f
        L_0x0038:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0040:
            sa.o.b(r15)
            goto L_0x0139
        L_0x0045:
            java.lang.Object r2 = r0.L$1
            db.t r2 = (db.t) r2
            java.lang.Object r6 = r0.L$0
            com.onesignal.inAppMessages.internal.k r6 = (com.onesignal.inAppMessages.internal.k) r6
            sa.o.b(r15)
            goto L_0x011c
        L_0x0052:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.b) r2
            java.lang.Object r10 = r0.L$1
            db.t r10 = (db.t) r10
            java.lang.Object r11 = r0.L$0
            com.onesignal.inAppMessages.internal.k r11 = (com.onesignal.inAppMessages.internal.k) r11
            sa.o.b(r15)
            r13 = r10
            r10 = r2
            r2 = r13
            goto L_0x00a6
        L_0x0065:
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.k r2 = (com.onesignal.inAppMessages.internal.k) r2
            sa.o.b(r15)
            goto L_0x007e
        L_0x006d:
            sa.o.b(r15)
            l7.f r15 = r14._applicationService
            r0.L$0 = r14
            r0.label = r7
            java.lang.Object r15 = r15.waitUntilSystemConditionsAvailable(r0)
            if (r15 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r2 = r14
        L_0x007e:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x008e
            java.lang.String r15 = "InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct"
            com.onesignal.debug.internal.logging.a.warn$default(r15, r9, r8, r9)
            sa.t r15 = sa.t.f15300a
            return r15
        L_0x008e:
            db.t r15 = new db.t
            r15.<init>()
            kotlinx.coroutines.sync.b r10 = r2.messageDisplayQueueMutex
            r0.L$0 = r2
            r0.L$1 = r15
            r0.L$2 = r10
            r0.label = r8
            java.lang.Object r11 = r10.b(r9, r0)
            if (r11 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r2
            r2 = r15
        L_0x00a6:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r15.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r12 = "InAppMessagesManager.attemptToShowInAppMessage: "
            r15.append(r12)     // Catch:{ all -> 0x0165 }
            java.util.List<com.onesignal.inAppMessages.internal.a> r12 = r11.messageDisplayQueue     // Catch:{ all -> 0x0165 }
            r15.append(r12)     // Catch:{ all -> 0x0165 }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x0165 }
            com.onesignal.debug.internal.logging.a.debug$default(r15, r9, r8, r9)     // Catch:{ all -> 0x0165 }
            boolean r15 = r11.getPaused()     // Catch:{ all -> 0x0165 }
            if (r15 == 0) goto L_0x00c8
            java.lang.String r15 = "InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!"
            com.onesignal.debug.internal.logging.a.warn$default(r15, r9, r8, r9)     // Catch:{ all -> 0x0165 }
            goto L_0x00fc
        L_0x00c8:
            java.util.List<com.onesignal.inAppMessages.internal.a> r15 = r11.messageDisplayQueue     // Catch:{ all -> 0x0165 }
            boolean r15 = r15.isEmpty()     // Catch:{ all -> 0x0165 }
            if (r15 == 0) goto L_0x00d6
            java.lang.String r15 = "InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!"
        L_0x00d2:
            com.onesignal.debug.internal.logging.a.debug$default(r15, r9, r8, r9)     // Catch:{ all -> 0x0165 }
            goto L_0x00fc
        L_0x00d6:
            o8.a r15 = r11._state     // Catch:{ all -> 0x0165 }
            java.lang.String r15 = r15.getInAppMessageIdShowing()     // Catch:{ all -> 0x0165 }
            if (r15 == 0) goto L_0x00e1
            java.lang.String r15 = "InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!"
            goto L_0x00d2
        L_0x00e1:
            java.lang.String r15 = "InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!"
            com.onesignal.debug.internal.logging.a.debug$default(r15, r9, r8, r9)     // Catch:{ all -> 0x0165 }
            java.util.List<com.onesignal.inAppMessages.internal.a> r15 = r11.messageDisplayQueue     // Catch:{ all -> 0x0165 }
            java.lang.Object r15 = r15.remove(r3)     // Catch:{ all -> 0x0165 }
            r2.f9426e = r15     // Catch:{ all -> 0x0165 }
            o8.a r8 = r11._state     // Catch:{ all -> 0x0165 }
            db.l.b(r15)     // Catch:{ all -> 0x0165 }
            com.onesignal.inAppMessages.internal.a r15 = (com.onesignal.inAppMessages.internal.a) r15     // Catch:{ all -> 0x0165 }
            java.lang.String r15 = r15.getMessageId()     // Catch:{ all -> 0x0165 }
            r8.setInAppMessageIdShowing(r15)     // Catch:{ all -> 0x0165 }
        L_0x00fc:
            sa.t r15 = sa.t.f15300a     // Catch:{ all -> 0x0165 }
            r10.a(r9)
            java.lang.Object r15 = r2.f9426e
            if (r15 == 0) goto L_0x0162
            h8.a r8 = r11._displayer
            db.l.b(r15)
            com.onesignal.inAppMessages.internal.a r15 = (com.onesignal.inAppMessages.internal.a) r15
            r0.L$0 = r11
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r6
            java.lang.Object r15 = r8.displayMessage(r15, r0)
            if (r15 != r1) goto L_0x011b
            return r1
        L_0x011b:
            r6 = r11
        L_0x011c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 != 0) goto L_0x013c
            o8.a r15 = r6._state
            r15.setInAppMessageIdShowing(r9)
            java.lang.Object r15 = r2.f9426e
            db.l.b(r15)
            com.onesignal.inAppMessages.internal.a r15 = (com.onesignal.inAppMessages.internal.a) r15
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r15 = r6.queueMessageForDisplay(r15, r0)
            if (r15 != r1) goto L_0x0139
            return r1
        L_0x0139:
            sa.t r15 = sa.t.f15300a
            return r15
        L_0x013c:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r3)
            boolean r15 = db.l.a(r15, r3)
            if (r15 == 0) goto L_0x0162
            o8.a r15 = r6._state
            r15.setInAppMessageIdShowing(r9)
            java.lang.Object r15 = r2.f9426e
            db.l.b(r15)
            com.onesignal.inAppMessages.internal.a r15 = (com.onesignal.inAppMessages.internal.a) r15
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r15 = r6.messageWasDismissed(r15, r7, r0)
            if (r15 != r1) goto L_0x015f
            return r1
        L_0x015f:
            sa.t r15 = sa.t.f15300a
            return r15
        L_0x0162:
            sa.t r15 = sa.t.f15300a
            return r15
        L_0x0165:
            r15 = move-exception
            r10.a(r9)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.attemptToShowInAppMessage(va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object beginProcessingPrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, va.d dVar) {
        if (!(!list.isEmpty())) {
            return sa.t.f15300a;
        }
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, (Throwable) null, 2, (Object) null);
        this._displayer.dismissCurrentInAppMessage();
        Object showMultiplePrompts = showMultiplePrompts(aVar, list, dVar);
        return showMultiplePrompts == d.c() ? showMultiplePrompts : sa.t.f15300a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object evaluateInAppMessages(va.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.onesignal.inAppMessages.internal.k.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.inAppMessages.internal.k$b r0 = (com.onesignal.inAppMessages.internal.k.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$b r0 = new com.onesignal.inAppMessages.internal.k$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            com.onesignal.inAppMessages.internal.k r4 = (com.onesignal.inAppMessages.internal.k) r4
            sa.o.b(r8)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            sa.o.b(r8)
            java.lang.String r8 = "InAppMessagesManager.evaluateInAppMessages()"
            r2 = 2
            r4 = 0
            com.onesignal.debug.internal.logging.a.debug$default(r8, r4, r2, r4)
            java.util.List<com.onesignal.inAppMessages.internal.a> r8 = r7.messages
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r2 = r8
        L_0x004b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0081
            java.lang.Object r8 = r2.next()
            com.onesignal.inAppMessages.internal.a r8 = (com.onesignal.inAppMessages.internal.a) r8
            com.onesignal.inAppMessages.internal.triggers.a r5 = r4._triggerController
            boolean r5 = r5.evaluateMessageTriggers(r8)
            if (r5 == 0) goto L_0x004b
            r4.setDataForRedisplay(r8)
            java.util.Set<java.lang.String> r5 = r4.dismissedMessages
            java.lang.String r6 = r8.getMessageId()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r8.isFinished()
            if (r5 != 0) goto L_0x004b
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r4.queueMessageForDisplay(r8, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x0081:
            sa.t r8 = sa.t.f15300a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.evaluateInAppMessages(va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ all -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchMessages(va.d r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof com.onesignal.inAppMessages.internal.k.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.inAppMessages.internal.k$c r2 = (com.onesignal.inAppMessages.internal.k.c) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.inAppMessages.internal.k$c r2 = new com.onesignal.inAppMessages.internal.k$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x005d
            if (r4 == r7) goto L_0x0046
            if (r4 == r6) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            sa.o.b(r0)
            goto L_0x0106
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            java.lang.Object r4 = r2.L$0
            com.onesignal.inAppMessages.internal.k r4 = (com.onesignal.inAppMessages.internal.k) r4
            sa.o.b(r0)
            goto L_0x00f5
        L_0x0046:
            java.lang.Object r4 = r2.L$3
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.b) r4
            java.lang.Object r7 = r2.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r2.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$0
            com.onesignal.inAppMessages.internal.k r10 = (com.onesignal.inAppMessages.internal.k) r10
            sa.o.b(r0)
            r0 = r7
            r7 = r4
            r4 = r10
            goto L_0x00ae
        L_0x005d:
            sa.o.b(r0)
            com.onesignal.core.internal.config.b r0 = r1._configModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.core.internal.config.a r0 = (com.onesignal.core.internal.config.a) r0
            java.lang.String r9 = r0.getAppId()
            com.onesignal.user.internal.subscriptions.b r0 = r1._subscriptionManager
            com.onesignal.user.internal.subscriptions.c r0 = r0.getSubscriptions()
            ba.b r0 = r0.getPush()
            java.lang.String r0 = r0.getId()
            int r4 = r0.length()
            r10 = 0
            if (r4 != 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            if (r4 != 0) goto L_0x0111
            com.onesignal.common.h r4 = com.onesignal.common.h.INSTANCE
            boolean r4 = r4.isLocalId(r0)
            if (r4 != 0) goto L_0x0111
            int r4 = r9.length()
            if (r4 != 0) goto L_0x0095
            r10 = 1
        L_0x0095:
            if (r10 == 0) goto L_0x0099
            goto L_0x0111
        L_0x0099:
            kotlinx.coroutines.sync.b r4 = r1.fetchIAMMutex
            r2.L$0 = r1
            r2.L$1 = r9
            r2.L$2 = r0
            r2.L$3 = r4
            r2.label = r7
            java.lang.Object r7 = r4.b(r8, r2)
            if (r7 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r7 = r4
            r4 = r1
        L_0x00ae:
            a8.a r10 = r4._time     // Catch:{ all -> 0x010c }
            long r10 = r10.getCurrentTimeMillis()     // Catch:{ all -> 0x010c }
            java.lang.Long r12 = r4.lastTimeFetchedIAMs     // Catch:{ all -> 0x010c }
            if (r12 == 0) goto L_0x00d7
            db.l.b(r12)     // Catch:{ all -> 0x010c }
            long r12 = r12.longValue()     // Catch:{ all -> 0x010c }
            long r12 = r10 - r12
            com.onesignal.core.internal.config.b r14 = r4._configModelStore     // Catch:{ all -> 0x010c }
            com.onesignal.common.modeling.g r14 = r14.getModel()     // Catch:{ all -> 0x010c }
            com.onesignal.core.internal.config.a r14 = (com.onesignal.core.internal.config.a) r14     // Catch:{ all -> 0x010c }
            long r14 = r14.getFetchIAMMinInterval()     // Catch:{ all -> 0x010c }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00d7
            sa.t r0 = sa.t.f15300a     // Catch:{ all -> 0x010c }
            r7.a(r8)
            return r0
        L_0x00d7:
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.b.d(r10)     // Catch:{ all -> 0x010c }
            r4.lastTimeFetchedIAMs = r10     // Catch:{ all -> 0x010c }
            sa.t r10 = sa.t.f15300a     // Catch:{ all -> 0x010c }
            r7.a(r8)
            f8.b r7 = r4._backend
            r2.L$0 = r4
            r2.L$1 = r8
            r2.L$2 = r8
            r2.L$3 = r8
            r2.label = r6
            java.lang.Object r0 = r7.listInAppMessages(r9, r0, r2)
            if (r0 != r3) goto L_0x00f5
            return r3
        L_0x00f5:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0109
            r4.messages = r0
            r2.L$0 = r8
            r2.label = r5
            java.lang.Object r0 = r4.evaluateInAppMessages(r2)
            if (r0 != r3) goto L_0x0106
            return r3
        L_0x0106:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0109:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x010c:
            r0 = move-exception
            r7.a(r8)
            throw r0
        L_0x0111:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.fetchMessages(va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void fireClickAction(c cVar) {
        if (cVar.getUrl() != null) {
            if (!(cVar.getUrl().length() > 0)) {
                return;
            }
            if (cVar.getUrlTarget() == e8.k.BROWSER) {
                AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
            } else if (cVar.getUrlTarget() == e8.k.IN_APP_WEBVIEW) {
                g8.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fireOutcomesForClick(java.lang.String r9, java.util.List<com.onesignal.inAppMessages.internal.f> r10, va.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.onesignal.inAppMessages.internal.k.d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.inAppMessages.internal.k$d r0 = (com.onesignal.inAppMessages.internal.k.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$d r0 = new com.onesignal.inAppMessages.internal.k$d
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r5) goto L_0x0034
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$0
            com.onesignal.inAppMessages.internal.k r10 = (com.onesignal.inAppMessages.internal.k) r10
            sa.o.b(r11)
            goto L_0x004d
        L_0x0040:
            sa.o.b(r11)
            t9.a r11 = r8._influenceManager
            r11.onDirectInfluenceFromIAM(r9)
            java.util.Iterator r9 = r10.iterator()
            r10 = r8
        L_0x004d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x009d
            java.lang.Object r11 = r9.next()
            com.onesignal.inAppMessages.internal.f r11 = (com.onesignal.inAppMessages.internal.f) r11
            java.lang.String r2 = r11.getName()
            boolean r6 = r11.isUnique()
            if (r6 == 0) goto L_0x0072
            u9.b r11 = r10._outcomeEventsController
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r11 = r11.sendUniqueOutcomeEvent(r2, r0)
            if (r11 != r1) goto L_0x004d
            return r1
        L_0x0072:
            float r6 = r11.getWeight()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x008e
            u9.b r6 = r10._outcomeEventsController
            float r11 = r11.getWeight()
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r11 = r6.sendOutcomeEventWithValue(r2, r11, r0)
            if (r11 != r1) goto L_0x004d
            return r1
        L_0x008e:
            u9.b r11 = r10._outcomeEventsController
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r11 = r11.sendOutcomeEvent(r2, r0)
            if (r11 != r1) goto L_0x004d
            return r1
        L_0x009d:
            sa.t r9 = sa.t.f15300a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.fireOutcomesForClick(java.lang.String, java.util.List, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object firePublicClickHandler(a aVar, c cVar, va.d dVar) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return sa.t.f15300a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new e(new b(aVar, cVar), (va.d) null), dVar);
        return suspendingFireOnMain == d.c() ? suspendingFireOnMain : sa.t.f15300a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fireRESTCallForClick(com.onesignal.inAppMessages.internal.a r10, com.onesignal.inAppMessages.internal.c r11, va.d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.onesignal.inAppMessages.internal.k.f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.onesignal.inAppMessages.internal.k$f r0 = (com.onesignal.inAppMessages.internal.k.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$f r0 = new com.onesignal.inAppMessages.internal.k$f
            r0.<init>(r9, r12)
        L_0x0018:
            r8 = r0
            java.lang.Object r12 = r8.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 != r2) goto L_0x003c
            java.lang.Object r10 = r8.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$1
            com.onesignal.inAppMessages.internal.a r11 = (com.onesignal.inAppMessages.internal.a) r11
            java.lang.Object r0 = r8.L$0
            com.onesignal.inAppMessages.internal.k r0 = (com.onesignal.inAppMessages.internal.k) r0
            sa.o.b(r12)     // Catch:{ a -> 0x0039 }
            r12 = r10
            r10 = r11
            goto L_0x00bc
        L_0x0039:
            goto L_0x00cb
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            sa.o.b(r12)
            g8.a r12 = g8.a.INSTANCE
            t7.a r1 = r9._languageContext
            java.lang.String r4 = r12.variantIdForMessage(r10, r1)
            if (r4 != 0) goto L_0x0054
            sa.t r10 = sa.t.f15300a
            return r10
        L_0x0054:
            java.lang.String r12 = r11.getClickId()
            com.onesignal.inAppMessages.internal.h r1 = r10.getRedisplayStats()
            boolean r1 = r1.isRedisplayEnabled()
            if (r1 == 0) goto L_0x006c
            if (r12 == 0) goto L_0x006c
            boolean r1 = r10.isClickAvailable(r12)
            if (r1 == 0) goto L_0x006c
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 != 0) goto L_0x007a
            java.util.Set<java.lang.String> r1 = r9.clickedClickIds
            boolean r1 = ta.w.q(r1, r12)
            if (r1 == 0) goto L_0x007a
            sa.t r10 = sa.t.f15300a
            return r10
        L_0x007a:
            if (r12 == 0) goto L_0x0084
            java.util.Set<java.lang.String> r1 = r9.clickedClickIds
            r1.add(r12)
            r10.addClickId(r12)
        L_0x0084:
            f8.b r1 = r9._backend     // Catch:{ a -> 0x00c8 }
            com.onesignal.core.internal.config.b r3 = r9._configModelStore     // Catch:{ a -> 0x00c8 }
            com.onesignal.common.modeling.g r3 = r3.getModel()     // Catch:{ a -> 0x00c8 }
            com.onesignal.core.internal.config.a r3 = (com.onesignal.core.internal.config.a) r3     // Catch:{ a -> 0x00c8 }
            java.lang.String r3 = r3.getAppId()     // Catch:{ a -> 0x00c8 }
            com.onesignal.user.internal.subscriptions.b r5 = r9._subscriptionManager     // Catch:{ a -> 0x00c8 }
            com.onesignal.user.internal.subscriptions.c r5 = r5.getSubscriptions()     // Catch:{ a -> 0x00c8 }
            ba.b r5 = r5.getPush()     // Catch:{ a -> 0x00c8 }
            java.lang.String r5 = r5.getId()     // Catch:{ a -> 0x00c8 }
            java.lang.String r6 = r10.getMessageId()     // Catch:{ a -> 0x00c8 }
            boolean r7 = r11.isFirstClick()     // Catch:{ a -> 0x00c8 }
            r8.L$0 = r9     // Catch:{ a -> 0x00c8 }
            r8.L$1 = r10     // Catch:{ a -> 0x00c8 }
            r8.L$2 = r12     // Catch:{ a -> 0x00c8 }
            r8.label = r2     // Catch:{ a -> 0x00c8 }
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r12
            java.lang.Object r11 = r1.sendIAMClick(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ a -> 0x00c8 }
            if (r11 != r0) goto L_0x00bb
            return r0
        L_0x00bb:
            r0 = r9
        L_0x00bc:
            k8.a r11 = r0._prefs     // Catch:{ a -> 0x00c4 }
            java.util.Set<java.lang.String> r1 = r0.clickedClickIds     // Catch:{ a -> 0x00c4 }
            r11.setClickedMessagesId(r1)     // Catch:{ a -> 0x00c4 }
            goto L_0x00d9
        L_0x00c4:
        L_0x00c5:
            r11 = r10
            r10 = r12
            goto L_0x00cb
        L_0x00c8:
            r0 = r9
            goto L_0x00c5
        L_0x00cb:
            java.util.Set<java.lang.String> r12 = r0.clickedClickIds
            java.util.Collection r12 = db.x.a(r12)
            r12.remove(r10)
            if (r10 == 0) goto L_0x00d9
            r11.removeClickId(r10)
        L_0x00d9:
            sa.t r10 = sa.t.f15300a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.fireRESTCallForClick(com.onesignal.inAppMessages.internal.a, com.onesignal.inAppMessages.internal.c, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fireRESTCallForPageChange(com.onesignal.inAppMessages.internal.a r9, com.onesignal.inAppMessages.internal.g r10, va.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.onesignal.inAppMessages.internal.k.g
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.inAppMessages.internal.k$g r0 = (com.onesignal.inAppMessages.internal.k.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$g r0 = new com.onesignal.inAppMessages.internal.k$g
            r0.<init>(r8, r11)
        L_0x0018:
            r7 = r0
            java.lang.Object r11 = r7.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r9 = r7.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r7.L$0
            com.onesignal.inAppMessages.internal.k r10 = (com.onesignal.inAppMessages.internal.k) r10
            sa.o.b(r11)     // Catch:{ a -> 0x00c2 }
            goto L_0x00b8
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            sa.o.b(r11)
            g8.a r11 = g8.a.INSTANCE
            t7.a r1 = r8._languageContext
            java.lang.String r4 = r11.variantIdForMessage(r9, r1)
            if (r4 != 0) goto L_0x004b
            sa.t r9 = sa.t.f15300a
            return r9
        L_0x004b:
            java.lang.String r6 = r10.getPageId()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r9.getMessageId()
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.util.Set<java.lang.String> r11 = r8.viewedPageIds
            boolean r11 = r11.contains(r10)
            if (r11 == 0) goto L_0x0083
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "InAppMessagesManager: Already sent page impression for id: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r10 = 2
            r11 = 0
            com.onesignal.debug.internal.logging.a.verbose$default(r9, r11, r10, r11)
            sa.t r9 = sa.t.f15300a
            return r9
        L_0x0083:
            java.util.Set<java.lang.String> r11 = r8.viewedPageIds
            r11.add(r10)
            f8.b r1 = r8._backend     // Catch:{ a -> 0x00c0 }
            com.onesignal.core.internal.config.b r11 = r8._configModelStore     // Catch:{ a -> 0x00c0 }
            com.onesignal.common.modeling.g r11 = r11.getModel()     // Catch:{ a -> 0x00c0 }
            com.onesignal.core.internal.config.a r11 = (com.onesignal.core.internal.config.a) r11     // Catch:{ a -> 0x00c0 }
            java.lang.String r11 = r11.getAppId()     // Catch:{ a -> 0x00c0 }
            com.onesignal.user.internal.subscriptions.b r3 = r8._subscriptionManager     // Catch:{ a -> 0x00c0 }
            com.onesignal.user.internal.subscriptions.c r3 = r3.getSubscriptions()     // Catch:{ a -> 0x00c0 }
            ba.b r3 = r3.getPush()     // Catch:{ a -> 0x00c0 }
            java.lang.String r3 = r3.getId()     // Catch:{ a -> 0x00c0 }
            java.lang.String r5 = r9.getMessageId()     // Catch:{ a -> 0x00c0 }
            r7.L$0 = r8     // Catch:{ a -> 0x00c0 }
            r7.L$1 = r10     // Catch:{ a -> 0x00c0 }
            r7.label = r2     // Catch:{ a -> 0x00c0 }
            r2 = r11
            java.lang.Object r9 = r1.sendIAMPageImpression(r2, r3, r4, r5, r6, r7)     // Catch:{ a -> 0x00c0 }
            if (r9 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            r9 = r10
            r10 = r8
        L_0x00b8:
            k8.a r11 = r10._prefs     // Catch:{ a -> 0x00c2 }
            java.util.Set<java.lang.String> r0 = r10.viewedPageIds     // Catch:{ a -> 0x00c2 }
            r11.setViewPageImpressionedIds(r0)     // Catch:{ a -> 0x00c2 }
            goto L_0x00c7
        L_0x00c0:
            r9 = r10
            r10 = r8
        L_0x00c2:
            java.util.Set<java.lang.String> r10 = r10.viewedPageIds
            r10.remove(r9)
        L_0x00c7:
            sa.t r9 = sa.t.f15300a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.fireRESTCallForPageChange(com.onesignal.inAppMessages.internal.a, com.onesignal.inAppMessages.internal.g, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void fireTagCallForClick(c cVar) {
        if (cVar.getTags() != null) {
            i tags = cVar.getTags();
            JSONArray jSONArray = null;
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.j jVar = com.onesignal.common.j.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                db.l.b(tagsToAdd);
                this._userManager.addTags(jVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.j jVar2 = com.onesignal.common.j.INSTANCE;
                if (tags != null) {
                    jSONArray = tags.getTagsToRemove();
                }
                db.l.b(jSONArray);
                this._userManager.removeTags(jVar2.newStringSetFromJSONArray(jSONArray));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), (Throwable) null, 2, (Object) null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), (Throwable) null, 2, (Object) null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection) {
        for (a next : this.messages) {
            if (!next.isTriggerChanged() && this.redisplayedInAppMessages.contains(next) && this._triggerController.isTriggerOnMessage(next, collection)) {
                com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + next, (Throwable) null, 2, (Object) null);
                next.setTriggerChanged(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object messageWasDismissed(com.onesignal.inAppMessages.internal.a r10, boolean r11, va.d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.onesignal.inAppMessages.internal.k.h
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.onesignal.inAppMessages.internal.k$h r0 = (com.onesignal.inAppMessages.internal.k.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$h r0 = new com.onesignal.inAppMessages.internal.k$h
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003e
            if (r2 == r5) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            sa.o.b(r12)
            goto L_0x00f6
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            sa.o.b(r12)
            goto L_0x00e1
        L_0x003e:
            java.lang.Object r10 = r0.L$1
            com.onesignal.inAppMessages.internal.a r10 = (com.onesignal.inAppMessages.internal.a) r10
            java.lang.Object r11 = r0.L$0
            com.onesignal.inAppMessages.internal.k r11 = (com.onesignal.inAppMessages.internal.k) r11
            sa.o.b(r12)
            goto L_0x0082
        L_0x004a:
            sa.o.b(r12)
            boolean r12 = r10.isPreview()
            if (r12 != 0) goto L_0x0099
            java.util.Set<java.lang.String> r12 = r9.dismissedMessages
            java.lang.String r2 = r10.getMessageId()
            r12.add(r2)
            if (r11 != 0) goto L_0x0081
            k8.a r11 = r9._prefs
            java.util.Set<java.lang.String> r12 = r9.dismissedMessages
            r11.setDismissedMessagesId(r12)
            o8.a r11 = r9._state
            a8.a r12 = r9._time
            long r7 = r12.getCurrentTimeMillis()
            java.lang.Long r12 = kotlin.coroutines.jvm.internal.b.d(r7)
            r11.setLastTimeInAppDismissed(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r9.persistInAppMessage(r10, r0)
            if (r11 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r11 = r9
        L_0x0082:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "InAppMessagesManager.messageWasDismissed: dismissedMessages: "
            r12.append(r2)
            java.util.Set<java.lang.String> r2 = r11.dismissedMessages
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r12, r6, r5, r6)
            goto L_0x009a
        L_0x0099:
            r11 = r9
        L_0x009a:
            t9.a r12 = r11._influenceManager
            r12.onInAppMessageDismissed()
            o8.a r12 = r11._state
            com.onesignal.inAppMessages.internal.prompt.impl.b r12 = r12.getCurrentPrompt()
            if (r12 == 0) goto L_0x00af
            java.lang.String r10 = "InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            com.onesignal.debug.internal.logging.a.debug$default(r10, r6, r5, r6)
            sa.t r10 = sa.t.f15300a
            return r10
        L_0x00af:
            com.onesignal.common.events.b r12 = r11.lifecycleCallback
            boolean r12 = r12.getHasSubscribers()
            if (r12 == 0) goto L_0x00c1
            com.onesignal.common.events.b r12 = r11.lifecycleCallback
            com.onesignal.inAppMessages.internal.k$i r2 = new com.onesignal.inAppMessages.internal.k$i
            r2.<init>(r10)
            r12.fireOnMain(r2)
        L_0x00c1:
            o8.a r10 = r11._state
            r10.setInAppMessageIdShowing(r6)
            java.util.List<com.onesignal.inAppMessages.internal.a> r10 = r11.messageDisplayQueue
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x00e4
            java.lang.String r10 = "InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show"
            com.onesignal.debug.internal.logging.a.debug$default(r10, r6, r5, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r5
            java.lang.Object r10 = r11.attemptToShowInAppMessage(r0)
            if (r10 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            sa.t r10 = sa.t.f15300a
            return r10
        L_0x00e4:
            java.lang.String r10 = "InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages"
            com.onesignal.debug.internal.logging.a.debug$default(r10, r6, r5, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r11.evaluateInAppMessages(r0)
            if (r10 != r1) goto L_0x00f6
            return r1
        L_0x00f6:
            sa.t r10 = sa.t.f15300a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.messageWasDismissed(com.onesignal.inAppMessages.internal.a, boolean, va.d):java.lang.Object");
    }

    static /* synthetic */ Object messageWasDismissed$default(k kVar, a aVar, boolean z10, va.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return kVar.messageWasDismissed(aVar, z10, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object persistInAppMessage(com.onesignal.inAppMessages.internal.a r9, va.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.k.y
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.k$y r0 = (com.onesignal.inAppMessages.internal.k.y) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$y r0 = new com.onesignal.inAppMessages.internal.k$y
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r9 = r0.L$1
            com.onesignal.inAppMessages.internal.a r9 = (com.onesignal.inAppMessages.internal.a) r9
            java.lang.Object r0 = r0.L$0
            com.onesignal.inAppMessages.internal.k r0 = (com.onesignal.inAppMessages.internal.k) r0
            sa.o.b(r10)
            goto L_0x006b
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            sa.o.b(r10)
            a8.a r10 = r8._time
            long r4 = r10.getCurrentTimeMillis()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r10
            long r4 = r4 / r6
            com.onesignal.inAppMessages.internal.h r10 = r9.getRedisplayStats()
            r10.setLastDisplayTime(r4)
            com.onesignal.inAppMessages.internal.h r10 = r9.getRedisplayStats()
            r10.incrementDisplayQuantity()
            r10 = 0
            r9.setTriggerChanged(r10)
            r9.setDisplayedInSession(r3)
            n8.a r10 = r8._repository
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.saveInAppMessage(r9, r0)
            if (r10 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r0 = r8
        L_0x006b:
            k8.a r10 = r0._prefs
            o8.a r1 = r0._state
            java.lang.Long r1 = r1.getLastTimeInAppDismissed()
            r10.setLastTimeInAppDismissed(r1)
            java.util.List<com.onesignal.inAppMessages.internal.a> r10 = r0.redisplayedInAppMessages
            int r10 = r10.indexOf(r9)
            r1 = -1
            if (r10 == r1) goto L_0x0085
            java.util.List<com.onesignal.inAppMessages.internal.a> r1 = r0.redisplayedInAppMessages
            r1.set(r10, r9)
            goto L_0x008a
        L_0x0085:
            java.util.List<com.onesignal.inAppMessages.internal.a> r10 = r0.redisplayedInAppMessages
            r10.add(r9)
        L_0x008a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "InAppMessagesManager.persistInAppMessage: "
            r10.append(r1)
            r10.append(r9)
            java.lang.String r9 = " with msg array data: "
            r10.append(r9)
            java.util.List<com.onesignal.inAppMessages.internal.a> r9 = r0.redisplayedInAppMessages
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 2
            r0 = 0
            com.onesignal.debug.internal.logging.a.debug$default(r9, r0, r10, r0)
            sa.t r9 = sa.t.f15300a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.persistInAppMessage(com.onesignal.inAppMessages.internal.a, va.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object queueMessageForDisplay(com.onesignal.inAppMessages.internal.a r8, va.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.onesignal.inAppMessages.internal.k.z
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.inAppMessages.internal.k$z r0 = (com.onesignal.inAppMessages.internal.k.z) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.k$z r0 = new com.onesignal.inAppMessages.internal.k$z
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r3) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            sa.o.b(r9)
            goto L_0x00ab
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.b r8 = (kotlinx.coroutines.sync.b) r8
            java.lang.Object r2 = r0.L$1
            com.onesignal.inAppMessages.internal.a r2 = (com.onesignal.inAppMessages.internal.a) r2
            java.lang.Object r3 = r0.L$0
            com.onesignal.inAppMessages.internal.k r3 = (com.onesignal.inAppMessages.internal.k) r3
            sa.o.b(r9)
            r9 = r8
            r8 = r2
            goto L_0x005d
        L_0x0048:
            sa.o.b(r9)
            kotlinx.coroutines.sync.b r9 = r7.messageDisplayQueueMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r3 = r7
        L_0x005d:
            java.util.List<com.onesignal.inAppMessages.internal.a> r2 = r3.messageDisplayQueue     // Catch:{ all -> 0x00ae }
            boolean r2 = r2.contains(r8)     // Catch:{ all -> 0x00ae }
            if (r2 != 0) goto L_0x0097
            o8.a r2 = r3._state     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = r2.getInAppMessageIdShowing()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = r8.getMessageId()     // Catch:{ all -> 0x00ae }
            boolean r2 = db.l.a(r2, r6)     // Catch:{ all -> 0x00ae }
            if (r2 != 0) goto L_0x0097
            java.util.List<com.onesignal.inAppMessages.internal.a> r2 = r3.messageDisplayQueue     // Catch:{ all -> 0x00ae }
            r2.add(r8)     // Catch:{ all -> 0x00ae }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r2.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = "InAppMessagesManager.queueMessageForDisplay: In app message with id: "
            r2.append(r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = r8.getMessageId()     // Catch:{ all -> 0x00ae }
            r2.append(r8)     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = ", added to the queue"
            r2.append(r8)     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00ae }
            com.onesignal.debug.internal.logging.a.debug$default(r8, r5, r4, r5)     // Catch:{ all -> 0x00ae }
        L_0x0097:
            sa.t r8 = sa.t.f15300a     // Catch:{ all -> 0x00ae }
            r9.a(r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r8 = r3.attemptToShowInAppMessage(r0)
            if (r8 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            sa.t r8 = sa.t.f15300a
            return r8
        L_0x00ae:
            r8 = move-exception
            r9.a(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.queueMessageForDisplay(com.onesignal.inAppMessages.internal.a, va.d):java.lang.Object");
    }

    private final void setDataForRedisplay(a aVar) {
        boolean contains = this.dismissedMessages.contains(aVar.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (contains && indexOf != -1) {
            a aVar2 = this.redisplayedInAppMessages.get(indexOf);
            aVar.getRedisplayStats().setDisplayStats(aVar2.getRedisplayStats());
            aVar.setDisplayedInSession(aVar2.isDisplayedInSession());
            boolean hasMessageTriggerChanged = hasMessageTriggerChanged(aVar);
            com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.setDataForRedisplay: " + aVar + " triggerHasChanged: " + hasMessageTriggerChanged, (Throwable) null, 2, (Object) null);
            if (hasMessageTriggerChanged && aVar.getRedisplayStats().isDelayTimeSatisfied() && aVar.getRedisplayStats().shouldDisplayAgain()) {
                com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + aVar.getMessageId(), (Throwable) null, 2, (Object) null);
                this.dismissedMessages.remove(aVar.getMessageId());
                this.impressionedMessages.remove(aVar.getMessageId());
                this.viewedPageIds.clear();
                this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
                aVar.clearClickIds();
            }
        }
    }

    private final void showAlertDialogMessage(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(e8.l.location_permission_missing_title);
        db.l.d(string, "_applicationService.appC…permission_missing_title)");
        String string2 = this._applicationService.getAppContext().getString(e8.l.location_permission_missing_message);
        db.l.d(string2, "_applicationService.appC…rmission_missing_message)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(17039370, new j(this, aVar, list)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showAlertDialogMessage$lambda-5  reason: not valid java name */
    public static final void m6showAlertDialogMessage$lambda5(k kVar, a aVar, List list, DialogInterface dialogInterface, int i10) {
        db.l.e(kVar, "this$0");
        db.l.e(aVar, "$inAppMessage");
        db.l.e(list, "$prompts");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a0(kVar, aVar, list, (va.d) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        r10._state.setCurrentPrompt(r9);
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + r10._state.getCurrentPrompt(), (java.lang.Throwable) null, 2, (java.lang.Object) null);
        r9 = r10._state.getCurrentPrompt();
        db.l.b(r9);
        r9.setPrompted(true);
        r9 = r10._state.getCurrentPrompt();
        db.l.b(r9);
        r3.L$0 = r10;
        r3.L$1 = r0;
        r3.L$2 = r1;
        r3.L$3 = r8;
        r3.label = 1;
        r9 = r9.handlePrompt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ba, code lost:
        if (r9 != r4) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bd, code lost:
        r18 = r9;
        r9 = r0;
        r0 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showMultiplePrompts(com.onesignal.inAppMessages.internal.a r20, java.util.List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> r21, va.d r22) {
        /*
            r19 = this;
            r0 = r22
            boolean r1 = r0 instanceof com.onesignal.inAppMessages.internal.k.b0
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.onesignal.inAppMessages.internal.k$b0 r1 = (com.onesignal.inAppMessages.internal.k.b0) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r19
            goto L_0x001e
        L_0x0017:
            com.onesignal.inAppMessages.internal.k$b0 r1 = new com.onesignal.inAppMessages.internal.k$b0
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r1.label
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x0057
            if (r4 == r5) goto L_0x003c
            if (r4 != r6) goto L_0x0034
            sa.o.b(r0)
            goto L_0x0129
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            java.lang.Object r4 = r1.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r1.L$2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$1
            com.onesignal.inAppMessages.internal.a r9 = (com.onesignal.inAppMessages.internal.a) r9
            java.lang.Object r10 = r1.L$0
            com.onesignal.inAppMessages.internal.k r10 = (com.onesignal.inAppMessages.internal.k) r10
            sa.o.b(r0)
            r18 = r3
            r3 = r1
            r1 = r8
            r8 = r4
            r4 = r18
            goto L_0x00c2
        L_0x0057:
            sa.o.b(r0)
            java.util.Iterator r0 = r21.iterator()
            r8 = r0
            r10 = r2
            r4 = r3
            r0 = r20
            r3 = r1
            r1 = r21
        L_0x0066:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00f0
            java.lang.Object r9 = r8.next()
            com.onesignal.inAppMessages.internal.prompt.impl.b r9 = (com.onesignal.inAppMessages.internal.prompt.impl.b) r9
            boolean r11 = r9.hasPrompted()
            if (r11 != 0) goto L_0x0066
            o8.a r11 = r10._state
            r11.setCurrentPrompt(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: "
            r9.append(r11)
            o8.a r11 = r10._state
            com.onesignal.inAppMessages.internal.prompt.impl.b r11 = r11.getCurrentPrompt()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r9, r7, r6, r7)
            o8.a r9 = r10._state
            com.onesignal.inAppMessages.internal.prompt.impl.b r9 = r9.getCurrentPrompt()
            db.l.b(r9)
            r9.setPrompted(r5)
            o8.a r9 = r10._state
            com.onesignal.inAppMessages.internal.prompt.impl.b r9 = r9.getCurrentPrompt()
            db.l.b(r9)
            r3.L$0 = r10
            r3.L$1 = r0
            r3.L$2 = r1
            r3.L$3 = r8
            r3.label = r5
            java.lang.Object r9 = r9.handlePrompt(r3)
            if (r9 != r4) goto L_0x00bd
            return r4
        L_0x00bd:
            r18 = r9
            r9 = r0
            r0 = r18
        L_0x00c2:
            com.onesignal.inAppMessages.internal.prompt.impl.b$a r0 = (com.onesignal.inAppMessages.internal.prompt.impl.b.a) r0
            o8.a r11 = r10._state
            r11.setCurrentPrompt(r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r11, r7, r6, r7)
            boolean r11 = r9.isPreview()
            if (r11 == 0) goto L_0x00ed
            com.onesignal.inAppMessages.internal.prompt.impl.b$a r11 = com.onesignal.inAppMessages.internal.prompt.impl.b.a.LOCATION_PERMISSIONS_MISSING_MANIFEST
            if (r0 != r11) goto L_0x00ed
            r10.showAlertDialogMessage(r9, r1)
            r15 = r3
            r13 = r9
            goto L_0x00f2
        L_0x00ed:
            r0 = r9
            goto L_0x0066
        L_0x00f0:
            r13 = r0
            r15 = r3
        L_0x00f2:
            r12 = r10
            o8.a r0 = r12._state
            com.onesignal.inAppMessages.internal.prompt.impl.b r0 = r0.getCurrentPrompt()
            if (r0 != 0) goto L_0x012c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: "
            r0.append(r1)
            java.lang.String r1 = r13.getMessageId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r0, r7, r6, r7)
            r14 = 0
            r16 = 2
            r17 = 0
            r15.L$0 = r7
            r15.L$1 = r7
            r15.L$2 = r7
            r15.L$3 = r7
            r15.label = r6
            java.lang.Object r0 = messageWasDismissed$default(r12, r13, r14, r15, r16, r17)
            if (r0 != r4) goto L_0x0129
            return r4
        L_0x0129:
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x012c:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.k.showMultiplePrompts(com.onesignal.inAppMessages.internal.a, java.util.List, va.d):java.lang.Object");
    }

    public void addClickListener(e8.c cVar) {
        db.l.e(cVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.addClickListener(listener: " + cVar + ')', (Throwable) null, 2, (Object) null);
        this.messageClickCallback.subscribe(cVar);
    }

    public void addLifecycleListener(e8.g gVar) {
        db.l.e(gVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + gVar + ')', (Throwable) null, 2, (Object) null);
        this.lifecycleCallback.subscribe(gVar);
    }

    public void addTrigger(String str, String str2) {
        db.l.e(str, "key");
        db.l.e(str2, FirebaseAnalytics.Param.VALUE);
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.addTrigger(key: " + str + ", value: " + str2 + ')', (Throwable) null, 2, (Object) null);
        com.onesignal.inAppMessages.internal.triggers.c cVar = (com.onesignal.inAppMessages.internal.triggers.c) this._triggerModelStore.get(str);
        if (cVar != null) {
            cVar.setValue(str2);
            return;
        }
        com.onesignal.inAppMessages.internal.triggers.c cVar2 = new com.onesignal.inAppMessages.internal.triggers.c();
        cVar2.setId(str);
        cVar2.setKey(str);
        cVar2.setValue(str2);
        b.a.add$default(this._triggerModelStore, cVar2, (String) null, 2, (Object) null);
    }

    public void addTriggers(Map<String, String> map) {
        db.l.e(map, "triggers");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.addTriggers(triggers: " + map + ')', (Throwable) null, 2, (Object) null);
        for (Map.Entry next : map.entrySet()) {
            addTrigger((String) next.getKey(), (String) next.getValue());
        }
    }

    public void clearTriggers() {
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.clearTriggers()", (Throwable) null, 2, (Object) null);
        b.a.clear$default(this._triggerModelStore, (String) null, 1, (Object) null);
    }

    public boolean getPaused() {
        return this._state.getPaused();
    }

    public void onMessageActionOccurredOnMessage(a aVar, c cVar) {
        db.l.e(aVar, "message");
        db.l.e(cVar, "action");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new j(cVar, aVar, this, (va.d) null), 1, (Object) null);
    }

    public void onMessageActionOccurredOnPreview(a aVar, c cVar) {
        db.l.e(aVar, "message");
        db.l.e(cVar, "action");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0145k(cVar, aVar, this, (va.d) null), 1, (Object) null);
    }

    public void onMessagePageChanged(a aVar, g gVar) {
        db.l.e(aVar, "message");
        db.l.e(gVar, "page");
        if (!aVar.isPreview()) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new l(this, aVar, gVar, (va.d) null), 1, (Object) null);
        }
    }

    public void onMessageWasDismissed(a aVar) {
        db.l.e(aVar, "message");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new m(this, aVar, (va.d) null), 1, (Object) null);
    }

    public void onMessageWasDisplayed(a aVar) {
        db.l.e(aVar, "message");
        if (!this.lifecycleCallback.getHasSubscribers()) {
            com.onesignal.debug.internal.logging.a.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", (Throwable) null, 2, (Object) null);
            return;
        }
        this.lifecycleCallback.fireOnMain(new n(aVar));
        if (!aVar.isPreview() && !this.impressionedMessages.contains(aVar.getMessageId())) {
            this.impressionedMessages.add(aVar.getMessageId());
            String variantIdForMessage = g8.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
            if (variantIdForMessage != null) {
                com.onesignal.common.threading.a.suspendifyOnThread$default(0, new o(this, variantIdForMessage, aVar, (va.d) null), 1, (Object) null);
            }
        }
    }

    public void onMessageWillDismiss(a aVar) {
        db.l.e(aVar, "message");
        if (!this.lifecycleCallback.getHasSubscribers()) {
            com.onesignal.debug.internal.logging.a.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", (Throwable) null, 2, (Object) null);
        } else {
            this.lifecycleCallback.fireOnMain(new p(aVar));
        }
    }

    public void onMessageWillDisplay(a aVar) {
        db.l.e(aVar, "message");
        if (!this.lifecycleCallback.getHasSubscribers()) {
            com.onesignal.debug.internal.logging.a.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", (Throwable) null, 2, (Object) null);
        } else {
            this.lifecycleCallback.fireOnMain(new q(aVar));
        }
    }

    public void onModelUpdated(com.onesignal.common.modeling.h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        if (db.l.a(hVar.getProperty(), "appId")) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new s(this, (va.d) null), 1, (Object) null);
        }
    }

    public void onSessionActive() {
    }

    public void onSessionEnded(long j10) {
    }

    public void onSessionStarted() {
        for (a displayedInSession : this.redisplayedInAppMessages) {
            displayedInSession.setDisplayedInSession(false);
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new t(this, (va.d) null), 1, (Object) null);
    }

    public void onSubscriptionAdded(ba.e eVar) {
        db.l.e(eVar, "subscription");
    }

    public void onSubscriptionChanged(ba.e eVar, com.onesignal.common.modeling.h hVar) {
        db.l.e(eVar, "subscription");
        db.l.e(hVar, "args");
        if ((eVar instanceof ba.b) && db.l.a(hVar.getPath(), "id")) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new u(this, (va.d) null), 1, (Object) null);
        }
    }

    public void onSubscriptionRemoved(ba.e eVar) {
        db.l.e(eVar, "subscription");
    }

    public void onTriggerChanged(String str) {
        db.l.e(str, "newTriggerKey");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + str + ')', (Throwable) null, 2, (Object) null);
        makeRedisplayMessagesAvailableWithTriggers(n.b(str));
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new v(this, (va.d) null), 1, (Object) null);
    }

    public void onTriggerCompleted(String str) {
        db.l.e(str, "triggerId");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + str, (Throwable) null, 2, (Object) null);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        makeRedisplayMessagesAvailableWithTriggers(hashSet);
    }

    public void onTriggerConditionChanged() {
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.onTriggerConditionChanged()", (Throwable) null, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new w(this, (va.d) null), 1, (Object) null);
    }

    public void removeClickListener(e8.c cVar) {
        db.l.e(cVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.removeClickListener(listener: " + cVar + ')', (Throwable) null, 2, (Object) null);
        this.messageClickCallback.unsubscribe(cVar);
    }

    public void removeLifecycleListener(e8.g gVar) {
        db.l.e(gVar, "listener");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + gVar + ')', (Throwable) null, 2, (Object) null);
        this.lifecycleCallback.unsubscribe(gVar);
    }

    public void removeTrigger(String str) {
        db.l.e(str, "key");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.removeTrigger(key: " + str + ')', (Throwable) null, 2, (Object) null);
        b.a.remove$default(this._triggerModelStore, str, (String) null, 2, (Object) null);
    }

    public void removeTriggers(Collection<String> collection) {
        db.l.e(collection, "keys");
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.removeTriggers(keys: " + collection + ')', (Throwable) null, 2, (Object) null);
        for (String removeTrigger : collection) {
            removeTrigger(removeTrigger);
        }
    }

    public void setPaused(boolean z10) {
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessagesManager.setPaused(value: " + z10 + ')', (Throwable) null, 2, (Object) null);
        this._state.setPaused(z10);
        if (!z10) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new x(this, (va.d) null), 1, (Object) null);
        }
    }

    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((com.onesignal.common.modeling.e) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c0(this, (va.d) null), 1, (Object) null);
    }

    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        db.l.e(aVar, "model");
        db.l.e(str, "tag");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new r(this, (va.d) null), 1, (Object) null);
    }
}
