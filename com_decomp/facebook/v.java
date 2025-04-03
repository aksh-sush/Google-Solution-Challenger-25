package com.facebook;

import db.g;
import e2.n;
import java.util.Random;
import k2.e;

public class v extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    public static final a f4987e = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public v() {
    }

    public v(String str) {
        super(str);
        Random random = new Random();
        if (str != null && i0.F() && random.nextInt(100) > 50) {
            n nVar = n.f9595a;
            n.a(n.b.ErrorReport, new u(str));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public v(String str, Throwable th) {
        super(str, th);
    }

    public v(Throwable th) {
        super(th);
    }
}
