package com.google.gson.internal.bind;

import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.internal.c;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8510b = new b() {
    };

    /* renamed from: a  reason: collision with root package name */
    private final List f8511a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f8511a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.a.d()) {
            arrayList.add(c.c(2, 2));
        }
    }
}
