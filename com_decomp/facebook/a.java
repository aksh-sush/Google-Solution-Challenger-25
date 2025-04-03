package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.t0;
import db.g;
import db.l;
import e2.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: p  reason: collision with root package name */
    public static final c f4683p = new c((g) null);

    /* renamed from: q  reason: collision with root package name */
    private static final Date f4684q;

    /* renamed from: r  reason: collision with root package name */
    private static final Date f4685r;

    /* renamed from: s  reason: collision with root package name */
    private static final Date f4686s = new Date();

    /* renamed from: t  reason: collision with root package name */
    private static final h f4687t = h.FACEBOOK_APPLICATION_WEB;

    /* renamed from: e  reason: collision with root package name */
    private final Date f4688e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f4689f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f4690g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f4691h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4692i;

    /* renamed from: j  reason: collision with root package name */
    private final h f4693j;

    /* renamed from: k  reason: collision with root package name */
    private final Date f4694k;

    /* renamed from: l  reason: collision with root package name */
    private final String f4695l;

    /* renamed from: m  reason: collision with root package name */
    private final String f4696m;

    /* renamed from: n  reason: collision with root package name */
    private final Date f4697n;

    /* renamed from: o  reason: collision with root package name */
    private final String f4698o;

    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    public interface C0083a {
        void a(v vVar);

        void b(a aVar);
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            l.e(parcel, "source");
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        public final a a(a aVar) {
            l.e(aVar, "current");
            return new a(aVar.m(), aVar.c(), aVar.n(), aVar.k(), aVar.e(), aVar.f(), aVar.l(), new Date(), new Date(), aVar.d(), (String) null, 1024, (g) null);
        }

        public final a b(JSONObject jSONObject) {
            l.e(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                l.d(string2, "jsonObject.getString(SOURCE_KEY)");
                h valueOf = h.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                l.d(string, "token");
                l.d(string3, "applicationId");
                l.d(string4, "userId");
                s0 s0Var = s0.f9663a;
                l.d(jSONArray, "permissionsArray");
                List g02 = s0.g0(jSONArray);
                l.d(jSONArray2, "declinedPermissionsArray");
                return new a(string, string3, string4, g02, s0.g0(jSONArray2), optJSONArray == null ? new ArrayList() : s0.g0(optJSONArray), valueOf, date, date2, date3, optString);
            }
            throw new v("Unknown AccessToken serialization format.");
        }

        public final a c(Bundle bundle) {
            String str;
            Bundle bundle2 = bundle;
            l.e(bundle2, "bundle");
            List f10 = f(bundle2, "com.facebook.TokenCachingStrategy.Permissions");
            List f11 = f(bundle2, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List f12 = f(bundle2, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            t0.a aVar = t0.f4973c;
            String a10 = aVar.a(bundle2);
            if (s0.c0(a10)) {
                a10 = i0.m();
            }
            String str2 = a10;
            String f13 = aVar.f(bundle2);
            if (f13 == null) {
                return null;
            }
            JSONObject f14 = s0.f(f13);
            if (f14 == null) {
                str = null;
            } else {
                try {
                    str = f14.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str2 == null || str == null) {
                return null;
            }
            return new a(f13, str2, str, f10, f11, f12, aVar.e(bundle2), aVar.c(bundle2), aVar.d(bundle2), (Date) null, (String) null, 1024, (g) null);
        }

        public final void d() {
            a i10 = g.f4738f.e().i();
            if (i10 != null) {
                h(a(i10));
            }
        }

        public final a e() {
            return g.f4738f.e().i();
        }

        public final List f(Bundle bundle, String str) {
            l.e(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return o.e();
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            l.d(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            a i10 = g.f4738f.e().i();
            return i10 != null && !i10.o();
        }

        public final void h(a aVar) {
            g.f4738f.e().r(aVar);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4699a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[h.WEB_VIEW.ordinal()] = 3;
            f4699a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f4684q = date;
        f4685r = date;
    }

    public a(Parcel parcel) {
        l.e(parcel, "parcel");
        this.f4688e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        l.d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f4689f = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f4690g = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f4691h = unmodifiableSet3;
        this.f4692i = e2.t0.k(parcel.readString(), "token");
        String readString = parcel.readString();
        this.f4693j = readString != null ? h.valueOf(readString) : f4687t;
        this.f4694k = new Date(parcel.readLong());
        this.f4695l = e2.t0.k(parcel.readString(), "applicationId");
        this.f4696m = e2.t0.k(parcel.readString(), "userId");
        this.f4697n = new Date(parcel.readLong());
        this.f4698o = parcel.readString();
    }

    private final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f4689f));
        sb2.append("]");
    }

    private final h b(h hVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return hVar;
        }
        int i10 = d.f4699a[hVar.ordinal()];
        if (i10 == 1) {
            return h.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 != 2) {
            return i10 != 3 ? hVar : h.INSTAGRAM_WEB_VIEW;
        }
        return h.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    private final String q() {
        i0 i0Var = i0.f4776a;
        return i0.H(u0.f4979f) ? this.f4692i : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f4695l;
    }

    public final Date d() {
        return this.f4697n;
    }

    public int describeContents() {
        return 0;
    }

    public final Set e() {
        return this.f4690g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (l.a(this.f4688e, aVar.f4688e) && l.a(this.f4689f, aVar.f4689f) && l.a(this.f4690g, aVar.f4690g) && l.a(this.f4691h, aVar.f4691h) && l.a(this.f4692i, aVar.f4692i) && this.f4693j == aVar.f4693j && l.a(this.f4694k, aVar.f4694k) && l.a(this.f4695l, aVar.f4695l) && l.a(this.f4696m, aVar.f4696m) && l.a(this.f4697n, aVar.f4697n)) {
            String str = this.f4698o;
            String str2 = aVar.f4698o;
            if (str == null ? str2 == null : l.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.f4691h;
    }

    public final Date g() {
        return this.f4688e;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f4688e.hashCode()) * 31) + this.f4689f.hashCode()) * 31) + this.f4690g.hashCode()) * 31) + this.f4691h.hashCode()) * 31) + this.f4692i.hashCode()) * 31) + this.f4693j.hashCode()) * 31) + this.f4694k.hashCode()) * 31) + this.f4695l.hashCode()) * 31) + this.f4696m.hashCode()) * 31) + this.f4697n.hashCode()) * 31;
        String str = this.f4698o;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f4698o;
    }

    public final Date j() {
        return this.f4694k;
    }

    public final Set k() {
        return this.f4689f;
    }

    public final h l() {
        return this.f4693j;
    }

    public final String m() {
        return this.f4692i;
    }

    public final String n() {
        return this.f4696m;
    }

    public final boolean o() {
        return new Date().after(this.f4688e);
    }

    public final JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4692i);
        jSONObject.put("expires_at", this.f4688e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f4689f));
        jSONObject.put("declined_permissions", new JSONArray(this.f4690g));
        jSONObject.put("expired_permissions", new JSONArray(this.f4691h));
        jSONObject.put("last_refresh", this.f4694k.getTime());
        jSONObject.put("source", this.f4693j.name());
        jSONObject.put("application_id", this.f4695l);
        jSONObject.put("user_id", this.f4696m);
        jSONObject.put("data_access_expiration_time", this.f4697n.getTime());
        String str = this.f4698o;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(q());
        a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        l.d(sb3, "builder.toString()");
        return sb3;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeLong(this.f4688e.getTime());
        parcel.writeStringList(new ArrayList(this.f4689f));
        parcel.writeStringList(new ArrayList(this.f4690g));
        parcel.writeStringList(new ArrayList(this.f4691h));
        parcel.writeString(this.f4692i);
        parcel.writeString(this.f4693j.name());
        parcel.writeLong(this.f4694k.getTime());
        parcel.writeString(this.f4695l);
        parcel.writeString(this.f4696m);
        parcel.writeLong(this.f4697n.getTime());
        parcel.writeString(this.f4698o);
    }

    public a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        l.e(str, "accessToken");
        l.e(str2, "applicationId");
        l.e(str3, "userId");
        e2.t0.g(str, "accessToken");
        e2.t0.g(str2, "applicationId");
        e2.t0.g(str3, "userId");
        this.f4688e = date == null ? f4685r : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        l.d(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f4689f = unmodifiableSet;
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        Set unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        l.d(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f4690g = unmodifiableSet2;
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        Set unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        l.d(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f4691h = unmodifiableSet3;
        this.f4692i = str;
        this.f4693j = b(hVar == null ? f4687t : hVar, str4);
        this.f4694k = date2 == null ? f4686s : date2;
        this.f4695l = str2;
        this.f4696m = str3;
        this.f4697n = (date3 == null || date3.getTime() == 0) ? f4685r : date3;
        this.f4698o = str4 == null ? "facebook" : str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3, String str4, int i10, g gVar) {
        this(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3, (i10 & 1024) != 0 ? "facebook" : str4);
    }
}
