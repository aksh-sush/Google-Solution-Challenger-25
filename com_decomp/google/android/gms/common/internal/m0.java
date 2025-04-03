package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import q3.k;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f5668a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private k f5669b;

    public m0(k kVar) {
        s.k(kVar);
        this.f5669b = kVar;
    }

    public final int a(Context context, int i10) {
        return this.f5668a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        s.k(context);
        s.k(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a10 = a(context, minApkVersion);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f5668a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f5668a.keyAt(i11);
                if (keyAt > minApkVersion && this.f5668a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f5669b.j(context, minApkVersion) : i10;
            this.f5668a.put(minApkVersion, a10);
        }
        return a10;
    }

    public final void c() {
        this.f5668a.clear();
    }
}
