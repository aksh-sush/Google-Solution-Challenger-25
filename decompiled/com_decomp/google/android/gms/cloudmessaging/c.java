package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.g;
import com.google.android.gms.cloudmessaging.d;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.i;
import n4.j;
import n4.l;

public class c {

    /* renamed from: h  reason: collision with root package name */
    private static int f5189h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f5190i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f5191j = c0.f5199e;

    /* renamed from: a  reason: collision with root package name */
    private final g f5192a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final Context f5193b;

    /* renamed from: c  reason: collision with root package name */
    private final u f5194c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f5195d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f5196e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f5197f;

    /* renamed from: g  reason: collision with root package name */
    private d f5198g;

    public c(Context context) {
        this.f5193b = context;
        this.f5194c = new u(context);
        this.f5196e = new Messenger(new b0(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5195d = scheduledThreadPoolExecutor;
    }

    static final /* synthetic */ Bundle b(i iVar) {
        if (iVar.isSuccessful()) {
            return (Bundle) iVar.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.getException());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.getException());
    }

    private static synchronized String c() {
        String num;
        synchronized (c.class) {
            int i10 = f5189h;
            f5189h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    static final /* synthetic */ i d(Bundle bundle) {
        return l(bundle) ? l.e((Object) null) : l.e(bundle);
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (c.class) {
            if (f5190i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f5190i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f5190i);
        }
    }

    /* access modifiers changed from: private */
    public final void g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new d.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof d) {
                        this.f5198g = (d) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f5197f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                            sb2.append("Unexpected response, no error or registration id ");
                            sb2.append(valueOf);
                            Log.w("Rpc", sb2.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            i(str, intent2.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2).getExtras());
                            return;
                        }
                        synchronized (this.f5192a) {
                            for (int i10 = 0; i10 < this.f5192a.size(); i10++) {
                                i((String) this.f5192a.i(i10), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f5192a) {
            j jVar = (j) this.f5192a.remove(str);
            if (jVar == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            jVar.c(bundle);
        }
    }

    static final /* synthetic */ void k(j jVar) {
        if (jVar.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    private static boolean l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private final i m(Bundle bundle) {
        String c10 = c();
        j jVar = new j();
        synchronized (this.f5192a) {
            this.f5192a.put(c10, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f5194c.a() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        f(this.f5193b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 5);
        sb2.append("|ID|");
        sb2.append(c10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f5196e);
        if (!(this.f5197f == null && this.f5198g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f5197f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f5198g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.a().addOnCompleteListener(f5191j, (n4.d) new a0(this, c10, this.f5195d.schedule(new x(jVar), 30, TimeUnit.SECONDS)));
            return jVar.a();
        }
        if (this.f5194c.a() == 2) {
            this.f5193b.sendBroadcast(intent);
        } else {
            this.f5193b.startService(intent);
        }
        jVar.a().addOnCompleteListener(f5191j, (n4.d) new a0(this, c10, this.f5195d.schedule(new x(jVar), 30, TimeUnit.SECONDS)));
        return jVar.a();
    }

    public i a(Bundle bundle) {
        boolean z10 = true;
        if (this.f5194c.c() >= 12000000) {
            return h.c(this.f5193b).g(1, bundle).continueWith(f5191j, w.f5235a);
        }
        if (this.f5194c.a() == 0) {
            z10 = false;
        }
        return !z10 ? l.d(new IOException("MISSING_INSTANCEID_SERVICE")) : m(bundle).continueWithTask(f5191j, new y(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i e(Bundle bundle, i iVar) {
        return (iVar.isSuccessful() && l((Bundle) iVar.getResult())) ? m(bundle).onSuccessTask(f5191j, z.f5239a) : iVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str, ScheduledFuture scheduledFuture, i iVar) {
        synchronized (this.f5192a) {
            this.f5192a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
