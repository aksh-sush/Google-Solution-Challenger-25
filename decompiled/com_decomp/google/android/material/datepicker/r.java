package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class r extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    protected final LinkedHashSet f7103e = new LinkedHashSet();

    r() {
    }

    /* access modifiers changed from: package-private */
    public boolean j(q qVar) {
        return this.f7103e.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f7103e.clear();
    }
}
