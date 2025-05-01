package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.k;
import java.net.URL;
import java.util.Map;

final class k6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f6144e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6145f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l6 f6146g;

    /* renamed from: h  reason: collision with root package name */
    private final k f6147h;

    public k6(l6 l6Var, String str, URL url, byte[] bArr, Map map, k kVar, byte[] bArr2) {
        this.f6146g = l6Var;
        s.g(str);
        s.k(url);
        s.k(kVar);
        this.f6144e = url;
        this.f6147h = kVar;
        this.f6145f = str;
    }

    private final void b(int i10, Exception exc, byte[] bArr, Map map) {
        this.f6146g.f5994a.b().z(new j6(this, i10, exc, bArr, map));
    }

    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        k kVar = this.f6147h;
        kVar.f10956a.h(this.f6145f, i10, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.l6 r0 = r9.f6146g
            r0.g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.l6 r2 = r9.f6146g     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            java.net.URL r3 = r9.f6144e     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            java.net.HttpURLConnection r2 = r2.o(r3)     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            java.util.Map r4 = r2.getHeaderFields()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x003e }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x003c }
        L_0x0024:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x003c }
            if (r8 <= 0) goto L_0x002e
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x002e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x003c }
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
            r2.disconnect()
            r9.b(r3, r1, r0, r4)
            return
        L_0x003c:
            r0 = move-exception
            goto L_0x0040
        L_0x003e:
            r0 = move-exception
            r6 = r1
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0045:
            throw r0     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            goto L_0x005f
        L_0x0048:
            r0 = move-exception
            goto L_0x006d
        L_0x004a:
            r0 = move-exception
            r4 = r1
            goto L_0x005f
        L_0x004d:
            r0 = move-exception
            r4 = r1
            goto L_0x006d
        L_0x0050:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x005f
        L_0x0055:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x006d
        L_0x005a:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.disconnect()
        L_0x0064:
            r9.b(r3, r1, r1, r4)
            throw r0
        L_0x0068:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.disconnect()
        L_0x0072:
            r9.b(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k6.run():void");
    }
}
