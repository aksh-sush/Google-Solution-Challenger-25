package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: e, reason: collision with root package name */
    protected Context f669e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f670f;

    /* renamed from: g, reason: collision with root package name */
    protected g f671g;

    /* renamed from: h, reason: collision with root package name */
    protected LayoutInflater f672h;

    /* renamed from: i, reason: collision with root package name */
    protected LayoutInflater f673i;

    /* renamed from: j, reason: collision with root package name */
    private m.a f674j;

    /* renamed from: k, reason: collision with root package name */
    private int f675k;

    /* renamed from: l, reason: collision with root package name */
    private int f676l;

    /* renamed from: m, reason: collision with root package name */
    protected n f677m;

    /* renamed from: n, reason: collision with root package name */
    private int f678n;

    public b(Context context, int i10, int i11) {
        this.f669e = context;
        this.f672h = LayoutInflater.from(context);
        this.f675k = i10;
        this.f676l = i11;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f674j;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    protected void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f677m).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(Context context, g gVar) {
        this.f670f = context;
        this.f673i = LayoutInflater.from(context);
        this.f671g = gVar;
    }

    public abstract void d(i iVar, n.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        m.a aVar = this.f674j;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f671g;
        }
        return aVar.b(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f677m;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f671g;
        int i10 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList E = this.f671g.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i iVar = (i) E.get(i12);
                if (q(i11, iVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View n10 = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        b(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    public n.a g(ViewGroup viewGroup) {
        return (n.a) this.f672h.inflate(this.f676l, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.f674j = aVar;
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a m() {
        return this.f674j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a g10 = view instanceof n.a ? (n.a) view : g(viewGroup);
        d(iVar, g10);
        return (View) g10;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f677m == null) {
            n nVar = (n) this.f672h.inflate(this.f675k, viewGroup, false);
            this.f677m = nVar;
            nVar.b(this.f671g);
            f(true);
        }
        return this.f677m;
    }

    public void p(int i10) {
        this.f678n = i10;
    }

    public abstract boolean q(int i10, i iVar);
}