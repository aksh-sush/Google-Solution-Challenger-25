package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import h4.z;
import java.util.ArrayList;
import java.util.List;

final class v8 {

    /* renamed from: a  reason: collision with root package name */
    zzfy f6507a;

    /* renamed from: b  reason: collision with root package name */
    List f6508b;

    /* renamed from: c  reason: collision with root package name */
    List f6509c;

    /* renamed from: d  reason: collision with root package name */
    long f6510d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w8 f6511e;

    /* synthetic */ v8(w8 w8Var, z zVar) {
        this.f6511e = w8Var;
    }

    private static final long b(zzfo zzfo) {
        return ((zzfo.zzd() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, zzfo zzfo) {
        s.k(zzfo);
        if (this.f6509c == null) {
            this.f6509c = new ArrayList();
        }
        if (this.f6508b == null) {
            this.f6508b = new ArrayList();
        }
        if (this.f6509c.size() > 0 && b((zzfo) this.f6509c.get(0)) != b(zzfo)) {
            return false;
        }
        long zzbt = this.f6510d + ((long) zzfo.zzbt());
        this.f6511e.T();
        if (zzbt >= ((long) Math.max(0, ((Integer) y2.f6630j.a((Object) null)).intValue()))) {
            return false;
        }
        this.f6510d = zzbt;
        this.f6509c.add(zzfo);
        this.f6508b.add(Long.valueOf(j10));
        int size = this.f6509c.size();
        this.f6511e.T();
        return size < Math.max(1, ((Integer) y2.f6632k.a((Object) null)).intValue());
    }
}
