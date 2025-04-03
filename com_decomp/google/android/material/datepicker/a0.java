package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import o4.g;

class a0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final j f7012d;

    public static class a extends RecyclerView.e0 {

        /* renamed from: y  reason: collision with root package name */
        final TextView f7013y;

        a(TextView textView) {
            super(textView);
            this.f7013y = textView;
        }
    }

    a0(j jVar) {
        this.f7012d = jVar;
    }

    /* access modifiers changed from: package-private */
    public int C(int i10) {
        return i10 - this.f7012d.s().l().f7085g;
    }

    /* access modifiers changed from: package-private */
    public int D(int i10) {
        return this.f7012d.s().l().f7085g + i10;
    }

    /* renamed from: E */
    public void r(a aVar, int i10) {
        int D = D(i10);
        aVar.f7013y.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(D)}));
        TextView textView = aVar.f7013y;
        textView.setContentDescription(f.e(textView.getContext(), D));
        c t10 = this.f7012d.t();
        if (z.i().get(1) == D) {
            b bVar = t10.f7025f;
        } else {
            b bVar2 = t10.f7023d;
        }
        this.f7012d.v();
        throw null;
    }

    /* renamed from: F */
    public a t(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(g.mtrl_calendar_year, viewGroup, false));
    }

    public int e() {
        return this.f7012d.s().m();
    }
}
