package Colors;

import ion.Context;

public abstract class Item
{
  public final int g;
  public final int h;
  
  public Item(int paramInt1, int paramInt2)
  {
    g = paramInt1;
    h = paramInt2;
  }
  
  public abstract void initialize(Context paramContext);
}
