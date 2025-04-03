package com.onesignal.session.internal.outcomes.impl;

import java.util.List;
import t9.b;

public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(va.d dVar);

    Object deleteOldOutcomeEvent(f fVar, va.d dVar);

    Object getAllEventsToSend(va.d dVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<b> list, va.d dVar);

    Object saveOutcomeEvent(f fVar, va.d dVar);

    Object saveUniqueOutcomeEventParams(f fVar, va.d dVar);
}
