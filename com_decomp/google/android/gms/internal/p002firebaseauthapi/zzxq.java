package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzi;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxq  reason: invalid package */
public final class zzxq extends a implements zzui {
    public static final Parcelable.Creator<zzxq> CREATOR = new zzxr();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzxq() {
        this.zzi = true;
        this.zzj = true;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zza, false);
        c.D(parcel, 3, this.zzb, false);
        c.D(parcel, 4, this.zzc, false);
        c.D(parcel, 5, this.zzd, false);
        c.D(parcel, 6, this.zze, false);
        c.D(parcel, 7, this.zzf, false);
        c.D(parcel, 8, this.zzg, false);
        c.D(parcel, 9, this.zzh, false);
        c.g(parcel, 10, this.zzi);
        c.g(parcel, 11, this.zzj);
        c.D(parcel, 12, this.zzk, false);
        c.D(parcel, 13, this.zzl, false);
        c.D(parcel, 14, this.zzm, false);
        c.D(parcel, 15, this.zzn, false);
        c.g(parcel, 16, this.zzo);
        c.D(parcel, 17, this.zzp, false);
        c.b(parcel, a10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "autoCreate"
            boolean r2 = r3.zzj
            r0.put(r1, r2)
            java.lang.String r1 = "returnSecureToken"
            boolean r2 = r3.zzi
            r0.put(r1, r2)
            java.lang.String r1 = r3.zzb
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x001c:
            java.lang.String r1 = r3.zzg
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L_0x0025:
            java.lang.String r1 = r3.zzn
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x002e:
            java.lang.String r1 = r3.zzp
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L_0x0037:
            java.lang.String r1 = r3.zzl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = "sessionId"
            java.lang.String r2 = r3.zzl
            r0.put(r1, r2)
        L_0x0046:
            java.lang.String r1 = r3.zzm
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = r3.zzm
        L_0x0052:
            r0.put(r2, r1)
            goto L_0x005b
        L_0x0056:
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            java.lang.String r1 = "returnIdpCredential"
            boolean r2 = r3.zzo
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzxq.zza():java.lang.String");
    }

    public final zzxq zzb(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzxq zzc(String str) {
        this.zzb = s.g(str);
        return this;
    }

    public final zzxq zzd(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzxq zze(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzxq zzf(String str) {
        this.zzn = str;
        return this;
    }

    public zzxq(zzi zzi2, String str) {
        s.k(zzi2);
        this.zzl = s.g(zzi2.zzd());
        this.zzm = s.g(str);
        this.zze = s.g(zzi2.zzc());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzxq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.zzd) || !TextUtils.isEmpty(this.zzk)) {
            this.zze = s.g(str3);
            this.zzf = null;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(this.zzc)) {
                sb2.append("id_token=");
                sb2.append(this.zzc);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                sb2.append("access_token=");
                sb2.append(this.zzd);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                sb2.append("identifier=");
                sb2.append(this.zzf);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzh)) {
                sb2.append("oauth_token_secret=");
                sb2.append(this.zzh);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzk)) {
                sb2.append("code=");
                sb2.append(this.zzk);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb2.append("nonce=");
                sb2.append(str9);
                sb2.append("&");
            }
            sb2.append("providerId=");
            sb2.append(this.zze);
            this.zzg = sb2.toString();
            this.zzj = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    zzxq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
