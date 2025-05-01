package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;

public abstract class zzig<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlf {
    /* renamed from: zzaq */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType zzar(MessageType messagetype);

    public BuilderType zzas(byte[] bArr, int i10, int i11) {
        throw null;
    }

    public BuilderType zzat(byte[] bArr, int i10, int i11, zzjl zzjl) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ zzlf zzau(zzlg zzlg) {
        if (zzbL().getClass().isInstance(zzlg)) {
            return zzar((zzih) zzlg);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* bridge */ /* synthetic */ zzlf zzav(byte[] bArr) {
        return zzas(bArr, 0, bArr.length);
    }

    public final /* bridge */ /* synthetic */ zzlf zzaw(byte[] bArr, zzjl zzjl) {
        return zzat(bArr, 0, bArr.length, zzjl);
    }
}
