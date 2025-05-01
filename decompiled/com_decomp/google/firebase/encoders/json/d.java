package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

final class d implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a  reason: collision with root package name */
    private d f7812a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7813b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f7814c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f7815d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f7816e;

    /* renamed from: f  reason: collision with root package name */
    private final ObjectEncoder f7817f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7818g;

    private d(d dVar) {
        this.f7814c = dVar.f7814c;
        this.f7815d = dVar.f7815d;
        this.f7816e = dVar.f7816e;
        this.f7817f = dVar.f7817f;
        this.f7818g = dVar.f7818g;
    }

    private boolean n(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private d q(String str, Object obj) {
        s();
        this.f7814c.name(str);
        if (obj != null) {
            return e(obj, false);
        }
        this.f7814c.nullValue();
        return this;
    }

    private d r(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        s();
        this.f7814c.name(str);
        return e(obj, false);
    }

    private void s() {
        if (this.f7813b) {
            d dVar = this.f7812a;
            if (dVar != null) {
                dVar.s();
                this.f7812a.f7813b = false;
                this.f7812a = null;
                this.f7814c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public d add(double d10) {
        s();
        this.f7814c.value(d10);
        return this;
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d10) {
        return add(fieldDescriptor.getName(), d10);
    }

    /* renamed from: b */
    public d add(float f10) {
        s();
        this.f7814c.value((double) f10);
        return this;
    }

    /* renamed from: c */
    public d add(int i10) {
        s();
        this.f7814c.value((long) i10);
        return this;
    }

    /* renamed from: d */
    public d add(long j10) {
        s();
        this.f7814c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public d e(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && n(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f7814c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f7814c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.f7814c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    this.f7814c.value((long) iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    add(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f7814c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f7814c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number e10 : (Number[]) obj) {
                    e(e10, false);
                }
            } else {
                for (Object e11 : (Object[]) obj) {
                    e(e11, false);
                }
            }
            this.f7814c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f7814c.beginArray();
            for (Object e12 : (Collection) obj) {
                e(e12, false);
            }
            this.f7814c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f7814c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e13) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e13);
                }
            }
            this.f7814c.endObject();
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f7815d.get(obj.getClass());
            if (objectEncoder != null) {
                return p(objectEncoder, obj, z10);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f7816e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return p(this.f7817f, obj, z10);
            } else {
                add(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: f */
    public d add(String str) {
        s();
        this.f7814c.value(str);
        return this;
    }

    /* renamed from: g */
    public d add(String str, double d10) {
        s();
        this.f7814c.name(str);
        return add(d10);
    }

    /* renamed from: h */
    public d add(String str, int i10) {
        s();
        this.f7814c.name(str);
        return add(i10);
    }

    /* renamed from: i */
    public d add(String str, long j10) {
        s();
        this.f7814c.name(str);
        return add(j10);
    }

    public ObjectEncoderContext inline(Object obj) {
        return e(obj, true);
    }

    /* renamed from: j */
    public d add(String str, Object obj) {
        return this.f7818g ? r(str, obj) : q(str, obj);
    }

    /* renamed from: k */
    public d add(String str, boolean z10) {
        s();
        this.f7814c.name(str);
        return add(z10);
    }

    /* renamed from: l */
    public d add(boolean z10) {
        s();
        this.f7814c.value(z10);
        return this;
    }

    /* renamed from: m */
    public d add(byte[] bArr) {
        s();
        if (bArr == null) {
            this.f7814c.nullValue();
        } else {
            this.f7814c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        return nested(fieldDescriptor.getName());
    }

    /* access modifiers changed from: package-private */
    public void o() {
        s();
        this.f7814c.flush();
    }

    /* access modifiers changed from: package-private */
    public d p(ObjectEncoder objectEncoder, Object obj, boolean z10) {
        if (!z10) {
            this.f7814c.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z10) {
            this.f7814c.endObject();
        }
        return this;
    }

    d(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z10) {
        this.f7814c = new JsonWriter(writer);
        this.f7815d = map;
        this.f7816e = map2;
        this.f7817f = objectEncoder;
        this.f7818g = z10;
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f10) {
        return add(fieldDescriptor.getName(), (double) f10);
    }

    public ObjectEncoderContext nested(String str) {
        s();
        this.f7812a = new d(this);
        this.f7814c.name(str);
        this.f7814c.beginObject();
        return this.f7812a;
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i10) {
        return add(fieldDescriptor.getName(), i10);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j10) {
        return add(fieldDescriptor.getName(), j10);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        return add(fieldDescriptor.getName(), obj);
    }

    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z10) {
        return add(fieldDescriptor.getName(), z10);
    }
}
