package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzny;

final class g8 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h8 f6001a;

    g8(h8 h8Var) {
        this.f6001a = h8Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f6001a.h();
        if (this.f6001a.f5994a.F().v(this.f6001a.f5994a.e().currentTimeMillis())) {
            this.f6001a.f5994a.F().f6526l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f6001a.f5994a.d().v().a("Detected application was in foreground");
                c(this.f6001a.f5994a.e().currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f6001a.h();
        this.f6001a.s();
        if (this.f6001a.f5994a.F().v(j10)) {
            this.f6001a.f5994a.F().f6526l.a(true);
        }
        this.f6001a.f5994a.F().f6529o.b(j10);
        if (this.f6001a.f5994a.F().f6526l.b()) {
            c(j10, z10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(long j10, boolean z10) {
        this.f6001a.h();
        if (this.f6001a.f5994a.o()) {
            this.f6001a.f5994a.F().f6529o.b(j10);
            this.f6001a.f5994a.d().v().b("Session started, time", Long.valueOf(this.f6001a.f5994a.e().a()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f6001a.f5994a.I().L("auto", "_sid", valueOf, j10);
            this.f6001a.f5994a.F().f6526l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f6001a.f5994a.z().B((String) null, y2.f6625g0) && z10) {
                bundle.putLong("_aib", 1);
            }
            this.f6001a.f5994a.I().u("auto", "_s", j10, bundle);
            zzny.zzc();
            if (this.f6001a.f5994a.z().B((String) null, y2.f6633k0)) {
                String a10 = this.f6001a.f5994a.F().f6534t.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    this.f6001a.f5994a.I().u("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }
}
