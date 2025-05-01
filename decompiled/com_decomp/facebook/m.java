package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import db.g;
import db.k;
import db.l;
import db.w;
import e2.s0;
import e2.t0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lb.d;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: y  reason: collision with root package name */
    public static final b f4872y = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f4873e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4874f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4875g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4876h;

    /* renamed from: i  reason: collision with root package name */
    private final long f4877i;

    /* renamed from: j  reason: collision with root package name */
    private final long f4878j;

    /* renamed from: k  reason: collision with root package name */
    private final String f4879k;

    /* renamed from: l  reason: collision with root package name */
    private final String f4880l;

    /* renamed from: m  reason: collision with root package name */
    private final String f4881m;

    /* renamed from: n  reason: collision with root package name */
    private final String f4882n;

    /* renamed from: o  reason: collision with root package name */
    private final String f4883o;

    /* renamed from: p  reason: collision with root package name */
    private final String f4884p;

    /* renamed from: q  reason: collision with root package name */
    private final String f4885q;

    /* renamed from: r  reason: collision with root package name */
    private final Set f4886r;

    /* renamed from: s  reason: collision with root package name */
    private final String f4887s;

    /* renamed from: t  reason: collision with root package name */
    private final Map f4888t;

    /* renamed from: u  reason: collision with root package name */
    private final Map f4889u;

    /* renamed from: v  reason: collision with root package name */
    private final Map f4890v;

    /* renamed from: w  reason: collision with root package name */
    private final String f4891w;

    /* renamed from: x  reason: collision with root package name */
    private final String f4892x;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            l.e(parcel, "source");
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String str) {
            l.e(jSONObject, "<this>");
            l.e(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public m(Parcel parcel) {
        l.e(parcel, "parcel");
        this.f4873e = t0.k(parcel.readString(), "jti");
        this.f4874f = t0.k(parcel.readString(), "iss");
        this.f4875g = t0.k(parcel.readString(), "aud");
        this.f4876h = t0.k(parcel.readString(), "nonce");
        this.f4877i = parcel.readLong();
        this.f4878j = parcel.readLong();
        this.f4879k = t0.k(parcel.readString(), "sub");
        this.f4880l = parcel.readString();
        this.f4881m = parcel.readString();
        this.f4882n = parcel.readString();
        this.f4883o = parcel.readString();
        this.f4884p = parcel.readString();
        this.f4885q = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map map = null;
        this.f4886r = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f4887s = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(k.f9420a.getClass().getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.f4888t = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        w wVar = w.f9429a;
        HashMap readHashMap2 = parcel.readHashMap(wVar.getClass().getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.f4889u = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(wVar.getClass().getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.f4890v = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.f4891w = parcel.readString();
        this.f4892x = parcel.readString();
    }

    private final boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("jti");
        l.d(optString, "jti");
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString("iss");
            l.d(optString2, "iss");
            if (!(optString2.length() == 0) && (l.a(new URL(optString2).getHost(), "facebook.com") || l.a(new URL(optString2).getHost(), "www.facebook.com"))) {
                String optString3 = jSONObject.optString("aud");
                l.d(optString3, "aud");
                if (!(optString3.length() == 0) && l.a(optString3, i0.m())) {
                    long j10 = (long) 1000;
                    if (new Date().after(new Date(jSONObject.optLong("exp") * j10))) {
                        return false;
                    }
                    if (new Date().after(new Date((jSONObject.optLong("iat") * j10) + 600000))) {
                        return false;
                    }
                    String optString4 = jSONObject.optString("sub");
                    l.d(optString4, "sub");
                    if (optString4.length() == 0) {
                        return false;
                    }
                    String optString5 = jSONObject.optString("nonce");
                    l.d(optString5, "nonce");
                    return !(optString5.length() == 0) && l.a(optString5, str);
                }
            }
        } catch (MalformedURLException unused) {
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f4873e);
        jSONObject.put("iss", this.f4874f);
        jSONObject.put("aud", this.f4875g);
        jSONObject.put("nonce", this.f4876h);
        jSONObject.put("exp", this.f4877i);
        jSONObject.put("iat", this.f4878j);
        String str = this.f4879k;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f4880l;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f4881m;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f4882n;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f4883o;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f4884p;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f4885q;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f4886r != null) {
            jSONObject.put("user_friends", new JSONArray(this.f4886r));
        }
        String str8 = this.f4887s;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f4888t != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f4888t));
        }
        if (this.f4889u != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f4889u));
        }
        if (this.f4890v != null) {
            jSONObject.put("user_location", new JSONObject(this.f4890v));
        }
        String str9 = this.f4891w;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f4892x;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f4873e, mVar.f4873e) && l.a(this.f4874f, mVar.f4874f) && l.a(this.f4875g, mVar.f4875g) && l.a(this.f4876h, mVar.f4876h) && this.f4877i == mVar.f4877i && this.f4878j == mVar.f4878j && l.a(this.f4879k, mVar.f4879k) && l.a(this.f4880l, mVar.f4880l) && l.a(this.f4881m, mVar.f4881m) && l.a(this.f4882n, mVar.f4882n) && l.a(this.f4883o, mVar.f4883o) && l.a(this.f4884p, mVar.f4884p) && l.a(this.f4885q, mVar.f4885q) && l.a(this.f4886r, mVar.f4886r) && l.a(this.f4887s, mVar.f4887s) && l.a(this.f4888t, mVar.f4888t) && l.a(this.f4889u, mVar.f4889u) && l.a(this.f4890v, mVar.f4890v) && l.a(this.f4891w, mVar.f4891w) && l.a(this.f4892x, mVar.f4892x);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f4873e.hashCode()) * 31) + this.f4874f.hashCode()) * 31) + this.f4875g.hashCode()) * 31) + this.f4876h.hashCode()) * 31) + l.a(this.f4877i)) * 31) + l.a(this.f4878j)) * 31) + this.f4879k.hashCode()) * 31;
        String str = this.f4880l;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4881m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4882n;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4883o;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4884p;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f4885q;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set set = this.f4886r;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f4887s;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f4888t;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f4889u;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f4890v;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f4891w;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4892x;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode13 + i10;
    }

    public String toString() {
        String jSONObject = b().toString();
        l.d(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeString(this.f4873e);
        parcel.writeString(this.f4874f);
        parcel.writeString(this.f4875g);
        parcel.writeString(this.f4876h);
        parcel.writeLong(this.f4877i);
        parcel.writeLong(this.f4878j);
        parcel.writeString(this.f4879k);
        parcel.writeString(this.f4880l);
        parcel.writeString(this.f4881m);
        parcel.writeString(this.f4882n);
        parcel.writeString(this.f4883o);
        parcel.writeString(this.f4884p);
        parcel.writeString(this.f4885q);
        parcel.writeStringList(this.f4886r == null ? null : new ArrayList(this.f4886r));
        parcel.writeString(this.f4887s);
        parcel.writeMap(this.f4888t);
        parcel.writeMap(this.f4889u);
        parcel.writeMap(this.f4890v);
        parcel.writeString(this.f4891w);
        parcel.writeString(this.f4892x);
    }

    public m(String str, String str2) {
        l.e(str, "encodedClaims");
        l.e(str2, "expectedNonce");
        t0.g(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        l.d(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, d.f13235b));
        if (a(jSONObject, str2)) {
            String string = jSONObject.getString("jti");
            l.d(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.f4873e = string;
            String string2 = jSONObject.getString("iss");
            l.d(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.f4874f = string2;
            String string3 = jSONObject.getString("aud");
            l.d(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.f4875g = string3;
            String string4 = jSONObject.getString("nonce");
            l.d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.f4876h = string4;
            this.f4877i = jSONObject.getLong("exp");
            this.f4878j = jSONObject.getLong("iat");
            String string5 = jSONObject.getString("sub");
            l.d(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.f4879k = string5;
            b bVar = f4872y;
            this.f4880l = bVar.a(jSONObject, "name");
            this.f4881m = bVar.a(jSONObject, "given_name");
            this.f4882n = bVar.a(jSONObject, "middle_name");
            this.f4883o = bVar.a(jSONObject, "family_name");
            this.f4884p = bVar.a(jSONObject, "email");
            this.f4885q = bVar.a(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
            Map map = null;
            this.f4886r = optJSONArray == null ? null : Collections.unmodifiableSet(s0.f0(optJSONArray));
            this.f4887s = bVar.a(jSONObject, "user_birthday");
            JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
            this.f4888t = optJSONObject == null ? null : Collections.unmodifiableMap(s0.n(optJSONObject));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
            this.f4889u = optJSONObject2 == null ? null : Collections.unmodifiableMap(s0.o(optJSONObject2));
            JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
            this.f4890v = optJSONObject3 != null ? Collections.unmodifiableMap(s0.o(optJSONObject3)) : map;
            this.f4891w = bVar.a(jSONObject, "user_gender");
            this.f4892x = bVar.a(jSONObject, "user_link");
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }
}
