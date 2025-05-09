package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.h0;
import java.util.Calendar;
import o4.e;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: e  reason: collision with root package name */
    private final Calendar f6995e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6996f;

    class a extends androidx.core.view.a {
        a() {
        }

        public void g(View view, h0 h0Var) {
            super.g(view, h0Var);
            h0Var.d0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        int b10;
        if (i10 == 33) {
            b10 = getAdapter().k();
        } else if (i10 == 130) {
            b10 = getAdapter().b();
        } else {
            super.onFocusChanged(true, i10, rect);
            return;
        }
        setSelection(b10);
    }

    /* renamed from: b */
    public o getAdapter() {
        return (o) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o b10 = getAdapter();
        b10.getClass();
        int max = Math.max(b10.b(), getFirstVisiblePosition());
        int min = Math.min(b10.k(), getLastVisiblePosition());
        b10.getItem(max);
        b10.getItem(min);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i10, int i11) {
        if (this.f6996f) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            i10 = getAdapter().b();
        }
        super.setSelection(i10);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6995e = z.k();
        if (l.H(getContext())) {
            setNextFocusLeftId(e.f13903a);
            setNextFocusRightId(e.confirm_button);
        }
        this.f6996f = l.J(getContext());
        androidx.core.view.h0.s0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof o) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()}));
        }
    }
}
