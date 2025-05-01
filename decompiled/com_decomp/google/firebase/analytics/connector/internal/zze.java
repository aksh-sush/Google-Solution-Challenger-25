package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import g4.a;
import java.util.HashSet;
import java.util.Set;

public final class zze implements zza {
    final Set<String> zza = new HashSet();
    /* access modifiers changed from: private */
    public final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final a zzc;
    private final a zzd;

    public zze(a aVar, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = aVar;
        a aVar2 = new a(this);
        this.zzd = aVar2;
        aVar.f(aVar2);
    }

    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    public final void zzb(Set<String> set) {
        this.zza.clear();
        Set<String> set2 = this.zza;
        HashSet hashSet = new HashSet();
        for (String next : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzc.zzf(next) && zzc.zzg(next)) {
                String zzd2 = zzc.zzd(next);
                s.k(zzd2);
                hashSet.add(zzd2);
            }
        }
        set2.addAll(hashSet);
    }

    public final void zzc() {
        this.zza.clear();
    }
}
