package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import db.g;
import db.l;
import e2.t0;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import n2.c;
import org.json.JSONObject;

public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final b f4802j = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f4803e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4804f;

    /* renamed from: g  reason: collision with root package name */
    private final n f4805g;

    /* renamed from: h  reason: collision with root package name */
    private final m f4806h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4807i;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            l.e(parcel, "source");
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(j jVar) {
            AuthenticationTokenManager.f4658d.a().e(jVar);
        }
    }

    public j(Parcel parcel) {
        l.e(parcel, "parcel");
        this.f4803e = t0.k(parcel.readString(), "token");
        this.f4804f = t0.k(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(n.class.getClassLoader());
        if (readParcelable != null) {
            this.f4805g = (n) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(m.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f4806h = (m) readParcelable2;
                this.f4807i = t0.k(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String c10 = c.c(str4);
            if (c10 == null) {
                return false;
            }
            PublicKey b10 = c.b(c10);
            return c.e(b10, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f4803e);
        jSONObject.put("expected_nonce", this.f4804f);
        jSONObject.put("header", this.f4805g.c());
        jSONObject.put("claims", this.f4806h.b());
        jSONObject.put("signature", this.f4807i);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f4803e, jVar.f4803e) && l.a(this.f4804f, jVar.f4804f) && l.a(this.f4805g, jVar.f4805g) && l.a(this.f4806h, jVar.f4806h) && l.a(this.f4807i, jVar.f4807i);
    }

    public int hashCode() {
        return ((((((((527 + this.f4803e.hashCode()) * 31) + this.f4804f.hashCode()) * 31) + this.f4805g.hashCode()) * 31) + this.f4806h.hashCode()) * 31) + this.f4807i.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeString(this.f4803e);
        parcel.writeString(this.f4804f);
        parcel.writeParcelable(this.f4805g, i10);
        parcel.writeParcelable(this.f4806h, i10);
        parcel.writeString(this.f4807i);
    }

    public j(String str, String str2) {
        l.e(str, "token");
        l.e(str2, "expectedNonce");
        t0.g(str, "token");
        t0.g(str2, "expectedNonce");
        List U = q.U(str, new String[]{"."}, false, 0, 6, (Object) null);
        if (U.size() == 3) {
            String str3 = (String) U.get(0);
            String str4 = (String) U.get(1);
            String str5 = (String) U.get(2);
            this.f4803e = str;
            this.f4804f = str2;
            n nVar = new n(str3);
            this.f4805g = nVar;
            this.f4806h = new m(str4, str2);
            if (a(str3, str4, str5, nVar.a())) {
                this.f4807i = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }
}
