package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import java.util.HashMap;
import java.util.Map;

class y implements BundleCache {

    /* renamed from: a  reason: collision with root package name */
    private final Map f8103a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f8104b = new HashMap();

    y() {
    }

    public BundleMetadata getBundleMetadata(String str) {
        return (BundleMetadata) this.f8103a.get(str);
    }

    public NamedQuery getNamedQuery(String str) {
        return (NamedQuery) this.f8104b.get(str);
    }

    public void saveBundleMetadata(BundleMetadata bundleMetadata) {
        this.f8103a.put(bundleMetadata.getBundleId(), bundleMetadata);
    }

    public void saveNamedQuery(NamedQuery namedQuery) {
        this.f8104b.put(namedQuery.getName(), namedQuery);
    }
}
