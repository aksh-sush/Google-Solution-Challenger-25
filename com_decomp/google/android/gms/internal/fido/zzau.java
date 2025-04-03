package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class zzau extends zzaq implements Set {
    private transient zzat zza;

    zzau() {
    }

    static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzau zzi(Object obj, Object obj2) {
        return zzk(2, obj, obj2);
    }

    private static zzau zzk(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzax.zza;
        }
        if (i10 != 1) {
            int zzf = zzf(i10);
            Object[] objArr2 = new Object[zzf];
            int i11 = zzf - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i10) {
                Object obj = objArr[i12];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int zza2 = zzap.zza(hashCode);
                    while (true) {
                        int i15 = zza2 & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            zza2++;
                        } else {
                            objArr[i14] = obj;
                            objArr2[i15] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                    }
                    i12++;
                } else {
                    throw new NullPointerException("at index " + i12);
                }
            }
            Arrays.fill(objArr, i14, i10, (Object) null);
            if (i14 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzay(obj3);
            }
            if (zzf(i14) < zzf / 2) {
                return zzk(i14, objArr);
            }
            if (i14 <= 0) {
                objArr = Arrays.copyOf(objArr, i14);
            }
            return new zzax(objArr, i13, objArr2, i11, i14);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzay(obj4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzau) && zzj() && ((zzau) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    /* renamed from: zzd */
    public abstract zzaz iterator();

    public final zzat zzg() {
        zzat zzat = this.zza;
        if (zzat != null) {
            return zzat;
        }
        zzat zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    /* access modifiers changed from: package-private */
    public zzat zzh() {
        Object[] array = toArray();
        int i10 = zzat.zzd;
        return zzat.zzg(array, array.length);
    }

    /* access modifiers changed from: package-private */
    public boolean zzj() {
        return false;
    }
}
