package com.onesignal.inAppMessages.internal.prompt.impl;

import va.d;

public abstract class b {
    private boolean prompted;

    public enum a {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(d dVar);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z10) {
        this.prompted = z10;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
