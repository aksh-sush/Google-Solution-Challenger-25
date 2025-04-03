package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

public interface k {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback b(String str, Class cls);

    Activity c();

    void startActivityForResult(Intent intent, int i10);
}
