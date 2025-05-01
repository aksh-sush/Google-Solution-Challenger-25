package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f5590a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f5591b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f5592c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f5593d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5594e;

    /* renamed from: f  reason: collision with root package name */
    private final View f5595f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5596g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5597h;

    /* renamed from: i  reason: collision with root package name */
    private final k4.a f5598i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f5599j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f5600a;

        /* renamed from: b  reason: collision with root package name */
        private b f5601b;

        /* renamed from: c  reason: collision with root package name */
        private String f5602c;

        /* renamed from: d  reason: collision with root package name */
        private String f5603d;

        /* renamed from: e  reason: collision with root package name */
        private k4.a f5604e = k4.a.f12798n;

        public d a() {
            return new d(this.f5600a, this.f5601b, (Map) null, 0, (View) null, this.f5602c, this.f5603d, this.f5604e, false);
        }

        public a b(String str) {
            this.f5602c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f5601b == null) {
                this.f5601b = new b();
            }
            this.f5601b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f5600a = account;
            return this;
        }

        public final a e(String str) {
            this.f5603d = str;
            return this;
        }
    }

    public d(Account account, Set set, Map map, int i10, View view, String str, String str2, k4.a aVar, boolean z10) {
        this.f5590a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f5591b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f5593d = map;
        this.f5595f = view;
        this.f5594e = i10;
        this.f5596g = str;
        this.f5597h = str2;
        this.f5598i = aVar == null ? k4.a.f12798n : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f5592c = Collections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f5590a;
    }

    public String b() {
        Account account = this.f5590a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f5590a;
        return account != null ? account : new Account(c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set d() {
        return this.f5592c;
    }

    public Set e(com.google.android.gms.common.api.a aVar) {
        android.support.v4.media.session.b.a(this.f5593d.get(aVar));
        return this.f5591b;
    }

    public String f() {
        return this.f5596g;
    }

    public Set g() {
        return this.f5591b;
    }

    public final k4.a h() {
        return this.f5598i;
    }

    public final Integer i() {
        return this.f5599j;
    }

    public final String j() {
        return this.f5597h;
    }

    public final Map k() {
        return this.f5593d;
    }

    public final void l(Integer num) {
        this.f5599j = num;
    }
}
