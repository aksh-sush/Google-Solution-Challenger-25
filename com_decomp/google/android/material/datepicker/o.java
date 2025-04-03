package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

class o extends BaseAdapter {

    /* renamed from: i  reason: collision with root package name */
    static final int f7090i = z.k().getMaximum(4);

    /* renamed from: j  reason: collision with root package name */
    private static final int f7091j = ((z.k().getMaximum(5) + z.k().getMaximum(7)) - 1);

    /* renamed from: e  reason: collision with root package name */
    final n f7092e;

    /* renamed from: f  reason: collision with root package name */
    private Collection f7093f;

    /* renamed from: g  reason: collision with root package name */
    c f7094g;

    /* renamed from: h  reason: collision with root package name */
    final a f7095h;

    o(n nVar, d dVar, a aVar, h hVar) {
        this.f7092e = nVar;
        this.f7095h = aVar;
        this.f7093f = dVar.A();
    }

    private String c(Context context, long j10) {
        return f.a(context, j10, j(j10), i(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f7094g == null) {
            this.f7094g = new c(context);
        }
    }

    private boolean h(long j10) {
        throw null;
    }

    private boolean j(long j10) {
        return z.i().getTimeInMillis() == j10;
    }

    private void m(TextView textView, long j10, int i10) {
        b bVar;
        if (textView != null) {
            textView.setContentDescription(c(textView.getContext(), j10));
            if (this.f7095h.f().h(j10)) {
                textView.setEnabled(true);
                boolean h10 = h(j10);
                textView.setSelected(h10);
                bVar = h10 ? this.f7094g.f7021b : j(j10) ? this.f7094g.f7022c : this.f7094g.f7020a;
            } else {
                textView.setEnabled(false);
                bVar = this.f7094g.f7026g;
            }
            bVar.b(textView);
        }
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (n.d(j10).equals(this.f7092e)) {
            int m10 = this.f7092e.m(j10);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(m10) - materialCalendarGridView.getFirstVisiblePosition()), j10, m10);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f7092e.i(this.f7095h.i());
    }

    /* renamed from: d */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > k()) {
            return null;
        }
        return Long.valueOf(this.f7092e.l(l(i10)));
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = o4.g.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0054
            com.google.android.material.datepicker.n r8 = r5.f7092e
            int r2 = r8.f7087i
            if (r7 < r2) goto L_0x002d
            goto L_0x0054
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x005d
        L_0x0054:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L_0x005d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0064
            return r0
        L_0x0064:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean g(long j10) {
        throw null;
    }

    public int getCount() {
        return f7091j;
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.f7092e.f7086h);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(long j10) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return (b() + this.f7092e.f7087i) - 1;
    }

    /* access modifiers changed from: package-private */
    public int l(int i10) {
        return (i10 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f7093f) {
            n(materialCalendarGridView, longValue.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public boolean p(int i10) {
        return i10 >= b() && i10 <= k();
    }
}
