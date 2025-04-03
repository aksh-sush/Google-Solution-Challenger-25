package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f5225a;

    /* renamed from: b  reason: collision with root package name */
    private final d f5226b;

    r(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f5225a = new Messenger(iBinder);
            this.f5226b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f5226b = new d(iBinder);
            this.f5225a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f5225a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        d dVar = this.f5226b;
        if (dVar != null) {
            dVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
