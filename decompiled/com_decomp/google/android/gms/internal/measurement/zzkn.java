package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzkn extends zzii<String> implements RandomAccess, zzko {
    public static final zzko zza;
    private static final zzkn zzb;
    private final List<Object> zzc;

    static {
        zzkn zzkn = new zzkn(10);
        zzb = zzkn;
        zzkn.zzb();
        zza = zzkn;
    }

    public zzkn() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zziy ? ((zziy) obj).zzn(zzkh.zza) : zzkh.zzh((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbM();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        zzbM();
        if (collection instanceof zzko) {
            collection = ((zzko) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbM();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzkg zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzkn((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzko zze() {
        return zzc() ? new zzmn(this) : this;
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
        if (obj instanceof zziy) {
            zziy zziy = (zziy) obj;
            String zzn = zziy.zzn(zzkh.zza);
            if (zziy.zzi()) {
                this.zzc.set(i10, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzkh.zzh(bArr);
        if (zzkh.zzi(bArr)) {
            this.zzc.set(i10, zzh);
        }
        return zzh;
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zziy zziy) {
        zzbM();
        this.zzc.add(zziy);
        this.modCount++;
    }

    public zzkn(int i10) {
        this.zzc = new ArrayList(i10);
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    private zzkn(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }
}
