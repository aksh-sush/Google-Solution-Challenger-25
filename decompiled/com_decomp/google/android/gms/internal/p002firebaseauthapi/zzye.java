package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzyd;
import com.google.android.gms.internal.p002firebaseauthapi.zzye;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzye  reason: invalid package */
public abstract class zzye<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzaaz {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    public int zzn() {
        throw null;
    }

    public final zzyu zzo() {
        try {
            int zzs = zzs();
            zzyu zzyu = zzyu.zzb;
            byte[] bArr = new byte[zzs];
            zzze zzG = zzze.zzG(bArr);
            zzG(zzG);
            zzG.zzI();
            return new zzys(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzp(int i10) {
        throw null;
    }

    public final void zzq(OutputStream outputStream) {
        zzze zzH = zzze.zzH(outputStream, zzze.zzB(zzs()));
        zzG(zzH);
        zzH.zzN();
    }

    public final byte[] zzr() {
        try {
            byte[] bArr = new byte[zzs()];
            zzze zzG = zzze.zzG(bArr);
            zzG(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
