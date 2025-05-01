package com.onesignal.notifications;

import va.d;

public interface n {
    void addClickListener(h hVar);

    void addForegroundLifecycleListener(j jVar);

    void addPermissionObserver(o oVar);

    void clearAllNotifications();

    boolean getCanRequestPermission();

    boolean getPermission();

    void removeClickListener(h hVar);

    void removeForegroundLifecycleListener(j jVar);

    void removeGroupedNotifications(String str);

    void removeNotification(int i10);

    void removePermissionObserver(o oVar);

    Object requestPermission(boolean z10, d dVar);
}
