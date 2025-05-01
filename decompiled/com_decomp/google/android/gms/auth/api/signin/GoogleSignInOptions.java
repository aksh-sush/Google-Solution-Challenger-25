package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n3.d;
import o3.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.c;

public class GoogleSignInOptions extends s3.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();

    /* renamed from: p  reason: collision with root package name */
    public static final GoogleSignInOptions f5142p;

    /* renamed from: q  reason: collision with root package name */
    public static final GoogleSignInOptions f5143q;

    /* renamed from: r  reason: collision with root package name */
    public static final Scope f5144r = new Scope("profile");

    /* renamed from: s  reason: collision with root package name */
    public static final Scope f5145s = new Scope("email");

    /* renamed from: t  reason: collision with root package name */
    public static final Scope f5146t = new Scope("openid");

    /* renamed from: u  reason: collision with root package name */
    public static final Scope f5147u;

    /* renamed from: v  reason: collision with root package name */
    public static final Scope f5148v = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: w  reason: collision with root package name */
    private static Comparator f5149w = new d();

    /* renamed from: e  reason: collision with root package name */
    final int f5150e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5151f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Account f5152g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f5153h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5154i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5155j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f5156k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public String f5157l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f5158m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public String f5159n;

    /* renamed from: o  reason: collision with root package name */
    private Map f5160o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Set f5161a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private boolean f5162b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5163c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5164d;

        /* renamed from: e  reason: collision with root package name */
        private String f5165e;

        /* renamed from: f  reason: collision with root package name */
        private Account f5166f;

        /* renamed from: g  reason: collision with root package name */
        private String f5167g;

        /* renamed from: h  reason: collision with root package name */
        private Map f5168h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private String f5169i;

        public a() {
        }

        private final String h(String str) {
            s.g(str);
            String str2 = this.f5165e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f5161a.contains(GoogleSignInOptions.f5148v)) {
                Set set = this.f5161a;
                Scope scope = GoogleSignInOptions.f5147u;
                if (set.contains(scope)) {
                    this.f5161a.remove(scope);
                }
            }
            if (this.f5164d && (this.f5166f == null || !this.f5161a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f5161a), this.f5166f, this.f5164d, this.f5162b, this.f5163c, this.f5165e, this.f5167g, this.f5168h, this.f5169i, (d) null);
        }

        public a b() {
            this.f5161a.add(GoogleSignInOptions.f5145s);
            return this;
        }

        public a c() {
            this.f5161a.add(GoogleSignInOptions.f5146t);
            return this;
        }

        public a d(String str) {
            this.f5164d = true;
            h(str);
            this.f5165e = str;
            return this;
        }

        public a e() {
            this.f5161a.add(GoogleSignInOptions.f5144r);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f5161a.add(scope);
            this.f5161a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str) {
            this.f5169i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            s.k(googleSignInOptions);
            this.f5161a = new HashSet(googleSignInOptions.f5151f);
            this.f5162b = googleSignInOptions.f5154i;
            this.f5163c = googleSignInOptions.f5155j;
            this.f5164d = googleSignInOptions.f5153h;
            this.f5165e = googleSignInOptions.f5156k;
            this.f5166f = googleSignInOptions.f5152g;
            this.f5167g = googleSignInOptions.f5157l;
            this.f5168h = GoogleSignInOptions.L0(googleSignInOptions.f5158m);
            this.f5169i = googleSignInOptions.f5159n;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f5147u = scope;
        a aVar = new a();
        aVar.c();
        aVar.e();
        f5142p = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f5143q = aVar2.a();
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, L0(arrayList2), str3);
    }

    public static GoogleSignInOptions A0(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, optString2, str2, (Map) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    public static Map L0(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o3.a aVar = (o3.a) it.next();
            hashMap.put(Integer.valueOf(aVar.U()), aVar);
        }
        return hashMap;
    }

    public final String E0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5151f, f5149w);
            Iterator it = this.f5151f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).U());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f5152g;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f5153h);
            jSONObject.put("forceCodeForRefreshToken", this.f5155j);
            jSONObject.put("serverAuthRequested", this.f5154i);
            if (!TextUtils.isEmpty(this.f5156k)) {
                jSONObject.put("serverClientId", this.f5156k);
            }
            if (!TextUtils.isEmpty(this.f5157l)) {
                jSONObject.put("hostedDomain", this.f5157l);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Account U() {
        return this.f5152g;
    }

    public ArrayList V() {
        return this.f5158m;
    }

    public String W() {
        return this.f5159n;
    }

    public ArrayList X() {
        return new ArrayList(this.f5151f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.U()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f5158m     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f5158m     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f5151f     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.X()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f5151f     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.X()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f5152g     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.U()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.U()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f5156k     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.j0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f5156k     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.j0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f5155j     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.l0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f5153h     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.m0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f5154i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.w0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f5159n     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.W()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5151f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).U());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.f5152g);
        bVar.a(this.f5156k);
        bVar.c(this.f5155j);
        bVar.c(this.f5153h);
        bVar.c(this.f5154i);
        bVar.a(this.f5159n);
        return bVar.b();
    }

    public String j0() {
        return this.f5156k;
    }

    public boolean l0() {
        return this.f5155j;
    }

    public boolean m0() {
        return this.f5153h;
    }

    public boolean w0() {
        return this.f5154i;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5150e);
        c.H(parcel, 2, X(), false);
        c.B(parcel, 3, U(), i10, false);
        c.g(parcel, 4, m0());
        c.g(parcel, 5, w0());
        c.g(parcel, 6, l0());
        c.D(parcel, 7, j0(), false);
        c.D(parcel, 8, this.f5157l, false);
        c.H(parcel, 9, V(), false);
        c.D(parcel, 10, W(), false);
        c.b(parcel, a10);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f5150e = i10;
        this.f5151f = arrayList;
        this.f5152g = account;
        this.f5153h = z10;
        this.f5154i = z11;
        this.f5155j = z12;
        this.f5156k = str;
        this.f5157l = str2;
        this.f5158m = new ArrayList(map.values());
        this.f5160o = map;
        this.f5159n = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, d dVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }
}
