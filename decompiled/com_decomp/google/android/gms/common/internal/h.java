package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import q3.d;
import q3.j;

public abstract class h extends c implements a.f, k0 {
    private static volatile Executor zaa;
    private final d zab;
    private final Set<Scope> zac;
    private final Account zad;

    protected h(Context context, Looper looper, int i10, d dVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        this(context, looper, i10, dVar, (g) bVar, (o) cVar);
    }

    private final Set f(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public final Executor getBindServiceExecutor() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final d getClientSettings() {
        return this.zab;
    }

    public d[] getRequiredFeatures() {
        return new d[0];
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected h(Context context, Looper looper, int i10, d dVar, g gVar, o oVar) {
        this(context, looper, i.a(context), j.q(), i10, dVar, (g) s.k(gVar), (o) s.k(oVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected h(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.i r13, q3.j r14, int r15, com.google.android.gms.common.internal.d r16, com.google.android.gms.common.api.internal.g r17, com.google.android.gms.common.api.internal.o r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.i0 r3 = new com.google.android.gms.common.internal.i0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.j0 r0 = new com.google.android.gms.common.internal.j0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.zab = r0
            android.accounts.Account r1 = r16.a()
            r9.zad = r1
            java.util.Set r0 = r16.d()
            java.util.Set r0 = r10.f(r0)
            r9.zac = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.h.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.i, q3.j, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.g, com.google.android.gms.common.api.internal.o):void");
    }
}
