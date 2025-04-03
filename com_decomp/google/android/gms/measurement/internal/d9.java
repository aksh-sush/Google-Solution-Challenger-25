package com.google.android.gms.measurement.internal;

import a4.e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.firestore.util.ExponentialBackoff;
import h4.m;
import h4.n;
import h4.o;
import h4.p;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import q3.k;
import y3.f;

public final class d9 extends h5 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f5921g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f5922h = {"_err"};

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f5923i = Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f5924j = Pattern.compile("^(gmail|googlemail)\\.");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f5925k = Pattern.compile("[\\s-()/.]+");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f5926l = Pattern.compile("^\\+\\d{11,15}$");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f5927m = Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f5928n = Pattern.compile("\\s+");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f5929o = 0;

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f5930c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f5931d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f5932e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f5933f = null;

    d9(n4 n4Var) {
        super(n4Var);
    }

    static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean W(String str) {
        s.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean X(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.s.k(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d9.X(android.content.Context):boolean");
    }

    static boolean Y(Context context, boolean z10) {
        s.k(context);
        return i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean a0(String str) {
        return !f5922h[0].equals(str);
    }

    static final boolean d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    static final boolean e0(String str) {
        s.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.f5994a.z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f5994a.z();
            return 256;
        } else if (!this.f5994a.z().B((String) null, y2.f6619d0) || !"_lgclid".equals(str)) {
            this.f5994a.z();
            return 36;
        } else {
            this.f5994a.z();
            return 100;
        }
    }

    private final Object g0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return q(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u02 = u0((Bundle) parcelable);
                    if (!u02.isEmpty()) {
                        arrayList.add(u02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private static boolean h0(String str, String[] strArr) {
        s.k(strArr);
        for (String Z : strArr) {
            if (Z(str, Z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean i0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d9.i0(android.content.Context, java.lang.String):boolean");
    }

    static long q0(byte[] bArr) {
        s.k(bArr);
        int length = bArr.length;
        int i10 = 0;
        s.n(length > 0);
        int i11 = length - 1;
        long j10 = 0;
        while (i11 >= 0 && i11 >= bArr.length - 8) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
            i11--;
        }
        return j10;
    }

    static MessageDigest s(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList u(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f5873e);
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, cVar.f5874f);
            bundle.putLong("creation_timestamp", cVar.f5876h);
            bundle.putString("name", cVar.f5875g.f6689f);
            m.b(bundle, cVar.f5875g.U());
            bundle.putBoolean("active", cVar.f5877i);
            String str = cVar.f5878j;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            t tVar = cVar.f5879k;
            if (tVar != null) {
                bundle.putString("timed_out_event_name", tVar.f6408e);
                r rVar = cVar.f5879k.f6409f;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.V());
                }
            }
            bundle.putLong("trigger_timeout", cVar.f5880l);
            t tVar2 = cVar.f5881m;
            if (tVar2 != null) {
                bundle.putString("triggered_event_name", tVar2.f6408e);
                r rVar2 = cVar.f5881m.f6409f;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.V());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f5875g.f6690g);
            bundle.putLong("time_to_live", cVar.f5882n);
            t tVar3 = cVar.f5883o;
            if (tVar3 != null) {
                bundle.putString("expired_event_name", tVar3.f6408e);
                r rVar3 = cVar.f5883o.f6409f;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.V());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void x(o6 o6Var, Bundle bundle, boolean z10) {
        if (!(bundle == null || o6Var == null)) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = o6Var.f6284a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = o6Var.f6285b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", o6Var.f6286c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && o6Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    public final void A(c9 c9Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        c9Var.a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    public final void B(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f5994a.d().x().c("Not putting event parameter. Invalid value type. name, type", this.f5994a.D().r(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void C(zzcf zzcf, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void D(zzcf zzcf, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void E(zzcf zzcf, Bundle bundle) {
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void F(zzcf zzcf, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void G(zzcf zzcf, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning int value to wrapper", e10);
        }
    }

    public final void H(zzcf zzcf, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning long value to wrapper", e10);
        }
    }

    public final void I(zzcf zzcf, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5994a.d().w().b("Error returning string value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int i11;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            this.f5994a.z();
            int i12 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int m02 = !z10 ? m0(str6) : 0;
                    if (m02 == 0) {
                        m02 = l0(str6);
                    }
                    i10 = m02;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    w(bundle, i10, str6, str6, i10 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (T(bundle2.get(str6))) {
                        this.f5994a.d().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        str4 = str6;
                        i11 = 22;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i11 = O(str, str2, str6, bundle2.get(str6), bundle, list, z10, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        w(bundle, i11, str4, str4, bundle2.get(str4));
                    } else if (W(str4) && !h0(str4, o.f10967d) && (i12 = i12 + 1) > 0) {
                        this.f5994a.d().s().c("Item cannot contain custom parameters", this.f5994a.D().q(str5), this.f5994a.D().p(bundle2));
                        d0(bundle2, 23);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean K(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            zzoq.zzc();
            if (this.f5994a.z().B((String) null, y2.f6623f0) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (this.f5994a.q()) {
                    this.f5994a.d().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (e0(str2)) {
                return true;
            } else {
                this.f5994a.d().s().b("Invalid admob_app_id. Analytics disabled.", j3.z(str2));
                return false;
            }
        } else if (e0(str)) {
            return true;
        } else {
            if (this.f5994a.q()) {
                this.f5994a.d().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", j3.z(str));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean L(String str, int i10, String str2) {
        if (str2 == null) {
            this.f5994a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            this.f5994a.d().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f5994a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        s.k(str2);
        String[] strArr3 = f5921g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f5994a.d().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && h0(str2, strArr2)) {
            return true;
        }
        this.f5994a.d().s().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean N(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                this.f5994a.d().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.h()
            boolean r2 = r14.T(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00ad
            if (r22 == 0) goto L_0x00aa
            java.lang.String[] r2 = h4.o.f10966c
            boolean r2 = h0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.v7 r2 = r2.L()
            r2.h()
            r2.i()
            boolean r5 = r2.B()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.d9 r2 = r2.N()
            int r2 = r2.o0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            r2.z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00ad
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00ad
            com.google.android.gms.measurement.internal.n4 r9 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.x()
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.d(r10, r3, r8, r5)
            com.google.android.gms.measurement.internal.n4 r5 = r7.f5994a
            r5.z()
            r5 = 17
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r9 = r2.length
            if (r9 <= r6) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r9 = r2.size()
            if (r9 <= r6) goto L_0x00a7
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r9.<init>(r2)
            r1.putParcelableArrayList(r8, r9)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.g r1 = r1.z()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.T
            r10 = r15
            boolean r1 = r1.B(r15, r2)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = V(r16)
            if (r1 != 0) goto L_0x00c9
        L_0x00c3:
            boolean r1 = V(r17)
            if (r1 == 0) goto L_0x00d1
        L_0x00c9:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.z()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d8
        L_0x00d1:
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            r1.z()
            r1 = 100
        L_0x00d8:
            boolean r1 = r14.N(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00df
            return r9
        L_0x00df:
            if (r22 == 0) goto L_0x016f
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.J(r1, r2, r3, r4, r5, r6)
            goto L_0x016e
        L_0x00f7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012f
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x0100:
            if (r13 >= r12) goto L_0x016e
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
        L_0x0118:
            r1.c(r2, r0, r8)
            goto L_0x016f
        L_0x011c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0100
        L_0x012f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x016f
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x013b:
            if (r13 >= r12) goto L_0x016e
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015b
            com.google.android.gms.measurement.internal.n4 r1 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.x()
            if (r0 == 0) goto L_0x0156
            java.lang.Class r0 = r0.getClass()
            goto L_0x0158
        L_0x0156:
            java.lang.String r0 = "null"
        L_0x0158:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            goto L_0x0118
        L_0x015b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013b
        L_0x016e:
            return r9
        L_0x016f:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d9.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    public final boolean P(String str, String str2) {
        if (str2 == null) {
            this.f5994a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f5994a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f5994a.d().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f5994a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.f5994a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f5994a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f5994a.d().s().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f5994a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean R(String str) {
        h();
        if (e.a(this.f5994a.c()).a(str) == 0) {
            return true;
        }
        this.f5994a.d().q().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u10 = this.f5994a.z().u();
        this.f5994a.f();
        return u10.equals(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    public final boolean U(Context context, String str) {
        h3 h3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = e.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e11) {
            e = e11;
            h3Var = this.f5994a.d().r();
            str2 = "Error obtaining certificate";
            h3Var.b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e12) {
            e = e12;
            h3Var = this.f5994a.d().r();
            str2 = "Package name not found";
            h3Var.b(str2, e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            s.k(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f5994a.d().w().a("Utils falling back to Random for random id");
            }
        }
        this.f5931d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int j0(String str, Object obj) {
        return N("_ldl".equals(str) ? "user property referrer" : "user property", str, f0(str), obj) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final int k0(String str) {
        if (!P("event", str)) {
            return 2;
        }
        if (!M("event", n.f10960a, n.f10961b, str)) {
            return 13;
        }
        this.f5994a.z();
        return !L("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int l0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f5994a.z();
        return !L("event param", 40, str) ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int m0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f5994a.z();
        return !L("event param", 40, str) ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int n0(String str) {
        if (!P("user property", str)) {
            return 6;
        }
        if (!M("user property", p.f10968a, (String[]) null, str)) {
            return 15;
        }
        this.f5994a.z();
        return !L("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    public final Object o(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f5994a.z();
            return g0(256, obj, true, true);
        }
        if (V(str)) {
            this.f5994a.z();
        } else {
            this.f5994a.z();
            i10 = 100;
        }
        return g0(i10, obj, false, true);
    }

    public final int o0() {
        if (this.f5933f == null) {
            this.f5933f = Integer.valueOf(k.h().b(this.f5994a.c()) / 1000);
        }
        return this.f5933f.intValue();
    }

    /* access modifiers changed from: package-private */
    public final Object p(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int f02 = f0(str);
        return equals ? g0(f02, obj, true, false) : g0(f02, obj, false, false);
    }

    public final int p0(int i10) {
        return k.h().j(this.f5994a.c(), q3.o.f14688a);
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final URL r(long j10, String str, String str2, long j11) {
        try {
            s.g(str2);
            s.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{42097L, Integer.valueOf(o0())}), str2, str, Long.valueOf(j11)});
            if (str.equals(this.f5994a.z().v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f5994a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    public final long r0() {
        int i10 = (this.f5931d.get() > 0 ? 1 : (this.f5931d.get() == 0 ? 0 : -1));
        synchronized (this.f5931d) {
            if (i10 == 0) {
                long nextLong = new Random(System.nanoTime() ^ this.f5994a.e().currentTimeMillis()).nextLong();
                int i11 = this.f5932e + 1;
                this.f5932e = i11;
                long j10 = nextLong + ((long) i11);
                return j10;
            }
            this.f5931d.compareAndSet(-1, 1);
            long andIncrement = this.f5931d.getAndIncrement();
            return andIncrement;
        }
    }

    public final long s0(long j10, long j11) {
        return (j10 + (j11 * ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom t() {
        h();
        if (this.f5930c == null) {
            this.f5930c = new SecureRandom();
        }
        return this.f5930c;
    }

    /* access modifiers changed from: package-private */
    public final Bundle t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f5994a.d().w().b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object o10 = o(next, bundle.get(next));
                if (o10 == null) {
                    this.f5994a.d().x().b("Param value can't be null", this.f5994a.D().r(next));
                } else {
                    B(bundle2, next, o10);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final void v(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f5994a.d().w().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = h4.n.f10963d
            boolean r13 = h0(r10, r0)
            if (r11 == 0) goto L_0x010d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.n4 r0 = r9.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            int r8 = r0.m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0048
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r2 = 0
            goto L_0x0057
        L_0x0048:
            if (r25 != 0) goto L_0x004f
            int r0 = r9.m0(r7)
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.l0(r7)
        L_0x0056:
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x006d
            r0 = 3
            if (r2 != r0) goto L_0x005e
            r5 = r7
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.w(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0108
        L_0x006d:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x0098
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.w(r1, r2, r3, r4, r5)
            goto L_0x00ba
        L_0x0098:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bc
            r0 = 21
            if (r2 != r0) goto L_0x00aa
            r3 = r10
            goto L_0x00ab
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.w(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0108
        L_0x00ba:
            r6 = r19
        L_0x00bc:
            boolean r0 = W(r6)
            if (r0 == 0) goto L_0x0108
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.n4 r2 = r9.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.s()
            com.google.android.gms.measurement.internal.n4 r3 = r9.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r10)
            com.google.android.gms.measurement.internal.n4 r4 = r9.f5994a
            com.google.android.gms.measurement.internal.e3 r4 = r4.D()
            java.lang.String r4 = r4.p(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            d0(r15, r1)
            r15.remove(r6)
        L_0x0106:
            r18 = r0
        L_0x0108:
            r8 = r14
            goto L_0x0030
        L_0x010b:
            r14 = r15
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d9.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final void w(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (d0(bundle, i10)) {
            this.f5994a.z();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                s.k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final t w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v02 = v0(str, str2, bundle3, f.a("_o"), true);
            if (z10) {
                v02 = u0(v02);
            }
            s.k(v02);
            return new t(str2, new r(v02), str3, j10);
        }
        this.f5994a.d().r().b("Invalid conditional property event name", this.f5994a.D().s(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final void y(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f5994a.N().B(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(k3 k3Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(k3Var.f6138d.keySet())) {
            if (W(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i10);
                sb2.append(" params");
                this.f5994a.d().s().c(sb2.toString(), this.f5994a.D().q(k3Var.f6135a), this.f5994a.D().p(k3Var.f6138d));
                d0(k3Var.f6138d, 5);
                k3Var.f6138d.remove(str);
            }
        }
    }
}
