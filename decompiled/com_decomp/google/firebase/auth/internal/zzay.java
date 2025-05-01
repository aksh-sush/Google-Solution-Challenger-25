package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzll;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;
import u3.a;

public final class zzay {
    private static final a zza = new a("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map map;
        try {
            map = n.b(str);
        } catch (zzll e10) {
            zza.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new GetTokenResult(str, map);
    }
}
