package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
  private final int mRatingStyle;
  private final float mRatingValue;
  
  RatingCompat(int paramInt, float paramFloat)
  {
    mRatingStyle = paramInt;
    mRatingValue = paramFloat;
  }
  
  public int describeContents()
  {
    return mRatingStyle;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Rating:style=");
    localStringBuilder.append(mRatingStyle);
    localStringBuilder.append(" rating=");
    float f = mRatingValue;
    String str;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mRatingStyle);
    paramParcel.writeFloat(mRatingValue);
  }
  
  static final class a
    implements Parcelable.Creator
  {
    a() {}
    
    public RatingCompat a(Parcel paramParcel)
    {
      return new RatingCompat(paramParcel.readInt(), paramParcel.readFloat());
    }
    
    public RatingCompat[] a(int paramInt)
    {
      return new RatingCompat[paramInt];
    }
  }
}
