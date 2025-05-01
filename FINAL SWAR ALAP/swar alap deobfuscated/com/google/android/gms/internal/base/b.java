package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b
  implements IInterface
{
  private final String a;
  private final IBinder mRemote;
  
  protected b(IBinder paramIBinder, String paramString)
  {
    mRemote = paramIBinder;
    a = paramString;
  }
  
  protected final Parcel a()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(a);
    return localParcel;
  }
  
  protected final void a(int paramInt, Parcel paramParcel)
  {
    try
    {
      mRemote.transact(1, paramParcel, null, 1);
      paramParcel.recycle();
      return;
    }
    catch (Throwable localThrowable)
    {
      paramParcel.recycle();
      throw localThrowable;
    }
  }
  
  public final IBinder asBinder()
  {
    return mRemote;
  }
  
  protected final Parcel close(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      mRemote.transact(2, paramParcel, localParcel, 0);
      localParcel.readException();
      paramParcel.recycle();
      return localParcel;
    }
    catch (Throwable localThrowable) {}catch (RuntimeException localRuntimeException)
    {
      localThrowable.recycle();
      throw localRuntimeException;
    }
    paramParcel.recycle();
    throw localThrowable;
  }
  
  protected final void write(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      mRemote.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      paramParcel.recycle();
      localParcel.recycle();
      return;
    }
    catch (Throwable localThrowable)
    {
      paramParcel.recycle();
      localParcel.recycle();
      throw localThrowable;
    }
  }
}
