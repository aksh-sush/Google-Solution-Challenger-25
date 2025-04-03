package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdy  reason: invalid package */
public final class zzdy {
    private final SharedPreferences zza;
    private final String zzb = "GenericIdpKeyset";

    public zzdy(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.zza = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
    }

    private final byte[] zzc() {
        try {
            String string = this.zza.getString(this.zzb, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.zzb}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 + i10;
                    int digit = Character.digit(string.charAt(i11), 16);
                    int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i10] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.zzb}));
        }
    }

    public final zzho zza() {
        return zzho.zzc(zzc(), zzzj.zza());
    }

    public final zzir zzb() {
        return zzir.zzf(zzc(), zzzj.zza());
    }
}
