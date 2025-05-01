package com.onesignal.debug.internal.logging;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import sa.o;
import sa.t;
import va.d;

public final class a {
    public static final a INSTANCE = new a();
    private static final String TAG = "OneSignal";
    private static f applicationService;
    private static c8.b logLevel = c8.b.WARN;
    private static c8.b visualLogLevel = c8.b.NONE;

    /* renamed from: com.onesignal.debug.internal.logging.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0137a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c8.b.values().length];
            iArr[c8.b.VERBOSE.ordinal()] = 1;
            iArr[c8.b.DEBUG.ordinal()] = 2;
            iArr[c8.b.INFO.ordinal()] = 3;
            iArr[c8.b.WARN.ordinal()] = 4;
            iArr[c8.b.ERROR.ordinal()] = 5;
            iArr[c8.b.FATAL.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends l implements cb.l {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ c8.b $level;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c8.b bVar, String str, d dVar) {
            super(1, dVar);
            this.$level = bVar;
            this.$finalFullMessage = str;
        }

        public final d create(d dVar) {
            return new b(this.$level, this.$finalFullMessage, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                f applicationService = a.INSTANCE.getApplicationService();
                Activity current = applicationService != null ? applicationService.getCurrent() : null;
                if (current != null) {
                    new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
                }
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    private a() {
    }

    public static final boolean atLogLevel(c8.b bVar) {
        db.l.e(bVar, FirebaseAnalytics.Param.LEVEL);
        return bVar.compareTo(visualLogLevel) < 1 || bVar.compareTo(logLevel) < 1;
    }

    public static final void debug(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.DEBUG, str, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.ERROR, str, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.FATAL, str, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final c8.b getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final c8.b getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.INFO, str, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(c8.b bVar, String str) {
        db.l.e(bVar, FirebaseAnalytics.Param.LEVEL);
        db.l.e(str, "message");
        log(bVar, str, (Throwable) null);
    }

    public static final void setLogLevel(c8.b bVar) {
        db.l.e(bVar, "<set-?>");
        logLevel = bVar;
    }

    public static final void setVisualLogLevel(c8.b bVar) {
        db.l.e(bVar, "<set-?>");
        visualLogLevel = bVar;
    }

    public static final void verbose(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.VERBOSE, str, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String str, Throwable th) {
        db.l.e(str, "message");
        log(c8.b.WARN, str, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public static final void log(c8.b bVar, String str, Throwable th) {
        db.l.e(bVar, FirebaseAnalytics.Param.LEVEL);
        db.l.e(str, "message");
        String str2 = '[' + Thread.currentThread().getName() + "] " + str;
        if (bVar.compareTo(logLevel) < 1) {
            switch (C0137a.$EnumSwitchMapping$0[bVar.ordinal()]) {
                case 1:
                    Log.v(TAG, str2, th);
                    break;
                case 2:
                    Log.d(TAG, str2, th);
                    break;
                case 3:
                    Log.i(TAG, str2, th);
                    break;
                case 4:
                    Log.w(TAG, str2, th);
                    break;
                case 5:
                case 6:
                    Log.e(TAG, str, th);
                    break;
            }
        }
        if (bVar.compareTo(visualLogLevel) < 1) {
            f fVar = applicationService;
            if ((fVar != null ? fVar.getCurrent() : null) != null) {
                try {
                    String e10 = i.e(str + 10);
                    if (th != null) {
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter(stringWriter));
                        e10 = (e10 + th.getMessage()) + stringWriter;
                    }
                    com.onesignal.common.threading.a.suspendifyOnMain(new b(bVar, e10, (d) null));
                } catch (Throwable th2) {
                    Log.e(TAG, "Error showing logging message.", th2);
                }
            }
        }
    }
}
