package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class o extends BasePendingResult {

    /* renamed from: a  reason: collision with root package name */
    private final h f5562a;

    public o(GoogleApiClient googleApiClient, h hVar) {
        super(googleApiClient);
        this.f5562a = hVar;
    }

    /* access modifiers changed from: protected */
    public final h createFailedResult(Status status) {
        return this.f5562a;
    }
}
