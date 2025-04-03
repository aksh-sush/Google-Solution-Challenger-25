package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.j;
import db.t;
import g7.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
import sa.o;
import va.d;

public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* renamed from: com.onesignal.notifications.bridges.a$a  reason: collision with other inner class name */
    static final class C0166a extends l implements cb.l {
        final /* synthetic */ t $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0166a(t tVar, String str, d dVar) {
            super(1, dVar);
            this.$registerer = tVar;
            this.$token = str;
        }

        public final d create(d dVar) {
            return new C0166a(this.$registerer, this.$token, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                String str = this.$token;
                this.label = 1;
                if (((com.onesignal.notifications.internal.registration.impl.d) this.$registerer.f9426e).fireCallback(str, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return sa.t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((C0166a) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage remoteMessage) {
        Bundle jsonStringToBundle;
        db.l.e(context, "context");
        db.l.e(remoteMessage, "message");
        if (b.f(context)) {
            b bVar = b.f10823a;
            a8.a aVar = (a8.a) bVar.c().getService(a8.a.class);
            c9.a aVar2 = (c9.a) bVar.c().getService(c9.a.class);
            String data = remoteMessage.getData();
            try {
                JSONObject jSONObject = new JSONObject(remoteMessage.getData());
                if (remoteMessage.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, remoteMessage.getTtl());
                }
                jSONObject.put(HMS_SENT_TIME_KEY, remoteMessage.getSentTime() == 0 ? aVar.getCurrentTimeMillis() : remoteMessage.getSentTime());
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.onesignal.debug.internal.logging.a.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", (Throwable) null, 2, (Object) null);
            }
            if (data != null && (jsonStringToBundle = j.INSTANCE.jsonStringToBundle(data)) != null) {
                aVar2.processBundleFromReceiver(context, jsonStringToBundle);
            }
        }
    }

    public final void onNewToken(Context context, String str) {
        db.l.e(context, "context");
        db.l.e(str, "token");
        onNewToken(context, str, (Bundle) null);
    }

    public final void onNewToken(Context context, String str, Bundle bundle) {
        db.l.e(context, "context");
        db.l.e(str, "token");
        if (firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.a.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle, (Throwable) null, 2, (Object) null);
            t tVar = new t();
            tVar.f9426e = b.f10823a.c().getService(com.onesignal.notifications.internal.registration.impl.d.class);
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0166a(tVar, str, (d) null), 1, (Object) null);
            return;
        }
        com.onesignal.debug.internal.logging.a.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle, (Throwable) null, 2, (Object) null);
    }
}
