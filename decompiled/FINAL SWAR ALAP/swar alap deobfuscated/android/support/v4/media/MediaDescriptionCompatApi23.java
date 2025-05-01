package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

abstract class MediaDescriptionCompatApi23
{
  public static Uri getMediaUri(Object paramObject)
  {
    return Parcel.getMediaUri((MediaDescription)paramObject);
  }
  
  abstract class Builder
  {
    public static void setMediaUri(Object paramObject, Uri paramUri)
    {
      MediaDescriptionCompat.Builder.setMediaUri((MediaDescription.Builder)paramObject, paramUri);
    }
  }
}
