package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzy  reason: invalid package */
final class zzy extends zzac {
    final /* synthetic */ zzz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzy(zzz zzz, zzae zzae, CharSequence charSequence) {
        super(zzae, charSequence);
        this.zza = zzz;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        return i10 + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i10) {
        String str;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            if (i10 < 0) {
                str = zzaf.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
            } else if (length < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            } else {
                str = zzaf.zzb("%s (%s) must not be greater than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(length));
            }
            throw new IndexOutOfBoundsException(str);
        }
        while (i10 < length) {
            if (charSequence.charAt(i10) == '.') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
