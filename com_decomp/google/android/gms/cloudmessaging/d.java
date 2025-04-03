package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f5200e;

    public static final class a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class loadClass(String str, boolean z10) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z10);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return d.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return d.class;
        }
    }

    public d(IBinder iBinder) {
        this.f5200e = new Messenger(iBinder);
    }

    private final IBinder a() {
        Messenger messenger = this.f5200e;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f5200e;
        messenger.getClass();
        messenger.send(message);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((d) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f5200e;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
