package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

class c {

    /* renamed from: d  reason: collision with root package name */
    private static final long f8358d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f8359e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final Utils f8360a = Utils.getInstance();

    /* renamed from: b  reason: collision with root package name */
    private long f8361b;

    /* renamed from: c  reason: collision with root package name */
    private int f8362c;

    c() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f8358d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f8362c) + ((double) this.f8360a.getRandomDelayForSyncPrevention()), (double) f8359e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f8362c = 0;
    }

    public synchronized boolean b() {
        return this.f8362c == 0 || this.f8360a.currentTimeInMillis() > this.f8361b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f8362c++;
        this.f8361b = this.f8360a.currentTimeInMillis() + a(i10);
    }
}
