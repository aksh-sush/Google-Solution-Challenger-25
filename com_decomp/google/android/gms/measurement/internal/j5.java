package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcl;

public final class j5 {

    /* renamed from: a  reason: collision with root package name */
    final Context f6110a;

    /* renamed from: b  reason: collision with root package name */
    String f6111b;

    /* renamed from: c  reason: collision with root package name */
    String f6112c;

    /* renamed from: d  reason: collision with root package name */
    String f6113d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f6114e;

    /* renamed from: f  reason: collision with root package name */
    long f6115f;

    /* renamed from: g  reason: collision with root package name */
    zzcl f6116g;

    /* renamed from: h  reason: collision with root package name */
    boolean f6117h = true;

    /* renamed from: i  reason: collision with root package name */
    final Long f6118i;

    /* renamed from: j  reason: collision with root package name */
    String f6119j;

    public j5(Context context, zzcl zzcl, Long l10) {
        s.k(context);
        Context applicationContext = context.getApplicationContext();
        s.k(applicationContext);
        this.f6110a = applicationContext;
        this.f6118i = l10;
        if (zzcl != null) {
            this.f6116g = zzcl;
            this.f6111b = zzcl.zzf;
            this.f6112c = zzcl.zze;
            this.f6113d = zzcl.zzd;
            this.f6117h = zzcl.zzc;
            this.f6115f = zzcl.zzb;
            this.f6119j = zzcl.zzh;
            Bundle bundle = zzcl.zzg;
            if (bundle != null) {
                this.f6114e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
