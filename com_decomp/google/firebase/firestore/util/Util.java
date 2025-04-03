package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.j;
import fa.d1;
import fa.e1;
import fa.f1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import n4.i;

public class Util {
    private static final String AUTO_ID_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int AUTO_ID_LENGTH = 20;
    private static final Comparator COMPARABLE_COMPARATOR = new a();
    private static final n4.a VOID_ERROR_TRANSFORMER = new s();
    private static final Random rand = new SecureRandom();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static String autoId() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 20; i10++) {
            sb2.append(AUTO_ID_ALPHABET.charAt(rand.nextInt(62)));
        }
        return sb2.toString();
    }

    public static List<Object> collectUpdateArguments(int i10, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            Collections.addAll(arrayList, objArr);
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Object obj3 = arrayList.get(i11);
                if ((obj3 instanceof String) || (obj3 instanceof FieldPath)) {
                    i11 += 2;
                } else {
                    throw new IllegalArgumentException("Excepted field name at argument position " + (i11 + i10 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
    }

    public static <T extends Comparable<T>> Comparator<T> comparator() {
        return COMPARABLE_COMPARATOR;
    }

    public static int compareBooleans(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static int compareByteStrings(j jVar, j jVar2) {
        int min = Math.min(jVar.size(), jVar2.size());
        for (int i10 = 0; i10 < min; i10++) {
            byte f10 = jVar.f(i10) & 255;
            byte f11 = jVar2.f(i10) & 255;
            if (f10 < f11) {
                return -1;
            }
            if (f10 > f11) {
                return 1;
            }
        }
        return compareIntegers(jVar.size(), jVar2.size());
    }

    public static int compareDoubles(double d10, double d11) {
        return k5.a.c(d10, d11);
    }

    public static int compareIntegers(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int compareLongs(long j10, long j11) {
        return k5.a.a(j10, j11);
    }

    public static int compareMixed(double d10, long j10) {
        return k5.a.b(d10, j10);
    }

    private static Exception convertStatusException(Exception exc) {
        d1 a10;
        if (exc instanceof e1) {
            a10 = ((e1) exc).a();
        } else if (!(exc instanceof f1)) {
            return exc;
        } else {
            a10 = ((f1) exc).a();
        }
        return exceptionFromStatus(a10);
    }

    public static Exception convertThrowableToException(Throwable th) {
        return th instanceof Exception ? convertStatusException((Exception) th) : new Exception(th);
    }

    public static void crashMainThread(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new r(runtimeException));
    }

    public static FirebaseFirestoreException exceptionFromStatus(d1 d1Var) {
        e1 c10 = d1Var.c();
        return new FirebaseFirestoreException(c10.getMessage(), FirebaseFirestoreException.Code.fromValue(d1Var.m().d()), c10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$crashMainThread$1(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0(i iVar) {
        if (iVar.isSuccessful()) {
            return (Void) iVar.getResult();
        }
        Exception convertStatusException = convertStatusException(iVar.getException());
        if (convertStatusException instanceof FirebaseFirestoreException) {
            throw convertStatusException;
        }
        throw new FirebaseFirestoreException(convertStatusException.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, convertStatusException);
    }

    public static String toDebugString(j jVar) {
        int size = jVar.size();
        StringBuilder sb2 = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            byte f10 = jVar.f(i10) & 255;
            sb2.append(Character.forDigit(f10 >>> 4, 16));
            sb2.append(Character.forDigit(f10 & 15, 16));
        }
        return sb2.toString();
    }

    public static String typeName(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static n4.a voidErrorTransformer() {
        return VOID_ERROR_TRANSFORMER;
    }
}
