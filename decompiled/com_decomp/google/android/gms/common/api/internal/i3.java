package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class i3 extends Fragment implements k {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap f5410h = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f5411e = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f5412f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Bundle f5413g;

    public static i3 f(Activity activity) {
        i3 i3Var;
        WeakHashMap weakHashMap = f5410h;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (i3Var = (i3) weakReference.get()) != null) {
            return i3Var;
        }
        try {
            i3 i3Var2 = (i3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i3Var2 == null || i3Var2.isRemoving()) {
                i3Var2 = new i3();
                activity.getFragmentManager().beginTransaction().add(i3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i3Var2));
            return i3Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5411e.containsKey(str)) {
            this.f5411e.put(str, lifecycleCallback);
            if (this.f5412f > 0) {
                new zzi(Looper.getMainLooper()).post(new h3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f5411e.get(str));
    }

    public final Activity c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f5411e.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f5411e.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5412f = 1;
        this.f5413g = bundle;
        for (Map.Entry entry : this.f5411e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5412f = 5;
        for (LifecycleCallback onDestroy : this.f5411e.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5412f = 3;
        for (LifecycleCallback onResume : this.f5411e.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f5411e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5412f = 2;
        for (LifecycleCallback onStart : this.f5411e.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5412f = 4;
        for (LifecycleCallback onStop : this.f5411e.values()) {
            onStop.onStop();
        }
    }
}
