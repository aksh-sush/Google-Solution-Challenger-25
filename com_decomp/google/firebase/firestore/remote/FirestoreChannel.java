package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.firebase.firestore.BuildConfig;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import fa.d1;
import fa.f;
import fa.r0;
import fa.s0;
import fa.y;
import java.util.ArrayList;
import java.util.List;
import n4.i;
import n4.j;

public class FirestoreChannel {
    private static final r0.g RESOURCE_PREFIX_HEADER;
    private static final r0.g X_GOOG_API_CLIENT_HEADER;
    private static volatile String clientLanguage = "gl-java/";
    /* access modifiers changed from: private */
    public final AsyncQueue asyncQueue;
    private final GrpcCallProvider callProvider;
    private final CredentialsProvider credentialsProvider;
    private final GrpcMetadataProvider metadataProvider;
    private final String resourcePrefixValue;

    class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f8151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f[] f8152b;

        a(y yVar, f[] fVarArr) {
            this.f8151a = yVar;
            this.f8152b = fVarArr;
        }

        public void a(d1 d1Var, r0 r0Var) {
            try {
                this.f8151a.onClose(d1Var);
            } catch (Throwable th) {
                FirestoreChannel.this.asyncQueue.panic(th);
            }
        }

        public void b(r0 r0Var) {
            try {
                this.f8151a.a(r0Var);
            } catch (Throwable th) {
                FirestoreChannel.this.asyncQueue.panic(th);
            }
        }

        public void c(Object obj) {
            try {
                this.f8151a.b(obj);
                this.f8152b[0].b(1);
            } catch (Throwable th) {
                FirestoreChannel.this.asyncQueue.panic(th);
            }
        }

        public void d() {
        }
    }

    class b extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f[] f8154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f8155b;

        b(f[] fVarArr, i iVar) {
            this.f8154a = fVarArr;
            this.f8155b = iVar;
        }

        public void a() {
            if (this.f8154a[0] == null) {
                this.f8155b.addOnSuccessListener(FirestoreChannel.this.asyncQueue.getExecutor(), (n4.f) new q());
            } else {
                super.a();
            }
        }

        /* access modifiers changed from: protected */
        public f e() {
            Assert.hardAssert(this.f8154a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f8154a[0];
        }
    }

    class c extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f8157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f8158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f8159c;

        c(List list, f fVar, j jVar) {
            this.f8157a = list;
            this.f8158b = fVar;
            this.f8159c = jVar;
        }

        public void a(d1 d1Var, r0 r0Var) {
            if (d1Var.o()) {
                this.f8159c.c(this.f8157a);
            } else {
                this.f8159c.b(FirestoreChannel.this.exceptionFromStatus(d1Var));
            }
        }

        public void c(Object obj) {
            this.f8157a.add(obj);
            this.f8158b.b(1);
        }
    }

    class d extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f8161a;

        d(j jVar) {
            this.f8161a = jVar;
        }

        public void a(d1 d1Var, r0 r0Var) {
            if (!d1Var.o()) {
                this.f8161a.b(FirestoreChannel.this.exceptionFromStatus(d1Var));
            } else if (!this.f8161a.a().isComplete()) {
                this.f8161a.b(new FirebaseFirestoreException("Received onClose with status OK, but no message.", FirebaseFirestoreException.Code.INTERNAL));
            }
        }

        public void c(Object obj) {
            this.f8161a.c(obj);
        }
    }

    static {
        r0.d dVar = r0.f10507d;
        X_GOOG_API_CLIENT_HEADER = r0.g.e("x-goog-api-client", dVar);
        RESOURCE_PREFIX_HEADER = r0.g.e("google-cloud-resource-prefix", dVar);
    }

    FirestoreChannel(AsyncQueue asyncQueue2, Context context, CredentialsProvider credentialsProvider2, DatabaseInfo databaseInfo, GrpcMetadataProvider grpcMetadataProvider) {
        this.asyncQueue = asyncQueue2;
        this.metadataProvider = grpcMetadataProvider;
        this.credentialsProvider = credentialsProvider2;
        this.callProvider = new GrpcCallProvider(asyncQueue2, context, databaseInfo, new m(credentialsProvider2));
        DatabaseId databaseId = databaseInfo.getDatabaseId();
        this.resourcePrefixValue = String.format("projects/%s/databases/%s", new Object[]{databaseId.getProjectId(), databaseId.getDatabaseId()});
    }

    /* access modifiers changed from: private */
    public FirebaseFirestoreException exceptionFromStatus(d1 d1Var) {
        return Datastore.isMissingSslCiphers(d1Var) ? new FirebaseFirestoreException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", FirebaseFirestoreException.Code.fromValue(d1Var.m().d()), d1Var.l()) : Util.exceptionFromStatus(d1Var);
    }

    private String getGoogApiClientValue() {
        return String.format("%s fire/%s grpc/", new Object[]{clientLanguage, BuildConfig.VERSION_NAME});
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runBidiStreamingRpc$0(f[] fVarArr, y yVar, i iVar) {
        f fVar = (f) iVar.getResult();
        fVarArr[0] = fVar;
        fVar.d(new a(yVar, fVarArr), requestHeaders());
        yVar.onOpen();
        fVarArr[0].b(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runRpc$2(j jVar, Object obj, i iVar) {
        f fVar = (f) iVar.getResult();
        fVar.d(new d(jVar), requestHeaders());
        fVar.b(2);
        fVar.c(obj);
        fVar.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$runStreamingResponseRpc$1(j jVar, Object obj, i iVar) {
        f fVar = (f) iVar.getResult();
        fVar.d(new c(new ArrayList(), fVar, jVar), requestHeaders());
        fVar.b(1);
        fVar.c(obj);
        fVar.a();
    }

    private r0 requestHeaders() {
        r0 r0Var = new r0();
        r0Var.o(X_GOOG_API_CLIENT_HEADER, getGoogApiClientValue());
        r0Var.o(RESOURCE_PREFIX_HEADER, this.resourcePrefixValue);
        GrpcMetadataProvider grpcMetadataProvider = this.metadataProvider;
        if (grpcMetadataProvider != null) {
            grpcMetadataProvider.updateMetadata(r0Var);
        }
        return r0Var;
    }

    public static void setClientLanguage(String str) {
        clientLanguage = str;
    }

    public void invalidateToken() {
        this.credentialsProvider.invalidateToken();
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> f runBidiStreamingRpc(s0 s0Var, y yVar) {
        f[] fVarArr = {null};
        i createClientCall = this.callProvider.createClientCall(s0Var);
        createClientCall.addOnCompleteListener(this.asyncQueue.getExecutor(), (n4.d) new o(this, fVarArr, yVar));
        return new b(fVarArr, createClientCall);
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> i runRpc(s0 s0Var, ReqT reqt) {
        j jVar = new j();
        this.callProvider.createClientCall(s0Var).addOnCompleteListener(this.asyncQueue.getExecutor(), (n4.d) new n(this, jVar, reqt));
        return jVar.a();
    }

    /* access modifiers changed from: package-private */
    public <ReqT, RespT> i runStreamingResponseRpc(s0 s0Var, ReqT reqt) {
        j jVar = new j();
        this.callProvider.createClientCall(s0Var).addOnCompleteListener(this.asyncQueue.getExecutor(), (n4.d) new p(this, jVar, reqt));
        return jVar.a();
    }

    public void shutdown() {
        this.callProvider.shutdown();
    }
}
