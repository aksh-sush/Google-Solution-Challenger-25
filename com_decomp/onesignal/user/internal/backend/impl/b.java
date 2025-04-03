package com.onesignal.user.internal.backend.impl;

import cb.l;
import db.m;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import w9.e;
import w9.f;
import w9.g;
import w9.h;
import w9.i;

public final class b {
    public static final b INSTANCE = new b();

    static final class a extends m implements l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        public final h invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            db.l.e(jSONObject2, "it");
            i.a aVar = i.Companion;
            String string = jSONObject2.getString(com.onesignal.inAppMessages.internal.display.impl.i.EVENT_TYPE_KEY);
            db.l.d(string, "it.getString(\"type\")");
            i fromString = aVar.fromString(string);
            if (fromString != null) {
                return new h(jSONObject2.getString("id"), fromString, com.onesignal.common.i.safeString(jSONObject2, "token"), com.onesignal.common.i.safeBool(jSONObject2, "enabled"), com.onesignal.common.i.safeInt(jSONObject2, "notification_types"), com.onesignal.common.i.safeString(jSONObject2, "sdk"), com.onesignal.common.i.safeString(jSONObject2, "device_model"), com.onesignal.common.i.safeString(jSONObject2, "device_os"), com.onesignal.common.i.safeBool(jSONObject2, "rooted"), com.onesignal.common.i.safeInt(jSONObject2, "net_type"), com.onesignal.common.i.safeString(jSONObject2, "carrier"), com.onesignal.common.i.safeString(jSONObject2, "app_version"));
            }
            return null;
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.b$b  reason: collision with other inner class name */
    static final class C0191b extends m implements l {
        public static final C0191b INSTANCE = new C0191b();

        C0191b() {
            super(1);
        }

        public final JSONObject invoke(g gVar) {
            db.l.e(gVar, "it");
            return new JSONObject().put("sku", gVar.getSku()).put("iso", gVar.getIso()).put("amount", gVar.getAmount().toString());
        }
    }

    private b() {
    }

    public final w9.a convertToCreateUserResponse(JSONObject jSONObject) {
        Map map;
        LinkedHashMap linkedHashMap;
        JSONObject safeJSONObject;
        Map<String, Object> map2;
        Map<String, Object> map3;
        db.l.e(jSONObject, "jsonObject");
        JSONObject safeJSONObject2 = com.onesignal.common.i.safeJSONObject(jSONObject, "identity");
        if (safeJSONObject2 == null || (map3 = com.onesignal.common.i.toMap(safeJSONObject2)) == null) {
            map = f0.d();
        } else {
            map = new LinkedHashMap(e0.a(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        JSONObject safeJSONObject3 = com.onesignal.common.i.safeJSONObject(jSONObject, "properties");
        Double d10 = null;
        if (safeJSONObject3 == null || (safeJSONObject = com.onesignal.common.i.safeJSONObject(safeJSONObject3, "tags")) == null || (map2 = com.onesignal.common.i.toMap(safeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e0.a(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
            }
            linkedHashMap = linkedHashMap2;
        }
        String safeString = safeJSONObject3 != null ? com.onesignal.common.i.safeString(safeJSONObject3, "language") : null;
        String safeString2 = safeJSONObject3 != null ? com.onesignal.common.i.safeString(safeJSONObject3, "timezone_id") : null;
        String safeString3 = safeJSONObject3 != null ? com.onesignal.common.i.safeString(safeJSONObject3, "country") : null;
        Double safeDouble = safeJSONObject3 != null ? com.onesignal.common.i.safeDouble(safeJSONObject3, "lat") : null;
        if (safeJSONObject3 != null) {
            d10 = com.onesignal.common.i.safeDouble(safeJSONObject3, "long");
        }
        return new w9.a(map, new f(linkedHashMap, safeString, safeString2, safeString3, safeDouble, d10), com.onesignal.common.i.expandJSONArray(jSONObject, "subscriptions", a.INSTANCE));
    }

    public final JSONArray convertToJSON(List<h> list) {
        db.l.e(list, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        for (h convertToJSON : list) {
            jSONArray.put(convertToJSON(convertToJSON));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(e eVar) {
        db.l.e(eVar, "propertiesDeltas");
        JSONObject putSafe = com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(new JSONObject(), "session_time", eVar.getSessionTime()), "session_count", eVar.getSessionCount());
        BigDecimal amountSpent = eVar.getAmountSpent();
        return com.onesignal.common.i.putJSONArray(com.onesignal.common.i.putSafe(putSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", eVar.getPurchases(), C0191b.INSTANCE);
    }

    public final JSONObject convertToJSON(f fVar) {
        db.l.e(fVar, "properties");
        return com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putMap(new JSONObject(), "tags", fVar.getTags()), "language", fVar.getLanguage()), "timezone_id", fVar.getTimezoneId()), "lat", fVar.getLatitude()), "long", fVar.getLongitude()), "country", fVar.getCountry());
    }

    public final JSONObject convertToJSON(h hVar) {
        db.l.e(hVar, "subscription");
        JSONObject putSafe = com.onesignal.common.i.putSafe(new JSONObject(), "id", hVar.getId());
        i type = hVar.getType();
        return com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(com.onesignal.common.i.putSafe(putSafe, com.onesignal.inAppMessages.internal.display.impl.i.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", hVar.getToken()), "enabled", hVar.getEnabled()), "notification_types", hVar.getNotificationTypes()), "sdk", hVar.getSdk()), "device_model", hVar.getDeviceModel()), "device_os", hVar.getDeviceOS()), "rooted", hVar.getRooted()), "net_type", hVar.getNetType()), "carrier", hVar.getCarrier()), "app_version", hVar.getAppVersion());
    }
}
