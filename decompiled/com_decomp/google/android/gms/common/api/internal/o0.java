package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

final class o0 extends u0 {

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f5468f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v0 f5469g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(v0 v0Var, ArrayList arrayList) {
        super(v0Var, (t0) null);
        this.f5469g = v0Var;
        this.f5468f = arrayList;
    }

    public final void a() {
        v0 v0Var = this.f5469g;
        v0Var.f5508a.f5367n.f5317p = v0.y(v0Var);
        ArrayList arrayList = this.f5468f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var2 = this.f5469g;
            ((a.f) arrayList.get(i10)).getRemoteService(v0Var2.f5522o, v0Var2.f5508a.f5367n.f5317p);
        }
    }
}
