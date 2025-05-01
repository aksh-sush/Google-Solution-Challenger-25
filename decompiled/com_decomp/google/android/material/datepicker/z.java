package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

abstract class z {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference f7108a = new AtomicReference();

    static long a(long j10) {
        Calendar k10 = k();
        k10.setTimeInMillis(j10);
        return c(k10).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat a10 = DateFormat.getInstanceForSkeleton(str, locale);
        a10.setTimeZone(j());
        a10.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return a10;
    }

    static Calendar c(Calendar calendar) {
        Calendar l10 = l(calendar);
        Calendar k10 = k();
        k10.set(l10.get(1), l10.get(2), l10.get(5));
        return k10;
    }

    private static java.text.DateFormat d(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat e(Locale locale) {
        return d(0, locale);
    }

    static DateFormat f(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static t g() {
        t tVar = (t) f7108a.get();
        return tVar == null ? t.c() : tVar;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        Calendar a10 = g().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(h());
        return a10;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l((Calendar) null);
    }

    static Calendar l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    static DateFormat m(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat n(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
