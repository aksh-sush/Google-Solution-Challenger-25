package com.google.android.gms.common.internal;

import android.os.Bundle;
import q3.b;

abstract class b1 extends p1 {

    /* renamed from: d  reason: collision with root package name */
    public final int f5585d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f5586e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f5587f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected b1(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f5587f = cVar;
        this.f5585d = i10;
        this.f5586e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f5585d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.c r3 = r2.f5587f
            r3.e(r0, (android.os.IInterface) null)
            q3.b r3 = new q3.b
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.c r3 = r2.f5587f
            r3.e(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f5586e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            q3.b r3 = new q3.b
            int r0 = r2.f5585d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b1.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
