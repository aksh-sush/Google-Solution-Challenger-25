package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class q extends t {
    q(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c((Object) null);
        } else {
            b(new s(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return true;
    }
}
