package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public class DynamicLinkData extends a {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new DynamicLinkDataCreator();
    private long clickTimestamp;
    private String deepLink;
    private String dynamicLink;
    private Bundle extensionBundle;
    private int minVersion;
    private Uri redirectUrl;

    public DynamicLinkData(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.dynamicLink = str;
        this.deepLink = str2;
        this.minVersion = i10;
        this.clickTimestamp = j10;
        this.extensionBundle = bundle;
        this.redirectUrl = uri;
    }

    public long getClickTimestamp() {
        return this.clickTimestamp;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getDynamicLink() {
        return this.dynamicLink;
    }

    public Bundle getExtensionBundle() {
        Bundle bundle = this.extensionBundle;
        return bundle == null ? new Bundle() : bundle;
    }

    public int getMinVersion() {
        return this.minVersion;
    }

    public Uri getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setClickTimestamp(long j10) {
        this.clickTimestamp = j10;
    }

    public void setDeepLink(String str) {
        this.deepLink = str;
    }

    public void setDynamicLink(String str) {
        this.dynamicLink = str;
    }

    public void setExtensionData(Bundle bundle) {
        this.extensionBundle = bundle;
    }

    public void setMinVersion(int i10) {
        this.minVersion = i10;
    }

    public void setRedirectUrl(Uri uri) {
        this.redirectUrl = uri;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        DynamicLinkDataCreator.writeToParcel(this, parcel, i10);
    }
}
