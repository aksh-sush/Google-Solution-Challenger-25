package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import db.g;
import db.l;
import e2.e;
import e2.s0;
import e2.z;
import o2.g0;

public final class CustomTabMainActivity extends Activity {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4668g = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    public static final String f4669h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f4670i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f4671j;

    /* renamed from: k  reason: collision with root package name */
    public static final String f4672k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f4673l;

    /* renamed from: m  reason: collision with root package name */
    public static final String f4674m;

    /* renamed from: n  reason: collision with root package name */
    public static final String f4675n;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4676e = true;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f4677f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            s0 s0Var = s0.f9663a;
            Bundle o02 = s0.o0(parse.getQuery());
            o02.putAll(s0.o0(parse.getFragment()));
            return o02;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4678a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.INSTAGRAM.ordinal()] = 1;
            f4678a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CustomTabMainActivity f4679a;

        c(CustomTabMainActivity customTabMainActivity) {
            this.f4679a = customTabMainActivity;
        }

        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            Intent intent2 = new Intent(this.f4679a, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f4674m);
            String str = CustomTabMainActivity.f4672k;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            this.f4679a.startActivity(intent2);
        }
    }

    static {
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        f4669h = l.l(cls.getSimpleName(), ".extra_action");
        f4670i = l.l(cls.getSimpleName(), ".extra_params");
        f4671j = l.l(cls.getSimpleName(), ".extra_chromePackage");
        f4672k = l.l(cls.getSimpleName(), ".extra_url");
        f4673l = l.l(cls.getSimpleName(), ".extra_targetApp");
        f4674m = l.l(cls.getSimpleName(), ".action_refresh");
        f4675n = l.l(cls.getSimpleName(), ".no_activity_exception");
    }

    private final void a(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f4677f;
        if (broadcastReceiver != null) {
            p0.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f4672k);
            Bundle a10 = stringExtra != null ? f4668g.b(stringExtra) : new Bundle();
            e2.g0 g0Var = e2.g0.f9544a;
            Intent intent2 = getIntent();
            l.d(intent2, "intent");
            Intent m10 = e2.g0.m(intent2, a10, (v) null);
            if (m10 != null) {
                intent = m10;
            }
        } else {
            e2.g0 g0Var2 = e2.g0.f9544a;
            Intent intent3 = getIntent();
            l.d(intent3, "intent");
            intent = e2.g0.m(intent3, (Bundle) null, (v) null);
        }
        setResult(i10, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f4664g;
        if (l.a(str, getIntent().getAction())) {
            setResult(0);
        } else if (bundle == null && (stringExtra = getIntent().getStringExtra(f4669h)) != null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f4670i);
            boolean a10 = (b.f4678a[g0.f13693f.a(getIntent().getStringExtra(f4673l)).ordinal()] == 1 ? new z(stringExtra, bundleExtra) : new e(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f4671j));
            this.f4676e = false;
            if (!a10) {
                setResult(0, getIntent().putExtra(f4675n, true));
            } else {
                c cVar = new c(this);
                this.f4677f = cVar;
                p0.a.b(this).c(cVar, new IntentFilter(str));
                return;
            }
        } else {
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        if (l.a(f4674m, intent.getAction())) {
            p0.a.b(this).d(new Intent(CustomTabActivity.f4665h));
        } else if (!l.a(CustomTabActivity.f4664g, intent.getAction())) {
            return;
        }
        a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f4676e) {
            a(0, (Intent) null);
        }
        this.f4676e = true;
    }
}
