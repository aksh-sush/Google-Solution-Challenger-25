package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    protected final k mLifecycleFragment;

    protected LifecycleCallback(k kVar) {
        this.mLifecycleFragment = kVar;
    }

    @Keep
    private static k getChimeraLifecycleFragmentImpl(j jVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static k getFragment(Activity activity) {
        return getFragment(new j(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity c10 = this.mLifecycleFragment.c();
        s.k(c10);
        return c10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static k getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static k getFragment(j jVar) {
        if (jVar.d()) {
            return k3.l(jVar.b());
        }
        if (jVar.c()) {
            return i3.f(jVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
