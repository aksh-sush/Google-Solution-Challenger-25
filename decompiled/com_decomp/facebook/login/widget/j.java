package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import db.g;
import db.l;
import java.lang.ref.WeakReference;
import o2.l0;
import o2.m0;
import o2.n0;

public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f4855i = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f4856a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f4857b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4858c;

    /* renamed from: d  reason: collision with root package name */
    private b f4859d;

    /* renamed from: e  reason: collision with root package name */
    private PopupWindow f4860e;

    /* renamed from: f  reason: collision with root package name */
    private c f4861f = c.BLUE;

    /* renamed from: g  reason: collision with root package name */
    private long f4862g = 6000;

    /* renamed from: h  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f4863h = new g(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final class b extends FrameLayout {

        /* renamed from: e  reason: collision with root package name */
        private final ImageView f4864e;

        /* renamed from: f  reason: collision with root package name */
        private final ImageView f4865f;

        /* renamed from: g  reason: collision with root package name */
        private final View f4866g;

        /* renamed from: h  reason: collision with root package name */
        private final ImageView f4867h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f4868i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, Context context) {
            super(context);
            l.e(jVar, "this$0");
            l.e(context, "context");
            this.f4868i = jVar;
            LayoutInflater.from(context).inflate(n0.com_facebook_tooltip_bubble, this);
            View findViewById = findViewById(m0.com_facebook_tooltip_bubble_view_top_pointer);
            if (findViewById != null) {
                this.f4864e = (ImageView) findViewById;
                View findViewById2 = findViewById(m0.com_facebook_tooltip_bubble_view_bottom_pointer);
                if (findViewById2 != null) {
                    this.f4865f = (ImageView) findViewById2;
                    View findViewById3 = findViewById(m0.com_facebook_body_frame);
                    l.d(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
                    this.f4866g = findViewById3;
                    View findViewById4 = findViewById(m0.com_facebook_button_xout);
                    if (findViewById4 != null) {
                        this.f4867h = (ImageView) findViewById4;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }

        public final View a() {
            return this.f4866g;
        }

        public final ImageView b() {
            return this.f4865f;
        }

        public final ImageView c() {
            return this.f4864e;
        }

        public final ImageView d() {
            return this.f4867h;
        }

        public final void e() {
            this.f4864e.setVisibility(4);
            this.f4865f.setVisibility(0);
        }

        public final void f() {
            this.f4864e.setVisibility(0);
            this.f4865f.setVisibility(4);
        }
    }

    public enum c {
        BLUE,
        BLACK
    }

    public j(String str, View view) {
        l.e(str, "text");
        l.e(view, "anchor");
        this.f4856a = str;
        this.f4857b = new WeakReference(view);
        Context context = view.getContext();
        l.d(context, "anchor.context");
        this.f4858c = context;
    }

    private final void e() {
        ViewTreeObserver viewTreeObserver;
        l();
        View view = (View) this.f4857b.get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this.f4863h);
        }
    }

    /* access modifiers changed from: private */
    public static final void f(j jVar) {
        PopupWindow popupWindow;
        l.e(jVar, "this$0");
        if (jVar.f4857b.get() != null && (popupWindow = jVar.f4860e) != null && popupWindow.isShowing()) {
            boolean isAboveAnchor = popupWindow.isAboveAnchor();
            b bVar = jVar.f4859d;
            if (isAboveAnchor) {
                if (bVar != null) {
                    bVar.e();
                }
            } else if (bVar != null) {
                bVar.f();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j(j jVar) {
        l.e(jVar, "this$0");
        jVar.d();
    }

    /* access modifiers changed from: private */
    public static final void k(j jVar, View view) {
        l.e(jVar, "this$0");
        jVar.d();
    }

    private final void l() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f4857b.get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this.f4863h);
        }
    }

    private final void m() {
        PopupWindow popupWindow = this.f4860e;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        if (popupWindow.isAboveAnchor()) {
            b bVar = this.f4859d;
            if (bVar != null) {
                bVar.e();
                return;
            }
            return;
        }
        b bVar2 = this.f4859d;
        if (bVar2 != null) {
            bVar2.f();
        }
    }

    public final void d() {
        l();
        PopupWindow popupWindow = this.f4860e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void g(long j10) {
        this.f4862g = j10;
    }

    public final void h(c cVar) {
        l.e(cVar, "style");
        this.f4861f = cVar;
    }

    public final void i() {
        int i10;
        ImageView imageView;
        if (this.f4857b.get() != null) {
            b bVar = new b(this, this.f4858c);
            this.f4859d = bVar;
            View findViewById = bVar.findViewById(m0.com_facebook_tooltip_bubble_view_text_body);
            if (findViewById != null) {
                ((TextView) findViewById).setText(this.f4856a);
                if (this.f4861f == c.BLUE) {
                    bVar.a().setBackgroundResource(l0.com_facebook_tooltip_blue_background);
                    bVar.b().setImageResource(l0.com_facebook_tooltip_blue_bottomnub);
                    bVar.c().setImageResource(l0.com_facebook_tooltip_blue_topnub);
                    imageView = bVar.d();
                    i10 = l0.com_facebook_tooltip_blue_xout;
                } else {
                    bVar.a().setBackgroundResource(l0.com_facebook_tooltip_black_background);
                    bVar.b().setImageResource(l0.com_facebook_tooltip_black_bottomnub);
                    bVar.c().setImageResource(l0.com_facebook_tooltip_black_topnub);
                    imageView = bVar.d();
                    i10 = l0.com_facebook_tooltip_black_xout;
                }
                imageView.setImageResource(i10);
                View decorView = ((Activity) this.f4858c).getWindow().getDecorView();
                l.d(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                e();
                bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                this.f4860e = popupWindow;
                popupWindow.showAsDropDown((View) this.f4857b.get());
                m();
                if (this.f4862g > 0) {
                    bVar.postDelayed(new h(this), this.f4862g);
                }
                popupWindow.setTouchable(true);
                bVar.setOnClickListener(new i(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }
}
