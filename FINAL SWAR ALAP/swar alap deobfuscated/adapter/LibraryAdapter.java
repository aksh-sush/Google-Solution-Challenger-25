package adapter;

import activity.MethodInfo;
import java.util.List;

public abstract interface LibraryAdapter
{
  public abstract Object clearOldestOverLimitFallback(int paramInt1, int paramInt2, MethodInfo paramMethodInfo);
  
  public abstract Object createNotification(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, int paramInt, String paramString4, String paramString5, long paramLong, String paramString6, MethodInfo paramMethodInfo);
  
  public abstract Object createSummaryNotification(int paramInt, String paramString, MethodInfo paramMethodInfo);
  
  public abstract Object deleteExpiredNotifications(MethodInfo paramMethodInfo);
  
  public abstract Object doesNotificationExist(String paramString, MethodInfo paramMethodInfo);
  
  public abstract Object getAndroidIdForGroup(String paramString, boolean paramBoolean, MethodInfo paramMethodInfo);
  
  public abstract Object getAndroidIdFromCollapseKey(String paramString, MethodInfo paramMethodInfo);
  
  public abstract Object getGroupId(int paramInt, MethodInfo paramMethodInfo);
  
  public abstract Object listNotificationsForGroup(String paramString, MethodInfo paramMethodInfo);
  
  public abstract Object listNotificationsForOutstanding(List paramList, MethodInfo paramMethodInfo);
  
  public abstract Object markAsConsumed(int paramInt, boolean paramBoolean1, String paramString, boolean paramBoolean2, MethodInfo paramMethodInfo);
  
  public abstract Object markAsDismissed(int paramInt, MethodInfo paramMethodInfo);
  
  public abstract Object markAsDismissedForGroup(String paramString, MethodInfo paramMethodInfo);
  
  public abstract Object markAsDismissedForOutstanding(MethodInfo paramMethodInfo);
}
