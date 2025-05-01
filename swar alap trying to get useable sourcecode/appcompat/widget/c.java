package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.b implements b.a {
    private int A;
    private final SparseBooleanArray B;
    e C;
    a D;
    RunnableC0013c E;
    private b F;
    final f G;
    int H;

    /* renamed from: o, reason: collision with root package name */
    d f1096o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f1097p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1098q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1099r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1100s;

    /* renamed from: t, reason: collision with root package name */
    private int f1101t;

    /* renamed from: u, reason: collision with root package name */
    private int f1102u;

    /* renamed from: v, reason: collision with root package name */
    private int f1103v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1104w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1105x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1106y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1107z;

    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, f.a.f10024i);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.f1096o;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f677m : view2);
            }
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            c cVar = c.this;
            cVar.D = null;
            cVar.H = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.D;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0013c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private e f1110e;

        public RunnableC0013c(e eVar) {
            this.f1110e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f671g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f671g.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f677m;
            if (view != null && view.getWindowToken() != null && this.f1110e.m()) {
                c.this.C = this.f1110e;
            }
            c.this.E = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends r0 {

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ c f1113n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1113n = cVar;
            }

            @Override // androidx.appcompat.widget.r0
            public androidx.appcompat.view.menu.p b() {
                e eVar = c.this.C;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.r0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.r0
            public boolean d() {
                c cVar = c.this;
                if (cVar.E != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, f.a.f10023h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, f.a.f10024i);
            h(8388613);
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f671g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f671g.close();
            }
            c.this.C = null;
            super.e();
        }
    }

    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a m10 = c.this.m();
            if (m10 != null) {
                m10.a(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f671g) {
                return false;
            }
            c.this.H = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a m10 = c.this.m();
            if (m10 != null) {
                return m10.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.f10118c, f.g.f10117b);
        this.B = new SparseBooleanArray();
        this.G = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f677m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1096o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1098q) {
            return this.f1097p;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0013c runnableC0013c = this.E;
        if (runnableC0013c != null && (obj = this.f677m) != null) {
            ((View) obj).removeCallbacks(runnableC0013c);
            this.E = null;
            return true;
        }
        e eVar = this.C;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.D;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.E != null || E();
    }

    public boolean E() {
        e eVar = this.C;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1104w) {
            this.f1103v = androidx.appcompat.view.a.b(this.f670f).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f671g;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1107z = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f677m = actionMenuView;
        actionMenuView.b(this.f671g);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1096o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1098q = true;
            this.f1097p = drawable;
        }
    }

    public void J(boolean z10) {
        this.f1099r = z10;
        this.f1100s = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1099r || E() || (gVar = this.f671g) == null || this.f677m == null || this.E != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0013c runnableC0013c = new RunnableC0013c(new e(this.f670f, this.f671g, this.f1096o, true));
        this.E = runnableC0013c;
        ((View) this.f677m).post(runnableC0013c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        y();
        super.a(gVar, z10);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(Context context, androidx.appcompat.view.menu.g gVar) {
        super.c(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f1100s) {
            this.f1099r = b10.f();
        }
        if (!this.f1106y) {
            this.f1101t = b10.c();
        }
        if (!this.f1104w) {
            this.f1103v = b10.d();
        }
        int i10 = this.f1101t;
        if (this.f1099r) {
            if (this.f1096o == null) {
                d dVar = new d(this.f669e);
                this.f1096o = dVar;
                if (this.f1098q) {
                    dVar.setImageDrawable(this.f1097p);
                    this.f1097p = null;
                    this.f1098q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1096o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1096o.getMeasuredWidth();
        } else {
            this.f1096o = null;
        }
        this.f1102u = i10;
        this.A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void d(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f677m);
        if (this.F == null) {
            this.F = new b();
        }
        actionMenuItemView.setPopupCallback(this.F);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean e(androidx.appcompat.view.menu.r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f671g) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View z11 = z(rVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f670f, rVar, z11);
        this.D = aVar;
        aVar.g(z10);
        this.D.k();
        super.e(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f677m).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f671g;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList s10 = gVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = ((androidx.appcompat.view.menu.i) s10.get(i10)).b();
                if (b10 != null) {
                    b10.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f671g;
        ArrayList z12 = gVar2 != null ? gVar2.z() : null;
        if (this.f1099r && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.i) z12.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1096o;
        if (z11) {
            if (dVar == null) {
                this.f1096o = new d(this.f669e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1096o.getParent();
            if (viewGroup != this.f677m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1096o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f677m;
                actionMenuView.addView(this.f1096o, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f677m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1096o);
            }
        }
        ((ActionMenuView) this.f677m).setOverflowReserved(this.f1099r);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f671g;
        View view = null;
        int i14 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.f1103v;
        int i16 = cVar.f1102u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f677m;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayList.get(i19);
            if (iVar.o()) {
                i17++;
            } else if (iVar.n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (cVar.f1107z && iVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1099r && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.B;
        sparseBooleanArray.clear();
        if (cVar.f1105x) {
            int i21 = cVar.A;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) arrayList.get(i22);
            if (iVar2.o()) {
                View n10 = cVar.n(iVar2, view, viewGroup);
                if (cVar.f1105x) {
                    i12 -= ActionMenuView.L(n10, i11, i12, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i13 = i10;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!cVar.f1105x || i12 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View n11 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.f1105x) {
                        int L = ActionMenuView.L(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= L;
                        if (L == 0) {
                            z13 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!cVar.f1105x ? i16 + i23 <= 0 : i16 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        androidx.appcompat.view.menu.i iVar3 = (androidx.appcompat.view.menu.i) arrayList.get(i24);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i20++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i20--;
                }
                iVar2.u(z12);
            } else {
                i13 = i10;
                iVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1096o) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f677m;
        androidx.appcompat.view.menu.n o10 = super.o(viewGroup);
        if (nVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i10, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}