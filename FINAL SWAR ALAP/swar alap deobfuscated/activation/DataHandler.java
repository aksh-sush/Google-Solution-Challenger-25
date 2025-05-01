package activation;

import activity.MethodInfo;
import com.onesignal.inAppMessages.internal.Chapter;

public abstract interface DataHandler
{
  public abstract Object cleanCachedInAppMessages(MethodInfo paramMethodInfo);
  
  public abstract Object listInAppMessages(MethodInfo paramMethodInfo);
  
  public abstract Object saveInAppMessage(Chapter paramChapter, MethodInfo paramMethodInfo);
}
