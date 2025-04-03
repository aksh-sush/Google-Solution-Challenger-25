package com.google.protobuf;

import java.lang.reflect.Type;

public enum w {
    DOUBLE(0, r13, r14),
    FLOAT(1, r11, r1),
    INT64(2, r11, r12),
    UINT64(3, r11, r12),
    INT32(4, r11, r21),
    FIXED64(5, r11, r3),
    FIXED32(6, r11, r21),
    BOOL(7, r11, r25),
    STRING(8, r11, r27),
    MESSAGE(9, r11, r29),
    BYTES(10, r11, r31),
    UINT32(11, r11, r21),
    ENUM(12, r11, r34),
    SFIXED32(13, r11, r21),
    SFIXED64(14, r11, r3),
    SINT32(15, r11, r21),
    SINT64(16, r11, r3),
    GROUP(17, r11, r29),
    DOUBLE_LIST(18, r40, r12),
    FLOAT_LIST(19, r19, r1),
    INT64_LIST(20, r19, r20),
    UINT64_LIST(21, r19, r20),
    INT32_LIST(22, r19, r21),
    FIXED64_LIST(23, r19, r3),
    FIXED32_LIST(24, r19, r21),
    BOOL_LIST(25, r19, r25),
    STRING_LIST(26, r19, r27),
    MESSAGE_LIST(27, r19, r29),
    BYTES_LIST(28, r19, r31),
    UINT32_LIST(29, r19, r21),
    ENUM_LIST(30, r19, r34),
    SFIXED32_LIST(31, r19, r21),
    SFIXED64_LIST(32, r19, r3),
    SINT32_LIST(33, r19, r21),
    SINT64_LIST(34, r19, r3),
    DOUBLE_LIST_PACKED(35, r56, r12),
    FLOAT_LIST_PACKED(36, r19, r1),
    INT64_LIST_PACKED(37, r19, r20),
    UINT64_LIST_PACKED(38, r19, r20),
    INT32_LIST_PACKED(39, r19, r21),
    FIXED64_LIST_PACKED(40, r19, r3),
    FIXED32_LIST_PACKED(41, r19, r21),
    BOOL_LIST_PACKED(42, r19, r25),
    UINT32_LIST_PACKED(43, r19, r21),
    ENUM_LIST_PACKED(44, r19, r34),
    SFIXED32_LIST_PACKED(45, r19, r21),
    SFIXED64_LIST_PACKED(46, r19, r3),
    SINT32_LIST_PACKED(47, r19, r21),
    SINT64_LIST_PACKED(48, r19, r3),
    GROUP_LIST(49, r40, r29),
    MAP(50, b.MAP, e0.VOID);
    

    /* renamed from: i0  reason: collision with root package name */
    private static final w[] f8764i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    private static final Type[] f8766j0 = null;

    /* renamed from: e  reason: collision with root package name */
    private final e0 f8784e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8785f;

    /* renamed from: g  reason: collision with root package name */
    private final b f8786g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f8787h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f8788i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8789a = null;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8790b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.e0[] r0 = com.google.protobuf.e0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8790b = r0
                r1 = 1
                com.google.protobuf.e0 r2 = com.google.protobuf.e0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8790b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.e0 r3 = com.google.protobuf.e0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8790b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.e0 r4 = com.google.protobuf.e0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.w$b[] r3 = com.google.protobuf.w.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8789a = r3
                com.google.protobuf.w$b r4 = com.google.protobuf.w.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f8789a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.w$b r3 = com.google.protobuf.w.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f8789a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.w$b r1 = com.google.protobuf.w.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.a.<clinit>():void");
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: e  reason: collision with root package name */
        private final boolean f8796e;

        private b(boolean z10) {
            this.f8796e = z10;
        }
    }

    static {
        int i10;
        f8766j0 = new Type[0];
        w[] values = values();
        f8764i0 = new w[values.length];
        for (w wVar : values) {
            f8764i0[wVar.f8785f] = wVar;
        }
    }

    private w(int i10, b bVar, e0 e0Var) {
        int i11;
        this.f8785f = i10;
        this.f8786g = bVar;
        this.f8784e = e0Var;
        int i12 = a.f8789a[bVar.ordinal()];
        boolean z10 = true;
        this.f8787h = (i12 == 1 || i12 == 2) ? e0Var.a() : null;
        this.f8788i = (bVar != b.SCALAR || (i11 = a.f8790b[e0Var.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : z10;
    }

    public int a() {
        return this.f8785f;
    }
}
