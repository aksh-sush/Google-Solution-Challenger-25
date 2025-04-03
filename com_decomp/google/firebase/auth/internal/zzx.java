package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.zze;
import g9.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    private zzwq zza;
    private zzt zzb;
    private final String zzc;
    private String zzd;
    private List<zzt> zze;
    private List<String> zzf;
    private String zzg;
    private Boolean zzh;
    private zzz zzi;
    private boolean zzj;
    private zze zzk;
    private zzbb zzl;

    zzx(zzwq zzwq, zzt zzt, String str, String str2, List<zzt> list, List<String> list2, String str3, Boolean bool, zzz zzz, boolean z10, zze zze2, zzbb zzbb) {
        this.zza = zzwq;
        this.zzb = zzt;
        this.zzc = str;
        this.zzd = str2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = str3;
        this.zzh = bool;
        this.zzi = zzz;
        this.zzj = z10;
        this.zzk = zze2;
        this.zzl = zzbb;
    }

    public static FirebaseUser zzk(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        zzz zzz;
        zzx zzx = new zzx(firebaseApp, firebaseUser.getProviderData());
        if (firebaseUser instanceof zzx) {
            zzx zzx2 = (zzx) firebaseUser;
            zzx.zzg = zzx2.zzg;
            zzx.zzd = zzx2.zzd;
            zzz = zzx2.zzi;
        } else {
            zzz = null;
        }
        zzx.zzi = zzz;
        if (firebaseUser.zzd() != null) {
            zzx.zzh(firebaseUser.zzd());
        }
        if (!firebaseUser.isAnonymous()) {
            zzx.zzm();
        }
        return zzx;
    }

    public final String getDisplayName() {
        return this.zzb.getDisplayName();
    }

    public final String getEmail() {
        return this.zzb.getEmail();
    }

    public final FirebaseUserMetadata getMetadata() {
        return this.zzi;
    }

    public final /* bridge */ /* synthetic */ MultiFactor getMultiFactor() {
        return new zzac(this);
    }

    public final String getPhoneNumber() {
        return this.zzb.getPhoneNumber();
    }

    public final Uri getPhotoUrl() {
        return this.zzb.getPhotoUrl();
    }

    public final List<? extends UserInfo> getProviderData() {
        return this.zze;
    }

    public final String getProviderId() {
        return this.zzb.getProviderId();
    }

    public final String getTenantId() {
        Map map;
        zzwq zzwq = this.zza;
        if (zzwq == null || zzwq.zze() == null || (map = (Map) zzay.zza(this.zza.zze()).getClaims().get(FirebaseAuthProvider.PROVIDER_ID)) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final String getUid() {
        return this.zzb.getUid();
    }

    public final boolean isAnonymous() {
        Boolean bool = this.zzh;
        if (bool == null || bool.booleanValue()) {
            zzwq zzwq = this.zza;
            String signInProvider = zzwq != null ? zzay.zza(zzwq.zze()).getSignInProvider() : "";
            boolean z10 = false;
            if (this.zze.size() <= 1 && (signInProvider == null || !signInProvider.equals(c.PAYLOAD_OS_ROOT_CUSTOM))) {
                z10 = true;
            }
            this.zzh = Boolean.valueOf(z10);
        }
        return this.zzh.booleanValue();
    }

    public final boolean isEmailVerified() {
        return this.zzb.isEmailVerified();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = s3.c.a(parcel);
        s3.c.B(parcel, 1, this.zza, i10, false);
        s3.c.B(parcel, 2, this.zzb, i10, false);
        s3.c.D(parcel, 3, this.zzc, false);
        s3.c.D(parcel, 4, this.zzd, false);
        s3.c.H(parcel, 5, this.zze, false);
        s3.c.F(parcel, 6, this.zzf, false);
        s3.c.D(parcel, 7, this.zzg, false);
        s3.c.i(parcel, 8, Boolean.valueOf(isAnonymous()), false);
        s3.c.B(parcel, 9, this.zzi, i10, false);
        s3.c.g(parcel, 10, this.zzj);
        s3.c.B(parcel, 11, this.zzk, i10, false);
        s3.c.B(parcel, 12, this.zzl, i10, false);
        s3.c.b(parcel, a10);
    }

    public final FirebaseApp zza() {
        return FirebaseApp.getInstance(this.zzc);
    }

    public final /* bridge */ /* synthetic */ FirebaseUser zzb() {
        zzm();
        return this;
    }

    public final FirebaseUser zzc(List<? extends UserInfo> list) {
        s.k(list);
        this.zze = new ArrayList(list.size());
        this.zzf = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            UserInfo userInfo = (UserInfo) list.get(i10);
            if (userInfo.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                this.zzb = (zzt) userInfo;
            } else {
                this.zzf.add(userInfo.getProviderId());
            }
            this.zze.add((zzt) userInfo);
        }
        if (this.zzb == null) {
            this.zzb = this.zze.get(0);
        }
        return this;
    }

    public final zzwq zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zza.zze();
    }

    public final String zzf() {
        return this.zza.zzh();
    }

    public final List<String> zzg() {
        return this.zzf;
    }

    public final void zzh(zzwq zzwq) {
        this.zza = (zzwq) s.k(zzwq);
    }

    public final void zzi(List<MultiFactorInfo> list) {
        Parcelable.Creator<zzbb> creator = zzbb.CREATOR;
        zzbb zzbb = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MultiFactorInfo next : list) {
                if (next instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) next);
                }
            }
            zzbb = new zzbb(arrayList);
        }
        this.zzl = zzbb;
    }

    public final zze zzj() {
        return this.zzk;
    }

    public final zzx zzl(String str) {
        this.zzg = str;
        return this;
    }

    public final zzx zzm() {
        this.zzh = Boolean.FALSE;
        return this;
    }

    public final List<MultiFactorInfo> zzn() {
        zzbb zzbb = this.zzl;
        return zzbb != null ? zzbb.zza() : new ArrayList();
    }

    public final List<zzt> zzo() {
        return this.zze;
    }

    public final void zzp(zze zze2) {
        this.zzk = zze2;
    }

    public final void zzq(boolean z10) {
        this.zzj = z10;
    }

    public final void zzr(zzz zzz) {
        this.zzi = zzz;
    }

    public final boolean zzs() {
        return this.zzj;
    }

    public zzx(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        s.k(firebaseApp);
        this.zzc = firebaseApp.getName();
        this.zzd = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.zzg = "2";
        zzc(list);
    }
}
