package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import db.g;
import db.l;
import e2.e0;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4973c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f4974d = t0.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f4975a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f4976b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, Long.MIN_VALUE);
            if (j10 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j10);
        }

        public final String a(Bundle bundle) {
            l.e(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date c(Bundle bundle) {
            l.e(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            l.e(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final h e(Bundle bundle) {
            l.e(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (h) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? h.FACEBOOK_APPLICATION_WEB : h.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            l.e(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return !(string.length() == 0) && bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) != 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t0(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            db.l.e(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L_0x0018:
            r2.f4975a = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)"
            db.l.d(r3, r4)
            r2.f4976b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.t0.<init>(android.content.Context, java.lang.String):void");
    }

    private final void b(String str, Bundle bundle) {
        String str2;
        String string;
        String string2 = this.f4976b.getString(str, "{}");
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString("valueType");
            if (string3 != null) {
                int i10 = 0;
                switch (string3.hashCode()) {
                    case -1573317553:
                        if (string3.equals("stringList")) {
                            JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            if (length > 0) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    Object obj = jSONArray.get(i10);
                                    if (obj == JSONObject.NULL) {
                                        str2 = null;
                                    } else if (obj != null) {
                                        str2 = (String) obj;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    arrayList.add(i10, str2);
                                    if (i11 < length) {
                                        i10 = i11;
                                    }
                                }
                            }
                            bundle.putStringArrayList(str, arrayList);
                            return;
                        }
                        return;
                    case -1383386164:
                        if (string3.equals("bool[]")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length2 = jSONArray2.length();
                            boolean[] zArr = new boolean[length2];
                            int i12 = length2 - 1;
                            if (i12 >= 0) {
                                while (true) {
                                    int i13 = i10 + 1;
                                    zArr[i10] = jSONArray2.getBoolean(i10);
                                    if (i13 <= i12) {
                                        i10 = i13;
                                    }
                                }
                            }
                            bundle.putBooleanArray(str, zArr);
                            return;
                        }
                        return;
                    case -1374008726:
                        if (string3.equals("byte[]")) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length3 = jSONArray3.length();
                            byte[] bArr = new byte[length3];
                            int i14 = length3 - 1;
                            if (i14 >= 0) {
                                while (true) {
                                    int i15 = i10 + 1;
                                    bArr[i10] = (byte) jSONArray3.getInt(i10);
                                    if (i15 <= i14) {
                                        i10 = i15;
                                    }
                                }
                            }
                            bundle.putByteArray(str, bArr);
                            return;
                        }
                        return;
                    case -1361632968:
                        if (string3.equals("char[]")) {
                            JSONArray jSONArray4 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length4 = jSONArray4.length();
                            char[] cArr = new char[length4];
                            int i16 = length4 - 1;
                            if (i16 >= 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    String string4 = jSONArray4.getString(i17);
                                    if (string4 != null && string4.length() == 1) {
                                        cArr[i17] = string4.charAt(0);
                                    }
                                    if (i18 <= i16) {
                                        i17 = i18;
                                    }
                                }
                            }
                            bundle.putCharArray(str, cArr);
                            return;
                        }
                        return;
                    case -1325958191:
                        if (string3.equals("double")) {
                            bundle.putDouble(str, jSONObject.getDouble(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case -1097129250:
                        if (string3.equals("long[]")) {
                            JSONArray jSONArray5 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length5 = jSONArray5.length();
                            long[] jArr = new long[length5];
                            int i19 = length5 - 1;
                            if (i19 >= 0) {
                                while (true) {
                                    int i20 = i10 + 1;
                                    jArr[i10] = jSONArray5.getLong(i10);
                                    if (i20 <= i19) {
                                        i10 = i20;
                                    }
                                }
                            }
                            bundle.putLongArray(str, jArr);
                            return;
                        }
                        return;
                    case -891985903:
                        if (string3.equals("string")) {
                            bundle.putString(str, jSONObject.getString(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case -766441794:
                        if (string3.equals("float[]")) {
                            JSONArray jSONArray6 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length6 = jSONArray6.length();
                            float[] fArr = new float[length6];
                            int i21 = length6 - 1;
                            if (i21 >= 0) {
                                while (true) {
                                    int i22 = i10 + 1;
                                    fArr[i10] = (float) jSONArray6.getDouble(i10);
                                    if (i22 <= i21) {
                                        i10 = i22;
                                    }
                                }
                            }
                            bundle.putFloatArray(str, fArr);
                            return;
                        }
                        return;
                    case 104431:
                        if (string3.equals("int")) {
                            bundle.putInt(str, jSONObject.getInt(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 3029738:
                        if (string3.equals("bool")) {
                            bundle.putBoolean(str, jSONObject.getBoolean(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 3039496:
                        if (string3.equals("byte")) {
                            bundle.putByte(str, (byte) jSONObject.getInt(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 3052374:
                        if (string3.equals("char") && (string = jSONObject.getString(FirebaseAnalytics.Param.VALUE)) != null && string.length() == 1) {
                            bundle.putChar(str, string.charAt(0));
                            return;
                        }
                        return;
                    case 3118337:
                        if (string3.equals("enum")) {
                            try {
                                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString(FirebaseAnalytics.Param.VALUE)));
                                return;
                            } catch (ClassNotFoundException | IllegalArgumentException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 3327612:
                        if (string3.equals("long")) {
                            bundle.putLong(str, jSONObject.getLong(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 97526364:
                        if (string3.equals("float")) {
                            bundle.putFloat(str, (float) jSONObject.getDouble(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 100361105:
                        if (string3.equals("int[]")) {
                            JSONArray jSONArray7 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length7 = jSONArray7.length();
                            int[] iArr = new int[length7];
                            int i23 = length7 - 1;
                            if (i23 >= 0) {
                                while (true) {
                                    int i24 = i10 + 1;
                                    iArr[i10] = jSONArray7.getInt(i10);
                                    if (i24 <= i23) {
                                        i10 = i24;
                                    }
                                }
                            }
                            bundle.putIntArray(str, iArr);
                            return;
                        }
                        return;
                    case 109413500:
                        if (string3.equals("short")) {
                            bundle.putShort(str, (short) jSONObject.getInt(FirebaseAnalytics.Param.VALUE));
                            return;
                        }
                        return;
                    case 1359468275:
                        if (string3.equals("double[]")) {
                            JSONArray jSONArray8 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length8 = jSONArray8.length();
                            double[] dArr = new double[length8];
                            int i25 = length8 - 1;
                            if (i25 >= 0) {
                                while (true) {
                                    int i26 = i10 + 1;
                                    dArr[i10] = jSONArray8.getDouble(i10);
                                    if (i26 <= i25) {
                                        i10 = i26;
                                    }
                                }
                            }
                            bundle.putDoubleArray(str, dArr);
                            return;
                        }
                        return;
                    case 2067161310:
                        if (string3.equals("short[]")) {
                            JSONArray jSONArray9 = jSONObject.getJSONArray(FirebaseAnalytics.Param.VALUE);
                            int length9 = jSONArray9.length();
                            short[] sArr = new short[length9];
                            int i27 = length9 - 1;
                            if (i27 >= 0) {
                                while (true) {
                                    int i28 = i10 + 1;
                                    sArr[i10] = (short) jSONArray9.getInt(i10);
                                    if (i28 <= i27) {
                                        i10 = i28;
                                    }
                                }
                            }
                            bundle.putShortArray(str, sArr);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final void a() {
        this.f4976b.edit().clear().apply();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String next : this.f4976b.getAll().keySet()) {
            try {
                l.d(next, "key");
                b(next, bundle);
            } catch (JSONException e10) {
                e0.a aVar = e0.f9535e;
                u0 u0Var = u0.CACHE;
                String str = f4974d;
                l.d(str, "TAG");
                aVar.a(u0Var, 5, str, "Error reading cached value for key: '" + next + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Context context, String str, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
