package com.google.android.gms.internal.measurement;

public enum zzjr {
    DOUBLE(0, 1, r13),
    FLOAT(1, 1, r1),
    INT64(2, 1, r3),
    UINT64(3, 1, r12),
    INT32(4, 1, r20),
    FIXED64(5, 1, r12),
    FIXED32(6, 1, r20),
    BOOL(7, 1, r24),
    STRING(8, 1, r26),
    MESSAGE(9, 1, r28),
    BYTES(10, 1, r30),
    UINT32(11, 1, r12),
    ENUM(12, 1, r33),
    SFIXED32(13, 1, r12),
    SFIXED64(14, 1, r3),
    SINT32(15, 1, r20),
    SINT64(16, 1, r3),
    GROUP(17, 1, r28),
    DOUBLE_LIST(18, 2, r13),
    FLOAT_LIST(19, 2, r1),
    INT64_LIST(20, 2, r12),
    UINT64_LIST(21, 2, r12),
    INT32_LIST(22, 2, r20),
    FIXED64_LIST(23, 2, r3),
    FIXED32_LIST(24, 2, r20),
    BOOL_LIST(25, 2, r24),
    STRING_LIST(26, 2, r26),
    MESSAGE_LIST(27, 2, r28),
    BYTES_LIST(28, 2, r30),
    UINT32_LIST(29, 2, r20),
    ENUM_LIST(30, 2, r33),
    SFIXED32_LIST(31, 2, r20),
    SFIXED64_LIST(32, 2, r3),
    SINT32_LIST(33, 2, r20),
    SINT64_LIST(34, 2, r3),
    DOUBLE_LIST_PACKED(35, 3, r13),
    FLOAT_LIST_PACKED(36, 3, r1),
    INT64_LIST_PACKED(37, 3, r12),
    UINT64_LIST_PACKED(38, 3, r12),
    INT32_LIST_PACKED(39, 3, r20),
    FIXED64_LIST_PACKED(40, 3, r3),
    FIXED32_LIST_PACKED(41, 3, r20),
    BOOL_LIST_PACKED(42, 3, r24),
    UINT32_LIST_PACKED(43, 3, r20),
    ENUM_LIST_PACKED(44, 3, r33),
    SFIXED32_LIST_PACKED(45, 3, r20),
    SFIXED64_LIST_PACKED(46, 3, r3),
    SINT32_LIST_PACKED(47, 3, r20),
    SINT64_LIST_PACKED(48, 3, r3),
    GROUP_LIST(49, 2, r28),
    MAP(50, 4, zzkk.VOID);
    
    private static final zzjr[] zzZ = null;
    private final zzkk zzab;
    private final int zzac;
    private final Class<?> zzad;

    static {
        int i10;
        zzZ = new zzjr[r1];
        for (zzjr zzjr : values()) {
            zzZ[zzjr.zzac] = zzjr;
        }
    }

    private zzjr(int i10, int i11, zzkk zzkk) {
        this.zzac = i10;
        this.zzab = zzkk;
        zzkk zzkk2 = zzkk.VOID;
        int i12 = i11 - 1;
        this.zzad = (i12 == 1 || i12 == 3) ? zzkk.zza() : null;
        if (i11 == 1) {
            zzkk.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
