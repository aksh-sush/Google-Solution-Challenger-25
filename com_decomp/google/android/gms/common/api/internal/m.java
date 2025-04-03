package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Set f5446a = Collections.newSetFromMap(new WeakHashMap());

    public static l a(Object obj, Looper looper, String str) {
        s.l(obj, "Listener must not be null");
        s.l(looper, "Looper must not be null");
        s.l(str, "Listener type must not be null");
        return new l(looper, obj, str);
    }

    public final void b() {
        for (l a10 : this.f5446a) {
            a10.a();
        }
        this.f5446a.clear();
    }
}
