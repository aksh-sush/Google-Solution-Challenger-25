package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.webkit.WebView;
import db.l;

public final class d extends WebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.b(context);
    }

    public void computeScroll() {
    }

    public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public void scrollTo(int i10, int i11) {
    }
}
