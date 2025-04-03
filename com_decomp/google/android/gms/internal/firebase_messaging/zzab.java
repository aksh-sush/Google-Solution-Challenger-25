package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class zzab implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final ObjectEncoder<Map.Entry<Object, Object>> zzi = zzaa.zza;
    private OutputStream zzb;
    private final Map<Class<?>, ObjectEncoder<?>> zzc;
    private final Map<Class<?>, ValueEncoder<?>> zzd;
    private final ObjectEncoder<Object> zze;
    private final zzaf zzf = new zzaf(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzv zzv = new zzv();
        zzv.zza(1);
        zzg = builder.withProperty(zzv.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(FirebaseAnalytics.Param.VALUE);
        zzv zzv2 = new zzv();
        zzv2.zza(2);
        zzh = builder2.withProperty(zzv2.zzb()).build();
    }

    zzab(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.zzb = outputStream;
        this.zzc = map;
        this.zzd = map2;
        this.zze = objectEncoder;
    }

    static final /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(zzg, entry.getKey());
        objectEncoderContext.add(zzh, entry.getValue());
    }

    private final <T> zzab zzh(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t10, boolean z10) {
        long zzi2 = zzi(objectEncoder, t10);
        if (z10 && zzi2 == 0) {
            return this;
        }
        zzn((zzl(fieldDescriptor) << 3) | 2);
        zzo(zzi2);
        objectEncoder.encode(t10, this);
        return this;
    }

    private final <T> long zzi(ObjectEncoder<T> objectEncoder, T t10) {
        OutputStream outputStream;
        zzw zzw = new zzw();
        try {
            outputStream = this.zzb;
            this.zzb = zzw;
            objectEncoder.encode(t10, this);
            this.zzb = outputStream;
            long zza2 = zzw.zza();
            zzw.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzw.close();
            } catch (Throwable th2) {
                zzt.zza(th, th2);
            }
            throw th;
        }
    }

    private final <T> zzab zzj(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t10, boolean z10) {
        this.zzf.zza(fieldDescriptor, z10);
        valueEncoder.encode(t10, this.zzf);
        return this;
    }

    private static ByteBuffer zzk(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int zzl(FieldDescriptor fieldDescriptor) {
        zzz zzz = (zzz) fieldDescriptor.getProperty(zzz.class);
        if (zzz != null) {
            return zzz.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static zzz zzm(FieldDescriptor fieldDescriptor) {
        zzz zzz = (zzz) fieldDescriptor.getProperty(zzz.class);
        if (zzz != null) {
            return zzz;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final void zzn(int i10) {
        while (true) {
            int i11 = (((long) (i10 & -128)) > 0 ? 1 : (((long) (i10 & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.zzb;
            if (i11 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    private final void zzo(long j10) {
        while (true) {
            int i10 = ((-128 & j10) > 0 ? 1 : ((-128 & j10) == 0 ? 0 : -1));
            OutputStream outputStream = this.zzb;
            if (i10 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d10) {
        zzb(fieldDescriptor, d10, true);
        return this;
    }

    public final ObjectEncoderContext inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    /* access modifiers changed from: package-private */
    public final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzl(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zzb.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object zza2 : (Collection) obj) {
                zza(fieldDescriptor, zza2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry zzh2 : ((Map) obj).entrySet()) {
                zzh(zzi, fieldDescriptor, zzh2, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zzb(fieldDescriptor, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            zzc(fieldDescriptor, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            zze(fieldDescriptor, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            zzn((zzl(fieldDescriptor) << 3) | 2);
            zzn(bArr.length);
            this.zzb.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = this.zzc.get(obj.getClass());
            if (objectEncoder != null) {
                zzh(objectEncoder, fieldDescriptor, obj, z10);
                return this;
            }
            ValueEncoder valueEncoder = this.zzd.get(obj.getClass());
            if (valueEncoder != null) {
                zzj(valueEncoder, fieldDescriptor, obj, z10);
                return this;
            } else if (obj instanceof zzx) {
                zzd(fieldDescriptor, ((zzx) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzh(this.zze, fieldDescriptor, obj, z10);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzl(fieldDescriptor) << 3) | 1);
        this.zzb.write(zzk(8).putDouble(d10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ObjectEncoderContext zzc(FieldDescriptor fieldDescriptor, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzl(fieldDescriptor) << 3) | 5);
        this.zzb.write(zzk(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzab zzd(FieldDescriptor fieldDescriptor, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        zzz zzm = zzm(fieldDescriptor);
        zzy zzy = zzy.DEFAULT;
        int ordinal = zzm.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzm.zza() << 3);
            zzn(i10);
        } else if (ordinal == 1) {
            zzn(zzm.zza() << 3);
            zzn((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            zzn((zzm.zza() << 3) | 5);
            this.zzb.write(zzk(4).putInt(i10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzab zze(FieldDescriptor fieldDescriptor, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        zzz zzm = zzm(fieldDescriptor);
        zzy zzy = zzy.DEFAULT;
        int ordinal = zzm.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzm.zza() << 3);
            zzo(j10);
        } else if (ordinal == 1) {
            zzn(zzm.zza() << 3);
            zzo((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            zzn((zzm.zza() << 3) | 1);
            this.zzb.write(zzk(8).putLong(j10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzab zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = this.zzc.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new EncodingException(sb2.toString());
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f10) {
        zzc(fieldDescriptor, f10, true);
        return this;
    }

    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.of(str));
    }

    public final /* bridge */ /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i10) {
        zzd(fieldDescriptor, i10, true);
        return this;
    }

    public final /* bridge */ /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j10) {
        zze(fieldDescriptor, j10, true);
        return this;
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        zza(fieldDescriptor, obj, true);
        return this;
    }

    public final /* bridge */ /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z10) {
        zzd(fieldDescriptor, z10 ? 1 : 0, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, double d10) {
        zzb(FieldDescriptor.of(str), d10, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, int i10) {
        zzd(FieldDescriptor.of(str), i10, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, long j10) {
        zze(FieldDescriptor.of(str), j10, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, Object obj) {
        zza(FieldDescriptor.of(str), obj, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, boolean z10) {
        zzd(FieldDescriptor.of(str), z10 ? 1 : 0, true);
        return this;
    }
}
