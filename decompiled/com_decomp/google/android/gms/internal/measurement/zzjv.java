package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjz;
import java.io.IOException;

public class zzjv<MessageType extends zzjz<MessageType, BuilderType>, BuilderType extends zzjv<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    protected zzjv(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzjz) messagetype.zzl(4, (Object) null, (Object) null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzlo.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    public final MessageType zzaA() {
        MessageType zzaB = zzaC();
        boolean z10 = true;
        byte byteValue = ((Byte) zzaB.zzl(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean zzj = zzlo.zza().zzb(zzaB.getClass()).zzj(zzaB);
                zzaB.zzl(2, true != zzj ? null : zzaB, (Object) null);
                z10 = zzj;
            }
        }
        if (z10) {
            return zzaB;
        }
        throw new zzmh(zzaB);
    }

    /* renamed from: zzaB */
    public MessageType zzaC() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzlo.zza().zzb(messagetype.getClass()).zzf(messagetype);
        this.zzb = true;
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public void zzaE() {
        MessageType messagetype = (zzjz) this.zza.zzl(4, (Object) null, (Object) null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzig zzar(zzih zzih) {
        zzay((zzjz) zzih);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzig zzas(byte[] bArr, int i10, int i11) {
        zzaz(bArr, 0, i11, zzjl.zza());
        return this;
    }

    public final /* bridge */ /* synthetic */ zzig zzat(byte[] bArr, int i10, int i11, zzjl zzjl) {
        zzaz(bArr, 0, i11, zzjl);
        return this;
    }

    /* renamed from: zzax */
    public final BuilderType zzaq() {
        BuilderType buildertype = (zzjv) this.zzc.zzl(5, (Object) null, (Object) null);
        buildertype.zzay(zzaC());
        return buildertype;
    }

    public final BuilderType zzay(MessageType messagetype) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaz(byte[] bArr, int i10, int i11, zzjl zzjl) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        try {
            zzlo.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i11, new zzik(zzjl));
            return this;
        } catch (zzkj e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkj.zzf();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    public final /* bridge */ /* synthetic */ zzlg zzbL() {
        return this.zzc;
    }
}
