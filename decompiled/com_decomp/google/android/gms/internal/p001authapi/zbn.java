package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.s;
import h3.a;
import s3.e;

/* renamed from: com.google.android.gms.internal.auth-api.zbn  reason: invalid package */
public final class zbn {
    public static PendingIntent zba(Context context, a.C0229a aVar, HintRequest hintRequest, String str) {
        s.l(context, "context must not be null");
        s.l(hintRequest, "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", TextUtils.isEmpty(str) ? zbbj.zba() : (String) s.k(str));
        e.e(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, zbbk.zba | 134217728);
    }
}
