package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class m<S> extends r {

    /* renamed from: f  reason: collision with root package name */
    private int f7080f;

    /* renamed from: g  reason: collision with root package name */
    private a f7081g;

    class a extends q {
        a() {
        }
    }

    static m l(d dVar, int i10, a aVar) {
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        mVar.setArguments(bundle);
        return mVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7080f = bundle.getInt("THEME_RES_ID_KEY");
        b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7081g = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f7080f));
        new a();
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7080f);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7081g);
    }
}
