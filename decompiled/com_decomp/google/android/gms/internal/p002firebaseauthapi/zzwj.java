package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwj  reason: invalid package */
public final class zzwj extends a {
    public static final Parcelable.Creator<zzwj> CREATOR = new zzwk();
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzwy zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private zze zzl;
    private List<zzwu> zzm;

    public zzwj() {
        this.zzf = new zzwy();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zza, false);
        c.D(parcel, 3, this.zzb, false);
        c.g(parcel, 4, this.zzc);
        c.D(parcel, 5, this.zzd, false);
        c.D(parcel, 6, this.zze, false);
        c.B(parcel, 7, this.zzf, i10, false);
        c.D(parcel, 8, this.zzg, false);
        c.D(parcel, 9, this.zzh, false);
        c.w(parcel, 10, this.zzi);
        c.w(parcel, 11, this.zzj);
        c.g(parcel, 12, this.zzk);
        c.B(parcel, 13, this.zzl, i10, false);
        c.H(parcel, 14, this.zzm, false);
        c.b(parcel, a10);
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zze zzd() {
        return this.zzl;
    }

    public final zzwj zze(zze zze2) {
        this.zzl = zze2;
        return this;
    }

    public final zzwj zzf(String str) {
        this.zzd = str;
        return this;
    }

    public final zzwj zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzwj zzh(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final zzwj zzi(String str) {
        s.g(str);
        this.zzg = str;
        return this;
    }

    public final zzwj zzj(String str) {
        this.zze = str;
        return this;
    }

    public final zzwj zzk(List<zzww> list) {
        s.k(list);
        zzwy zzwy = new zzwy();
        this.zzf = zzwy;
        zzwy.zzc().addAll(list);
        return this;
    }

    public final zzwy zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List<zzwu> zzq() {
        return this.zzm;
    }

    public final List<zzww> zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    public zzwj(String str, String str2, boolean z10, String str3, String str4, zzwy zzwy, String str5, String str6, long j10, long j11, boolean z11, zze zze2, List<zzwu> list) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzwy == null ? new zzwy() : zzwy.zzb(zzwy);
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = z11;
        this.zzl = zze2;
        this.zzm = list == null ? new ArrayList<>() : list;
    }
}
