package com.onesignal.core.activities;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int[] f9271e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity f9272f;

    public /* synthetic */ a(int[] iArr, PermissionsActivity permissionsActivity) {
        this.f9271e = iArr;
        this.f9272f = permissionsActivity;
    }

    public final void run() {
        PermissionsActivity.m0onRequestPermissionsResult$lambda0(this.f9271e, this.f9272f);
    }
}
