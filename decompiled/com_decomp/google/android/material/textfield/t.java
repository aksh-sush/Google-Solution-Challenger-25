package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.h0;
import com.google.android.material.internal.CheckableImageButton;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f7415a;

    /* renamed from: b  reason: collision with root package name */
    final s f7416b;

    /* renamed from: c  reason: collision with root package name */
    final Context f7417c;

    /* renamed from: d  reason: collision with root package name */
    final CheckableImageButton f7418d;

    t(s sVar) {
        this.f7415a = sVar.f7386e;
        this.f7416b = sVar;
        this.f7417c = sVar.getContext();
        this.f7418d = sVar.r();
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public c.b h() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
    }

    /* access modifiers changed from: package-private */
    public void o(View view, h0 h0Var) {
    }

    /* access modifiers changed from: package-private */
    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.f7416b.L(false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }
}
