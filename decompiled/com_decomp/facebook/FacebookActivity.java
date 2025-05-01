package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import c2.d;
import db.g;
import db.l;
import e2.g0;
import e2.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FacebookActivity extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4680f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f4681g = FacebookActivity.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private Fragment f4682e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final void x() {
        Intent intent = getIntent();
        g0 g0Var = g0.f9544a;
        l.d(intent, "requestIntent");
        v q10 = g0.q(g0.u(intent));
        Intent intent2 = getIntent();
        l.d(intent2, "intent");
        setResult(0, g0.m(intent2, (Bundle) null, q10));
        finish();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        l.e(str, "prefix");
        l.e(printWriter, "writer");
        m2.a.f13285a.a();
        if (!l.a((Object) null, Boolean.TRUE)) {
            super.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        l.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f4682e;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!i0.F()) {
            s0 s0Var = s0.f9663a;
            s0.j0(f4681g, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            l.d(applicationContext, "applicationContext");
            i0.M(applicationContext);
        }
        setContentView(d.com_facebook_activity_layout);
        if (l.a("PassThrough", intent.getAction())) {
            x();
        } else {
            this.f4682e = w();
        }
    }

    public final Fragment v() {
        return this.f4682e;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.d, e2.i, androidx.fragment.app.Fragment] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment w() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            androidx.fragment.app.m r1 = r4.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            db.l.d(r1, r2)
            java.lang.String r2 = "SingleFragment"
            androidx.fragment.app.Fragment r3 = r1.i0(r2)
            if (r3 != 0) goto L_0x0044
            java.lang.String r3 = "FacebookDialogFragment"
            java.lang.String r0 = r0.getAction()
            boolean r0 = db.l.a(r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x002e
            e2.i r0 = new e2.i
            r0.<init>()
            r0.setRetainInstance(r3)
            r0.w(r1, r2)
            goto L_0x0043
        L_0x002e:
            o2.y r0 = new o2.y
            r0.<init>()
            r0.setRetainInstance(r3)
            androidx.fragment.app.u r1 = r1.m()
            int r3 = c2.c.com_facebook_fragment_container
            androidx.fragment.app.u r1 = r1.b(r3, r0, r2)
            r1.f()
        L_0x0043:
            r3 = r0
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.w():androidx.fragment.app.Fragment");
    }
}
