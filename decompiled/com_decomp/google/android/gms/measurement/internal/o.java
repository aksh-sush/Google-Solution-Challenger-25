package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.util.Iterator;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    final String f6269a;

    /* renamed from: b  reason: collision with root package name */
    final String f6270b;

    /* renamed from: c  reason: collision with root package name */
    final String f6271c;

    /* renamed from: d  reason: collision with root package name */
    final long f6272d;

    /* renamed from: e  reason: collision with root package name */
    final long f6273e;

    /* renamed from: f  reason: collision with root package name */
    final r f6274f;

    o(n4 n4Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        r rVar;
        s.g(str2);
        s.g(str3);
        this.f6269a = str2;
        this.f6270b = str3;
        this.f6271c = true == TextUtils.isEmpty(str) ? null : str;
        this.f6272d = j10;
        this.f6273e = j11;
        if (j11 != 0 && j11 > j10) {
            n4Var.d().w().b("Event created with reverse previous/current timestamps. appId", j3.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    n4Var.d().r().a("Param name can't be null");
                } else {
                    Object o10 = n4Var.N().o(next, bundle2.get(next));
                    if (o10 == null) {
                        n4Var.d().w().b("Param value can't be null", n4Var.D().r(next));
                    } else {
                        n4Var.N().B(bundle2, next, o10);
                    }
                }
                it.remove();
            }
            rVar = new r(bundle2);
        }
        this.f6274f = rVar;
    }

    /* access modifiers changed from: package-private */
    public final o a(n4 n4Var, long j10) {
        return new o(n4Var, this.f6271c, this.f6269a, this.f6270b, this.f6272d, j10, this.f6274f);
    }

    public final String toString() {
        String str = this.f6269a;
        String str2 = this.f6270b;
        String valueOf = String.valueOf(this.f6274f);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(valueOf);
        sb2.append('}');
        return sb2.toString();
    }

    private o(n4 n4Var, String str, String str2, String str3, long j10, long j11, r rVar) {
        s.g(str2);
        s.g(str3);
        s.k(rVar);
        this.f6269a = str2;
        this.f6270b = str3;
        this.f6271c = true == TextUtils.isEmpty(str) ? null : str;
        this.f6272d = j10;
        this.f6273e = j11;
        if (j11 != 0 && j11 > j10) {
            n4Var.d().w().c("Event created with reverse previous/current timestamps. appId, name", j3.z(str2), j3.z(str3));
        }
        this.f6274f = rVar;
    }
}
