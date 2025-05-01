package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f12929a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f12930b;

    /* renamed from: c, reason: collision with root package name */
    private int f12931c;

    private final void b() {
        Object[] objArr = this.f12929a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        ta.i.d(objArr, objArr2, 0, this.f12930b, 0, 10, null);
        Object[] objArr3 = this.f12929a;
        int length2 = objArr3.length;
        int i10 = this.f12930b;
        ta.i.d(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f12929a = objArr2;
        this.f12930b = 0;
        this.f12931c = length;
    }

    public final void a(Object obj) {
        Object[] objArr = this.f12929a;
        int i10 = this.f12931c;
        objArr[i10] = obj;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f12931c = length;
        if (length == this.f12930b) {
            b();
        }
    }

    public final boolean c() {
        return this.f12930b == this.f12931c;
    }

    public final Object d() {
        int i10 = this.f12930b;
        if (i10 == this.f12931c) {
            return null;
        }
        Object[] objArr = this.f12929a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f12930b = (i10 + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}