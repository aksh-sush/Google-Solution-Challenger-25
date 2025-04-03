package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import g4.a;
import java.util.Set;

public final class zzg implements zza {
    /* access modifiers changed from: private */
    public final AnalyticsConnector.AnalyticsConnectorListener zza;
    private final a zzb;
    private final b zzc;

    public zzg(a aVar, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = aVar;
        b bVar = new b(this);
        this.zzc = bVar;
        aVar.f(bVar);
    }

    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    public final void zzb(Set<String> set) {
    }

    public final void zzc() {
    }
}
