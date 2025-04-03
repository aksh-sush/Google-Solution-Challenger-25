package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.h0;
import com.onesignal.common.u;
import db.g;
import db.l;
import e0.c;

public final class a extends RelativeLayout {
    public static final C0140a Companion = new C0140a((g) null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    /* access modifiers changed from: private */
    public boolean dismissing;
    private final boolean draggingDisabled;
    /* access modifiers changed from: private */
    public e0.c mDragHelper;
    /* access modifiers changed from: private */
    public b mListener;
    /* access modifiers changed from: private */
    public c params;

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a  reason: collision with other inner class name */
    public static final class C0140a {
        private C0140a() {
        }

        public /* synthetic */ C0140a(g gVar) {
            this();
        }
    }

    public interface b {
        void onDismiss();

        void onDragEnd();

        void onDragStart();
    }

    public static final class c {
        public static final C0141a Companion = new C0141a((g) null);
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$c$a  reason: collision with other inner class name */
        public static final class C0141a {
            private C0141a() {
            }

            public /* synthetic */ C0141a(g gVar) {
                this();
            }
        }

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i10) {
            this.dismissingYPos = i10;
        }

        public final void setDismissingYVelocity(int i10) {
            this.dismissingYVelocity = i10;
        }

        public final void setDragDirection(int i10) {
            this.dragDirection = i10;
        }

        public final void setDragThresholdY(int i10) {
            this.dragThresholdY = i10;
        }

        public final void setDraggingDisabled(boolean z10) {
            this.draggingDisabled = z10;
        }

        public final void setHeight(int i10) {
            this.height = i10;
        }

        public final void setMaxXPos(int i10) {
            this.maxXPos = i10;
        }

        public final void setMaxYPos(int i10) {
            this.maxYPos = i10;
        }

        public final void setMessageHeight(int i10) {
            this.messageHeight = i10;
        }

        public final void setOffScreenYPos(int i10) {
            this.offScreenYPos = i10;
        }

        public final void setPosY(int i10) {
            this.posY = i10;
        }
    }

    public static final class d extends c.C0206c {
        private int lastYPos;
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            l.e(view, "child");
            c access$getParams$p = this.this$0.params;
            l.b(access$getParams$p);
            return access$getParams$p.getMaxXPos();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            if (r2 < r1.getMaxYPos()) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0097, code lost:
            if (r2 > r1.getMaxYPos()) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int clampViewPositionVertical(android.view.View r1, int r2, int r3) {
            /*
                r0 = this;
                java.lang.String r3 = "child"
                db.l.e(r1, r3)
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                boolean r1 = r1.getDraggingDisabled()
                if (r1 == 0) goto L_0x0022
            L_0x0014:
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getMaxYPos()
                return r1
            L_0x0022:
                r0.lastYPos = r2
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getDragDirection()
                r3 = 1
                if (r1 != r3) goto L_0x0067
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getDragThresholdY()
                if (r2 < r1) goto L_0x0057
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r1 = r1.mListener
                if (r1 == 0) goto L_0x0057
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r1 = r1.mListener
                db.l.b(r1)
                r1.onDragStart()
            L_0x0057:
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getMaxYPos()
                if (r2 >= r1) goto L_0x009b
                goto L_0x0014
            L_0x0067:
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getDragThresholdY()
                if (r2 > r1) goto L_0x008a
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r1 = r1.mListener
                if (r1 == 0) goto L_0x008a
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r1 = r1.mListener
                db.l.b(r1)
                r1.onDragStart()
            L_0x008a:
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r0.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getMaxYPos()
                if (r2 <= r1) goto L_0x009b
                goto L_0x0014
            L_0x009b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.a.d.clampViewPositionVertical(android.view.View, int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
            if (r5 < ((float) r4.getDismissingYVelocity())) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00af, code lost:
            if (com.onesignal.inAppMessages.internal.display.impl.a.access$getMListener$p(r2.this$0) != null) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
            if (r5 > ((float) r4.getDismissingYVelocity())) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0065, code lost:
            if (com.onesignal.inAppMessages.internal.display.impl.a.access$getMListener$p(r2.this$0) != null) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                java.lang.String r4 = "releasedChild"
                db.l.e(r3, r4)
                com.onesignal.inAppMessages.internal.display.impl.a r3 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r3 = r3.params
                db.l.b(r3)
                int r3 = r3.getMaxYPos()
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                boolean r4 = r4.dismissing
                if (r4 != 0) goto L_0x00b2
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r4 = r4.params
                db.l.b(r4)
                int r4 = r4.getDragDirection()
                r0 = 1
                if (r4 != r0) goto L_0x0074
                int r4 = r2.lastYPos
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getDismissingYPos()
                if (r4 > r1) goto L_0x004d
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r4 = r4.params
                db.l.b(r4)
                int r4 = r4.getDismissingYVelocity()
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x00b2
            L_0x004d:
                com.onesignal.inAppMessages.internal.display.impl.a r3 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r3 = r3.params
                db.l.b(r3)
                int r3 = r3.getOffScreenYPos()
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                r4.dismissing = r0
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r4 = r4.mListener
                if (r4 == 0) goto L_0x00b2
            L_0x0067:
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r4 = r4.mListener
                db.l.b(r4)
                r4.onDismiss()
                goto L_0x00b2
            L_0x0074:
                int r4 = r2.lastYPos
                com.onesignal.inAppMessages.internal.display.impl.a r1 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r1 = r1.params
                db.l.b(r1)
                int r1 = r1.getDismissingYPos()
                if (r4 < r1) goto L_0x0097
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r4 = r4.params
                db.l.b(r4)
                int r4 = r4.getDismissingYVelocity()
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 >= 0) goto L_0x00b2
            L_0x0097:
                com.onesignal.inAppMessages.internal.display.impl.a r3 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r3 = r3.params
                db.l.b(r3)
                int r3 = r3.getOffScreenYPos()
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                r4.dismissing = r0
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$b r4 = r4.mListener
                if (r4 == 0) goto L_0x00b2
                goto L_0x0067
            L_0x00b2:
                com.onesignal.inAppMessages.internal.display.impl.a r4 = r2.this$0
                e0.c r4 = r4.mDragHelper
                db.l.b(r4)
                com.onesignal.inAppMessages.internal.display.impl.a r5 = r2.this$0
                com.onesignal.inAppMessages.internal.display.impl.a$c r5 = r5.params
                db.l.b(r5)
                int r5 = r5.getMaxXPos()
                boolean r3 = r4.O(r5, r3)
                if (r3 == 0) goto L_0x00d3
                com.onesignal.inAppMessages.internal.display.impl.a r3 = r2.this$0
                androidx.core.view.h0.j0(r3)
            L_0x00d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.a.d.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i10) {
            l.e(view, "child");
            return true;
        }
    }

    static {
        u uVar = u.INSTANCE;
        MARGIN_PX_SIZE = uVar.dpToPx(28);
        EXTRA_PX_DISMISS = uVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        this.mDragHelper = e0.c.n(this, 1.0f, new d(this));
    }

    public void computeScroll() {
        super.computeScroll();
        e0.c cVar = this.mDragHelper;
        l.b(cVar);
        if (cVar.m(true)) {
            h0.j0(this);
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        e0.c cVar = this.mDragHelper;
        l.b(cVar);
        int left = getLeft();
        c cVar2 = this.params;
        l.b(cVar2);
        cVar.Q(this, left, cVar2.getOffScreenYPos());
        h0.j0(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        l.e(motionEvent, "event");
        if (this.dismissing) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            l.b(bVar);
            bVar.onDragEnd();
        }
        e0.c cVar = this.mDragHelper;
        l.b(cVar);
        cVar.F(motionEvent);
        return false;
    }

    public final void setListener(b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(c cVar) {
        int i10;
        l.e(cVar, "params");
        this.params = cVar;
        cVar.setOffScreenYPos(cVar.getMessageHeight() + cVar.getPosY() + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.getMessageHeight()) - cVar.getPosY()) + EXTRA_PX_DISMISS);
        cVar.setDismissingYVelocity(u.INSTANCE.dpToPx(3000));
        if (cVar.getDragDirection() == 0) {
            cVar.setOffScreenYPos((-cVar.getMessageHeight()) - MARGIN_PX_SIZE);
            cVar.setDismissingYVelocity(-cVar.getDismissingYVelocity());
            i10 = cVar.getOffScreenYPos() / 3;
        } else {
            i10 = (cVar.getMessageHeight() / 3) + (cVar.getMaxYPos() * 2);
        }
        cVar.setDismissingYPos(i10);
    }
}
