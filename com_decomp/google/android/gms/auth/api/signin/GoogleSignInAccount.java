package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;
import y3.e;
import y3.h;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: r  reason: collision with root package name */
    public static e f5128r = h.c();

    /* renamed from: e  reason: collision with root package name */
    final int f5129e;

    /* renamed from: f  reason: collision with root package name */
    private String f5130f;

    /* renamed from: g  reason: collision with root package name */
    private String f5131g;

    /* renamed from: h  reason: collision with root package name */
    private String f5132h;

    /* renamed from: i  reason: collision with root package name */
    private String f5133i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f5134j;

    /* renamed from: k  reason: collision with root package name */
    private String f5135k;

    /* renamed from: l  reason: collision with root package name */
    private long f5136l;

    /* renamed from: m  reason: collision with root package name */
    private String f5137m;

    /* renamed from: n  reason: collision with root package name */
    List f5138n;

    /* renamed from: o  reason: collision with root package name */
    private String f5139o;

    /* renamed from: p  reason: collision with root package name */
    private String f5140p;

    /* renamed from: q  reason: collision with root package name */
    private Set f5141q = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f5129e = i10;
        this.f5130f = str;
        this.f5131g = str2;
        this.f5132h = str3;
        this.f5133i = str4;
        this.f5134j = uri;
        this.f5135k = str5;
        this.f5136l = j10;
        this.f5137m = str6;
        this.f5138n = list;
        this.f5139o = str7;
        this.f5140p = str8;
    }

    public static GoogleSignInAccount l0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), s.g(str7), new ArrayList((Collection) s.k(set)), str5, str6);
    }

    public static GoogleSignInAccount m0(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount l02 = l0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        l02.f5135k = str2;
        return l02;
    }

    public String U() {
        return this.f5140p;
    }

    public String V() {
        return this.f5139o;
    }

    public String W() {
        return this.f5130f;
    }

    public Set X() {
        HashSet hashSet = new HashSet(this.f5138n);
        hashSet.addAll(this.f5141q);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5137m.equals(this.f5137m) && googleSignInAccount.X().equals(X());
    }

    public String getDisplayName() {
        return this.f5133i;
    }

    public String getEmail() {
        return this.f5132h;
    }

    public String getIdToken() {
        return this.f5131g;
    }

    public Uri getPhotoUrl() {
        return this.f5134j;
    }

    public int hashCode() {
        return ((this.f5137m.hashCode() + 527) * 31) + X().hashCode();
    }

    public String j0() {
        return this.f5135k;
    }

    public final String w0() {
        return this.f5137m;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5129e);
        c.D(parcel, 2, W(), false);
        c.D(parcel, 3, getIdToken(), false);
        c.D(parcel, 4, getEmail(), false);
        c.D(parcel, 5, getDisplayName(), false);
        c.B(parcel, 6, getPhotoUrl(), i10, false);
        c.D(parcel, 7, j0(), false);
        c.w(parcel, 8, this.f5136l);
        c.D(parcel, 9, this.f5137m, false);
        c.H(parcel, 10, this.f5138n, false);
        c.D(parcel, 11, V(), false);
        c.D(parcel, 12, U(), false);
        c.b(parcel, a10);
    }

    public final String y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (W() != null) {
                jSONObject.put("id", W());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (V() != null) {
                jSONObject.put("givenName", V());
            }
            if (U() != null) {
                jSONObject.put("familyName", U());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (j0() != null) {
                jSONObject.put("serverAuthCode", j0());
            }
            jSONObject.put("expirationTime", this.f5136l);
            jSONObject.put("obfuscatedIdentifier", this.f5137m);
            JSONArray jSONArray = new JSONArray();
            List list = this.f5138n;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, n3.c.f13495e);
            for (Scope U : scopeArr) {
                jSONArray.put(U.U());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
