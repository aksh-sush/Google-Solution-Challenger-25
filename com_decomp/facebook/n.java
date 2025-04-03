package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import db.g;
import db.l;
import e2.t0;
import lb.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final b f4922h = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f4923e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4924f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4925g;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            l.e(parcel, "source");
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public n(Parcel parcel) {
        l.e(parcel, "parcel");
        this.f4923e = t0.k(parcel.readString(), "alg");
        this.f4924f = t0.k(parcel.readString(), "typ");
        this.f4925g = t0.k(parcel.readString(), "kid");
    }

    private final boolean b(String str) {
        t0.g(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        l.d(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, d.f13235b));
            String optString = jSONObject.optString("alg");
            l.d(optString, "alg");
            boolean z10 = (optString.length() > 0) && l.a(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            l.d(optString2, "jsonObj.optString(\"kid\")");
            boolean z11 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            l.d(optString3, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.f4925g;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f4923e);
        jSONObject.put("typ", this.f4924f);
        jSONObject.put("kid", this.f4925g);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f4923e, nVar.f4923e) && l.a(this.f4924f, nVar.f4924f) && l.a(this.f4925g, nVar.f4925g);
    }

    public int hashCode() {
        return ((((527 + this.f4923e.hashCode()) * 31) + this.f4924f.hashCode()) * 31) + this.f4925g.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        l.d(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeString(this.f4923e);
        parcel.writeString(this.f4924f);
        parcel.writeString(this.f4925g);
    }

    public n(String str) {
        l.e(str, "encodedHeaderString");
        if (b(str)) {
            byte[] decode = Base64.decode(str, 0);
            l.d(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, d.f13235b));
            String string = jSONObject.getString("alg");
            l.d(string, "jsonObj.getString(\"alg\")");
            this.f4923e = string;
            String string2 = jSONObject.getString("typ");
            l.d(string2, "jsonObj.getString(\"typ\")");
            this.f4924f = string2;
            String string3 = jSONObject.getString("kid");
            l.d(string3, "jsonObj.getString(\"kid\")");
            this.f4925g = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }
}
