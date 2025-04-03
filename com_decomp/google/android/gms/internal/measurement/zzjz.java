package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzjz<MessageType extends zzjz<MessageType, BuilderType>, BuilderType extends zzjv<MessageType, BuilderType>> extends zzih<MessageType, BuilderType> {
    private static final Map<Object, zzjz<?, ?>> zza = new ConcurrentHashMap();
    protected zzmj zzc = zzmj.zzc();
    protected int zzd = -1;

    protected static <E> zzkg<E> zzbA() {
        return zzlp.zze();
    }

    protected static <E> zzkg<E> zzbB(zzkg<E> zzkg) {
        int size = zzkg.size();
        return zzkg.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzbE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzbF(zzlg zzlg, String str, Object[] objArr) {
        return new zzlq(zzlg, str, objArr);
    }

    protected static <T extends zzjz> void zzbG(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    static <T extends zzjz> T zzbw(Class<T> cls) {
        Map<Object, zzjz<?, ?>> map = zza;
        T t10 = (zzjz) map.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzjz) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzjz) ((zzjz) zzms.zze(cls)).zzl(6, (Object) null, (Object) null);
            if (t10 != null) {
                map.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static zzke zzbx() {
        return zzka.zzf();
    }

    protected static zzkf zzby() {
        return zzkv.zzf();
    }

    protected static zzkf zzbz(zzkf zzkf) {
        int size = zzkf.size();
        return zzkf.zze(size == 0 ? 10 : size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlo.zza().zzb(getClass()).zzi(this, (zzjz) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int zzb = zzlo.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzli.zza(this, super.toString());
    }

    public final /* bridge */ /* synthetic */ zzlf zzbC() {
        return (zzjv) zzl(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ zzlf zzbD() {
        zzjv zzjv = (zzjv) zzl(5, (Object) null, (Object) null);
        zzjv.zzay(this);
        return zzjv;
    }

    public final void zzbH(zzjg zzjg) {
        zzlo.zza().zzb(getClass()).zzm(this, zzjh.zza(zzjg));
    }

    public final /* bridge */ /* synthetic */ zzlg zzbL() {
        return (zzjz) zzl(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzbo() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzbr(int i10) {
        this.zzd = i10;
    }

    public final int zzbt() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int zza2 = zzlo.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzjz<MessageType, BuilderType>, BuilderType extends zzjv<MessageType, BuilderType>> BuilderType zzbu() {
        return (zzjv) zzl(5, (Object) null, (Object) null);
    }

    public final BuilderType zzbv() {
        BuilderType buildertype = (zzjv) zzl(5, (Object) null, (Object) null);
        buildertype.zzay(this);
        return buildertype;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzl(int i10, Object obj, Object obj2);
}
