package am;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import i3.a;
import rx.JSONObject;
import rx.RealmObject;

public class Item
  extends RealmObject
{
  public static final Parcelable.Creator<a> CREATOR = new Point.1();
  private final boolean b;
  private long h;
  private boolean tags;
  final int text;
  
  Item(int paramInt, boolean paramBoolean1, long paramLong, boolean paramBoolean2)
  {
    text = paramInt;
    tags = paramBoolean1;
    h = paramLong;
    b = paramBoolean2;
  }
  
  public boolean a()
  {
    return b;
  }
  
  public boolean getTags()
  {
    return tags;
  }
  
  public long getTitle()
  {
    return h;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = JSONObject.get(paramParcel);
    JSONObject.append(paramParcel, 1, text);
    JSONObject.append(paramParcel, 2, getTags());
    JSONObject.put(paramParcel, 3, getTitle());
    JSONObject.append(paramParcel, 4, a());
    JSONObject.get(paramParcel, paramInt);
  }
}
