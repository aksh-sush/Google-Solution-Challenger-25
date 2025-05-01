package com.facebook;

import android.util.Log;
import com.facebook.a;
import com.google.firebase.messaging.Constants;
import db.g;
import db.l;
import db.w;
import e2.e0;
import e2.s0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class r0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f4956i = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f4957j = r0.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final m0 f4958a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f4959b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4960c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f4961d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONArray f4962e;

    /* renamed from: f  reason: collision with root package name */
    private final y f4963f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f4964g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONArray f4965h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final r0 b(m0 m0Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            Boolean bool = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                y a10 = y.f5006s.a(jSONObject, obj2, httpURLConnection);
                if (a10 != null) {
                    Log.e(r0.f4957j, a10.toString());
                    if (a10.b() == 190) {
                        s0 s0Var = s0.f9663a;
                        if (s0.Y(m0Var.m())) {
                            if (a10.g() != 493) {
                                a.f4683p.h((a) null);
                            } else {
                                a.c cVar = a.f4683p;
                                a e10 = cVar.e();
                                if (e10 != null) {
                                    bool = Boolean.valueOf(e10.o());
                                }
                                if (l.a(bool, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new r0(m0Var, httpURLConnection, a10);
                }
                Object O = s0.O(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (O instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) O;
                    return new r0(m0Var, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (O instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) O;
                    return new r0(m0Var, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    obj = JSONObject.NULL;
                    l.d(obj, "NULL");
                }
            }
            if (obj == JSONObject.NULL) {
                return new r0(m0Var, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new v(l.l("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[LOOP:0: B:21:0x0062->B:30:0x009b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009d A[EDGE_INSN: B:34:0x009d->B:31:0x009d ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List c(java.net.HttpURLConnection r9, java.util.List r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L_0x004e
                java.lang.Object r2 = r10.get(r3)
                com.facebook.m0 r2 = (com.facebook.m0) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r4.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                if (r9 != 0) goto L_0x0022
                r5 = 200(0xc8, float:2.8E-43)
                goto L_0x0026
            L_0x0022:
                int r5 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            L_0x0026:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r5.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                r5.put(r4)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
                goto L_0x004f
            L_0x0034:
                r4 = move-exception
                com.facebook.r0 r5 = new com.facebook.r0
                com.facebook.y r6 = new com.facebook.y
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
                goto L_0x004b
            L_0x0040:
                r4 = move-exception
                com.facebook.r0 r5 = new com.facebook.r0
                com.facebook.y r6 = new com.facebook.y
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
            L_0x004b:
                r1.add(r5)
            L_0x004e:
                r5 = r11
            L_0x004f:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto L_0x009e
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto L_0x009e
                int r0 = r2.length()
                if (r0 <= 0) goto L_0x009d
            L_0x0062:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                com.facebook.m0 r4 = (com.facebook.m0) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x008a, v -> 0x007e }
                java.lang.Object r3 = r6.get(r3)     // Catch:{ JSONException -> 0x008a, v -> 0x007e }
                java.lang.String r6 = "obj"
                db.l.d(r3, r6)     // Catch:{ JSONException -> 0x008a, v -> 0x007e }
                com.facebook.r0 r3 = r8.b(r4, r9, r3, r11)     // Catch:{ JSONException -> 0x008a, v -> 0x007e }
                r1.add(r3)     // Catch:{ JSONException -> 0x008a, v -> 0x007e }
                goto L_0x0098
            L_0x007e:
                r3 = move-exception
                com.facebook.r0 r6 = new com.facebook.r0
                com.facebook.y r7 = new com.facebook.y
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r3)
                r6.<init>(r4, r9, r7)
                goto L_0x0095
            L_0x008a:
                r3 = move-exception
                com.facebook.r0 r6 = new com.facebook.r0
                com.facebook.y r7 = new com.facebook.y
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r3)
                r6.<init>(r4, r9, r7)
            L_0x0095:
                r1.add(r6)
            L_0x0098:
                if (r2 < r0) goto L_0x009b
                goto L_0x009d
            L_0x009b:
                r3 = r2
                goto L_0x0062
            L_0x009d:
                return r1
            L_0x009e:
                com.facebook.v r9 = new com.facebook.v
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>((java.lang.String) r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.r0.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List a(List list, HttpURLConnection httpURLConnection, v vVar) {
            l.e(list, "requests");
            ArrayList arrayList = new ArrayList(p.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new r0((m0) it.next(), httpURLConnection, new y(httpURLConnection, (Exception) vVar)));
            }
            return arrayList;
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, q0 q0Var) {
            l.e(q0Var, "requests");
            String s02 = s0.s0(inputStream);
            e0.f9535e.c(u0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(s02.length()), s02);
            return e(s02, httpURLConnection, q0Var);
        }

        public final List e(String str, HttpURLConnection httpURLConnection, q0 q0Var) {
            l.e(str, "responseString");
            l.e(q0Var, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            l.d(nextValue, "resultObject");
            List c10 = c(httpURLConnection, q0Var, nextValue);
            e0.f9535e.c(u0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", q0Var.q(), Integer.valueOf(str.length()), c10);
            return c10;
        }

        public final List f(HttpURLConnection httpURLConnection, q0 q0Var) {
            List a10;
            l.e(httpURLConnection, "connection");
            l.e(q0Var, "requests");
            InputStream inputStream = null;
            try {
                if (i0.E()) {
                    inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    a10 = d(inputStream, httpURLConnection, q0Var);
                    s0.j(inputStream);
                    return a10;
                }
                Log.e(r0.f4957j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new v("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } catch (v e10) {
                e0.f9535e.c(u0.REQUESTS, "Response", "Response <Error>: %s", e10);
                a10 = a(q0Var, httpURLConnection, e10);
            } catch (Exception e11) {
                e0.f9535e.c(u0.REQUESTS, "Response", "Response <Error>: %s", e11);
                a10 = a(q0Var, httpURLConnection, new v((Throwable) e11));
            } catch (Throwable th) {
                s0.j((Closeable) null);
                throw th;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r0(m0 m0Var, HttpURLConnection httpURLConnection, y yVar) {
        this(m0Var, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, yVar);
        l.e(m0Var, "request");
        l.e(yVar, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public final y b() {
        return this.f4963f;
    }

    public final JSONObject c() {
        return this.f4961d;
    }

    public final JSONObject d() {
        return this.f4964g;
    }

    public String toString() {
        String str;
        try {
            w wVar = w.f9429a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f4959b;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            l.d(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response: " + " responseCode: " + str + ", graphObject: " + this.f4961d + ", error: " + this.f4963f + "}";
        l.d(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r0(m0 m0Var, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(m0Var, httpURLConnection, str, (JSONObject) null, jSONArray, (y) null);
        l.e(m0Var, "request");
        l.e(str, "rawResponse");
        l.e(jSONArray, "graphObjects");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r0(m0 m0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(m0Var, httpURLConnection, str, jSONObject, (JSONArray) null, (y) null);
        l.e(m0Var, "request");
        l.e(str, "rawResponse");
    }

    public r0(m0 m0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, y yVar) {
        l.e(m0Var, "request");
        this.f4958a = m0Var;
        this.f4959b = httpURLConnection;
        this.f4960c = str;
        this.f4961d = jSONObject;
        this.f4962e = jSONArray;
        this.f4963f = yVar;
        this.f4964g = jSONObject;
        this.f4965h = jSONArray;
    }
}
