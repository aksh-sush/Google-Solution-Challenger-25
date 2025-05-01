package analysis;

import java.util.Arrays;
import model.Log;
import widgets.ClassWriter;
import y1.f.a;

public enum f
{
  public final String b()
  {
    int i = a.a.d[ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return "app_event_pred";
      }
      throw new ClassWriter();
    }
    return "integrity_detect";
  }
  
  public final String c()
  {
    int i = a.a.d[ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return "MTML_APP_EVENT_PRED";
      }
      throw new ClassWriter();
    }
    return "MTML_INTEGRITY_DETECT";
  }
}
