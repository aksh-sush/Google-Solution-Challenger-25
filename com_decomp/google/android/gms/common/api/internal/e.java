package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.s;

public abstract class e extends BasePendingResult implements f {
    private final a mApi;
    private final a.c mClientKey;

    protected e(a aVar, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) s.l(googleApiClient, "GoogleApiClient must not be null"));
        s.l(aVar, "Api must not be null");
        this.mClientKey = aVar.b();
        this.mApi = aVar;
    }

    private void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    public abstract void doExecute(a.b bVar);

    public final a getApi() {
        return this.mApi;
    }

    public final a.c getClientKey() {
        return this.mClientKey;
    }

    /* access modifiers changed from: protected */
    public void onSetFailedResult(h hVar) {
    }

    public final void run(a.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e10) {
            c(e10);
            throw e10;
        } catch (RemoteException e11) {
            c(e11);
        }
    }

    public final void setFailedResult(Status status) {
        s.b(!status.j0(), "Failed result must not be success");
        h createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }
}
