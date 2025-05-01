package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.j;
import java.util.HashMap;
import java.util.Map;

final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private int f8199a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8200b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f8201c = true;

    /* renamed from: d  reason: collision with root package name */
    private j f8202d = j.f8600f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8203e = false;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8204a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.firestore.core.DocumentViewChange$Type[] r0 = com.google.firebase.firestore.core.DocumentViewChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8204a = r0
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8204a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8204a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.core.DocumentViewChange$Type r1 = com.google.firebase.firestore.core.DocumentViewChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.e0.a.<clinit>():void");
        }
    }

    e0() {
    }

    /* access modifiers changed from: package-private */
    public void a(DocumentKey documentKey, DocumentViewChange.Type type) {
        this.f8201c = true;
        this.f8200b.put(documentKey, type);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f8201c = false;
        this.f8200b.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f8201c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f8203e;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f8199a != 0;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8201c = true;
        this.f8203e = true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f8199a++;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f8199a--;
    }

    /* access modifiers changed from: package-private */
    public void i(DocumentKey documentKey) {
        this.f8201c = true;
        this.f8200b.remove(documentKey);
    }

    /* access modifiers changed from: package-private */
    public TargetChange j() {
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> emptyKeySet2 = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> emptyKeySet3 = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> immutableSortedSet = emptyKeySet;
        ImmutableSortedSet<DocumentKey> immutableSortedSet2 = emptyKeySet2;
        ImmutableSortedSet<DocumentKey> immutableSortedSet3 = emptyKeySet3;
        for (Map.Entry entry : this.f8200b.entrySet()) {
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            DocumentViewChange.Type type = (DocumentViewChange.Type) entry.getValue();
            int i10 = a.f8204a[type.ordinal()];
            if (i10 == 1) {
                immutableSortedSet = immutableSortedSet.insert(documentKey);
            } else if (i10 == 2) {
                immutableSortedSet2 = immutableSortedSet2.insert(documentKey);
            } else if (i10 == 3) {
                immutableSortedSet3 = immutableSortedSet3.insert(documentKey);
            } else {
                throw Assert.fail("Encountered invalid change type: %s", type);
            }
        }
        return new TargetChange(this.f8202d, this.f8203e, immutableSortedSet, immutableSortedSet2, immutableSortedSet3);
    }

    /* access modifiers changed from: package-private */
    public void k(j jVar) {
        if (!jVar.isEmpty()) {
            this.f8201c = true;
            this.f8202d = jVar;
        }
    }
}
