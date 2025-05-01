package com.onesignal.common;

import cb.l;
import db.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sa.t;

public abstract class i {

    static final class a extends m implements l {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "it");
            i.putMap(jSONObject, this.$map);
        }
    }

    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String str, l lVar) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        db.l.e(lVar, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                db.l.d(jSONObject2, "itemJSONObject");
                Object invoke = lVar.invoke(jSONObject2);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String str, l lVar) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        db.l.e(lVar, "into");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            db.l.d(jSONObject2, "this.getJSONObject(name)");
            lVar.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String str, List<? extends T> list, l lVar) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        db.l.e(lVar, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (T invoke : list) {
                JSONObject jSONObject2 = (JSONObject) lVar.invoke(invoke);
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String str, l lVar) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        db.l.e(lVar, "expand");
        JSONObject jSONObject2 = new JSONObject();
        lVar.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String str, Map<String, ? extends Object> map) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (map != null) {
            putJSONObject(jSONObject, str, new a(map));
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String str, Object obj) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String str) {
        db.l.e(jSONObject, "<this>");
        db.l.e(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        db.l.e(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        db.l.d(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            db.l.d(next, "key");
            Object obj = jSONObject.get(next);
            db.l.d(obj, "this[key]");
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) {
        db.l.e(jSONObject, "<this>");
        db.l.e(map, "map");
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(str, value);
        }
        return jSONObject;
    }
}
