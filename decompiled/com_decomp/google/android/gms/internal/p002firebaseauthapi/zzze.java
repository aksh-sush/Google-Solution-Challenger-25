package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze  reason: invalid package */
public abstract class zzze extends zzyk {
    private static final Logger zza = Logger.getLogger(zzze.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzacj.zzx();
    zzzf zze;

    private zzze() {
    }

    /* synthetic */ zzze(zzyz zzyz) {
    }

    static int zzA(zzaaz zzaaz, zzabl zzabl) {
        zzye zzye = (zzye) zzaaz;
        int zzn = zzye.zzn();
        if (zzn == -1) {
            zzn = zzabl.zza(zzye);
            zzye.zzp(zzn);
        }
        return zzE(zzn) + zzn;
    }

    static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int i10;
        try {
            i10 = zzaco.zzc(str);
        } catch (zzacn unused) {
            i10 = str.getBytes(zzaac.zza).length;
        }
        return zzE(i10) + i10;
    }

    public static int zzD(int i10) {
        return zzE(i10 << 3);
    }

    public static int zzE(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzF(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static zzze zzG(byte[] bArr) {
        return new zzzb(bArr, 0, bArr.length);
    }

    public static zzze zzH(OutputStream outputStream, int i10) {
        return new zzzd(outputStream, i10);
    }

    public static int zzw(zzyu zzyu) {
        int zzd = zzyu.zzd();
        return zzE(zzd) + zzd;
    }

    @Deprecated
    static int zzx(int i10, zzaaz zzaaz, zzabl zzabl) {
        int zzE = zzE(i10 << 3);
        int i11 = zzE + zzE;
        zzye zzye = (zzye) zzaaz;
        int zzn = zzye.zzn();
        if (zzn == -1) {
            zzn = zzabl.zza(zzye);
            zzye.zzp(zzn);
        }
        return i11 + zzn;
    }

    public static int zzy(int i10) {
        if (i10 >= 0) {
            return zzE(i10);
        }
        return 10;
    }

    public static int zzz(zzaah zzaah) {
        int zza2 = zzaah.zza();
        return zzE(zza2) + zza2;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzJ(String str, zzacn zzacn) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzacn);
        byte[] bytes = str.getBytes(zzaac.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(e10);
        } catch (zzzc e11) {
            throw e11;
        }
    }

    public abstract void zzN();

    public abstract void zzO(byte b10);

    public abstract void zzP(int i10, boolean z10);

    public abstract void zzQ(int i10, zzyu zzyu);

    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j10);

    public abstract void zzk(long j10);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    /* access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzaaz zzaaz, zzabl zzabl);

    public abstract void zzo(int i10, String str);

    public abstract void zzq(int i10, int i11);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10);

    public abstract void zzt(int i10, long j10);

    public abstract void zzu(long j10);
}
