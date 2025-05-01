package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public abstract class MediaSessionCompat
{
  public static void create(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
    }
  }
  
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    private final MediaDescriptionCompat mDescription;
    private final long mId;
    
    QueueItem(Parcel paramParcel)
    {
      mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      mId = paramParcel.readLong();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MediaSession.QueueItem {Description=");
      localStringBuilder.append(mDescription);
      localStringBuilder.append(", Id=");
      localStringBuilder.append(mId);
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      mDescription.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(mId);
    }
    
    static final class a
      implements Parcelable.Creator
    {
      a() {}
      
      public MediaSessionCompat.QueueItem[] a(int paramInt)
      {
        return new MediaSessionCompat.QueueItem[paramInt];
      }
      
      public MediaSessionCompat.QueueItem obtain(Parcel paramParcel)
      {
        return new MediaSessionCompat.QueueItem(paramParcel);
      }
    }
  }
  
  public static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    ResultReceiver mResultReceiver;
    
    ResultReceiverWrapper(Parcel paramParcel)
    {
      mResultReceiver = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      mResultReceiver.writeToParcel(paramParcel, paramInt);
    }
    
    static final class a
      implements Parcelable.Creator
    {
      a() {}
      
      public MediaSessionCompat.ResultReceiverWrapper[] a(int paramInt)
      {
        return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
      }
      
      public MediaSessionCompat.ResultReceiverWrapper readDate(Parcel paramParcel)
      {
        return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
      }
    }
  }
  
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    private c c;
    private final Object d;
    private Bundle s;
    
    Token(Object paramObject)
    {
      this(paramObject, null, null);
    }
    
    Token(Object paramObject, c paramC, Bundle paramBundle)
    {
      d = paramObject;
      c = paramC;
      s = paramBundle;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Token)) {
        return false;
      }
      Object localObject = (Token)paramObject;
      paramObject = d;
      localObject = d;
      if (paramObject == null) {
        return localObject == null;
      }
      if (localObject == null) {
        return false;
      }
      return paramObject.equals(localObject);
    }
    
    public int hashCode()
    {
      Object localObject = d;
      if (localObject == null) {
        return 0;
      }
      return localObject.hashCode();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable((Parcelable)d, paramInt);
    }
    
    static final class a
      implements Parcelable.Creator
    {
      a() {}
      
      public MediaSessionCompat.Token[] a(int paramInt)
      {
        return new MediaSessionCompat.Token[paramInt];
      }
      
      public MediaSessionCompat.Token readDate(Parcel paramParcel)
      {
        return new MediaSessionCompat.Token(paramParcel.readParcelable(null));
      }
    }
  }
}
