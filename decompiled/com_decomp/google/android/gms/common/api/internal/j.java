package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.e;
import com.google.android.gms.common.internal.s;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5414a;

    public j(Activity activity) {
        s.l(activity, "Activity must not be null");
        this.f5414a = activity;
    }

    public final Activity a() {
        return (Activity) this.f5414a;
    }

    public final e b() {
        return (e) this.f5414a;
    }

    public final boolean c() {
        return this.f5414a instanceof Activity;
    }

    public final boolean d() {
        return this.f5414a instanceof e;
    }
}
