package activities;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.internal.base.Frame;
import com.google.android.gms.internal.base.b;

public final class Type
  extends b
{
  Type(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.signin.internal.ISignInService");
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = a();
    localParcel.writeInt(paramInt);
    write(7, localParcel);
  }
  
  public final void a(Label paramLabel, c paramC)
  {
    Parcel localParcel = a();
    Frame.a(localParcel, paramLabel);
    Frame.get(localParcel, paramC);
    write(12, localParcel);
  }
  
  public final void a(e paramE, int paramInt, boolean paramBoolean)
  {
    Parcel localParcel = a();
    Frame.get(localParcel, paramE);
    localParcel.writeInt(paramInt);
    Frame.a(localParcel, paramBoolean);
    write(9, localParcel);
  }
}
