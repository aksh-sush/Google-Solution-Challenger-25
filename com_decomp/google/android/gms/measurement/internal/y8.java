package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzlf;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class y8 extends n8 {
    y8(w8 w8Var) {
        super(w8Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.measurement.internal.t B(com.google.android.gms.internal.measurement.zzaa r8) {
        /*
            java.util.Map r0 = r8.zze()
            r1 = 1
            android.os.Bundle r0 = z(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r8.zzd()
            java.lang.String r1 = h4.n.b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r8.zzd()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.t r1 = new com.google.android.gms.measurement.internal.t
            com.google.android.gms.measurement.internal.r r4 = new com.google.android.gms.measurement.internal.r
            r4.<init>(r0)
            long r6 = r8.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y8.B(com.google.android.gms.internal.measurement.zzaa):com.google.android.gms.measurement.internal.t");
    }

    static zzlf D(zzlf zzlf, byte[] bArr) {
        zzjl zzb = zzjl.zzb();
        return zzb != null ? zzlf.zzaw(bArr, zzb) : zzlf.zzav(bArr);
    }

    static List H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                zzfr zze = zzfs.zze();
                for (String next : bundle.keySet()) {
                    zzfr zze2 = zzfs.zze();
                    zze2.zzj(next);
                    Object obj = bundle.get(next);
                    if (obj instanceof Long) {
                        zze2.zzi(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        zze2.zzk((String) obj);
                    } else if (obj instanceof Double) {
                        zze2.zzh(((Double) obj).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzfs) zze.zzaA());
                }
            }
        }
        return arrayList;
    }

    static List J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static Map K(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if ((obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(K((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(K((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(K((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    static boolean N(List list, int i10) {
        if (i10 >= list.size() * 64) {
            return false;
        }
        return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
    }

    static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void m(zzfn zzfn, String str, Object obj) {
        List<zzfs> zzp = zzfn.zzp();
        int i10 = 0;
        while (true) {
            if (i10 >= zzp.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzp.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfr zze = zzfs.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zze.zzk((String) obj);
        } else if (obj instanceof Double) {
            zze.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zze.zzb(H((Bundle[]) obj));
        }
        if (i10 >= 0) {
            zzfn.zzj(i10, zze);
        } else {
            zzfn.zze(zze);
        }
    }

    static final boolean n(t tVar, i9 i9Var) {
        s.k(tVar);
        s.k(i9Var);
        return !TextUtils.isEmpty(i9Var.f6060f) || !TextUtils.isEmpty(i9Var.f6075u);
    }

    static final zzfs o(zzfo zzfo, String str) {
        for (zzfs next : zzfo.zzi()) {
            if (next.zzg().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static final Object p(zzfo zzfo, String str) {
        zzfs o10 = o(zzfo, str);
        if (o10 == null) {
            return null;
        }
        if (o10.zzy()) {
            return o10.zzh();
        }
        if (o10.zzw()) {
            return Long.valueOf(o10.zzd());
        }
        if (o10.zzu()) {
            return Double.valueOf(o10.zza());
        }
        if (o10.zzc() <= 0) {
            return null;
        }
        List<zzfs> zzi = o10.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfs next : zzi) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzfs next2 : next.zzi()) {
                    if (next2.zzy()) {
                        bundle.putString(next2.zzg(), next2.zzh());
                    } else if (next2.zzw()) {
                        bundle.putLong(next2.zzg(), next2.zzd());
                    } else if (next2.zzu()) {
                        bundle.putDouble(next2.zzg(), next2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void q(StringBuilder sb2, int i10, List list) {
        if (list != null) {
            int i11 = i10 + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfs zzfs = (zzfs) it.next();
                if (zzfs != null) {
                    s(sb2, i11);
                    sb2.append("param {\n");
                    Double d10 = null;
                    v(sb2, i11, "name", zzfs.zzx() ? this.f5994a.D().r(zzfs.zzg()) : null);
                    v(sb2, i11, "string_value", zzfs.zzy() ? zzfs.zzh() : null);
                    v(sb2, i11, "int_value", zzfs.zzw() ? Long.valueOf(zzfs.zzd()) : null);
                    if (zzfs.zzu()) {
                        d10 = Double.valueOf(zzfs.zza());
                    }
                    v(sb2, i11, "double_value", d10);
                    if (zzfs.zzc() > 0) {
                        q(sb2, i11, zzfs.zzi());
                    }
                    s(sb2, i11);
                    sb2.append("}\n");
                }
            }
        }
    }

    private final void r(StringBuilder sb2, int i10, zzel zzel) {
        String str;
        if (zzel != null) {
            s(sb2, i10);
            sb2.append("filter {\n");
            if (zzel.zzh()) {
                v(sb2, i10, "complement", Boolean.valueOf(zzel.zzg()));
            }
            if (zzel.zzj()) {
                v(sb2, i10, "param_name", this.f5994a.D().r(zzel.zze()));
            }
            if (zzel.zzk()) {
                int i11 = i10 + 1;
                zzex zzd = zzel.zzd();
                if (zzd != null) {
                    s(sb2, i11);
                    sb2.append("string_filter {\n");
                    if (zzd.zzi()) {
                        switch (zzd.zzj()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        v(sb2, i11, "match_type", str);
                    }
                    if (zzd.zzh()) {
                        v(sb2, i11, "expression", zzd.zzd());
                    }
                    if (zzd.zzg()) {
                        v(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                    }
                    if (zzd.zza() > 0) {
                        s(sb2, i11 + 1);
                        sb2.append("expression_list {\n");
                        for (String append : zzd.zze()) {
                            s(sb2, i11 + 2);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    s(sb2, i11);
                    sb2.append("}\n");
                }
            }
            if (zzel.zzi()) {
                w(sb2, i10 + 1, "number_filter", zzel.zzc());
            }
            s(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static final void s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String t(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void u(StringBuilder sb2, int i10, String str, zzgd zzgd) {
        if (zzgd != null) {
            s(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzgd.zzb() != 0) {
                s(sb2, 4);
                sb2.append("results: ");
                int i11 = 0;
                for (Long next : zzgd.zzk()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (zzgd.zzd() != 0) {
                s(sb2, 4);
                sb2.append("status: ");
                int i13 = 0;
                for (Long next2 : zzgd.zzn()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next2);
                    i13 = i14;
                }
                sb2.append(10);
            }
            if (zzgd.zza() != 0) {
                s(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (zzfm next3 : zzgd.zzj()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next3.zzh() ? Integer.valueOf(next3.zza()) : null);
                    sb2.append(":");
                    sb2.append(next3.zzg() ? Long.valueOf(next3.zzb()) : null);
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            if (zzgd.zzc() != 0) {
                s(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (zzgf next4 : zzgd.zzm()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next4.zzi() ? Integer.valueOf(next4.zzb()) : null);
                    sb2.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.zzf()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i19 = i20;
                    }
                    sb2.append("]");
                    i17 = i18;
                }
                sb2.append("}\n");
            }
            s(sb2, 3);
            sb2.append("}\n");
        }
    }

    private static final void v(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj != null) {
            s(sb2, i10 + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    private static final void w(StringBuilder sb2, int i10, String str, zzeq zzeq) {
        if (zzeq != null) {
            s(sb2, i10);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzeq.zzg()) {
                int zzm = zzeq.zzm();
                v(sb2, i10, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (zzeq.zzi()) {
                v(sb2, i10, "match_as_float", Boolean.valueOf(zzeq.zzf()));
            }
            if (zzeq.zzh()) {
                v(sb2, i10, "comparison_value", zzeq.zzc());
            }
            if (zzeq.zzk()) {
                v(sb2, i10, "min_comparison_value", zzeq.zze());
            }
            if (zzeq.zzj()) {
                v(sb2, i10, "max_comparison_value", zzeq.zzd());
            }
            s(sb2, i10);
            sb2.append("}\n");
        }
    }

    static int x(zzfx zzfx, String str) {
        for (int i10 = 0; i10 < zzfx.zzb(); i10++) {
            if (str.equals(zzfx.zzak(i10).zzf())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle z(Map map, boolean z10) {
        String obj;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                obj = null;
            } else if (obj2 instanceof Long) {
                bundle.putLong(str, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(str, ((Double) obj2).doubleValue());
            } else if (!(obj2 instanceof ArrayList)) {
                obj = obj2.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(z((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArrayList(str, arrayList2);
            }
            bundle.putString(str, obj);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f5994a.d().r().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable A(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.n4 r5 = r4.f5994a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y8.A(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final zzfo C(o oVar) {
        zzfn zze = zzfo.zze();
        zze.zzl(oVar.f6273e);
        q qVar = new q(oVar.f6274f);
        while (qVar.hasNext()) {
            String b10 = qVar.next();
            zzfr zze2 = zzfs.zze();
            zze2.zzj(b10);
            Object j02 = oVar.f6274f.j0(b10);
            s.k(j02);
            L(zze2, j02);
            zze.zze(zze2);
        }
        return (zzfo) zze.zzaA();
    }

    /* access modifiers changed from: package-private */
    public final String E(zzfw zzfw) {
        if (zzfw == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (zzfy next : zzfw.zzd()) {
            if (next != null) {
                s(sb2, 1);
                sb2.append("bundle {\n");
                if (next.zzbh()) {
                    v(sb2, 1, "protocol_version", Integer.valueOf(next.zzd()));
                }
                v(sb2, 1, "platform", next.zzK());
                if (next.zzbd()) {
                    v(sb2, 1, "gmp_version", Long.valueOf(next.zzn()));
                }
                if (next.zzbn()) {
                    v(sb2, 1, "uploading_gmp_version", Long.valueOf(next.zzs()));
                }
                if (next.zzbb()) {
                    v(sb2, 1, "dynamite_version", Long.valueOf(next.zzk()));
                }
                if (next.zzaY()) {
                    v(sb2, 1, "config_version", Long.valueOf(next.zzi()));
                }
                v(sb2, 1, "gmp_app_id", next.zzH());
                v(sb2, 1, "admob_app_id", next.zzx());
                v(sb2, 1, "app_id", next.zzy());
                v(sb2, 1, "app_version", next.zzB());
                if (next.zzaW()) {
                    v(sb2, 1, "app_version_major", Integer.valueOf(next.zza()));
                }
                v(sb2, 1, "firebase_instance_id", next.zzF());
                if (next.zzba()) {
                    v(sb2, 1, "dev_cert_hash", Long.valueOf(next.zzj()));
                }
                v(sb2, 1, "app_store", next.zzA());
                if (next.zzbm()) {
                    v(sb2, 1, "upload_timestamp_millis", Long.valueOf(next.zzr()));
                }
                if (next.zzbk()) {
                    v(sb2, 1, "start_timestamp_millis", Long.valueOf(next.zzq()));
                }
                if (next.zzbc()) {
                    v(sb2, 1, "end_timestamp_millis", Long.valueOf(next.zzm()));
                }
                if (next.zzbg()) {
                    v(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.zzp()));
                }
                if (next.zzbf()) {
                    v(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.zzo()));
                }
                v(sb2, 1, "app_instance_id", next.zzz());
                v(sb2, 1, "resettable_device_id", next.zzL());
                v(sb2, 1, "ds_id", next.zzE());
                if (next.zzbe()) {
                    v(sb2, 1, "limited_ad_tracking", Boolean.valueOf(next.zzaT()));
                }
                v(sb2, 1, "os_version", next.zzJ());
                v(sb2, 1, "device_model", next.zzD());
                v(sb2, 1, "user_default_language", next.zzM());
                if (next.zzbl()) {
                    v(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(next.zzf()));
                }
                if (next.zzaX()) {
                    v(sb2, 1, "bundle_sequential_index", Integer.valueOf(next.zzb()));
                }
                if (next.zzbj()) {
                    v(sb2, 1, "service_upload", Boolean.valueOf(next.zzaU()));
                }
                v(sb2, 1, "health_monitor", next.zzI());
                if (!this.f5994a.z().B((String) null, y2.f6643p0) && next.zzaV() && next.zzh() != 0) {
                    v(sb2, 1, "android_id", Long.valueOf(next.zzh()));
                }
                if (next.zzbi()) {
                    v(sb2, 1, "retry_counter", Integer.valueOf(next.zze()));
                }
                if (next.zzaZ()) {
                    v(sb2, 1, "consent_signals", next.zzC());
                }
                List<zzgh> zzP = next.zzP();
                if (zzP != null) {
                    for (zzgh next2 : zzP) {
                        if (next2 != null) {
                            s(sb2, 2);
                            sb2.append("user_property {\n");
                            v(sb2, 2, "set_timestamp_millis", next2.zzs() ? Long.valueOf(next2.zzc()) : null);
                            v(sb2, 2, "name", this.f5994a.D().s(next2.zzf()));
                            v(sb2, 2, "string_value", next2.zzg());
                            v(sb2, 2, "int_value", next2.zzr() ? Long.valueOf(next2.zzb()) : null);
                            v(sb2, 2, "double_value", next2.zzq() ? Double.valueOf(next2.zza()) : null);
                            s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfk> zzN = next.zzN();
                if (zzN != null) {
                    for (zzfk next3 : zzN) {
                        if (next3 != null) {
                            s(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (next3.zzk()) {
                                v(sb2, 2, "audience_id", Integer.valueOf(next3.zza()));
                            }
                            if (next3.zzm()) {
                                v(sb2, 2, "new_audience", Boolean.valueOf(next3.zzj()));
                            }
                            u(sb2, 2, "current_data", next3.zzd());
                            if (next3.zzn()) {
                                u(sb2, 2, "previous_data", next3.zze());
                            }
                            s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfo> zzO = next.zzO();
                if (zzO != null) {
                    for (zzfo next4 : zzO) {
                        if (next4 != null) {
                            s(sb2, 2);
                            sb2.append("event {\n");
                            v(sb2, 2, "name", this.f5994a.D().q(next4.zzh()));
                            if (next4.zzu()) {
                                v(sb2, 2, "timestamp_millis", Long.valueOf(next4.zzd()));
                            }
                            if (next4.zzt()) {
                                v(sb2, 2, "previous_timestamp_millis", Long.valueOf(next4.zzc()));
                            }
                            if (next4.zzs()) {
                                v(sb2, 2, NewHtcHomeBadger.COUNT, Integer.valueOf(next4.zza()));
                            }
                            if (next4.zzb() != 0) {
                                q(sb2, 2, next4.zzi());
                            }
                            s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                s(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String F(zzej zzej) {
        if (zzej == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzej.zzp()) {
            v(sb2, 0, "filter_id", Integer.valueOf(zzej.zzb()));
        }
        v(sb2, 0, "event_name", this.f5994a.D().q(zzej.zzg()));
        String t10 = t(zzej.zzk(), zzej.zzm(), zzej.zzn());
        if (!t10.isEmpty()) {
            v(sb2, 0, "filter_type", t10);
        }
        if (zzej.zzo()) {
            w(sb2, 1, "event_count_filter", zzej.zzf());
        }
        if (zzej.zza() > 0) {
            sb2.append("  filters {\n");
            for (zzel r10 : zzej.zzh()) {
                r(sb2, 2, r10);
            }
        }
        s(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String G(zzes zzes) {
        if (zzes == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzes.zzj()) {
            v(sb2, 0, "filter_id", Integer.valueOf(zzes.zza()));
        }
        v(sb2, 0, "property_name", this.f5994a.D().s(zzes.zze()));
        String t10 = t(zzes.zzg(), zzes.zzh(), zzes.zzi());
        if (!t10.isEmpty()) {
            v(sb2, 0, "filter_type", t10);
        }
        r(sb2, 1, zzes.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final List I(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f5994a.d().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f5994a.d().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final void L(zzfr zzfr, Object obj) {
        s.k(obj);
        zzfr.zzg();
        zzfr.zze();
        zzfr.zzd();
        zzfr.zzf();
        if (obj instanceof String) {
            zzfr.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfr.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfr.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zzfr.zzb(H((Bundle[]) obj));
        } else {
            this.f5994a.d().r().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void M(zzgg zzgg, Object obj) {
        s.k(obj);
        zzgg.zzc();
        zzgg.zzb();
        zzgg.zza();
        if (obj instanceof String) {
            zzgg.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgg.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgg.zzd(((Double) obj).doubleValue());
        } else {
            this.f5994a.d().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean O(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f5994a.e().currentTimeMillis() - j10) > j11;
    }

    /* access modifiers changed from: package-private */
    public final byte[] Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f5994a.d().r().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long y(byte[] bArr) {
        s.k(bArr);
        this.f5994a.N().h();
        MessageDigest s10 = d9.s("MD5");
        if (s10 != null) {
            return d9.q0(s10.digest(bArr));
        }
        this.f5994a.d().r().a("Failed to get MD5");
        return 0;
    }
}
