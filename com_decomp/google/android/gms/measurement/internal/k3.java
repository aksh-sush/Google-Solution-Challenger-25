package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6135a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6136b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6137c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f6138d;

    public k3(String str, String str2, Bundle bundle, long j10) {
        this.f6135a = str;
        this.f6136b = str2;
        this.f6138d = bundle;
        this.f6137c = j10;
    }

    public static k3 b(t tVar) {
        return new k3(tVar.f6408e, tVar.f6410g, tVar.f6409f.V(), tVar.f6411h);
    }

    public final t a() {
        return new t(this.f6135a, new r(new Bundle(this.f6138d)), this.f6136b, this.f6137c);
    }

    public final String toString() {
        String str = this.f6136b;
        String str2 = this.f6135a;
        String valueOf = String.valueOf(this.f6138d);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
