package am;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.response.Node;
import com.google.android.gms.common.server.response.PlaylistEntry;
import com.google.android.gms.internal.auth.zzbz;
import i3.g;
import i3.i;
import java.util.HashMap;
import java.util.Set;
import rx.JSONObject;

public final class ExternalMedia
  extends zzbz
{
  public static final Parcelable.Creator<g> CREATOR = new DiscreteSeekBar.CustomState.1();
  private static final HashMap pluginMap;
  private String file;
  private String fileName;
  private String mediaType;
  final Set path;
  private Matrix source;
  final int type;
  
  static
  {
    HashMap localHashMap = new HashMap();
    pluginMap = localHashMap;
    localHashMap.put("authenticatorInfo", Node.get("authenticatorInfo", 2, i.class));
    localHashMap.put("signature", Node.getValue("signature", 3));
    localHashMap.put("package", Node.getValue("package", 4));
  }
  
  ExternalMedia(Set paramSet, int paramInt, Matrix paramMatrix, String paramString1, String paramString2, String paramString3)
  {
    path = paramSet;
    type = paramInt;
    source = paramMatrix;
    file = paramString1;
    fileName = paramString2;
    mediaType = paramString3;
  }
  
  public final void addConcreteTypeInternal(Node paramNode, String paramString, PlaylistEntry paramPlaylistEntry)
  {
    int i = paramNode.get();
    if (i == 2)
    {
      source = ((Matrix)paramPlaylistEntry);
      path.add(Integer.valueOf(i));
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
        if (i != 3)
        {
          if (i == 4) {
            return fileName;
          }
          i = paramNode.get();
          paramNode = new StringBuilder();
          paramNode.append("Unknown SafeParcelable id=");
          paramNode.append(i);
          throw new IllegalStateException(paramNode.toString());
        }
        return file;
      }
      return source;
    }
    return Integer.valueOf(type);
  }
  
  protected final boolean isFieldSet(Node paramNode)
  {
    return path.contains(Integer.valueOf(paramNode.get()));
  }
  
  protected final void setStringInternal(Node paramNode, String paramString1, String paramString2)
  {
    int i = paramNode.get();
    if (i != 3)
    {
      if (i == 4) {
        fileName = paramString2;
      } else {
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
      }
    }
    else {
      file = paramString2;
    }
    path.add(Integer.valueOf(i));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = JSONObject.get(paramParcel);
    Set localSet = path;
    if (localSet.contains(Integer.valueOf(1))) {
      JSONObject.append(paramParcel, 1, type);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      JSONObject.append(paramParcel, 2, source, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      JSONObject.append(paramParcel, 3, file, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      JSONObject.append(paramParcel, 4, fileName, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      JSONObject.append(paramParcel, 5, mediaType, true);
    }
    JSONObject.get(paramParcel, i);
  }
}
