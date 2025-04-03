package com.onesignal.session.internal.session.impl;

import com.onesignal.user.internal.operations.m;
import com.onesignal.user.internal.operations.n;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import sa.t;
import v7.e;
import va.d;
import z7.b;

public final class a implements b, com.onesignal.session.internal.session.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final e _operationRepo;
    /* access modifiers changed from: private */
    public final u9.b _outcomeEventsController;
    private final com.onesignal.session.internal.session.b _sessionService;

    /* renamed from: com.onesignal.session.internal.session.impl.a$a  reason: collision with other inner class name */
    static final class C0188a extends l implements cb.l {
        final /* synthetic */ long $durationInSeconds;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0188a(a aVar, long j10, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
            this.$durationInSeconds = j10;
        }

        public final d create(d dVar) {
            return new C0188a(this.this$0, this.$durationInSeconds, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                u9.b access$get_outcomeEventsController$p = this.this$0._outcomeEventsController;
                long j10 = this.$durationInSeconds;
                this.label = 1;
                if (access$get_outcomeEventsController$p.sendSessionEndOutcomeEvent(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((C0188a) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(e eVar, com.onesignal.session.internal.session.b bVar, com.onesignal.core.internal.config.b bVar2, com.onesignal.user.internal.identity.b bVar3, u9.b bVar4) {
        db.l.e(eVar, "_operationRepo");
        db.l.e(bVar, "_sessionService");
        db.l.e(bVar2, "_configModelStore");
        db.l.e(bVar3, "_identityModelStore");
        db.l.e(bVar4, "_outcomeEventsController");
        this._operationRepo = eVar;
        this._sessionService = bVar;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this._outcomeEventsController = bVar4;
    }

    public void onSessionActive() {
    }

    public void onSessionEnded(long j10) {
        long j11 = j10 / ((long) 1000);
        e.a.enqueue$default(this._operationRepo, new m(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((com.onesignal.user.internal.identity.a) this._identityModelStore.getModel()).getOnesignalId(), j11), false, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0188a(this, j11, (d) null), 1, (Object) null);
    }

    public void onSessionStarted() {
        e.a.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((com.onesignal.user.internal.identity.a) this._identityModelStore.getModel()).getOnesignalId()), false, 2, (Object) null);
    }

    public void start() {
        this._sessionService.subscribe(this);
    }
}
