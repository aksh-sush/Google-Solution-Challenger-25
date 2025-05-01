package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;

public abstract class FieldValue {
    private static final c DELETE_INSTANCE = new c();
    private static final e SERVER_TIMESTAMP_INSTANCE = new e();

    static class a extends FieldValue {

        /* renamed from: a  reason: collision with root package name */
        private final List f7820a;

        a(List list) {
            this.f7820a = list;
        }

        /* access modifiers changed from: package-private */
        public List a() {
            return this.f7820a;
        }

        /* access modifiers changed from: package-private */
        public String getMethodName() {
            return "FieldValue.arrayRemove";
        }
    }

    static class b extends FieldValue {

        /* renamed from: a  reason: collision with root package name */
        private final List f7821a;

        b(List list) {
            this.f7821a = list;
        }

        /* access modifiers changed from: package-private */
        public List a() {
            return this.f7821a;
        }

        /* access modifiers changed from: package-private */
        public String getMethodName() {
            return "FieldValue.arrayUnion";
        }
    }

    static class c extends FieldValue {
        c() {
        }

        /* access modifiers changed from: package-private */
        public String getMethodName() {
            return "FieldValue.delete";
        }
    }

    static class d extends FieldValue {

        /* renamed from: a  reason: collision with root package name */
        private final Number f7822a;

        d(Number number) {
            this.f7822a = number;
        }

        /* access modifiers changed from: package-private */
        public Number a() {
            return this.f7822a;
        }

        /* access modifiers changed from: package-private */
        public String getMethodName() {
            return "FieldValue.increment";
        }
    }

    static class e extends FieldValue {
        e() {
        }

        /* access modifiers changed from: package-private */
        public String getMethodName() {
            return "FieldValue.serverTimestamp";
        }
    }

    FieldValue() {
    }

    public static FieldValue arrayRemove(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    public static FieldValue arrayUnion(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    public static FieldValue delete() {
        return DELETE_INSTANCE;
    }

    public static FieldValue increment(double d10) {
        return new d(Double.valueOf(d10));
    }

    public static FieldValue serverTimestamp() {
        return SERVER_TIMESTAMP_INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public abstract String getMethodName();

    public static FieldValue increment(long j10) {
        return new d(Long.valueOf(j10));
    }
}
