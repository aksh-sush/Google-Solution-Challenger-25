package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f8540a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f8541b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f8542c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f8543d;

    /* renamed from: e  reason: collision with root package name */
    public static final k f8544e;

    public interface a extends i {
        a a(int i10);
    }

    public interface b extends i {
        b a(int i10);
    }

    public interface c {
        int getNumber();
    }

    public interface d {
        c a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i {
        f a(int i10);
    }

    public interface g extends i {
        g a(int i10);
    }

    public interface h extends i {
        h a(int i10);
    }

    public interface i extends List, RandomAccess {
        boolean T();

        i a(int i10);

        void c();
    }

    static {
        byte[] bArr = new byte[0];
        f8542c = bArr;
        f8543d = ByteBuffer.wrap(bArr);
        f8544e = k.j(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return y1.s(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((t0) obj).toBuilder().mergeFrom((t0) obj2).buildPartial();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f8540a);
    }
}
