package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    public final DynamiteModule.b.C0090b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0090b bVar = new DynamiteModule.b.C0090b();
        int b10 = aVar.b(context, str, false);
        bVar.f5786b = b10;
        if (b10 == 0) {
            bVar.f5787c = 0;
        } else {
            bVar.f5787c = 1;
        }
        return bVar;
    }
}
