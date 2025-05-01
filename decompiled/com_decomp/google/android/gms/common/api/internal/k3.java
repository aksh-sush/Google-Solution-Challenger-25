package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class k3 extends Fragment implements k {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap f5427h = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f5428e = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f5429f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Bundle f5430g;

    public static k3 l(e eVar) {
        k3 k3Var;
        WeakHashMap weakHashMap = f5427h;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (k3Var = (k3) weakReference.get()) != null) {
            return k3Var;
        }
        try {
            k3 k3Var2 = (k3) eVar.getSupportFragmentManager().i0("SupportLifecycleFragmentImpl");
            if (k3Var2 == null || k3Var2.isRemoving()) {
                k3Var2 = new k3();
                eVar.getSupportFragmentManager().m().d(k3Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(k3Var2));
            return k3Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5428e.containsKey(str)) {
            this.f5428e.put(str, lifecycleCallback);
            if (this.f5429f > 0) {
                new zzi(Looper.getMainLooper()).post(new j3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f5428e.get(str));
    }

    public final /* synthetic */ Activity c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f5428e.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f5428e.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5429f = 1;
        this.f5430g = bundle;
        for (Map.Entry entry : this.f5428e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5429f = 5;
        for (LifecycleCallback onDestroy : this.f5428e.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5429f = 3;
        for (LifecycleCallback onResume : this.f5428e.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f5428e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5429f = 2;
        for (LifecycleCallback onStart : this.f5428e.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5429f = 4;
        for (LifecycleCallback onStop : this.f5428e.values()) {
            onStop.onStop();
        }
    }
}
