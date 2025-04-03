package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzid  reason: invalid package */
public enum zzid implements zzzy {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzzz<zzid> zzg = null;
    private final int zzi;

    static {
        zzg = new zzic();
    }

    private zzid(int i10) {
        this.zzi = i10;
    }

    public static zzid zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i10 == 1) {
            return SYMMETRIC;
        }
        if (i10 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i10 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i10 != 4) {
            return null;
        }
        return REMOTE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzid.class.getName());
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
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
