package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f4651a;

    public ReferrerDetails(Bundle bundle) {
        this.f4651a = bundle;
    }

    public String a() {
        return this.f4651a.getString("install_referrer");
    }
}
