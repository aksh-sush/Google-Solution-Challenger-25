package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f1225a;

    /* renamed from: b, reason: collision with root package name */
    private final i0.a f1226b;

    l(EditText editText) {
        this.f1225a = editText;
        this.f1226b = new i0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1226b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1225a.getContext().obtainStyledAttributes(attributeSet, f.j.f10188g0, i10, 0);
        try {
            int i11 = f.j.f10258u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1226b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f1226b.c(z10);
    }
}