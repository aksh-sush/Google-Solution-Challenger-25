package com.google.protobuf;

import com.google.protobuf.z;

public final class e extends z implements u0 {
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    private static volatile d1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private j value_ = j.f8600f;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8553a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z$e[] r0 = com.google.protobuf.z.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8553a = r0
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8553a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$e r1 = com.google.protobuf.z.e.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.a.<clinit>():void");
        }
    }

    public static final class b extends z.a implements u0 {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(z.e eVar, Object obj, Object obj2) {
        switch (a.f8553a[eVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b((a) null);
            case 3:
                return z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                d1 d1Var = PARSER;
                if (d1Var == null) {
                    synchronized (e.class) {
                        d1Var = PARSER;
                        if (d1Var == null) {
                            d1Var = new z.b(DEFAULT_INSTANCE);
                            PARSER = d1Var;
                        }
                    }
                }
                return d1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
