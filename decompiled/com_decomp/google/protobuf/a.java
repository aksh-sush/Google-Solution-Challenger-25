package com.google.protobuf;

import com.google.protobuf.j;
import com.google.protobuf.t0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class a implements t0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0110a implements t0.a {

        /* renamed from: com.google.protobuf.a$a$a  reason: collision with other inner class name */
        static final class C0111a extends FilterInputStream {

            /* renamed from: e  reason: collision with root package name */
            private int f8527e;

            C0111a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f8527e = i10;
            }

            public int available() {
                return Math.min(super.available(), this.f8527e);
            }

            public int read() {
                if (this.f8527e <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f8527e--;
                }
                return read;
            }

            public long skip(long j10) {
                long skip = super.skip(Math.min(j10, (long) this.f8527e));
                if (skip >= 0) {
                    this.f8527e = (int) (((long) this.f8527e) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f8527e;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f8527e -= read;
                }
                return read;
            }
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll(iterable, (List) collection);
        }

        private static void b(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        private String c(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static s1 newUninitializedMessageException(t0 t0Var) {
            return new s1(t0Var);
        }

        /* access modifiers changed from: protected */
        public abstract C0110a internalMergeFrom(a aVar);

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, r.b());
        }

        public C0110a mergeFrom(j jVar) {
            try {
                k z10 = jVar.z();
                mergeFrom(z10);
                z10.a(0);
                return this;
            } catch (d0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(c("ByteString"), e11);
            }
        }

        public abstract C0110a mergeFrom(k kVar, r rVar);

        public abstract C0110a mergeFrom(byte[] bArr, int i10, int i11);

        public abstract C0110a mergeFrom(byte[] bArr, int i10, int i11, r rVar);

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            c0.a(iterable);
            if (iterable instanceof i0) {
                List R = ((i0) iterable).R();
                i0 i0Var = (i0) list;
                int size = list.size();
                for (Object next : R) {
                    if (next == null) {
                        String str = "Element at index " + (i0Var.size() - size) + " is null.";
                        for (int size2 = i0Var.size() - 1; size2 >= size; size2--) {
                            i0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof j) {
                        i0Var.n((j) next);
                    } else {
                        i0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof e1) {
                list.addAll((Collection) iterable);
            } else {
                b(iterable, list);
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, r rVar) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0111a(inputStream, k.x(read, inputStream)), rVar);
            return true;
        }

        public C0110a mergeFrom(j jVar, r rVar) {
            try {
                k z10 = jVar.z();
                mergeFrom(z10, rVar);
                z10.a(0);
                return this;
            } catch (d0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(c("ByteString"), e11);
            }
        }

        public C0110a mergeFrom(k kVar) {
            return mergeFrom(kVar, r.b());
        }

        public C0110a mergeFrom(t0 t0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(t0Var)) {
                return internalMergeFrom((a) t0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public C0110a mergeFrom(InputStream inputStream) {
            k f10 = k.f(inputStream);
            mergeFrom(f10);
            f10.a(0);
            return this;
        }

        public C0110a mergeFrom(InputStream inputStream, r rVar) {
            k f10 = k.f(inputStream);
            mergeFrom(f10, rVar);
            f10.a(0);
            return this;
        }

        public C0110a mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public C0110a mergeFrom(byte[] bArr, r rVar) {
            return mergeFrom(bArr, 0, bArr.length, rVar);
        }
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C0110a.addAll(iterable, (List) collection);
    }

    private String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    protected static void checkByteStringIsUtf8(j jVar) {
        if (!jVar.w()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int getMemoizedSerializedSize();

    /* access modifiers changed from: package-private */
    public int getSerializedSize(l1 l1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int h10 = l1Var.h(this);
        setMemoizedSerializedSize(h10);
        return h10;
    }

    /* access modifiers changed from: package-private */
    public s1 newUninitializedMessageException() {
        return new s1(this);
    }

    /* access modifiers changed from: package-private */
    public abstract void setMemoizedSerializedSize(int i10);

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            m e02 = m.e0(bArr);
            writeTo(e02);
            e02.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(b("byte array"), e10);
        }
    }

    public j toByteString() {
        try {
            j.h y10 = j.y(getSerializedSize());
            writeTo(y10.b());
            return y10.a();
        } catch (IOException e10) {
            throw new RuntimeException(b("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        m d02 = m.d0(outputStream, m.G(m.I(serializedSize) + serializedSize));
        d02.K0(serializedSize);
        writeTo(d02);
        d02.a0();
    }

    public void writeTo(OutputStream outputStream) {
        m d02 = m.d0(outputStream, m.G(getSerializedSize()));
        writeTo(d02);
        d02.a0();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C0110a.addAll(iterable, list);
    }
}
