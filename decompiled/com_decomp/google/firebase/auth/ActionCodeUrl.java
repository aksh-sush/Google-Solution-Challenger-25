package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.s;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Map;
import java.util.Set;

public class ActionCodeUrl {
    private static final Map<String, Integer> zza = new d();
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    private ActionCodeUrl(String str) {
        String zzb2 = zzb(str, DynamicLink.Builder.KEY_API_KEY);
        String zzb3 = zzb(str, "oobCode");
        String zzb4 = zzb(str, "mode");
        if (zzb2 == null || zzb3 == null || zzb4 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{DynamicLink.Builder.KEY_API_KEY, "oobCode", "mode"}));
        }
        this.zzb = s.g(zzb2);
        this.zzc = s.g(zzb3);
        this.zzd = s.g(zzb4);
        this.zze = zzb(str, "continueUrl");
        this.zzf = zzb(str, "languageCode");
        this.zzg = zzb(str, "tenantId");
    }

    public static ActionCodeUrl parseLink(String str) {
        s.g(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String zzb(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains(DynamicLink.Builder.KEY_LINK)) {
                return Uri.parse(s.g(parse.getQueryParameter(DynamicLink.Builder.KEY_LINK))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String getApiKey() {
        return this.zzb;
    }

    public String getCode() {
        return this.zzc;
    }

    public String getContinueUrl() {
        return this.zze;
    }

    public String getLanguageCode() {
        return this.zzf;
    }

    public int getOperation() {
        Map<String, Integer> map = zza;
        if (map.containsKey(this.zzd)) {
            return map.get(this.zzd).intValue();
        }
        return 3;
    }

    public final String zza() {
        return this.zzg;
    }
}
