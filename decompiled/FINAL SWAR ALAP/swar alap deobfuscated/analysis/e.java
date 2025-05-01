package analysis;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import model.Log;

public final class e
{
  private e() {}
  
  private final Map copy(File paramFile)
  {
    paramFile = Frame.parse(paramFile);
    if (paramFile != null)
    {
      HashMap localHashMap = new HashMap();
      Map localMap = d.d();
      Iterator localIterator = paramFile.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramFile = (String)localEntry.getKey();
        if (localMap.containsKey(localEntry.getKey()))
        {
          String str = (String)localMap.get(localEntry.getKey());
          paramFile = str;
          if (str == null) {
            return null;
          }
        }
        localHashMap.put(paramFile, localEntry.getValue());
      }
      return localHashMap;
    }
    return null;
  }
  
  public final d a(File paramFile)
  {
    Log.get(paramFile, "file");
    paramFile = copy(paramFile);
    if (paramFile == null) {
      return null;
    }
    try
    {
      paramFile = new d(paramFile, null);
      return paramFile;
    }
    catch (Exception paramFile) {}
    return null;
  }
}
