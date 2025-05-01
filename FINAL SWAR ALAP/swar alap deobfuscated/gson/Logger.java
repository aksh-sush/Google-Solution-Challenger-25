package gson;

public abstract interface Logger
{
  public abstract LogLevel getAlertLevel();
  
  public abstract LogLevel getLogLevel();
  
  public abstract void setAlertLevel(LogLevel paramLogLevel);
  
  public abstract void setLogLevel(LogLevel paramLogLevel);
}
