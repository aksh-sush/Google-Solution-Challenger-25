package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import q3.q;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f5718a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5719b;

    public v(Context context) {
        s.k(context);
        Resources resources = context.getResources();
        this.f5718a = resources;
        this.f5719b = resources.getResourcePackageName(q.f14697a);
    }

    public String a(String str) {
        int identifier = this.f5718a.getIdentifier(str, "string", this.f5719b);
        if (identifier == 0) {
            return null;
        }
        return this.f5718a.getString(identifier);
    }
}
