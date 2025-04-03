package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.m0;
import java.util.ArrayList;
import java.util.Map;
import q3.b;

final class n0 extends u0 {

    /* renamed from: f  reason: collision with root package name */
    private final Map f5450f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v0 f5451g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(v0 v0Var, Map map) {
        super(v0Var, (t0) null);
        this.f5451g = v0Var;
        this.f5450f = map;
    }

    public final void a() {
        m0 m0Var = new m0(this.f5451g.f5511d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f5450f.keySet()) {
            if (!fVar.requiresGooglePlayServices() || ((k0) this.f5450f.get(fVar)).f5423c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i10 = -1;
        int i11 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i11 < size) {
                i10 = m0Var.b(this.f5451g.f5510c, (a.f) arrayList.get(i11));
                i11++;
                if (i10 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i11 < size2) {
                i10 = m0Var.b(this.f5451g.f5510c, (a.f) arrayList2.get(i11));
                i11++;
                if (i10 == 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            b bVar = new b(i10, (PendingIntent) null);
            v0 v0Var = this.f5451g;
            v0Var.f5508a.p(new l0(this, v0Var, bVar));
            return;
        }
        v0 v0Var2 = this.f5451g;
        if (v0Var2.f5520m && v0Var2.f5518k != null) {
            v0Var2.f5518k.d();
        }
        for (a.f fVar2 : this.f5450f.keySet()) {
            c.C0088c cVar = (c.C0088c) this.f5450f.get(fVar2);
            if (!fVar2.requiresGooglePlayServices() || m0Var.b(this.f5451g.f5510c, fVar2) == 0) {
                fVar2.connect(cVar);
            } else {
                v0 v0Var3 = this.f5451g;
                v0Var3.f5508a.p(new m0(this, v0Var3, cVar));
            }
        }
    }
}
