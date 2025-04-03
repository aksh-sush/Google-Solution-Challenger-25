package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzwu;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzba {
    public static MultiFactorInfo zza(zzwu zzwu) {
        if (zzwu != null && !TextUtils.isEmpty(zzwu.zze())) {
            return new PhoneMultiFactorInfo(zzwu.zzd(), zzwu.zzc(), zzwu.zza(), s.g(zzwu.zze()));
        }
        return null;
    }

    public static List<MultiFactorInfo> zzb(List<zzwu> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (zzwu zza : list) {
            MultiFactorInfo zza2 = zza(zza);
            if (zza2 != null) {
                arrayList.add(zza2);
            }
        }
        return arrayList;
    }
}
