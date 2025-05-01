package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzs;
import com.google.android.gms.internal.p002firebaseauthapi.zzzw;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzw  reason: invalid package */
public abstract class zzzw<MessageType extends zzzw<MessageType, BuilderType>, BuilderType extends zzzs<MessageType, BuilderType>> extends zzye<MessageType, BuilderType> {
    private static final Map<Object, zzzw<?, ?>> zzb = new ConcurrentHashMap();
    protected zzaca zzc = zzaca.zzc();
    protected int zzd = -1;

    protected static <E> zzaab<E> zzA(zzaab<E> zzaab) {
        int size = zzaab.size();
        return zzaab.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzD(Method method, Object obj, Object... objArr) {
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

    protected static Object zzE(zzaaz zzaaz, String str, Object[] objArr) {
        return new zzabj(zzaaz, str, objArr);
    }

    protected static <T extends zzzw> void zzF(Class<T> cls, T t10) {
        zzb.put(cls, t10);
    }

    private static <T extends zzzw<T, ?>> T zza(T t10) {
        if (t10 == null || t10.zzH()) {
            return t10;
        }
        zzaae zzaae = new zzaae(new zzaby(t10).getMessage());
        zzaae.zzh(t10);
        throw zzaae;
    }

    static <T extends zzzw> T zzv(Class<T> cls) {
        Map<Object, zzzw<?, ?>> map = zzb;
        T t10 = (zzzw) map.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzzw) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzzw) ((zzzw) zzacj.zze(cls)).zzj(6, (Object) null, (Object) null);
            if (t10 != null) {
                map.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static <T extends zzzw<T, ?>> T zzw(T t10, zzyu zzyu, zzzj zzzj) {
        zzyx zzh = zzyu.zzh();
        T t11 = (zzzw) t10.zzj(4, (Object) null, (Object) null);
        try {
            zzabl<?> zzb2 = zzabh.zza().zzb(t11.getClass());
            zzb2.zzh(t11, zzyy.zzq(zzh), zzzj);
            zzb2.zzf(t11);
            try {
                zzh.zzm(0);
                zza(t11);
                return t11;
            } catch (zzaae e10) {
                e10.zzh(t11);
                throw e10;
            }
        } catch (zzaae e11) {
            e11.zzh(t11);
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaae) {
                throw ((zzaae) e12.getCause());
            }
            zzaae zzaae = new zzaae(e12);
            zzaae.zzh(t11);
            throw zzaae;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaae) {
                throw ((zzaae) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends zzzw<T, ?>> T zzx(T t10, byte[] bArr, zzzj zzzj) {
        T zzy = zzy(t10, bArr, 0, bArr.length, zzzj);
        zza(zzy);
        return zzy;
    }

    static <T extends zzzw<T, ?>> T zzy(T t10, byte[] bArr, int i10, int i11, zzzj zzzj) {
        T t11 = (zzzw) t10.zzj(4, (Object) null, (Object) null);
        try {
            zzabl<?> zzb2 = zzabh.zza().zzb(t11.getClass());
            zzb2.zzi(t11, bArr, 0, i11, new zzyh(zzzj));
            zzb2.zzf(t11);
            if (t11.zza == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (zzaae e10) {
            e10.zzh(t11);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzaae) {
                throw ((zzaae) e11.getCause());
            }
            zzaae zzaae = new zzaae(e11);
            zzaae.zzh(t11);
            throw zzaae;
        } catch (IndexOutOfBoundsException unused) {
            zzaae zzi = zzaae.zzi();
            zzi.zzh(t11);
            throw zzi;
        }
    }

    protected static <E> zzaab<E> zzz() {
        return zzabi.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzabh.zza().zzb(getClass()).zzj(this, (zzzw) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzb2 = zzabh.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzabb.zza(this, super.toString());
    }

    public final /* bridge */ /* synthetic */ zzaay zzB() {
        return (zzzs) zzj(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ zzaay zzC() {
        zzzs zzzs = (zzzs) zzj(5, (Object) null, (Object) null);
        zzzs.zzj(this);
        return zzzs;
    }

    public final void zzG(zzze zzze) {
        zzabh.zza().zzb(getClass()).zzn(this, zzzf.zza(zzze));
    }

    public final boolean zzH() {
        byte byteValue = ((Byte) zzj(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzabh.zza().zzb(getClass()).zzk(this);
        zzj(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzI() {
        return (zzzw) zzj(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object zzj(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzn() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzp(int i10) {
        this.zzd = i10;
    }

    public final int zzs() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int zza = zzabh.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzzw<MessageType, BuilderType>, BuilderType extends zzzs<MessageType, BuilderType>> BuilderType zzt() {
        return (zzzs) zzj(5, (Object) null, (Object) null);
    }

    public final BuilderType zzu() {
        BuilderType buildertype = (zzzs) zzj(5, (Object) null, (Object) null);
        buildertype.zzj(this);
        return buildertype;
    }
}
