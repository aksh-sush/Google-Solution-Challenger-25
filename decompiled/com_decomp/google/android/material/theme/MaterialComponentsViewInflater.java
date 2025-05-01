package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import c5.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.w;
import t4.b;

public class MaterialComponentsViewInflater extends y {
    /* access modifiers changed from: protected */
    public d c(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public c0 o(Context context, AttributeSet attributeSet) {
        return new i5.a(context, attributeSet);
    }
}
