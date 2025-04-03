package com.onesignal.inAppMessages.internal.lifecycle.impl;

import cb.l;
import db.m;
import sa.t;

public final class a extends com.onesignal.common.events.b implements j8.b {

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a  reason: collision with other inner class name */
    static final class C0146a extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0146a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    static final class b extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    static final class c extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessagePageChanged(this.$message, this.$page);
        }
    }

    static final class d extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageWasDismissed(this.$message);
        }
    }

    static final class e extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageWasDisplayed(this.$message);
        }
    }

    static final class f extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageWillDismiss(this.$message);
        }
    }

    static final class g extends m implements l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((j8.a) obj);
            return t.f15300a;
        }

        public final void invoke(j8.a aVar) {
            db.l.e(aVar, "it");
            aVar.onMessageWillDisplay(this.$message);
        }
    }

    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        db.l.e(aVar, "message");
        db.l.e(cVar, "action");
        fire(new C0146a(aVar, cVar));
    }

    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        db.l.e(aVar, "message");
        db.l.e(cVar, "action");
        fire(new b(aVar, cVar));
    }

    public void messagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        db.l.e(aVar, "message");
        db.l.e(gVar, "page");
        fire(new c(aVar, gVar));
    }

    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        db.l.e(aVar, "message");
        fire(new d(aVar));
    }

    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        db.l.e(aVar, "message");
        fire(new e(aVar));
    }

    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        db.l.e(aVar, "message");
        fire(new f(aVar));
    }

    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        db.l.e(aVar, "message");
        fire(new g(aVar));
    }
}
