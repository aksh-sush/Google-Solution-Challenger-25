package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import n4.i;
import n4.j;
import y3.h;

public final class zzbm {
    private static final zzbm zza = new zzbm();
    private final zzbd zzb;
    private final zzax zzc;

    private zzbm() {
        zzbd zzc2 = zzbd.zzc();
        zzax zza2 = zzax.zza();
        this.zzb = zzc2;
        this.zzc = zza2;
    }

    public static zzbm zzc() {
        return zza;
    }

    public final i zza() {
        return this.zzb.zza();
    }

    public final i zzb() {
        return this.zzb.zzb();
    }

    public final void zzd(Context context) {
        this.zzb.zzd(context);
    }

    public final void zze(FirebaseAuth firebaseAuth) {
        this.zzb.zze(firebaseAuth);
    }

    public final void zzf(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.V());
        edit.putString("statusMessage", status.W());
        edit.putLong("timestamp", h.c().currentTimeMillis());
        edit.commit();
    }

    public final void zzg(Context context, FirebaseAuth firebaseAuth) {
        s.k(context);
        s.k(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.commit();
    }

    public final void zzh(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        s.k(context);
        s.k(firebaseAuth);
        s.k(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.putString("firebaseUserUid", firebaseUser.getUid());
        edit.commit();
    }

    public final boolean zzi(Activity activity, j jVar, FirebaseAuth firebaseAuth) {
        return this.zzc.zzf(activity, jVar, firebaseAuth, (FirebaseUser) null);
    }

    public final boolean zzj(Activity activity, j jVar, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.zzc.zzf(activity, jVar, firebaseAuth, firebaseUser);
    }
}
