package com.google.firebase.firestore.core;

import n4.d;
import n4.i;

public final /* synthetic */ class a0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransactionRunner f7847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f7848b;

    public /* synthetic */ a0(TransactionRunner transactionRunner, i iVar) {
        this.f7847a = transactionRunner;
        this.f7848b = iVar;
    }

    public final void a(i iVar) {
        this.f7847a.lambda$runWithBackoff$0(this.f7848b, iVar);
    }
}
