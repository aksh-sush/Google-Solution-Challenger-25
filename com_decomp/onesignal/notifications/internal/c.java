package com.onesignal.notifications.internal;

import androidx.core.app.k;
import com.onesignal.common.i;
import com.onesignal.notifications.b;
import com.onesignal.session.internal.influence.impl.e;
import db.g;
import db.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements com.onesignal.notifications.c {
    private List<? extends b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private com.onesignal.notifications.a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.onesignal.common.threading.b displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<c> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility;
    private k.f notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private long sentTime;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;
    private int ttl;

    public static final class a implements b {
        private final String icon;
        private final String id;
        private final String text;

        public a() {
            this((String) null, (String) null, (String) null, 7, (g) null);
        }

        public String getIcon() {
            return this.icon;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        public a(String str, String str2, String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, String str3, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public c(List<c> list, JSONObject jSONObject, int i10, a8.a aVar) {
        l.e(jSONObject, "jsonPayload");
        l.e(aVar, e.TIME);
        this.displayWaiter = new com.onesignal.common.threading.b();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jSONObject, aVar);
        setGroupedNotifications(list);
        setAndroidNotificationId(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initPayloadData(org.json.JSONObject r8, a8.a r9) {
        /*
            r7 = this;
            g9.h r0 = g9.h.INSTANCE     // Catch:{ all -> 0x0118 }
            org.json.JSONObject r0 = r0.getCustomJSONObject(r8)     // Catch:{ all -> 0x0118 }
            long r1 = r9.getCurrentTimeMillis()
            java.lang.String r9 = "google.ttl"
            boolean r3 = r8.has(r9)
            r4 = 259200(0x3f480, float:3.63217E-40)
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = "google.sent_time"
        L_0x0019:
            long r1 = r8.optLong(r3, r1)
            long r5 = (long) r5
            long r1 = r1 / r5
            r7.setSentTime(r1)
            int r9 = r8.optInt(r9, r4)
            r7.setTtl(r9)
            goto L_0x003d
        L_0x002a:
            java.lang.String r9 = "hms.ttl"
            boolean r3 = r8.has(r9)
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = "hms.sent_time"
            goto L_0x0019
        L_0x0035:
            long r5 = (long) r5
            long r1 = r1 / r5
            r7.setSentTime(r1)
            r7.setTtl(r4)
        L_0x003d:
            java.lang.String r9 = "i"
            java.lang.String r9 = com.onesignal.common.i.safeString(r0, r9)
            r7.setNotificationId(r9)
            java.lang.String r9 = "ti"
            java.lang.String r9 = com.onesignal.common.i.safeString(r0, r9)
            r7.setTemplateId(r9)
            java.lang.String r9 = "tn"
            java.lang.String r9 = com.onesignal.common.i.safeString(r0, r9)
            r7.setTemplateName(r9)
            java.lang.String r9 = r8.toString()
            java.lang.String r1 = "currentJsonPayload.toString()"
            db.l.d(r9, r1)
            r7.setRawPayload(r9)
            java.lang.String r9 = "a"
            org.json.JSONObject r9 = com.onesignal.common.i.safeJSONObject(r0, r9)
            r7.setAdditionalData(r9)
            java.lang.String r9 = "u"
            java.lang.String r9 = com.onesignal.common.i.safeString(r0, r9)
            r7.setLaunchURL(r9)
            java.lang.String r9 = "alert"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setBody(r9)
            java.lang.String r9 = "title"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setTitle(r9)
            java.lang.String r9 = "sicon"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setSmallIcon(r9)
            java.lang.String r9 = "bicon"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setBigPicture(r9)
            java.lang.String r9 = "licon"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setLargeIcon(r9)
            java.lang.String r9 = "sound"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setSound(r9)
            java.lang.String r9 = "grp"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setGroupKey(r9)
            java.lang.String r9 = "grp_msg"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setGroupMessage(r9)
            java.lang.String r9 = "bgac"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setSmallIconAccentColor(r9)
            java.lang.String r9 = "ledc"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setLedColor(r9)
            java.lang.String r9 = "vis"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            if (r9 == 0) goto L_0x00df
            int r9 = java.lang.Integer.parseInt(r9)
            r7.setLockScreenVisibility(r9)
        L_0x00df:
            java.lang.String r9 = "from"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            r7.setFromProjectNumber(r9)
            java.lang.String r9 = "pri"
            r0 = 0
            int r9 = r8.optInt(r9, r0)
            r7.setPriority(r9)
            java.lang.String r9 = "collapse_key"
            java.lang.String r9 = com.onesignal.common.i.safeString(r8, r9)
            java.lang.String r0 = "do_not_collapse"
            boolean r0 = db.l.a(r0, r9)
            if (r0 != 0) goto L_0x0103
            r7.setCollapseId(r9)
        L_0x0103:
            r7.setActionButtonsFromData()     // Catch:{ all -> 0x0107 }
            goto L_0x010d
        L_0x0107:
            r9 = move-exception
            java.lang.String r0 = "Error assigning OSNotificationReceivedEvent.actionButtons values!"
            com.onesignal.debug.internal.logging.a.error(r0, r9)
        L_0x010d:
            r7.setBackgroundImageLayoutFromData(r8)     // Catch:{ all -> 0x0111 }
            goto L_0x0117
        L_0x0111:
            r8 = move-exception
            java.lang.String r9 = "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!"
            com.onesignal.debug.internal.logging.a.error(r9, r8)
        L_0x0117:
            return
        L_0x0118:
            r8 = move-exception
            java.lang.String r9 = "Error assigning OSNotificationReceivedEvent payload values!"
            com.onesignal.debug.internal.logging.a.error(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.c.initPayloadData(org.json.JSONObject, a8.a):void");
    }

    private final void setActionButtonsFromData() {
        if (getAdditionalData() != null) {
            JSONObject additionalData2 = getAdditionalData();
            l.b(additionalData2);
            if (additionalData2.has("actionButtons")) {
                JSONObject additionalData3 = getAdditionalData();
                l.b(additionalData3);
                JSONArray jSONArray = additionalData3.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    l.d(jSONObject, "jsonActionButton");
                    arrayList.add(new a(i.safeString(jSONObject, "id"), i.safeString(jSONObject, "text"), i.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData4 = getAdditionalData();
                l.b(additionalData4);
                additionalData4.remove("actionId");
                JSONObject additionalData5 = getAdditionalData();
                l.b(additionalData5);
                additionalData5.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String safeString = i.safeString(jSONObject, "bg_img");
        if (safeString != null) {
            JSONObject jSONObject2 = new JSONObject(safeString);
            setBackgroundImageLayout(new com.onesignal.notifications.a(i.safeString(jSONObject2, "img"), i.safeString(jSONObject2, "tc"), i.safeString(jSONObject2, "bc")));
        }
    }

    public void display() {
        this.displayWaiter.wake();
    }

    public List<b> getActionButtons() {
        return this.actionButtons;
    }

    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    public com.onesignal.notifications.a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    public String getBigPicture() {
        return this.bigPicture;
    }

    public String getBody() {
        return this.body;
    }

    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.onesignal.common.threading.b getDisplayWaiter() {
        return this.displayWaiter;
    }

    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    public String getGroupKey() {
        return this.groupKey;
    }

    public String getGroupMessage() {
        return this.groupMessage;
    }

    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    public String getLargeIcon() {
        return this.largeIcon;
    }

    public String getLaunchURL() {
        return this.launchURL;
    }

    public String getLedColor() {
        return this.ledColor;
    }

    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final k.f getNotificationExtender() {
        return null;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getRawPayload() {
        return this.rawPayload;
    }

    public long getSentTime() {
        return this.sentTime;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    public String getSound() {
        return this.sound;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i10) {
        this.androidNotificationId = i10;
    }

    public void setBackgroundImageLayout(com.onesignal.notifications.a aVar) {
        this.backgroundImageLayout = aVar;
    }

    public void setBigPicture(String str) {
        this.bigPicture = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCollapseId(String str) {
        this.collapseId = str;
    }

    public void setExtender(k.f fVar) {
    }

    public void setFromProjectNumber(String str) {
        this.fromProjectNumber = str;
    }

    public void setGroupKey(String str) {
        this.groupKey = str;
    }

    public void setGroupMessage(String str) {
        this.groupMessage = str;
    }

    public void setGroupedNotifications(List<c> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public void setLaunchURL(String str) {
        this.launchURL = str;
    }

    public void setLedColor(String str) {
        this.ledColor = str;
    }

    public void setLockScreenVisibility(int i10) {
        this.lockScreenVisibility = i10;
    }

    public final void setNotificationExtender(k.f fVar) {
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setRawPayload(String str) {
        l.e(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j10) {
        this.sentTime = j10;
    }

    public void setSmallIcon(String str) {
        this.smallIcon = str;
    }

    public void setSmallIconAccentColor(String str) {
        this.smallIconAccentColor = str;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTtl(int i10) {
        this.ttl = i10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<c> groupedNotifications2 = getGroupedNotifications();
                l.b(groupedNotifications2);
                for (c jSONObject2 : groupedNotifications2) {
                    jSONArray.put(jSONObject2.toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put("title", getTitle());
            jSONObject.put("body", getBody());
            jSONObject.put("smallIcon", getSmallIcon());
            jSONObject.put("largeIcon", getLargeIcon());
            jSONObject.put("bigPicture", getBigPicture());
            jSONObject.put("smallIconAccentColor", getSmallIconAccentColor());
            jSONObject.put("launchURL", getLaunchURL());
            jSONObject.put("sound", getSound());
            jSONObject.put("ledColor", getLedColor());
            jSONObject.put("lockScreenVisibility", getLockScreenVisibility());
            jSONObject.put("groupKey", getGroupKey());
            jSONObject.put("groupMessage", getGroupMessage());
            jSONObject.put("fromProjectNumber", getFromProjectNumber());
            jSONObject.put("collapseId", getCollapseId());
            jSONObject.put("priority", getPriority());
            if (getAdditionalData() != null) {
                jSONObject.put("additionalData", getAdditionalData());
            }
            if (getActionButtons() != null) {
                JSONArray jSONArray2 = new JSONArray();
                List<b> actionButtons2 = getActionButtons();
                l.b(actionButtons2);
                for (b next : actionButtons2) {
                    l.c(next, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) next).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSNotification{notificationExtender=" + null + ", groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(JSONObject jSONObject, a8.a aVar) {
        this((List<c>) null, jSONObject, 0, aVar);
        l.e(jSONObject, "payload");
        l.e(aVar, e.TIME);
    }
}
