package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.h0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import o4.e;
import o4.g;

class p extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final a f7096d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final j.m f7097e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7098f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f7099e;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7099e = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f7099e.getAdapter().p(i10)) {
                p.this.f7097e.a(this.f7099e.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.e0 {

        /* renamed from: y  reason: collision with root package name */
        final TextView f7101y;

        /* renamed from: z  reason: collision with root package name */
        final MaterialCalendarGridView f7102z;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.month_title);
            this.f7101y = textView;
            h0.t0(textView, true);
            this.f7102z = (MaterialCalendarGridView) linearLayout.findViewById(e.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    p(Context context, d dVar, a aVar, h hVar, j.m mVar) {
        n l10 = aVar.l();
        n g10 = aVar.g();
        n k10 = aVar.k();
        if (l10.compareTo(k10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (k10.compareTo(g10) <= 0) {
            this.f7098f = (o.f7090i * j.w(context)) + (l.H(context) ? j.w(context) : 0);
            this.f7096d = aVar;
            this.f7097e = mVar;
            A(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public n D(int i10) {
        return this.f7096d.l().p(i10);
    }

    /* access modifiers changed from: package-private */
    public CharSequence E(int i10) {
        return D(i10).n();
    }

    /* access modifiers changed from: package-private */
    public int F(n nVar) {
        return this.f7096d.l().q(nVar);
    }

    /* renamed from: G */
    public void r(b bVar, int i10) {
        n p10 = this.f7096d.l().p(i10);
        bVar.f7101y.setText(p10.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7102z.findViewById(e.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !p10.equals(materialCalendarGridView.getAdapter().f7092e)) {
            o oVar = new o(p10, (d) null, this.f7096d, (h) null);
            materialCalendarGridView.setNumColumns(p10.f7086h);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: H */
    public b t(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(g.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.H(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f7098f));
        return new b(linearLayout, true);
    }

    public int e() {
        return this.f7096d.j();
    }

    public long f(int i10) {
        return this.f7096d.l().p(i10).o();
    }
}
