package Conference;

public final class Bookmark
{
  private Float accuracy;
  private Double lat;
  private Double lon;
  private Boolean startPos;
  private Long timeStamp;
  private Integer type;
  
  public Bookmark() {}
  
  public final Float getAccuracy()
  {
    return accuracy;
  }
  
  public final Boolean getBg()
  {
    return startPos;
  }
  
  public final Double getLat()
  {
    return lat;
  }
  
  public final Double getLog()
  {
    return lon;
  }
  
  public final Long getTimeStamp()
  {
    return timeStamp;
  }
  
  public final Integer getType()
  {
    return type;
  }
  
  public final void setAccuracy(Float paramFloat)
  {
    accuracy = paramFloat;
  }
  
  public final void setBg(Boolean paramBoolean)
  {
    startPos = paramBoolean;
  }
  
  public final void setLat(Double paramDouble)
  {
    lat = paramDouble;
  }
  
  public final void setLog(Double paramDouble)
  {
    lon = paramDouble;
  }
  
  public final void setTimeStamp(Long paramLong)
  {
    timeStamp = paramLong;
  }
  
  public final void setType(Integer paramInteger)
  {
    type = paramInteger;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LocationPoint{lat=");
    localStringBuilder.append(lat);
    localStringBuilder.append(", log=");
    localStringBuilder.append(lon);
    localStringBuilder.append(", accuracy=");
    localStringBuilder.append(accuracy);
    localStringBuilder.append(", type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", bg=");
    localStringBuilder.append(startPos);
    localStringBuilder.append(", timeStamp=");
    localStringBuilder.append(timeStamp);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}
