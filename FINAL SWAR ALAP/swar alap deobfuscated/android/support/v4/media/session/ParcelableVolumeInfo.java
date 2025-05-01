package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
  public int audioStream;
  public int controlType;
  public int currentVolume;
  public int maxVolume;
  public int volumeType;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    controlType = paramParcel.readInt();
    maxVolume = paramParcel.readInt();
    currentVolume = paramParcel.readInt();
    volumeType = paramParcel.readInt();
    audioStream = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(controlType);
    paramParcel.writeInt(maxVolume);
    paramParcel.writeInt(currentVolume);
    paramParcel.writeInt(volumeType);
    paramParcel.writeInt(audioStream);
  }
  
  static final class a
    implements Parcelable.Creator
  {
    a() {}
    
    public ParcelableVolumeInfo[] a(int paramInt)
    {
      return new ParcelableVolumeInfo[paramInt];
    }
    
    public ParcelableVolumeInfo readDate(Parcel paramParcel)
    {
      return new ParcelableVolumeInfo(paramParcel);
    }
  }
}
