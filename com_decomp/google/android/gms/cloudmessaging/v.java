package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

final class v extends t {
    v(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return false;
    }
}
