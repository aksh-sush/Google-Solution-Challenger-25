package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    Context f713e;

    /* renamed from: f, reason: collision with root package name */
    LayoutInflater f714f;

    /* renamed from: g, reason: collision with root package name */
    g f715g;

    /* renamed from: h, reason: collision with root package name */
    ExpandedMenuView f716h;

    /* renamed from: i, reason: collision with root package name */
    int f717i;

    /* renamed from: j, reason: collision with root package name */
    int f718j;

    /* renamed from: k, reason: collision with root package name */
    int f719k;

    /* renamed from: l, reason: collision with root package name */
    private m.a f720l;

    /* renamed from: m, reason: collision with root package name */
    a f721m;

    private class a extends BaseAdapter {

        /* renamed from: e, reason: collision with root package name */
        private int f722e = -1;

        public a() {
            a();
        }

        void a() {
            i v10 = e.this.f715g.v();
            if (v10 != null) {
                ArrayList z10 = e.this.f715g.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((i) z10.get(i10)) == v10) {
                        this.f722e = i10;
                        return;
                    }
                }
            }
            this.f722e = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i10) {
            ArrayList z10 = e.this.f715g.z();
            int i11 = i10 + e.this.f717i;
            int i12 = this.f722e;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (i) z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f715g.z().size() - e.this.f717i;
            return this.f722e < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f714f.inflate(eVar.f719k, viewGroup, false);
            }
            ((n.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i10, int i11) {
        this.f719k = i10;
        this.f718j = i11;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f720l;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f721m == null) {
            this.f721m = new a();
        }
        return this.f721m;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f718j
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f718j
            r0.<init>(r3, r1)
            r2.f713e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f714f = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f713e
            if (r0 == 0) goto L23
            r2.f713e = r3
            android.view.LayoutInflater r0 = r2.f714f
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f715g = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f721m
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public n d(ViewGroup viewGroup) {
        if (this.f716h == null) {
            this.f716h = (ExpandedMenuView) this.f714f.inflate(f.g.f10122g, viewGroup, false);
            if (this.f721m == null) {
                this.f721m = new a();
            }
            this.f716h.setAdapter((ListAdapter) this.f721m);
            this.f716h.setOnItemClickListener(this);
        }
        return this.f716h;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f720l;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        a aVar = this.f721m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
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
        this.f720l = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f715g.M(this.f721m.getItem(i10), this, 0);
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f713e = context;
        this.f714f = LayoutInflater.from(context);
    }
}