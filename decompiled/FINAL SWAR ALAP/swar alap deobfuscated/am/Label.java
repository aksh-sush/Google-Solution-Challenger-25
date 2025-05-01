package am;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.collection.Context;
import com.google.android.gms.common.server.response.Node;
import com.google.android.gms.internal.auth.zzbz;
import i3.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rx.JSONObject;

public final class Label
  extends zzbz
{
  public static final Parcelable.Creator<e> CREATOR = new VerticalProgressBar.SavedState.1();
  private static final androidx.collection.Label i;
  private List a;
  final int b;
  private List c;
  private List d;
  private List e;
  private List f;
  
  static
  {
    androidx.collection.Label localLabel = new androidx.collection.Label();
    i = localLabel;
    localLabel.put("registered", Node.get("registered", 2));
    localLabel.put("in_progress", Node.get("in_progress", 3));
    localLabel.put("success", Node.get("success", 4));
    localLabel.put("failed", Node.get("failed", 5));
    localLabel.put("escrowed", Node.get("escrowed", 6));
  }
  
  Label(int paramInt, List paramList1, List paramList2, List paramList3, List paramList4, List paramList5)
  {
    b = paramInt;
    f = paramList1;
    e = paramList2;
    a = paramList3;
    c = paramList4;
    d = paramList5;
  }
  
  public final Map getFieldMappings()
  {
    return i;
  }
  
  protected final Object getFieldValue(Node paramNode)
  {
    switch (paramNode.get())
    {
    default: 
      int j = paramNode.get();
      paramNode = new StringBuilder();
      paramNode.append("Unknown SafeParcelable id=");
      paramNode.append(j);
      throw new IllegalStateException(paramNode.toString());
    case 6: 
      return d;
    case 5: 
      return c;
    case 4: 
      return a;
    case 3: 
      return e;
    case 2: 
      return f;
    }
    return Integer.valueOf(b);
  }
  
  protected final boolean isFieldSet(Node paramNode)
  {
    return true;
  }
  
  protected final void setStringsInternal(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    int j = paramNode.get();
    if (j != 2)
    {
      if (j != 3)
      {
        if (j != 4)
        {
          if (j != 5)
          {
            if (j == 6)
            {
              d = paramArrayList;
              return;
            }
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[] { Integer.valueOf(j) }));
          }
          c = paramArrayList;
          return;
        }
        a = paramArrayList;
        return;
      }
      e = paramArrayList;
      return;
    }
    f = paramArrayList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = JSONObject.get(paramParcel);
    JSONObject.append(paramParcel, 1, b);
    JSONObject.put(paramParcel, 2, f, false);
    JSONObject.put(paramParcel, 3, e, false);
    JSONObject.put(paramParcel, 4, a, false);
    JSONObject.put(paramParcel, 5, c, false);
    JSONObject.put(paramParcel, 6, d, false);
    JSONObject.get(paramParcel, paramInt);
  }
}
