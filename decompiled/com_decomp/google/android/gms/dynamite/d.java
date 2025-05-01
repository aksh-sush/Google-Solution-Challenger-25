package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.C0090b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0090b bVar = new DynamiteModule.b.C0090b();
        int b10 = aVar.b(context, str, true);
        bVar.f5786b = b10;
        if (b10 != 0) {
            bVar.f5787c = 1;
        } else {
            int a10 = aVar.a(context, str);
            bVar.f5785a = a10;
            if (a10 != 0) {
                bVar.f5787c = -1;
            }
        }
        return bVar;
    }
}
