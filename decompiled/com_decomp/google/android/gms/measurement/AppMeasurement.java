package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.n4;
import com.google.firebase.analytics.FirebaseAnalytics;
import h4.m;
import h4.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f5814b;

    /* renamed from: a  reason: collision with root package name */
    private final d f5815a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            s.k(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) m.a(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) m.a(bundle, FirebaseAnalytics.Param.ORIGIN, cls, (Object) null);
            this.mName = (String) m.a(bundle, "name", cls, (Object) null);
            this.mValue = m.a(bundle, FirebaseAnalytics.Param.VALUE, Object.class, (Object) null);
            this.mTriggerEventName = (String) m.a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) m.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) m.a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) m.a(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) m.a(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) m.a(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) m.a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) m.a(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) m.a(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) m.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) m.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) m.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    public AppMeasurement(n4 n4Var) {
        this.f5815a = new a(n4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f5814b
            if (r0 != 0) goto L_0x005a
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f5814b     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0055
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            h4.u r2 = (h4.u) r2     // Catch:{  }
            goto L_0x0030
        L_0x002e:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x003a
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0057 }
            r14.<init>((h4.u) r2)     // Catch:{ all -> 0x0057 }
            f5814b = r14     // Catch:{ all -> 0x0057 }
            goto L_0x0055
        L_0x003a:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0057 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.n4 r14 = com.google.android.gms.measurement.internal.n4.H(r14, r13, r1)     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0057 }
            r1.<init>((com.google.android.gms.measurement.internal.n4) r14)     // Catch:{ all -> 0x0057 }
            f5814b = r1     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x005a
        L_0x0057:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r14
        L_0x005a:
            com.google.android.gms.measurement.AppMeasurement r14 = f5814b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f5815a.a(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f5815a.b(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f5815a.e(str);
    }

    @Keep
    public long generateEventId() {
        return this.f5815a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f5815a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> c10 = this.f5815a.c(str, str2);
        ArrayList arrayList = new ArrayList(c10 == null ? 0 : c10.size());
        for (Bundle conditionalUserProperty : c10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f5815a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f5815a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f5815a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f5815a.zza(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f5815a.d(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f5815a.g(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        s.k(conditionalUserProperty);
        d dVar = this.f5815a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            m.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.f(bundle);
    }

    public AppMeasurement(u uVar) {
        this.f5815a = new b(uVar);
    }
}
