package com.onesignal.common.modeling;

public interface d extends com.onesignal.common.events.d {

    public static final class a {
        public static /* synthetic */ void replace$default(d dVar, g gVar, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "NORMAL";
                }
                dVar.replace(gVar, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
    }

    /* synthetic */ boolean getHasSubscribers();

    g getModel();

    void replace(g gVar, String str);

    /* synthetic */ void subscribe(Object obj);

    /* synthetic */ void unsubscribe(Object obj);
}
