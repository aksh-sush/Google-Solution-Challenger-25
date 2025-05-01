package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

final class zzaf implements ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private FieldDescriptor zzc;
    private final zzab zzd;

    zzaf(zzab zzab) {
        this.zzd = zzab;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final ValueEncoderContext add(double d10) {
        zzb();
        this.zzd.zzb(this.zzc, d10, this.zzb);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zza(FieldDescriptor fieldDescriptor, boolean z10) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z10;
    }

    public final ValueEncoderContext add(float f10) {
        zzb();
        this.zzd.zzc(this.zzc, f10, this.zzb);
        return this;
    }

    public final ValueEncoderContext add(int i10) {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    public final ValueEncoderContext add(long j10) {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    public final ValueEncoderContext add(String str) {
        zzb();
        this.zzd.zza(this.zzc, str, this.zzb);
        return this;
    }

    public final ValueEncoderContext add(boolean z10) {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    public final ValueEncoderContext add(byte[] bArr) {
        zzb();
        this.zzd.zza(this.zzc, bArr, this.zzb);
        return this;
    }
}
