package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class a0 implements PendingResult.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f5291a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c0 f5292b;

    a0(c0 c0Var, BasePendingResult basePendingResult) {
        this.f5292b = c0Var;
        this.f5291a = basePendingResult;
    }

    public final void a(Status status) {
        this.f5292b.f5334a.remove(this.f5291a);
    }
}
