package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.o;
import com.google.common.collect.t;
import java.util.LinkedHashMap;
import java.util.Map;

final class l0 extends h0 {

    /* renamed from: k  reason: collision with root package name */
    static final t f7609k = new l0(n.u(), s.r(), s.r());

    /* renamed from: g  reason: collision with root package name */
    private final o f7610g;

    /* renamed from: h  reason: collision with root package name */
    private final o f7611h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f7612i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f7613j;

    l0(n nVar, s sVar, s sVar2) {
        o d10 = z.d(sVar);
        LinkedHashMap e10 = z.e();
        p0 j10 = sVar.j();
        while (j10.hasNext()) {
            e10.put(j10.next(), new LinkedHashMap());
        }
        LinkedHashMap e11 = z.e();
        p0 j11 = sVar2.j();
        while (j11.hasNext()) {
            e11.put(j11.next(), new LinkedHashMap());
        }
        int[] iArr = new int[nVar.size()];
        int[] iArr2 = new int[nVar.size()];
        for (int i10 = 0; i10 < nVar.size(); i10++) {
            m0.a aVar = (m0.a) nVar.get(i10);
            Object b10 = aVar.b();
            Object a10 = aVar.a();
            Object value = aVar.getValue();
            iArr[i10] = ((Integer) d10.get(b10)).intValue();
            Map map = (Map) e10.get(b10);
            iArr2[i10] = map.size();
            A(b10, a10, map.put(a10, value), value);
            ((Map) e11.get(a10)).put(b10, value);
        }
        this.f7612i = iArr;
        this.f7613j = iArr2;
        o.b bVar = new o.b(e10.size());
        for (Map.Entry entry : e10.entrySet()) {
            bVar.c(entry.getKey(), o.b((Map) entry.getValue()));
        }
        this.f7610g = bVar.a();
        o.b bVar2 = new o.b(e11.size());
        for (Map.Entry entry2 : e11.entrySet()) {
            bVar2.c(entry2.getKey(), o.b((Map) entry2.getValue()));
        }
        this.f7611h = bVar2.a();
    }

    /* access modifiers changed from: package-private */
    public m0.a G(int i10) {
        Map.Entry entry = (Map.Entry) this.f7610g.entrySet().b().get(this.f7612i[i10]);
        Map.Entry entry2 = (Map.Entry) ((o) entry.getValue()).entrySet().b().get(this.f7613j[i10]);
        return t.q(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* access modifiers changed from: package-private */
    public Object H(int i10) {
        int i11 = this.f7612i[i10];
        return ((o) this.f7610g.values().b().get(i11)).values().b().get(this.f7613j[i10]);
    }

    public int size() {
        return this.f7612i.length;
    }

    public o t() {
        return o.b(this.f7611h);
    }

    /* access modifiers changed from: package-private */
    public t.b u() {
        o d10 = z.d(b());
        int[] iArr = new int[a().size()];
        p0 j10 = a().j();
        int i10 = 0;
        while (j10.hasNext()) {
            iArr[i10] = ((Integer) d10.get(((m0.a) j10.next()).a())).intValue();
            i10++;
        }
        return t.b.a(this, this.f7612i, iArr);
    }

    /* renamed from: y */
    public o c() {
        return o.b(this.f7610g);
    }
}
