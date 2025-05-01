package androidplot;

import adapters.ByteVector;
import adapters.Handle;
import adapters.MethodWriter;
import adapters.XYPlot;
import adapters.c;
import adapters.f;
import adapters.i;
import adapters.l;
import adapters.w;
import java.util.ArrayList;

public class g
{
  private ClassWriter a = new ClassWriter();
  private f b;
  private final ArrayList c = new ArrayList();
  
  public g(f paramF)
  {
    b = paramF;
  }
  
  private void a(f paramF)
  {
    int n = b.size();
    boolean bool = paramF.b(64);
    d localD = paramF.a();
    int k = 0;
    while (k < n)
    {
      MethodWriter localMethodWriter = (MethodWriter)b.get(k);
      if ((!(localMethodWriter instanceof i)) && (!(localMethodWriter instanceof adapters.h)) && (!localMethodWriter.indexOf()))
      {
        if (bool)
        {
          localObject1 = l;
          if (localObject1 != null)
          {
            localObject2 = f;
            if ((localObject2 != null) && (d.b) && (d.b)) {
              break label356;
            }
          }
        }
        Object localObject1 = localMethodWriter.f(0);
        int m = 1;
        Object localObject2 = localMethodWriter.f(1);
        c localC = c.a;
        int i;
        if ((localObject1 == localC) && (h != 1) && (localObject2 == localC) && (i != 1)) {
          i = 1;
        } else {
          i = 0;
        }
        int j = i;
        if (i == 0)
        {
          j = i;
          if (paramF.b(1))
          {
            j = i;
            if (!(localMethodWriter instanceof XYPlot))
            {
              j = i;
              if (localObject1 == localC)
              {
                j = i;
                if (h == 0)
                {
                  j = i;
                  if (localObject2 != localC)
                  {
                    j = i;
                    if (!localMethodWriter.f()) {
                      j = 1;
                    }
                  }
                }
              }
              i = j;
              if (localObject2 == localC)
              {
                i = j;
                if (i == 0)
                {
                  i = j;
                  if (localObject1 != localC)
                  {
                    i = j;
                    if (!localMethodWriter.f()) {
                      i = 1;
                    }
                  }
                }
              }
              if (localObject1 != localC)
              {
                j = i;
                if (localObject2 != localC) {}
              }
              else
              {
                j = i;
                if (n > 0.0F) {
                  j = m;
                }
              }
            }
          }
        }
        if (j == 0) {
          a(localD, localMethodWriter, ClassWriter.j);
        }
      }
      label356:
      k += 1;
    }
    localD.a();
  }
  
  private void a(f paramF, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramF.intValue();
    int j = paramF.width();
    paramF.put(0);
    paramF.visitLocalVariable(0);
    paramF.append(paramInt2);
    paramF.get(paramInt3);
    paramF.put(i);
    paramF.visitLocalVariable(j);
    b.e(paramInt1);
    b.run();
  }
  
  private boolean a(d paramD, MethodWriter paramMethodWriter, int paramInt)
  {
    a.c = paramMethodWriter.charAt();
    a.b = paramMethodWriter.isEmpty();
    a.i = paramMethodWriter.get();
    a.f = paramMethodWriter.getValue();
    ClassWriter localClassWriter = a;
    o = false;
    k = paramInt;
    c localC1 = c;
    c localC2 = c.a;
    int i;
    if (localC1 == localC2) {
      i = 1;
    } else {
      i = 0;
    }
    if (b == localC2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((i != 0) && (n > 0.0F)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramInt != 0) && (n > 0.0F)) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((i != 0) && (H[0] == 4)) {
      c = c.b;
    }
    if ((paramInt != 0) && (H[1] == 4)) {
      b = c.b;
    }
    paramD.a(paramMethodWriter, localClassWriter);
    paramMethodWriter.append(a.d);
    paramMethodWriter.get(a.a);
    paramMethodWriter.put(a.e);
    paramMethodWriter.visitFieldInsn(a.q);
    paramD = a;
    k = ClassWriter.j;
    return o;
  }
  
  public long a(f paramF, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    d localD = paramF.a();
    paramInt9 = b.size();
    int k = paramF.get();
    int m = paramF.getValue();
    boolean bool = w.a(paramInt1, 128);
    if ((!bool) && (!w.a(paramInt1, 64))) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    paramInt3 = paramInt1;
    Object localObject1;
    Object localObject2;
    if (paramInt1 != 0)
    {
      paramInt2 = 0;
      for (;;)
      {
        paramInt3 = paramInt1;
        if (paramInt2 >= paramInt9) {
          break;
        }
        localObject1 = (MethodWriter)b.get(paramInt2);
        localObject2 = ((MethodWriter)localObject1).charAt();
        c localC = c.a;
        if (localObject2 == localC) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if (((MethodWriter)localObject1).isEmpty() == localC) {
          paramInt8 = 1;
        } else {
          paramInt8 = 0;
        }
        if ((paramInt3 != 0) && (paramInt8 != 0) && (((MethodWriter)localObject1).doubleValue() > 0.0F)) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if ((((MethodWriter)localObject1).f()) && (paramInt3 != 0)) {}
        while (((((MethodWriter)localObject1).equals()) && (paramInt3 != 0)) || ((localObject1 instanceof XYPlot)) || (((MethodWriter)localObject1).f()) || (((MethodWriter)localObject1).equals()))
        {
          paramInt3 = 0;
          break;
        }
        paramInt2 += 1;
      }
    }
    int i5;
    if (paramInt3 != 0) {
      i5 = tree.ClassWriter.x;
    }
    if (((paramInt4 == 1073741824) && (paramInt6 == 1073741824)) || (bool)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    int n = paramInt3 & paramInt1;
    int i8;
    if (n != 0)
    {
      paramInt1 = Math.min(paramF.getHeight(), paramInt5);
      paramInt2 = Math.min(paramF.getSize(), paramInt7);
      if ((paramInt4 == 1073741824) && (paramF.get() != paramInt1))
      {
        paramF.append(paramInt1);
        paramF.clear();
      }
      if ((paramInt6 == 1073741824) && (paramF.getValue() != paramInt2))
      {
        paramF.get(paramInt2);
        paramF.clear();
      }
      if ((paramInt4 == 1073741824) && (paramInt6 == 1073741824))
      {
        i5 = paramF.d(bool);
        paramInt1 = 2;
      }
      else
      {
        int i6 = paramF.a(bool);
        i5 = i6;
        if (paramInt4 == 1073741824)
        {
          i5 = i6 & paramF.d(bool, 0);
          paramInt1 = 1;
        }
        else
        {
          paramInt1 = 0;
        }
        if (paramInt6 == 1073741824)
        {
          i5 = paramF.d(bool, 1) & i5;
          paramInt1 += 1;
        }
      }
      int i7 = i5;
      paramInt2 = paramInt1;
      if (i5 != 0)
      {
        if (paramInt4 == 1073741824) {
          i7 = 1;
        } else {
          i7 = 0;
        }
        if (paramInt6 == 1073741824) {
          bool = true;
        } else {
          bool = false;
        }
        paramF.a(i7, bool);
        i8 = i5;
        paramInt2 = paramInt1;
      }
    }
    else
    {
      i8 = 0;
      paramInt2 = 0;
    }
    if ((i8 == 0) || (paramInt2 != 2))
    {
      paramInt1 = paramF.r();
      paramInt3 = paramInt1;
      if (paramInt9 > 0) {
        a(paramF);
      }
      b(paramF);
      int i1 = c.size();
      if (paramInt9 > 0) {
        a(paramF, "First pass", 0, k, m);
      }
      if (i1 > 0)
      {
        localObject1 = paramF.charAt();
        localObject2 = c.c;
        if (localObject1 == localObject2) {
          paramInt7 = 1;
        } else {
          paramInt7 = 0;
        }
        if (paramF.isEmpty() == localObject2) {
          paramInt8 = 1;
        } else {
          paramInt8 = 0;
        }
        paramInt2 = Math.max(paramF.get(), b.intValue());
        paramInt1 = Math.max(paramF.getValue(), b.width());
        paramInt6 = 0;
        paramInt4 = 0;
        int j;
        int i;
        while (paramInt6 < i1)
        {
          localObject1 = (MethodWriter)c.get(paramInt6);
          if ((localObject1 instanceof XYPlot))
          {
            paramInt5 = ((MethodWriter)localObject1).get();
            paramInt9 = ((MethodWriter)localObject1).getValue();
            i5 = a(localD, (MethodWriter)localObject1, ClassWriter.h);
            j = ((MethodWriter)localObject1).get();
            i = ((MethodWriter)localObject1).getValue();
            if (j != paramInt5)
            {
              ((MethodWriter)localObject1).append(j);
              paramInt4 = paramInt2;
              if (paramInt7 != 0)
              {
                paramInt4 = paramInt2;
                if (((MethodWriter)localObject1).visitLookupSwitchInsn() > paramInt2) {
                  paramInt4 = Math.max(paramInt2, ((MethodWriter)localObject1).visitLookupSwitchInsn() + ((MethodWriter)localObject1).a(Handle.a).a());
                }
              }
              paramInt5 = 1;
              paramInt2 = paramInt4;
            }
            else
            {
              paramInt5 = i5 | paramInt4;
            }
            paramInt4 = paramInt1;
            if (i != paramInt9)
            {
              ((MethodWriter)localObject1).get(i);
              paramInt4 = paramInt1;
              if (paramInt8 != 0)
              {
                paramInt4 = paramInt1;
                if (((MethodWriter)localObject1).visitFrame() > paramInt1) {
                  paramInt4 = Math.max(paramInt1, ((MethodWriter)localObject1).visitFrame() + ((MethodWriter)localObject1).a(Handle.b).a());
                }
              }
              paramInt5 = 1;
            }
            paramInt5 |= ((XYPlot)localObject1).n();
            paramInt1 = paramInt4;
            paramInt4 = paramInt5;
          }
          paramInt6 += 1;
        }
        paramInt9 = 0;
        while (paramInt9 < 2)
        {
          i = 0;
          for (;;)
          {
            localObject1 = this;
            if (i >= i1) {
              break;
            }
            localObject2 = (MethodWriter)c.get(i);
            if ((((localObject2 instanceof l)) && (!(localObject2 instanceof XYPlot))) || ((localObject2 instanceof i)) || (((MethodWriter)localObject2).iterator() == 8) || ((n != 0) && (l.d.b) && (f.d.b)) || ((localObject2 instanceof XYPlot)))
            {
              paramInt6 = paramInt4;
              j = paramInt2;
            }
            else
            {
              int i3 = ((MethodWriter)localObject2).get();
              paramInt6 = ((MethodWriter)localObject2).getValue();
              int i2 = ((MethodWriter)localObject2).readUnsignedShort();
              paramInt5 = ClassWriter.h;
              if (paramInt9 == 1) {
                paramInt5 = ClassWriter.l;
              }
              paramInt5 = ((g)localObject1).a(localD, (MethodWriter)localObject2, paramInt5) | paramInt4;
              int i4 = ((MethodWriter)localObject2).get();
              j = ((MethodWriter)localObject2).getValue();
              paramInt4 = paramInt2;
              if (i4 != i3)
              {
                ((MethodWriter)localObject2).append(i4);
                paramInt4 = paramInt2;
                if (paramInt7 != 0)
                {
                  paramInt4 = paramInt2;
                  if (((MethodWriter)localObject2).visitLookupSwitchInsn() > paramInt2) {
                    paramInt4 = Math.max(paramInt2, ((MethodWriter)localObject2).visitLookupSwitchInsn() + ((MethodWriter)localObject2).a(Handle.a).a());
                  }
                }
                paramInt5 = 1;
              }
              paramInt2 = paramInt1;
              if (j != paramInt6)
              {
                ((MethodWriter)localObject2).get(j);
                paramInt2 = paramInt1;
                if (paramInt8 != 0)
                {
                  paramInt2 = paramInt1;
                  if (((MethodWriter)localObject2).visitFrame() > paramInt1) {
                    paramInt2 = Math.max(paramInt1, ((MethodWriter)localObject2).visitFrame() + ((MethodWriter)localObject2).a(Handle.b).a());
                  }
                }
                paramInt5 = 1;
              }
              paramInt6 = paramInt5;
              j = paramInt4;
              paramInt1 = paramInt2;
              if (((MethodWriter)localObject2).trim())
              {
                paramInt6 = paramInt5;
                j = paramInt4;
                paramInt1 = paramInt2;
                if (i2 != ((MethodWriter)localObject2).readUnsignedShort())
                {
                  paramInt6 = 1;
                  j = paramInt4;
                  paramInt1 = paramInt2;
                }
              }
            }
            i += 1;
            paramInt4 = paramInt6;
            paramInt2 = j;
          }
          if (paramInt4 == 0) {
            break;
          }
          paramInt9 += 1;
          a(paramF, "intermediate pass", paramInt9, k, m);
          paramInt4 = 0;
        }
        paramInt1 = paramInt3;
      }
      paramF.a(paramInt1);
    }
    return 0L;
  }
  
  public void b(f paramF)
  {
    c.clear();
    int j = b.size();
    int i = 0;
    while (i < j)
    {
      MethodWriter localMethodWriter = (MethodWriter)b.get(i);
      c localC1 = localMethodWriter.charAt();
      c localC2 = c.a;
      if ((localC1 == localC2) || (localMethodWriter.isEmpty() == localC2)) {
        c.add(localMethodWriter);
      }
      i += 1;
    }
    paramF.clear();
  }
}
