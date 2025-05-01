package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.s;
import java.util.Map;

public final class c2 extends a3 {

    /* renamed from: b  reason: collision with root package name */
    private final Map f5886b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map f5887c = new a();

    /* renamed from: d  reason: collision with root package name */
    private long f5888d;

    public c2(n4 n4Var) {
        super(n4Var);
    }

    static /* bridge */ /* synthetic */ void i(c2 c2Var, String str, long j10) {
        c2Var.h();
        s.g(str);
        if (c2Var.f5887c.isEmpty()) {
            c2Var.f5888d = j10;
        }
        Integer num = (Integer) c2Var.f5887c.get(str);
        if (num != null) {
            c2Var.f5887c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2Var.f5887c.size() >= 100) {
            c2Var.f5994a.d().w().a("Too many ads visible");
        } else {
            c2Var.f5887c.put(str, 1);
            c2Var.f5886b.put(str, Long.valueOf(j10));
        }
    }

    static /* bridge */ /* synthetic */ void j(c2 c2Var, String str, long j10) {
        c2Var.h();
        s.g(str);
        Integer num = (Integer) c2Var.f5887c.get(str);
        if (num != null) {
            o6 t10 = c2Var.f5994a.K().t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2Var.f5887c.remove(str);
                Long l10 = (Long) c2Var.f5886b.get(str);
                if (l10 == null) {
                    c2Var.f5994a.d().r().a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    c2Var.f5886b.remove(str);
                    c2Var.p(str, j10 - longValue, t10);
                }
                if (c2Var.f5887c.isEmpty()) {
                    long j11 = c2Var.f5888d;
                    if (j11 == 0) {
                        c2Var.f5994a.d().r().a("First ad exposure time was never set");
                        return;
                    }
                    c2Var.o(j10 - j11, t10);
                    c2Var.f5888d = 0;
                    return;
                }
                return;
            }
            c2Var.f5887c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2Var.f5994a.d().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void o(long j10, o6 o6Var) {
        if (o6Var == null) {
            this.f5994a.d().v().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f5994a.d().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            d9.x(o6Var, bundle, true);
            this.f5994a.I().t("am", "_xa", bundle);
        }
    }

    private final void p(String str, long j10, o6 o6Var) {
        if (o6Var == null) {
            this.f5994a.d().v().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f5994a.d().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            d9.x(o6Var, bundle, true);
            this.f5994a.I().t("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void q(long j10) {
        for (String put : this.f5886b.keySet()) {
            this.f5886b.put(put, Long.valueOf(j10));
        }
        if (!this.f5886b.isEmpty()) {
            this.f5888d = j10;
        }
    }

    public final void l(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f5994a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f5994a.b().z(new a(this, str, j10));
        }
    }

    public final void m(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f5994a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f5994a.b().z(new a0(this, str, j10));
        }
    }

    public final void n(long j10) {
        o6 t10 = this.f5994a.K().t(false);
        for (String str : this.f5886b.keySet()) {
            p(str, j10 - ((Long) this.f5886b.get(str)).longValue(), t10);
        }
        if (!this.f5886b.isEmpty()) {
            o(j10 - this.f5888d, t10);
        }
        q(j10);
    }
}
