package adapter;

public final class Milestone
{
  private final int androidId;
  private final long createdAt;
  private final String fullData;
  private final String message;
  private final String number;
  private final String title;
  
  public Milestone(int paramInt, String paramString1, String paramString2, long paramLong, String paramString3, String paramString4)
  {
    androidId = paramInt;
    number = paramString1;
    fullData = paramString2;
    createdAt = paramLong;
    title = paramString3;
    message = paramString4;
  }
  
  public final int getAndroidId()
  {
    return androidId;
  }
  
  public final long getCreatedAt()
  {
    return createdAt;
  }
  
  public final String getFullData()
  {
    return fullData;
  }
  
  public final String getId()
  {
    return number;
  }
  
  public final String getMessage()
  {
    return message;
  }
  
  public final String getTitle()
  {
    return title;
  }
}
