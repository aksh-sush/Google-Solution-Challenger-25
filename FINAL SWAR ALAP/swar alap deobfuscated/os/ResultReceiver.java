package os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import c.b;

public class ResultReceiver {
  public static final Parcelable.Creator<b> CREATOR = new AppCompatDelegateImplV7.PanelFeatureState.SavedState.1();
  final Handler mHandler = null;
  final boolean mLocal = false;
  IResultReceiver mReceiver;
  
  ResultReceiver(Parcel paramParcel)
  {
    mReceiver = IResultReceiver.Stub.asInterface(paramParcel.readStrongBinder());
  }
  
  protected void add(int paramInt, Bundle paramBundle) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (mReceiver == null) {
        mReceiver = new ResultReceiver.MyResultReceiver(this);
      }
      paramParcel.writeStrongBinder(mReceiver.asBinder());
      return;
    }
    catch (Throwable paramParcel)
    {
      throw paramParcel;
    }
  }
}
