package com.onesignal.notifications;

import androidx.core.app.k;
import java.util.List;
import org.json.JSONObject;

public interface c extends e, d {
    /* synthetic */ void display();

    /* synthetic */ List getActionButtons();

    /* synthetic */ JSONObject getAdditionalData();

    /* synthetic */ int getAndroidNotificationId();

    /* synthetic */ a getBackgroundImageLayout();

    /* synthetic */ String getBigPicture();

    /* synthetic */ String getBody();

    /* synthetic */ String getCollapseId();

    /* synthetic */ String getFromProjectNumber();

    /* synthetic */ String getGroupKey();

    /* synthetic */ String getGroupMessage();

    /* synthetic */ List getGroupedNotifications();

    /* synthetic */ String getLargeIcon();

    /* synthetic */ String getLaunchURL();

    /* synthetic */ String getLedColor();

    /* synthetic */ int getLockScreenVisibility();

    /* synthetic */ String getNotificationId();

    /* synthetic */ int getPriority();

    /* synthetic */ String getRawPayload();

    /* synthetic */ long getSentTime();

    /* synthetic */ String getSmallIcon();

    /* synthetic */ String getSmallIconAccentColor();

    /* synthetic */ String getSound();

    /* synthetic */ String getTemplateId();

    /* synthetic */ String getTemplateName();

    /* synthetic */ String getTitle();

    /* synthetic */ int getTtl();

    /* synthetic */ void setExtender(k.f fVar);
}
