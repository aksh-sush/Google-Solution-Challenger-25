package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;
import q3.d;
import s3.a;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new x1();

    /* renamed from: s  reason: collision with root package name */
    static final Scope[] f5628s = new Scope[0];

    /* renamed from: t  reason: collision with root package name */
    static final d[] f5629t = new d[0];

    /* renamed from: e  reason: collision with root package name */
    final int f5630e;

    /* renamed from: f  reason: collision with root package name */
    final int f5631f;

    /* renamed from: g  reason: collision with root package name */
    final int f5632g;

    /* renamed from: h  reason: collision with root package name */
    String f5633h;

    /* renamed from: i  reason: collision with root package name */
    IBinder f5634i;

    /* renamed from: j  reason: collision with root package name */
    Scope[] f5635j;

    /* renamed from: k  reason: collision with root package name */
    Bundle f5636k;

    /* renamed from: l  reason: collision with root package name */
    Account f5637l;

    /* renamed from: m  reason: collision with root package name */
    d[] f5638m;

    /* renamed from: n  reason: collision with root package name */
    d[] f5639n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f5640o;

    /* renamed from: p  reason: collision with root package name */
    final int f5641p;

    /* renamed from: q  reason: collision with root package name */
    boolean f5642q;

    /* renamed from: r  reason: collision with root package name */
    private final String f5643r;

    g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5628s : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f5629t : dVarArr;
        dVarArr2 = dVarArr2 == null ? f5629t : dVarArr2;
        this.f5630e = i10;
        this.f5631f = i11;
        this.f5632g = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5633h = "com.google.android.gms";
        } else {
            this.f5633h = str;
        }
        if (i10 < 2) {
            this.f5637l = iBinder != null ? a.Y(k.a.c(iBinder)) : null;
        } else {
            this.f5634i = iBinder;
            this.f5637l = account;
        }
        this.f5635j = scopeArr;
        this.f5636k = bundle;
        this.f5638m = dVarArr;
        this.f5639n = dVarArr2;
        this.f5640o = z10;
        this.f5641p = i13;
        this.f5642q = z11;
        this.f5643r = str2;
    }

    public Bundle U() {
        return this.f5636k;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        x1.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f5643r;
    }
}
