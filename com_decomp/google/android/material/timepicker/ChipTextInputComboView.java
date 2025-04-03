package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.h0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.r;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import o4.e;
import o4.g;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Chip f7467e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout f7468f;

    /* renamed from: g  reason: collision with root package name */
    private final EditText f7469g;

    /* renamed from: h  reason: collision with root package name */
    private TextWatcher f7470h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7471i;

    private class b extends r {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f7467e.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String a10 = ChipTextInputComboView.this.c(editable);
            Chip b10 = ChipTextInputComboView.this.f7467e;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.this.c("00");
            }
            b10.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return f.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7469g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f7467e.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setChecked(boolean z10) {
        this.f7467e.setChecked(z10);
        this.f7469g.setVisibility(z10 ? 0 : 4);
        this.f7467e.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            v.k(this.f7469g, false);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7467e.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.f7467e.setTag(i10, obj);
    }

    public void toggle() {
        this.f7467e.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(g.material_time_chip, this, false);
        this.f7467e = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(g.material_time_input, this, false);
        this.f7468f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f7469g = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f7470h = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f7471i = (TextView) findViewById(e.material_label);
        editText.setId(h0.m());
        h0.E0(this.f7471i, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
