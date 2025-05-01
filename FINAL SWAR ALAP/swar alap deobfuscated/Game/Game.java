package Game;

import java.util.Iterator;
import java.util.List;
import z7.a;
import z7.b;

public final class Game
{
  private final List<a> _bootstrapServices;
  private final List<b> _startableServices;
  
  public Game(List paramList1, List paramList2)
  {
    _bootstrapServices = paramList1;
    _startableServices = paramList2;
  }
  
  public final void bootstrap()
  {
    Iterator localIterator = _bootstrapServices.iterator();
    while (localIterator.hasNext()) {
      ((Cell)localIterator.next()).bootstrap();
    }
  }
  
  public final void start()
  {
    Iterator localIterator = _startableServices.iterator();
    while (localIterator.hasNext()) {
      ((Object)localIterator.next()).start();
    }
  }
}
