package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class t {

    /* renamed from: c  reason: collision with root package name */
    private static final t f7105c = new t((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f7106a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f7107b;

    private t(Long l10, TimeZone timeZone) {
        this.f7106a = l10;
        this.f7107b = timeZone;
    }

    static t c() {
        return f7105c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f7107b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f7106a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        return instance;
    }
}
