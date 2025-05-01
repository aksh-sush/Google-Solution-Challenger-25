package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import s2.j;
import s2.k;
import s2.l;
import s2.m;
import s2.n;
import s2.o;
import s2.p;
import t2.g;
import t2.h;
import u2.f;
import u2.m;

final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final DataEncoder f5049a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f5050b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5051c;

    /* renamed from: d  reason: collision with root package name */
    final URL f5052d;

    /* renamed from: e  reason: collision with root package name */
    private final c3.a f5053e;

    /* renamed from: f  reason: collision with root package name */
    private final c3.a f5054f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5055g;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f5056a;

        /* renamed from: b  reason: collision with root package name */
        final j f5057b;

        /* renamed from: c  reason: collision with root package name */
        final String f5058c;

        a(URL url, j jVar, String str) {
            this.f5056a = url;
            this.f5057b = jVar;
            this.f5058c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f5057b, this.f5058c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f5059a;

        /* renamed from: b  reason: collision with root package name */
        final URL f5060b;

        /* renamed from: c  reason: collision with root package name */
        final long f5061c;

        b(int i10, URL url, long j10) {
            this.f5059a = i10;
            this.f5060b = url;
            this.f5061c = j10;
        }
    }

    d(Context context, c3.a aVar, c3.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    /* access modifiers changed from: private */
    public b e(a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream m10;
        w2.a.a("CctTransportBackend", "Making request to: %s", aVar.f5056a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5056a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5055g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.0.0"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5058c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f5049a.encode(aVar.f5057b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                w2.a.e("CctTransportBackend", "Status Code: " + responseCode);
                w2.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                w2.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e10) {
            w2.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, (URL) null, 0);
        } catch (EncodingException | IOException e11) {
            w2.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = o.b.COMBINED;
            } else if (o.b.a(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.c();
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.c() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            w2.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (h hVar : fVar.b()) {
            String j10 = hVar.j();
            if (!hashMap.containsKey(j10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(j10, arrayList);
            } else {
                ((List) hashMap.get(j10)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            m.a b10 = s2.m.a().f(p.DEFAULT).g(this.f5054f.a()).h(this.f5053e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(s2.a.a().m(Integer.valueOf(hVar2.g("sdk-version"))).j(hVar2.b("model")).f(hVar2.b("hardware")).d(hVar2.b("device")).l(hVar2.b("product")).k(hVar2.b("os-uild")).h(hVar2.b("manufacturer")).e(hVar2.b("fingerprint")).c(hVar2.b("country")).g(hVar2.b("locale")).i(hVar2.b("mcc_mnc")).b(hVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                g e10 = hVar3.e();
                r2.b b11 = e10.b();
                if (b11.equals(r2.b.b("proto"))) {
                    aVar = l.j(e10.a());
                } else if (b11.equals(r2.b.b("json"))) {
                    aVar = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    w2.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.c(hVar3.f()).d(hVar3.k()).h(hVar3.h("tz-offset")).e(o.a().c(o.c.a(hVar3.g("net-type"))).b(o.b.a(hVar3.g("mobile-subtype"))).a());
                if (hVar3.d() != null) {
                    aVar.b(hVar3.d());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f5060b;
        if (url == null) {
            return null;
        }
        w2.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f5060b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public h a(h hVar) {
        NetworkInfo activeNetworkInfo = this.f5050b.getActiveNetworkInfo();
        return hVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f5051c).getSimOperator()).c("application_build", Integer.toString(h(this.f5051c))).d();
    }

    public u2.g b(f fVar) {
        j i10 = i(fVar);
        URL url = this.f5052d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a d10 = a.d(fVar.c());
                if (d10.e() != null) {
                    str = d10.e();
                }
                if (d10.f() != null) {
                    url = n(d10.f());
                }
            } catch (IllegalArgumentException unused) {
                return u2.g.a();
            }
        }
        try {
            b bVar = (b) x2.b.a(5, new a(url, i10, str), new b(this), new c());
            int i11 = bVar.f5059a;
            if (i11 == 200) {
                return u2.g.d(bVar.f5061c);
            }
            if (i11 < 500) {
                if (i11 != 404) {
                    return u2.g.a();
                }
            }
            return u2.g.e();
        } catch (IOException e10) {
            w2.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return u2.g.e();
        }
    }

    d(Context context, c3.a aVar, c3.a aVar2, int i10) {
        this.f5049a = j.b();
        this.f5051c = context;
        this.f5050b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5052d = n(a.f5040c);
        this.f5053e = aVar2;
        this.f5054f = aVar;
        this.f5055g = i10;
    }
}
