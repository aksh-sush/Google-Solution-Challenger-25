package a3;

import a3.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final long f17b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21f;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f22a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f23b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f24c;

        /* renamed from: d, reason: collision with root package name */
        private Long f25d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f26e;

        b() {
        }

        @Override // a3.d.a
        d a() {
            String str = "";
            if (this.f22a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f23b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f24c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f25d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f26e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f22a.longValue(), this.f23b.intValue(), this.f24c.intValue(), this.f25d.longValue(), this.f26e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a3.d.a
        d.a b(int i10) {
            this.f24c = Integer.valueOf(i10);
            return this;
        }

        @Override // a3.d.a
        d.a c(long j10) {
            this.f25d = Long.valueOf(j10);
            return this;
        }

        @Override // a3.d.a
        d.a d(int i10) {
            this.f23b = Integer.valueOf(i10);
            return this;
        }

        @Override // a3.d.a
        d.a e(int i10) {
            this.f26e = Integer.valueOf(i10);
            return this;
        }

        @Override // a3.d.a
        d.a f(long j10) {
            this.f22a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f17b = j10;
        this.f18c = i10;
        this.f19d = i11;
        this.f20e = j11;
        this.f21f = i12;
    }

    @Override // a3.d
    int b() {
        return this.f19d;
    }

    @Override // a3.d
    long c() {
        return this.f20e;
    }

    @Override // a3.d
    int d() {
        return this.f18c;
    }

    @Override // a3.d
    int e() {
        return this.f21f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17b == dVar.f() && this.f18c == dVar.d() && this.f19d == dVar.b() && this.f20e == dVar.c() && this.f21f == dVar.e();
    }

    @Override // a3.d
    long f() {
        return this.f17b;
    }

    public int hashCode() {
        long j10 = this.f17b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f18c) * 1000003) ^ this.f19d) * 1000003;
        long j11 = this.f20e;
        return this.f21f ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17b + ", loadBatchSize=" + this.f18c + ", criticalSectionEnterTimeoutMs=" + this.f19d + ", eventCleanUpAge=" + this.f20e + ", maxBlobByteSizePerRow=" + this.f21f + "}";
    }
}