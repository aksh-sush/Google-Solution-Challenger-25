package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.l;
import y3.n;

class b {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8378a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8379b;

    /* renamed from: c  reason: collision with root package name */
    private final NotificationParams f8380c;

    public b(Context context, NotificationParams notificationParams, Executor executor) {
        this.f8378a = executor;
        this.f8379b = context;
        this.f8380c = notificationParams;
    }

    private boolean b() {
        if (((KeyguardManager) this.f8379b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!n.f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f8379b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Showing notification");
        }
        ((NotificationManager) this.f8379b.getSystemService("notification")).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.b());
    }

    private g0 d() {
        g0 g10 = g0.g(this.f8380c.getString(Constants.MessageNotificationKeys.IMAGE_URL));
        if (g10 != null) {
            g10.n(this.f8378a);
        }
        return g10;
    }

    private void e(k.e eVar, g0 g0Var) {
        if (g0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) l.b(g0Var.h(), 5, TimeUnit.SECONDS);
                eVar.t(bitmap);
                eVar.C(new k.b().i(bitmap).h((Bitmap) null));
            } catch (ExecutionException e10) {
                String valueOf = String.valueOf(e10.getCause());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
                sb2.append("Failed to download image: ");
                sb2.append(valueOf);
                Log.w(Constants.TAG, sb2.toString());
            } catch (InterruptedException unused) {
                Log.w(Constants.TAG, "Interrupted while downloading image, showing notification without it");
                g0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w(Constants.TAG, "Failed to download image in time, showing notification without it");
                g0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f8380c.getBoolean(Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (b()) {
            return false;
        }
        g0 d10 = d();
        CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo = CommonNotificationBuilder.createNotificationInfo(this.f8379b, this.f8380c);
        e(createNotificationInfo.notificationBuilder, d10);
        c(createNotificationInfo);
        return true;
    }
}
