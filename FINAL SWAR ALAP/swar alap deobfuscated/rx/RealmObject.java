package rx;

public abstract class RealmObject
  implements Object
{
  public RealmObject() {}
  
  public final int describeContents()
  {
    return 0;
  }
}
