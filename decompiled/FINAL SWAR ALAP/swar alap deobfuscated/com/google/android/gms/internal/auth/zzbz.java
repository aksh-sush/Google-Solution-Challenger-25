package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.PlaylistEntry;
import com.google.android.gms.common.server.response.Series;
import java.io.UnsupportedEncodingException;

public abstract class zzbz
  extends Series
{
  public zzbz() {}
  
  public final byte[] toByteArray()
  {
    try
    {
      byte[] arrayOfByte = toString().getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e("AUTH", "Error serializing object.", localUnsupportedEncodingException);
    }
    return null;
  }
}
