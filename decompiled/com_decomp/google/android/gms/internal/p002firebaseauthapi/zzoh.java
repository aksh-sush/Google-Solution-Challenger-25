package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoh  reason: invalid package */
final class zzoh implements zzuz<zzxh> {
    final /* synthetic */ zzxg zza;
    final /* synthetic */ zzwj zzb;
    final /* synthetic */ zztl zzc;
    final /* synthetic */ zzwq zzd;
    final /* synthetic */ zzuy zze;
    final /* synthetic */ zzpt zzf;

    zzoh(zzpt zzpt, zzxg zzxg, zzwj zzwj, zztl zztl, zzwq zzwq, zzuy zzuy) {
        this.zzf = zzpt;
        this.zza = zzxg;
        this.zzb = zzwj;
        this.zzc = zztl;
        this.zzd = zzwq;
        this.zze = zzuy;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.firebase-auth-api.zzxh r7 = (com.google.android.gms.internal.p002firebaseauthapi.zzxh) r7
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r1 = "EMAIL"
            boolean r0 = r0.zzn(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            r0.zzg(r1)
            goto L_0x0026
        L_0x0013:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r0 = r0.zzk()
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzxg r2 = r6.zza
            java.lang.String r2 = r2.zzk()
            r0.zzg(r2)
        L_0x0026:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r2 = "DISPLAY_NAME"
            boolean r0 = r0.zzn(r2)
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            r0.zzf(r1)
            goto L_0x0049
        L_0x0036:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r0 = r0.zzj()
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzxg r2 = r6.zza
            java.lang.String r2 = r2.zzj()
            r0.zzf(r2)
        L_0x0049:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r2 = "PHOTO_URL"
            boolean r0 = r0.zzn(r2)
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
        L_0x0055:
            r0.zzj(r1)
            goto L_0x006a
        L_0x0059:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r0 = r0.zzm()
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzxg r1 = r6.zza
            java.lang.String r1 = r1.zzm()
            goto L_0x0055
        L_0x006a:
            com.google.android.gms.internal.firebase-auth-api.zzxg r0 = r6.zza
            java.lang.String r0 = r0.zzl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0085
            com.google.android.gms.internal.firebase-auth-api.zzwj r0 = r6.zzb
            java.lang.String r1 = "redacted"
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = y3.c.c(r1)
            r0.zzi(r1)
        L_0x0085:
            java.util.List r0 = r7.zzf()
            if (r0 != 0) goto L_0x0090
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0090:
            com.google.android.gms.internal.firebase-auth-api.zzwj r1 = r6.zzb
            r1.zzk(r0)
            com.google.android.gms.internal.firebase-auth-api.zztl r0 = r6.zzc
            com.google.android.gms.internal.firebase-auth-api.zzwq r1 = r6.zzd
            com.google.android.gms.common.internal.s.k(r1)
            com.google.android.gms.common.internal.s.k(r7)
            java.lang.String r2 = r7.zzd()
            java.lang.String r3 = r7.zze()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x00c5
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00c5
            long r4 = r7.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwq r7 = new com.google.android.gms.internal.firebase-auth-api.zzwq
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = r1.zzg()
            r7.<init>(r3, r2, r4, r1)
            r1 = r7
        L_0x00c5:
            com.google.android.gms.internal.firebase-auth-api.zzwj r7 = r6.zzb
            r0.zzi(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzoh.zzb(java.lang.Object):void");
    }
}
