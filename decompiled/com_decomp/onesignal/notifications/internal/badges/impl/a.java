package com.onesignal.notifications.internal.badges.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import cb.l;
import db.m;
import db.s;
import g9.h;
import l7.f;
import l9.a;
import o7.b;
import o7.c;
import sa.t;

public final class a implements z8.a {
    private final f _applicationService;
    private final c _databaseProvider;
    private final h9.a _queryHelper;
    private int badgesEnabled = -1;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a  reason: collision with other inner class name */
    static final class C0168a extends m implements l {
        final /* synthetic */ s $notificationCount;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0168a(s sVar) {
            super(1);
            this.$notificationCount = sVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o7.a) obj);
            return t.f15300a;
        }

        public final void invoke(o7.a aVar) {
            db.l.e(aVar, "it");
            this.$notificationCount.f9425e = aVar.getCount();
        }
    }

    public a(f fVar, h9.a aVar, c cVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_queryHelper");
        db.l.e(cVar, "_databaseProvider");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = cVar;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i10 = this.badgesEnabled;
        if (i10 != -1) {
            return i10 == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            db.l.d(applicationInfo, "_applicationService.appC…A_DATA,\n                )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = db.l.a("DISABLE", bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.badgesEnabled = 0;
            com.onesignal.debug.internal.logging.a.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e10);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && h.areNotificationsEnabled$default(h.INSTANCE, this._applicationService.getAppContext(), (String) null, 2, (Object) null);
    }

    private final void updateFallback() {
        s sVar = new s();
        b.a.query$default(this._databaseProvider.getOs(), "notification", (String[]) null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), (String[]) null, (String) null, (String) null, (String) null, String.valueOf(a.C0256a.INSTANCE.getMaxNumberOfNotifications()), new C0168a(sVar), 122, (Object) null);
        updateCount(sVar.f9425e);
    }

    private final void updateStandard() {
        int i10 = 0;
        for (StatusBarNotification isGroupSummary : h.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!h.INSTANCE.isGroupSummary(isGroupSummary)) {
                i10++;
            }
        }
        updateCount(i10);
    }

    public void update() {
        if (areBadgesEnabled()) {
            if (Build.VERSION.SDK_INT >= 23) {
                updateStandard();
            } else {
                updateFallback();
            }
        }
    }

    public void updateCount(int i10) {
        if (areBadgeSettingsEnabled()) {
            try {
                a9.c.applyCountOrThrow(this._applicationService.getAppContext(), i10);
            } catch (a9.b unused) {
            }
        }
    }
}
