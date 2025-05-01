package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.user.internal.operations.d;
import com.onesignal.user.internal.operations.k;
import db.l;
import java.util.LinkedHashMap;
import java.util.Map;
import w9.f;

public final class e {
    public static final e INSTANCE = new e();

    private e() {
    }

    public final f createPropertiesFromOperation(d dVar, f fVar) {
        l.e(dVar, "operation");
        l.e(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        Map n10 = tags != null ? f0.n(tags) : null;
        if (n10 == null) {
            n10 = new LinkedHashMap();
        }
        Map map = n10;
        map.put(dVar.getKey(), (Object) null);
        return new f(map, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Double} */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w9.f createPropertiesFromOperation(com.onesignal.user.internal.operations.j r20, w9.f r21) {
        /*
            r19 = this;
            java.lang.String r0 = "operation"
            r1 = r20
            db.l.e(r1, r0)
            java.lang.String r0 = "propertiesObject"
            r2 = r21
            db.l.e(r2, r0)
            java.lang.String r0 = r20.getProperty()
            java.lang.String r3 = "language"
            boolean r3 = db.l.a(r0, r3)
            r4 = 0
            if (r3 == 0) goto L_0x0042
            w9.f r0 = new w9.f
            java.util.Map r6 = r21.getTags()
            java.lang.Object r1 = r20.getValue()
            if (r1 == 0) goto L_0x002b
            java.lang.String r4 = r1.toString()
        L_0x002b:
            r7 = r4
            java.lang.String r8 = r21.getTimezoneId()
            java.lang.String r9 = r21.getCountry()
            java.lang.Double r10 = r21.getLatitude()
            java.lang.Double r11 = r21.getLongitude()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x012e
        L_0x0042:
            java.lang.String r3 = "timezone"
            boolean r3 = db.l.a(r0, r3)
            if (r3 == 0) goto L_0x0071
            w9.f r0 = new w9.f
            java.util.Map r6 = r21.getTags()
            java.lang.String r7 = r21.getLanguage()
            java.lang.Object r1 = r20.getValue()
            if (r1 == 0) goto L_0x005e
            java.lang.String r4 = r1.toString()
        L_0x005e:
            r8 = r4
            java.lang.String r9 = r21.getCountry()
            java.lang.Double r10 = r21.getLatitude()
            java.lang.Double r11 = r21.getLongitude()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x012e
        L_0x0071:
            java.lang.String r3 = "country"
            boolean r3 = db.l.a(r0, r3)
            if (r3 == 0) goto L_0x00a0
            w9.f r0 = new w9.f
            java.util.Map r6 = r21.getTags()
            java.lang.String r7 = r21.getLanguage()
            java.lang.String r8 = r21.getTimezoneId()
            java.lang.Object r1 = r20.getValue()
            if (r1 == 0) goto L_0x0091
            java.lang.String r4 = r1.toString()
        L_0x0091:
            r9 = r4
            java.lang.Double r10 = r21.getLatitude()
            java.lang.Double r11 = r21.getLongitude()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x012e
        L_0x00a0:
            java.lang.String r3 = "locationLatitude"
            boolean r3 = db.l.a(r0, r3)
            if (r3 == 0) goto L_0x00d8
            w9.f r0 = new w9.f
            java.util.Map r6 = r21.getTags()
            java.lang.String r7 = r21.getLanguage()
            java.lang.String r8 = r21.getTimezoneId()
            java.lang.String r9 = r21.getCountry()
            java.lang.Object r1 = r20.getValue()
            if (r1 == 0) goto L_0x00ce
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x00ce
            double r3 = java.lang.Double.parseDouble(r1)
            java.lang.Double r4 = java.lang.Double.valueOf(r3)
        L_0x00ce:
            r10 = r4
            java.lang.Double r11 = r21.getLongitude()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x012e
        L_0x00d8:
            java.lang.String r3 = "locationLongitude"
            boolean r0 = db.l.a(r0, r3)
            if (r0 == 0) goto L_0x0110
            w9.f r0 = new w9.f
            java.util.Map r6 = r21.getTags()
            java.lang.String r7 = r21.getLanguage()
            java.lang.String r8 = r21.getTimezoneId()
            java.lang.String r9 = r21.getCountry()
            java.lang.Double r10 = r21.getLatitude()
            java.lang.Object r1 = r20.getValue()
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x010a
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
        L_0x010a:
            r11 = r4
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x012e
        L_0x0110:
            w9.f r0 = new w9.f
            java.util.Map r13 = r21.getTags()
            java.lang.String r14 = r21.getLanguage()
            java.lang.String r15 = r21.getTimezoneId()
            java.lang.String r16 = r21.getCountry()
            java.lang.Double r17 = r21.getLatitude()
            java.lang.Double r18 = r21.getLongitude()
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x012e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.e.createPropertiesFromOperation(com.onesignal.user.internal.operations.j, w9.f):w9.f");
    }

    public final f createPropertiesFromOperation(k kVar, f fVar) {
        l.e(kVar, "operation");
        l.e(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        Map n10 = tags != null ? f0.n(tags) : null;
        if (n10 == null) {
            n10 = new LinkedHashMap();
        }
        Map map = n10;
        map.put(kVar.getKey(), kVar.getValue());
        return new f(map, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }
}
