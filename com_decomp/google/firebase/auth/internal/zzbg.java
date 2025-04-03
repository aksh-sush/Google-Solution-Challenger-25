package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzll;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.onesignal.inAppMessages.internal.display.impl.i;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u3.a;

public final class zzbg {
    private final Context zza;
    private final String zzb;
    private final SharedPreferences zzc;
    private final a zzd = new a("StorageHelpers", new String[0]);

    public zzbg(Context context, String str) {
        s.k(context);
        String g10 = s.g(str);
        this.zzb = g10;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzc = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{g10}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1 A[SYNTHETIC, Splitter:B:33:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138 A[ExcHandler: zzll | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.auth.internal.zzx zzf(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x008d
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzt> r16 = com.google.firebase.auth.internal.zzt.CREATOR     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "userId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "providerId"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "email"
            java.lang.String r20 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r22 = r4.optString(r14)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "photoUrl"
            java.lang.String r23 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "isEmailVerified"
            boolean r24 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r25 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            com.google.firebase.auth.internal.zzt r4 = new com.google.firebase.auth.internal.zzt     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r11.add(r4)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007f:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            com.google.android.gms.internal.firebase-auth-api.zzll r1 = new com.google.android.gms.internal.firebase-auth-api.zzll     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            throw r1     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x008d:
            com.google.firebase.FirebaseApp r4 = com.google.firebase.FirebaseApp.getInstance(r6)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            com.google.firebase.auth.internal.zzx r6 = new com.google.firebase.auth.internal.zzx     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r4 != 0) goto L_0x00a3
            com.google.android.gms.internal.firebase-auth-api.zzwq r4 = com.google.android.gms.internal.p002firebaseauthapi.zzwq.zzd(r5)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r6.zzh(r4)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x00a3:
            if (r7 != 0) goto L_0x00a8
            r6.zzm()     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x00a8:
            r6.zzl(r8)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r4 == 0) goto L_0x00d4
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzz> r4 = com.google.firebase.auth.internal.zzz.CREATOR     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r3 != 0) goto L_0x00bb
        L_0x00b9:
            r3 = 0
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00cd, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00cd, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            com.google.firebase.auth.internal.zzz r3 = new com.google.firebase.auth.internal.zzz     // Catch:{ JSONException -> 0x00cd, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00cd, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            goto L_0x00cf
        L_0x00cd:
            goto L_0x00b9
        L_0x00cf:
            if (r3 == 0) goto L_0x00d4
            r6.zzr(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x00d4:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r3 == 0) goto L_0x0137
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r0 == 0) goto L_0x0137
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r2.<init>()     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r12 = 0
        L_0x00e6:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r12 >= r3) goto L_0x0134
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r3 == 0) goto L_0x012d
            android.os.Parcelable$Creator<com.google.firebase.auth.PhoneMultiFactorInfo> r3 = com.google.firebase.auth.PhoneMultiFactorInfo.CREATOR     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = "uid"
            java.lang.String r18 = r4.optString(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            long r20 = r4.optLong(r1)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r22 = r4.optString(r15)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            com.google.firebase.auth.PhoneMultiFactorInfo r3 = new com.google.firebase.auth.PhoneMultiFactorInfo     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            r17 = r3
            r17.<init>(r18, r19, r20, r22)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            goto L_0x012e
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            throw r0     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x012d:
            r3 = 0
        L_0x012e:
            r2.add(r3)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
            int r12 = r12 + 1
            goto L_0x00e6
        L_0x0134:
            r6.zzi(r2)     // Catch:{ JSONException -> 0x013e, ArrayIndexOutOfBoundsException -> 0x013c, IllegalArgumentException -> 0x013a, zzll -> 0x0138 }
        L_0x0137:
            return r6
        L_0x0138:
            r0 = move-exception
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            goto L_0x013f
        L_0x013c:
            r0 = move-exception
            goto L_0x013f
        L_0x013e:
            r0 = move-exception
        L_0x013f:
            r1 = r26
            u3.a r2 = r1.zzd
            r2.j(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbg.zzf(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }

    public final FirebaseUser zza() {
        String string = this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(i.EVENT_TYPE_KEY) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(i.EVENT_TYPE_KEY))) {
                return zzf(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzwq zzb(FirebaseUser firebaseUser) {
        s.k(firebaseUser);
        String string = this.zzc.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}), (String) null);
        if (string != null) {
            return zzwq.zzd(string);
        }
        return null;
    }

    public final void zzc(String str) {
        this.zzc.edit().remove(str).apply();
    }

    public final void zzd(FirebaseUser firebaseUser) {
        String str;
        s.k(firebaseUser);
        JSONObject jSONObject = new JSONObject();
        if (zzx.class.isAssignableFrom(firebaseUser.getClass())) {
            zzx zzx = (zzx) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzx.zzf());
                jSONObject.put("applicationName", zzx.zza().getName());
                jSONObject.put(i.EVENT_TYPE_KEY, "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzx.zzo() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<zzt> zzo = zzx.zzo();
                    for (int i10 = 0; i10 < zzo.size(); i10++) {
                        jSONArray.put(zzo.get(i10).zzb());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzx.isAnonymous());
                jSONObject.put("version", "2");
                if (zzx.getMetadata() != null) {
                    jSONObject.put("userMetadata", ((zzz) zzx.getMetadata()).zza());
                }
                List<MultiFactorInfo> enrolledFactors = new zzac(zzx).getEnrolledFactors();
                if (!enrolledFactors.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i11 = 0; i11 < enrolledFactors.size(); i11++) {
                        jSONArray2.put(enrolledFactors.get(i11).toJson());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e10) {
                this.zzd.i("Failed to turn object into JSON", e10, new Object[0]);
                throw new zzll(e10);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.zzc.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
        }
    }

    public final void zze(FirebaseUser firebaseUser, zzwq zzwq) {
        s.k(firebaseUser);
        s.k(zzwq);
        this.zzc.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}), zzwq.zzh()).apply();
    }
}
