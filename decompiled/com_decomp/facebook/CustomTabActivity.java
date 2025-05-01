package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import db.g;
import db.l;

public final class CustomTabActivity extends Activity {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4663f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final String f4664g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f4665h;

    /* renamed from: e  reason: collision with root package name */
    private BroadcastReceiver f4666e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CustomTabActivity f4667a;

        b(CustomTabActivity customTabActivity) {
            this.f4667a = customTabActivity;
        }

        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            this.f4667a.finish();
        }
    }

    static {
        Class<CustomTabActivity> cls = CustomTabActivity.class;
        f4664g = l.l(cls.getSimpleName(), ".action_customTabRedirect");
        f4665h = l.l(cls.getSimpleName(), ".action_destroy");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f4664g);
            intent2.putExtra(CustomTabMainActivity.f4672k, getIntent().getDataString());
            p0.a.b(this).d(intent2);
            b bVar = new b(this);
            p0.a.b(this).c(bVar, new IntentFilter(f4665h));
            this.f4666e = bVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f4664g);
        intent.putExtra(CustomTabMainActivity.f4672k, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f4666e;
        if (broadcastReceiver != null) {
            p0.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
