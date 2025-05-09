package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgr  reason: invalid package */
public enum zzgr implements zzzy {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzgr> zzf = null;
    private final int zzh;

    static {
        zzf = new zzgq();
    }

    private zzgr(int i10) {
        this.zzh = i10;
    }

    public static zzgr zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i10 == 1) {
            return UNCOMPRESSED;
        }
        if (i10 == 2) {
            return COMPRESSED;
        }
        if (i10 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzgr.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
