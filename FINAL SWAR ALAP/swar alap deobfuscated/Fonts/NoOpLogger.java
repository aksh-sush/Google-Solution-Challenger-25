package Fonts;

import com.onesignal.debug.internal.logging.class_7;
import gson.LogLevel;
import gson.Logger;
import model.Log;

public final class NoOpLogger
  implements Logger
{
  public NoOpLogger()
  {
    setLogLevel(LogLevel.WARN);
    setAlertLevel(LogLevel.NONE);
  }
  
  public LogLevel getAlertLevel()
  {
    return class_7.getVisualLogLevel();
  }
  
  public LogLevel getLogLevel()
  {
    return class_7.getLogLevel();
  }
  
  public void setAlertLevel(LogLevel paramLogLevel)
  {
    Log.get(paramLogLevel, "value");
    class_7.setVisualLogLevel(paramLogLevel);
  }
  
  public void setLogLevel(LogLevel paramLogLevel)
  {
    Log.get(paramLogLevel, "value");
    class_7.setLogLevel(paramLogLevel);
  }
}
