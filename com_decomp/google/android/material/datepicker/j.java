package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.h0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

public final class j<S> extends r {

    /* renamed from: q  reason: collision with root package name */
    static final Object f7033q = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: r  reason: collision with root package name */
    static final Object f7034r = "NAVIGATION_PREV_TAG";

    /* renamed from: s  reason: collision with root package name */
    static final Object f7035s = "NAVIGATION_NEXT_TAG";

    /* renamed from: t  reason: collision with root package name */
    static final Object f7036t = "SELECTOR_TOGGLE_TAG";

    /* renamed from: f  reason: collision with root package name */
    private int f7037f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f7038g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n f7039h;

    /* renamed from: i  reason: collision with root package name */
    private l f7040i;

    /* renamed from: j  reason: collision with root package name */
    private c f7041j;

    /* renamed from: k  reason: collision with root package name */
    private RecyclerView f7042k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public RecyclerView f7043l;

    /* renamed from: m  reason: collision with root package name */
    private View f7044m;

    /* renamed from: n  reason: collision with root package name */
    private View f7045n;

    /* renamed from: o  reason: collision with root package name */
    private View f7046o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public View f7047p;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7048e;

        a(p pVar) {
            this.f7048e = pVar;
        }

        public void onClick(View view) {
            int g22 = j.this.y().g2() - 1;
            if (g22 >= 0) {
                j.this.B(this.f7048e.D(g22));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7050e;

        b(int i10) {
            this.f7050e = i10;
        }

        public void run() {
            j.this.f7043l.y1(this.f7050e);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        public void g(View view, h0 h0Var) {
            super.g(view, h0Var);
            h0Var.d0((Object) null);
        }
    }

    class d extends s {
        final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        /* access modifiers changed from: protected */
        public void S1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = j.this.f7043l.getWidth();
                iArr[1] = j.this.f7043l.getWidth();
                return;
            }
            iArr[0] = j.this.f7043l.getHeight();
            iArr[1] = j.this.f7043l.getHeight();
        }
    }

    class e implements m {
        e() {
        }

        public void a(long j10) {
            if (j.this.f7038g.f().h(j10)) {
                d unused = j.this.getClass();
                throw null;
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        public void g(View view, h0 h0Var) {
            super.g(view, h0Var);
            h0Var.t0(false);
        }
    }

    class g extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f7055a = z.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f7056b = z.k();

        g() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                a0 a0Var2 = (a0) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                d unused = j.this.getClass();
                throw null;
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        public void g(View view, h0 h0Var) {
            j jVar;
            int i10;
            super.g(view, h0Var);
            if (j.this.f7047p.getVisibility() == 0) {
                jVar = j.this;
                i10 = o4.h.mtrl_picker_toggle_to_year_selection;
            } else {
                jVar = j.this;
                i10 = o4.h.mtrl_picker_toggle_to_day_selection;
            }
            h0Var.l0(jVar.getString(i10));
        }
    }

    class i extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f7060b;

        i(p pVar, MaterialButton materialButton) {
            this.f7059a = pVar;
            this.f7060b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f7060b.getText());
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager y10 = j.this.y();
            int e22 = i10 < 0 ? y10.e2() : y10.g2();
            n unused = j.this.f7039h = this.f7059a.D(e22);
            this.f7060b.setText(this.f7059a.E(e22));
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$j  reason: collision with other inner class name */
    class C0095j implements View.OnClickListener {
        C0095j() {
        }

        public void onClick(View view) {
            j.this.E();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7063e;

        k(p pVar) {
            this.f7063e = pVar;
        }

        public void onClick(View view) {
            int e22 = j.this.y().e2() + 1;
            if (e22 < j.this.f7043l.getAdapter().e()) {
                j.this.B(this.f7063e.D(e22));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    private void A(int i10) {
        this.f7043l.post(new b(i10));
    }

    private void D() {
        androidx.core.view.h0.s0(this.f7043l, new f());
    }

    private void q(View view, p pVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(o4.e.month_navigation_fragment_toggle);
        materialButton.setTag(f7036t);
        androidx.core.view.h0.s0(materialButton, new h());
        View findViewById = view.findViewById(o4.e.month_navigation_previous);
        this.f7044m = findViewById;
        findViewById.setTag(f7034r);
        View findViewById2 = view.findViewById(o4.e.month_navigation_next);
        this.f7045n = findViewById2;
        findViewById2.setTag(f7035s);
        this.f7046o = view.findViewById(o4.e.mtrl_calendar_year_selector_frame);
        this.f7047p = view.findViewById(o4.e.mtrl_calendar_day_selector_frame);
        C(l.DAY);
        materialButton.setText(this.f7039h.n());
        this.f7043l.m(new i(pVar, materialButton));
        materialButton.setOnClickListener(new C0095j());
        this.f7045n.setOnClickListener(new k(pVar));
        this.f7044m.setOnClickListener(new a(pVar));
    }

    private RecyclerView.o r() {
        return new g();
    }

    static int w(Context context) {
        return context.getResources().getDimensionPixelSize(o4.c.mtrl_calendar_day_height);
    }

    private static int x(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(o4.c.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(o4.c.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(o4.c.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(o4.c.mtrl_calendar_days_of_week_height);
        int i10 = o.f7090i;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(o4.c.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(o4.c.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(o4.c.mtrl_calendar_bottom_padding);
    }

    public static j z(d dVar, int i10, a aVar, h hVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", hVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        jVar.setArguments(bundle);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public void B(n nVar) {
        RecyclerView recyclerView;
        int i10;
        p pVar = (p) this.f7043l.getAdapter();
        int F = pVar.F(nVar);
        int F2 = F - pVar.F(this.f7039h);
        boolean z10 = true;
        boolean z11 = Math.abs(F2) > 3;
        if (F2 <= 0) {
            z10 = false;
        }
        this.f7039h = nVar;
        if (!z11 || !z10) {
            if (z11) {
                recyclerView = this.f7043l;
                i10 = F + 3;
            }
            A(F);
        }
        recyclerView = this.f7043l;
        i10 = F - 3;
        recyclerView.p1(i10);
        A(F);
    }

    /* access modifiers changed from: package-private */
    public void C(l lVar) {
        this.f7040i = lVar;
        if (lVar == l.YEAR) {
            this.f7042k.getLayoutManager().D1(((a0) this.f7042k.getAdapter()).C(this.f7039h.f7085g));
            this.f7046o.setVisibility(0);
            this.f7047p.setVisibility(8);
            this.f7044m.setVisibility(8);
            this.f7045n.setVisibility(8);
        } else if (lVar == l.DAY) {
            this.f7046o.setVisibility(8);
            this.f7047p.setVisibility(0);
            this.f7044m.setVisibility(0);
            this.f7045n.setVisibility(0);
            B(this.f7039h);
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        l lVar = this.f7040i;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            C(l.DAY);
        } else if (lVar == l.DAY) {
            C(lVar2);
        }
    }

    public boolean j(q qVar) {
        return super.j(qVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7037f = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7038g = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7039h = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        i iVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f7037f);
        this.f7041j = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n l10 = this.f7038g.l();
        if (l.H(contextThemeWrapper)) {
            i11 = o4.g.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = o4.g.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(x(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(o4.e.mtrl_calendar_days_of_week);
        androidx.core.view.h0.s0(gridView, new c());
        int i12 = this.f7038g.i();
        if (i12 <= 0) {
            iVar = new i();
        }
        gridView.setAdapter(iVar);
        gridView.setNumColumns(l10.f7086h);
        gridView.setEnabled(false);
        this.f7043l = (RecyclerView) inflate.findViewById(o4.e.mtrl_calendar_months);
        this.f7043l.setLayoutManager(new d(getContext(), i10, false, i10));
        this.f7043l.setTag(f7033q);
        p pVar = new p(contextThemeWrapper, (d) null, this.f7038g, (h) null, new e());
        this.f7043l.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(o4.f.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(o4.e.mtrl_calendar_year_selector_frame);
        this.f7042k = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7042k.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7042k.setAdapter(new a0(this));
            this.f7042k.j(r());
        }
        if (inflate.findViewById(o4.e.month_navigation_fragment_toggle) != null) {
            q(inflate, pVar);
        }
        if (!l.H(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f7043l);
        }
        this.f7043l.p1(pVar.F(this.f7039h));
        D();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7037f);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7038g);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7039h);
    }

    /* access modifiers changed from: package-private */
    public a s() {
        return this.f7038g;
    }

    /* access modifiers changed from: package-private */
    public c t() {
        return this.f7041j;
    }

    /* access modifiers changed from: package-private */
    public n u() {
        return this.f7039h;
    }

    public d v() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager y() {
        return (LinearLayoutManager) this.f7043l.getLayoutManager();
    }
}
