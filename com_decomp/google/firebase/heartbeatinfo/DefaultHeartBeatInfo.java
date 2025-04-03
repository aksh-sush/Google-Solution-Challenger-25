package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.i;
import n4.l;

public class DefaultHeartBeatInfo implements HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = new d();
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private Provider<h> storageProvider;

    private DefaultHeartBeatInfo(Context context, Set<HeartBeatConsumer> set) {
        this(new Lazy(new c(context)), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY));
    }

    public static Component<HeartBeatInfo> component() {
        return Component.builder(HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.setOf(HeartBeatConsumer.class)).factory(new e()).build();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ HeartBeatInfo lambda$component$4(ComponentContainer componentContainer) {
        return new DefaultHeartBeatInfo((Context) componentContainer.get(Context.class), componentContainer.setOf(HeartBeatConsumer.class));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getAndClearStoredHeartBeatInfo$2() {
        ArrayList arrayList = new ArrayList();
        h hVar = this.storageProvider.get();
        List<SdkHeartBeatResult> e10 = hVar.e(true);
        long d10 = hVar.d();
        for (SdkHeartBeatResult sdkHeartBeatResult : e10) {
            boolean f10 = h.f(d10, sdkHeartBeatResult.getMillis());
            HeartBeatInfo.HeartBeat heartBeat = f10 ? HeartBeatInfo.HeartBeat.COMBINED : HeartBeatInfo.HeartBeat.SDK;
            if (f10) {
                d10 = sdkHeartBeatResult.getMillis();
            }
            arrayList.add(HeartBeatResult.create(sdkHeartBeatResult.getSdkName(), sdkHeartBeatResult.getMillis(), heartBeat));
        }
        if (d10 > 0) {
            hVar.j(d10);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$storeHeartBeatInfo$3(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.storageProvider.get().h(str, currentTimeMillis)) {
            return null;
        }
        this.storageProvider.get().i(str, currentTimeMillis);
        return null;
    }

    public i getAndClearStoredHeartBeatInfo() {
        return l.c(this.backgroundExecutor, new g(this));
    }

    public HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean h10 = this.storageProvider.get().h(str, currentTimeMillis);
        boolean g10 = this.storageProvider.get().g(currentTimeMillis);
        return (!h10 || !g10) ? g10 ? HeartBeatInfo.HeartBeat.GLOBAL : h10 ? HeartBeatInfo.HeartBeat.SDK : HeartBeatInfo.HeartBeat.NONE : HeartBeatInfo.HeartBeat.COMBINED;
    }

    public i storeHeartBeatInfo(String str) {
        return this.consumers.size() <= 0 ? l.e((Object) null) : l.c(this.backgroundExecutor, new f(this, str));
    }

    DefaultHeartBeatInfo(Provider<h> provider, Set<HeartBeatConsumer> set, Executor executor) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
    }
}
