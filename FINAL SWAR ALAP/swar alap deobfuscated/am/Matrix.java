package am;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.response.Node;
import com.google.android.gms.internal.auth.zzbz;
import i3.i;
import java.util.HashMap;
import java.util.Set;
import rx.JSONObject;

public final class Matrix
  extends zzbz
{
  public static final Parcelable.Creator<i> CREATOR = new DownloadProgressInfo.1();
  private static final HashMap m;
  final int a;
  private String b;
  private PendingIntent c;
  private int d;
  private byte[] e;
  final Set f;
  private Item name;
  
  static
  {
    HashMap localHashMap = new HashMap();
    m = localHashMap;
    localHashMap.put("accountType", Node.getValue("accountType", 2));
    localHashMap.put("status", Node.add("status", 3));
    localHashMap.put("transferBytes", Node.wrap("transferBytes", 4));
  }
  
  Matrix(Set paramSet, int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte, PendingIntent paramPendingIntent, Item paramItem)
  {
    f = paramSet;
    a = paramInt1;
    b = paramString;
    d = paramInt2;
    e = paramArrayOfByte;
    c = paramPendingIntent;
    name = paramItem;
  }
  
  protected final Object getFieldValue(Node paramNode)
  {
    int i = paramNode.get();
    if (i != 1) {
      if (i != 2) {
        if (i != 3)
        {
          if (i == 4) {
            return e;
          }
          i = paramNode.get();
          paramNode = new StringBuilder();
          paramNode.append("Unknown SafeParcelable id=");
          paramNode.append(i);
          throw new IllegalStateException(paramNode.toString());
        }
      }
    }
    for (i = d;; i = a)
    {
      return Integer.valueOf(i);
      return b;
    }
  }
  
  protected final boolean isFieldSet(Node paramNode)
  {
    return f.contains(Integer.valueOf(paramNode.get()));
  }
  
  protected final void setDecodedBytesInternal(Node paramNode, String paramString, byte[] paramArrayOfByte)
  {
    int i = paramNode.get();
    if (i == 4)
    {
      e = paramArrayOfByte;
      f.add(Integer.valueOf(i));
      return;
    }
    paramNode = new StringBuilder();
    paramNode.append("Field with id=");
    paramNode.append(i);
    paramNode.append(" is not known to be an byte array.");
    throw new IllegalArgumentException(paramNode.toString());
  }
  
  protected final void setIntegerInternal(Node paramNode, String paramString, int paramInt)
  {
    int i = paramNode.get();
    if (i == 3)
    {
      d = paramInt;
      f.add(Integer.valueOf(i));
      return;
    }
    paramNode = new StringBuilder();
    paramNode.append("Field with id=");
    paramNode.append(i);
    paramNode.append(" is not known to be an int.");
    throw new IllegalArgumentException(paramNode.toString());
  }
  
  protected final void setStringInternal(Node paramNode, String paramString1, String paramString2)
  {
    int i = paramNode.get();
    if (i == 2)
    {
      b = paramString2;
      f.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    Set localSet = f;
    if (localSet.contains(Integer.valueOf(1))) {
      JSONObject.append(paramParcel, 1, a);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      JSONObject.append(paramParcel, 2, b, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      JSONObject.append(paramParcel, 3, d);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      JSONObject.put(paramParcel, 4, e, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      JSONObject.append(paramParcel, 5, c, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      JSONObject.append(paramParcel, 6, name, paramInt, true);
    }
    JSONObject.get(paramParcel, i);
  }
}
