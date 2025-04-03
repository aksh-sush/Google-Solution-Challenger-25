package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;

public final class zzbb {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        r1 = r22.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f9, code lost:
        r2 = r22.zzc();
        r4 = new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0207, code lost:
        if (r24.size() <= 1) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0209, code lost:
        r5 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.zzh.zza(r3.zzb(r0.get(1)).zzh().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0225, code lost:
        if (r5 <= 0) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0227, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022e, code lost:
        if (r6 >= java.lang.Math.min(r2, r1 + r5)) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0230, code lost:
        r4.zzq(r4.zzc(), r9.zze(r1));
        r9.zzp(r1);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0246, code lost:
        if (r24.size() <= 2) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0248, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024d, code lost:
        if (r2 >= r24.size()) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024f, code lost:
        r5 = r3.zzb(r0.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025b, code lost:
        if ((r5 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025d, code lost:
        r9.zzo((r1 + r2) - 2, r5);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026e, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026f, code lost:
        if (r1 >= r2) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0271, code lost:
        r4.zzq(r4.zzc(), r9.zze(r1));
        r9.zzq(r1, (com.google.android.gms.internal.measurement.zzap) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0285, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzj("sort", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0294, code lost:
        if (r22.zzc() >= 2) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0297, code lost:
        r1 = r22.zzm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        if (r24.isEmpty() != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a1, code lost:
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ae, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzai) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b0, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzai) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ba, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bb, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bc, code lost:
        java.util.Collections.sort(r1, new com.google.android.gms.internal.measurement.zzba(r0, r3));
        r22.zzn();
        r0 = r1.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d0, code lost:
        if (r0.hasNext() == false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d2, code lost:
        r9.zzq(r2, r0.next());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02df, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e0, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzh("some", 1, r0);
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzai) == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fd, code lost:
        if (r22.zzc() != 0) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0302, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzai) r0;
        r1 = r22.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030c, code lost:
        if (r1.hasNext() == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030e, code lost:
        r2 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031c, code lost:
        if (r9.zzs(r2) == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0348, code lost:
        if (r0.zza(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzap[]{r9.zze(r2), new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r2)), r9})).zzg().booleanValue() == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0354, code lost:
        throw new java.lang.IllegalArgumentException(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0355, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzj("slice", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0363, code lost:
        if (r24.isEmpty() == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036a, code lost:
        r4 = (double) r22.zzc();
        r6 = com.google.android.gms.internal.measurement.zzh.zza(r3.zzb(r0.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0388, code lost:
        if (r6 >= 0.0d) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038a, code lost:
        r6 = java.lang.Math.max(r6 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0390, code lost:
        r6 = java.lang.Math.min(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0399, code lost:
        if (r24.size() != 2) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039b, code lost:
        r10 = com.google.android.gms.internal.measurement.zzh.zza(r3.zzb(r0.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b4, code lost:
        if (r10 >= 0.0d) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b6, code lost:
        r4 = java.lang.Math.max(r4 + r10, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03bc, code lost:
        r4 = java.lang.Math.min(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c0, code lost:
        r0 = new com.google.android.gms.internal.measurement.zzae();
        r1 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c9, code lost:
        if (((double) r1) >= r4) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03cb, code lost:
        r0.zzq(r0.zzc(), r9.zze(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03da, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.zzh.zzh("shift", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e6, code lost:
        if (r22.zzc() != 0) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03eb, code lost:
        r0 = r9.zze(0);
        r9.zzp(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03f3, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.zzh.zzh("reverse", 0, r24);
        r0 = r22.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03ff, code lost:
        if (r0 == 0) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0401, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0404, code lost:
        if (r2 >= (r0 / 2)) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040a, code lost:
        if (r9.zzs(r2) == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040c, code lost:
        r1 = r9.zze(r2);
        r9.zzq(r2, (com.google.android.gms.internal.measurement.zzap) null);
        r3 = (r0 - 1) - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x041b, code lost:
        if (r9.zzs(r3) == false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x041d, code lost:
        r9.zzq(r2, r9.zze(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0424, code lost:
        r9.zzq(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0427, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042a, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0436, code lost:
        return zzc(r22, r23, r24, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0442, code lost:
        return zzc(r22, r23, r24, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0443, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044d, code lost:
        if (r24.isEmpty() != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044f, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0457, code lost:
        if (r0.hasNext() == false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0459, code lost:
        r9.zzq(r22.zzc(), r3.zzb(r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0479, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r22.zzc()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x047a, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.zzh.zzh("pop", 0, r24);
        r0 = r22.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0486, code lost:
        if (r0 != 0) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x048b, code lost:
        r0 = r0 - 1;
        r1 = r9.zze(r0);
        r9.zzp(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0496, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzh("map", 1, r0);
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04af, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b5, code lost:
        if (r22.zzc() != 0) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ca, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04cb, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzj("lastIndexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04db, code lost:
        if (r24.isEmpty() != false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04dd, code lost:
        r4 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04e8, code lost:
        r5 = (double) (r22.zzc() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f4, code lost:
        if (r24.size() <= 1) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f6, code lost:
        r0 = r3.zzb(r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x050c, code lost:
        if (java.lang.Double.isNaN(r0.zzh().doubleValue()) == false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x050e, code lost:
        r5 = (double) (r22.zzc() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0516, code lost:
        r5 = com.google.android.gms.internal.measurement.zzh.zza(r0.zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0524, code lost:
        if (r5 >= 0.0d) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0526, code lost:
        r5 = r5 + ((double) r22.zzc());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x052e, code lost:
        if (r5 >= 0.0d) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x053a, code lost:
        r0 = (int) java.lang.Math.min((double) r22.zzc(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0544, code lost:
        if (r0 < 0) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054a, code lost:
        if (r9.zzs(r0) == false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0554, code lost:
        if (com.google.android.gms.internal.measurement.zzh.zzl(r9.zze(r0), r4) == false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0562, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x056f, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzj("join", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x057d, code lost:
        if (r22.zzc() != 0) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0586, code lost:
        if (r24.size() <= 0) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0588, code lost:
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0595, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzan) != false) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0599, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzau) == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x059c, code lost:
        r0 = r0.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a1, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a4, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05b1, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzj("indexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05c1, code lost:
        if (r24.isEmpty() != false) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05c3, code lost:
        r4 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05d3, code lost:
        if (r24.size() <= 1) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05d5, code lost:
        r5 = com.google.android.gms.internal.measurement.zzh.zza(r3.zzb(r0.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f2, code lost:
        if (r5 < ((double) r22.zzc())) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0600, code lost:
        if (r5 >= 0.0d) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0602, code lost:
        r1 = ((double) r22.zzc()) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x060a, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x060b, code lost:
        r0 = r22.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0613, code lost:
        if (r0.hasNext() == false) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0615, code lost:
        r3 = r0.next().intValue();
        r5 = (double) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0622, code lost:
        if (r5 < r1) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x062c, code lost:
        if (com.google.android.gms.internal.measurement.zzh.zzl(r9.zze(r3), r4) == false) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0642, code lost:
        r1 = r21;
        r9 = r22;
        r0 = r24;
        r3 = r23;
        com.google.android.gms.internal.measurement.zzh.zzh("forEach", 1, r0);
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x065c, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0662, code lost:
        if (r22.zzb() != 0) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0665, code lost:
        zzb(r9, r3, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x066d, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0673, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0674, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzh(r20, 1, r0);
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x068f, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x06d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0695, code lost:
        if (r22.zzb() != 0) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x069d, code lost:
        r1 = r22.zzd();
        r0 = zzb(r9, r3, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new com.google.android.gms.internal.measurement.zzae();
        r0 = r0.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06b7, code lost:
        if (r0.hasNext() == false) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06b9, code lost:
        r2.zzq(r2.zzc(), ((com.google.android.gms.internal.measurement.zzae) r1).zze(r0.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06d9, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06da, code lost:
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzh.zzh("every", 1, r0);
        r0 = r3.zzb(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06f3, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06f9, code lost:
        if (r22.zzc() != 0) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0710, code lost:
        if (zzb(r2, r3, (com.google.android.gms.internal.measurement.zzao) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).zzc() == r22.zzc()) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x071a, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x071b, code lost:
        r2 = r22;
        r3 = r23;
        r0 = r24;
        r1 = r22.zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0729, code lost:
        if (r24.isEmpty() != false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x072b, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0733, code lost:
        if (r0.hasNext() == false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0735, code lost:
        r2 = r3.zzb(r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0741, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0743, code lost:
        r4 = (com.google.android.gms.internal.measurement.zzae) r1;
        r5 = r4.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x074c, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzae) == false) goto L_0x0771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x074e, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzae) r2;
        r6 = r2.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0758, code lost:
        if (r6.hasNext() == false) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x075a, code lost:
        r7 = r6.next();
        r4.zzq(r7.intValue() + r5, r2.zze(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0771, code lost:
        r4.zzq(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x077c, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x077d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return r22.zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return zzb(r9, r3, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return new com.google.android.gms.internal.measurement.zzat(r9.zzj(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fb, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fc, code lost:
        r20 = "filter";
        r21 = "Callback should be a method";
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        switch(r0) {
            case 0: goto L_0x071b;
            case 1: goto L_0x06da;
            case 2: goto L_0x0674;
            case 3: goto L_0x0642;
            case 4: goto L_0x05b1;
            case 5: goto L_0x056f;
            case 6: goto L_0x04cb;
            case 7: goto L_0x0496;
            case 8: goto L_0x047a;
            case 9: goto L_0x0443;
            case 10: goto L_0x0437;
            case 11: goto L_0x042b;
            case 12: goto L_0x03f3;
            case 13: goto L_0x03da;
            case 14: goto L_0x0355;
            case 15: goto L_0x02e0;
            case 16: goto L_0x0285;
            case 17: goto L_0x01b8;
            case 18: goto L_0x01a3;
            case 19: goto L_0x0111;
            default: goto L_0x0109;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0110, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0115, code lost:
        if (r24.isEmpty() != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        r0 = new com.google.android.gms.internal.measurement.zzae();
        r1 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r1.hasNext() == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        r2 = r23.zzb(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
        r0.zzq(r0.zzc(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0145, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0146, code lost:
        r1 = r0.zzc();
        r2 = r22.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0152, code lost:
        if (r2.hasNext() == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0154, code lost:
        r3 = r2.next();
        r0.zzq(r3.intValue() + r1, r22.zze(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016d, code lost:
        r9 = r22;
        r22.zzn();
        r1 = r0.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017a, code lost:
        if (r1.hasNext() == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        r2 = r1.next();
        r9.zzq(r2.intValue(), r0.zze(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0192, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a2, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r22.zzc()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a3, code lost:
        com.google.android.gms.internal.measurement.zzh.zzh(r4, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b7, code lost:
        return new com.google.android.gms.internal.measurement.zzat(r22.zzj(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b8, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c3, code lost:
        if (r24.isEmpty() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cc, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.zzh.zza(r3.zzb(r0.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e3, code lost:
        if (r1 >= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e5, code lost:
        r1 = java.lang.Math.max(0, r1 + r22.zzc());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f3, code lost:
        if (r1 <= r22.zzc()) goto L_0x01f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzap zza(java.lang.String r21, com.google.android.gms.internal.measurement.zzae r22, com.google.android.gms.internal.measurement.zzg r23, java.util.List<com.google.android.gms.internal.measurement.zzap> r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            int r4 = r21.hashCode()
            java.lang.String r5 = "indexOf"
            java.lang.String r6 = "reverse"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "shift"
            java.lang.String r9 = "every"
            java.lang.String r10 = "sort"
            java.lang.String r11 = "some"
            java.lang.String r12 = "join"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "map"
            java.lang.String r15 = "lastIndexOf"
            java.lang.String r3 = "forEach"
            java.lang.String r1 = "filter"
            java.lang.String r2 = "toString"
            r16 = -1
            r17 = r2
            switch(r4) {
                case -1776922004: goto L_0x00f0;
                case -1354795244: goto L_0x00e4;
                case -1274492040: goto L_0x00da;
                case -934873754: goto L_0x00cd;
                case -895859076: goto L_0x00c2;
                case -678635926: goto L_0x00ba;
                case -467511597: goto L_0x00b2;
                case -277637751: goto L_0x00a7;
                case 107868: goto L_0x009f;
                case 111185: goto L_0x0096;
                case 3267882: goto L_0x008e;
                case 3452698: goto L_0x0083;
                case 3536116: goto L_0x007a;
                case 3536286: goto L_0x0071;
                case 96891675: goto L_0x0066;
                case 109407362: goto L_0x005c;
                case 109526418: goto L_0x0052;
                case 965561430: goto L_0x0046;
                case 1099846370: goto L_0x003c;
                case 1943291465: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r4 = r17
            goto L_0x00fb
        L_0x0033:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x00d7
        L_0x003c:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x002f
            r0 = 12
            goto L_0x00d7
        L_0x0046:
            java.lang.String r4 = "reduceRight"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 11
            goto L_0x00d7
        L_0x0052:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x002f
            r0 = 14
            goto L_0x00d7
        L_0x005c:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x002f
            r0 = 13
            goto L_0x00d7
        L_0x0066:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 1
            goto L_0x00fc
        L_0x0071:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x002f
            r0 = 16
            goto L_0x00d7
        L_0x007a:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x002f
            r0 = 15
            goto L_0x00d7
        L_0x0083:
            java.lang.String r4 = "push"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 9
            goto L_0x00d7
        L_0x008e:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x002f
            r0 = 5
            goto L_0x00d7
        L_0x0096:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x002f
            r0 = 8
            goto L_0x00d7
        L_0x009f:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x002f
            r0 = 7
            goto L_0x00d7
        L_0x00a7:
            java.lang.String r4 = "unshift"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 19
            goto L_0x00d7
        L_0x00b2:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x002f
            r0 = 6
            goto L_0x00d7
        L_0x00ba:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002f
            r0 = 3
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r4 = "splice"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            goto L_0x00d7
        L_0x00cd:
            java.lang.String r4 = "reduce"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 10
        L_0x00d7:
            r4 = r17
            goto L_0x00fc
        L_0x00da:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 2
            goto L_0x00fc
        L_0x00e4:
            java.lang.String r4 = "concat"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 0
            goto L_0x00fc
        L_0x00f0:
            r4 = r17
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00fb
            r0 = 18
            goto L_0x00fc
        L_0x00fb:
            r0 = -1
        L_0x00fc:
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r2 = "Callback should be a method"
            r20 = r1
            r21 = r2
            r1 = 0
            switch(r0) {
                case 0: goto L_0x071b;
                case 1: goto L_0x06da;
                case 2: goto L_0x0674;
                case 3: goto L_0x0642;
                case 4: goto L_0x05b1;
                case 5: goto L_0x056f;
                case 6: goto L_0x04cb;
                case 7: goto L_0x0496;
                case 8: goto L_0x047a;
                case 9: goto L_0x0443;
                case 10: goto L_0x0437;
                case 11: goto L_0x042b;
                case 12: goto L_0x03f3;
                case 13: goto L_0x03da;
                case 14: goto L_0x0355;
                case 15: goto L_0x02e0;
                case 16: goto L_0x0285;
                case 17: goto L_0x01b8;
                case 18: goto L_0x01a3;
                case 19: goto L_0x0111;
                default: goto L_0x0109;
            }
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0111:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0192
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L_0x0120:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0146
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            r3 = r23
            com.google.android.gms.internal.measurement.zzap r2 = r3.zzb(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r4 != 0) goto L_0x013e
            int r4 = r0.zzc()
            r0.zzq(r4, r2)
            goto L_0x0120
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0146:
            int r1 = r0.zzc()
            java.util.Iterator r2 = r22.zzk()
        L_0x014e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016d
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r22
            com.google.android.gms.internal.measurement.zzap r3 = r9.zze(r3)
            r0.zzq(r4, r3)
            goto L_0x014e
        L_0x016d:
            r9 = r22
            r22.zzn()
            java.util.Iterator r1 = r0.zzk()
        L_0x0176:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0194
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.zzap r2 = r0.zze(r2)
            r9.zzq(r3, r2)
            goto L_0x0176
        L_0x0192:
            r9 = r22
        L_0x0194:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r22.zzc()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x01a3:
            r9 = r22
            r0 = r24
            r1 = r4
            r2 = 0
            com.google.android.gms.internal.measurement.zzh.zzh(r1, r2, r0)
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = ","
            java.lang.String r1 = r9.zzj(r1)
            r0.<init>(r1)
            return r0
        L_0x01b8:
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            boolean r1 = r24.isEmpty()
            if (r1 == 0) goto L_0x01cc
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x0284
        L_0x01cc:
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.zzh.zza(r4)
            int r1 = (int) r4
            if (r1 >= 0) goto L_0x01ef
            int r4 = r22.zzc()
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x01f9
        L_0x01ef:
            int r2 = r22.zzc()
            if (r1 <= r2) goto L_0x01f9
            int r1 = r22.zzc()
        L_0x01f9:
            int r2 = r22.zzc()
            com.google.android.gms.internal.measurement.zzae r4 = new com.google.android.gms.internal.measurement.zzae
            r4.<init>()
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x026f
            java.lang.Object r5 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r3.zzb(r5)
            java.lang.Double r5 = r5.zzh()
            double r5 = r5.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zza(r5)
            int r5 = (int) r5
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            if (r5 <= 0) goto L_0x0241
            r6 = r1
        L_0x0228:
            int r7 = r1 + r5
            int r7 = java.lang.Math.min(r2, r7)
            if (r6 >= r7) goto L_0x0241
            com.google.android.gms.internal.measurement.zzap r7 = r9.zze(r1)
            int r8 = r4.zzc()
            r4.zzq(r8, r7)
            r9.zzp(r1)
            int r6 = r6 + 1
            goto L_0x0228
        L_0x0241:
            int r2 = r24.size()
            r5 = 2
            if (r2 <= r5) goto L_0x0283
            r2 = 2
        L_0x0249:
            int r5 = r24.size()
            if (r2 >= r5) goto L_0x0283
            java.lang.Object r5 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r3.zzb(r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzag
            if (r6 != 0) goto L_0x0267
            int r6 = r1 + r2
            int r6 = r6 + -2
            r9.zzo(r6, r5)
            int r2 = r2 + 1
            goto L_0x0249
        L_0x0267:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x026f:
            if (r1 >= r2) goto L_0x0283
            com.google.android.gms.internal.measurement.zzap r0 = r9.zze(r1)
            int r3 = r4.zzc()
            r4.zzq(r3, r0)
            r0 = 0
            r9.zzq(r1, r0)
            int r1 = r1 + 1
            goto L_0x026f
        L_0x0283:
            r0 = r4
        L_0x0284:
            return r0
        L_0x0285:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzj(r10, r1, r0)
            int r1 = r22.zzc()
            r2 = 2
            if (r1 >= r2) goto L_0x0297
            goto L_0x02df
        L_0x0297:
            java.util.List r1 = r22.zzm()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x02bb
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzai
            if (r2 == 0) goto L_0x02b3
            com.google.android.gms.internal.measurement.zzai r0 = (com.google.android.gms.internal.measurement.zzai) r0
            goto L_0x02bc
        L_0x02b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x02bb:
            r0 = 0
        L_0x02bc:
            com.google.android.gms.internal.measurement.zzba r2 = new com.google.android.gms.internal.measurement.zzba
            r2.<init>(r0, r3)
            java.util.Collections.sort(r1, r2)
            r22.zzn()
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        L_0x02cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02df
            int r1 = r2 + 1
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            r9.zzq(r2, r3)
            r2 = r1
            goto L_0x02cc
        L_0x02df:
            return r9
        L_0x02e0:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r11, r1, r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzai
            if (r1 == 0) goto L_0x034d
            int r1 = r22.zzc()
            if (r1 != 0) goto L_0x0302
        L_0x02ff:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzl
            goto L_0x034c
        L_0x0302:
            com.google.android.gms.internal.measurement.zzai r0 = (com.google.android.gms.internal.measurement.zzai) r0
            java.util.Iterator r1 = r22.zzk()
        L_0x0308:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02ff
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r9.zzs(r2)
            if (r4 == 0) goto L_0x0308
            r4 = 3
            com.google.android.gms.internal.measurement.zzap[] r4 = new com.google.android.gms.internal.measurement.zzap[r4]
            com.google.android.gms.internal.measurement.zzap r5 = r9.zze(r2)
            r6 = 0
            r4[r6] = r5
            com.google.android.gms.internal.measurement.zzah r5 = new com.google.android.gms.internal.measurement.zzah
            double r6 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r5.<init>(r2)
            r2 = 1
            r4[r2] = r5
            r2 = 2
            r4[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.zzap r2 = r0.zza(r3, r2)
            java.lang.Boolean r2 = r2.zzg()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0308
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzk
        L_0x034c:
            return r0
        L_0x034d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r21
            r0.<init>(r1)
            throw r0
        L_0x0355:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r7, r4, r0)
            boolean r4 = r24.isEmpty()
            if (r4 == 0) goto L_0x036a
            com.google.android.gms.internal.measurement.zzap r0 = r22.zzd()
            goto L_0x03d9
        L_0x036a:
            int r4 = r22.zzc()
            double r4 = (double) r4
            r6 = 0
            java.lang.Object r6 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r6 = r3.zzb(r6)
            java.lang.Double r6 = r6.zzh()
            double r6 = r6.doubleValue()
            double r6 = com.google.android.gms.internal.measurement.zzh.zza(r6)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0390
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r1)
            goto L_0x0394
        L_0x0390:
            double r6 = java.lang.Math.min(r6, r4)
        L_0x0394:
            int r8 = r24.size()
            r10 = 2
            if (r8 != r10) goto L_0x03c0
            r8 = 1
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            java.lang.Double r0 = r0.zzh()
            double r10 = r0.doubleValue()
            double r10 = com.google.android.gms.internal.measurement.zzh.zza(r10)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03bc
            double r4 = r4 + r10
            double r4 = java.lang.Math.max(r4, r1)
            goto L_0x03c0
        L_0x03bc:
            double r4 = java.lang.Math.min(r4, r10)
        L_0x03c0:
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            int r1 = (int) r6
        L_0x03c6:
            double r2 = (double) r1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03d9
            com.google.android.gms.internal.measurement.zzap r2 = r9.zze(r1)
            int r3 = r0.zzc()
            r0.zzq(r3, r2)
            int r1 = r1 + 1
            goto L_0x03c6
        L_0x03d9:
            return r0
        L_0x03da:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.zzh.zzh(r8, r1, r0)
            int r0 = r22.zzc()
            if (r0 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x03f2
        L_0x03eb:
            com.google.android.gms.internal.measurement.zzap r0 = r9.zze(r1)
            r9.zzp(r1)
        L_0x03f2:
            return r0
        L_0x03f3:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.zzh.zzh(r6, r1, r0)
            int r0 = r22.zzc()
            if (r0 == 0) goto L_0x042a
            r2 = 0
        L_0x0402:
            int r1 = r0 / 2
            if (r2 >= r1) goto L_0x042a
            boolean r1 = r9.zzs(r2)
            if (r1 == 0) goto L_0x0427
            com.google.android.gms.internal.measurement.zzap r1 = r9.zze(r2)
            r3 = 0
            r9.zzq(r2, r3)
            int r3 = r0 + -1
            int r3 = r3 - r2
            boolean r4 = r9.zzs(r3)
            if (r4 == 0) goto L_0x0424
            com.google.android.gms.internal.measurement.zzap r4 = r9.zze(r3)
            r9.zzq(r2, r4)
        L_0x0424:
            r9.zzq(r3, r1)
        L_0x0427:
            int r2 = r2 + 1
            goto L_0x0402
        L_0x042a:
            return r9
        L_0x042b:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.zzap r0 = zzc(r9, r3, r0, r1)
            return r0
        L_0x0437:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.zzap r0 = zzc(r9, r3, r0, r1)
            return r0
        L_0x0443:
            r9 = r22
            r3 = r23
            r0 = r24
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x046b
            java.util.Iterator r0 = r24.iterator()
        L_0x0453:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x046b
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r3.zzb(r1)
            int r2 = r22.zzc()
            r9.zzq(r2, r1)
            goto L_0x0453
        L_0x046b:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r22.zzc()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x047a:
            r9 = r22
            r0 = r24
            r2 = 0
            com.google.android.gms.internal.measurement.zzh.zzh(r13, r2, r0)
            int r0 = r22.zzc()
            if (r0 != 0) goto L_0x048b
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x0495
        L_0x048b:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.zzap r1 = r9.zze(r0)
            r9.zzp(r0)
            r0 = r1
        L_0x0495:
            return r0
        L_0x0496:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r14, r4, r0)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r2 == 0) goto L_0x04c5
            int r1 = r22.zzc()
            if (r1 != 0) goto L_0x04bd
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x04c4
        L_0x04bd:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            r1 = 0
            com.google.android.gms.internal.measurement.zzae r0 = zzb(r9, r3, r0, r1, r1)
        L_0x04c4:
            return r0
        L_0x04c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04cb:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r15, r4, r0)
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x04e8
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r4)
        L_0x04e8:
            int r5 = r22.zzc()
            int r5 = r5 + -1
            double r5 = (double) r5
            int r7 = r24.size()
            r8 = 1
            if (r7 <= r8) goto L_0x052c
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            java.lang.Double r3 = r0.zzh()
            double r5 = r3.doubleValue()
            boolean r3 = java.lang.Double.isNaN(r5)
            if (r3 == 0) goto L_0x0516
            int r0 = r22.zzc()
            int r0 = r0 + -1
            double r5 = (double) r0
            goto L_0x0522
        L_0x0516:
            java.lang.Double r0 = r0.zzh()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zza(r5)
        L_0x0522:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x052c
            int r0 = r22.zzc()
            double r7 = (double) r0
            double r5 = r5 + r7
        L_0x052c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x053a
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x056e
        L_0x053a:
            int r0 = r22.zzc()
            double r0 = (double) r0
            double r0 = java.lang.Math.min(r0, r5)
            int r0 = (int) r0
        L_0x0544:
            if (r0 < 0) goto L_0x0565
            boolean r1 = r9.zzs(r0)
            if (r1 == 0) goto L_0x0562
            com.google.android.gms.internal.measurement.zzap r1 = r9.zze(r0)
            boolean r1 = com.google.android.gms.internal.measurement.zzh.zzl(r1, r4)
            if (r1 == 0) goto L_0x0562
            com.google.android.gms.internal.measurement.zzah r1 = new com.google.android.gms.internal.measurement.zzah
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            r0 = r1
            goto L_0x056e
        L_0x0562:
            int r0 = r0 + -1
            goto L_0x0544
        L_0x0565:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x056e:
            return r0
        L_0x056f:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzj(r12, r1, r0)
            int r1 = r22.zzc()
            if (r1 != 0) goto L_0x0582
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzm
            goto L_0x05b0
        L_0x0582:
            int r1 = r24.size()
            if (r1 <= 0) goto L_0x05a4
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzan
            if (r1 != 0) goto L_0x05a1
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzau
            if (r1 == 0) goto L_0x059c
            goto L_0x05a1
        L_0x059c:
            java.lang.String r0 = r0.zzi()
            goto L_0x05a6
        L_0x05a1:
            java.lang.String r0 = ""
            goto L_0x05a6
        L_0x05a4:
            java.lang.String r0 = ","
        L_0x05a6:
            com.google.android.gms.internal.measurement.zzat r1 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r0 = r9.zzj(r0)
            r1.<init>(r0)
            r0 = r1
        L_0x05b0:
            return r0
        L_0x05b1:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r5, r4, r0)
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x05ce
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r4 = r3.zzb(r4)
        L_0x05ce:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x060b
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            java.lang.Double r0 = r0.zzh()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zza(r5)
            int r0 = r22.zzc()
            double r7 = (double) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x05fe
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x0641
        L_0x05fe:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x060a
            int r0 = r22.zzc()
            double r0 = (double) r0
            double r1 = r0 + r5
            goto L_0x060b
        L_0x060a:
            r1 = r5
        L_0x060b:
            java.util.Iterator r0 = r22.zzk()
        L_0x060f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0638
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            double r5 = (double) r3
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x060f
            com.google.android.gms.internal.measurement.zzap r3 = r9.zze(r3)
            boolean r3 = com.google.android.gms.internal.measurement.zzh.zzl(r3, r4)
            if (r3 == 0) goto L_0x060f
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x0641
        L_0x0638:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x0641:
            return r0
        L_0x0642:
            r1 = r21
            r9 = r22
            r0 = r24
            r2 = r3
            r4 = 1
            r3 = r23
            com.google.android.gms.internal.measurement.zzh.zzh(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r2 == 0) goto L_0x066e
            int r1 = r22.zzb()
            if (r1 != 0) goto L_0x0665
            goto L_0x066b
        L_0x0665:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            r1 = 0
            zzb(r9, r3, r0, r1, r1)
        L_0x066b:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            return r0
        L_0x066e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0674:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = r20
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r2 == 0) goto L_0x06d4
            int r1 = r22.zzb()
            if (r1 != 0) goto L_0x069d
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x06d3
        L_0x069d:
            com.google.android.gms.internal.measurement.zzap r1 = r22.zzd()
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            com.google.android.gms.internal.measurement.zzae r0 = zzb(r9, r3, r0, r4, r2)
            com.google.android.gms.internal.measurement.zzae r2 = new com.google.android.gms.internal.measurement.zzae
            r2.<init>()
            java.util.Iterator r0 = r0.zzk()
        L_0x06b3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06d2
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            com.google.android.gms.internal.measurement.zzae r4 = (com.google.android.gms.internal.measurement.zzae) r4
            com.google.android.gms.internal.measurement.zzap r3 = r4.zze(r3)
            int r4 = r2.zzc()
            r2.zzq(r4, r3)
            goto L_0x06b3
        L_0x06d2:
            r0 = r2
        L_0x06d3:
            return r0
        L_0x06d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x06da:
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r24
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r9, r4, r0)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r4 == 0) goto L_0x0715
            int r1 = r22.zzc()
            if (r1 != 0) goto L_0x06fe
        L_0x06fb:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L_0x0714
        L_0x06fe:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.zzae r0 = zzb(r2, r3, r0, r1, r4)
            int r0 = r0.zzc()
            int r1 = r22.zzc()
            if (r0 == r1) goto L_0x06fb
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzl
        L_0x0714:
            return r0
        L_0x0715:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x071b:
            r2 = r22
            r3 = r23
            r0 = r24
            com.google.android.gms.internal.measurement.zzap r1 = r22.zzd()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x077d
            java.util.Iterator r0 = r24.iterator()
        L_0x072f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x077d
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r3.zzb(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r4 != 0) goto L_0x0775
            r4 = r1
            com.google.android.gms.internal.measurement.zzae r4 = (com.google.android.gms.internal.measurement.zzae) r4
            int r5 = r4.zzc()
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.zzae
            if (r6 == 0) goto L_0x0771
            com.google.android.gms.internal.measurement.zzae r2 = (com.google.android.gms.internal.measurement.zzae) r2
            java.util.Iterator r6 = r2.zzk()
        L_0x0754:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x072f
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            com.google.android.gms.internal.measurement.zzap r7 = r2.zze(r7)
            int r8 = r8 + r5
            r4.zzq(r8, r7)
            goto L_0x0754
        L_0x0771:
            r4.zzq(r5, r2)
            goto L_0x072f
        L_0x0775:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x077d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbb.zza(java.lang.String, com.google.android.gms.internal.measurement.zzae, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    private static zzae zzb(zzae zzae, zzg zzg, zzai zzai, Boolean bool, Boolean bool2) {
        zzae zzae2 = new zzae();
        Iterator<Integer> zzk = zzae.zzk();
        while (zzk.hasNext()) {
            int intValue = zzk.next().intValue();
            if (zzae.zzs(intValue)) {
                zzap zza = zzai.zza(zzg, Arrays.asList(new zzap[]{zzae.zze(intValue), new zzah(Double.valueOf((double) intValue)), zzae}));
                if (zza.zzg().equals(bool)) {
                    return zzae2;
                }
                if (bool2 == null || zza.zzg().equals(bool2)) {
                    zzae2.zzq(intValue, zza);
                }
            }
        }
        return zzae2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzae r9, com.google.android.gms.internal.measurement.zzg r10, java.util.List<com.google.android.gms.internal.measurement.zzap> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzi(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.zzh.zzj(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r3 = r10.zzb(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzai
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            com.google.android.gms.internal.measurement.zzap r11 = r10.zzb(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.zzag
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.zzc()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.zzai r3 = (com.google.android.gms.internal.measurement.zzai) r3
            int r4 = r9.zzc()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzap r11 = r9.zze(r5)
            goto L_0x0095
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0097
            boolean r12 = r9.zzs(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 4
            com.google.android.gms.internal.measurement.zzap[] r12 = new com.google.android.gms.internal.measurement.zzap[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.zzap r11 = r9.zze(r5)
            r12[r1] = r11
            com.google.android.gms.internal.measurement.zzah r11 = new com.google.android.gms.internal.measurement.zzah
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.zzap r11 = r3.zza(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.zzag
            if (r12 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbb.zzc(com.google.android.gms.internal.measurement.zzae, com.google.android.gms.internal.measurement.zzg, java.util.List, boolean):com.google.android.gms.internal.measurement.zzap");
    }
}
