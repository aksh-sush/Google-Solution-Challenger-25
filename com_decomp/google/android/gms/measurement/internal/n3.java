package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.net.URL;
import java.util.Map;

final class n3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f6227e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f6228f;

    /* renamed from: g  reason: collision with root package name */
    private final l3 f6229g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6230h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f6231i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ o3 f6232j;

    public n3(o3 o3Var, String str, URL url, byte[] bArr, Map map, l3 l3Var) {
        this.f6232j = o3Var;
        s.g(str);
        s.k(url);
        s.k(l3Var);
        this.f6227e = url;
        this.f6228f = bArr;
        this.f6229g = l3Var;
        this.f6230h = str;
        this.f6231i = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf A[SYNTHETIC, Splitter:B:41:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ed A[SYNTHETIC, Splitter:B:61:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012d A[SYNTHETIC, Splitter:B:74:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.o3 r1 = r13.f6232j
            r1.g()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.o3 r3 = r13.f6232j     // Catch:{ IOException -> 0x0125, all -> 0x00e6 }
            java.net.URL r4 = r13.f6227e     // Catch:{ IOException -> 0x0125, all -> 0x00e6 }
            java.net.HttpURLConnection r3 = r3.m(r4)     // Catch:{ IOException -> 0x0125, all -> 0x00e6 }
            java.util.Map r4 = r13.f6231i     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r13.f6228f     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.o3 r4 = r13.f6232j     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.w8 r4 = r4.f6214b     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.y8 r4 = r4.f0()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            byte[] r5 = r13.f6228f     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            byte[] r4 = r4.Q(r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.o3 r5 = r13.f6232j     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.v()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r5.b(r7, r8)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r3.connect()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007d }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007d }
            goto L_0x0088
        L_0x007d:
            r4 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x00ea
        L_0x0082:
            r4 = move-exception
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x012a
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e3, all -> 0x00e0 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00dc, all -> 0x00d9 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00cb }
            r4.<init>()     // Catch:{ all -> 0x00cb }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00cb }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c9 }
        L_0x009d:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00c9 }
            if (r7 <= 0) goto L_0x00a7
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00c9 }
            goto L_0x009d
        L_0x00a7:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00c9 }
            r5.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            r3.disconnect()
            com.google.android.gms.measurement.internal.o3 r0 = r13.f6232j
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a
            com.google.android.gms.measurement.internal.l4 r0 = r0.b()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r6 = r13.f6230h
            com.google.android.gms.measurement.internal.l3 r7 = r13.f6229g
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00c5:
            r0.z(r1)
            return
        L_0x00c9:
            r1 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r1 = move-exception
            r5 = r2
        L_0x00cd:
            if (r5 == 0) goto L_0x00d2
            r5.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
        L_0x00d2:
            throw r1     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            r4 = r1
            goto L_0x00eb
        L_0x00d6:
            r1 = move-exception
            r4 = r1
            goto L_0x00de
        L_0x00d9:
            r4 = move-exception
            r11 = r2
            goto L_0x00eb
        L_0x00dc:
            r4 = move-exception
            r11 = r2
        L_0x00de:
            r9 = r4
            goto L_0x012b
        L_0x00e0:
            r4 = move-exception
            r11 = r2
            goto L_0x00ea
        L_0x00e3:
            r4 = move-exception
            r11 = r2
            goto L_0x0129
        L_0x00e6:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x00ea:
            r8 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x0107
            r2.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0107
        L_0x00f1:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f6232j
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r5 = r13.f6230h
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r5)
            r2.c(r0, r5, r1)
        L_0x0107:
            if (r3 == 0) goto L_0x010c
            r3.disconnect()
        L_0x010c:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f6232j
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a
            com.google.android.gms.measurement.internal.l4 r0 = r0.b()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r6 = r13.f6230h
            com.google.android.gms.measurement.internal.l3 r7 = r13.f6229g
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.z(r1)
            throw r4
        L_0x0125:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r11 = r3
        L_0x0129:
            r9 = r4
        L_0x012a:
            r8 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x0147
            r2.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x0147
        L_0x0131:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f6232j
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r4 = r13.f6230h
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r4)
            r2.c(r0, r4, r1)
        L_0x0147:
            if (r3 == 0) goto L_0x014c
            r3.disconnect()
        L_0x014c:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f6232j
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a
            com.google.android.gms.measurement.internal.l4 r0 = r0.b()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r6 = r13.f6230h
            com.google.android.gms.measurement.internal.l3 r7 = r13.f6229g
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.n3.run():void");
    }
}
