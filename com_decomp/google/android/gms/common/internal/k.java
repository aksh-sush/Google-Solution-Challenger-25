package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public interface k extends IInterface {

    public static abstract class a extends zzb implements k {
        public static k c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof k ? (k) queryLocalInterface : new g2(iBinder);
        }
    }

    Account zzb();
}
