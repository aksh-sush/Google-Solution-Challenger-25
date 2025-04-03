package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zza;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final g4.a zza;
    final Map<String, zza> zzb = new ConcurrentHashMap();

    class a implements AnalyticsConnector.AnalyticsConnectorHandle {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7673a;

        a(String str) {
            this.f7673a = str;
        }

        public void registerEventNames(Set set) {
            if (AnalyticsConnectorImpl.this.zzc(this.f7673a) && this.f7673a.equals("fiam") && set != null && !set.isEmpty()) {
                AnalyticsConnectorImpl.this.zzb.get(this.f7673a).zzb(set);
            }
        }

        public final void unregister() {
            if (AnalyticsConnectorImpl.this.zzc(this.f7673a)) {
                AnalyticsConnector.AnalyticsConnectorListener zza = AnalyticsConnectorImpl.this.zzb.get(this.f7673a).zza();
                if (zza != null) {
                    zza.onMessageTriggered(0, (Bundle) null);
                }
                AnalyticsConnectorImpl.this.zzb.remove(this.f7673a);
            }
        }

        public void unregisterEventNames() {
            if (AnalyticsConnectorImpl.this.zzc(this.f7673a) && this.f7673a.equals("fiam")) {
                AnalyticsConnectorImpl.this.zzb.get(this.f7673a).zzc();
            }
        }
    }

    AnalyticsConnectorImpl(g4.a aVar) {
        s.k(aVar);
        this.zza = aVar;
    }

    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    static /* synthetic */ void zza(Event event) {
        boolean z10 = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) s.k(zzc)).zza.i(z10);
        }
    }

    /* access modifiers changed from: private */
    public final boolean zzc(String str) {
        return !str.isEmpty() && this.zzb.containsKey(str) && this.zzb.get(str) != null;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zzj(str2, bundle)) {
            this.zza.a(str, str2, bundle);
        }
    }

    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle zzb2 : this.zza.b(str, str2)) {
            arrayList.add(zzc.zzb(zzb2));
        }
        return arrayList;
    }

    public int getMaxUserProperties(String str) {
        return this.zza.c(str);
    }

    public Map<String, Object> getUserProperties(boolean z10) {
        return this.zza.d((String) null, (String) null, z10);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.zzl(str) && zzc.zzj(str2, bundle) && zzc.zzh(str, str2, bundle)) {
            zzc.zze(str, str2, bundle);
            this.zza.e(str, str2, bundle);
        }
    }

    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        s.k(analyticsConnectorListener);
        if (!zzc.zzl(str) || zzc(str)) {
            return null;
        }
        g4.a aVar = this.zza;
        Object zze = "fiam".equals(str) ? new zze(aVar, analyticsConnectorListener) : ("crash".equals(str) || "clx".equals(str)) ? new zzg(aVar, analyticsConnectorListener) : null;
        if (zze == null) {
            return null;
        }
        this.zzb.put(str, zze);
        return new a(str);
    }

    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzc.zzi(conditionalUserProperty)) {
            this.zza.g(zzc.zza(conditionalUserProperty));
        }
    }

    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zzl(str) && zzc.zzm(str, str2)) {
            this.zza.h(str, str2, obj);
        }
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        s.k(firebaseApp);
        s.k(context);
        s.k(subscriber);
        s.k(context.getApplicationContext());
        if (zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (zzc == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(DataCollectionDefaultChange.class, zzb.zza, zza.zza);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzc = new AnalyticsConnectorImpl(zzee.zzg(context, (String) null, (String) null, (String) null, bundle).zzd());
                }
            }
        }
        return zzc;
    }
}
