package com.google.gson;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

final class DefaultDateTypeAdapter extends a {

    /* renamed from: a  reason: collision with root package name */
    private final List f8500a;

    public String toString() {
        StringBuilder sb2;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.f8500a.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb2.append(simpleName);
        sb2.append(')');
        return sb2.toString();
    }
}
