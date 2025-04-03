package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = null;

    /* renamed from: e  reason: collision with root package name */
    private final String f5797e;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new a();
    }

    private Transport(String str) {
        this.f5797e = str;
    }

    public static Transport a(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.f5797e)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new a(String.format("Transport %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f5797e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5797e);
    }
}
