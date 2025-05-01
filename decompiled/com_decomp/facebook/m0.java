package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.onesignal.inAppMessages.internal.display.impl.i;
import db.l;
import db.w;
import e2.b0;
import e2.e0;
import e2.j0;
import e2.s0;
import e2.t0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m0 {

    /* renamed from: n  reason: collision with root package name */
    public static final c f4893n = new c((db.g) null);

    /* renamed from: o  reason: collision with root package name */
    public static final String f4894o = m0.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final String f4895p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static String f4896q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f4897r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static volatile String f4898s;

    /* renamed from: a  reason: collision with root package name */
    private a f4899a;

    /* renamed from: b  reason: collision with root package name */
    private String f4900b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f4901c;

    /* renamed from: d  reason: collision with root package name */
    private String f4902d;

    /* renamed from: e  reason: collision with root package name */
    private String f4903e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4904f;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f4905g;

    /* renamed from: h  reason: collision with root package name */
    private Object f4906h;

    /* renamed from: i  reason: collision with root package name */
    private String f4907i;

    /* renamed from: j  reason: collision with root package name */
    private b f4908j;

    /* renamed from: k  reason: collision with root package name */
    private s0 f4909k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4910l;

    /* renamed from: m  reason: collision with root package name */
    private String f4911m;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m0 f4912a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f4913b;

        public a(m0 m0Var, Object obj) {
            l.e(m0Var, "request");
            this.f4912a = m0Var;
            this.f4913b = obj;
        }

        public final m0 a() {
            return this.f4912a;
        }

        public final Object b() {
            return this.f4913b;
        }
    }

    public interface b {
        void a(r0 r0Var);
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(db.g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                l.d(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void D(org.json.JSONObject r10, java.lang.String r11, com.facebook.m0.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                int r0 = lb.q.F(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = lb.q.F(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L_0x0023
                r3 = -1
                if (r11 == r3) goto L_0x0021
                if (r0 >= r11) goto L_0x0023
            L_0x0021:
                r11 = 1
                goto L_0x0024
            L_0x0023:
                r11 = 0
            L_0x0024:
                java.util.Iterator r0 = r10.keys()
            L_0x0028:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L_0x0044
                java.lang.String r5 = "image"
                boolean r5 = lb.p.l(r3, r5, r1)
                if (r5 == 0) goto L_0x0044
                r5 = 1
                goto L_0x0045
            L_0x0044:
                r5 = 0
            L_0x0045:
                java.lang.String r6 = "key"
                db.l.d(r3, r6)
                java.lang.String r6 = "value"
                db.l.d(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L_0x0028
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.m0.c.D(org.json.JSONObject, java.lang.String, com.facebook.m0$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            String str2;
            String optString;
            String str3;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        w wVar = w.f9429a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        l.d(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        l.d(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    optString = jSONObject.optString("id");
                    str3 = "jsonObject.optString(\"id\")";
                } else if (jSONObject.has("url")) {
                    optString = jSONObject.optString("url");
                    str3 = "jsonObject.optString(\"url\")";
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    l.d(jSONObject2, "jsonObject.toString()");
                    E(str, jSONObject2, eVar, z10);
                    return;
                } else {
                    return;
                }
                l.d(optString, str3);
                E(str, optString, eVar, z10);
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        w wVar2 = w.f9429a;
                        String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                        l.d(format2, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i10);
                        l.d(opt2, "jsonArray.opt(i)");
                        E(format2, opt2, eVar, z10);
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    str2 = obj.toString();
                } else if (Date.class.isAssignableFrom(cls)) {
                    str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    l.d(str2, "iso8601DateFormat.format(date)");
                } else {
                    s0 s0Var = s0.f9663a;
                    String str4 = m0.f4894o;
                    s0.j0(str4, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                    return;
                }
                eVar.a(str, str2);
            }
        }

        private final void F(q0 q0Var, e0 e0Var, int i10, URL url, OutputStream outputStream, boolean z10) {
            g gVar = new g(outputStream, e0Var, z10);
            boolean z11 = false;
            if (i10 == 1) {
                m0 l10 = q0Var.get(0);
                HashMap hashMap = new HashMap();
                for (String next : l10.u().keySet()) {
                    Object obj = l10.u().get(next);
                    if (v(obj)) {
                        l.d(next, "key");
                        hashMap.put(next, new a(l10, obj));
                    }
                }
                if (e0Var != null) {
                    e0Var.b("  Parameters:\n");
                }
                J(l10.u(), gVar, l10);
                if (e0Var != null) {
                    e0Var.b("  Attachments:\n");
                }
                I(hashMap, gVar);
                JSONObject q10 = l10.q();
                if (q10 != null) {
                    String path = url.getPath();
                    l.d(path, "url.path");
                    D(q10, path, gVar);
                    return;
                }
                return;
            }
            String p10 = p(q0Var);
            if (p10.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                gVar.a("batch_app_id", p10);
                HashMap hashMap2 = new HashMap();
                K(gVar, q0Var, hashMap2);
                if (e0Var != null) {
                    e0Var.b("  Attachments:\n");
                }
                I(hashMap2, gVar);
                return;
            }
            throw new v("App ID was not specified at the request or Settings.");
        }

        /* access modifiers changed from: private */
        public static final void H(ArrayList arrayList, q0 q0Var) {
            l.e(arrayList, "$callbacks");
            l.e(q0Var, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                l.d(obj, "pair.second");
                ((b) pair.first).a((r0) obj);
            }
            for (q0.a a10 : q0Var.p()) {
                a10.a(q0Var);
            }
        }

        private final void I(Map map, g gVar) {
            for (Map.Entry entry : map.entrySet()) {
                if (m0.f4893n.v(((a) entry.getValue()).b())) {
                    gVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, g gVar, m0 m0Var) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (w(obj)) {
                    l.d(next, "key");
                    gVar.j(next, obj, m0Var);
                }
            }
        }

        private final void K(g gVar, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((m0) it.next()).B(jSONArray, map);
            }
            gVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (z10) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", q());
        }

        private final HttpURLConnection g(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", r());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        private final String p(q0 q0Var) {
            String m10 = q0Var.m();
            boolean z10 = true;
            if (m10 != null && (!q0Var.isEmpty())) {
                return m10;
            }
            Iterator it = q0Var.iterator();
            while (it.hasNext()) {
                a m11 = ((m0) it.next()).m();
                if (m11 != null) {
                    return m11.c();
                }
            }
            String c10 = m0.f4896q;
            if (c10 != null) {
                if (c10.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return c10;
                }
            }
            return i0.m();
        }

        private final String q() {
            w wVar = w.f9429a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{m0.f4895p}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String r() {
            if (m0.f4898s == null) {
                w wVar = w.f9429a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.2.0"}, 2));
                l.d(format, "java.lang.String.format(format, *args)");
                m0.f4898s = format;
                String a10 = b0.a();
                if (!s0.c0(a10)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{m0.f4898s, a10}, 2));
                    l.d(format2, "java.lang.String.format(locale, format, *args)");
                    m0.f4898s = format2;
                }
            }
            return m0.f4898s;
        }

        private final boolean s(q0 q0Var) {
            for (q0.a aVar : q0Var.p()) {
            }
            Iterator it = q0Var.iterator();
            while (it.hasNext()) {
                ((m0) it.next()).o();
            }
            return false;
        }

        private final boolean t(q0 q0Var) {
            Iterator it = q0Var.iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) it.next();
                Iterator<String> it2 = m0Var.u().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (v(m0Var.u().get(it2.next()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            Matcher matcher = m0.f4897r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                l.d(str, "matcher.group(1)");
            }
            return p.t(str, "me/", false, 2, (Object) null) || p.t(str, "/me/", false, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
        }

        /* access modifiers changed from: private */
        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* access modifiers changed from: private */
        public static final void z(d dVar, r0 r0Var) {
            l.e(r0Var, "response");
            if (dVar != null) {
                dVar.a(r0Var.c(), r0Var);
            }
        }

        public final m0 A(a aVar, String str, JSONObject jSONObject, b bVar) {
            m0 m0Var = new m0(aVar, str, (Bundle) null, s0.POST, bVar, (String) null, 32, (db.g) null);
            m0Var.E(jSONObject);
            return m0Var;
        }

        public final m0 B(a aVar, String str, Bundle bundle, b bVar) {
            return new m0(aVar, str, bundle, s0.POST, bVar, (String) null, 32, (db.g) null);
        }

        public final void G(q0 q0Var, List list) {
            l.e(q0Var, "requests");
            l.e(list, "responses");
            int size = q0Var.size();
            ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    m0 l10 = q0Var.get(i10);
                    if (l10.o() != null) {
                        arrayList.add(new Pair(l10.o(), list.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (arrayList.size() > 0) {
                n0 n0Var = new n0(arrayList, q0Var);
                Handler o10 = q0Var.o();
                if ((o10 == null ? null : Boolean.valueOf(o10.post(n0Var))) == null) {
                    n0Var.run();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void L(com.facebook.q0 r14, java.net.HttpURLConnection r15) {
            /*
                r13 = this;
                java.lang.String r0 = "requests"
                db.l.e(r14, r0)
                java.lang.String r0 = "connection"
                db.l.e(r15, r0)
                e2.e0 r0 = new e2.e0
                com.facebook.u0 r1 = com.facebook.u0.REQUESTS
                java.lang.String r2 = "Request"
                r0.<init>(r1, r2)
                int r10 = r14.size()
                boolean r11 = r13.t(r14)
                r1 = 0
                r2 = 0
                r3 = 1
                if (r10 != r3) goto L_0x0029
                com.facebook.m0 r4 = r14.get(r1)
                com.facebook.s0 r4 = r4.t()
                goto L_0x002a
            L_0x0029:
                r4 = r2
            L_0x002a:
                if (r4 != 0) goto L_0x002e
                com.facebook.s0 r4 = com.facebook.s0.POST
            L_0x002e:
                java.lang.String r5 = r4.name()
                r15.setRequestMethod(r5)
                r13.M(r15, r11)
                java.net.URL r12 = r15.getURL()
                java.lang.String r5 = "Request:\n"
                r0.b(r5)
                java.lang.String r5 = "Id"
                java.lang.String r6 = r14.q()
                r0.d(r5, r6)
                java.lang.String r5 = "url"
                db.l.d(r12, r5)
                java.lang.String r5 = "URL"
                r0.d(r5, r12)
                java.lang.String r5 = r15.getRequestMethod()
                java.lang.String r6 = "connection.requestMethod"
                db.l.d(r5, r6)
                java.lang.String r6 = "Method"
                r0.d(r6, r5)
                java.lang.String r5 = "User-Agent"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"User-Agent\")"
                db.l.d(r6, r7)
                r0.d(r5, r6)
                java.lang.String r5 = "Content-Type"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"Content-Type\")"
                db.l.d(r6, r7)
                r0.d(r5, r6)
                int r5 = r14.t()
                r15.setConnectTimeout(r5)
                int r5 = r14.t()
                r15.setReadTimeout(r5)
                com.facebook.s0 r5 = com.facebook.s0.POST
                if (r4 != r5) goto L_0x0091
                r1 = 1
            L_0x0091:
                if (r1 != 0) goto L_0x0097
                r0.e()
                return
            L_0x0097:
                r15.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ee }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x00ee }
                r1.<init>(r15)     // Catch:{ all -> 0x00ee }
                if (r11 == 0) goto L_0x00ae
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00ab }
                r15.<init>(r1)     // Catch:{ all -> 0x00ab }
                goto L_0x00af
            L_0x00ab:
                r14 = move-exception
                r2 = r1
                goto L_0x00ef
            L_0x00ae:
                r15 = r1
            L_0x00af:
                boolean r1 = r13.s(r14)     // Catch:{ all -> 0x00eb }
                if (r1 == 0) goto L_0x00da
                com.facebook.y0 r1 = new com.facebook.y0     // Catch:{ all -> 0x00eb }
                android.os.Handler r2 = r14.o()     // Catch:{ all -> 0x00eb }
                r1.<init>(r2)     // Catch:{ all -> 0x00eb }
                r5 = 0
                r3 = r13
                r4 = r14
                r6 = r10
                r7 = r12
                r8 = r1
                r9 = r11
                r3.F(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
                int r2 = r1.g()     // Catch:{ all -> 0x00eb }
                java.util.Map r5 = r1.h()     // Catch:{ all -> 0x00eb }
                com.facebook.z0 r1 = new com.facebook.z0     // Catch:{ all -> 0x00eb }
                long r6 = (long) r2     // Catch:{ all -> 0x00eb }
                r2 = r1
                r3 = r15
                r4 = r14
                r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00eb }
                r15 = r1
            L_0x00da:
                r1 = r13
                r2 = r14
                r3 = r0
                r4 = r10
                r5 = r12
                r6 = r15
                r7 = r11
                r1.F(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00eb }
                r15.close()
                r0.e()
                return
            L_0x00eb:
                r14 = move-exception
                r2 = r15
                goto L_0x00ef
            L_0x00ee:
                r14 = move-exception
            L_0x00ef:
                if (r2 != 0) goto L_0x00f2
                goto L_0x00f5
            L_0x00f2:
                r2.close()
            L_0x00f5:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.m0.c.L(com.facebook.q0, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(q0 q0Var) {
            l.e(q0Var, "requests");
            O(q0Var);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(q0Var.size() == 1 ? new URL(q0Var.get(0).x()) : new URL(j0.h()));
                    L(q0Var, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    s0.q(httpURLConnection);
                    throw new v("could not construct request body", e10);
                } catch (JSONException e11) {
                    s0.q(httpURLConnection);
                    throw new v("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new v("could not construct URL for request", e12);
            }
        }

        public final void O(q0 q0Var) {
            l.e(q0Var, "requests");
            Iterator it = q0Var.iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) it.next();
                if (s0.GET == m0Var.t()) {
                    s0 s0Var = s0.f9663a;
                    if (s0.c0(m0Var.u().getString("fields"))) {
                        e0.a aVar = e0.f9535e;
                        u0 u0Var = u0.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String r10 = m0Var.r();
                        if (r10 == null) {
                            r10 = "";
                        }
                        sb2.append(r10);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(u0Var, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        public final r0 h(m0 m0Var) {
            l.e(m0Var, "request");
            List k10 = k(m0Var);
            if (k10.size() == 1) {
                return (r0) k10.get(0);
            }
            throw new v("invalid state: expected a single response");
        }

        public final List i(q0 q0Var) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            l.e(q0Var, "requests");
            t0.i(q0Var, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(q0Var);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                s0.q(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    list = o(httpURLConnection, q0Var);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    s0.q(httpURLConnection2);
                    throw th;
                }
            } else {
                List a10 = r0.f4956i.a(q0Var.r(), (HttpURLConnection) null, new v((Throwable) exc));
                G(q0Var, a10);
                list = a10;
            }
            s0.q(httpURLConnection);
            return list;
        }

        public final List j(Collection collection) {
            l.e(collection, "requests");
            return i(new q0(collection));
        }

        public final List k(m0... m0VarArr) {
            l.e(m0VarArr, "requests");
            return j(j.u(m0VarArr));
        }

        public final p0 l(q0 q0Var) {
            l.e(q0Var, "requests");
            t0.i(q0Var, "requests");
            p0 p0Var = new p0(q0Var);
            p0Var.executeOnExecutor(i0.t(), new Void[0]);
            return p0Var;
        }

        public final p0 m(Collection collection) {
            l.e(collection, "requests");
            return l(new q0(collection));
        }

        public final p0 n(m0... m0VarArr) {
            l.e(m0VarArr, "requests");
            return m(j.u(m0VarArr));
        }

        public final List o(HttpURLConnection httpURLConnection, q0 q0Var) {
            l.e(httpURLConnection, "connection");
            l.e(q0Var, "requests");
            List f10 = r0.f4956i.f(httpURLConnection, q0Var);
            s0.q(httpURLConnection);
            int size = q0Var.size();
            if (size == f10.size()) {
                G(q0Var, f10);
                g.f4738f.e().h();
                return f10;
            }
            w wVar = w.f9429a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f10.size()), Integer.valueOf(size)}, 2));
            l.d(format, "java.lang.String.format(locale, format, *args)");
            throw new v(format);
        }

        public final m0 x(a aVar, String str, b bVar) {
            return new m0(aVar, str, (Bundle) null, (s0) null, bVar, (String) null, 32, (db.g) null);
        }

        public final m0 y(a aVar, d dVar) {
            return new m0(aVar, "me", (Bundle) null, (s0) null, new o0(dVar), (String) null, 32, (db.g) null);
        }
    }

    public interface d {
        void a(JSONObject jSONObject, r0 r0Var);
    }

    private interface e {
        void a(String str, String str2);
    }

    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public static final b f4914g = new b((db.g) null);

        /* renamed from: e  reason: collision with root package name */
        private final String f4915e;

        /* renamed from: f  reason: collision with root package name */
        private final Parcelable f4916f;

        public static final class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                l.e(parcel, "source");
                return new f(parcel, (db.g) null);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(db.g gVar) {
                this();
            }
        }

        private f(Parcel parcel) {
            this.f4915e = parcel.readString();
            this.f4916f = parcel.readParcelable(i0.l().getClassLoader());
        }

        public final String a() {
            return this.f4915e;
        }

        public final Parcelable b() {
            return this.f4916f;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            l.e(parcel, "out");
            parcel.writeString(this.f4915e);
            parcel.writeParcelable(this.f4916f, i10);
        }

        public /* synthetic */ f(Parcel parcel, db.g gVar) {
            this(parcel);
        }

        public f(Parcelable parcelable, String str) {
            this.f4915e = str;
            this.f4916f = parcelable;
        }
    }

    private static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f4917a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f4918b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4919c = true;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f4920d;

        public g(OutputStream outputStream, e0 e0Var, boolean z10) {
            l.e(outputStream, "outputStream");
            this.f4917a = outputStream;
            this.f4918b = e0Var;
            this.f4920d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, String str2) {
            l.e(str, "key");
            l.e(str2, FirebaseAnalytics.Param.VALUE);
            f(str, (String) null, (String) null);
            i("%s", str2);
            k();
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                e0Var.d(l.l("    ", str), str2);
            }
        }

        public final void c(String str, Object... objArr) {
            l.e(str, "format");
            l.e(objArr, "args");
            if (!this.f4920d) {
                if (this.f4919c) {
                    OutputStream outputStream = this.f4917a;
                    Charset charset = lb.d.f13235b;
                    byte[] bytes = "--".getBytes(charset);
                    l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f4917a;
                    String d10 = m0.f4895p;
                    if (d10 != null) {
                        byte[] bytes2 = d10.getBytes(charset);
                        l.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f4917a;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        l.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f4919c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f4917a;
                w wVar = w.f9429a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                l.d(format, "java.lang.String.format(format, *args)");
                Charset charset2 = lb.d.f13235b;
                if (format != null) {
                    byte[] bytes4 = format.getBytes(charset2);
                    l.d(bytes4, "(this as java.lang.String).getBytes(charset)");
                    outputStream4.write(bytes4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            OutputStream outputStream5 = this.f4917a;
            w wVar2 = w.f9429a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            l.d(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            l.d(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(lb.d.f13235b);
            l.d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) {
            l.e(str, "key");
            l.e(bitmap, "bitmap");
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f4917a);
            i("", new Object[0]);
            k();
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                e0Var.d(l.l("    ", str), "<Image>");
            }
        }

        public final void e(String str, byte[] bArr) {
            l.e(str, "key");
            l.e(bArr, "bytes");
            f(str, str, "content/unknown");
            this.f4917a.write(bArr);
            i("", new Object[0]);
            k();
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                String l10 = l.l("    ", str);
                w wVar = w.f9429a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                e0Var.d(l10, format);
            }
        }

        public final void f(String str, String str2, String str3) {
            if (!this.f4920d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f4917a;
            w wVar = w.f9429a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            Charset charset = lb.d.f13235b;
            if (format != null) {
                byte[] bytes = format.getBytes(charset);
                l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public final void g(String str, Uri uri, String str2) {
            int i10;
            l.e(str, "key");
            l.e(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.f4917a instanceof y0) {
                ((y0) this.f4917a).c(s0.z(uri));
                i10 = 0;
            } else {
                InputStream openInputStream = i0.l().getContentResolver().openInputStream(uri);
                s0 s0Var = s0.f9663a;
                i10 = s0.p(openInputStream, this.f4917a) + 0;
            }
            i("", new Object[0]);
            k();
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                String l10 = l.l("    ", str);
                w wVar = w.f9429a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                e0Var.d(l10, format);
            }
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i10;
            l.e(str, "key");
            l.e(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.f4917a;
            if (outputStream instanceof y0) {
                ((y0) outputStream).c(parcelFileDescriptor.getStatSize());
                i10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                s0 s0Var = s0.f9663a;
                i10 = s0.p(autoCloseInputStream, this.f4917a) + 0;
            }
            i("", new Object[0]);
            k();
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                String l10 = l.l("    ", str);
                w wVar = w.f9429a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                e0Var.d(l10, format);
            }
        }

        public final void i(String str, Object... objArr) {
            l.e(str, "format");
            l.e(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f4920d) {
                c("\r\n", new Object[0]);
            }
        }

        public final void j(String str, Object obj, m0 m0Var) {
            l.e(str, "key");
            OutputStream outputStream = this.f4917a;
            if (outputStream instanceof a1) {
                ((a1) outputStream).a(m0Var);
            }
            c cVar = m0.f4893n;
            if (cVar.w(obj)) {
                a(str, cVar.C(obj));
            } else if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                Parcelable b10 = fVar.b();
                String a10 = fVar.a();
                if (b10 instanceof ParcelFileDescriptor) {
                    h(str, (ParcelFileDescriptor) b10, a10);
                } else if (b10 instanceof Uri) {
                    g(str, (Uri) b10, a10);
                } else {
                    throw b();
                }
            } else {
                throw b();
            }
        }

        public final void k() {
            if (!this.f4920d) {
                i("--%s", m0.f4895p);
                return;
            }
            OutputStream outputStream = this.f4917a;
            byte[] bytes = "&".getBytes(lb.d.f13235b);
            l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection collection) {
            l.e(str, "key");
            l.e(jSONArray, "requestJsonArray");
            l.e(collection, "requests");
            OutputStream outputStream = this.f4917a;
            if (!(outputStream instanceof a1)) {
                String jSONArray2 = jSONArray.toString();
                l.d(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
                return;
            }
            a1 a1Var = (a1) outputStream;
            f(str, (String) null, (String) null);
            c("[", new Object[0]);
            Iterator it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                a1Var.a((m0) it.next());
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            e0 e0Var = this.f4918b;
            if (e0Var != null) {
                String l10 = l.l("    ", str);
                String jSONArray3 = jSONArray.toString();
                l.d(jSONArray3, "requestJsonArray.toString()");
                e0Var.d(l10, jSONArray3);
            }
        }
    }

    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4921a;

        h(ArrayList arrayList) {
            this.f4921a = arrayList;
        }

        public void a(String str, String str2) {
            l.e(str, "key");
            l.e(str2, FirebaseAnalytics.Param.VALUE);
            ArrayList arrayList = this.f4921a;
            w wVar = w.f9429a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            l.d(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        l.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < nextInt);
        }
        String sb3 = sb2.toString();
        l.d(sb3, "buffer.toString()");
        f4895p = sb3;
    }

    public m0(a aVar, String str, Bundle bundle, s0 s0Var, b bVar, String str2) {
        Bundle bundle2;
        this.f4904f = true;
        this.f4899a = aVar;
        this.f4900b = str;
        this.f4907i = str2;
        C(bVar);
        F(s0Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.f4905g = bundle2;
        if (this.f4907i == null) {
            this.f4907i = i0.w();
        }
    }

    private final boolean A() {
        if (!l.a(i0.x(), "instagram.com")) {
            return true;
        }
        return !z();
    }

    /* access modifiers changed from: private */
    public final void B(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f4902d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f4904f);
        }
        String str2 = this.f4903e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v10 = v();
        jSONObject.put("relative_url", v10);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, this.f4909k);
        a aVar = this.f4899a;
        if (aVar != null) {
            e0.f9535e.d(aVar.m());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f4905g.keySet()) {
            Object obj = this.f4905g.get(str3);
            if (f4893n.v(obj)) {
                w wVar = w.f9429a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f4901c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f4893n.D(jSONObject2, v10, new h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean I() {
        String n10 = n();
        boolean w10 = n10 == null ? false : q.w(n10, "|", false, 2, (Object) null);
        if (!(n10 != null && p.t(n10, "IG", false, 2, (Object) null) && !w10) || !z()) {
            return !A() && !w10;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void b(b bVar, r0 r0Var) {
        int length;
        l.e(r0Var, "response");
        JSONObject c10 = r0Var.c();
        JSONObject optJSONObject = c10 == null ? null : c10.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString(i.EVENT_TYPE_KEY);
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString(DynamicLink.Builder.KEY_LINK);
                if (!(optString == null || optString2 == null)) {
                    u0 u0Var = u0.GRAPH_API_DEBUG_INFO;
                    if (l.a(optString2, "warning")) {
                        u0Var = u0.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!s0.c0(optString3)) {
                        optString = optString + " Link: " + optString3;
                    }
                    e0.a aVar = e0.f9535e;
                    String str = f4894o;
                    l.d(str, "TAG");
                    aVar.b(u0Var, str, optString);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        if (bVar != null) {
            bVar.a(r0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f4905g
            boolean r1 = r3.I()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r3.p()
        L_0x000e:
            r0.putString(r2, r1)
            goto L_0x0019
        L_0x0012:
            java.lang.String r1 = r3.n()
            if (r1 == 0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L_0x0032
            e2.s0 r1 = e2.s0.f9663a
            java.lang.String r1 = com.facebook.i0.r()
            boolean r1 = e2.s0.c0(r1)
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = f4894o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L_0x0032:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.i0 r1 = com.facebook.i0.f4776a
            com.facebook.u0 r1 = com.facebook.u0.GRAPH_API_DEBUG_INFO
            boolean r1 = com.facebook.i0.H(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "info"
        L_0x004e:
            r0.putString(r2, r1)
            goto L_0x005d
        L_0x0052:
            com.facebook.u0 r1 = com.facebook.u0.GRAPH_API_DEBUG_WARNING
            boolean r1 = com.facebook.i0.H(r1)
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = "warning"
            goto L_0x004e
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m0.i():void");
    }

    private final String j(String str, boolean z10) {
        if (!z10 && this.f4909k == s0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f4905g.keySet()) {
            Object obj = this.f4905g.get(next);
            if (obj == null) {
                obj = "";
            }
            c cVar = f4893n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(next, cVar.C(obj).toString());
            } else if (this.f4909k != s0.GET) {
                w wVar = w.f9429a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        l.d(builder, "uriBuilder.toString()");
        return builder;
    }

    private final String n() {
        a aVar = this.f4899a;
        if (aVar != null) {
            if (!this.f4905g.containsKey("access_token")) {
                String m10 = aVar.m();
                e0.f9535e.d(m10);
                return m10;
            }
        } else if (!this.f4905g.containsKey("access_token")) {
            return p();
        }
        return this.f4905g.getString("access_token");
    }

    private final String p() {
        String m10 = i0.m();
        String r10 = i0.r();
        boolean z10 = true;
        if (m10.length() > 0) {
            if (r10.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                return m10 + '|' + r10;
            }
        }
        s0 s0Var = s0.f9663a;
        s0.j0(f4894o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String s() {
        if (f4897r.matcher(this.f4900b).matches()) {
            return this.f4900b;
        }
        w wVar = w.f9429a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f4907i, this.f4900b}, 2));
        l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String y(String str) {
        if (!A()) {
            str = j0.f();
        }
        w wVar = w.f9429a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean z() {
        if (this.f4900b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(i0.m());
        sb2.append("/?.*");
        return this.f4910l || Pattern.matches(sb2.toString(), this.f4900b) || Pattern.matches("^/?app/?.*", this.f4900b);
    }

    public final void C(b bVar) {
        i0 i0Var = i0.f4776a;
        if (i0.H(u0.GRAPH_API_DEBUG_INFO) || i0.H(u0.GRAPH_API_DEBUG_WARNING)) {
            this.f4908j = new l0(bVar);
        } else {
            this.f4908j = bVar;
        }
    }

    public final void D(boolean z10) {
        this.f4910l = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.f4901c = jSONObject;
    }

    public final void F(s0 s0Var) {
        if (this.f4911m == null || s0Var == s0.GET) {
            if (s0Var == null) {
                s0Var = s0.GET;
            }
            this.f4909k = s0Var;
            return;
        }
        throw new v("Can't change HTTP method on request with overridden URL.");
    }

    public final void G(Bundle bundle) {
        l.e(bundle, "<set-?>");
        this.f4905g = bundle;
    }

    public final void H(Object obj) {
        this.f4906h = obj;
    }

    public final r0 k() {
        return f4893n.h(this);
    }

    public final p0 l() {
        return f4893n.n(this);
    }

    public final a m() {
        return this.f4899a;
    }

    public final b o() {
        return this.f4908j;
    }

    public final JSONObject q() {
        return this.f4901c;
    }

    public final String r() {
        return this.f4900b;
    }

    public final s0 t() {
        return this.f4909k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f4899a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f4900b);
        sb2.append(", graphObject: ");
        sb2.append(this.f4901c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f4909k);
        sb2.append(", parameters: ");
        sb2.append(this.f4905g);
        sb2.append("}");
        String sb3 = sb2.toString();
        l.d(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    public final Bundle u() {
        return this.f4905g;
    }

    public final String v() {
        if (this.f4911m == null) {
            String y10 = y(j0.h());
            i();
            Uri parse = Uri.parse(j(y10, true));
            w wVar = w.f9429a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            l.d(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new v("Can't override URL for a batch request");
    }

    public final Object w() {
        return this.f4906h;
    }

    public final String x() {
        String str;
        String str2 = this.f4911m;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.f4900b;
        if (this.f4909k != s0.POST || str3 == null || !p.k(str3, "/videos", false, 2, (Object) null)) {
            j0 j0Var = j0.f9580a;
            str = j0.i(i0.x());
        } else {
            str = j0.j();
        }
        String y10 = y(str);
        i();
        return j(y10, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m0(com.facebook.a r6, java.lang.String r7, android.os.Bundle r8, com.facebook.s0 r9, com.facebook.m0.b r10, java.lang.String r11, int r12, db.g r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m0.<init>(com.facebook.a, java.lang.String, android.os.Bundle, com.facebook.s0, com.facebook.m0$b, java.lang.String, int, db.g):void");
    }
}
