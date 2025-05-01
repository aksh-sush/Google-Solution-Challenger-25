package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class k9 {

    /* renamed from: a  reason: collision with root package name */
    private final n4 f6154a;

    public k9(n4 n4Var) {
        this.f6154a = n4Var;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String str2;
        this.f6154a.b().h();
        if (!this.f6154a.o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f6154a.F().f6535u.b(str2);
                this.f6154a.F().f6536v.b(this.f6154a.e().currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f6154a.b().h();
        if (d()) {
            if (e()) {
                this.f6154a.F().f6535u.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f6154a.I().t("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f6154a.F().f6535u.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f6154a.d().t().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f6154a.F().f6536v.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f6154a.I().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f6154a.F().f6535u.b((String) null);
            }
            this.f6154a.F().f6536v.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f6154a.F().f6535u.b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.f6154a.F().f6536v.a() > 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return d() && this.f6154a.e().currentTimeMillis() - this.f6154a.F().f6536v.a() > this.f6154a.z().r((String) null, y2.S);
    }
}
