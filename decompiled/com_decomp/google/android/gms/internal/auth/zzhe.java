package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzhe implements PrivilegedExceptionAction {
    zzhe() {
    }

    public static final Unsafe zza() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return zza();
    }
}
