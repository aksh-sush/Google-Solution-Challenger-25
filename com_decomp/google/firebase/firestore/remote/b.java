package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import fa.d1;
import fa.f;
import fa.r0;
import fa.s0;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

abstract class b implements Stream {
    private static final long BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS;
    private static final double BACKOFF_FACTOR = 1.5d;
    private static final long BACKOFF_INITIAL_DELAY_MS;
    private static final long BACKOFF_MAX_DELAY_MS;
    private static final long IDLE_TIMEOUT_MS;
    final ExponentialBackoff backoff;
    private f call;
    /* access modifiers changed from: private */
    public long closeCount = BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS;
    private final FirestoreChannel firestoreChannel;
    private final com.google.firebase.firestore.remote.b.b idleTimeoutRunnable;
    private AsyncQueue.DelayedTask idleTimer;
    private final AsyncQueue.TimerId idleTimerId;
    final Stream.StreamCallback listener;
    private final s0 methodDescriptor;
    private Stream.State state = Stream.State.Initial;
    /* access modifiers changed from: private */
    public final AsyncQueue workerQueue;

    class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f8184a;

        a(long j10) {
            this.f8184a = j10;
        }

        /* access modifiers changed from: package-private */
        public void a(Runnable runnable) {
            b.this.workerQueue.verifyIsCurrentThread();
            if (b.this.closeCount == this.f8184a) {
                runnable.run();
            } else {
                Logger.debug(b.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* renamed from: com.google.firebase.firestore.remote.b$b  reason: collision with other inner class name */
    class C0104b implements Runnable {
        C0104b() {
        }

        public void run() {
            b.this.d();
        }
    }

    class c implements y {

        /* renamed from: a  reason: collision with root package name */
        private final a f8187a;

        c(a aVar) {
            this.f8187a = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(d1 d1Var) {
            if (d1Var.o()) {
                Logger.debug(b.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(b.this)));
            } else {
                Logger.warn(b.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(b.this)), d1Var);
            }
            b.this.handleServerClose(d1Var);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(r0 r0Var) {
            if (Logger.isDebugEnabled()) {
                HashMap hashMap = new HashMap();
                for (String str : r0Var.i()) {
                    if (Datastore.WHITE_LISTED_HEADERS.contains(str.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(str, (String) r0Var.f(r0.g.e(str, r0.f10507d)));
                    }
                }
                if (!hashMap.isEmpty()) {
                    Logger.debug(b.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(b.this)), hashMap);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(Object obj) {
            if (Logger.isDebugEnabled()) {
                Logger.debug(b.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(b.this)), obj);
            }
            b.this.onNext(obj);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j() {
            Logger.debug(b.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(b.this)));
            b.this.f();
        }

        public void a(r0 r0Var) {
            this.f8187a.a(new f(this, r0Var));
        }

        public void b(Object obj) {
            this.f8187a.a(new e(this, obj));
        }

        public void onClose(d1 d1Var) {
            this.f8187a.a(new d(this, d1Var));
        }

        public void onOpen() {
            this.f8187a.a(new c(this));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        BACKOFF_INITIAL_DELAY_MS = timeUnit.toMillis(1);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        BACKOFF_MAX_DELAY_MS = timeUnit2.toMillis(1);
        IDLE_TIMEOUT_MS = timeUnit2.toMillis(1);
        BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS = timeUnit.toMillis(10);
    }

    b(FirestoreChannel firestoreChannel2, s0 s0Var, AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, AsyncQueue.TimerId timerId2, Stream.StreamCallback streamCallback) {
        this.firestoreChannel = firestoreChannel2;
        this.methodDescriptor = s0Var;
        this.workerQueue = asyncQueue;
        this.idleTimerId = timerId2;
        this.listener = streamCallback;
        this.idleTimeoutRunnable = new C0104b();
        this.backoff = new ExponentialBackoff(asyncQueue, timerId, BACKOFF_INITIAL_DELAY_MS, 1.5d, BACKOFF_MAX_DELAY_MS);
    }

    private void b() {
        AsyncQueue.DelayedTask delayedTask = this.idleTimer;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.idleTimer = null;
        }
    }

    private void c(Stream.State state2, d1 d1Var) {
        Assert.hardAssert(isStarted(), "Only started streams should be closed.", new Object[0]);
        Stream.State state3 = Stream.State.Error;
        Assert.hardAssert(state2 == state3 || d1Var.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        if (Datastore.isMissingSslCiphers(d1Var)) {
            Util.crashMainThread(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", d1Var.l()));
        }
        b();
        this.backoff.cancel();
        this.closeCount++;
        d1.b m10 = d1Var.m();
        if (m10 == d1.b.OK) {
            this.backoff.reset();
        } else if (m10 == d1.b.RESOURCE_EXHAUSTED) {
            Logger.debug(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.backoff.resetToMax();
        } else if (m10 == d1.b.UNAUTHENTICATED) {
            this.firestoreChannel.invalidateToken();
        } else if (m10 == d1.b.UNAVAILABLE && ((d1Var.l() instanceof UnknownHostException) || (d1Var.l() instanceof ConnectException))) {
            this.backoff.setTemporaryMaxDelay(BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS);
        }
        if (state2 != state3) {
            Logger.debug(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            tearDown();
        }
        if (this.call != null) {
            if (d1Var.o()) {
                Logger.debug(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.call.a();
            }
            this.call = null;
        }
        this.state = state2;
        this.listener.onClose(d1Var);
    }

    /* access modifiers changed from: private */
    public void d() {
        if (isOpen()) {
            c(Stream.State.Initial, d1.f10374f);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        Stream.State state2 = this.state;
        Assert.hardAssert(state2 == Stream.State.Backoff, "State should still be backoff but was %s", state2);
        this.state = Stream.State.Initial;
        start();
        Assert.hardAssert(isStarted(), "Stream should have started", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void f() {
        this.state = Stream.State.Open;
        this.listener.onOpen();
    }

    private void g() {
        Assert.hardAssert(this.state == Stream.State.Error, "Should only perform backoff in an error state", new Object[0]);
        this.state = Stream.State.Backoff;
        this.backoff.backoffAndRun(new a(this));
    }

    /* access modifiers changed from: package-private */
    public void handleServerClose(d1 d1Var) {
        Assert.hardAssert(isStarted(), "Can't handle server close on non-started stream!", new Object[0]);
        c(Stream.State.Error, d1Var);
    }

    public void inhibitBackoff() {
        Assert.hardAssert(!isStarted(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        this.state = Stream.State.Initial;
        this.backoff.reset();
    }

    public boolean isOpen() {
        this.workerQueue.verifyIsCurrentThread();
        return this.state == Stream.State.Open;
    }

    public boolean isStarted() {
        this.workerQueue.verifyIsCurrentThread();
        Stream.State state2 = this.state;
        return state2 == Stream.State.Starting || state2 == Stream.State.Open || state2 == Stream.State.Backoff;
    }

    /* access modifiers changed from: package-private */
    public void markIdle() {
        if (isOpen() && this.idleTimer == null) {
            this.idleTimer = this.workerQueue.enqueueAfterDelay(this.idleTimerId, IDLE_TIMEOUT_MS, this.idleTimeoutRunnable);
        }
    }

    public abstract void onNext(Object obj);

    public void start() {
        this.workerQueue.verifyIsCurrentThread();
        boolean z10 = true;
        Assert.hardAssert(this.call == null, "Last call still set", new Object[0]);
        Assert.hardAssert(this.idleTimer == null, "Idle timer still set", new Object[0]);
        Stream.State state2 = this.state;
        if (state2 == Stream.State.Error) {
            g();
            return;
        }
        if (state2 != Stream.State.Initial) {
            z10 = false;
        }
        Assert.hardAssert(z10, "Already started", new Object[0]);
        this.call = this.firestoreChannel.runBidiStreamingRpc(this.methodDescriptor, new c(new a(this.closeCount)));
        this.state = Stream.State.Starting;
    }

    public void stop() {
        if (isStarted()) {
            c(Stream.State.Initial, d1.f10374f);
        }
    }

    /* access modifiers changed from: protected */
    public void tearDown() {
    }

    /* access modifiers changed from: protected */
    public void writeRequest(Object obj) {
        this.workerQueue.verifyIsCurrentThread();
        Logger.debug(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        b();
        this.call.c(obj);
    }
}
