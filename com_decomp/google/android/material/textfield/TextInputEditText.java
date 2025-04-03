package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.k;
import com.google.android.material.internal.e;
import com.google.android.material.internal.s;
import o4.a;
import o4.i;
import o4.j;

public class TextInputEditText extends k {

    /* renamed from: k  reason: collision with root package name */
    private final Rect f7279k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7280l;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f13902l);
    }

    private String e(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z10 = !TextUtils.isEmpty(text);
        String str = "";
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : str;
        if (!z10) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb2.append(str);
        return sb2.toString();
    }

    private boolean f(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f7280l;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (f(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f7279k);
            rect.bottom = this.f7279k.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.R()) ? super.getHint() : textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && e.b()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(e(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f7279k.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f7279k);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f7280l = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(j5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f7279k = new Rect();
        TypedArray i11 = s.i(context, attributeSet, j.f14001l5, i10, i.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(i11.getBoolean(j.f14009m5, false));
        i11.recycle();
    }
}
