package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import s3.c;

public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzg();
    private String zza;
    private String zzb;
    private final String zzc;
    private String zzd;
    private boolean zze;

    EmailAuthCredential(String str, String str2, String str3, String str4, boolean z10) {
        this.zza = s.g(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = com.google.firebase.auth.ActionCodeUrl.parseLink(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzi(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.firebase.auth.ActionCodeUrl r2 = com.google.firebase.auth.ActionCodeUrl.parseLink(r2)
            if (r2 == 0) goto L_0x0017
            int r2 = r2.getOperation()
            r0 = 4
            if (r2 != r0) goto L_0x0017
            r2 = 1
            return r2
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.EmailAuthCredential.zzi(java.lang.String):boolean");
    }

    public String getProvider() {
        return "password";
    }

    public String getSignInMethod() {
        return !TextUtils.isEmpty(this.zzb) ? "password" : EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.D(parcel, 4, this.zzd, false);
        c.g(parcel, 5, this.zze);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return new EmailAuthCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final EmailAuthCredential zzb(FirebaseUser firebaseUser) {
        this.zzd = firebaseUser.zzf();
        this.zze = true;
        return this;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return !TextUtils.isEmpty(this.zzc);
    }

    public final boolean zzh() {
        return this.zze;
    }
}
