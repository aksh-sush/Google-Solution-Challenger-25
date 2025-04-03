package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class h {

    /* renamed from: c  reason: collision with root package name */
    private static h f8302c;

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f8303d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f8304a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f8305b;

    private h(Context context) {
        this.f8304a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f8305b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    private synchronized void a() {
        long j10 = this.f8304a.getLong("fire-count", 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> key : this.f8305b.getAll().entrySet()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) key.getKey())));
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f8305b.edit().remove(String.valueOf((Long) it.next())).apply();
            j10--;
            this.f8304a.edit().putLong("fire-count", j10).apply();
            if (j10 <= 100) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static synchronized h c(Context context) {
        h hVar;
        synchronized (h.class) {
            if (f8302c == null) {
                f8302c = new h(context);
            }
            hVar = f8302c;
        }
        return hVar;
    }

    static boolean f(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = f8303d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        this.f8305b.edit().clear().apply();
        this.f8304a.edit().remove("fire-count").apply();
    }

    /* access modifiers changed from: package-private */
    public synchronized long d() {
        return this.f8304a.getLong("fire-global", -1);
    }

    /* access modifiers changed from: package-private */
    public synchronized List e(boolean z10) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f8305b.getAll().entrySet()) {
            arrayList.add(SdkHeartBeatResult.create((String) next.getValue(), Long.parseLong((String) next.getKey())));
        }
        Collections.sort(arrayList);
        if (z10) {
            b();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean g(long j10) {
        return h("fire-global", j10);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean h(String str, long j10) {
        if (!this.f8304a.contains(str)) {
            this.f8304a.edit().putLong(str, j10).apply();
            return true;
        } else if (!f(this.f8304a.getLong(str, -1), j10)) {
            return false;
        } else {
            this.f8304a.edit().putLong(str, j10).apply();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void i(String str, long j10) {
        long j11 = this.f8304a.getLong("fire-count", 0);
        this.f8305b.edit().putString(String.valueOf(j10), str).apply();
        long j12 = j11 + 1;
        this.f8304a.edit().putLong("fire-count", j12).apply();
        if (j12 > 200) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void j(long j10) {
        this.f8304a.edit().putLong("fire-global", j10).apply();
    }
}
