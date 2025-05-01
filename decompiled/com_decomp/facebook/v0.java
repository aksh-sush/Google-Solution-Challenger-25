package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.a;
import com.google.firebase.dynamiclinks.DynamicLink;
import db.g;
import db.l;
import e2.s0;
import e2.t0;
import org.json.JSONException;
import org.json.JSONObject;

public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final b f4988l = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f4989m = v0.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private final String f4990e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4991f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4992g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4993h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4994i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f4995j;

    /* renamed from: k  reason: collision with root package name */
    private final Uri f4996k;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public v0 createFromParcel(Parcel parcel) {
            l.e(parcel, "source");
            return new v0(parcel, (g) null);
        }

        /* renamed from: b */
        public v0[] newArray(int i10) {
            return new v0[i10];
        }
    }

    public static final class b {

        public static final class a implements s0.a {
            a() {
            }

            public void a(v vVar) {
                Log.e(v0.f4989m, l.l("Got unexpected exception: ", vVar));
            }

            public void b(JSONObject jSONObject) {
                Uri uri = null;
                String optString = jSONObject == null ? null : jSONObject.optString("id");
                if (optString == null) {
                    Log.w(v0.f4989m, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString(DynamicLink.Builder.KEY_LINK);
                String optString3 = jSONObject.optString("profile_picture", (String) null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString("name");
                Uri parse = optString2 != null ? Uri.parse(optString2) : null;
                if (optString3 != null) {
                    uri = Uri.parse(optString3);
                }
                v0.f4988l.c(new v0(optString, optString4, optString5, optString6, optString7, parse, uri));
            }
        }

        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a() {
            a.c cVar = a.f4683p;
            a e10 = cVar.e();
            if (e10 != null) {
                if (!cVar.g()) {
                    c((v0) null);
                    return;
                }
                s0 s0Var = s0.f9663a;
                s0.G(e10.m(), new a());
            }
        }

        public final v0 b() {
            return x0.f5001d.a().c();
        }

        public final void c(v0 v0Var) {
            x0.f5001d.a().f(v0Var);
        }
    }

    private v0(Parcel parcel) {
        this.f4990e = parcel.readString();
        this.f4991f = parcel.readString();
        this.f4992g = parcel.readString();
        this.f4993h = parcel.readString();
        this.f4994i = parcel.readString();
        String readString = parcel.readString();
        Uri uri = null;
        this.f4995j = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f4996k = readString2 != null ? Uri.parse(readString2) : uri;
    }

    public final String b() {
        return this.f4994i;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4990e);
            jSONObject.put("first_name", this.f4991f);
            jSONObject.put("middle_name", this.f4992g);
            jSONObject.put("last_name", this.f4993h);
            jSONObject.put("name", this.f4994i);
            Uri uri = this.f4995j;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f4996k;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = r4.f4991f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r1 = r4.f4992g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r1 = r4.f4993h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r1 = r4.f4994i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r1 = r4.f4995j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        r1 = r4.f4996k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.v0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r4.f4990e
            if (r1 != 0) goto L_0x0015
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4990e
            if (r3 == 0) goto L_0x0020
        L_0x0015:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4990e
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0020:
            java.lang.String r1 = r4.f4991f
            if (r1 != 0) goto L_0x002b
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4991f
            if (r3 == 0) goto L_0x0036
        L_0x002b:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4991f
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0036:
            java.lang.String r1 = r4.f4992g
            if (r1 != 0) goto L_0x0041
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4992g
            if (r3 == 0) goto L_0x004c
        L_0x0041:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4992g
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x004c:
            java.lang.String r1 = r4.f4993h
            if (r1 != 0) goto L_0x0057
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4993h
            if (r3 == 0) goto L_0x0062
        L_0x0057:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4993h
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0062:
            java.lang.String r1 = r4.f4994i
            if (r1 != 0) goto L_0x006d
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4994i
            if (r3 == 0) goto L_0x0078
        L_0x006d:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            java.lang.String r3 = r3.f4994i
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0078:
            android.net.Uri r1 = r4.f4995j
            if (r1 != 0) goto L_0x0083
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            android.net.Uri r3 = r3.f4995j
            if (r3 == 0) goto L_0x008e
        L_0x0083:
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            android.net.Uri r3 = r3.f4995j
            boolean r1 = db.l.a(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x008e:
            android.net.Uri r1 = r4.f4996k
            if (r1 != 0) goto L_0x0099
            r3 = r5
            com.facebook.v0 r3 = (com.facebook.v0) r3
            android.net.Uri r3 = r3.f4996k
            if (r3 == 0) goto L_0x00a5
        L_0x0099:
            com.facebook.v0 r5 = (com.facebook.v0) r5
            android.net.Uri r5 = r5.f4996k
            boolean r5 = db.l.a(r1, r5)
            if (r5 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.v0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f4990e;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f4991f;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f4992g;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f4993h;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f4994i;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f4995j;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f4996k;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeString(this.f4990e);
        parcel.writeString(this.f4991f);
        parcel.writeString(this.f4992g);
        parcel.writeString(this.f4993h);
        parcel.writeString(this.f4994i);
        Uri uri = this.f4995j;
        String str = null;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f4996k;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
    }

    public /* synthetic */ v0(Parcel parcel, g gVar) {
        this(parcel);
    }

    public v0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        t0.k(str, "id");
        this.f4990e = str;
        this.f4991f = str2;
        this.f4992g = str3;
        this.f4993h = str4;
        this.f4994i = str5;
        this.f4995j = uri;
        this.f4996k = uri2;
    }

    public v0(JSONObject jSONObject) {
        l.e(jSONObject, "jsonObject");
        Uri uri = null;
        this.f4990e = jSONObject.optString("id", (String) null);
        this.f4991f = jSONObject.optString("first_name", (String) null);
        this.f4992g = jSONObject.optString("middle_name", (String) null);
        this.f4993h = jSONObject.optString("last_name", (String) null);
        this.f4994i = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f4995j = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", (String) null);
        this.f4996k = optString2 != null ? Uri.parse(optString2) : uri;
    }
}
