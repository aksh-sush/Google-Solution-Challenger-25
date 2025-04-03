package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import b4.a;
import java.util.Map;

public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcf zzcf);

    void getAppInstanceId(zzcf zzcf);

    void getCachedAppInstanceId(zzcf zzcf);

    void getConditionalUserProperties(String str, String str2, zzcf zzcf);

    void getCurrentScreenClass(zzcf zzcf);

    void getCurrentScreenName(zzcf zzcf);

    void getGmpAppId(zzcf zzcf);

    void getMaxUserProperties(String str, zzcf zzcf);

    void getTestFlag(zzcf zzcf, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcf zzcf);

    void initForTests(Map map);

    void initialize(a aVar, zzcl zzcl, long j10);

    void isDataCollectionEnabled(zzcf zzcf);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j10);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(a aVar, long j10);

    void onActivityPaused(a aVar, long j10);

    void onActivityResumed(a aVar, long j10);

    void onActivitySaveInstanceState(a aVar, zzcf zzcf, long j10);

    void onActivityStarted(a aVar, long j10);

    void onActivityStopped(a aVar, long j10);

    void performAction(Bundle bundle, zzcf zzcf, long j10);

    void registerOnMeasurementEventListener(zzci zzci);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzci);

    void setInstanceIdProvider(zzck zzck);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzci zzci);
}
