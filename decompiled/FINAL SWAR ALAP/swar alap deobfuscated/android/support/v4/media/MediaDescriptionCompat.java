package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  private final CharSequence mDescription;
  private Object mDescriptionObj;
  private final Bundle mExtras;
  private final Bitmap mIcon;
  private final Uri mIconUri;
  private final String mMediaId;
  private final Uri mMediaUri;
  private final CharSequence mSubtitle;
  private final CharSequence mTitle;
  
  MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    mMediaId = paramString;
    mTitle = paramCharSequence1;
    mSubtitle = paramCharSequence2;
    mDescription = paramCharSequence3;
    mIcon = paramBitmap;
    mIconUri = paramUri1;
    mExtras = paramBundle;
    mMediaUri = paramUri2;
  }
  
  public static MediaDescriptionCompat fromMediaDescription(Object paramObject)
  {
    Object localObject2 = null;
    if (paramObject != null)
    {
      int i = Build.VERSION.SDK_INT;
      b localB = new b();
      localB.setMediaId(MediaDescriptionCompatApi21.getMediaId(paramObject));
      localB.setInfo(MediaDescriptionCompatApi21.getTitle(paramObject));
      localB.setSubtitle(MediaDescriptionCompatApi21.getSubtitle(paramObject));
      localB.setDescription(MediaDescriptionCompatApi21.getDescription(paramObject));
      localB.setIconBitmap(MediaDescriptionCompatApi21.getIconBitmap(paramObject));
      localB.setIconUri(MediaDescriptionCompatApi21.getIconUri(paramObject));
      Bundle localBundle = MediaDescriptionCompatApi21.getExtras(paramObject);
      if (localBundle != null)
      {
        MediaSessionCompat.create(localBundle);
        localObject1 = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      }
      else
      {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        if ((!localBundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle.size() != 2))
        {
          localBundle.remove("android.support.v4.media.description.MEDIA_URI");
          localBundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
      }
      else {
        localObject2 = localBundle;
      }
      localB.setExtras(localObject2);
      if (localObject1 != null) {
        localB.setMediaUri((Uri)localObject1);
      } else if (i >= 23) {
        localB.setMediaUri(MediaDescriptionCompatApi23.getMediaUri(paramObject));
      }
      Object localObject1 = localB.build();
      mDescriptionObj = paramObject;
      return localObject1;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getMediaDescription()
  {
    Object localObject2 = mDescriptionObj;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject3 = MediaDescriptionCompatApi21.Builder.newInstance();
      MediaDescriptionCompatApi21.Builder.setMediaId(localObject3, mMediaId);
      MediaDescriptionCompatApi21.Builder.setTitle(localObject3, mTitle);
      MediaDescriptionCompatApi21.Builder.setSubtitle(localObject3, mSubtitle);
      MediaDescriptionCompatApi21.Builder.setDescription(localObject3, mDescription);
      MediaDescriptionCompatApi21.Builder.setIconBitmap(localObject3, mIcon);
      MediaDescriptionCompatApi21.Builder.setIconUri(localObject3, mIconUri);
      localObject2 = mExtras;
      localObject1 = localObject2;
      if (i < 23)
      {
        localObject1 = localObject2;
        if (mMediaUri != null)
        {
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = new Bundle();
            ((Bundle)localObject1).putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
          }
          ((Bundle)localObject1).putParcelable("android.support.v4.media.description.MEDIA_URI", mMediaUri);
        }
      }
      MediaDescriptionCompatApi21.Builder.setExtras(localObject3, (Bundle)localObject1);
      if (i >= 23) {
        MediaDescriptionCompatApi23.Builder.setMediaUri(localObject3, mMediaUri);
      }
      localObject1 = MediaDescriptionCompatApi21.Builder.build(localObject3);
      mDescriptionObj = localObject1;
    }
    return localObject1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mTitle);
    localStringBuilder.append(", ");
    localStringBuilder.append(mSubtitle);
    localStringBuilder.append(", ");
    localStringBuilder.append(mDescription);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    MediaDescriptionCompatApi21.writeToParcel(getMediaDescription(), paramParcel, paramInt);
  }
  
  static final class a
    implements Parcelable.Creator
  {
    a() {}
    
    public MediaDescriptionCompat[] a(int paramInt)
    {
      return new MediaDescriptionCompat[paramInt];
    }
    
    public MediaDescriptionCompat build(Parcel paramParcel)
    {
      return MediaDescriptionCompat.fromMediaDescription(MediaDescriptionCompatApi21.fromParcel(paramParcel));
    }
  }
  
  public static final class b
  {
    private CharSequence mDescription;
    private Bundle mExtras;
    private Bitmap mIcon;
    private Uri mIconUri;
    private String mMediaId;
    private Uri mMediaUri;
    private CharSequence mSubtitle;
    private CharSequence mTitle;
    
    public b() {}
    
    public MediaDescriptionCompat build()
    {
      return new MediaDescriptionCompat(mMediaId, mTitle, mSubtitle, mDescription, mIcon, mIconUri, mExtras, mMediaUri);
    }
    
    public b setDescription(CharSequence paramCharSequence)
    {
      mDescription = paramCharSequence;
      return this;
    }
    
    public b setExtras(Bundle paramBundle)
    {
      mExtras = paramBundle;
      return this;
    }
    
    public b setIconBitmap(Bitmap paramBitmap)
    {
      mIcon = paramBitmap;
      return this;
    }
    
    public b setIconUri(Uri paramUri)
    {
      mIconUri = paramUri;
      return this;
    }
    
    public b setInfo(CharSequence paramCharSequence)
    {
      mTitle = paramCharSequence;
      return this;
    }
    
    public b setMediaId(String paramString)
    {
      mMediaId = paramString;
      return this;
    }
    
    public b setMediaUri(Uri paramUri)
    {
      mMediaUri = paramUri;
      return this;
    }
    
    public b setSubtitle(CharSequence paramCharSequence)
    {
      mSubtitle = paramCharSequence;
      return this;
    }
  }
}
