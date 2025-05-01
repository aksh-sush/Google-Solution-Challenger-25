package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import model.Log;

public final class Label
  implements Parcelable
{
  public static final Parcelable.Creator<e> CREATOR = new AppCompatDelegateImplV7.PanelFeatureState.SavedState.1();
  public static final Path i = new Path(null);
  private final int a;
  private final int b;
  private final IntentSender c;
  private final Intent f;
  
  public Label(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2)
  {
    c = paramIntentSender;
    f = paramIntent;
    a = paramInt1;
    b = paramInt2;
  }
  
  public Label(Parcel paramParcel)
  {
    this((IntentSender)localParcelable, (Intent)paramParcel.readParcelable(Intent.class.getClassLoader()), paramParcel.readInt(), paramParcel.readInt());
  }
  
  public final Intent a()
  {
    return f;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final int c()
  {
    return a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final IntentSender getName()
  {
    return c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Log.get(paramParcel, "dest");
    paramParcel.writeParcelable(c, paramInt);
    paramParcel.writeParcelable(f, paramInt);
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
  }
}
