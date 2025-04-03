package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class k implements FirebaseAppLifecycleListener, FirebaseFirestore.InstanceRegistry {

    /* renamed from: a  reason: collision with root package name */
    private final Map f7916a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseApp f7917b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7918c;

    /* renamed from: d  reason: collision with root package name */
    private final Deferred f7919d;

    /* renamed from: e  reason: collision with root package name */
    private final GrpcMetadataProvider f7920e;

    k(Context context, FirebaseApp firebaseApp, Deferred deferred, GrpcMetadataProvider grpcMetadataProvider) {
        this.f7918c = context;
        this.f7917b = firebaseApp;
        this.f7919d = deferred;
        this.f7920e = grpcMetadataProvider;
        firebaseApp.addLifecycleEventListener(this);
    }

    /* access modifiers changed from: package-private */
    public synchronized FirebaseFirestore a(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = (FirebaseFirestore) this.f7916a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.newInstance(this.f7918c, this.f7917b, this.f7919d, str, this, this.f7920e);
            this.f7916a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }

    public synchronized void onDeleted(String str, FirebaseOptions firebaseOptions) {
        Iterator it = new ArrayList(this.f7916a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).terminate();
            Assert.hardAssert(!this.f7916a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    public synchronized void remove(String str) {
        this.f7916a.remove(str);
    }
}
