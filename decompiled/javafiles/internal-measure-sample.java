package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.measurement.internal.h4;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h4 extends n8 implements f {

    /* renamed from: d, reason: collision with root package name */
    private final Map f6048d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f6049e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f6050f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f6051g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f6052h;

    /* renamed from: i, reason: collision with root package name */
    final androidx.collection.e f6053i;

    /* renamed from: j, reason: collision with root package name */
    final zzr f6054j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f6055k;

    h4(w8 w8Var) {
        super(w8Var);
        this.f6048d = new androidx.collection.a();
        this.f6049e = new androidx.collection.a();
        this.f6050f = new androidx.collection.a();
        this.f6051g = new androidx.collection.a();
        this.f6055k = new androidx.collection.a();
        this.f6052h = new androidx.collection.a();
        this.f6053i = new e4(this, 20);
        this.f6054j = new f4(this);
    }

    private final zzfc A(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzg();
        }
        try {
            zzfc zzaA = ((zzfb) y8.D(zzfc.zze(), bArr)).zzaA();
            this.f6026a.d().v().c("Parsed config. version, gmp_app_id", zzaA.zzq() ? Long.valueOf(zzaA.zzc()) : null, zzaA.zzp() ? zzaA.zzh() : null);
            return zzaA;
        } catch (zzkj | RuntimeException e10) {
            this.f6026a.d().w().c("Unable to merge remote config. appId", j3.z(str), e10);
            return zzfc.zzg();
        }
    }

    private final void B(String str, zzfb zzfbVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        if (zzfbVar != null) {
            for (int i10 = 0; i10 < zzfbVar.zza(); i10++) {
                zzez zzbv = zzfbVar.zzb(i10).zzbv();
                if (TextUtils.isEmpty(zzbv.zzc())) {
                    this.f6026a.d().w().a("EventConfig contained null event name");
                } else {
                    String zzc = zzbv.zzc();
                    String b10 = h4.n.b(zzbv.zzc());
                    if (!TextUtils.isEmpty(b10)) {
                        zzbv.zzb(b10);
                        zzfbVar.zzd(i10, zzbv);
                    }
                    aVar.put(zzc, Boolean.valueOf(zzbv.zzd()));
                    aVar2.put(zzbv.zzc(), Boolean.valueOf(zzbv.zze()));
                    if (zzbv.zzf()) {
                        if (zzbv.zza() < 2 || zzbv.zza() > 65535) {
                            this.f6026a.d().w().c("Invalid sampling rate. Event name, sample rate", zzbv.zzc(), Integer.valueOf(zzbv.zza()));
                        } else {
                            aVar3.put(zzbv.zzc(), Integer.valueOf(zzbv.zza()));
                        }
                    }
                }
            }
        }
        this.f6049e.put(str, aVar);
        this.f6050f.put(str, aVar2);
        this.f6052h.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0118: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x0118 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h4.C(java.lang.String):void");
    }

    private final void D(final String str, zzfc zzfcVar) {
        if (zzfcVar.zza() == 0) {
            this.f6053i.remove(str);
            return;
        }
        this.f6026a.d().v().b("EES programs found", Integer.valueOf(zzfcVar.zza()));
        zzgo zzgoVar = zzfcVar.zzj().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.c4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new g4(h4.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: h4.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final h4 h4Var = h4.this;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.d4
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            h4 h4Var2 = h4.this;
                            String str3 = str2;
                            u4 T = h4Var2.f6246b.V().T(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            h4Var2.f6026a.z().q();
                            hashMap.put("gmp_version", 42097L);
                            if (T != null) {
                                String h02 = T.h0();
                                if (h02 != null) {
                                    hashMap.put("app_version", h02);
                                }
                                hashMap.put("app_version_int", Long.valueOf(T.M()));
                                hashMap.put("dynamite_version", Long.valueOf(T.V()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.b4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzt(h4.this.f6054j);
                }
            });
            zzcVar.zzc(zzgoVar);
            this.f6053i.put(str, zzcVar);
            this.f6026a.d().v().c("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zza().zza()));
            Iterator<zzgm> it = zzgoVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.f6026a.d().v().b("EES program activity", it.next().zzb());
            }
        } catch (zzd unused) {
            this.f6026a.d().r().b("Failed to load EES program. appId", str);
        }
    }

    private static final Map E(zzfc zzfcVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzfcVar != null) {
            for (zzfe zzfeVar : zzfcVar.zzk()) {
                aVar.put(zzfeVar.zzb(), zzfeVar.zzc());
            }
        }
        return aVar;
    }

    static /* bridge */ /* synthetic */ zzc n(h4 h4Var, String str) {
        h4Var.i();
        com.google.android.gms.common.internal.s.g(str);
        zzpl.zzc();
        if (!h4Var.f6026a.z().B(null, y2.f6691x0) || !h4Var.u(str)) {
            return null;
        }
        if (!h4Var.f6051g.containsKey(str) || h4Var.f6051g.get(str) == null) {
            h4Var.C(str);
        } else {
            h4Var.D(str, (zzfc) h4Var.f6051g.get(str));
        }
        return (zzc) h4Var.f6053i.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.f
    public final String a(String str, String str2) {
        h();
        C(str);
        Map map = (Map) this.f6048d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.n8
    protected final boolean l() {
        return false;
    }

    final int m(String str, String str2) {
        Integer num;
        h();
        C(str);
        Map map = (Map) this.f6052h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    protected final zzfc o(String str) {
        i();
        h();
        com.google.android.gms.common.internal.s.g(str);
        C(str);
        return (zzfc) this.f6051g.get(str);
    }

    protected final String p(String str) {
        h();
        return (String) this.f6055k.get(str);
    }

    protected final void r(String str) {
        h();
        this.f6055k.put(str, null);
    }

    final void s(String str) {
        h();
        this.f6051g.remove(str);
    }

    final boolean t(String str) {
        h();
        zzfc o10 = o(str);
        if (o10 == null) {
            return false;
        }
        return o10.zzo();
    }

    public final boolean u(String str) {
        zzfc zzfcVar;
        zzpl.zzc();
        return (!this.f6026a.z().B(null, y2.f6691x0) || TextUtils.isEmpty(str) || (zzfcVar = (zzfc) this.f6051g.get(str)) == null || zzfcVar.zza() == 0) ? false : true;
    }

    final boolean v(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    final boolean w(String str, String str2) {
        Boolean bool;
        h();
        C(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.f6050f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean x(String str, String str2) {
        Boolean bool;
        h();
        C(str);
        if (v(str) && d9.V(str2)) {
            return true;
        }
        if (y(str) && d9.W(str2)) {
            return true;
        }
        Map map = (Map) this.f6049e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean y(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean z(String str, byte[] bArr, String str2) {
        i();
        h();
        com.google.android.gms.common.internal.s.g(str);
        zzfb zzbv = A(str, bArr).zzbv();
        if (zzbv == null) {
            return false;
        }
        B(str, zzbv);
        zzpl.zzc();
        if (this.f6026a.z().B(null, y2.f6691x0)) {
            D(str, zzbv.zzaA());
        }
        this.f6051g.put(str, zzbv.zzaA());
        this.f6055k.put(str, str2);
        this.f6048d.put(str, E(zzbv.zzaA()));
        this.f6246b.V().n(str, new ArrayList(zzbv.zze()));
        try {
            zzbv.zzc();
            bArr = zzbv.zzaA().zzbs();
        } catch (RuntimeException e10) {
            this.f6026a.d().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", j3.z(str), e10);
        }
        zzpf.zzc();
        if (this.f6026a.z().B(null, y2.f6687v0)) {
            this.f6246b.V().r(str, bArr, str2);
        } else {
            this.f6246b.V().r(str, bArr, null);
        }
        this.f6051g.put(str, zzbv.zzaA());
        return true;
    }
}