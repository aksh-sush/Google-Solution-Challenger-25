package androidplot;

import adapters.MethodWriter;
import adapters.f;
import java.util.ArrayList;
import java.util.Iterator;
import tree.ClassWriter;

public class i
{
  static int x;
  ArrayList a = null;
  int b;
  private int k = -1;
  int l;
  ArrayList q = new ArrayList();
  boolean s = false;
  
  public i(int paramInt)
  {
    int i = x;
    x = i + 1;
    b = i;
    l = paramInt;
  }
  
  private int a(ClassWriter paramClassWriter, ArrayList paramArrayList, int paramInt)
  {
    int j = 0;
    f localF = (f)((MethodWriter)paramArrayList.get(0)).l();
    paramClassWriter.b();
    localF.a(paramClassWriter, false);
    int i = 0;
    while (i < paramArrayList.size())
    {
      ((MethodWriter)paramArrayList.get(i)).a(paramClassWriter, false);
      i += 1;
    }
    if ((paramInt == 0) && (p > 0)) {
      adapters.a.a(localF, paramClassWriter, paramArrayList, 0);
    }
    if ((paramInt == 1) && (q > 0)) {
      adapters.a.a(localF, paramClassWriter, paramArrayList, 1);
    }
    try
    {
      paramClassWriter.accept();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    a = new ArrayList();
    i = j;
    while (i < paramArrayList.size())
    {
      a localA = new a(this, (MethodWriter)paramArrayList.get(i), paramClassWriter, paramInt);
      a.add(localA);
      i += 1;
    }
    if (paramInt == 0) {
      paramInt = paramClassWriter.b(b);
    }
    for (paramArrayList = c;; paramArrayList = a)
    {
      i = paramClassWriter.b(paramArrayList);
      paramClassWriter.b();
      return i - paramInt;
      paramInt = paramClassWriter.b(j);
    }
  }
  
  private String getItem()
  {
    int i = l;
    if (i == 0) {
      return "Horizontal";
    }
    if (i == 1) {
      return "Vertical";
    }
    if (i == 2) {
      return "Both";
    }
    return "Unknown";
  }
  
  public int a(ClassWriter paramClassWriter, int paramInt)
  {
    if (q.size() == 0) {
      return 0;
    }
    return a(paramClassWriter, q, paramInt);
  }
  
  public void a(int paramInt)
  {
    l = paramInt;
  }
  
  public void a(int paramInt, i paramI)
  {
    Iterator localIterator = q.iterator();
    while (localIterator.hasNext())
    {
      MethodWriter localMethodWriter = (MethodWriter)localIterator.next();
      paramI.a(localMethodWriter);
      int i = paramI.b();
      if (paramInt == 0) {
        S = i;
      } else {
        o = i;
      }
    }
    k = b;
  }
  
  public void a(ArrayList paramArrayList)
  {
    int j = q.size();
    if ((k != -1) && (j > 0))
    {
      int i = 0;
      while (i < paramArrayList.size())
      {
        i localI = (i)paramArrayList.get(i);
        if (k == b) {
          a(l, localI);
        }
        i += 1;
      }
    }
    if (j == 0) {
      paramArrayList.remove(this);
    }
  }
  
  public boolean a(MethodWriter paramMethodWriter)
  {
    if (q.contains(paramMethodWriter)) {
      return false;
    }
    q.add(paramMethodWriter);
    return true;
  }
  
  public int b()
  {
    return b;
  }
  
  public void g(boolean paramBoolean)
  {
    s = paramBoolean;
  }
  
  public int i()
  {
    return l;
  }
  
  public String toString()
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(getItem());
    ((StringBuilder)localObject1).append(" [");
    ((StringBuilder)localObject1).append(b);
    ((StringBuilder)localObject1).append("] <");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = q.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      MethodWriter localMethodWriter = (MethodWriter)((Iterator)localObject2).next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" ");
      localStringBuilder.append(localMethodWriter.getString());
      localObject1 = localStringBuilder.toString();
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" >");
    return ((StringBuilder)localObject2).toString();
  }
}
