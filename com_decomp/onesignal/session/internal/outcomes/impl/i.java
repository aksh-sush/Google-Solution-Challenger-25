package com.onesignal.session.internal.outcomes.impl;

import db.l;
import java.util.Set;
import y7.a;

public final class i implements c {
    private final a preferences;

    public i(a aVar) {
        l.e(aVar, "preferences");
        this.preferences = aVar;
    }

    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
    }

    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
