package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import java.util.List;
import s3.c;

public class AuthorizationRequest extends s3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final List f5100e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5101f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5102g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5103h;

    /* renamed from: i  reason: collision with root package name */
    private final Account f5104i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5105j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5106k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f5107l;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private List f5108a;

        /* renamed from: b  reason: collision with root package name */
        private String f5109b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5110c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5111d;

        /* renamed from: e  reason: collision with root package name */
        private Account f5112e;

        /* renamed from: f  reason: collision with root package name */
        private String f5113f;

        /* renamed from: g  reason: collision with root package name */
        private String f5114g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5115h;

        private final String h(String str) {
            s.k(str);
            String str2 = this.f5109b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }

        public AuthorizationRequest a() {
            return new AuthorizationRequest(this.f5108a, this.f5109b, this.f5110c, this.f5111d, this.f5112e, this.f5113f, this.f5114g, this.f5115h);
        }

        public a b(String str) {
            this.f5113f = s.g(str);
            return this;
        }

        public a c(String str, boolean z10) {
            h(str);
            this.f5109b = str;
            this.f5110c = true;
            this.f5115h = z10;
            return this;
        }

        public a d(Account account) {
            this.f5112e = (Account) s.k(account);
            return this;
        }

        public a e(List list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            s.b(z10, "requestedScopes cannot be null or empty");
            this.f5108a = list;
            return this;
        }

        public final a f(String str) {
            h(str);
            this.f5109b = str;
            this.f5111d = true;
            return this;
        }

        public final a g(String str) {
            this.f5114g = str;
            return this;
        }
    }

    AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        s.b(z13, "requestedScopes cannot be null or empty");
        this.f5100e = list;
        this.f5101f = str;
        this.f5102g = z10;
        this.f5103h = z11;
        this.f5104i = account;
        this.f5105j = str2;
        this.f5106k = str3;
        this.f5107l = z12;
    }

    public static a U() {
        return new a();
    }

    public static a w0(AuthorizationRequest authorizationRequest) {
        s.k(authorizationRequest);
        a U = U();
        U.e(authorizationRequest.X());
        boolean l02 = authorizationRequest.l0();
        String str = authorizationRequest.f5106k;
        String W = authorizationRequest.W();
        Account V = authorizationRequest.V();
        String j02 = authorizationRequest.j0();
        if (str != null) {
            U.g(str);
        }
        if (W != null) {
            U.b(W);
        }
        if (V != null) {
            U.d(V);
        }
        if (authorizationRequest.f5103h && j02 != null) {
            U.f(j02);
        }
        if (authorizationRequest.m0() && j02 != null) {
            U.c(j02, l02);
        }
        return U;
    }

    public Account V() {
        return this.f5104i;
    }

    public String W() {
        return this.f5105j;
    }

    public List X() {
        return this.f5100e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f5100e.size() == authorizationRequest.f5100e.size() && this.f5100e.containsAll(authorizationRequest.f5100e) && this.f5102g == authorizationRequest.f5102g && this.f5107l == authorizationRequest.f5107l && this.f5103h == authorizationRequest.f5103h && q.b(this.f5101f, authorizationRequest.f5101f) && q.b(this.f5104i, authorizationRequest.f5104i) && q.b(this.f5105j, authorizationRequest.f5105j) && q.b(this.f5106k, authorizationRequest.f5106k);
    }

    public int hashCode() {
        return q.c(this.f5100e, this.f5101f, Boolean.valueOf(this.f5102g), Boolean.valueOf(this.f5107l), Boolean.valueOf(this.f5103h), this.f5104i, this.f5105j, this.f5106k);
    }

    public String j0() {
        return this.f5101f;
    }

    public boolean l0() {
        return this.f5107l;
    }

    public boolean m0() {
        return this.f5102g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, X(), false);
        c.D(parcel, 2, j0(), false);
        c.g(parcel, 3, m0());
        c.g(parcel, 4, this.f5103h);
        c.B(parcel, 5, V(), i10, false);
        c.D(parcel, 6, W(), false);
        c.D(parcel, 7, this.f5106k, false);
        c.g(parcel, 8, l0());
        c.b(parcel, a10);
    }
}
