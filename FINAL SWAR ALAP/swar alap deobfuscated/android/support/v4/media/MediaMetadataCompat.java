package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.Context;
import androidx.collection.Label;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
  static final Label METADATA_KEYS_TYPE;
  private static final String[] PREFERRED_BITMAP_ORDER;
  private static final String[] PREFERRED_DESCRIPTION_ORDER;
  private static final String[] PREFERRED_URI_ORDER;
  final Bundle mBundle;
  
  static
  {
    Label localLabel = new Label();
    METADATA_KEYS_TYPE = localLabel;
    Integer localInteger1 = Integer.valueOf(1);
    localLabel.put("android.media.metadata.TITLE", localInteger1);
    localLabel.put("android.media.metadata.ARTIST", localInteger1);
    Integer localInteger2 = Integer.valueOf(0);
    localLabel.put("android.media.metadata.DURATION", localInteger2);
    localLabel.put("android.media.metadata.ALBUM", localInteger1);
    localLabel.put("android.media.metadata.AUTHOR", localInteger1);
    localLabel.put("android.media.metadata.WRITER", localInteger1);
    localLabel.put("android.media.metadata.COMPOSER", localInteger1);
    localLabel.put("android.media.metadata.COMPILATION", localInteger1);
    localLabel.put("android.media.metadata.DATE", localInteger1);
    localLabel.put("android.media.metadata.YEAR", localInteger2);
    localLabel.put("android.media.metadata.GENRE", localInteger1);
    localLabel.put("android.media.metadata.TRACK_NUMBER", localInteger2);
    localLabel.put("android.media.metadata.NUM_TRACKS", localInteger2);
    localLabel.put("android.media.metadata.DISC_NUMBER", localInteger2);
    localLabel.put("android.media.metadata.ALBUM_ARTIST", localInteger1);
    Integer localInteger3 = Integer.valueOf(2);
    localLabel.put("android.media.metadata.ART", localInteger3);
    localLabel.put("android.media.metadata.ART_URI", localInteger1);
    localLabel.put("android.media.metadata.ALBUM_ART", localInteger3);
    localLabel.put("android.media.metadata.ALBUM_ART_URI", localInteger1);
    Integer localInteger4 = Integer.valueOf(3);
    localLabel.put("android.media.metadata.USER_RATING", localInteger4);
    localLabel.put("android.media.metadata.RATING", localInteger4);
    localLabel.put("android.media.metadata.DISPLAY_TITLE", localInteger1);
    localLabel.put("android.media.metadata.DISPLAY_SUBTITLE", localInteger1);
    localLabel.put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger1);
    localLabel.put("android.media.metadata.DISPLAY_ICON", localInteger3);
    localLabel.put("android.media.metadata.DISPLAY_ICON_URI", localInteger1);
    localLabel.put("android.media.metadata.MEDIA_ID", localInteger1);
    localLabel.put("android.media.metadata.BT_FOLDER_TYPE", localInteger2);
    localLabel.put("android.media.metadata.MEDIA_URI", localInteger1);
    localLabel.put("android.media.metadata.ADVERTISEMENT", localInteger2);
    localLabel.put("android.media.metadata.DOWNLOAD_STATUS", localInteger2);
    PREFERRED_DESCRIPTION_ORDER = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    PREFERRED_BITMAP_ORDER = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    PREFERRED_URI_ORDER = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  MediaMetadataCompat(Parcel paramParcel)
  {
    mBundle = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(mBundle);
  }
  
  static final class a
    implements Parcelable.Creator
  {
    a() {}
    
    public MediaMetadataCompat[] a(int paramInt)
    {
      return new MediaMetadataCompat[paramInt];
    }
    
    public MediaMetadataCompat build(Parcel paramParcel)
    {
      return new MediaMetadataCompat(paramParcel);
    }
  }
}
