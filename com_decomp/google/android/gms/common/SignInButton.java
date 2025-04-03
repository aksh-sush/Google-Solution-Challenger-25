package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import b4.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.a1;
import p3.d;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    private int f5241e;

    /* renamed from: f  reason: collision with root package name */
    private int f5242f;

    /* renamed from: g  reason: collision with root package name */
    private View f5243g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnClickListener f5244h;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void b(Context context) {
        View view = this.f5243g;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f5243g = a1.c(context, this.f5241e, this.f5242f);
        } catch (c.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f5241e;
            int i11 = this.f5242f;
            a0 a0Var = new a0(context, (AttributeSet) null);
            a0Var.a(context.getResources(), i10, i11);
            this.f5243g = a0Var;
        }
        addView(this.f5243g);
        this.f5243g.setEnabled(isEnabled());
        this.f5243g.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f5241e = i10;
        this.f5242f = i11;
        b(getContext());
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f5244h;
        if (onClickListener != null && view == this.f5243g) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        a(this.f5241e, i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f5243g.setEnabled(z10);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5244h = onClickListener;
        View view = this.f5243g;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f5241e, this.f5242f);
    }

    public void setSize(int i10) {
        a(i10, this.f5242f);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5244h = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.f14442b, 0, 0);
        try {
            this.f5241e = obtainStyledAttributes.getInt(d.f14443c, 0);
            this.f5242f = obtainStyledAttributes.getInt(d.f14444d, 2);
            obtainStyledAttributes.recycle();
            a(this.f5241e, this.f5242f);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
