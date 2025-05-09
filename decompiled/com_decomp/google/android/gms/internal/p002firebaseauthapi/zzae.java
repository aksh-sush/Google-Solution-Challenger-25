package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
public final class zzae {
    /* access modifiers changed from: private */
    public final zzp zza;
    private final zzad zzb;

    private zzae(zzad zzad) {
        zzo zzo = zzo.zza;
        this.zzb = zzad;
        this.zza = zzo;
    }

    public static zzae zzb(char c10) {
        return new zzae(new zzz(new zzm('.')));
    }

    public static zzae zzc(String str) {
        zzs zza2 = zzx.zza("[.-]");
        if (!((zzt) zza2.zza("")).zza.matches()) {
            return new zzae(new zzab(zza2));
        }
        throw new IllegalArgumentException(zzaf.zzb("The pattern may not match the empty string: %s", zza2));
    }

    public final List<String> zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> zza2 = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza2.hasNext()) {
            arrayList.add(zza2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
