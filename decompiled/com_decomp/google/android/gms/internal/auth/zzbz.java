package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.b;
import java.io.UnsupportedEncodingException;

public abstract class zzbz extends b {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("AUTH", "Error serializing object.", e10);
            return null;
        }
    }
}
