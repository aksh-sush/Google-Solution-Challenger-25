package activities;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Label;

import java.awt.Point;

import l4.l;
import module.Item;
import rx.JSONObject;
import rx.RealmObject;

public final class f
  extends RealmObject
{
  public static final Parcelable.Creator<l> CREATOR = new Point.1();
  private final Item a;
  private final Label b;
  final int e;
  
  f(int paramInt, Item paramItem, Label paramLabel)
  {
    e = paramInt;
    a = paramItem;
    b = paramLabel;
  }
  
  public final Item a()
  {
    return a;
  }
  
  public final Label c()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    JSONObject.append(paramParcel, 1, e);
    JSONObject.append(paramParcel, 2, a, paramInt, false);
    JSONObject.append(paramParcel, 3, b, paramInt, false);
    JSONObject.get(paramParcel, i);
  }
}
