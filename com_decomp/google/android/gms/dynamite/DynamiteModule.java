package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import c4.f;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import q3.k;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5767b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f5768c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f5769d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f5770e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f5771f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f5772g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f5773h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f5774i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f5775j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f5776k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f5777l;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f5778m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f5779n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f5780o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final b f5781p = new j();

    /* renamed from: q  reason: collision with root package name */
    private static m f5782q;

    /* renamed from: r  reason: collision with root package name */
    private static n f5783r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5784a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, f fVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0090b {

            /* renamed from: a  reason: collision with root package name */
            public int f5785a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5786b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f5787c = 0;
        }

        C0090b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        s.k(context);
        this.f5784a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (q.b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cc, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r4 = r4.a0(b4.b.Z(r20), r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01db, code lost:
        r4 = b4.b.Y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01df, code lost:
        if (r4 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ec, code lost:
        if (r9 != 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ee, code lost:
        r8.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f2, code lost:
        r8.set(java.lang.Long.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f9, code lost:
        r1 = r7.f5788a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fb, code lost:
        if (r1 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        r0.set(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0203, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0215, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to create IDynamiteLoader.", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0216, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0220, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to determine which loading route to use.", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0233, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0235, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0237, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r17 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r17.booleanValue() == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r5 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11 = f5783r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        if (r11 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5 = (com.google.android.gms.dynamite.k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r5 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        if (r5.f5788a == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        r15 = r20.getApplicationContext();
        r5 = r5.f5788a;
        b4.b.Z((java.lang.Object) null);
        r18 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        monitor-enter(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        if (f5776k < 2) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        r4 = java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        monitor-exit(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010c, code lost:
        if (r4.booleanValue() == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010e, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r4 = r11.Y(b4.b.Z(r15), r3, r14, b4.b.Z(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r4 = r11.c(b4.b.Z(r15), r3, r14, b4.b.Z(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        r4 = (android.content.Context) b4.b.Y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013b, code lost:
        if (r4 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013d, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to get module context", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0150, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015a, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No result cursor", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015b, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0165, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("DynamiteLoaderV2 was not cached.", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0167, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016d, code lost:
        r19 = r4;
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r4 = l(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0191, code lost:
        if (r4 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0193, code lost:
        r5 = r4.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0198, code lost:
        if (r5 < 3) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019a, code lost:
        r5 = (com.google.android.gms.dynamite.k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a0, code lost:
        if (r5 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a2, code lost:
        r4 = r4.b0(b4.b.Z(r20), r3, r14, b4.b.Z(r5.f5788a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b9, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No cached result cursor holder", (c4.f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        if (r5 != 2) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01bc, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r4 = r4.c0(b4.b.Z(r20), r3, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028a A[Catch:{ all -> 0x0302 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02b0 A[SYNTHETIC, Splitter:B:165:0x02b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r20, com.google.android.gms.dynamite.DynamiteModule.b r21, java.lang.String r22) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            android.content.Context r4 = r20.getApplicationContext()
            r5 = 0
            if (r4 == 0) goto L_0x0323
            java.lang.ThreadLocal r0 = f5778m
            java.lang.Object r6 = r0.get()
            com.google.android.gms.dynamite.k r6 = (com.google.android.gms.dynamite.k) r6
            com.google.android.gms.dynamite.k r7 = new com.google.android.gms.dynamite.k
            r7.<init>(r5)
            r0.set(r7)
            java.lang.ThreadLocal r8 = f5779n
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0302 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0302 }
            r8.set(r13)     // Catch:{ all -> 0x0302 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r13 = f5780o     // Catch:{ all -> 0x0302 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r13 = r2.a(r1, r3, r13)     // Catch:{ all -> 0x0302 }
            java.lang.String r14 = "DynamiteModule"
            int r15 = r13.f5785a     // Catch:{ all -> 0x0302 }
            int r5 = r13.f5786b     // Catch:{ all -> 0x0302 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0302 }
            r11.<init>()     // Catch:{ all -> 0x0302 }
            java.lang.String r12 = "Considering local module "
            r11.append(r12)     // Catch:{ all -> 0x0302 }
            r11.append(r3)     // Catch:{ all -> 0x0302 }
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch:{ all -> 0x0302 }
            r11.append(r15)     // Catch:{ all -> 0x0302 }
            java.lang.String r12 = " and remote module "
            r11.append(r12)     // Catch:{ all -> 0x0302 }
            r11.append(r3)     // Catch:{ all -> 0x0302 }
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch:{ all -> 0x0302 }
            r11.append(r5)     // Catch:{ all -> 0x0302 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x0302 }
            android.util.Log.i(r14, r5)     // Catch:{ all -> 0x0302 }
            int r5 = r13.f5787c     // Catch:{ all -> 0x0302 }
            if (r5 == 0) goto L_0x02d1
            r11 = -1
            if (r5 != r11) goto L_0x0078
            int r5 = r13.f5785a     // Catch:{ all -> 0x0302 }
            if (r5 == 0) goto L_0x02d1
            r5 = -1
        L_0x0078:
            r12 = 1
            if (r5 != r12) goto L_0x007f
            int r14 = r13.f5786b     // Catch:{ all -> 0x0302 }
            if (r14 == 0) goto L_0x02d1
        L_0x007f:
            if (r5 != r11) goto L_0x00a1
            com.google.android.gms.dynamite.DynamiteModule r1 = h(r4, r3)     // Catch:{ all -> 0x0302 }
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            r8.remove()
            goto L_0x0096
        L_0x008f:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        L_0x0096:
            android.database.Cursor r2 = r7.f5788a
            if (r2 == 0) goto L_0x009d
            r2.close()
        L_0x009d:
            r0.set(r6)
            return r1
        L_0x00a1:
            if (r5 != r12) goto L_0x02b9
            int r14 = r13.f5786b     // Catch:{ a -> 0x025a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r15 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r15)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            boolean r17 = k(r20)     // Catch:{ all -> 0x022e }
            if (r17 == 0) goto L_0x0221
            java.lang.Boolean r17 = f5773h     // Catch:{ all -> 0x022e }
            monitor-exit(r15)     // Catch:{ all -> 0x022e }
            if (r17 == 0) goto L_0x0216
            boolean r15 = r17.booleanValue()     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r12 = 2
            if (r15 == 0) goto L_0x016d
            java.lang.String r15 = "DynamiteModule"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r11.<init>()     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = "Selected remote version of "
            r11.append(r5)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r11.append(r3)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = ", version >= "
            r11.append(r5)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r11.append(r14)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = r11.toString()     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            android.util.Log.i(r15, r5)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r5 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            com.google.android.gms.dynamite.n r11 = f5783r     // Catch:{ all -> 0x0166 }
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            if (r11 == 0) goto L_0x015b
            java.lang.Object r5 = r0.get()     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            com.google.android.gms.dynamite.k r5 = (com.google.android.gms.dynamite.k) r5     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            if (r5 == 0) goto L_0x0150
            android.database.Cursor r15 = r5.f5788a     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            if (r15 == 0) goto L_0x0150
            android.content.Context r15 = r20.getApplicationContext()     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            android.database.Cursor r5 = r5.f5788a     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r16 = 0
            b4.b.Z(r16)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r18 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r18)     // Catch:{ RemoteException -> 0x024c, a -> 0x0248, all -> 0x0239 }
            r19 = r4
            int r4 = f5776k     // Catch:{ all -> 0x014d }
            if (r4 < r12) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = 0
        L_0x0103:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x014d }
            monitor-exit(r18)     // Catch:{ all -> 0x014d }
            boolean r4 = r4.booleanValue()     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0122
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r12 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r12)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = b4.b.Z(r15)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r5 = b4.b.Z(r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = r11.Y(r4, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            goto L_0x0135
        L_0x0122:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r12 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r12)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = b4.b.Z(r15)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r5 = b4.b.Z(r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = r11.c(r4, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0135:
            java.lang.Object r4 = b4.b.Y(r4)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0144
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            goto L_0x01e8
        L_0x0144:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to get module context"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x014d:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0150:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "No result cursor"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x015b:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0166:
            r0 = move-exception
            r19 = r4
        L_0x0169:
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x016b:
            r0 = move-exception
            goto L_0x0169
        L_0x016d:
            r19 = r4
            java.lang.String r4 = "DynamiteModule"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r5.<init>()     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r11 = "Selected remote version of "
            r5.append(r11)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r5.append(r3)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r11 = ", version >= "
            r5.append(r11)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r5.append(r14)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r5 = r5.toString()     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            android.util.Log.i(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            com.google.android.gms.dynamite.m r4 = l(r20)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x020d
            int r5 = r4.c()     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r11 = 3
            if (r5 < r11) goto L_0x01ba
            java.lang.Object r5 = r0.get()     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            com.google.android.gms.dynamite.k r5 = (com.google.android.gms.dynamite.k) r5     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            if (r5 == 0) goto L_0x01b1
            b4.a r11 = b4.b.Z(r20)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            android.database.Cursor r5 = r5.f5788a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r5 = b4.b.Z(r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = r4.b0(r11, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            goto L_0x01db
        L_0x01b1:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "No cached result cursor holder"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x01ba:
            if (r5 != r12) goto L_0x01cc
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version = 2"
            android.util.Log.w(r5, r11)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r5 = b4.b.Z(r20)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = r4.c0(r5, r3, r14)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            goto L_0x01db
        L_0x01cc:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r5, r11)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r5 = b4.b.Z(r20)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            b4.a r4 = r4.a0(r5, r3, r14)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x01db:
            java.lang.Object r4 = b4.b.Y(r4)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0204
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x01e8:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01f2
            r8.remove()
            goto L_0x01f9
        L_0x01f2:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L_0x01f9:
            android.database.Cursor r1 = r7.f5788a
            if (r1 == 0) goto L_0x0200
            r1.close()
        L_0x0200:
            r0.set(r6)
            return r5
        L_0x0204:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x020d:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0216:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0221:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x022c }
            java.lang.String r4 = "Remote loading disabled"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ all -> 0x022c }
            throw r0     // Catch:{ all -> 0x022c }
        L_0x022c:
            r0 = move-exception
            goto L_0x0231
        L_0x022e:
            r0 = move-exception
            r19 = r4
        L_0x0231:
            monitor-exit(r15)     // Catch:{ all -> 0x022c }
            throw r0     // Catch:{ RemoteException -> 0x0237, a -> 0x0235, all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            goto L_0x023c
        L_0x0235:
            r0 = move-exception
            goto L_0x024b
        L_0x0237:
            r0 = move-exception
            goto L_0x024f
        L_0x0239:
            r0 = move-exception
            r19 = r4
        L_0x023c:
            y3.g.a(r1, r0)     // Catch:{ a -> 0x0258 }
            com.google.android.gms.dynamite.DynamiteModule$a r4 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0258 }
            java.lang.String r5 = "Failed to load remote module."
            r8 = 0
            r4.<init>(r5, r0, r8)     // Catch:{ a -> 0x0258 }
            throw r4     // Catch:{ a -> 0x0258 }
        L_0x0248:
            r0 = move-exception
            r19 = r4
        L_0x024b:
            throw r0     // Catch:{ a -> 0x0258 }
        L_0x024c:
            r0 = move-exception
            r19 = r4
        L_0x024f:
            com.google.android.gms.dynamite.DynamiteModule$a r4 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0258 }
            java.lang.String r5 = "Failed to load remote module."
            r8 = 0
            r4.<init>(r5, r0, r8)     // Catch:{ a -> 0x0258 }
            throw r4     // Catch:{ a -> 0x0258 }
        L_0x0258:
            r0 = move-exception
            goto L_0x025d
        L_0x025a:
            r0 = move-exception
            r19 = r4
        L_0x025d:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x0302 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0302 }
            r8.<init>()     // Catch:{ all -> 0x0302 }
            java.lang.String r11 = "Failed to load remote module: "
            r8.append(r11)     // Catch:{ all -> 0x0302 }
            r8.append(r5)     // Catch:{ all -> 0x0302 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0302 }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x0302 }
            int r4 = r13.f5785a     // Catch:{ all -> 0x0302 }
            if (r4 == 0) goto L_0x02b0
            com.google.android.gms.dynamite.l r5 = new com.google.android.gms.dynamite.l     // Catch:{ all -> 0x0302 }
            r8 = 0
            r5.<init>(r4, r8)     // Catch:{ all -> 0x0302 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r1 = r2.a(r1, r3, r5)     // Catch:{ all -> 0x0302 }
            int r1 = r1.f5787c     // Catch:{ all -> 0x0302 }
            r2 = -1
            if (r1 != r2) goto L_0x02b0
            r1 = r19
            com.google.android.gms.dynamite.DynamiteModule r0 = h(r1, r3)     // Catch:{ all -> 0x0302 }
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            java.lang.ThreadLocal r1 = f5779n
            if (r3 != 0) goto L_0x029c
            r1.remove()
            goto L_0x02a3
        L_0x029c:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x02a3:
            android.database.Cursor r1 = r7.f5788a
            if (r1 == 0) goto L_0x02aa
            r1.close()
        L_0x02aa:
            java.lang.ThreadLocal r1 = f5778m
            r1.set(r6)
            return r0
        L_0x02b0:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0302 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0302 }
            throw r1     // Catch:{ all -> 0x0302 }
        L_0x02b9:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0302 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0302 }
            r1.<init>()     // Catch:{ all -> 0x0302 }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x0302 }
            r1.append(r5)     // Catch:{ all -> 0x0302 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0302 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0302 }
            throw r0     // Catch:{ all -> 0x0302 }
        L_0x02d1:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0302 }
            int r1 = r13.f5785a     // Catch:{ all -> 0x0302 }
            int r2 = r13.f5786b     // Catch:{ all -> 0x0302 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0302 }
            r4.<init>()     // Catch:{ all -> 0x0302 }
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch:{ all -> 0x0302 }
            r4.append(r3)     // Catch:{ all -> 0x0302 }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x0302 }
            r4.append(r1)     // Catch:{ all -> 0x0302 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x0302 }
            r4.append(r2)     // Catch:{ all -> 0x0302 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0302 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0302 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0302 }
            throw r0     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r0 = move-exception
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            java.lang.ThreadLocal r1 = f5779n
            if (r3 != 0) goto L_0x030f
            r1.remove()
            goto L_0x0316
        L_0x030f:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x0316:
            android.database.Cursor r1 = r7.f5788a
            if (r1 == 0) goto L_0x031d
            r1.close()
        L_0x031d:
            java.lang.ThreadLocal r1 = f5778m
            r1.set(r6)
            throw r0
        L_0x0323:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:17:0x003b=Splitter:B:17:0x003b, B:50:0x009c=Splitter:B:50:0x009c} */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r1 = f5773h     // Catch:{ all -> 0x01be }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d7
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b1 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b1 }
            if (r5 != r6) goto L_0x0036
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b1 }
            goto L_0x00af
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            i(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b1 }
            goto L_0x00af
        L_0x003f:
            boolean r5 = k(r10)     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            return r3
        L_0x0048:
            boolean r5 = f5775j     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b1 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = g(r10, r11, r12, r6)     // Catch:{ a -> 0x009f }
            java.lang.String r7 = f5774i     // Catch:{ a -> 0x009f }
            if (r7 == 0) goto L_0x009c
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009f }
            if (r7 == 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            java.lang.ClassLoader r7 = c4.d.a()     // Catch:{ a -> 0x009f }
            if (r7 == 0) goto L_0x006c
            goto L_0x0091
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009f }
            r8 = 29
            if (r7 < r8) goto L_0x0083
            c4.b.a()     // Catch:{ a -> 0x009f }
            java.lang.String r7 = f5774i     // Catch:{ a -> 0x009f }
            com.google.android.gms.common.internal.s.k(r7)     // Catch:{ a -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009f }
            dalvik.system.DelegateLastClassLoader r7 = c4.a.a(r7, r8)     // Catch:{ a -> 0x009f }
            goto L_0x0091
        L_0x0083:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x009f }
            java.lang.String r8 = f5774i     // Catch:{ a -> 0x009f }
            com.google.android.gms.common.internal.s.k(r8)     // Catch:{ a -> 0x009f }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009f }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009f }
        L_0x0091:
            i(r7)     // Catch:{ a -> 0x009f }
            r1.set(r2, r7)     // Catch:{ a -> 0x009f }
            f5773h = r5     // Catch:{ a -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            return r6
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            return r6
        L_0x009f:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b1 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b1 }
            goto L_0x0032
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b1 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b1 }
            goto L_0x0032
        L_0x00af:
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            goto L_0x00d5
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b8, IllegalAccessException -> 0x00b6, NoSuchFieldException -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            goto L_0x00b9
        L_0x00b6:
            r1 = move-exception
            goto L_0x00b9
        L_0x00b8:
            r1 = move-exception
        L_0x00b9:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r5.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch:{ all -> 0x01be }
            r5.append(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01be }
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x01be }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01be }
        L_0x00d5:
            f5773h = r1     // Catch:{ all -> 0x01be }
        L_0x00d7:
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00ff
            int r10 = g(r10, r11, r12, r3)     // Catch:{ a -> 0x00e3 }
            return r10
        L_0x00e3:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r0.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01c1 }
            r0.append(r11)     // Catch:{ all -> 0x01c1 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x01c1 }
            android.util.Log.w(r12, r11)     // Catch:{ all -> 0x01c1 }
            return r3
        L_0x00ff:
            com.google.android.gms.dynamite.m r4 = l(r10)     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x0107
            goto L_0x01b5
        L_0x0107:
            int r0 = r4.c()     // Catch:{ RemoteException -> 0x0194 }
            r1 = 3
            if (r0 < r1) goto L_0x016f
            java.lang.ThreadLocal r0 = f5778m     // Catch:{ RemoteException -> 0x0194 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0194 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x0194 }
            if (r0 == 0) goto L_0x0122
            android.database.Cursor r0 = r0.f5788a     // Catch:{ RemoteException -> 0x0194 }
            if (r0 == 0) goto L_0x0122
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0194 }
            goto L_0x01b5
        L_0x0122:
            b4.a r5 = b4.b.Z(r10)     // Catch:{ RemoteException -> 0x0194 }
            java.lang.ThreadLocal r0 = f5779n     // Catch:{ RemoteException -> 0x0194 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0194 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0194 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0194 }
            r6 = r11
            r7 = r12
            b4.a r11 = r4.d0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0194 }
            java.lang.Object r11 = b4.b.Y(r11)     // Catch:{ RemoteException -> 0x0194 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0194 }
            if (r11 == 0) goto L_0x015c
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016c, all -> 0x0169 }
            if (r12 != 0) goto L_0x0147
            goto L_0x015c
        L_0x0147:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016c, all -> 0x0169 }
            if (r12 <= 0) goto L_0x0154
            boolean r0 = j(r11)     // Catch:{ RemoteException -> 0x016c, all -> 0x0169 }
            if (r0 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r2 = r11
        L_0x0155:
            if (r2 == 0) goto L_0x015a
            r2.close()     // Catch:{ all -> 0x01c1 }
        L_0x015a:
            r3 = r12
            goto L_0x01b5
        L_0x015c:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016c, all -> 0x0169 }
            if (r11 == 0) goto L_0x01b5
            r11.close()     // Catch:{ all -> 0x01c1 }
            goto L_0x01b5
        L_0x0169:
            r12 = move-exception
            r2 = r11
            goto L_0x01b8
        L_0x016c:
            r12 = move-exception
            r2 = r11
            goto L_0x0196
        L_0x016f:
            r1 = 2
            if (r0 != r1) goto L_0x0182
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0194 }
            b4.a r0 = b4.b.Z(r10)     // Catch:{ RemoteException -> 0x0194 }
            int r3 = r4.Z(r0, r11, r12)     // Catch:{ RemoteException -> 0x0194 }
            goto L_0x01b5
        L_0x0182:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0194 }
            b4.a r0 = b4.b.Z(r10)     // Catch:{ RemoteException -> 0x0194 }
            int r3 = r4.Y(r0, r11, r12)     // Catch:{ RemoteException -> 0x0194 }
            goto L_0x01b5
        L_0x0192:
            r12 = r11
            goto L_0x01b8
        L_0x0194:
            r11 = move-exception
            r12 = r11
        L_0x0196:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x01b6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r0.<init>()     // Catch:{ all -> 0x01b6 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01b6 }
            r0.append(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x01b6 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b6 }
            if (r2 == 0) goto L_0x01b5
            r2.close()     // Catch:{ all -> 0x01c1 }
        L_0x01b5:
            return r3
        L_0x01b6:
            r11 = move-exception
            goto L_0x0192
        L_0x01b8:
            if (r2 == 0) goto L_0x01bd
            r2.close()     // Catch:{ all -> 0x01c1 }
        L_0x01bd:
            throw r12     // Catch:{ all -> 0x01c1 }
        L_0x01be:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01be }
            throw r11     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r11 = move-exception
            y3.g.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f5779n     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f5774i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f5776k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f5775j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00da
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00d8 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r11.getMessage()     // Catch:{ all -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r1.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "V2 version check failed: "
            r1.append(r2)     // Catch:{ all -> 0x00d8 }
            r1.append(r13)     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00d8 }
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00d8 }
            throw r12     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r11 = move-exception
            r0 = r10
        L_0x00da:
            if (r0 == 0) goto L_0x00df
            r0.close()
        L_0x00df:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f5783r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, (f) null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f5778m.get();
        if (kVar == null || kVar.f5788a != null) {
            return false;
        }
        kVar.f5788a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5777l)) {
            return true;
        }
        boolean z10 = false;
        if (f5777l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (k.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f5777l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5775j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f5782q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f5782q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public Context b() {
        return this.f5784a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f5784a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (f) null);
        }
    }
}
