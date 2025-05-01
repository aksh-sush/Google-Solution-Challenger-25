package activities;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import java.util.List;
import l4.h;
import rx.JSONObject;
import rx.RealmObject;

public final class Task
  extends RealmObject
  implements d
{
  public static final Parcelable.Creator<h> CREATOR = new DiscreteSeekBar.CustomState.1();
  private final String state;
  private final List tags;
  
  public Task(List paramList, String paramString)
  {
    tags = paramList;
    state = paramString;
  }
  
  public final Status getStatus()
  {
    if (state != null) {
      return Status.log;
    }
    return Status.value;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = JSONObject.get(paramParcel);
    JSONObject.put(paramParcel, 1, tags, false);
    JSONObject.append(paramParcel, 2, state, false);
    JSONObject.get(paramParcel, paramInt);
  }
}
