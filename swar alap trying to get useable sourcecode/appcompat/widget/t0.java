package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t0 implements androidx.appcompat.view.menu.p {
    private static Method K;
    private static Method L;
    private static Method M;
    final i A;
    private final h B;
    private final g C;
    private final e D;
    private Runnable E;
    final Handler F;
    private final Rect G;
    private Rect H;
    private boolean I;
    PopupWindow J;

    /* renamed from: e, reason: collision with root package name */
    private Context f1327e;

    /* renamed from: f, reason: collision with root package name */
    private ListAdapter f1328f;

    /* renamed from: g, reason: collision with root package name */
    p0 f1329g;

    /* renamed from: h, reason: collision with root package name */
    private int f1330h;

    /* renamed from: i, reason: collision with root package name */
    private int f1331i;

    /* renamed from: j, reason: collision with root package name */
    private int f1332j;

    /* renamed from: k, reason: collision with root package name */
    private int f1333k;

    /* renamed from: l, reason: collision with root package name */
    private int f1334l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1335m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1336n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1337o;

    /* renamed from: p, reason: collision with root package name */
    private int f1338p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1339q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1340r;

    /* renamed from: s, reason: collision with root package name */
    int f1341s;

    /* renamed from: t, reason: collision with root package name */
    private View f1342t;

    /* renamed from: u, reason: collision with root package name */
    private int f1343u;

    /* renamed from: v, reason: collision with root package name */
    private DataSetObserver f1344v;

    /* renamed from: w, reason: collision with root package name */
    private View f1345w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f1346x;

    /* renamed from: y, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1347y;

    /* renamed from: z, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1348z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t10 = t0.this.t();
            if (t10 == null || t10.getWindowToken() == null) {
                return;
            }
            t0.this.d();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            p0 p0Var;
            if (i10 == -1 || (p0Var = t0.this.f1329g) == null) {
                return;
            }
            p0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (t0.this.b()) {
                t0.this.d();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            t0.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || t0.this.A() || t0.this.J.getContentView() == null) {
                return;
            }
            t0 t0Var = t0.this;
            t0Var.F.removeCallbacks(t0Var.A);
            t0.this.A.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = t0.this.J) != null && popupWindow.isShowing() && x10 >= 0 && x10 < t0.this.J.getWidth() && y10 >= 0 && y10 < t0.this.J.getHeight()) {
                t0 t0Var = t0.this;
                t0Var.F.postDelayed(t0Var.A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            t0 t0Var2 = t0.this;
            t0Var2.F.removeCallbacks(t0Var2.A);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0 p0Var = t0.this.f1329g;
            if (p0Var == null || !androidx.core.view.h0.V(p0Var) || t0.this.f1329g.getCount() <= t0.this.f1329g.getChildCount()) {
                return;
            }
            int childCount = t0.this.f1329g.getChildCount();
            t0 t0Var = t0.this;
            if (childCount <= t0Var.f1341s) {
                t0Var.J.setInputMethodMode(2);
                t0.this.d();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public t0(Context context) {
        this(context, null, f.a.D);
    }

    private void C() {
        View view = this.f1342t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1342t);
            }
        }
    }

    private void O(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.J, z10);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.J, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.J, view, i10, z10);
        }
        Method method = L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.J, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.J.getMaxAvailableHeight(view, i10);
    }

    public boolean A() {
        return this.J.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.I;
    }

    public void D(View view) {
        this.f1345w = view;
    }

    public void E(int i10) {
        this.J.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.J.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.G);
        Rect rect = this.G;
        this.f1331i = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f1338p = i10;
    }

    public void H(Rect rect) {
        this.H = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.J.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.I = z10;
        this.J.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1347y = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1348z = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f1337o = true;
        this.f1336n = z10;
    }

    public void P(int i10) {
        this.f1343u = i10;
    }

    public void Q(int i10) {
        p0 p0Var = this.f1329g;
        if (!b() || p0Var == null) {
            return;
        }
        p0Var.setListSelectionHidden(false);
        p0Var.setSelection(i10);
        if (p0Var.getChoiceMode() != 0) {
            p0Var.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f1331i = i10;
    }

    public int a() {
        return this.f1332j;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.J.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        int q10 = q();
        boolean A = A();
        androidx.core.widget.h.b(this.J, this.f1334l);
        if (this.J.isShowing()) {
            if (androidx.core.view.h0.V(t())) {
                int i10 = this.f1331i;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = t().getWidth();
                }
                int i11 = this.f1330h;
                if (i11 == -1) {
                    if (!A) {
                        q10 = -1;
                    }
                    if (A) {
                        this.J.setWidth(this.f1331i == -1 ? -1 : 0);
                        this.J.setHeight(0);
                    } else {
                        this.J.setWidth(this.f1331i == -1 ? -1 : 0);
                        this.J.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    q10 = i11;
                }
                this.J.setOutsideTouchable((this.f1340r || this.f1339q) ? false : true);
                this.J.update(t(), this.f1332j, this.f1333k, i10 < 0 ? -1 : i10, q10 < 0 ? -1 : q10);
                return;
            }
            return;
        }
        int i12 = this.f1331i;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = t().getWidth();
        }
        int i13 = this.f1330h;
        if (i13 == -1) {
            q10 = -1;
        } else if (i13 != -2) {
            q10 = i13;
        }
        this.J.setWidth(i12);
        this.J.setHeight(q10);
        O(true);
        this.J.setOutsideTouchable((this.f1340r || this.f1339q) ? false : true);
        this.J.setTouchInterceptor(this.B);
        if (this.f1337o) {
            androidx.core.widget.h.a(this.J, this.f1336n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.J, this.H);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.J, this.H);
        }
        androidx.core.widget.h.c(this.J, t(), this.f1332j, this.f1333k, this.f1338p);
        this.f1329g.setSelection(-1);
        if (!this.I || this.f1329g.isInTouchMode()) {
            r();
        }
        if (this.I) {
            return;
        }
        this.F.post(this.D);
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.J.dismiss();
        C();
        this.J.setContentView(null);
        this.f1329g = null;
        this.F.removeCallbacks(this.A);
    }

    public Drawable f() {
        return this.J.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.f1329g;
    }

    public void i(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    public void j(int i10) {
        this.f1333k = i10;
        this.f1335m = true;
    }

    public void l(int i10) {
        this.f1332j = i10;
    }

    public int n() {
        if (this.f1335m) {
            return this.f1333k;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1344v;
        if (dataSetObserver == null) {
            this.f1344v = new f();
        } else {
            ListAdapter listAdapter2 = this.f1328f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1328f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1344v);
        }
        p0 p0Var = this.f1329g;
        if (p0Var != null) {
            p0Var.setAdapter(this.f1328f);
        }
    }

    public void r() {
        p0 p0Var = this.f1329g;
        if (p0Var != null) {
            p0Var.setListSelectionHidden(true);
            p0Var.requestLayout();
        }
    }

    p0 s(Context context, boolean z10) {
        return new p0(context, z10);
    }

    public View t() {
        return this.f1345w;
    }

    public Object v() {
        if (b()) {
            return this.f1329g.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.f1329g.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.f1329g.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.f1329g.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f1331i;
    }

    public t0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1330h = -2;
        this.f1331i = -2;
        this.f1334l = 1002;
        this.f1338p = 0;
        this.f1339q = false;
        this.f1340r = false;
        this.f1341s = a.e.API_PRIORITY_OTHER;
        this.f1343u = 0;
        this.A = new i();
        this.B = new h();
        this.C = new g();
        this.D = new e();
        this.G = new Rect();
        this.f1327e = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f10254t1, i10, i11);
        this.f1332j = obtainStyledAttributes.getDimensionPixelOffset(f.j.f10259u1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(f.j.f10264v1, 0);
        this.f1333k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1335m = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.J = rVar;
        rVar.setInputMethodMode(1);
    }
}