package activities;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Item;
import l4.j;
import rx.JSONObject;
import rx.RealmObject;

public final class Label
  extends RealmObject
{
  public static final Parcelable.Creator<j> CREATOR = new DownloadProgressInfo.1();
  final Item name;
  final int position;
  
  Label(int paramInt, Item paramItem)
  {
    position = paramInt;
    name = paramItem;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    JSONObject.append(paramParcel, 1, position);
    JSONObject.append(paramParcel, 2, name, paramInt, false);
    JSONObject.get(paramParcel, i);
  }
}
