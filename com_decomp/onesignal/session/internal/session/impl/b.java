package com.onesignal.session.internal.session.impl;

import cb.l;
import com.onesignal.session.internal.session.d;
import db.m;
import java.util.UUID;
import l7.e;
import l7.f;
import sa.t;

public final class b implements com.onesignal.session.internal.session.b, z7.b, n7.b, e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final d _sessionModelStore;
    private final a8.a _time;
    private com.onesignal.core.internal.config.a config;
    /* access modifiers changed from: private */
    public com.onesignal.session.internal.session.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier = new com.onesignal.common.events.b();

    static final class a extends m implements l {
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.session.internal.session.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.session.internal.session.a aVar) {
            db.l.e(aVar, "it");
            com.onesignal.session.internal.session.c access$getSession$p = this.this$0.session;
            db.l.b(access$getSession$p);
            aVar.onSessionEnded(access$getSession$p.getActiveDuration());
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.b$b  reason: collision with other inner class name */
    static final class C0189b extends m implements l {
        public static final C0189b INSTANCE = new C0189b();

        C0189b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.session.internal.session.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.session.internal.session.a aVar) {
            db.l.e(aVar, "it");
            aVar.onSessionStarted();
        }
    }

    static final class c extends m implements l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.session.internal.session.a) obj);
            return t.f15300a;
        }

        public final void invoke(com.onesignal.session.internal.session.a aVar) {
            db.l.e(aVar, "it");
            aVar.onSessionActive();
        }
    }

    public b(f fVar, com.onesignal.core.internal.config.b bVar, d dVar, a8.a aVar) {
        db.l.e(fVar, "_applicationService");
        db.l.e(bVar, "_configModelStore");
        db.l.e(dVar, "_sessionModelStore");
        db.l.e(aVar, "_time");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._sessionModelStore = dVar;
        this._time = aVar;
    }

    public Object backgroundRun(va.d dVar) {
        com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "SessionService.backgroundRun()");
        com.onesignal.session.internal.session.c cVar = this.session;
        db.l.b(cVar);
        if (!cVar.isValid()) {
            return t.f15300a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SessionService: Session ended. activeDuration: ");
        com.onesignal.session.internal.session.c cVar2 = this.session;
        db.l.b(cVar2);
        sb2.append(cVar2.getActiveDuration());
        com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), (Throwable) null, 2, (Object) null);
        com.onesignal.session.internal.session.c cVar3 = this.session;
        db.l.b(cVar3);
        cVar3.setValid(false);
        this.sessionLifeCycleNotifier.fire(new a(this));
        return t.f15300a;
    }

    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    public Long getScheduleBackgroundRunIn() {
        com.onesignal.session.internal.session.c cVar = this.session;
        db.l.b(cVar);
        if (!cVar.isValid()) {
            return null;
        }
        com.onesignal.core.internal.config.a aVar = this.config;
        db.l.b(aVar);
        return Long.valueOf(aVar.getSessionFocusTimeout());
    }

    public long getStartTime() {
        com.onesignal.session.internal.session.c cVar = this.session;
        db.l.b(cVar);
        return cVar.getStartTime();
    }

    public void onFocus() {
        l lVar;
        com.onesignal.common.events.b bVar;
        com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "SessionService.onFocus()");
        com.onesignal.session.internal.session.c cVar = this.session;
        db.l.b(cVar);
        if (!cVar.isValid()) {
            com.onesignal.session.internal.session.c cVar2 = this.session;
            db.l.b(cVar2);
            String uuid = UUID.randomUUID().toString();
            db.l.d(uuid, "randomUUID().toString()");
            cVar2.setSessionId(uuid);
            com.onesignal.session.internal.session.c cVar3 = this.session;
            db.l.b(cVar3);
            cVar3.setStartTime(this._time.getCurrentTimeMillis());
            com.onesignal.session.internal.session.c cVar4 = this.session;
            db.l.b(cVar4);
            com.onesignal.session.internal.session.c cVar5 = this.session;
            db.l.b(cVar5);
            cVar4.setFocusTime(cVar5.getStartTime());
            com.onesignal.session.internal.session.c cVar6 = this.session;
            db.l.b(cVar6);
            cVar6.setActiveDuration(0);
            com.onesignal.session.internal.session.c cVar7 = this.session;
            db.l.b(cVar7);
            cVar7.setValid(true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SessionService: New session started at ");
            com.onesignal.session.internal.session.c cVar8 = this.session;
            db.l.b(cVar8);
            sb2.append(cVar8.getStartTime());
            com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), (Throwable) null, 2, (Object) null);
            bVar = this.sessionLifeCycleNotifier;
            lVar = C0189b.INSTANCE;
        } else {
            com.onesignal.session.internal.session.c cVar9 = this.session;
            db.l.b(cVar9);
            cVar9.setFocusTime(this._time.getCurrentTimeMillis());
            bVar = this.sessionLifeCycleNotifier;
            lVar = c.INSTANCE;
        }
        bVar.fire(lVar);
    }

    public void onUnfocused() {
        com.onesignal.debug.internal.logging.a.log(c8.b.DEBUG, "SessionService.onUnfocused()");
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        com.onesignal.session.internal.session.c cVar = this.session;
        db.l.b(cVar);
        long focusTime = currentTimeMillis - cVar.getFocusTime();
        com.onesignal.session.internal.session.c cVar2 = this.session;
        db.l.b(cVar2);
        cVar2.setActiveDuration(cVar2.getActiveDuration() + focusTime);
    }

    public void start() {
        this.session = (com.onesignal.session.internal.session.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    public void subscribe(com.onesignal.session.internal.session.a aVar) {
        db.l.e(aVar, "handler");
        this.sessionLifeCycleNotifier.subscribe(aVar);
    }

    public void unsubscribe(com.onesignal.session.internal.session.a aVar) {
        db.l.e(aVar, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(aVar);
    }
}
