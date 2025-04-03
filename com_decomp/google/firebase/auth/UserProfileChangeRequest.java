package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import s3.a;
import s3.c;

public class UserProfileChangeRequest extends a {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzah();
    private String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private Uri zze;

    public static class Builder {
        private String zza;
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        public UserProfileChangeRequest build() {
            String str = this.zza;
            Uri uri = this.zzb;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.zzc, this.zzd);
        }

        public String getDisplayName() {
            return this.zza;
        }

        public Uri getPhotoUri() {
            return this.zzb;
        }

        public Builder setDisplayName(String str) {
            if (str == null) {
                this.zzc = true;
            } else {
                this.zza = str;
            }
            return this;
        }

        public Builder setPhotoUri(Uri uri) {
            if (uri == null) {
                this.zzd = true;
            } else {
                this.zzb = uri;
            }
            return this;
        }
    }

    UserProfileChangeRequest(String str, String str2, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String getDisplayName() {
        return this.zza;
    }

    public Uri getPhotoUri() {
        return this.zze;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, getDisplayName(), false);
        c.D(parcel, 3, this.zzb, false);
        c.g(parcel, 4, this.zzc);
        c.g(parcel, 5, this.zzd);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
