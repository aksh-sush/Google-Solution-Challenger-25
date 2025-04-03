package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final /* synthetic */ class d implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LibraryVersionComponent.VersionExtractor f8499b;

    public /* synthetic */ d(String str, LibraryVersionComponent.VersionExtractor versionExtractor) {
        this.f8498a = str;
        this.f8499b = versionExtractor;
    }

    public final Object create(ComponentContainer componentContainer) {
        return c.a(this.f8498a, this.f8499b.extract((Context) componentContainer.get(Context.class)));
    }
}
