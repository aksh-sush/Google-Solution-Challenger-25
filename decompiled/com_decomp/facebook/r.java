package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.d;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import c2.f;
import db.l;
import e2.x;
import p1.e0;

public abstract class r extends Button {

    /* renamed from: e  reason: collision with root package name */
    private final String f4947e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4948f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnClickListener f4949g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnClickListener f4950h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4951i;

    /* renamed from: j  reason: collision with root package name */
    private int f4952j;

    /* renamed from: k  reason: collision with root package name */
    private int f4953k;

    /* renamed from: l  reason: collision with root package name */
    private x f4954l;

    /* renamed from: m  reason: collision with root package name */
    private final int f4955m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected r(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        l.e(str, "analyticsButtonCreatedEventName");
        l.e(str2, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        c(context, attributeSet, i10, i11 == 0 ? f.com_facebook_button : i11);
        this.f4947e = str;
        this.f4948f = str2;
        setClickable(true);
        setFocusable(true);
    }

    private final void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        int c10;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i10, i11);
            l.d(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    }
                    c10 = obtainStyledAttributes.getColor(0, 0);
                } else {
                    c10 = a.c(context, c2.a.com_facebook_blue);
                }
                setBackgroundColor(c10);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void h(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i10, i11);
        l.d(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            obtainStyledAttributes.recycle();
            setCompoundDrawablePadding(dimensionPixelSize);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void i(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i10, i11);
        l.d(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
        try {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    private final void j(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i10, i11);
        l.d(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i10, i11);
            l.d(obtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
            try {
                int i12 = obtainStyledAttributes2.getInt(0, 17);
                obtainStyledAttributes2.recycle();
                setGravity(i12);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i10, i11);
                l.d(obtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                try {
                    setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.create(getTypeface(), 1));
                    String string = obtainStyledAttributes3.getString(2);
                    obtainStyledAttributes3.recycle();
                    setText(string);
                } catch (Throwable th) {
                    obtainStyledAttributes3.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                obtainStyledAttributes2.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    private final void k() {
        super.setOnClickListener(new q(this));
    }

    /* access modifiers changed from: private */
    public static final void l(r rVar, View view) {
        l.e(rVar, "this$0");
        rVar.e(rVar.getContext());
        View.OnClickListener onClickListener = rVar.f4950h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        View.OnClickListener onClickListener2 = rVar.f4949g;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view) {
        View.OnClickListener onClickListener = this.f4949g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        l.e(context, "context");
        g(context, attributeSet, i10, i11);
        h(context, attributeSet, i10, i11);
        i(context, attributeSet, i10, i11);
        j(context, attributeSet, i10, i11);
        k();
    }

    /* access modifiers changed from: protected */
    public void d(Context context) {
        e0.f14353b.a(context, (String) null).f(this.f4947e);
    }

    /* access modifiers changed from: protected */
    public void e(Context context) {
        e0.f14353b.a(context, (String) null).f(this.f4948f);
    }

    /* access modifiers changed from: protected */
    public int f(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.v r0 = new com.facebook.v
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.r.getActivity():android.app.Activity");
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonCreatedEventName() {
        return this.f4947e;
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonTappedEventName() {
        return this.f4948f;
    }

    public final d getAndroidxActivityResultRegistryOwner() {
        Activity activity = getActivity();
        if (activity instanceof d) {
            return (d) activity;
        }
        return null;
    }

    public int getCompoundPaddingLeft() {
        return this.f4951i ? this.f4952j : super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return this.f4951i ? this.f4953k : super.getCompoundPaddingRight();
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return this.f4955m;
    }

    public final Fragment getFragment() {
        x xVar = this.f4954l;
        if (xVar == null) {
            return null;
        }
        return xVar.c();
    }

    public final android.app.Fragment getNativeFragment() {
        x xVar = this.f4954l;
        if (xVar == null) {
            return null;
        }
        return xVar.b();
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            d(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f4952j = compoundPaddingLeft - min;
            this.f4953k = compoundPaddingRight + min;
            this.f4951i = true;
        }
        super.onDraw(canvas);
        this.f4951i = false;
    }

    public final void setFragment(android.app.Fragment fragment) {
        l.e(fragment, "fragment");
        this.f4954l = new x(fragment);
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        this.f4950h = onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4949g = onClickListener;
    }

    public final void setFragment(Fragment fragment) {
        l.e(fragment, "fragment");
        this.f4954l = new x(fragment);
    }
}
