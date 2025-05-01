package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
public final class zzaai extends zzyf<String> implements RandomAccess, zzaaj {
    public static final zzaaj zza;
    private static final zzaai zzb;
    private final List<Object> zzc;

    static {
        zzaai zzaai = new zzaai(10);
        zzb = zzaai;
        zzaai.zzb();
        zza = zzaai;
    }

    public zzaai() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzyu ? ((zzyu) obj).zzr(zzaac.zza) : zzaac.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzaaj) {
            collection = ((zzaaj) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzaab zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzaai((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzaaj zze() {
        return zzc() ? new zzace(this) : this;
    }

    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzyu) {
            zzyu zzyu = (zzyu) obj;
            String zzr = zzyu.zzr(zzaac.zza);
            if (zzyu.zzk()) {
                this.zzc.set(i10, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzaac.zzh(bArr);
        if (zzaac.zzi(bArr)) {
            this.zzc.set(i10, zzh);
        }
        return zzh;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzyu zzyu) {
        zza();
        this.zzc.add(zzyu);
        this.modCount++;
    }

    public zzaai(int i10) {
        this.zzc = new ArrayList(i10);
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    private zzaai(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }
}
