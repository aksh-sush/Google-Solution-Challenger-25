package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacp  reason: invalid package */
public enum zzacp {
    DOUBLE(zzacq.DOUBLE, 1),
    FLOAT(zzacq.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzacq.BOOLEAN, 0),
    STRING(zzacq.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzacq.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzacq.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzacq zzt;

    private zzacp(zzacq zzacq, int i10) {
        this.zzt = zzacq;
    }

    public final zzacq zza() {
        return this.zzt;
    }
}
