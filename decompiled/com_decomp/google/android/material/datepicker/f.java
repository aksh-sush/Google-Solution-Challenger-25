package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o4.h;

abstract class f {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String d10 = d(j10);
        if (z10) {
            d10 = String.format(context.getString(h.mtrl_picker_today_description), new Object[]{d10});
        }
        if (z11) {
            return String.format(context.getString(h.mtrl_picker_start_date_description), new Object[]{d10});
        } else if (!z12) {
            return d10;
        } else {
            return String.format(context.getString(h.mtrl_picker_end_date_description), new Object[]{d10});
        }
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? z.f(locale).format(new Date(j10)) : z.e(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        if (z.i().get(1) == i10) {
            return String.format(context.getString(h.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i10)});
        }
        return String.format(context.getString(h.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i10)});
    }

    static String f(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? z.m(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime((Context) null, j10, 8228);
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? z.n(locale).format(new Date(j10)) : z.e(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar i10 = z.i();
        Calendar k10 = z.k();
        k10.setTimeInMillis(j10);
        return i10.get(1) == k10.get(1);
    }
}
