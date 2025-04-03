package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;
import s3.c;

public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    private final long zza;
    private final long zzb;

    public zzz(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final int describeContents() {
        return 0;
    }

    public final long getCreationTimestamp() {
        return this.zzb;
    }

    public final long getLastSignInTimestamp() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 1, this.zza);
        c.w(parcel, 2, this.zzb);
        c.b(parcel, a10);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.zza);
            jSONObject.put("creationTimestamp", this.zzb);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
