package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList H;
    private final ArrayList I;
    private final int[] J;
    final androidx.core.view.u K;
    private ArrayList L;
    h M;
    private final ActionMenuView.e N;
    private j1 O;
    private androidx.appcompat.widget.c P;
    private f Q;
    private m.a R;
    g.a S;
    private boolean T;
    private OnBackInvokedCallback U;
    private OnBackInvokedDispatcher V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private final Runnable f998a0;

    /* renamed from: e, reason: collision with root package name */
    ActionMenuView f999e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f1000f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f1001g;

    /* renamed from: h, reason: collision with root package name */
    private ImageButton f1002h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f1003i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f1004j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1005k;

    /* renamed from: l, reason: collision with root package name */
    ImageButton f1006l;

    /* renamed from: m, reason: collision with root package name */
    View f1007m;

    /* renamed from: n, reason: collision with root package name */
    private Context f1008n;

    /* renamed from: o, reason: collision with root package name */
    private int f1009o;

    /* renamed from: p, reason: collision with root package name */
    private int f1010p;

    /* renamed from: q, reason: collision with root package name */
    private int f1011q;

    /* renamed from: r, reason: collision with root package name */
    int f1012r;

    /* renamed from: s, reason: collision with root package name */
    private int f1013s;

    /* renamed from: t, reason: collision with root package name */
    private int f1014t;

    /* renamed from: u, reason: collision with root package name */
    private int f1015u;

    /* renamed from: v, reason: collision with root package name */
    private int f1016v;

    /* renamed from: w, reason: collision with root package name */
    private int f1017w;

    /* renamed from: x, reason: collision with root package name */
    private y0 f1018x;

    /* renamed from: y, reason: collision with root package name */
    private int f1019y;

    /* renamed from: z, reason: collision with root package name */
    private int f1020z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.K.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.M;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.S;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f999e.J()) {
                Toolbar.this.K.k(gVar);
            }
            g.a aVar = Toolbar.this.S;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.i1
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.m {

        /* renamed from: e, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1025e;

        /* renamed from: f, reason: collision with root package name */
        androidx.appcompat.view.menu.i f1026f;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1025e;
            if (gVar2 != null && (iVar = this.f1026f) != null) {
                gVar2.f(iVar);
            }
            this.f1025e = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void f(boolean z10) {
            if (this.f1026f != null) {
                androidx.appcompat.view.menu.g gVar = this.f1025e;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1025e.getItem(i10) == this.f1026f) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                i(this.f1025e, this.f1026f);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f1007m;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1007m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1006l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1007m = null;
            toolbar3.a();
            this.f1026f = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1006l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1006l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1006l);
            }
            Toolbar.this.f1007m = iVar.getActionView();
            this.f1026f = iVar;
            ViewParent parent2 = Toolbar.this.f1007m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1007m);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f352a = (toolbar4.f1012r & 112) | 8388611;
                generateDefaultLayoutParams.f1028b = 2;
                toolbar4.f1007m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1007m);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1007m;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.R();
            return true;
        }
    }

    public static class g extends a.C0008a {

        /* renamed from: b, reason: collision with root package name */
        int f1028b;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1028b = 0;
            this.f352a = 8388627;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1028b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1028b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1028b = 0;
            a(marginLayoutParams);
        }

        public g(a.C0008a c0008a) {
            super(c0008a);
            this.f1028b = 0;
        }

        public g(g gVar) {
            super((a.C0008a) gVar);
            this.f1028b = 0;
            this.f1028b = gVar.f1028b;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends d0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        int f1029g;

        /* renamed from: h, reason: collision with root package name */
        boolean f1030h;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1029g = parcel.readInt();
            this.f1030h = parcel.readInt() != 0;
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1029g);
            parcel.writeInt(this.f1030h ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.N);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.K.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f998a0);
        post(this.f998a0);
    }

    private boolean O() {
        if (!this.T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = androidx.core.view.h0.E(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.o.b(i10, androidx.core.view.h0.E(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1028b == 0 && P(childAt) && p(gVar.f352a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1028b == 0 && P(childAt2) && p(gVar2.f352a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f1028b = 1;
        if (!z10 || this.f1007m == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.I.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f1018x == null) {
            this.f1018x = new y0();
        }
    }

    private void i() {
        if (this.f1003i == null) {
            this.f1003i = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f999e.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f999e.getMenu();
            if (this.Q == null) {
                this.Q = new f();
            }
            this.f999e.setExpandedActionViewsExclusive(true);
            gVar.c(this.Q, this.f1008n);
            R();
        }
    }

    private void k() {
        if (this.f999e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f999e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1009o);
            this.f999e.setOnMenuItemClickListener(this.N);
            this.f999e.O(this.R, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f352a = (this.f1012r & 112) | 8388613;
            this.f999e.setLayoutParams(generateDefaultLayoutParams);
            c(this.f999e, false);
        }
    }

    private void l() {
        if (this.f1002h == null) {
            this.f1002h = new o(getContext(), null, f.a.M);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f352a = (this.f1012r & 112) | 8388611;
            this.f1002h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int E = androidx.core.view.h0.E(this);
        int b10 = androidx.core.view.o.b(i10, E) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : E == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f352a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.A & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r.b(marginLayoutParams) + androidx.core.view.r.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f999e;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f999e;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1028b != 2 && childAt != this.f999e) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1018x.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f999e == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g N = this.f999e.N();
        if (N == gVar) {
            return;
        }
        if (N != null) {
            N.O(this.P);
            N.O(this.Q);
        }
        if (this.Q == null) {
            this.Q = new f();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f1008n);
            gVar.c(this.Q, this.f1008n);
        } else {
            cVar.c(this.f1008n, null);
            this.Q.c(this.f1008n, null);
            cVar.f(true);
            this.Q.f(true);
        }
        this.f999e.setPopupTheme(this.f1009o);
        this.f999e.setPresenter(cVar);
        this.P = cVar;
        R();
    }

    public void L(m.a aVar, g.a aVar2) {
        this.R = aVar;
        this.S = aVar2;
        ActionMenuView actionMenuView = this.f999e;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1011q = i10;
        TextView textView = this.f1001g;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1010p = i10;
        TextView textView = this.f1000f;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f999e;
        return actionMenuView != null && actionMenuView.P();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && androidx.core.view.h0.V(this) && this.W;
            if (z10 && this.V == null) {
                if (this.U == null) {
                    this.U = e.b(new Runnable() { // from class: androidx.appcompat.widget.h1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.U);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.V) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.U);
                a10 = null;
            }
            this.V = a10;
        }
    }

    void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView((View) this.I.get(size));
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f999e) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.Q;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f1026f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f999e;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1006l == null) {
            o oVar = new o(getContext(), null, f.a.M);
            this.f1006l = oVar;
            oVar.setImageDrawable(this.f1004j);
            this.f1006l.setContentDescription(this.f1005k);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f352a = (this.f1012r & 112) | 8388611;
            generateDefaultLayoutParams.f1028b = 2;
            this.f1006l.setLayoutParams(generateDefaultLayoutParams);
            this.f1006l.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1006l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1006l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        y0 y0Var = this.f1018x;
        if (y0Var != null) {
            return y0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1020z;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        y0 y0Var = this.f1018x;
        if (y0Var != null) {
            return y0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        y0 y0Var = this.f1018x;
        if (y0Var != null) {
            return y0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        y0 y0Var = this.f1018x;
        if (y0Var != null) {
            return y0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1019y;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g N;
        ActionMenuView actionMenuView = this.f999e;
        return actionMenuView != null && (N = actionMenuView.N()) != null && N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1020z, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.h0.E(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.h0.E(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1019y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1003i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1003i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f999e.getMenu();
    }

    View getNavButtonView() {
        return this.f1002h;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1002h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1002h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f999e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1008n;
    }

    public int getPopupTheme() {
        return this.f1009o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    final TextView getSubtitleTextView() {
        return this.f1001g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.f1017w;
    }

    public int getTitleMarginEnd() {
        return this.f1015u;
    }

    public int getTitleMarginStart() {
        return this.f1014t;
    }

    public int getTitleMarginTop() {
        return this.f1016v;
    }

    final TextView getTitleTextView() {
        return this.f1000f;
    }

    public j0 getWrapper() {
        if (this.O == null) {
            this.O = new j1(this, true);
        }
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0008a ? new g((a.C0008a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f998a0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295 A[LOOP:0: B:46:0x0293->B:47:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7 A[LOOP:1: B:50:0x02b5->B:51:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0 A[LOOP:2: B:59:0x02ee->B:60:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.J;
        boolean b10 = q1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f1002h)) {
            F(this.f1002h, i10, 0, i11, 0, this.f1013s);
            i12 = this.f1002h.getMeasuredWidth() + s(this.f1002h);
            i13 = Math.max(0, this.f1002h.getMeasuredHeight() + t(this.f1002h));
            i14 = View.combineMeasuredStates(0, this.f1002h.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f1006l)) {
            F(this.f1006l, i10, 0, i11, 0, this.f1013s);
            i12 = this.f1006l.getMeasuredWidth() + s(this.f1006l);
            i13 = Math.max(i13, this.f1006l.getMeasuredHeight() + t(this.f1006l));
            i14 = View.combineMeasuredStates(i14, this.f1006l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f999e)) {
            F(this.f999e, i10, max, i11, 0, this.f1013s);
            i15 = this.f999e.getMeasuredWidth() + s(this.f999e);
            i13 = Math.max(i13, this.f999e.getMeasuredHeight() + t(this.f999e));
            i14 = View.combineMeasuredStates(i14, this.f999e.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1007m)) {
            max2 += E(this.f1007m, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1007m.getMeasuredHeight() + t(this.f1007m));
            i14 = View.combineMeasuredStates(i14, this.f1007m.getMeasuredState());
        }
        if (P(this.f1003i)) {
            max2 += E(this.f1003i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1003i.getMeasuredHeight() + t(this.f1003i));
            i14 = View.combineMeasuredStates(i14, this.f1003i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f1028b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1016v + this.f1017w;
        int i22 = this.f1014t + this.f1015u;
        if (P(this.f1000f)) {
            E(this.f1000f, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1000f.getMeasuredWidth() + s(this.f1000f);
            i18 = this.f1000f.getMeasuredHeight() + t(this.f1000f);
            i16 = View.combineMeasuredStates(i14, this.f1000f.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (P(this.f1001g)) {
            i17 = Math.max(i17, E(this.f1001g, i10, max2 + i22, i11, i18 + i21, iArr));
            i18 += this.f1001g.getMeasuredHeight() + t(this.f1001g);
            i16 = View.combineMeasuredStates(i16, this.f1001g.getMeasuredState());
        }
        int max3 = Math.max(i13, i18);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i16), O() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i16 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f999e;
        androidx.appcompat.view.menu.g N = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f1029g;
        if (i10 != 0 && this.Q != null && N != null && (findItem = N.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f1030h) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1018x.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.Q;
        if (fVar != null && (iVar = fVar.f1026f) != null) {
            iVar2.f1029g = iVar.getItemId();
        }
        iVar2.f1030h = B();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.T = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1020z) {
            this.f1020z = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1019y) {
            this.f1019y = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1002h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.M = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f999e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1009o != i10) {
            this.f1009o = i10;
            if (i10 == 0) {
                this.f1008n = getContext();
            } else {
                this.f1008n = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1017w = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1015u = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1014t = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1016v = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.Q;
        return (fVar == null || fVar.f1026f == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f999e;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = 8388627;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new int[2];
        this.K = new androidx.core.view.u(new Runnable() { // from class: androidx.appcompat.widget.g1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.L = new ArrayList();
        this.N = new a();
        this.f998a0 = new b();
        Context context2 = getContext();
        int[] iArr = f.j.f10226n3;
        f1 v10 = f1.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.h0.q0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1010p = v10.n(f.j.P3, 0);
        this.f1011q = v10.n(f.j.G3, 0);
        this.A = v10.l(f.j.f10231o3, this.A);
        this.f1012r = v10.l(f.j.f10236p3, 48);
        int e10 = v10.e(f.j.J3, 0);
        int i11 = f.j.O3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.f1017w = e10;
        this.f1016v = e10;
        this.f1015u = e10;
        this.f1014t = e10;
        int e11 = v10.e(f.j.M3, -1);
        if (e11 >= 0) {
            this.f1014t = e11;
        }
        int e12 = v10.e(f.j.L3, -1);
        if (e12 >= 0) {
            this.f1015u = e12;
        }
        int e13 = v10.e(f.j.N3, -1);
        if (e13 >= 0) {
            this.f1016v = e13;
        }
        int e14 = v10.e(f.j.K3, -1);
        if (e14 >= 0) {
            this.f1017w = e14;
        }
        this.f1013s = v10.f(f.j.A3, -1);
        int e15 = v10.e(f.j.f10271w3, Integer.MIN_VALUE);
        int e16 = v10.e(f.j.f10251s3, Integer.MIN_VALUE);
        int f10 = v10.f(f.j.f10261u3, 0);
        int f11 = v10.f(f.j.f10266v3, 0);
        h();
        this.f1018x.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f1018x.g(e15, e16);
        }
        this.f1019y = v10.e(f.j.f10276x3, Integer.MIN_VALUE);
        this.f1020z = v10.e(f.j.f10256t3, Integer.MIN_VALUE);
        this.f1004j = v10.g(f.j.f10246r3);
        this.f1005k = v10.p(f.j.f10241q3);
        CharSequence p10 = v10.p(f.j.I3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(f.j.F3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1008n = getContext();
        setPopupTheme(v10.n(f.j.E3, 0));
        Drawable g10 = v10.g(f.j.D3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(f.j.C3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(f.j.f10281y3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(f.j.f10286z3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = f.j.Q3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = f.j.H3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = f.j.B3;
        if (v10.s(i14)) {
            x(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1006l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1006l.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1006l;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1004j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1003i)) {
                c(this.f1003i, true);
            }
        } else {
            ImageView imageView = this.f1003i;
            if (imageView != null && z(imageView)) {
                removeView(this.f1003i);
                this.I.remove(this.f1003i);
            }
        }
        ImageView imageView2 = this.f1003i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1003i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1002h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            k1.a(this.f1002h, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1002h)) {
                c(this.f1002h, true);
            }
        } else {
            ImageButton imageButton = this.f1002h;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1002h);
                this.I.remove(this.f1002h);
            }
        }
        ImageButton imageButton2 = this.f1002h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1001g;
            if (textView != null && z(textView)) {
                removeView(this.f1001g);
                this.I.remove(this.f1001g);
            }
        } else {
            if (this.f1001g == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1001g = c0Var;
                c0Var.setSingleLine();
                this.f1001g.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1011q;
                if (i10 != 0) {
                    this.f1001g.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f1001g.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1001g)) {
                c(this.f1001g, true);
            }
        }
        TextView textView2 = this.f1001g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f1001g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1000f;
            if (textView != null && z(textView)) {
                removeView(this.f1000f);
                this.I.remove(this.f1000f);
            }
        } else {
            if (this.f1000f == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1000f = c0Var;
                c0Var.setSingleLine();
                this.f1000f.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1010p;
                if (i10 != 0) {
                    this.f1000f.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f1000f.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1000f)) {
                c(this.f1000f, true);
            }
        }
        TextView textView2 = this.f1000f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f1000f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}