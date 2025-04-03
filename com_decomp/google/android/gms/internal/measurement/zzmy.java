package com.google.android.gms.internal.measurement;

public enum zzmy {
    DOUBLE(zzmz.DOUBLE, 1),
    FLOAT(zzmz.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzmz.BOOLEAN, 0),
    STRING(zzmz.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzmz.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzmz.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzmz zzt;

    private zzmy(zzmz zzmz, int i10) {
        this.zzt = zzmz;
    }

    public final zzmz zza() {
        return this.zzt;
    }
}
