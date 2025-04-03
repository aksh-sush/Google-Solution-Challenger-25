package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

final class g4 implements zzo {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5992a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h4 f5993b;

    g4(h4 h4Var, String str) {
        this.f5993b = h4Var;
        this.f5992a = str;
    }

    public final String zza(String str) {
        Map map = (Map) this.f5993b.f6016d.get(this.f5992a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
