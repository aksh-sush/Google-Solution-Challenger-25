package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class d0 {
    private static androidx.core.os.h a(androidx.core.os.h hVar, androidx.core.os.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < hVar.g() + hVar2.g()) {
            Locale d10 = i10 < hVar.g() ? hVar.d(i10) : hVar2.d(i10 - hVar.g());
            if (d10 != null) {
                linkedHashSet.add(d10);
            }
            i10++;
        }
        return androidx.core.os.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.h b(androidx.core.os.h hVar, androidx.core.os.h hVar2) {
        return (hVar == null || hVar.f()) ? androidx.core.os.h.e() : a(hVar, hVar2);
    }
}