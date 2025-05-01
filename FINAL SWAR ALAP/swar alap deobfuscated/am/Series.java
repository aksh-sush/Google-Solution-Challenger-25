package am;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.response.Node;
import com.google.android.gms.common.server.response.PlaylistEntry;
import com.google.android.gms.internal.auth.zzbz;
import i3.b;
import i3.e;
import i3.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import rx.JSONObject;

public final class Series
  extends zzbz
{
  public static final Parcelable.Creator<b> CREATOR = new AutoParcel_DirectoryChooserConfig.1();
  private static final HashMap notify;
  private ArrayList a;
  private int b;
  private Label c;
  final int e;
  final Set f;
  
  static
  {
    HashMap localHashMap = new HashMap();
    notify = localHashMap;
    localHashMap.put("authenticatorData", Node.wrap("authenticatorData", 2, g.class));
    localHashMap.put("progress", Node.get("progress", 4, e.class));
  }
  
  Series(Set paramSet, int paramInt1, ArrayList paramArrayList, int paramInt2, Label paramLabel)
  {
    f = paramSet;
    e = paramInt1;
    a = paramArrayList;
    b = paramInt2;
    c = paramLabel;
  }
  
  public final void addConcreteTypeArrayInternal(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    int i = paramNode.get();
    if (i == 2)
    {
      a = paramArrayList;
      f.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[] { Integer.valueOf(i), paramArrayList.getClass().getCanonicalName() }));
  }
  
  public final void addConcreteTypeInternal(Node paramNode, String paramString, PlaylistEntry paramPlaylistEntry)
  {
    int i = paramNode.get();
    if (i == 4)
    {
      c = ((Label)paramPlaylistEntry);
      f.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] { Integer.valueOf(i), paramPlaylistEntry.getClass().getCanonicalName() }));
  }
  
  protected final Object getFieldValue(Node paramNode)
  {
    int i = paramNode.get();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 4) {
          return c;
        }
        i = paramNode.get();
        paramNode = new StringBuilder();
        paramNode.append("Unknown SafeParcelable id=");
        paramNode.append(i);
        throw new IllegalStateException(paramNode.toString());
      }
      return a;
    }
    return Integer.valueOf(e);
  }
  
  protected final boolean isFieldSet(Node paramNode)
  {
    return f.contains(Integer.valueOf(paramNode.get()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    Set localSet = f;
    if (localSet.contains(Integer.valueOf(1))) {
      JSONObject.append(paramParcel, 1, e);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      JSONObject.add(paramParcel, 2, a, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      JSONObject.append(paramParcel, 3, b);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      JSONObject.append(paramParcel, 4, c, paramInt, true);
    }
    JSONObject.get(paramParcel, i);
  }
}
