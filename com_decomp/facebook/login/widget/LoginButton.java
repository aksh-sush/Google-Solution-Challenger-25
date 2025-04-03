package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.a;
import com.facebook.i;
import com.facebook.i0;
import com.facebook.login.widget.j;
import com.facebook.o;
import com.facebook.r;
import com.facebook.s;
import com.facebook.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import db.l;
import db.m;
import db.w;
import e2.d;
import e2.s0;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import o2.d0;
import o2.g0;
import o2.o0;
import o2.p0;
import o2.q0;
import o2.t;
import p1.e0;
import sa.h;

public class LoginButton extends r {
    public static final a D = new a((db.g) null);
    private static final String E = LoginButton.class.getName();
    private final String A;
    private o B;
    /* access modifiers changed from: private */
    public androidx.activity.result.c C;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f4814n;

    /* renamed from: o  reason: collision with root package name */
    private String f4815o;

    /* renamed from: p  reason: collision with root package name */
    private String f4816p;

    /* renamed from: q  reason: collision with root package name */
    private final b f4817q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4818r;

    /* renamed from: s  reason: collision with root package name */
    private j.c f4819s;

    /* renamed from: t  reason: collision with root package name */
    private d f4820t;

    /* renamed from: u  reason: collision with root package name */
    private long f4821u;

    /* renamed from: v  reason: collision with root package name */
    private j f4822v;

    /* renamed from: w  reason: collision with root package name */
    private i f4823w;

    /* renamed from: x  reason: collision with root package name */
    private h f4824x;

    /* renamed from: y  reason: collision with root package name */
    private Float f4825y;

    /* renamed from: z  reason: collision with root package name */
    private int f4826z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private o2.e f4827a = o2.e.FRIENDS;

        /* renamed from: b  reason: collision with root package name */
        private List f4828b = o.e();

        /* renamed from: c  reason: collision with root package name */
        private t f4829c = t.NATIVE_WITH_FALLBACK;

        /* renamed from: d  reason: collision with root package name */
        private String f4830d = "rerequest";

        /* renamed from: e  reason: collision with root package name */
        private g0 f4831e = g0.FACEBOOK;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4832f;

        /* renamed from: g  reason: collision with root package name */
        private String f4833g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f4834h;

        public final String a() {
            return this.f4830d;
        }

        public final o2.e b() {
            return this.f4827a;
        }

        public final t c() {
            return this.f4829c;
        }

        public final g0 d() {
            return this.f4831e;
        }

        public final String e() {
            return this.f4833g;
        }

        public final List f() {
            return this.f4828b;
        }

        public final boolean g() {
            return this.f4834h;
        }

        public final boolean h() {
            return this.f4832f;
        }

        public final void i(String str) {
            l.e(str, "<set-?>");
            this.f4830d = str;
        }

        public final void j(o2.e eVar) {
            l.e(eVar, "<set-?>");
            this.f4827a = eVar;
        }

        public final void k(t tVar) {
            l.e(tVar, "<set-?>");
            this.f4829c = tVar;
        }

        public final void l(g0 g0Var) {
            l.e(g0Var, "<set-?>");
            this.f4831e = g0Var;
        }

        public final void m(String str) {
            this.f4833g = str;
        }

        public final void n(List list) {
            l.e(list, "<set-?>");
            this.f4828b = list;
        }

        public final void o(boolean z10) {
            this.f4834h = z10;
        }
    }

    protected class c implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LoginButton f4835e;

        public c(LoginButton loginButton) {
            l.e(loginButton, "this$0");
            this.f4835e = loginButton;
        }

        /* access modifiers changed from: private */
        public static final void g(d0 d0Var, DialogInterface dialogInterface, int i10) {
            l.e(d0Var, "$loginManager");
            d0Var.s();
        }

        /* access modifiers changed from: protected */
        public d0 b() {
            d0 c10 = d0.f13657j.c();
            c10.A(this.f4835e.getDefaultAudience());
            c10.D(this.f4835e.getLoginBehavior());
            c10.E(c());
            c10.z(this.f4835e.getAuthType());
            c10.C(d());
            c10.H(this.f4835e.getShouldSkipAccountDeduplication());
            c10.F(this.f4835e.getMessengerPageId());
            c10.G(this.f4835e.getResetMessengerState());
            return c10;
        }

        /* access modifiers changed from: protected */
        public final g0 c() {
            return g0.FACEBOOK;
        }

        /* access modifiers changed from: protected */
        public final boolean d() {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void e() {
            d0 b10 = b();
            androidx.activity.result.c r10 = this.f4835e.C;
            if (r10 != null) {
                d0.c cVar = (d0.c) r10.a();
                o callbackManager = this.f4835e.getCallbackManager();
                if (callbackManager == null) {
                    callbackManager = new e2.d();
                }
                cVar.f(callbackManager);
                r10.b(this.f4835e.getProperties().f());
            } else if (this.f4835e.getFragment() != null) {
                Fragment fragment = this.f4835e.getFragment();
                if (fragment != null) {
                    LoginButton loginButton = this.f4835e;
                    b10.q(fragment, loginButton.getProperties().f(), loginButton.getLoggerID());
                }
            } else if (this.f4835e.getNativeFragment() != null) {
                android.app.Fragment nativeFragment = this.f4835e.getNativeFragment();
                if (nativeFragment != null) {
                    LoginButton loginButton2 = this.f4835e;
                    b10.p(nativeFragment, loginButton2.getProperties().f(), loginButton2.getLoggerID());
                }
            } else {
                b10.o(this.f4835e.getActivity(), this.f4835e.getProperties().f(), this.f4835e.getLoggerID());
            }
        }

        /* access modifiers changed from: protected */
        public final void f(Context context) {
            String str;
            String str2;
            l.e(context, "context");
            d0 b10 = b();
            if (this.f4835e.f4814n) {
                String string = this.f4835e.getResources().getString(o0.com_facebook_loginview_log_out_action);
                l.d(string, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                String string2 = this.f4835e.getResources().getString(o0.com_facebook_loginview_cancel_action);
                l.d(string2, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                v0 b11 = v0.f4988l.b();
                if ((b11 == null ? null : b11.b()) != null) {
                    w wVar = w.f9429a;
                    String string3 = this.f4835e.getResources().getString(o0.com_facebook_loginview_logged_in_as);
                    l.d(string3, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                    str2 = String.format(string3, Arrays.copyOf(new Object[]{b11.b()}, 1));
                    str = "java.lang.String.format(format, *args)";
                } else {
                    str2 = this.f4835e.getResources().getString(o0.com_facebook_loginview_logged_in_using_facebook);
                    str = "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }";
                }
                l.d(str2, str);
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(str2).setCancelable(true).setPositiveButton(string, new f(b10)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return;
            }
            b10.s();
        }

        public void onClick(View view) {
            l.e(view, "v");
            this.f4835e.b(view);
            a.c cVar = com.facebook.a.f4683p;
            com.facebook.a e10 = cVar.e();
            boolean g10 = cVar.g();
            if (g10) {
                Context context = this.f4835e.getContext();
                l.d(context, "context");
                f(context);
            } else {
                e();
            }
            e0 e0Var = new e0(this.f4835e.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", e10 != null ? 0 : 1);
            bundle.putInt("access_token_expired", g10 ? 1 : 0);
            e0Var.g("fb_login_view_usage", bundle);
        }
    }

    public enum d {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        

        /* renamed from: g  reason: collision with root package name */
        public static final a f4836g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public static final d f4837h = null;

        /* renamed from: e  reason: collision with root package name */
        private final String f4842e;

        /* renamed from: f  reason: collision with root package name */
        private final int f4843f;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(db.g gVar) {
                this();
            }

            public final d a(int i10) {
                for (d dVar : d.values()) {
                    if (dVar.d() == i10) {
                        return dVar;
                    }
                }
                return null;
            }

            public final d b() {
                return d.f4837h;
            }
        }

        static {
            d dVar;
            f4836g = new a((db.g) null);
            f4837h = dVar;
        }

        private d(String str, int i10) {
            this.f4842e = str;
            this.f4843f = i10;
        }

        public final int d() {
            return this.f4843f;
        }

        public String toString() {
            return this.f4842e;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4844a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[d.NEVER_DISPLAY.ordinal()] = 3;
            f4844a = iArr;
        }
    }

    public static final class f extends i {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LoginButton f4845f;

        f(LoginButton loginButton) {
            this.f4845f = loginButton;
        }

        /* access modifiers changed from: protected */
        public void d(com.facebook.a aVar, com.facebook.a aVar2) {
            this.f4845f.F();
            this.f4845f.D();
        }
    }

    static final class g extends m implements cb.a {

        /* renamed from: e  reason: collision with root package name */
        public static final g f4846e = new g();

        g() {
            super(0);
        }

        /* renamed from: a */
        public final d0 invoke() {
            return d0.f13657j.c();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        l.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void A(o.a aVar) {
    }

    private final void H(e2.r rVar) {
        if (rVar != null && rVar.h() && getVisibility() == 0) {
            x(rVar.g());
        }
    }

    private final void t() {
        int i10 = e.f4844a[this.f4820t.ordinal()];
        if (i10 == 1) {
            s0 s0Var = s0.f9663a;
            i0.t().execute(new d(s0.J(getContext()), this));
        } else if (i10 == 2) {
            String string = getResources().getString(o0.com_facebook_tooltip_default);
            l.d(string, "resources.getString(R.string.com_facebook_tooltip_default)");
            x(string);
        }
    }

    /* access modifiers changed from: private */
    public static final void u(String str, LoginButton loginButton) {
        l.e(str, "$appId");
        l.e(loginButton, "this$0");
        loginButton.getActivity().runOnUiThread(new e(loginButton, e2.w.o(str, false)));
    }

    /* access modifiers changed from: private */
    public static final void v(LoginButton loginButton, e2.r rVar) {
        l.e(loginButton, "this$0");
        loginButton.H(rVar);
    }

    private final void x(String str) {
        j jVar = new j(str, this);
        jVar.h(this.f4819s);
        jVar.g(this.f4821u);
        jVar.i();
        this.f4822v = jVar;
    }

    private final int z(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(str) + getCompoundPaddingRight();
    }

    /* access modifiers changed from: protected */
    public final void B(Context context, AttributeSet attributeSet, int i10, int i11) {
        l.e(context, "context");
        d.a aVar = d.f4836g;
        this.f4820t = aVar.b();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, q0.W, i10, i11);
        l.d(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
        try {
            this.f4814n = obtainStyledAttributes.getBoolean(q0.X, true);
            setLoginText(obtainStyledAttributes.getString(q0.f13745a0));
            setLogoutText(obtainStyledAttributes.getString(q0.f13747b0));
            d a10 = aVar.a(obtainStyledAttributes.getInt(q0.f13749c0, aVar.b().d()));
            if (a10 == null) {
                a10 = aVar.b();
            }
            this.f4820t = a10;
            int i12 = q0.Y;
            if (obtainStyledAttributes.hasValue(i12)) {
                this.f4825y = Float.valueOf(obtainStyledAttributes.getDimension(i12, 0.0f));
            }
            int integer = obtainStyledAttributes.getInteger(q0.Z, 255);
            this.f4826z = integer;
            int max = Math.max(0, integer);
            this.f4826z = max;
            this.f4826z = Math.min(255, max);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void C(o oVar, s sVar) {
        l.e(oVar, "callbackManager");
        l.e(sVar, "callback");
        ((d0) this.f4824x.getValue()).w(oVar, sVar);
        o oVar2 = this.B;
        if (oVar2 == null) {
            this.B = oVar;
        } else if (oVar2 != oVar) {
            Log.w(E, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    /* access modifiers changed from: protected */
    public final void D() {
        setCompoundDrawablesWithIntrinsicBounds(g.a.b(getContext(), c2.b.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public final void E() {
        StateListDrawable stateListDrawable;
        int a10;
        Float f10 = this.f4825y;
        if (f10 != null) {
            float floatValue = f10.floatValue();
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable) && (a10 = stateListDrawable.getStateCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Drawable a11 = (stateListDrawable = (StateListDrawable) background).getStateDrawable(i10);
                    GradientDrawable gradientDrawable = a11 instanceof GradientDrawable ? (GradientDrawable) a11 : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(floatValue);
                    }
                    if (i11 >= a10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(floatValue);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void F() {
        String str;
        Resources resources = getResources();
        if (isInEditMode() || !com.facebook.a.f4683p.g()) {
            str = this.f4815o;
            if (str == null) {
                str = resources.getString(getLoginButtonContinueLabel());
                l.d(str, "resources.getString(loginButtonContinueLabel)");
                int width = getWidth();
                if (width != 0 && z(str) > width) {
                    str = resources.getString(o0.com_facebook_loginview_log_in_button);
                    l.d(str, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
                }
            }
        } else {
            str = this.f4816p;
            if (str == null) {
                str = resources.getString(o0.com_facebook_loginview_log_out_button);
            }
        }
        setText(str);
    }

    /* access modifiers changed from: protected */
    public final void G() {
        getBackground().setAlpha(this.f4826z);
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        l.e(context, "context");
        super.c(context, attributeSet, i10, i11);
        setInternalOnClickListener(getNewLoginClickListener());
        B(context, attributeSet, i10, i11);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(c2.a.com_facebook_blue));
            setLoginText("Continue with Facebook");
        } else {
            this.f4823w = new f(this);
        }
        F();
        E();
        G();
        D();
    }

    public final String getAuthType() {
        return this.f4817q.a();
    }

    public final o getCallbackManager() {
        return this.B;
    }

    public final o2.e getDefaultAudience() {
        return this.f4817q.b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return d.c.Login.c();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return p0.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.A;
    }

    public final t getLoginBehavior() {
        return this.f4817q.c();
    }

    /* access modifiers changed from: protected */
    public final int getLoginButtonContinueLabel() {
        return o0.com_facebook_loginview_log_in_button_continue;
    }

    /* access modifiers changed from: protected */
    public final h getLoginManagerLazy() {
        return this.f4824x;
    }

    public final g0 getLoginTargetApp() {
        return this.f4817q.d();
    }

    public final String getLoginText() {
        return this.f4815o;
    }

    public final String getLogoutText() {
        return this.f4816p;
    }

    public final String getMessengerPageId() {
        return this.f4817q.e();
    }

    /* access modifiers changed from: protected */
    public c getNewLoginClickListener() {
        return new c(this);
    }

    public final List<String> getPermissions() {
        return this.f4817q.f();
    }

    /* access modifiers changed from: protected */
    public final b getProperties() {
        return this.f4817q;
    }

    public final boolean getResetMessengerState() {
        return this.f4817q.g();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.f4817q.h();
    }

    public final long getToolTipDisplayTime() {
        return this.f4821u;
    }

    public final d getToolTipMode() {
        return this.f4820t;
    }

    public final j.c getToolTipStyle() {
        return this.f4819s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getContext() instanceof androidx.activity.result.d) {
            Context context = getContext();
            if (context != null) {
                this.C = ((androidx.activity.result.d) context).getActivityResultRegistry().j("facebook-login", ((d0) this.f4824x.getValue()).i(this.B, this.A), new c());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
        }
        i iVar = this.f4823w;
        if (iVar != null && iVar.c()) {
            iVar.e();
            F();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.activity.result.c cVar = this.C;
        if (cVar != null) {
            cVar.d();
        }
        i iVar = this.f4823w;
        if (iVar != null) {
            iVar.f();
        }
        w();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.f4818r && !isInEditMode()) {
            this.f4818r = true;
            t();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        F();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        int y10 = y(i10);
        String str = this.f4816p;
        if (str == null) {
            str = resources.getString(o0.com_facebook_loginview_log_out_button);
            l.d(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
        }
        setMeasuredDimension(View.resolveSize(Math.max(y10, z(str)), i10), compoundPaddingTop);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        l.e(view, "changedView");
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            w();
        }
    }

    public final void setAuthType(String str) {
        l.e(str, FirebaseAnalytics.Param.VALUE);
        this.f4817q.i(str);
    }

    public final void setDefaultAudience(o2.e eVar) {
        l.e(eVar, FirebaseAnalytics.Param.VALUE);
        this.f4817q.j(eVar);
    }

    public final void setLoginBehavior(t tVar) {
        l.e(tVar, FirebaseAnalytics.Param.VALUE);
        this.f4817q.k(tVar);
    }

    /* access modifiers changed from: protected */
    public final void setLoginManagerLazy(h hVar) {
        l.e(hVar, "<set-?>");
        this.f4824x = hVar;
    }

    public final void setLoginTargetApp(g0 g0Var) {
        l.e(g0Var, FirebaseAnalytics.Param.VALUE);
        this.f4817q.l(g0Var);
    }

    public final void setLoginText(String str) {
        this.f4815o = str;
        F();
    }

    public final void setLogoutText(String str) {
        this.f4816p = str;
        F();
    }

    public final void setMessengerPageId(String str) {
        this.f4817q.m(str);
    }

    public final void setPermissions(List<String> list) {
        l.e(list, FirebaseAnalytics.Param.VALUE);
        this.f4817q.n(list);
    }

    public final void setPublishPermissions(List<String> list) {
        l.e(list, "permissions");
        this.f4817q.n(list);
    }

    public final void setReadPermissions(List<String> list) {
        l.e(list, "permissions");
        this.f4817q.n(list);
    }

    public final void setResetMessengerState(boolean z10) {
        this.f4817q.o(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.f4821u = j10;
    }

    public final void setToolTipMode(d dVar) {
        l.e(dVar, "<set-?>");
        this.f4820t = dVar;
    }

    public final void setToolTipStyle(j.c cVar) {
        l.e(cVar, "<set-?>");
        this.f4819s = cVar;
    }

    public final void w() {
        j jVar = this.f4822v;
        if (jVar != null) {
            jVar.d();
        }
        this.f4822v = null;
    }

    /* access modifiers changed from: protected */
    public final int y(int i10) {
        Resources resources = getResources();
        String str = this.f4815o;
        if (str == null) {
            str = resources.getString(o0.com_facebook_loginview_log_in_button_continue);
            int z10 = z(str);
            if (View.resolveSize(z10, i10) < z10) {
                str = resources.getString(o0.com_facebook_loginview_log_in_button);
            }
        }
        return z(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected LoginButton(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, i10, i11, str, str2);
        l.e(context, "context");
        l.e(str, "analyticsButtonCreatedEventName");
        l.e(str2, "analyticsButtonTappedEventName");
        this.f4817q = new b();
        this.f4819s = j.c.BLUE;
        this.f4820t = d.f4836g.b();
        this.f4821u = 6000;
        this.f4824x = j.a(g.f4846e);
        this.f4826z = 255;
        String uuid = UUID.randomUUID().toString();
        l.d(uuid, "randomUUID().toString()");
        this.A = uuid;
    }

    public final void setPermissions(String... strArr) {
        l.e(strArr, "permissions");
        this.f4817q.n(o.h(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setPublishPermissions(String... strArr) {
        l.e(strArr, "permissions");
        this.f4817q.n(o.h(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setReadPermissions(String... strArr) {
        l.e(strArr, "permissions");
        this.f4817q.n(o.h(Arrays.copyOf(strArr, strArr.length)));
    }
}
