package activity;

import java.io.Serializable;

final class DateTimeComparator
  implements Serializable
{
  public static final c.a.a DATE_INSTANCE = new c.a.a(null);
  private final Label[] type;
  
  public DateTimeComparator(Label[] paramArrayOfLabel)
  {
    type = paramArrayOfLabel;
  }
  
  private final Object readResolve()
  {
    Label[] arrayOfLabel = type;
    Object localObject = b.b;
    int j = arrayOfLabel.length;
    int i = 0;
    while (i < j)
    {
      localObject = ((Label)localObject).b(arrayOfLabel[i]);
      i += 1;
    }
    return localObject;
  }
}
