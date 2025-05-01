package adapters;

import tree.ClassWriter;

public abstract class w
{
  static boolean[] b = new boolean[3];
  
  static void a(f paramF, ClassWriter paramClassWriter, MethodWriter paramMethodWriter)
  {
    type = -1;
    state = -1;
    Object localObject = t[0];
    c localC = c.c;
    int i;
    int j;
    if ((localObject != localC) && (t[0] == c.d))
    {
      i = b.r;
      j = paramF.get() - c.r;
      localObject = b;
      i = paramClassWriter.a(localObject);
      localObject = c;
      i = paramClassWriter.a(localObject);
      paramClassWriter.a(b.i, i);
      paramClassWriter.a(c.i, j);
      type = 2;
      paramMethodWriter.visitTableSwitchInsn(i, j);
    }
    if ((t[1] != localC) && (t[1] == c.d))
    {
      i = j.r;
      j = paramF.getValue() - a.r;
      paramF = j;
      paramF.i = paramClassWriter.a(paramF);
      paramF = a;
      paramF.i = paramClassWriter.a(paramF);
      paramClassWriter.a(j.i, i);
      paramClassWriter.a(a.i, j);
      if ((q > 0) || (paramMethodWriter.iterator() == 8))
      {
        paramF = d;
        paramF.i = paramClassWriter.a(paramF);
        paramClassWriter.a(d.i, q + i);
      }
      state = 2;
      paramMethodWriter.visitFrame(i, j);
    }
  }
  
  public static final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) == paramInt2;
  }
}
