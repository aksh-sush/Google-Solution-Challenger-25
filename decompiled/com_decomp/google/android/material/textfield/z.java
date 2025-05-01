package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import o4.d;
import o4.h;

class z extends t {

    /* renamed from: e  reason: collision with root package name */
    private int f7464e = d.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    private EditText f7465f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f7466g = new y(this);

    z(s sVar, int i10) {
        super(sVar);
        if (i10 != 0) {
            this.f7464e = i10;
        }
    }

    private boolean w() {
        EditText editText = this.f7465f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        PasswordTransformationMethod passwordTransformationMethod;
        EditText editText;
        EditText editText2 = this.f7465f;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            if (w()) {
                editText = this.f7465f;
                passwordTransformationMethod = null;
            } else {
                editText = this.f7465f;
                passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(passwordTransformationMethod);
            if (selectionEnd >= 0) {
                this.f7465f.setSelection(selectionEnd);
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f7464e;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f7466g;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return !w();
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
        this.f7465f = editText;
        r();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (x(this.f7465f)) {
            this.f7465f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f7465f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
