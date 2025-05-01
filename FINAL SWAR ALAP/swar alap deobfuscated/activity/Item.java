package activity;

import astuetz.MethodVisitor;

public abstract class Item
  implements Object
{
  private final Context name;
  
  public Item(Context paramContext)
  {
    name = paramContext;
  }
  
  public Object a(Context paramContext)
  {
    return g.b.a.getValue(this, paramContext);
  }
  
  public java.lang.Object a(java.lang.Object paramObject, MethodVisitor paramMethodVisitor)
  {
    return g.b.a.a(this, paramObject, paramMethodVisitor);
  }
  
  public Label b(Context paramContext)
  {
    return g.b.a.a(this, paramContext);
  }
  
  public Label b(Label paramLabel)
  {
    return g.b.a.a(this, paramLabel);
  }
  
  public Context getKey()
  {
    return name;
  }
}
