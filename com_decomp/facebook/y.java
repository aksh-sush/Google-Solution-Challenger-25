package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import db.g;
import db.l;
import e2.j;
import e2.r;
import e2.w;
import java.net.HttpURLConnection;
import org.json.JSONObject;

public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new b();

    /* renamed from: s  reason: collision with root package name */
    public static final c f5006s = new c((g) null);
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final d f5007t = new d(200, 299);

    /* renamed from: e  reason: collision with root package name */
    private final int f5008e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5009f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5010g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5011h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5012i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5013j;

    /* renamed from: k  reason: collision with root package name */
    private final JSONObject f5014k;

    /* renamed from: l  reason: collision with root package name */
    private final JSONObject f5015l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f5016m;

    /* renamed from: n  reason: collision with root package name */
    private final HttpURLConnection f5017n;

    /* renamed from: o  reason: collision with root package name */
    private final String f5018o;

    /* renamed from: p  reason: collision with root package name */
    private v f5019p;

    /* renamed from: q  reason: collision with root package name */
    private final a f5020q;

    /* renamed from: r  reason: collision with root package name */
    private final String f5021r;

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public y createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new y(parcel, (g) null);
        }

        /* renamed from: b */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf A[Catch:{ JSONException -> 0x012d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.y a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r19 = this;
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                db.l.e(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x012d }
                if (r5 == 0) goto L_0x012d
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x012d }
                java.lang.Object r6 = e2.s0.O(r9, r3, r2)     // Catch:{ JSONException -> 0x012d }
                if (r6 == 0) goto L_0x00f0
                boolean r7 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x012d }
                if (r7 == 0) goto L_0x00f0
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012d }
                boolean r7 = r7.has(r1)     // Catch:{ JSONException -> 0x012d }
                r8 = 1
                java.lang.String r10 = "error_subcode"
                r11 = 0
                r12 = -1
                if (r7 == 0) goto L_0x0083
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012d }
                java.lang.Object r0 = e2.s0.O(r0, r1, r15)     // Catch:{ JSONException -> 0x012d }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012d }
                if (r0 != 0) goto L_0x0041
                r1 = r15
                goto L_0x0047
            L_0x0041:
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x012d }
            L_0x0047:
                if (r0 != 0) goto L_0x004b
                r7 = r15
                goto L_0x0051
            L_0x004b:
                java.lang.String r7 = "message"
                java.lang.String r7 = r0.optString(r7, r15)     // Catch:{ JSONException -> 0x012d }
            L_0x0051:
                if (r0 != 0) goto L_0x0055
                r4 = -1
                goto L_0x0059
            L_0x0055:
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x012d }
            L_0x0059:
                if (r0 != 0) goto L_0x005c
                goto L_0x0060
            L_0x005c:
                int r12 = r0.optInt(r10, r12)     // Catch:{ JSONException -> 0x012d }
            L_0x0060:
                if (r0 != 0) goto L_0x0064
                r10 = r15
                goto L_0x006a
            L_0x0064:
                java.lang.String r10 = "error_user_msg"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x012d }
            L_0x006a:
                if (r0 != 0) goto L_0x006e
                r13 = r15
                goto L_0x0074
            L_0x006e:
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x012d }
            L_0x0074:
                if (r0 != 0) goto L_0x0077
                goto L_0x007d
            L_0x0077:
                java.lang.String r14 = "is_transient"
                boolean r11 = r0.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x012d }
            L_0x007d:
                r8 = r7
                r14 = r11
                r7 = r12
                r11 = 1
                r12 = r4
                goto L_0x00cc
            L_0x0083:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012d }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x012d }
                java.lang.String r4 = "error_msg"
                java.lang.String r7 = "error_reason"
                if (r1 != 0) goto L_0x00aa
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012d }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x012d }
                if (r1 != 0) goto L_0x00aa
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012d }
                boolean r1 = r1.has(r7)     // Catch:{ JSONException -> 0x012d }
                if (r1 == 0) goto L_0x00a3
                goto L_0x00aa
            L_0x00a3:
                r4 = r15
                r8 = r4
                r10 = r8
                r13 = r10
                r7 = -1
                r14 = 0
                goto L_0x00cd
            L_0x00aa:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012d }
                java.lang.String r1 = r1.optString(r7, r15)     // Catch:{ JSONException -> 0x012d }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012d }
                java.lang.String r4 = r7.optString(r4, r15)     // Catch:{ JSONException -> 0x012d }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012d }
                int r0 = r7.optInt(r0, r12)     // Catch:{ JSONException -> 0x012d }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012d }
                int r7 = r7.optInt(r10, r12)     // Catch:{ JSONException -> 0x012d }
                r12 = r0
                r8 = r4
                r10 = r15
                r13 = r10
                r11 = 1
                r14 = 0
            L_0x00cc:
                r4 = r1
            L_0x00cd:
                if (r11 == 0) goto L_0x00f0
                com.facebook.y r16 = new com.facebook.y     // Catch:{ JSONException -> 0x012d }
                r11 = r6
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x012d }
                r17 = 0
                r18 = 0
                r0 = r16
                r1 = r5
                r2 = r12
                r3 = r7
                r5 = r8
                r6 = r13
                r7 = r10
                r8 = r11
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r17
                r13 = r14
                r14 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012d }
                return r16
            L_0x00f0:
                com.facebook.y$d r0 = r19.c()     // Catch:{ JSONException -> 0x012d }
                boolean r0 = r0.a(r5)     // Catch:{ JSONException -> 0x012d }
                if (r0 != 0) goto L_0x012d
                com.facebook.y r16 = new com.facebook.y     // Catch:{ JSONException -> 0x012d }
                r4 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x012d }
                if (r0 == 0) goto L_0x0110
                java.lang.Object r0 = e2.s0.O(r9, r3, r2)     // Catch:{ JSONException -> 0x012d }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012d }
                r12 = r0
                goto L_0x0111
            L_0x0110:
                r12 = r15
            L_0x0111:
                r13 = 0
                r14 = 0
                r17 = 0
                r0 = r16
                r1 = r5
                r2 = r4
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r10
                r7 = r11
                r8 = r12
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012d }
                return r16
            L_0x012d:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.y.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.y");
        }

        public final synchronized j b() {
            w wVar = w.f9682a;
            r f10 = w.f(i0.m());
            if (f10 == null) {
                return j.f9571g.b();
            }
            return f10.c();
        }

        public final d c() {
            return y.f5007t;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f5026a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5027b;

        public d(int i10, int i11) {
            this.f5026a = i10;
            this.f5027b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f5027b && this.f5026a <= i10;
        }
    }

    private y(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, v vVar, boolean z10) {
        boolean z11;
        this.f5008e = i10;
        this.f5009f = i11;
        this.f5010g = i12;
        this.f5011h = str;
        this.f5012i = str3;
        this.f5013j = str4;
        this.f5014k = jSONObject;
        this.f5015l = jSONObject2;
        this.f5016m = obj;
        this.f5017n = httpURLConnection;
        this.f5018o = str2;
        if (vVar != null) {
            this.f5019p = vVar;
            z11 = true;
        } else {
            this.f5019p = new k0(this, c());
            z11 = false;
        }
        a c10 = z11 ? a.OTHER : f5006s.b().c(i11, i12, z10);
        this.f5020q = c10;
        this.f5021r = f5006s.b().d(c10);
    }

    public final int b() {
        return this.f5009f;
    }

    public final String c() {
        String str = this.f5018o;
        if (str != null) {
            return str;
        }
        v vVar = this.f5019p;
        if (vVar == null) {
            return null;
        }
        return vVar.getLocalizedMessage();
    }

    public final String d() {
        return this.f5011h;
    }

    public int describeContents() {
        return 0;
    }

    public final v e() {
        return this.f5019p;
    }

    public final int f() {
        return this.f5008e;
    }

    public final int g() {
        return this.f5010g;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f5008e + ", errorCode: " + this.f5009f + ", subErrorCode: " + this.f5010g + ", errorType: " + this.f5011h + ", errorMessage: " + c() + "}";
        l.d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeInt(this.f5008e);
        parcel.writeInt(this.f5009f);
        parcel.writeInt(this.f5010g);
        parcel.writeString(this.f5011h);
        parcel.writeString(c());
        parcel.writeString(this.f5012i);
        parcel.writeString(this.f5013j);
    }

    public /* synthetic */ y(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, v vVar, boolean z10, g gVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, vVar, z10);
    }

    public y(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (v) null, false);
    }

    private y(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (v) null, false);
    }

    public /* synthetic */ y(Parcel parcel, g gVar) {
        this(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r0 = r16
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            boolean r11 = r0 instanceof com.facebook.v
            if (r11 == 0) goto L_0x0014
            com.facebook.v r0 = (com.facebook.v) r0
            r12 = r0
            goto L_0x001a
        L_0x0014:
            com.facebook.v r11 = new com.facebook.v
            r11.<init>((java.lang.Throwable) r0)
            r12 = r11
        L_0x001a:
            r13 = 0
            r0 = r14
            r11 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.y.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }
}
