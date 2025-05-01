package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.o;
import androidx.core.view.accessibility.h0;

public class CheckableImageButton extends o implements Checkable {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f7113k = {16842912};

    /* renamed from: h  reason: collision with root package name */
    private boolean f7114h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7115i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7116j;

    class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, h0 h0Var) {
            super.g(view, h0Var);
            h0Var.Z(CheckableImageButton.this.a());
            h0Var.a0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends d0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f7118g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f7118g = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7118g ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.B);
    }

    public boolean a() {
        return this.f7115i;
    }

    public boolean isChecked() {
        return this.f7114h;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f7114h) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f7113k;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f7118g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7118g = this.f7114h;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f7115i != z10) {
            this.f7115i = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f7115i && this.f7114h != z10) {
            this.f7114h = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f7116j = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f7116j) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f7114h);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7115i = true;
        this.f7116j = true;
        androidx.core.view.h0.s0(this, new a());
    }
}
