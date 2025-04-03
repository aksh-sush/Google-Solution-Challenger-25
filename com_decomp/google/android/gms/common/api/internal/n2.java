package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class n2 {

    /* renamed from: c  reason: collision with root package name */
    public static final Status f5465c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a  reason: collision with root package name */
    final Set f5466a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    private final m2 f5467b = new m2(this);

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult basePendingResult) {
        this.f5466a.add(basePendingResult);
        basePendingResult.zan(this.f5467b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5466a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan((m2) null);
            if (basePendingResult.zam()) {
                this.f5466a.remove(basePendingResult);
            }
        }
    }
}
