package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.List;
import s3.c;

public class SaveAccountLinkingTokenRequest extends s3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f5116e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5117f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5118g;

    /* renamed from: h  reason: collision with root package name */
    private final List f5119h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5120i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5121j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private PendingIntent f5122a;

        /* renamed from: b  reason: collision with root package name */
        private String f5123b;

        /* renamed from: c  reason: collision with root package name */
        private String f5124c;

        /* renamed from: d  reason: collision with root package name */
        private List f5125d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private String f5126e;

        /* renamed from: f  reason: collision with root package name */
        private int f5127f;

        public SaveAccountLinkingTokenRequest a() {
            boolean z10 = false;
            s.b(this.f5122a != null, "Consent PendingIntent cannot be null");
            s.b("auth_code".equals(this.f5123b), "Invalid tokenType");
            s.b(!TextUtils.isEmpty(this.f5124c), "serviceId cannot be null or empty");
            if (this.f5125d != null) {
                z10 = true;
            }
            s.b(z10, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f5122a, this.f5123b, this.f5124c, this.f5125d, this.f5126e, this.f5127f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f5122a = pendingIntent;
            return this;
        }

        public a c(List list) {
            this.f5125d = list;
            return this;
        }

        public a d(String str) {
            this.f5124c = str;
            return this;
        }

        public a e(String str) {
            this.f5123b = str;
            return this;
        }

        public final a f(String str) {
            this.f5126e = str;
            return this;
        }

        public final a g(int i10) {
            this.f5127f = i10;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f5116e = pendingIntent;
        this.f5117f = str;
        this.f5118g = str2;
        this.f5119h = list;
        this.f5120i = str3;
        this.f5121j = i10;
    }

    public static a U() {
        return new a();
    }

    public static a l0(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        s.k(saveAccountLinkingTokenRequest);
        a U = U();
        U.c(saveAccountLinkingTokenRequest.W());
        U.d(saveAccountLinkingTokenRequest.X());
        U.b(saveAccountLinkingTokenRequest.V());
        U.e(saveAccountLinkingTokenRequest.j0());
        U.g(saveAccountLinkingTokenRequest.f5121j);
        String str = saveAccountLinkingTokenRequest.f5120i;
        if (!TextUtils.isEmpty(str)) {
            U.f(str);
        }
        return U;
    }

    public PendingIntent V() {
        return this.f5116e;
    }

    public List W() {
        return this.f5119h;
    }

    public String X() {
        return this.f5118g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f5119h.size() == saveAccountLinkingTokenRequest.f5119h.size() && this.f5119h.containsAll(saveAccountLinkingTokenRequest.f5119h) && q.b(this.f5116e, saveAccountLinkingTokenRequest.f5116e) && q.b(this.f5117f, saveAccountLinkingTokenRequest.f5117f) && q.b(this.f5118g, saveAccountLinkingTokenRequest.f5118g) && q.b(this.f5120i, saveAccountLinkingTokenRequest.f5120i) && this.f5121j == saveAccountLinkingTokenRequest.f5121j;
    }

    public int hashCode() {
        return q.c(this.f5116e, this.f5117f, this.f5118g, this.f5119h, this.f5120i);
    }

    public String j0() {
        return this.f5117f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, V(), i10, false);
        c.D(parcel, 2, j0(), false);
        c.D(parcel, 3, X(), false);
        c.F(parcel, 4, W(), false);
        c.D(parcel, 5, this.f5120i, false);
        c.t(parcel, 6, this.f5121j);
        c.b(parcel, a10);
    }
}
