package analysis;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import model.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import terminal.Constants;
import terminal.DateFormat;
import ui.List;

public final class Frame
{
  public static final Frame h = new Frame();
  
  private Frame() {}
  
  public static final File getCacheDir()
  {
    File localFile = new File(com.facebook.Context.getContext().getFilesDir(), "facebook_ml/");
    if (!localFile.exists())
    {
      if (localFile.mkdirs()) {
        return localFile;
      }
      return null;
    }
    return localFile;
  }
  
  public static final Map parse(File paramFile)
  {
    Log.get(paramFile, "file");
    try
    {
      paramFile = new FileInputStream(paramFile);
      int i1 = paramFile.available();
      Object localObject1 = new DataInputStream(paramFile);
      paramFile = new byte[i1];
      ((DataInputStream)localObject1).readFully(paramFile);
      ((InputStream)localObject1).close();
      if (i1 < 4) {
        return null;
      }
      localObject1 = ByteBuffer.wrap(paramFile, 0, 4);
      Object localObject2 = ByteOrder.LITTLE_ENDIAN;
      ((ByteBuffer)localObject1).order((ByteOrder)localObject2);
      int i = ((ByteBuffer)localObject1).getInt();
      int k = i + 4;
      if (i1 < k) {
        return null;
      }
      localObject1 = Constants.type;
      localObject1 = new String(paramFile, 4, i, (Charset)localObject1);
      localObject1 = new JSONObject((String)localObject1);
      Object localObject3 = ((JSONObject)localObject1).names();
      int i2 = ((JSONArray)localObject3).length();
      localObject2 = new String[i2];
      int m = i2 - 1;
      String str;
      if (m >= 0) {
        for (i = 0;; i = j)
        {
          j = i + 1;
          str = ((JSONArray)localObject3).getString(i);
          localObject2[i] = str;
          if (j > m) {
            break;
          }
        }
      }
      List.add((Object[])localObject2);
      localObject3 = new HashMap();
      int j = 0;
      i = k;
      while (j < i2)
      {
        str = localObject2[j];
        m = j + 1;
        if (str == null)
        {
          j = m;
        }
        else
        {
          Object localObject5 = ((JSONObject)localObject1).getJSONArray(str);
          j = ((JSONArray)localObject5).length();
          Object localObject4 = new int[j];
          int i3 = j - 1;
          j = 1;
          int n = 1;
          if (i3 >= 0)
          {
            k = 0;
            j = n;
            for (;;)
            {
              n = k + 1;
              int i4 = ((JSONArray)localObject5).getInt(k);
              localObject4[k] = i4;
              j *= i4;
              if (n > i3) {
                break;
              }
              k = n;
            }
          }
          n = j * 4;
          k = i + n;
          if (k > i1) {
            return null;
          }
          localObject5 = ByteBuffer.wrap(paramFile, i, n);
          ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
          ((ByteBuffer)localObject5).order(localByteOrder);
          localObject4 = new Item((int[])localObject4);
          ((ByteBuffer)localObject5).asFloatBuffer().get(((Item)localObject4).get(), 0, j);
          ((Map)localObject3).put(str, localObject4);
          i = k;
          j = m;
        }
      }
      return localObject3;
    }
    catch (Exception paramFile) {}
    return null;
  }
  
  public final int[] a(String paramString, int paramInt)
  {
    Log.get(paramString, "texts");
    int[] arrayOfInt = new int[paramInt];
    paramString = get(paramString);
    Charset localCharset = Charset.forName("UTF-8");
    Log.append(localCharset, "forName(\"UTF-8\")");
    if (paramString != null)
    {
      paramString = paramString.getBytes(localCharset);
      Log.append(paramString, "(this as java.lang.String).getBytes(charset)");
      if (paramInt > 0)
      {
        int j;
        for (int i = 0;; i = j)
        {
          j = i + 1;
          if (i < paramString.length) {
            paramString[i] &= 0xFF;
          } else {
            arrayOfInt[i] = 0;
          }
          if (j >= paramInt) {
            return arrayOfInt;
          }
        }
      }
      return arrayOfInt;
    }
    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
  }
  
  public final String get(String paramString)
  {
    Log.get(paramString, "str");
    int i = paramString.length() - 1;
    int j = 0;
    int k = 0;
    while (j <= i)
    {
      int m;
      if (k == 0) {
        m = j;
      } else {
        m = i;
      }
      if (Log.append(paramString.charAt(m), 32) <= 0) {
        m = 1;
      } else {
        m = 0;
      }
      if (k == 0)
      {
        if (m == 0) {
          k = 1;
        } else {
          j += 1;
        }
      }
      else
      {
        if (m == 0) {
          break;
        }
        i -= 1;
      }
    }
    paramString = paramString.subSequence(j, i + 1).toString();
    paramString = new DateFormat("\\s+").parse(paramString, 0).toArray(new String[0]);
    if (paramString != null)
    {
      paramString = TextUtils.join(" ", (String[])paramString);
      Log.append(paramString, "join(\" \", strArray)");
      return paramString;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
}
