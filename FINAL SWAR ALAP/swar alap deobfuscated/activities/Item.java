package activities;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import l4.b;
import rx.JSONObject;
import rx.RealmObject;

public final class Item
  extends RealmObject
  implements d
{
  public static final Parcelable.Creator<b> CREATOR = new VerticalProgressBar.SavedState.1();
  final int a;
  private Intent b;
  private int c;
  
  Item(int paramInt1, int paramInt2, Intent paramIntent)
  {
    a = paramInt1;
    c = paramInt2;
    b = paramIntent;
  }
  
  public final Status getStatus()
  {
    if (c == 0) {
      return Status.log;
    }
    return Status.value;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    JSONObject.append(paramParcel, 1, a);
    JSONObject.append(paramParcel, 2, c);
    JSONObject.append(paramParcel, 3, b, paramInt, false);
    JSONObject.get(paramParcel, i);
  }
}
