package com.onesignal.inAppMessages.internal;

import com.onesignal.common.f;
import com.onesignal.session.internal.influence.impl.e;
import db.g;
import db.l;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements e8.a {
    public static final C0138a Companion = new C0138a((g) null);
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private Date endTime;
    private boolean hasLiquid;
    private boolean isDisplayedInSession;
    private boolean isPreview;
    private boolean isTriggerChanged;
    private final String messageId;
    private h redisplayStats;
    private List<? extends List<m>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    /* renamed from: com.onesignal.inAppMessages.internal.a$a  reason: collision with other inner class name */
    public static final class C0138a {
        private C0138a() {
        }

        public /* synthetic */ C0138a(g gVar) {
            this();
        }
    }

    public a(String str, a8.a aVar) {
        l.e(str, IAM_ID);
        l.e(aVar, e.TIME);
        this.messageId = str;
        this.variants = f0.d();
        this.triggers = o.e();
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new h(aVar);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            l.d(string, "{\n                json.g…g(END_TIME)\n            }");
            if (l.a(string, "null")) {
                return null;
            }
            try {
                return f.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ArrayList<ArrayList<m>> parseTriggerJson(JSONArray jSONArray) {
        ArrayList<ArrayList<m>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i11);
                l.d(jSONObject, "ands.getJSONObject(j)");
                arrayList2.add(new m(jSONObject));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                l.d(next2, "languageType");
                String string = jSONObject2.getString(next2);
                l.d(string, "variant.getString(languageType)");
                hashMap2.put(next2, string);
            }
            l.d(next, "variantType");
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    public final void addClickId(String str) {
        l.e(str, "clickId");
        this.clickedClickIds.add(str);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(a.class, obj.getClass())) {
            return false;
        }
        return l.a(getMessageId(), ((a) obj).getMessageId());
    }

    public final Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public final double getDisplayDuration() {
        return this.displayDuration;
    }

    public final boolean getHasLiquid() {
        return this.hasLiquid;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public final h getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<m>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String str) {
        l.e(str, "clickId");
        return !this.clickedClickIds.contains(str);
    }

    public final boolean isDisplayedInSession() {
        return this.isDisplayedInSession;
    }

    public final boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        Date date2 = this.endTime;
        l.b(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String str) {
        l.e(str, "clickId");
        this.clickedClickIds.remove(str);
    }

    public final void setDisplayDuration(double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayedInSession(boolean z10) {
        this.isDisplayedInSession = z10;
    }

    public final void setTriggerChanged(boolean z10) {
        this.isTriggerChanged = z10;
    }

    public final boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, getMessageId());
            JSONObject jSONObject2 = new JSONObject();
            for (String next : this.variants.keySet()) {
                Object obj = this.variants.get(next);
                l.b(obj);
                Map map = (Map) obj;
                JSONObject jSONObject3 = new JSONObject();
                for (String str : map.keySet()) {
                    jSONObject3.put(str, map.get(str));
                }
                jSONObject2.put(next, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (List<m> it : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                for (m jSONObject4 : it) {
                    jSONArray2.put(jSONObject4.toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, f.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, Set<String> set, boolean z10, h hVar, a8.a aVar) {
        this(str, aVar);
        l.e(str, IAM_ID);
        l.e(set, "clickIds");
        l.e(hVar, "redisplayStats");
        l.e(aVar, e.TIME);
        this.clickedClickIds = w.U(set);
        this.isDisplayedInSession = z10;
        this.redisplayStats = hVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(org.json.JSONObject r3, a8.a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "json"
            db.l.e(r3, r0)
            java.lang.String r0 = "time"
            db.l.e(r4, r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = "json.getString(ID)"
            db.l.d(r0, r1)
            r2.<init>((java.lang.String) r0, (a8.a) r4)
            java.lang.String r0 = "variants"
            org.json.JSONObject r0 = r3.getJSONObject(r0)
            java.lang.String r1 = "json.getJSONObject(IAM_VARIANTS)"
            db.l.d(r0, r1)
            java.util.HashMap r0 = r2.parseVariants(r0)
            r2.variants = r0
            java.lang.String r0 = "triggers"
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            java.lang.String r1 = "json.getJSONArray(IAM_TRIGGERS)"
            db.l.d(r0, r1)
            java.util.ArrayList r0 = r2.parseTriggerJson(r0)
            r2.triggers = r0
            java.util.Date r0 = r2.parseEndTimeJson(r3)
            r2.endTime = r0
            java.lang.String r0 = "has_liquid"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L_0x004e
            boolean r0 = r3.getBoolean(r0)
            r2.hasLiquid = r0
        L_0x004e:
            java.lang.String r0 = "redisplay"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L_0x0066
            com.onesignal.inAppMessages.internal.h r1 = new com.onesignal.inAppMessages.internal.h
            org.json.JSONObject r3 = r3.getJSONObject(r0)
            java.lang.String r0 = "json.getJSONObject(IAM_REDISPLAY_STATS)"
            db.l.d(r3, r0)
            r1.<init>(r3, r4)
            r2.redisplayStats = r1
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.a.<init>(org.json.JSONObject, a8.a):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(boolean z10, a8.a aVar) {
        this("", aVar);
        l.e(aVar, e.TIME);
        this.isPreview = z10;
    }
}
