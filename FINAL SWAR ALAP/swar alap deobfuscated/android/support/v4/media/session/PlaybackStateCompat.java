package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  final long mActions;
  final long mActiveItemId;
  final long mBufferedPosition;
  List mCustomActions;
  final CharSequence mErrorMessage;
  final Bundle mExtras;
  final long mPosition;
  final float mSpeed;
  final int mState;
  final int mType;
  final long mUpdateTime;
  
  PlaybackStateCompat(Parcel paramParcel)
  {
    mType = paramParcel.readInt();
    mPosition = paramParcel.readLong();
    mSpeed = paramParcel.readFloat();
    mUpdateTime = paramParcel.readLong();
    mBufferedPosition = paramParcel.readLong();
    mActions = paramParcel.readLong();
    mErrorMessage = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mCustomActions = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    mActiveItemId = paramParcel.readLong();
    mExtras = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    mState = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=");
    localStringBuilder.append(mType);
    localStringBuilder.append(", position=");
    localStringBuilder.append(mPosition);
    localStringBuilder.append(", buffered position=");
    localStringBuilder.append(mBufferedPosition);
    localStringBuilder.append(", speed=");
    localStringBuilder.append(mSpeed);
    localStringBuilder.append(", updated=");
    localStringBuilder.append(mUpdateTime);
    localStringBuilder.append(", actions=");
    localStringBuilder.append(mActions);
    localStringBuilder.append(", error code=");
    localStringBuilder.append(mState);
    localStringBuilder.append(", error message=");
    localStringBuilder.append(mErrorMessage);
    localStringBuilder.append(", custom actions=");
    localStringBuilder.append(mCustomActions);
    localStringBuilder.append(", active item id=");
    localStringBuilder.append(mActiveItemId);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mType);
    paramParcel.writeLong(mPosition);
    paramParcel.writeFloat(mSpeed);
    paramParcel.writeLong(mUpdateTime);
    paramParcel.writeLong(mBufferedPosition);
    paramParcel.writeLong(mActions);
    TextUtils.writeToParcel(mErrorMessage, paramParcel, paramInt);
    paramParcel.writeTypedList(mCustomActions);
    paramParcel.writeLong(mActiveItemId);
    paramParcel.writeBundle(mExtras);
    paramParcel.writeInt(mState);
  }
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    private final String mAction;
    private final Bundle mExtras;
    private final int mIcon;
    private final CharSequence mName;
    
    CustomAction(Parcel paramParcel)
    {
      mAction = paramParcel.readString();
      mName = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      mIcon = paramParcel.readInt();
      mExtras = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Action:mName='");
      localStringBuilder.append(mName);
      localStringBuilder.append(", mIcon=");
      localStringBuilder.append(mIcon);
      localStringBuilder.append(", mExtras=");
      localStringBuilder.append(mExtras);
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(mAction);
      TextUtils.writeToParcel(mName, paramParcel, paramInt);
      paramParcel.writeInt(mIcon);
      paramParcel.writeBundle(mExtras);
    }
    
    static final class a
      implements Parcelable.Creator
    {
      a() {}
      
      public PlaybackStateCompat.CustomAction[] a(int paramInt)
      {
        return new PlaybackStateCompat.CustomAction[paramInt];
      }
      
      public PlaybackStateCompat.CustomAction build(Parcel paramParcel)
      {
        return new PlaybackStateCompat.CustomAction(paramParcel);
      }
    }
  }
  
  static final class a
    implements Parcelable.Creator
  {
    a() {}
    
    public PlaybackStateCompat[] a(int paramInt)
    {
      return new PlaybackStateCompat[paramInt];
    }
    
    public PlaybackStateCompat build(Parcel paramParcel)
    {
      return new PlaybackStateCompat(paramParcel);
    }
  }
}
