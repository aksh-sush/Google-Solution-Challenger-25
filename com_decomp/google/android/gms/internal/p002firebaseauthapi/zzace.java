package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzace  reason: invalid package */
public final class zzace extends AbstractList<String> implements RandomAccess, zzaaj {
    /* access modifiers changed from: private */
    public final zzaaj zza;

    public zzace(zzaaj zzaaj) {
        this.zza = zzaaj;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzaai) this.zza).get(i10);
    }

    public final Iterator<String> iterator() {
        return new zzacd(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzacc(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzaaj zze() {
        return this;
    }

    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    public final List<?> zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzyu zzyu) {
        throw new UnsupportedOperationException();
    }
}
