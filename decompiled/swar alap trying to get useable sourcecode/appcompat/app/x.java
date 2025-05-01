package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.p;

/* loaded from: classes.dex */
public abstract class x extends androidx.activity.k implements e {

    /* renamed from: h, reason: collision with root package name */
    private g f536h;

    /* renamed from: i, reason: collision with root package name */
    private final p.a f537i;

    public x(Context context, int i10) {
        super(context, g(context, i10));
        this.f537i = new p.a() { // from class: androidx.appcompat.app.w
            @Override // androidx.core.view.p.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return x.this.h(keyEvent);
            }
        };
        g f10 = f();
        f10.N(g(context, i10));
        f10.y(null);
    }

    private static int g(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f10038w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().e(view, layoutParams);
    }

    @Override // androidx.appcompat.app.e
    public void b(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void d(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.p.e(this.f537i, getWindow().getDecorView(), this, keyEvent);
    }

    public g f() {
        if (this.f536h == null) {
            this.f536h = g.i(this, this);
        }
        return this.f536h;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return f().j(i10);
    }

    boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean i(int i10) {
        return f().H(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().u();
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b k(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        f().t();
        super.onCreate(bundle);
        f().y(bundle);
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStop() {
        super.onStop();
        f().E();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        f().I(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        f().O(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().O(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().K(view, layoutParams);
    }
}