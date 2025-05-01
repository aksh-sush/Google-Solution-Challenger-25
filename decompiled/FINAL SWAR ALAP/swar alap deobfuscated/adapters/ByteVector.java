package adapters;

import java.util.ArrayList;
import tree.c;

public abstract class ByteVector
  extends MethodWriter
{
  public ArrayList b = new ArrayList();
  
  public ByteVector() {}
  
  public void a(MethodWriter paramMethodWriter)
  {
    b.add(paramMethodWriter);
    if (paramMethodWriter.l() != null) {
      ((ByteVector)paramMethodWriter.l()).put(paramMethodWriter);
    }
    paramMethodWriter.d(this);
  }
  
  public void a(c paramC)
  {
    super.a(paramC);
    int j = b.size();
    int i = 0;
    while (i < j)
    {
      ((MethodWriter)b.get(i)).a(paramC);
      i += 1;
    }
  }
  
  public void add()
  {
    b.clear();
  }
  
  public void init()
  {
    b.clear();
    super.init();
  }
  
  public void put(MethodWriter paramMethodWriter)
  {
    b.remove(paramMethodWriter);
    paramMethodWriter.init();
  }
  
  public ArrayList read()
  {
    return b;
  }
  
  public abstract void run();
}
