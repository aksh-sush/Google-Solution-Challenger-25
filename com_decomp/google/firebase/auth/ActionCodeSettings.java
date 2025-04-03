package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import s3.c;

public class ActionCodeSettings extends a {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zzb();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final String zzf;
    private final boolean zzg;
    private String zzh;
    private int zzi;
    private String zzj;

    public static class Builder {
        /* access modifiers changed from: private */
        public String zza;
        /* access modifiers changed from: private */
        public String zzb;
        /* access modifiers changed from: private */
        public String zzc;
        /* access modifiers changed from: private */
        public boolean zzd;
        /* access modifiers changed from: private */
        public String zze;
        /* access modifiers changed from: private */
        public boolean zzf = false;
        /* access modifiers changed from: private */
        public String zzg;

        private Builder() {
        }

        public ActionCodeSettings build() {
            if (this.zza != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public String getDynamicLinkDomain() {
            return this.zzg;
        }

        public boolean getHandleCodeInApp() {
            return this.zzf;
        }

        public String getIOSBundleId() {
            return this.zzb;
        }

        public String getUrl() {
            return this.zza;
        }

        public Builder setAndroidPackageName(String str, boolean z10, String str2) {
            this.zzc = str;
            this.zzd = z10;
            this.zze = str2;
            return this;
        }

        public Builder setDynamicLinkDomain(String str) {
            this.zzg = str;
            return this;
        }

        public Builder setHandleCodeInApp(boolean z10) {
            this.zzf = z10;
            return this;
        }

        public Builder setIOSBundleId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.zza = str;
            return this;
        }

        /* synthetic */ Builder(a aVar) {
        }
    }

    private ActionCodeSettings(Builder builder) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = null;
        this.zzd = builder.zzc;
        this.zze = builder.zzd;
        this.zzf = builder.zze;
        this.zzg = builder.zzf;
        this.zzj = builder.zzg;
    }

    public static Builder newBuilder() {
        return new Builder((a) null);
    }

    public static ActionCodeSettings zzb() {
        return new ActionCodeSettings(new Builder((a) null));
    }

    public boolean canHandleCodeInApp() {
        return this.zzg;
    }

    public boolean getAndroidInstallApp() {
        return this.zze;
    }

    public String getAndroidMinimumVersion() {
        return this.zzf;
    }

    public String getAndroidPackageName() {
        return this.zzd;
    }

    public String getIOSBundle() {
        return this.zzb;
    }

    public String getUrl() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, getUrl(), false);
        c.D(parcel, 2, getIOSBundle(), false);
        c.D(parcel, 3, this.zzc, false);
        c.D(parcel, 4, getAndroidPackageName(), false);
        c.g(parcel, 5, getAndroidInstallApp());
        c.D(parcel, 6, getAndroidMinimumVersion(), false);
        c.g(parcel, 7, canHandleCodeInApp());
        c.D(parcel, 8, this.zzh, false);
        c.t(parcel, 9, this.zzi);
        c.D(parcel, 10, this.zzj, false);
        c.b(parcel, a10);
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzh;
    }

    public final void zzf(String str) {
        this.zzh = str;
    }

    public final void zzg(int i10) {
        this.zzi = i10;
    }

    ActionCodeSettings(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z10;
        this.zzf = str5;
        this.zzg = z11;
        this.zzh = str6;
        this.zzi = i10;
        this.zzj = str7;
    }
}
