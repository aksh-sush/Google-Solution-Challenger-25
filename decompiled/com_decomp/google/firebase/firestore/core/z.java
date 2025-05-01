package com.google.firebase.firestore.core;

import n4.d;
import n4.i;

public final /* synthetic */ class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransactionRunner f7900a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction f7901b;

    public /* synthetic */ z(TransactionRunner transactionRunner, Transaction transaction) {
        this.f7900a = transactionRunner;
        this.f7901b = transaction;
    }

    public final void a(i iVar) {
        this.f7900a.lambda$runWithBackoff$1(this.f7901b, iVar);
    }
}
