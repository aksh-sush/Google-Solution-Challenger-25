package com.google.firebase.firestore.util;

import android.util.Log;
import com.google.firebase.firestore.BuildConfig;

public class Logger {
    private static Level logLevel = Level.WARN;

    public enum Level {
        DEBUG,
        WARN,
        NONE
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8267a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.firestore.util.Logger$Level[] r0 = com.google.firebase.firestore.util.Logger.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8267a = r0
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8267a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8267a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.util.Logger.a.<clinit>():void");
        }
    }

    public static void debug(String str, String str2, Object... objArr) {
        doLog(Level.DEBUG, str, str2, objArr);
    }

    private static void doLog(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= logLevel.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", new Object[]{BuildConfig.VERSION_NAME, str}) + String.format(str2, objArr);
            int i10 = a.f8267a[level.ordinal()];
            if (i10 == 1) {
                Log.i("Firestore", str3);
            } else if (i10 == 2) {
                Log.w("Firestore", str3);
            } else if (i10 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean isDebugEnabled() {
        return logLevel.ordinal() >= Level.DEBUG.ordinal();
    }

    public static void setLogLevel(Level level) {
        logLevel = level;
    }

    public static void warn(String str, String str2, Object... objArr) {
        doLog(Level.WARN, str, str2, objArr);
    }
}
