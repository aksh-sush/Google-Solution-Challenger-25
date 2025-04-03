package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import cb.p;
import com.onesignal.common.u;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.i;
import db.l;
import mb.h0;
import mb.r0;
import mb.w0;
import sa.o;
import sa.t;

public final class c {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = Color.parseColor("#00000000");
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    public static final a Companion = new a((db.g) null);
    private static final int DRAG_THRESHOLD_PX_SIZE = u.INSTANCE.dpToPx(4);
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;
    /* access modifiers changed from: private */
    public Activity currentActivity;
    /* access modifiers changed from: private */
    public final boolean disableDragDismiss;
    private final double displayDuration;
    private final i.c displayPosition;
    /* access modifiers changed from: private */
    public a draggableRelativeLayout;
    /* access modifiers changed from: private */
    public final boolean hasBackground;
    private boolean isDismissTimerSet;
    /* access modifiers changed from: private */
    public boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    /* access modifiers changed from: private */
    public b messageController;
    private int pageHeight;
    private final int pageWidth = -1;
    /* access modifiers changed from: private */
    public RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private boolean shouldDismissWhenActive;
    /* access modifiers changed from: private */
    public WebView webView;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    public interface b {
        void onMessageWasDismissed();

        void onMessageWasDisplayed();

        void onMessageWillDismiss();
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.c$c  reason: collision with other inner class name */
    public /* synthetic */ class C0143c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i.c.values().length];
            iArr[i.c.TOP_BANNER.ordinal()] = 1;
            iArr[i.c.BOTTOM_BANNER.ordinal()] = 2;
            iArr[i.c.CENTER_MODAL.ordinal()] = 3;
            iArr[i.c.FULL_SCREEN.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.b $waiter;
        final /* synthetic */ c this$0;

        d(c cVar, com.onesignal.common.threading.b bVar) {
            this.this$0 = cVar;
            this.$waiter = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            l.e(animator, "animation");
            this.this$0.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    public static final class e implements Animation.AnimationListener {
        final /* synthetic */ CardView $messageViewCardView;
        final /* synthetic */ c this$0;

        e(CardView cardView, c cVar) {
            this.$messageViewCardView = cardView;
            this.this$0 = cVar;
        }

        public void onAnimationEnd(Animation animation) {
            l.e(animation, "animation");
            if (Build.VERSION.SDK_INT == 23) {
                this.$messageViewCardView.setCardElevation((float) u.INSTANCE.dpToPx(5));
            }
            if (this.this$0.messageController != null) {
                b access$getMessageController$p = this.this$0.messageController;
                l.b(access$getMessageController$p);
                access$getMessageController$p.onMessageWasDisplayed();
            }
        }

        public void onAnimationRepeat(Animation animation) {
            l.e(animation, "animation");
        }

        public void onAnimationStart(Animation animation) {
            l.e(animation, "animation");
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.delayShowUntilAvailable((Activity) null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {
        int label;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new g(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                this.label = 1;
                if (r0.a(600, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else if (i10 == 2) {
                o.b(obj);
                return t.f15300a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.this$0.hasBackground || this.this$0.parentRelativeLayout == null) {
                this.this$0.cleanupViewsAfterDismiss();
                return t.f15300a;
            }
            c cVar = this.this$0;
            RelativeLayout access$getParentRelativeLayout$p = cVar.parentRelativeLayout;
            l.b(access$getParentRelativeLayout$p);
            this.label = 2;
            if (cVar.animateAndDismissLayout(access$getParentRelativeLayout$p, this) == c10) {
                return c10;
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public static final class h implements a.b {
        final /* synthetic */ c this$0;

        static final class a extends kotlin.coroutines.jvm.internal.l implements cb.l {
            int label;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, va.d dVar) {
                super(1, dVar);
                this.this$0 = cVar;
            }

            public final va.d create(va.d dVar) {
                return new a(this.this$0, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    c cVar = this.this$0;
                    this.label = 1;
                    if (cVar.finishAfterDelay(this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return t.f15300a;
            }

            public final Object invoke(va.d dVar) {
                return ((a) create(dVar)).invokeSuspend(t.f15300a);
            }
        }

        h(c cVar) {
            this.this$0 = cVar;
        }

        public void onDismiss() {
            if (this.this$0.messageController != null) {
                b access$getMessageController$p = this.this$0.messageController;
                l.b(access$getMessageController$p);
                access$getMessageController$p.onMessageWillDismiss();
            }
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(this.this$0, (va.d) null), 1, (Object) null);
        }

        public void onDragEnd() {
            this.this$0.isDragging = false;
        }

        public void onDragStart() {
            this.this$0.isDragging = true;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ i.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ a.c $webViewLayoutParams;
        int label;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.c cVar2, i.c cVar3, va.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = cVar2;
            this.$displayLocation = cVar3;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new i(this.this$0, this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                if (this.this$0.webView == null) {
                    return t.f15300a;
                }
                WebView access$getWebView$p = this.this$0.webView;
                l.b(access$getWebView$p);
                access$getWebView$p.setLayoutParams(this.$relativeLayoutParams);
                c cVar = this.this$0;
                Activity access$getCurrentActivity$p = cVar.currentActivity;
                l.b(access$getCurrentActivity$p);
                cVar.setUpDraggableLayout(access$getCurrentActivity$p, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                c cVar2 = this.this$0;
                Activity access$getCurrentActivity$p2 = cVar2.currentActivity;
                l.b(access$getCurrentActivity$p2);
                cVar2.setUpParentRelativeLayout(access$getCurrentActivity$p2);
                c cVar3 = this.this$0;
                RelativeLayout access$getParentRelativeLayout$p = cVar3.parentRelativeLayout;
                l.b(access$getParentRelativeLayout$p);
                cVar3.createPopupWindow(access$getParentRelativeLayout$p);
                if (this.this$0.messageController != null) {
                    c cVar4 = this.this$0;
                    i.c cVar5 = this.$displayLocation;
                    a access$getDraggableRelativeLayout$p = cVar4.draggableRelativeLayout;
                    l.b(access$getDraggableRelativeLayout$p);
                    RelativeLayout access$getParentRelativeLayout$p2 = this.this$0.parentRelativeLayout;
                    l.b(access$getParentRelativeLayout$p2);
                    cVar4.animateInAppMessage(cVar5, access$getDraggableRelativeLayout$p, access$getParentRelativeLayout$p2);
                }
                c cVar6 = this.this$0;
                this.label = 1;
                if (cVar6.startDismissTimerIfNeeded(this) == c10) {
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
            return ((i) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.startDismissTimerIfNeeded(this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ int $pageHeight;
        int label;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, int i10, va.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$pageHeight = i10;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new k(this.this$0, this.$pageHeight, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                if (this.this$0.webView == null) {
                    str = "WebView height update skipped, new height will be used once it is displayed.";
                } else {
                    WebView access$getWebView$p = this.this$0.webView;
                    l.b(access$getWebView$p);
                    ViewGroup.LayoutParams layoutParams = access$getWebView$p.getLayoutParams();
                    if (layoutParams == null) {
                        str = "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.";
                    } else {
                        layoutParams.height = this.$pageHeight;
                        WebView access$getWebView$p2 = this.this$0.webView;
                        l.b(access$getWebView$p2);
                        access$getWebView$p2.setLayoutParams(layoutParams);
                        if (this.this$0.draggableRelativeLayout != null) {
                            a access$getDraggableRelativeLayout$p = this.this$0.draggableRelativeLayout;
                            l.b(access$getDraggableRelativeLayout$p);
                            c cVar = this.this$0;
                            access$getDraggableRelativeLayout$p.setParams(cVar.createDraggableLayoutParams(this.$pageHeight, cVar.getDisplayPosition(), this.this$0.disableDragDismiss));
                        }
                        return t.f15300a;
                    }
                }
                com.onesignal.debug.internal.logging.a.warn$default(str, (Throwable) null, 2, (Object) null);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((k) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public c(WebView webView2, com.onesignal.inAppMessages.internal.d dVar, boolean z10) {
        double d10;
        l.e(dVar, "messageContent");
        this.webView = webView2;
        this.messageContent = dVar;
        this.disableDragDismiss = z10;
        this.pageHeight = dVar.getPageHeight();
        u uVar = u.INSTANCE;
        this.marginPxSizeLeft = uVar.dpToPx(24);
        this.marginPxSizeRight = uVar.dpToPx(24);
        this.marginPxSizeTop = uVar.dpToPx(24);
        this.marginPxSizeBottom = uVar.dpToPx(24);
        i.c displayLocation = dVar.getDisplayLocation();
        l.b(displayLocation);
        this.displayPosition = displayLocation;
        if (dVar.getDisplayDuration() == null) {
            d10 = 0.0d;
        } else {
            Double displayDuration2 = dVar.getDisplayDuration();
            l.b(displayDuration2);
            d10 = displayDuration2.doubleValue();
        }
        this.displayDuration = d10;
        this.hasBackground = !displayLocation.isBanner();
        setMarginsFromContent(dVar);
    }

    /* access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, va.d dVar) {
        com.onesignal.common.threading.b bVar = new com.onesignal.common.threading.b();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, ACTIVITY_BACKGROUND_COLOR_FULL, ACTIVITY_BACKGROUND_COLOR_EMPTY, new d(this, bVar)).start();
        Object waitForWake = bVar.waitForWake(dVar);
        return waitForWake == d.c() ? waitForWake : t.f15300a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        return f.INSTANCE.animateViewColor(view, i10, i11, i12, animatorListener);
    }

    private final void animateBottom(View view, int i10, Animation.AnimationListener animationListener) {
        f.INSTANCE.animateViewByTranslation(view, (float) (i10 + this.marginPxSizeBottom), 0.0f, 1000, new g(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = f.INSTANCE.animateViewSmallToLarge(view, 1000, new g(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, ACTIVITY_BACKGROUND_COLOR_EMPTY, ACTIVITY_BACKGROUND_COLOR_FULL, animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* access modifiers changed from: private */
    public final void animateInAppMessage(i.c cVar, View view, View view2) {
        l.b(view);
        CardView cardView = (CardView) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        l.d(cardView, "messageViewCardView");
        Animation.AnimationListener createAnimationListener = createAnimationListener(cardView);
        int i10 = C0143c.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            WebView webView2 = this.webView;
            l.b(webView2);
            animateTop(cardView, webView2.getHeight(), createAnimationListener);
        } else if (i10 == 2) {
            WebView webView3 = this.webView;
            l.b(webView3);
            animateBottom(cardView, webView3.getHeight(), createAnimationListener);
        } else if (i10 == 3 || i10 == 4) {
            animateCenter(view, view2, createAnimationListener, (Animator.AnimatorListener) null);
        }
    }

    private final void animateTop(View view, int i10, Animation.AnimationListener animationListener) {
        f.INSTANCE.animateViewByTranslation(view, (float) ((-i10) - this.marginPxSizeTop), 0.0f, 1000, new g(0.1d, 8.0d), animationListener).start();
    }

    /* access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        b bVar = this.messageController;
        if (bVar != null) {
            bVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(CardView cardView) {
        return new e(cardView, this);
    }

    private final CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == i.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        cardView.setCardElevation(Build.VERSION.SDK_INT == 23 ? 0.0f : (float) u.INSTANCE.dpToPx(5));
        cardView.setRadius((float) u.INSTANCE.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onesignal.inAppMessages.internal.display.impl.a.c createDraggableLayoutParams(int r5, com.onesignal.inAppMessages.internal.display.impl.i.c r6, boolean r7) {
        /*
            r4 = this;
            com.onesignal.inAppMessages.internal.display.impl.a$c r0 = new com.onesignal.inAppMessages.internal.display.impl.a$c
            r0.<init>()
            int r1 = r4.marginPxSizeRight
            r0.setMaxXPos(r1)
            int r1 = r4.marginPxSizeTop
            r0.setMaxYPos(r1)
            r0.setDraggingDisabled(r7)
            r0.setMessageHeight(r5)
            int r7 = r4.getDisplayYSize()
            r0.setHeight(r7)
            int[] r7 = com.onesignal.inAppMessages.internal.display.impl.c.C0143c.$EnumSwitchMapping$0
            int r1 = r6.ordinal()
            r7 = r7[r1]
            r1 = 1
            if (r7 == r1) goto L_0x0060
            r2 = 2
            if (r7 == r2) goto L_0x0052
            r3 = 3
            if (r7 == r3) goto L_0x003e
            r5 = 4
            if (r7 == r5) goto L_0x0031
            goto L_0x0068
        L_0x0031:
            int r5 = r4.getDisplayYSize()
            int r7 = r4.marginPxSizeBottom
            int r3 = r4.marginPxSizeTop
            int r7 = r7 + r3
            int r5 = r5 - r7
            r0.setMessageHeight(r5)
        L_0x003e:
            int r7 = r4.getDisplayYSize()
            int r7 = r7 / r2
            int r5 = r5 / r2
            int r7 = r7 - r5
            int r5 = DRAG_THRESHOLD_PX_SIZE
            int r5 = r5 + r7
            r0.setDragThresholdY(r5)
            r0.setMaxYPos(r7)
            r0.setPosY(r7)
            goto L_0x0068
        L_0x0052:
            int r7 = r4.getDisplayYSize()
            int r7 = r7 - r5
            r0.setPosY(r7)
            int r5 = r4.marginPxSizeBottom
            int r7 = DRAG_THRESHOLD_PX_SIZE
            int r5 = r5 + r7
            goto L_0x0065
        L_0x0060:
            int r5 = r4.marginPxSizeTop
            int r7 = DRAG_THRESHOLD_PX_SIZE
            int r5 = r5 - r7
        L_0x0065:
            r0.setDragThresholdY(r5)
        L_0x0068:
            com.onesignal.inAppMessages.internal.display.impl.i$c r5 = com.onesignal.inAppMessages.internal.display.impl.i.c.TOP_BANNER
            if (r6 != r5) goto L_0x006d
            r1 = 0
        L_0x006d:
            r0.setDragDirection(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.c.createDraggableLayoutParams(int, com.onesignal.inAppMessages.internal.display.impl.i$c, boolean):com.onesignal.inAppMessages.internal.display.impl.a$c");
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        int i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i11 = C0143c.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i11 == 1) {
            i10 = 10;
        } else if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                layoutParams.addRule(13);
            }
            return layoutParams;
        } else {
            i10 = 12;
        }
        layoutParams.addRule(i10);
        layoutParams.addRule(14);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z10 = this.hasBackground;
        int i10 = -1;
        int i11 = z10 ? -1 : this.pageWidth;
        if (!z10) {
            i10 = -2;
        }
        int i12 = 1;
        PopupWindow popupWindow2 = new PopupWindow(relativeLayout, i11, i10, true);
        this.popupWindow = popupWindow2;
        l.b(popupWindow2);
        popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
        PopupWindow popupWindow3 = this.popupWindow;
        l.b(popupWindow3);
        popupWindow3.setTouchable(true);
        PopupWindow popupWindow4 = this.popupWindow;
        l.b(popupWindow4);
        popupWindow4.setClippingEnabled(false);
        if (!this.hasBackground) {
            int i13 = C0143c.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i13 == 1) {
                i12 = 49;
            } else if (i13 == 2) {
                i12 = 81;
            } else if (!(i13 == 3 || i13 == 4)) {
                throw new sa.l();
            }
        } else {
            i12 = 0;
        }
        int i14 = this.messageContent.isFullBleed() ? 1000 : 1003;
        PopupWindow popupWindow5 = this.popupWindow;
        l.b(popupWindow5);
        androidx.core.widget.h.b(popupWindow5, i14);
        PopupWindow popupWindow6 = this.popupWindow;
        l.b(popupWindow6);
        Activity activity = this.currentActivity;
        l.b(activity);
        popupWindow6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i12, 0, 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object delayShowUntilAvailable(android.app.Activity r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.inAppMessages.internal.display.impl.c.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.inAppMessages.internal.display.impl.c$f r0 = (com.onesignal.inAppMessages.internal.display.impl.c.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.c$f r0 = new com.onesignal.inAppMessages.internal.display.impl.c$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sa.o.b(r8)
            goto L_0x0080
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.L$1
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.c r2 = (com.onesignal.inAppMessages.internal.display.impl.c) r2
            sa.o.b(r8)
            goto L_0x0072
        L_0x0043:
            sa.o.b(r8)
            goto L_0x005f
        L_0x0047:
            sa.o.b(r8)
            com.onesignal.common.AndroidUtils r8 = com.onesignal.common.AndroidUtils.INSTANCE
            boolean r8 = r8.isActivityFullyReady(r7)
            if (r8 == 0) goto L_0x0062
            android.widget.RelativeLayout r8 = r6.parentRelativeLayout
            if (r8 != 0) goto L_0x0062
            r0.label = r5
            java.lang.Object r7 = r6.showInAppMessageView(r7, r0)
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x0062:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = mb.r0.a(r4, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r6
        L_0x0072:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r2.delayShowUntilAvailable(r7, r0)
            if (r7 != r1) goto L_0x0080
            return r1
        L_0x0080:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.c.delayShowUntilAvailable(android.app.Activity, va.d):java.lang.Object");
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* access modifiers changed from: private */
    public final Object finishAfterDelay(va.d dVar) {
        Object g10 = mb.h.g(w0.c(), new g(this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    private final int getDisplayYSize() {
        u uVar = u.INSTANCE;
        Activity activity = this.currentActivity;
        l.b(activity);
        return uVar.getWindowHeight(activity);
    }

    private final void setMarginsFromContent(com.onesignal.inAppMessages.internal.d dVar) {
        int i10 = 0;
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? u.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? u.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? u.INSTANCE.dpToPx(24) : 0;
        if (dVar.getUseWidthMargin()) {
            i10 = u.INSTANCE.dpToPx(24);
        }
        this.marginPxSizeRight = i10;
    }

    /* access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, a.c cVar) {
        a aVar = new a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            l.b(aVar);
            aVar.setLayoutParams(layoutParams);
        }
        a aVar2 = this.draggableRelativeLayout;
        l.b(aVar2);
        aVar2.setParams(cVar);
        a aVar3 = this.draggableRelativeLayout;
        l.b(aVar3);
        aVar3.setListener(new h(this));
        WebView webView2 = this.webView;
        l.b(webView2);
        if (webView2.getParent() != null) {
            WebView webView3 = this.webView;
            l.b(webView3);
            ViewParent parent = webView3.getParent();
            l.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        CardView createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        a aVar4 = this.draggableRelativeLayout;
        l.b(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        a aVar5 = this.draggableRelativeLayout;
        l.b(aVar5);
        aVar5.setClipChildren(false);
        a aVar6 = this.draggableRelativeLayout;
        l.b(aVar6);
        aVar6.setClipToPadding(false);
        a aVar7 = this.draggableRelativeLayout;
        l.b(aVar7);
        aVar7.addView(createCardView);
    }

    /* access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        l.b(relativeLayout);
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        l.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        l.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        l.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* access modifiers changed from: private */
    public final Object showDraggableView(i.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.c cVar2, va.d dVar) {
        Object g10 = mb.h.g(w0.c(), new i(this, layoutParams, layoutParams2, cVar2, cVar, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object startDismissTimerIfNeeded(va.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.onesignal.inAppMessages.internal.display.impl.c.j
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.inAppMessages.internal.display.impl.c$j r0 = (com.onesignal.inAppMessages.internal.display.impl.c.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.c$j r0 = new com.onesignal.inAppMessages.internal.display.impl.c$j
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r0 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.c r0 = (com.onesignal.inAppMessages.internal.display.impl.c) r0
            sa.o.b(r11)
            goto L_0x0088
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.c r2 = (com.onesignal.inAppMessages.internal.display.impl.c) r2
            sa.o.b(r11)
            goto L_0x0065
        L_0x0041:
            sa.o.b(r11)
            double r6 = r10.displayDuration
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0090
            boolean r11 = r10.isDismissTimerSet
            if (r11 == 0) goto L_0x0051
            goto L_0x0090
        L_0x0051:
            r10.isDismissTimerSet = r5
            long r6 = (long) r6
            r11 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r11
            long r6 = r6 * r8
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r11 = mb.r0.a(r6, r0)
            if (r11 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r10
        L_0x0065:
            boolean r11 = r2.cancelDismissTimer
            if (r11 == 0) goto L_0x006e
            r2.cancelDismissTimer = r3
            sa.t r11 = sa.t.f15300a
            return r11
        L_0x006e:
            com.onesignal.inAppMessages.internal.display.impl.c$b r11 = r2.messageController
            if (r11 == 0) goto L_0x0078
            db.l.b(r11)
            r11.onMessageWillDismiss()
        L_0x0078:
            android.app.Activity r11 = r2.currentActivity
            if (r11 == 0) goto L_0x008b
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r11 = r2.dismissAndAwaitNextMessage(r0)
            if (r11 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r0 = r2
        L_0x0088:
            r0.isDismissTimerSet = r3
            goto L_0x008d
        L_0x008b:
            r2.shouldDismissWhenActive = r5
        L_0x008d:
            sa.t r11 = sa.t.f15300a
            return r11
        L_0x0090:
            sa.t r11 = sa.t.f15300a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.c.startDismissTimerIfNeeded(va.d):java.lang.Object");
    }

    public final Object checkIfShouldDismiss(va.d dVar) {
        if (!this.shouldDismissWhenActive) {
            return t.f15300a;
        }
        this.shouldDismissWhenActive = false;
        Object finishAfterDelay = finishAfterDelay(dVar);
        return finishAfterDelay == d.c() ? finishAfterDelay : t.f15300a;
    }

    public final Object dismissAndAwaitNextMessage(va.d dVar) {
        a aVar = this.draggableRelativeLayout;
        if (aVar == null) {
            com.onesignal.debug.internal.logging.a.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", (Throwable) null, 2, (Object) null);
            dereferenceViews();
            return t.f15300a;
        }
        l.b(aVar);
        aVar.dismiss();
        Object finishAfterDelay = finishAfterDelay(dVar);
        return finishAfterDelay == d.c() ? finishAfterDelay : t.f15300a;
    }

    public final i.c getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        com.onesignal.debug.internal.logging.a.debug$default("InAppMessageView.removeAllViews()", (Throwable) null, 2, (Object) null);
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        a aVar = this.draggableRelativeLayout;
        if (aVar != null) {
            l.b(aVar);
            aVar.removeAllViews();
        }
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            l.b(popupWindow2);
            popupWindow2.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(b bVar) {
        this.messageController = bVar;
    }

    public final void setWebView(WebView webView2) {
        l.e(webView2, "webView");
        this.webView = webView2;
        l.b(webView2);
        webView2.setBackgroundColor(0);
    }

    public final Object showInAppMessageView(Activity activity, va.d dVar) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        i.c cVar = this.displayPosition;
        Object showDraggableView = showDraggableView(cVar, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), dVar);
        return showDraggableView == d.c() ? showDraggableView : t.f15300a;
    }

    public final Object showView(Activity activity, va.d dVar) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, dVar);
        return delayShowUntilAvailable == d.c() ? delayShowUntilAvailable : t.f15300a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i10, va.d dVar) {
        this.pageHeight = i10;
        Object g10 = mb.h.g(w0.c(), new k(this, i10, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }
}
