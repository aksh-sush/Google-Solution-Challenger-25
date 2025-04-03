package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.h0;
import java.lang.ref.WeakReference;
import java.util.List;
import o4.j;

public abstract class AppBarLayout extends LinearLayout {

    protected static class BaseBehavior<T extends AppBarLayout> extends a {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f6695k;

        /* renamed from: l  reason: collision with root package name */
        private int f6696l;

        /* renamed from: m  reason: collision with root package name */
        private a f6697m;

        /* renamed from: n  reason: collision with root package name */
        private WeakReference f6698n;

        protected static class a extends d0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0091a();

            /* renamed from: g  reason: collision with root package name */
            boolean f6699g;

            /* renamed from: h  reason: collision with root package name */
            boolean f6700h;

            /* renamed from: i  reason: collision with root package name */
            int f6701i;

            /* renamed from: j  reason: collision with root package name */
            float f6702j;

            /* renamed from: k  reason: collision with root package name */
            boolean f6703k;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            class C0091a implements Parcelable.ClassLoaderCreator {
                C0091a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                /* renamed from: c */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f6699g = parcel.readByte() != 0;
                this.f6700h = parcel.readByte() != 0;
                this.f6701i = parcel.readInt();
                this.f6702j = parcel.readFloat();
                this.f6703k = parcel.readByte() == 0 ? false : z10;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f6699g ? (byte) 1 : 0);
                parcel.writeByte(this.f6700h ? (byte) 1 : 0);
                parcel.writeInt(this.f6701i);
                parcel.writeFloat(this.f6702j);
                parcel.writeByte(this.f6703k ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        private void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            h0.m0(coordinatorLayout, h0.a.f2410q.b());
            androidx.core.view.h0.m0(coordinatorLayout, h0.a.f2411r.b());
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            b.a(view);
            return b0(coordinatorLayout, (AppBarLayout) null, view2, view3, i10, i11);
        }

        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            b.a(view);
            c0(coordinatorLayout, (AppBarLayout) null, view2, i10);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ boolean G(View view) {
            b.a(view);
            return R((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int J(View view) {
            b.a(view);
            return S((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int K(View view) {
            b.a(view);
            return T((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public int L() {
            return E() + this.f6695k;
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            b.a(view);
            U(coordinatorLayout, (AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            b.a(view);
            return f0(coordinatorLayout, (AppBarLayout) null, i10, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public boolean R(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f6698n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        public int S(AppBarLayout appBarLayout) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public int T(AppBarLayout appBarLayout) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            g0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            super.l(coordinatorLayout, appBarLayout, i10);
            throw null;
        }

        public boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            throw null;
        }

        public void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            throw null;
        }

        public void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                throw null;
            } else if (i13 == 0) {
                h0(coordinatorLayout, appBarLayout);
            }
        }

        public void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof a) {
                d0((a) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f6697m.a());
                return;
            }
            super.x(coordinatorLayout, appBarLayout, parcelable);
            this.f6697m = null;
        }

        public Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y10 = super.y(coordinatorLayout, appBarLayout);
            a e02 = e0(y10, appBarLayout);
            return e02 == null ? y10 : e02;
        }

        public boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            if ((i10 & 2) == 0) {
                this.f6698n = null;
                this.f6696l = i11;
                return false;
            }
            throw null;
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f6696l == 0 || i10 == 1) {
                g0(coordinatorLayout, appBarLayout);
                throw null;
            } else {
                this.f6698n = new WeakReference(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d0(a aVar, boolean z10) {
            if (this.f6697m == null || z10) {
                this.f6697m = aVar;
            }
        }

        /* access modifiers changed from: package-private */
        public a e0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        /* access modifiers changed from: package-private */
        public int f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int L = L();
            if (i11 == 0 || L < i11 || L > i12) {
                this.f6695k = 0;
            } else if (L != z.a.b(i10, i11, i12)) {
                throw null;
            }
            h0(coordinatorLayout, appBarLayout);
            return 0;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return V(coordinatorLayout, (AppBarLayout) null, i10);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            b.a(view);
            return W(coordinatorLayout, (AppBarLayout) null, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            b.a(view);
            X(coordinatorLayout, (AppBarLayout) null, view2, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            b.a(view);
            Y(coordinatorLayout, (AppBarLayout) null, view2, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            b.a(view);
            Z(coordinatorLayout, (AppBarLayout) null, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            b.a(view);
            return a0(coordinatorLayout, (AppBarLayout) null);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        public /* bridge */ /* synthetic */ boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.V(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.W(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.X(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.Y(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.Z(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.a0(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.b0(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.c0(coordinatorLayout, appBarLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f13952f4);
            M(obtainStyledAttributes.getDimensionPixelSize(j.f13960g4, 0));
            obtainStyledAttributes.recycle();
        }

        private void P(View view, View view2) {
            CoordinatorLayout.b e10 = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (e10 instanceof BaseBehavior) {
                androidx.core.view.h0.d0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e10).f6695k) + K()) - H(view2));
            }
        }

        private void Q(View view, View view2) {
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        /* access modifiers changed from: package-private */
        public float I(View view) {
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int J(View view) {
            return super.J(view);
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout O(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            O(coordinatorLayout.q(view));
            return false;
        }
    }
}
