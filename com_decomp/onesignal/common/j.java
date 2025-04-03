package com.onesignal.common;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.onesignal.debug.internal.logging.a;
import db.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final j INSTANCE = new j();

    private j() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        l.e(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String next : bundle.keySet()) {
            try {
                jSONObject.put(next, bundle.get(next));
            } catch (JSONException e10) {
                a.error("bundleAsJSONObject error for key: " + next, e10);
            }
        }
        return jSONObject;
    }

    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                int length2 = jSONArray2.length();
                int i11 = 0;
                while (i11 < length2) {
                    Object obj = jSONArray.get(i10);
                    l.d(obj, "jsonArray1[i]");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i11);
                    l.d(obj2, "jsonArray2[j]");
                    if (!l.a(normalizeType, normalizeType(obj2))) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
                return false;
            }
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final Bundle jsonStringToBundle(String str) {
        l.e(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            l.d(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                l.c(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jSONObject) {
        l.e(jSONObject, "jsonObject");
        Iterator<String> keys = jSONObject.keys();
        l.d(keys, "jsonObject.keys()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object opt = jSONObject.opt(next);
                if (!(opt instanceof JSONArray)) {
                    if (!(opt instanceof JSONObject)) {
                        if (!jSONObject.isNull(next)) {
                            if (!l.a("", opt)) {
                                linkedHashMap.put(next, opt.toString());
                            }
                        }
                        linkedHashMap.put(next, "");
                    }
                }
                a.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", (Throwable) null, 2, (Object) null);
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jSONArray) {
        l.e(jSONArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            l.d(string, "jsonArray.getString(i)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object obj) {
        l.e(obj, "object");
        Class<?> cls = obj.getClass();
        return l.a(cls, Integer.TYPE) ? Long.valueOf((long) ((Integer) obj).intValue()) : l.a(cls, Float.TYPE) ? Double.valueOf((double) ((Float) obj).floatValue()) : obj;
    }

    public final String toUnescapedEUIDString(JSONObject jSONObject) {
        String group;
        l.e(jSONObject, "json");
        String jSONObject2 = jSONObject.toString();
        l.d(jSONObject2, "json.toString()");
        if (!jSONObject.has(EXTERNAL_USER_ID)) {
            return jSONObject2;
        }
        Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject2);
        if (!matcher.find() || (group = matcher.group(0)) == null) {
            return jSONObject2;
        }
        String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(p.r(group, "\\/", "/", false, 4, (Object) null)));
        l.d(replaceAll, "eidMatcher.replaceAll(unescapedEID)");
        return replaceAll;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        l.d(put, "JSONArray().put(jsonObject)");
        return put;
    }
}
