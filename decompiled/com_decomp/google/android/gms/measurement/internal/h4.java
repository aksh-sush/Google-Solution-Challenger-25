package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.e;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzr;
import com.google.firebase.analytics.FirebaseAnalytics;
import h4.i;
import h4.n;
import java.util.ArrayList;
import java.util.Map;

public final class h4 extends n8 implements f {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map f6016d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map f6017e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map f6018f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map f6019g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map f6020h = new a();

    /* renamed from: i  reason: collision with root package name */
    final e f6021i = new e4(this, 20);

    /* renamed from: j  reason: collision with root package name */
    final zzr f6022j = new f4(this);

    /* renamed from: k  reason: collision with root package name */
    private final Map f6023k = new a();

    h4(w8 w8Var) {
        super(w8Var);
    }

    private final zzfc A(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzg();
        }
        try {
            zzfc zzfc = (zzfc) ((zzfb) y8.D(zzfc.zze(), bArr)).zzaA();
            h3 v10 = this.f5994a.d().v();
            String str2 = null;
            Long valueOf = zzfc.zzq() ? Long.valueOf(zzfc.zzc()) : null;
            if (zzfc.zzp()) {
                str2 = zzfc.zzh();
            }
            v10.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzfc;
        } catch (zzkj | RuntimeException e10) {
            this.f5994a.d().w().c("Unable to merge remote config. appId", j3.z(str), e10);
            return zzfc.zzg();
        }
    }

    private final void B(String str, zzfb zzfb) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zzfb != null) {
            for (int i10 = 0; i10 < zzfb.zza(); i10++) {
                zzez zzez = (zzez) zzfb.zzb(i10).zzbv();
                if (TextUtils.isEmpty(zzez.zzc())) {
                    this.f5994a.d().w().a("EventConfig contained null event name");
                } else {
                    String zzc = zzez.zzc();
                    String b10 = n.b(zzez.zzc());
                    if (!TextUtils.isEmpty(b10)) {
                        zzez.zzb(b10);
                        zzfb.zzd(i10, zzez);
                    }
                    aVar.put(zzc, Boolean.valueOf(zzez.zzd()));
                    aVar2.put(zzez.zzc(), Boolean.valueOf(zzez.zze()));
                    if (zzez.zzf()) {
                        if (zzez.zza() < 2 || zzez.zza() > 65535) {
                            this.f5994a.d().w().c("Invalid sampling rate. Event name, sample rate", zzez.zzc(), Integer.valueOf(zzez.zza()));
                        } else {
                            aVar3.put(zzez.zzc(), Integer.valueOf(zzez.zza()));
                        }
                    }
                }
            }
        }
        this.f6017e.put(str, aVar);
        this.f6018f.put(str, aVar2);
        this.f6020h.put(str, aVar3);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r2 != null) goto L_0x0092;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C(java.lang.String r13) {
        /*
            r12 = this;
            r12.i()
            r12.h()
            com.google.android.gms.common.internal.s.g(r13)
            java.util.Map r0 = r12.f6019g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x011f
            com.google.android.gms.measurement.internal.w8 r0 = r12.f6214b
            com.google.android.gms.measurement.internal.j r0 = r0.V()
            com.google.android.gms.common.internal.s.g(r13)
            r0.h()
            r0.i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.R()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            java.lang.String r3 = "remote_config"
            r10 = 0
            r4[r10] = r3     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            java.lang.String r3 = "config_last_modified_time"
            r11 = 1
            r4[r11] = r3     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0077 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0075 }
            if (r3 != 0) goto L_0x0048
            goto L_0x0092
        L_0x0048:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r4 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0075 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0075 }
            if (r5 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.n4 r5 = r0.f5994a     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r13)     // Catch:{ SQLiteException -> 0x0075 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x0075 }
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x0092
        L_0x006c:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0075 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0075 }
            r2.close()
            goto L_0x0096
        L_0x0075:
            r3 = move-exception
            goto L_0x007d
        L_0x0077:
            r13 = move-exception
            goto L_0x0119
        L_0x007a:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007d:
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r13)     // Catch:{ all -> 0x0117 }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x0117 }
            if (r2 == 0) goto L_0x0095
        L_0x0092:
            r2.close()
        L_0x0095:
            r5 = r1
        L_0x0096:
            if (r5 != 0) goto L_0x00b7
            java.util.Map r0 = r12.f6016d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f6017e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f6018f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f6019g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f6023k
            r0.put(r13, r1)
            java.util.Map r0 = r12.f6020h
        L_0x00b3:
            r0.put(r13, r1)
            return
        L_0x00b7:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            com.google.android.gms.internal.measurement.zzfc r0 = r12.A(r13, r0)
            com.google.android.gms.internal.measurement.zzjv r0 = r0.zzbv()
            com.google.android.gms.internal.measurement.zzfb r0 = (com.google.android.gms.internal.measurement.zzfb) r0
            r12.B(r13, r0)
            java.util.Map r2 = r12.f6016d
            com.google.android.gms.internal.measurement.zzjz r3 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r3 = (com.google.android.gms.internal.measurement.zzfc) r3
            java.util.Map r3 = E(r3)
            r2.put(r13, r3)
            java.util.Map r2 = r12.f6019g
            com.google.android.gms.internal.measurement.zzjz r3 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r3 = (com.google.android.gms.internal.measurement.zzfc) r3
            r2.put(r13, r3)
            com.google.android.gms.internal.measurement.zzpl.zzc()
            com.google.android.gms.measurement.internal.n4 r2 = r12.f5994a
            com.google.android.gms.measurement.internal.g r2 = r2.z()
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6659x0
            boolean r2 = r2.B(r1, r3)
            if (r2 == 0) goto L_0x00fc
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r0 = (com.google.android.gms.internal.measurement.zzfc) r0
            r12.D(r13, r0)
        L_0x00fc:
            com.google.android.gms.internal.measurement.zzpf.zzc()
            com.google.android.gms.measurement.internal.n4 r0 = r12.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.f6655v0
            boolean r0 = r0.B(r1, r2)
            if (r0 == 0) goto L_0x0114
            java.util.Map r0 = r12.f6023k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00b3
        L_0x0114:
            java.util.Map r0 = r12.f6023k
            goto L_0x00b3
        L_0x0117:
            r13 = move-exception
            r1 = r2
        L_0x0119:
            if (r1 == 0) goto L_0x011e
            r1.close()
        L_0x011e:
            throw r13
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h4.C(java.lang.String):void");
    }

    private final void D(String str, zzfc zzfc) {
        if (zzfc.zza() != 0) {
            this.f5994a.d().v().b("EES programs found", Integer.valueOf(zzfc.zza()));
            zzgo zzgo = zzfc.zzj().get(0);
            try {
                zzc zzc = new zzc();
                zzc.zzd("internal.remoteConfig", new c4(this, str));
                zzc.zzd("internal.appMetadata", new i(this, str));
                zzc.zzd("internal.logger", new b4(this));
                zzc.zzc(zzgo);
                this.f6021i.put(str, zzc);
                this.f5994a.d().v().c("EES program loaded for appId, activities", str, Integer.valueOf(zzgo.zza().zza()));
                for (zzgm zzb : zzgo.zza().zzd()) {
                    this.f5994a.d().v().b("EES program activity", zzb.zzb());
                }
            } catch (zzd unused) {
                this.f5994a.d().r().b("Failed to load EES program. appId", str);
            }
        } else {
            this.f6021i.remove(str);
        }
    }

    private static final Map E(zzfc zzfc) {
        a aVar = new a();
        if (zzfc != null) {
            for (zzfe next : zzfc.zzk()) {
                aVar.put(next.zzb(), next.zzc());
            }
        }
        return aVar;
    }

    static /* bridge */ /* synthetic */ zzc n(h4 h4Var, String str) {
        h4Var.i();
        s.g(str);
        zzpl.zzc();
        if (!h4Var.f5994a.z().B((String) null, y2.f6659x0) || !h4Var.u(str)) {
            return null;
        }
        if (!h4Var.f6019g.containsKey(str) || h4Var.f6019g.get(str) == null) {
            h4Var.C(str);
        } else {
            h4Var.D(str, (zzfc) h4Var.f6019g.get(str));
        }
        return (zzc) h4Var.f6021i.snapshot().get(str);
    }

    public final String a(String str, String str2) {
        h();
        C(str);
        Map map = (Map) this.f6016d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int m(String str, String str2) {
        Integer num;
        h();
        C(str);
        Map map = (Map) this.f6020h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public final zzfc o(String str) {
        i();
        h();
        s.g(str);
        C(str);
        return (zzfc) this.f6019g.get(str);
    }

    /* access modifiers changed from: protected */
    public final String p(String str) {
        h();
        return (String) this.f6023k.get(str);
    }

    /* access modifiers changed from: protected */
    public final void r(String str) {
        h();
        this.f6023k.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void s(String str) {
        h();
        this.f6019g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean t(String str) {
        h();
        zzfc o10 = o(str);
        if (o10 == null) {
            return false;
        }
        return o10.zzo();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r4 = (com.google.android.gms.internal.measurement.zzfc) r3.f6019g.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.zzpl.zzc()
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            r1 = 0
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.f6659x0
            boolean r0 = r0.B(r1, r2)
            r1 = 0
            if (r0 == 0) goto L_0x002d
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x001a
            return r1
        L_0x001a:
            java.util.Map r0 = r3.f6019g
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzfc r4 = (com.google.android.gms.internal.measurement.zzfc) r4
            if (r4 != 0) goto L_0x0025
            return r1
        L_0x0025:
            int r4 = r4.zza()
            if (r4 == 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h4.u(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean v(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean w(String str, String str2) {
        Boolean bool;
        h();
        C(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.f6018f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean x(String str, String str2) {
        Boolean bool;
        h();
        C(str);
        if (v(str) && d9.V(str2)) {
            return true;
        }
        if (y(str) && d9.W(str2)) {
            return true;
        }
        Map map = (Map) this.f6017e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    public final boolean z(String str, byte[] bArr, String str2) {
        i();
        h();
        s.g(str);
        zzfb zzfb = (zzfb) A(str, bArr).zzbv();
        if (zzfb == null) {
            return false;
        }
        B(str, zzfb);
        zzpl.zzc();
        if (this.f5994a.z().B((String) null, y2.f6659x0)) {
            D(str, (zzfc) zzfb.zzaA());
        }
        this.f6019g.put(str, (zzfc) zzfb.zzaA());
        this.f6023k.put(str, str2);
        this.f6016d.put(str, E((zzfc) zzfb.zzaA()));
        this.f6214b.V().n(str, new ArrayList(zzfb.zze()));
        try {
            zzfb.zzc();
            bArr = ((zzfc) zzfb.zzaA()).zzbs();
        } catch (RuntimeException e10) {
            this.f5994a.d().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", j3.z(str), e10);
        }
        zzpf.zzc();
        if (this.f5994a.z().B((String) null, y2.f6655v0)) {
            this.f6214b.V().r(str, bArr, str2);
        } else {
            this.f6214b.V().r(str, bArr, (String) null);
        }
        this.f6019g.put(str, (zzfc) zzfb.zzaA());
        return true;
    }
}
