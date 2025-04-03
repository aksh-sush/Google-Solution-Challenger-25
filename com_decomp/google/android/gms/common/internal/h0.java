package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.k;

public abstract class h0 implements DialogInterface.OnClickListener {
    public static h0 b(Activity activity, Intent intent, int i10) {
        return new f0(intent, activity, i10);
    }

    public static h0 c(k kVar, Intent intent, int i10) {
        return new g0(intent, kVar, 2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
