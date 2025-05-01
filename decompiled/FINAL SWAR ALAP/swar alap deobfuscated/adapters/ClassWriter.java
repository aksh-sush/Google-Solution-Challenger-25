package adapters;

import java.util.ArrayList;

public class ClassWriter
{
  protected MethodWriter A;
  protected MethodWriter a;
  protected MethodWriter b;
  protected MethodWriter c;
  private boolean d;
  protected boolean e;
  protected boolean f;
  protected MethodWriter g;
  protected boolean h;
  protected MethodWriter i;
  protected float k = 0.0F;
  boolean l;
  private int m;
  protected int n;
  protected MethodWriter o;
  int p;
  protected int r;
  int s;
  int t;
  protected ArrayList v;
  private boolean w;
  protected boolean z;
  
  public ClassWriter(MethodWriter paramMethodWriter, int paramInt, boolean paramBoolean)
  {
    a = paramMethodWriter;
    m = paramInt;
    w = paramBoolean;
  }
  
  private void a()
  {
    int i1 = m * 2;
    Object localObject1 = a;
    boolean bool = true;
    l = true;
    Object localObject2 = localObject1;
    int j = 0;
    while (j == 0)
    {
      r += 1;
      Object localObject4 = bottom;
      int i2 = m;
      Object localObject3 = null;
      localObject4[i2] = null;
      width[i2] = null;
      Object localObject5;
      if (((MethodWriter)localObject1).iterator() != 8)
      {
        p += 1;
        localObject5 = ((MethodWriter)localObject1).f(m);
        localObject4 = c.a;
        if (localObject5 != localObject4) {
          s += ((MethodWriter)localObject1).contains(m);
        }
        int i3 = s + u[i1].a();
        s = i3;
        localObject5 = u;
        i2 = i1 + 1;
        s = (i3 + localObject5[i2].a());
        i3 = t + u[i1].a();
        t = i3;
        t = (i3 + u[i2].a());
        if (b == null) {
          b = ((MethodWriter)localObject1);
        }
        c = ((MethodWriter)localObject1);
        localObject5 = t;
        i2 = m;
        if (localObject5[i2] == localObject4)
        {
          i3 = H[i2];
          if ((i3 == 0) || (i3 == 3) || (i3 == 2))
          {
            n += 1;
            float f1 = left[i2];
            if (f1 > 0.0F) {
              k += f1;
            }
            if (a((MethodWriter)localObject1, i2))
            {
              if (f1 < 0.0F) {
                e = true;
              } else {
                f = true;
              }
              if (v == null) {
                v = new ArrayList();
              }
              v.add(localObject1);
            }
            if (i == null) {
              i = ((MethodWriter)localObject1);
            }
            localObject4 = g;
            if (localObject4 != null) {
              width[m] = localObject1;
            }
            g = ((MethodWriter)localObject1);
          }
          if (m == 0)
          {
            if ((h == 0) && (z == 0)) {
              if (A == 0) {
                break label499;
              }
            }
          }
          else {
            if (i == 0) {
              break label480;
            }
          }
          label480:
          while ((top != 0) || (B != 0))
          {
            l = false;
            break;
          }
          label499:
          if (n != 0.0F)
          {
            l = false;
            z = true;
          }
        }
      }
      if (localObject2 != localObject1) {
        bottom[m] = localObject1;
      }
      localObject4 = u[(i1 + 1)].b;
      localObject2 = localObject3;
      if (localObject4 != null)
      {
        localObject4 = a;
        localObject5 = u[i1].b;
        localObject2 = localObject3;
        if (localObject5 != null) {
          if (a != localObject1) {
            localObject2 = localObject3;
          } else {
            localObject2 = localObject4;
          }
        }
      }
      if (localObject2 == null)
      {
        localObject2 = localObject1;
        j = 1;
      }
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    localObject2 = b;
    if (localObject2 != null) {
      s -= u[i1].a();
    }
    localObject2 = c;
    if (localObject2 != null) {
      s -= u[(i1 + 1)].a();
    }
    A = ((MethodWriter)localObject1);
    if ((m == 0) && (w)) {
      o = ((MethodWriter)localObject1);
    } else {
      o = a;
    }
    if ((!f) || (!e)) {
      bool = false;
    }
    h = bool;
  }
  
  private static boolean a(MethodWriter paramMethodWriter, int paramInt)
  {
    if ((paramMethodWriter.iterator() != 8) && (t[paramInt] == c.a))
    {
      paramInt = H[paramInt];
      if ((paramInt == 0) || (paramInt == 3)) {
        return true;
      }
    }
    return false;
  }
  
  public void b()
  {
    if (!d) {
      a();
    }
    d = true;
  }
}
