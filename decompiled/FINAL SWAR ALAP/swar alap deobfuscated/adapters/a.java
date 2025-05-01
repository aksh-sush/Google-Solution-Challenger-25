package adapters;

import java.util.ArrayList;

public abstract class a
{
  static void a(f paramF, tree.ClassWriter paramClassWriter, int paramInt1, int paramInt2, ClassWriter paramClassWriter1)
  {
    MethodWriter localMethodWriter2 = a;
    MethodWriter localMethodWriter3 = A;
    Object localObject1 = b;
    MethodWriter localMethodWriter1 = c;
    Object localObject6 = o;
    float f1 = k;
    int n;
    if (t[paramInt1] == c.c) {
      n = 1;
    } else {
      n = 0;
    }
    int i;
    int j;
    if (paramInt1 == 0)
    {
      i1 = id;
      if (i1 == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i1 == 1) {
        j = 1;
      } else {
        j = 0;
      }
      k = i;
      m = j;
      if (i1 != 2) {
        break label184;
      }
    }
    else
    {
      i1 = level;
      if (i1 == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i1 == 1) {
        j = 1;
      } else {
        j = 0;
      }
      k = i;
      m = j;
      if (i1 != 2) {
        break label184;
      }
    }
    int i1 = 1;
    int k = i;
    int m = j;
    break label187;
    label184:
    i1 = 0;
    label187:
    int i2 = 0;
    Object localObject7;
    Object localObject4;
    Object localObject2;
    Object localObject5;
    for (Object localObject3 = localMethodWriter2;; localObject3 = localObject2)
    {
      localObject7 = null;
      localObject4 = null;
      if (i2 != 0) {
        break;
      }
      localObject2 = u[paramInt2];
      if (i1 != 0) {
        i = 1;
      } else {
        i = 4;
      }
      int i5 = ((Label)localObject2).a();
      j = i5;
      localObject7 = t[paramInt1];
      localObject5 = c.a;
      int i4;
      if ((localObject7 == localObject5) && (H[paramInt1] == 0)) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      localObject7 = b;
      int i3 = j;
      if (localObject7 != null)
      {
        i3 = j;
        if (localObject3 != localMethodWriter2) {
          i3 = i5 + ((Label)localObject7).a();
        }
      }
      j = i;
      if (i1 != 0)
      {
        j = i;
        if (localObject3 != localMethodWriter2)
        {
          j = i;
          if (localObject3 != localObject1) {
            j = 8;
          }
        }
      }
      localObject7 = b;
      if (localObject7 != null)
      {
        if (localObject3 == localObject1) {
          paramClassWriter.d(i, i, i3, 6);
        } else {
          paramClassWriter.d(i, i, i3, 8);
        }
        i = j;
        if (i4 != 0)
        {
          i = j;
          if (i1 == 0) {
            i = 5;
          }
        }
        j = i;
        if (localObject3 == localObject1)
        {
          j = i;
          if (i1 != 0)
          {
            j = i;
            if (((MethodWriter)localObject3).visitLocalVariableAnnotation(paramInt1)) {
              j = 5;
            }
          }
        }
        paramClassWriter.a(i, b.i, i3, j);
      }
      if (n != 0)
      {
        if ((((MethodWriter)localObject3).iterator() != 8) && (t[paramInt1] == localObject5))
        {
          localObject2 = u;
          paramClassWriter.d(1i, i, 0, 5);
        }
        paramClassWriter.d(u[paramInt2].i, u[paramInt2].i, 0, 8);
      }
      localObject5 = u[(paramInt2 + 1)].b;
      localObject2 = localObject4;
      if (localObject5 != null)
      {
        localObject5 = a;
        localObject7 = u[paramInt2].b;
        localObject2 = localObject4;
        if (localObject7 != null) {
          if (a != localObject3) {
            localObject2 = localObject4;
          } else {
            localObject2 = localObject5;
          }
        }
      }
      if (localObject2 == null)
      {
        i2 = 1;
        localObject2 = localObject3;
      }
    }
    if (localMethodWriter1 != null)
    {
      localObject2 = u;
      j = paramInt2 + 1;
      if (b != null)
      {
        localObject2 = u[j];
        if ((t[paramInt1] == c.a) && (H[paramInt1] == 0)) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (i1 == 0))
        {
          localObject3 = b;
          if (a == paramF)
          {
            paramClassWriter.a(i, i, -((Label)localObject2).a(), 5);
            break label864;
          }
        }
        if (i1 != 0)
        {
          localObject3 = b;
          if (a == paramF) {
            paramClassWriter.a(i, i, -((Label)localObject2).a(), 4);
          }
        }
        label864:
        paramClassWriter.b(i, u[j].b.i, -((Label)localObject2).a(), 6);
      }
    }
    if (n != 0)
    {
      paramF = u;
      i = paramInt2 + 1;
      paramF = i;
      localObject2 = u[i];
      paramClassWriter.d(paramF, i, ((Label)localObject2).a(), 8);
    }
    localObject3 = v;
    label1140:
    Object localObject8;
    Object localObject9;
    if (localObject3 != null)
    {
      j = ((ArrayList)localObject3).size();
      if (j > 1)
      {
        float f2 = f1;
        if (e)
        {
          f2 = f1;
          if (!h) {
            f2 = n;
          }
        }
        paramF = null;
        i = 0;
        for (float f3 = 0.0F; i < j; f3 = f1)
        {
          localObject2 = (MethodWriter)((ArrayList)localObject3).get(i);
          float f4 = left[paramInt1];
          f1 = f4;
          if (f4 < 0.0F)
          {
            if (h)
            {
              localObject2 = u;
              paramClassWriter.a(1i, i, 0, 4);
              break label1140;
            }
            f1 = 1.0F;
          }
          if (f1 == 0.0F)
          {
            localObject2 = u;
            paramClassWriter.a(1i, i, 0, 8);
            f1 = f3;
          }
          else
          {
            if (paramF != null)
            {
              localObject4 = u;
              paramF = i;
              n = paramInt2 + 1;
              localObject4 = i;
              localObject8 = u;
              localObject5 = i;
              localObject8 = i;
              localObject9 = paramClassWriter.a();
              ((tree.f)localObject9).a(f3, f2, f1, paramF, (tree.Label)localObject4, (tree.Label)localObject5, (tree.Label)localObject8);
              paramClassWriter.b((tree.f)localObject9);
            }
            paramF = (f)localObject2;
          }
          i += 1;
        }
      }
    }
    if ((localObject1 != null) && ((localObject1 == localMethodWriter1) || (i1 != 0)))
    {
      paramF = u[paramInt2];
      paramClassWriter1 = u;
      i = paramInt2 + 1;
      localObject2 = paramClassWriter1[i];
      paramF = b;
      if (paramF != null) {
        paramF = paramF.i;
      } else {
        paramF = null;
      }
      paramClassWriter1 = b;
      if (paramClassWriter1 != null) {
        paramClassWriter1 = i;
      } else {
        paramClassWriter1 = null;
      }
      localObject3 = u[paramInt2];
      if (localMethodWriter1 != null) {
        localObject2 = u[i];
      }
      if ((paramF != null) && (paramClassWriter1 != null))
      {
        if (paramInt1 == 0) {
          f1 = position;
        } else {
          f1 = name;
        }
        paramInt1 = ((Label)localObject3).a();
        i = ((Label)localObject2).a();
        paramClassWriter.add(i, paramF, paramInt1, f1, paramClassWriter1, i, i, 7);
      }
    }
    else
    {
      if ((k != 0) && (localObject1 != null))
      {
        i = n;
        if ((i > 0) && (r == i)) {
          j = 1;
        } else {
          j = 0;
        }
        paramClassWriter1 = (ClassWriter)localObject1;
        paramF = (f)localObject1;
      }
      while (paramF != null)
      {
        for (localObject2 = bottom[paramInt1]; (localObject2 != null) && (((MethodWriter)localObject2).iterator() == 8); localObject2 = bottom[paramInt1]) {}
        if ((localObject2 == null) && (paramF != localMethodWriter1)) {}
        for (;;)
        {
          break;
          localObject4 = u[paramInt2];
          localObject6 = i;
          localObject3 = b;
          if (localObject3 != null) {
            localObject3 = i;
          } else {
            localObject3 = null;
          }
          if (paramClassWriter1 != paramF) {
            localObject3 = u[(paramInt2 + 1)];
          }
          do
          {
            localObject3 = i;
            break;
            if (paramF != localObject1) {
              break;
            }
            localObject3 = u[paramInt2].b;
          } while (localObject3 != null);
          localObject3 = null;
          i2 = ((Label)localObject4).a();
          localObject4 = u;
          i1 = paramInt2 + 1;
          n = localObject4[i1].a();
          i = n;
          if (localObject2 != null) {
            localObject4 = u[paramInt2];
          }
          do
          {
            localObject5 = i;
            break;
            localObject4 = u[i1].b;
          } while (localObject4 != null);
          localObject5 = null;
          localObject8 = u[i1].i;
          if (localObject4 != null) {
            i = n + ((Label)localObject4).a();
          }
          n = i2 + u[i1].a();
          if ((localObject6 != null) && (localObject3 != null) && (localObject5 != null) && (localObject8 != null))
          {
            if (paramF == localObject1) {
              n = u[paramInt2].a();
            }
            if (paramF == localMethodWriter1) {
              i = u[i1].a();
            }
            if (j != 0) {
              i1 = 8;
            } else {
              i1 = 5;
            }
            paramClassWriter.add((tree.Label)localObject6, (tree.Label)localObject3, n, 0.5F, (tree.Label)localObject5, (tree.Label)localObject8, i, i1);
            break;
          }
        }
        if (paramF.iterator() == 8) {
          paramF = paramClassWriter1;
        }
        paramClassWriter1 = paramF;
        paramF = (f)localObject2;
        continue;
        if ((m != 0) && (localObject1 != null))
        {
          i = n;
          if ((i > 0) && (r == i)) {
            i = 1;
          } else {
            i = 0;
          }
          localObject3 = localObject1;
          for (paramClassWriter1 = (ClassWriter)localObject1;; paramClassWriter1 = (ClassWriter)localObject2)
          {
            j = paramInt1;
            if (paramClassWriter1 == null) {
              break;
            }
            for (paramF = bottom[j]; (paramF != null) && (paramF.iterator() == 8); paramF = bottom[j]) {}
            localObject2 = paramF;
            if (paramClassWriter1 != localObject1)
            {
              localObject2 = paramF;
              if (paramClassWriter1 != localMethodWriter1)
              {
                localObject2 = paramF;
                if (paramF != null)
                {
                  localObject2 = paramF;
                  if (paramF == localMethodWriter1) {
                    localObject2 = null;
                  }
                  paramF = u[paramInt2];
                  localObject8 = paramF.i;
                  localObject4 = b;
                  if (localObject4 != null) {
                    localObject4 = i;
                  }
                  localObject4 = u;
                  i2 = paramInt2 + 1;
                  localObject9 = i;
                  i1 = paramF.a();
                  n = u[i2].a();
                  j = n;
                  if (localObject2 != null)
                  {
                    localObject4 = u[paramInt2];
                    localObject5 = i;
                    paramF = b;
                    if (paramF != null) {
                      paramF = paramF.i;
                    } else {
                      paramF = null;
                    }
                    localObject6 = paramF;
                  }
                  else
                  {
                    localObject4 = u[paramInt2];
                    if (localObject4 != null) {
                      paramF = i;
                    } else {
                      paramF = null;
                    }
                    localObject6 = u[i2].i;
                    localObject5 = paramF;
                  }
                  if (localObject4 != null) {
                    j = n + ((Label)localObject4).a();
                  }
                  i2 = u[i2].a();
                  if (i != 0) {
                    n = 8;
                  } else {
                    n = 4;
                  }
                  if ((localObject8 != null) && (localObject9 != null) && (localObject5 != null) && (localObject6 != null)) {
                    paramClassWriter.add((tree.Label)localObject8, (tree.Label)localObject9, i2 + i1, 0.5F, (tree.Label)localObject5, (tree.Label)localObject6, j, n);
                  }
                }
              }
            }
            if (paramClassWriter1.iterator() != 8) {
              localObject3 = paramClassWriter1;
            }
          }
          paramF = u[paramInt2];
          paramClassWriter1 = u[paramInt2].b;
          localObject2 = u;
          paramInt1 = paramInt2 + 1;
          localObject2 = localObject2[paramInt1];
          localObject3 = u[paramInt1].b;
          if (paramClassWriter1 != null) {
            if (localObject1 != localMethodWriter1) {
              paramClassWriter.a(paramF.i, i, paramF.a(), 5);
            } else if (localObject3 != null) {
              paramClassWriter.add(paramF.i, i, paramF.a(), 0.5F, i, i, ((Label)localObject2).a(), 5);
            }
          }
          if ((localObject3 != null) && (localObject1 != localMethodWriter1)) {
            paramClassWriter.a(i, i, -((Label)localObject2).a(), 5);
          }
        }
      }
    }
    if (((k != 0) || (m != 0)) && (localObject1 != null) && (localObject1 != localMethodWriter1))
    {
      localObject5 = u;
      localObject4 = localObject5[paramInt2];
      paramClassWriter1 = localMethodWriter1;
      if (localMethodWriter1 == null) {
        paramClassWriter1 = (ClassWriter)localObject1;
      }
      paramF = u;
      paramInt2 += 1;
      localObject3 = paramF[paramInt2];
      paramF = b;
      if (paramF != null) {
        localObject2 = paramF.i;
      } else {
        localObject2 = null;
      }
      paramF = b;
      if (paramF != null) {
        paramF = paramF.i;
      } else {
        paramF = null;
      }
      if (localMethodWriter3 != paramClassWriter1)
      {
        localObject6 = u[paramInt2].b;
        paramF = (f)localObject7;
        if (localObject6 != null) {
          paramF = i;
        }
      }
      if (localObject1 == paramClassWriter1) {
        localObject3 = localObject5[paramInt2];
      }
      if ((localObject2 != null) && (paramF != null))
      {
        paramInt1 = ((Label)localObject4).a();
        paramInt2 = u[paramInt2].a();
        paramClassWriter1 = i;
        localObject1 = i;
        paramClassWriter.add(paramClassWriter1, (tree.Label)localObject2, paramInt1, 0.5F, (tree.Label)paramF, (tree.Label)localObject1, paramInt2, 5);
      }
    }
  }
  
  public static void a(f paramF, tree.ClassWriter paramClassWriter, ArrayList paramArrayList, int paramInt)
  {
    int k = 0;
    int i;
    ClassWriter[] arrayOfClassWriter;
    int j;
    if (paramInt == 0)
    {
      i = p;
      arrayOfClassWriter = u;
      j = 0;
    }
    else
    {
      i = q;
      arrayOfClassWriter = g;
      j = 2;
    }
    while (k < i)
    {
      ClassWriter localClassWriter = arrayOfClassWriter[k];
      localClassWriter.b();
      if ((paramArrayList == null) || (paramArrayList.contains(a))) {
        a(paramF, paramClassWriter, paramInt, j, localClassWriter);
      }
      k += 1;
    }
  }
}
