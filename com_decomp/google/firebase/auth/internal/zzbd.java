package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n4.i;
import y3.h;

public final class zzbd {
    static final long zza = 3600000;
    private static final List<String> zzb = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"}));
    private static final zzbd zzc = new zzbd();
    private i zzd;
    private i zze;
    private long zzf = 0;

    private zzbd() {
    }

    public static zzbd zzc() {
        return zzc;
    }

    private static final void zzf(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : zzb) {
            edit.remove(remove);
        }
        edit.commit();
    }

    public final i zza() {
        if (h.c().currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final i zzb() {
        if (h.c().currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    public final void zzd(Context context) {
        s.k(context);
        zzf(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.s.k(r13)
            com.google.firebase.FirebaseApp r0 = r13.getApp()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.firebase.FirebaseApp r4 = r13.getApp()
            java.lang.String r4 = r4.getName()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            r5 = -1
            java.lang.String r6 = "operation"
            r7 = 0
            java.lang.String r9 = "timestamp"
            r10 = 0
            if (r4 == 0) goto L_0x00e4
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzxq> r4 = com.google.android.gms.internal.p002firebaseauthapi.zzxq.CREATOR
            s3.d r1 = s3.e.c(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.zzxq r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzxq) r1
            java.lang.String r4 = r0.getString(r6, r3)
            java.lang.String r6 = "tenantId"
            java.lang.String r6 = r0.getString(r6, r10)
            java.lang.String r11 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r11, r3)
            long r7 = r0.getLong(r9, r7)
            r12.zzf = r7
            if (r6 == 0) goto L_0x0063
            r13.setTenantId(r6)
            r1.zzf(r6)
        L_0x0063:
            int r6 = r4.hashCode()
            r7 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x008c
            r7 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r6 == r7) goto L_0x0082
            r7 = 1450464913(0x56745691, float:6.7163159E13)
            if (r6 == r7) goto L_0x0079
            goto L_0x0096
        L_0x0079:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0082:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0096
            r2 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0096
            r2 = 2
            goto L_0x0097
        L_0x0096:
            r2 = -1
        L_0x0097:
            if (r2 == 0) goto L_0x00d6
            if (r2 == r9) goto L_0x00bb
            if (r2 == r8) goto L_0x00a0
        L_0x009d:
            r12.zzd = r10
            goto L_0x00e0
        L_0x00a0:
            com.google.firebase.auth.FirebaseUser r2 = r13.getCurrentUser()
            java.lang.String r2 = r2.getUid()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009d
            com.google.firebase.auth.FirebaseUser r2 = r13.getCurrentUser()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.zzb(r1)
            n4.i r13 = r13.zzf(r2, r1)
            goto L_0x00de
        L_0x00bb:
            com.google.firebase.auth.FirebaseUser r2 = r13.getCurrentUser()
            java.lang.String r2 = r2.getUid()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x009d
            com.google.firebase.auth.FirebaseUser r2 = r13.getCurrentUser()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.zzb(r1)
            n4.i r13 = r13.zzd(r2, r1)
            goto L_0x00de
        L_0x00d6:
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.zzb(r1)
            n4.i r13 = r13.signInWithCredential(r1)
        L_0x00de:
            r12.zzd = r13
        L_0x00e0:
            zzf(r0)
            return
        L_0x00e4:
            java.lang.String r13 = "recaptchaToken"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x011d
            java.lang.String r13 = r0.getString(r13, r3)
            java.lang.String r1 = r0.getString(r6, r3)
            long r3 = r0.getLong(r9, r7)
            r12.zzf = r3
            int r3 = r1.hashCode()
            r4 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r3 == r4) goto L_0x0104
            goto L_0x010d
        L_0x0104:
            java.lang.String r3 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r2 = -1
        L_0x010e:
            if (r2 == 0) goto L_0x0113
            r12.zze = r10
            goto L_0x0119
        L_0x0113:
            n4.i r13 = n4.l.e(r13)
            r12.zze = r13
        L_0x0119:
            zzf(r0)
            return
        L_0x011d:
            java.lang.String r13 = "statusCode"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x0149
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r13 = r0.getInt(r13, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r13, (java.lang.String) r1)
            long r3 = r0.getLong(r9, r7)
            r12.zzf = r3
            zzf(r0)
            com.google.firebase.FirebaseException r13 = com.google.android.gms.internal.p002firebaseauthapi.zzto.zza(r2)
            n4.i r13 = n4.l.d(r13)
            r12.zzd = r13
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbd.zze(com.google.firebase.auth.FirebaseAuth):void");
    }
}
