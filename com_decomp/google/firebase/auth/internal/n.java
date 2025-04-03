package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzll;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import u3.a;
import y3.c;

abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final a f7716a = new a("JSONParser", new String[0]);

    static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        s.g(str);
        List<String> zzd = zzae.zzb('.').zzd(str);
        if (zzd.size() < 2) {
            a aVar = f7716a;
            String valueOf = String.valueOf(str);
            aVar.c(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
            return new HashMap();
        }
        try {
            Map c10 = c(new String(c.b(zzd.get(1)), "UTF-8"));
            return c10 == null ? new HashMap() : c10;
        } catch (UnsupportedEncodingException e10) {
            f7716a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzll(e10);
        }
    }

    static Map d(JSONObject jSONObject) {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
