package com.google.android.gms.common.internal;

import a4.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public abstract class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5655a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5656b;

    /* renamed from: c  reason: collision with root package name */
    private static String f5657c;

    /* renamed from: d  reason: collision with root package name */
    private static int f5658d;

    public static int a(Context context) {
        b(context);
        return f5658d;
    }

    private static void b(Context context) {
        synchronized (f5655a) {
            if (!f5656b) {
                f5656b = true;
                try {
                    Bundle bundle = e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f5657c = bundle.getString("com.google.app.id");
                        f5658d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            }
        }
    }
}
