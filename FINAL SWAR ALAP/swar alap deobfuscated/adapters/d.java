package adapters;

import java.util.ArrayList;
import java.util.Arrays;
import tree.ClassWriter;

public class d
  extends XYPlot
{
  private float B = 0.5F;
  private int a = -1;
  private int b = 0;
  private MethodWriter[] c;
  private int count = -1;
  private int d = 2;
  private int e = 2;
  private int f = 0;
  private float g = 0.5F;
  private int h = -1;
  private int hash = -1;
  private int i = 0;
  private int index = -1;
  private int j = -1;
  private int k = 0;
  private int l = 0;
  private int[] m = null;
  private float n = 0.5F;
  private MethodWriter[] r = null;
  private MethodWriter[] s = null;
  private ArrayList v = new ArrayList();
  private int value = -1;
  private float w = 0.5F;
  private float x = 0.5F;
  private float z = 0.5F;
  
  public d() {}
  
  private final int a(MethodWriter paramMethodWriter, int paramInt)
  {
    if (paramMethodWriter == null) {
      return 0;
    }
    if (paramMethodWriter.isEmpty() == c.a)
    {
      int i1 = i;
      if (i1 == 0) {
        return 0;
      }
      if (i1 == 2)
      {
        i1 = (int)(g * paramInt);
        paramInt = i1;
        if (i1 == paramMethodWriter.getValue()) {
          return paramInt;
        }
        paramMethodWriter.e(true);
        a(paramMethodWriter, paramMethodWriter.charAt(), paramMethodWriter.get(), c.b, i1);
        return i1;
      }
      if (i1 == 1) {
        return paramMethodWriter.getValue();
      }
      if (i1 == 3) {
        return (int)(paramMethodWriter.get() * n + 0.5F);
      }
    }
    paramInt = paramMethodWriter.getValue();
    return paramInt;
  }
  
  private void a(boolean paramBoolean)
  {
    if ((m != null) && (r != null))
    {
      if (s == null) {
        return;
      }
      int i1 = 0;
      while (i1 < l)
      {
        c[i1].addAll();
        i1 += 1;
      }
      Object localObject1 = m;
      int i4 = localObject1[0];
      int i5 = localObject1[1];
      float f1 = z;
      localObject1 = null;
      i1 = 0;
      int i2;
      MethodWriter localMethodWriter;
      Object localObject2;
      while (i1 < i4)
      {
        if (paramBoolean)
        {
          i2 = i4 - i1 - 1;
          f1 = 1.0F - z;
        }
        else
        {
          i2 = i1;
        }
        localMethodWriter = r[i2];
        localObject2 = localObject1;
        if (localMethodWriter != null) {
          if (localMethodWriter.iterator() == 8)
          {
            localObject2 = localObject1;
          }
          else
          {
            if (i1 == 0)
            {
              localMethodWriter.a(b, b, c());
              localMethodWriter.putInt(a);
              localMethodWriter.close(f1);
            }
            if (i1 == i4 - 1) {
              localMethodWriter.a(c, c, next());
            }
            if ((i1 > 0) && (localObject1 != null))
            {
              localMethodWriter.a(b, c, i);
              ((MethodWriter)localObject1).a(c, b, 0);
            }
            localObject2 = localMethodWriter;
          }
        }
        i1 += 1;
        localObject1 = localObject2;
      }
      i1 = 0;
      while (i1 < i5)
      {
        localMethodWriter = s[i1];
        localObject2 = localObject1;
        if (localMethodWriter != null) {
          if (localMethodWriter.iterator() == 8)
          {
            localObject2 = localObject1;
          }
          else
          {
            if (i1 == 0)
            {
              localMethodWriter.a(j, j, length());
              localMethodWriter.add(j);
              localMethodWriter.add(n);
            }
            if (i1 == i5 - 1) {
              localMethodWriter.a(a, a, b());
            }
            if ((i1 > 0) && (localObject1 != null))
            {
              localMethodWriter.a(j, a, b);
              ((MethodWriter)localObject1).a(a, j, 0);
            }
            localObject2 = localMethodWriter;
          }
        }
        i1 += 1;
        localObject1 = localObject2;
      }
      i1 = 0;
      while (i1 < i4)
      {
        i2 = 0;
        while (i2 < i5)
        {
          int i3 = i2 * i4 + i1;
          if (k == 1) {
            i3 = i1 * i5 + i2;
          }
          localObject1 = c;
          if (i3 < localObject1.length)
          {
            localObject1 = localObject1[i3];
            if ((localObject1 != null) && (((MethodWriter)localObject1).iterator() != 8))
            {
              localObject2 = r[i1];
              localMethodWriter = s[i2];
              if (localObject1 != localObject2)
              {
                ((MethodWriter)localObject1).a(b, b, 0);
                ((MethodWriter)localObject1).a(c, c, 0);
              }
              if (localObject1 != localMethodWriter)
              {
                ((MethodWriter)localObject1).a(j, j, 0);
                ((MethodWriter)localObject1).a(a, a, 0);
              }
            }
          }
          i2 += 1;
        }
        i1 += 1;
      }
    }
  }
  
  private void a(MethodWriter[] paramArrayOfMethodWriter, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    v.clear();
    Object localObject1 = new m(this, paramInt2, b, j, c, a, paramInt3);
    v.add(localObject1);
    int i3 = 0;
    int i5 = 0;
    int i4 = 0;
    int i1 = 0;
    if (paramInt2 == 0)
    {
      i2 = 0;
      i3 = 0;
      for (;;)
      {
        i4 = i1;
        if (i3 >= paramInt1) {
          break;
        }
        i7 = i5 + 1;
        localObject2 = paramArrayOfMethodWriter[i3];
        i5 = b((MethodWriter)localObject2, paramInt3);
        i4 = i1;
        if (((MethodWriter)localObject2).charAt() == c.a) {
          i4 = i1 + 1;
        }
        if (((i2 == paramInt3) || (i + i2 + i5 > paramInt3)) && (m.a((m)localObject1) != null)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        i6 = i1;
        if (i1 == 0)
        {
          i6 = i1;
          if (i3 > 0)
          {
            i8 = h;
            i6 = i1;
            if (i8 > 0)
            {
              i6 = i1;
              if (i7 > i8) {
                i6 = 1;
              }
            }
          }
        }
        if (i6 != 0)
        {
          localObject1 = new m(this, paramInt2, b, j, c, a, paramInt3);
          ((m)localObject1).e(i3);
          v.add(localObject1);
          i2 = i5;
          i1 = i7;
        }
        else
        {
          if (i3 > 0) {
            i2 += i + i5;
          } else {
            i2 = i5;
          }
          i1 = 0;
        }
        ((m)localObject1).a((MethodWriter)localObject2);
        i3 += 1;
        i5 = i1;
        i1 = i4;
      }
    }
    int i2 = 0;
    i1 = i4;
    i5 = i3;
    for (;;)
    {
      i4 = i1;
      if (i2 >= paramInt1) {
        break;
      }
      localObject3 = paramArrayOfMethodWriter[i2];
      i6 = a((MethodWriter)localObject3, paramInt3);
      i3 = i1;
      if (((MethodWriter)localObject3).isEmpty() == c.a) {
        i3 = i1 + 1;
      }
      if (((i5 == paramInt3) || (b + i5 + i6 > paramInt3)) && (m.a((m)localObject1) != null)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i4 = i1;
      if (i1 == 0)
      {
        i4 = i1;
        if (i2 > 0)
        {
          i7 = h;
          i4 = i1;
          if (i7 > 0)
          {
            i4 = i1;
            if (i7 < 0) {
              i4 = 1;
            }
          }
        }
      }
      if (i4 != 0)
      {
        localObject2 = new m(this, paramInt2, b, j, c, a, paramInt3);
        ((m)localObject2).e(i2);
        v.add(localObject2);
      }
      do
      {
        i1 = i6;
        localObject1 = localObject2;
        break;
        localObject2 = localObject1;
      } while (i2 <= 0);
      i1 = i5 + (b + i6);
      ((m)localObject1).a((MethodWriter)localObject3);
      i2 += 1;
      i5 = i1;
      i1 = i3;
    }
    int i10 = v.size();
    paramArrayOfMethodWriter = b;
    Object localObject3 = j;
    localObject1 = c;
    Object localObject2 = a;
    int i8 = c();
    i5 = length();
    int i6 = next();
    i2 = b();
    Object localObject4 = charAt();
    Object localObject5 = c.c;
    if ((localObject4 != localObject5) && (isEmpty() != localObject5)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    if ((i4 > 0) && (paramInt1 != 0))
    {
      paramInt1 = 0;
      while (paramInt1 < i10)
      {
        localObject4 = (m)v.get(paramInt1);
        if (paramInt2 == 0) {
          i1 = ((m)localObject4).c();
        } else {
          i1 = ((m)localObject4).e();
        }
        ((m)localObject4).a(paramInt3 - i1);
        paramInt1 += 1;
      }
    }
    int i7 = 0;
    paramInt1 = 0;
    i3 = 0;
    i4 = i8;
    i8 = paramInt1;
    while (i3 < i10)
    {
      localObject5 = (m)v.get(i3);
      int i9;
      if (paramInt2 == 0)
      {
        if (i3 < i10 - 1)
        {
          localObject2 = av.get(i3 + 1)).j;
          paramInt1 = 0;
        }
        else
        {
          localObject2 = a;
          paramInt1 = b();
        }
        localObject4 = aa;
        ((m)localObject5).a(paramInt2, paramArrayOfMethodWriter, (Label)localObject3, (Label)localObject1, (Label)localObject2, i4, i5, i6, paramInt1, paramInt3);
        i2 = Math.max(i8, ((m)localObject5).c());
        i5 = i7 + ((m)localObject5).e();
        i1 = i5;
        if (i3 > 0) {
          i1 = i5 + b;
        }
        localObject3 = localObject4;
        i5 = 0;
        i9 = paramInt1;
      }
      else
      {
        if (i3 < i10 - 1)
        {
          localObject1 = av.get(i3 + 1)).b;
          i1 = 0;
        }
        else
        {
          localObject1 = c;
          i1 = next();
        }
        localObject4 = ac;
        ((m)localObject5).a(paramInt2, paramArrayOfMethodWriter, (Label)localObject3, (Label)localObject1, (Label)localObject2, i4, i5, i1, i2, paramInt3);
        i4 = i8 + ((m)localObject5).c();
        i6 = Math.max(i7, ((m)localObject5).e());
        paramInt1 = i4;
        if (i3 > 0) {
          paramInt1 = i4 + i;
        }
        i4 = i6;
        paramArrayOfMethodWriter = (MethodWriter[])localObject4;
        i7 = 0;
        i9 = i2;
        i6 = i1;
        i1 = i4;
        i4 = i7;
        i2 = paramInt1;
      }
      i3 += 1;
      i8 = i2;
      i7 = i1;
      i2 = i9;
    }
    paramArrayOfInt[0] = i8;
    paramArrayOfInt[1] = i7;
  }
  
  private final int b(MethodWriter paramMethodWriter, int paramInt)
  {
    if (paramMethodWriter == null) {
      return 0;
    }
    if (paramMethodWriter.charAt() == c.a)
    {
      int i1 = h;
      if (i1 == 0) {
        return 0;
      }
      if (i1 == 2)
      {
        i1 = (int)(m * paramInt);
        paramInt = i1;
        if (i1 == paramMethodWriter.get()) {
          return paramInt;
        }
        paramMethodWriter.e(true);
        a(paramMethodWriter, c.b, i1, paramMethodWriter.isEmpty(), paramMethodWriter.getValue());
        return i1;
      }
      if (i1 == 1) {
        return paramMethodWriter.get();
      }
      if (i1 == 3) {
        return (int)(paramMethodWriter.getValue() * n + 0.5F);
      }
    }
    paramInt = paramMethodWriter.get();
    return paramInt;
  }
  
  private void b(MethodWriter[] paramArrayOfMethodWriter, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    Object localObject;
    if (v.size() == 0)
    {
      localObject = new m(this, paramInt2, b, j, c, a, paramInt3);
      v.add(localObject);
    }
    else
    {
      m localM = (m)v.get(0);
      localM.d();
      Label localLabel1 = b;
      Label localLabel2 = j;
      Label localLabel3 = c;
      Label localLabel4 = a;
      int i1 = c();
      int i2 = length();
      int i3 = next();
      int i4 = b();
      localObject = localM;
      localM.a(paramInt2, localLabel1, localLabel2, localLabel3, localLabel4, i1, i2, i3, i4, paramInt3);
    }
    paramInt2 = 0;
    while (paramInt2 < paramInt1)
    {
      ((m)localObject).a(paramArrayOfMethodWriter[paramInt2]);
      paramInt2 += 1;
    }
    paramArrayOfInt[0] = ((m)localObject).c();
    paramArrayOfInt[1] = ((m)localObject).e();
  }
  
  private void draw(MethodWriter[] paramArrayOfMethodWriter, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    v.clear();
    Object localObject2 = new m(this, paramInt2, b, j, c, a, paramInt3);
    v.add(localObject2);
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i5 = 0;
    int i4 = 0;
    int i6 = 0;
    Object localObject1 = localObject2;
    if (paramInt2 == 0)
    {
      i4 = i6;
      i3 = i5;
      i1 = i2;
      localObject1 = localObject2;
      for (;;)
      {
        i2 = i1;
        if (i4 >= paramInt1) {
          break;
        }
        localObject3 = paramArrayOfMethodWriter[i4];
        i6 = b((MethodWriter)localObject3, paramInt3);
        i2 = i1;
        if (((MethodWriter)localObject3).charAt() == c.a) {
          i2 = i1 + 1;
        }
        if (((i3 == paramInt3) || (i + i3 + i6 > paramInt3)) && (m.a((m)localObject1) != null)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        i5 = i1;
        if (i1 == 0)
        {
          i5 = i1;
          if (i4 > 0)
          {
            i7 = h;
            i5 = i1;
            if (i7 > 0)
            {
              i5 = i1;
              if (i4 % i7 == 0) {
                i5 = 1;
              }
            }
          }
        }
        if (i5 != 0)
        {
          localObject2 = new m(this, paramInt2, b, j, c, a, paramInt3);
          ((m)localObject2).e(i4);
          v.add(localObject2);
        }
        do
        {
          i3 = i6;
          localObject1 = localObject2;
          break;
          localObject2 = localObject1;
        } while (i4 <= 0);
        i3 += i + i6;
        ((m)localObject1).a((MethodWriter)localObject3);
        i4 += 1;
        i1 = i2;
      }
    }
    for (;;)
    {
      i2 = i1;
      if (i4 >= paramInt1) {
        break;
      }
      localObject3 = paramArrayOfMethodWriter[i4];
      i6 = a((MethodWriter)localObject3, paramInt3);
      i2 = i1;
      if (((MethodWriter)localObject3).isEmpty() == c.a) {
        i2 = i1 + 1;
      }
      if (((i3 == paramInt3) || (b + i3 + i6 > paramInt3)) && (m.a((m)localObject1) != null)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i5 = i1;
      if (i1 == 0)
      {
        i5 = i1;
        if (i4 > 0)
        {
          i7 = h;
          i5 = i1;
          if (i7 > 0)
          {
            i5 = i1;
            if (i4 % i7 == 0) {
              i5 = 1;
            }
          }
        }
      }
      if (i5 != 0)
      {
        localObject2 = new m(this, paramInt2, b, j, c, a, paramInt3);
        ((m)localObject2).e(i4);
        v.add(localObject2);
      }
      do
      {
        i3 = i6;
        localObject1 = localObject2;
        break;
        localObject2 = localObject1;
      } while (i4 <= 0);
      i3 += b + i6;
      ((m)localObject1).a((MethodWriter)localObject3);
      i4 += 1;
      i1 = i2;
    }
    int i8 = v.size();
    paramArrayOfMethodWriter = b;
    Object localObject3 = j;
    localObject1 = c;
    localObject2 = a;
    i5 = c();
    i4 = length();
    i6 = next();
    i3 = b();
    Object localObject4 = charAt();
    Object localObject5 = c.c;
    if ((localObject4 != localObject5) && (isEmpty() != localObject5)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    if ((i2 > 0) && (paramInt1 != 0))
    {
      paramInt1 = 0;
      while (paramInt1 < i8)
      {
        localObject4 = (m)v.get(paramInt1);
        if (paramInt2 == 0) {
          i1 = ((m)localObject4).c();
        } else {
          i1 = ((m)localObject4).e();
        }
        ((m)localObject4).a(paramInt3 - i1);
        paramInt1 += 1;
      }
    }
    i2 = 0;
    int i7 = 0;
    paramInt1 = 0;
    i1 = i3;
    i3 = paramInt1;
    while (i3 < i8)
    {
      localObject5 = (m)v.get(i3);
      if (paramInt2 == 0)
      {
        if (i3 < i8 - 1)
        {
          localObject2 = av.get(i3 + 1)).j;
          paramInt1 = 0;
        }
        else
        {
          localObject2 = a;
          paramInt1 = b();
        }
        localObject4 = aa;
        ((m)localObject5).a(paramInt2, paramArrayOfMethodWriter, (Label)localObject3, (Label)localObject1, (Label)localObject2, i5, i4, i6, paramInt1, paramInt3);
        i4 = Math.max(i7, ((m)localObject5).c());
        i2 += ((m)localObject5).e();
        i1 = i2;
        if (i3 > 0) {
          i1 = i2 + b;
        }
        i2 = i4;
        localObject3 = localObject4;
        i4 = 0;
      }
      else
      {
        if (i3 < i8 - 1)
        {
          localObject1 = av.get(i3 + 1)).b;
          paramInt1 = 0;
        }
        else
        {
          localObject1 = c;
          paramInt1 = next();
        }
        localObject4 = ac;
        ((m)localObject5).a(paramInt2, paramArrayOfMethodWriter, (Label)localObject3, (Label)localObject1, (Label)localObject2, i5, i4, paramInt1, i1, paramInt3);
        i5 = i7 + ((m)localObject5).c();
        i6 = Math.max(i2, ((m)localObject5).e());
        i2 = i5;
        if (i3 > 0) {
          i2 = i5 + i;
        }
        i5 = i6;
        i6 = paramInt1;
        paramArrayOfMethodWriter = (MethodWriter[])localObject4;
        i7 = 0;
        paramInt1 = i1;
        i1 = i5;
        i5 = i7;
      }
      i3 += 1;
      i7 = i2;
      i2 = i1;
      i1 = paramInt1;
    }
    paramArrayOfInt[0] = i7;
    paramArrayOfInt[1] = i2;
  }
  
  private void update(MethodWriter[] paramArrayOfMethodWriter, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    int i1 = h;
    int i3;
    int i4;
    Object localObject;
    if (paramInt2 == 0)
    {
      i3 = i1;
      if (i1 <= 0)
      {
        i1 = 0;
        i4 = 0;
        i2 = 0;
        for (;;)
        {
          i3 = i1;
          if (i4 >= paramInt1) {
            break;
          }
          i3 = i2;
          if (i4 > 0) {
            i3 = i2 + i;
          }
          localObject = paramArrayOfMethodWriter[i4];
          if (localObject == null)
          {
            i2 = i3;
          }
          else
          {
            i2 = i3 + b((MethodWriter)localObject, paramInt3);
            if (i2 > paramInt3)
            {
              i3 = i1;
              break;
            }
            i1 += 1;
          }
          i4 += 1;
        }
      }
      i2 = i3;
      i1 = 0;
    }
    else
    {
      i3 = i1;
      if (i1 <= 0)
      {
        i1 = 0;
        i4 = 0;
        i2 = 0;
        for (;;)
        {
          i3 = i1;
          if (i4 >= paramInt1) {
            break;
          }
          i3 = i2;
          if (i4 > 0) {
            i3 = i2 + b;
          }
          localObject = paramArrayOfMethodWriter[i4];
          if (localObject == null)
          {
            i2 = i3;
          }
          else
          {
            i2 = i3 + a((MethodWriter)localObject, paramInt3);
            if (i2 > paramInt3)
            {
              i3 = i1;
              break;
            }
            i1 += 1;
          }
          i4 += 1;
        }
      }
      i2 = 0;
      i1 = i3;
    }
    if (m == null) {
      m = new int[2];
    }
    int i6;
    if (i1 == 0)
    {
      i6 = i1;
      i4 = i2;
      if (paramInt2 == 1) {}
    }
    else
    {
      if ((i2 != 0) || (paramInt2 != 0)) {
        break label302;
      }
      i4 = i2;
      i6 = i1;
    }
    int i7 = 1;
    i1 = i6;
    int i2 = i4;
    break label305;
    label302:
    i7 = 0;
    for (;;)
    {
      label305:
      if (i7 != 0) {
        break label838;
      }
      if (paramInt2 == 0) {
        i1 = (int)Math.ceil(paramInt1 / i2);
      } else {
        i2 = (int)Math.ceil(paramInt1 / i1);
      }
      localObject = r;
      if ((localObject != null) && (localObject.length >= i2)) {
        Arrays.fill((Object[])localObject, null);
      } else {
        r = new MethodWriter[i2];
      }
      localObject = s;
      if ((localObject != null) && (localObject.length >= i1)) {
        Arrays.fill((Object[])localObject, null);
      } else {
        s = new MethodWriter[i1];
      }
      i3 = 0;
      while (i3 < i2)
      {
        i4 = 0;
        while (i4 < i1)
        {
          i5 = i4 * i2 + i3;
          if (paramInt2 == 1) {
            i5 = i3 * i1 + i4;
          }
          if (i5 < paramArrayOfMethodWriter.length)
          {
            localObject = paramArrayOfMethodWriter[i5];
            if (localObject != null)
            {
              i5 = b((MethodWriter)localObject, paramInt3);
              MethodWriter localMethodWriter = r[i3];
              if ((localMethodWriter == null) || (localMethodWriter.get() < i5)) {
                r[i3] = localObject;
              }
              i5 = a((MethodWriter)localObject, paramInt3);
              localMethodWriter = s[i4];
              if ((localMethodWriter == null) || (localMethodWriter.getValue() < i5)) {
                s[i4] = localObject;
              }
            }
          }
          i4 += 1;
        }
        i3 += 1;
      }
      i4 = 0;
      for (i3 = 0; i4 < i2; i3 = i5)
      {
        localObject = r[i4];
        i5 = i3;
        if (localObject != null)
        {
          i5 = i3;
          if (i4 > 0) {
            i5 = i3 + i;
          }
          i5 += b((MethodWriter)localObject, paramInt3);
        }
        i4 += 1;
      }
      i4 = 0;
      for (int i5 = 0; i4 < i1; i5 = i6)
      {
        localObject = s[i4];
        i6 = i5;
        if (localObject != null)
        {
          i6 = i5;
          if (i4 > 0) {
            i6 = i5 + b;
          }
          i6 += a((MethodWriter)localObject, paramInt3);
        }
        i4 += 1;
      }
      paramArrayOfInt[0] = i3;
      paramArrayOfInt[1] = i5;
      if (paramInt2 == 0)
      {
        i6 = i1;
        i4 = i2;
        if (i3 <= paramInt3) {
          break;
        }
        i6 = i1;
        i4 = i2;
        if (i2 <= 1) {
          break;
        }
        i2 -= 1;
        continue;
      }
      i6 = i1;
      i4 = i2;
      if (i5 <= paramInt3) {
        break;
      }
      i6 = i1;
      i4 = i2;
      if (i1 <= 1) {
        break;
      }
      i1 -= 1;
    }
    label838:
    paramArrayOfMethodWriter = m;
    paramArrayOfMethodWriter[0] = i2;
    paramArrayOfMethodWriter[1] = i1;
  }
  
  public void a(float paramFloat)
  {
    z = paramFloat;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((i > 0) && (!a()))
    {
      a(0, 0);
      b(false);
      return;
    }
    int i7 = c();
    int i8 = next();
    int i5 = length();
    int i6 = b();
    int[] arrayOfInt = new int[2];
    int i2 = paramInt2 - i7 - i8;
    int i1 = k;
    if (i1 == 1) {
      i2 = paramInt4 - i5 - i6;
    }
    if (i1 == 0)
    {
      if (a == -1) {
        a = 0;
      }
      if (j != -1) {
        break label141;
      }
    }
    else
    {
      if (a == -1) {
        a = 0;
      }
      if (j != -1) {
        break label141;
      }
    }
    j = 0;
    label141:
    MethodWriter[] arrayOfMethodWriter = a;
    i1 = 0;
    int i4;
    for (int i3 = 0;; i3 = i4)
    {
      i4 = i;
      if (i1 >= i4) {
        break;
      }
      i4 = i3;
      if (a[i1].iterator() == 8) {
        i4 = i3 + 1;
      }
      i1 += 1;
    }
    if (i3 > 0)
    {
      arrayOfMethodWriter = new MethodWriter[i4 - i3];
      i3 = 0;
      for (i1 = 0; i3 < i; i1 = i4)
      {
        MethodWriter localMethodWriter = a[i3];
        i4 = i1;
        if (localMethodWriter.iterator() != 8)
        {
          arrayOfMethodWriter[i1] = localMethodWriter;
          i4 = i1 + 1;
        }
        i3 += 1;
      }
    }
    else
    {
      i1 = i4;
    }
    c = arrayOfMethodWriter;
    l = i1;
    i3 = f;
    if (i3 != 0)
    {
      if (i3 != 1)
      {
        if (i3 != 2)
        {
          if (i3 == 3) {
            a(arrayOfMethodWriter, i1, k, i2, arrayOfInt);
          }
        }
        else {
          update(arrayOfMethodWriter, i1, k, i2, arrayOfInt);
        }
      }
      else {
        draw(arrayOfMethodWriter, i1, k, i2, arrayOfInt);
      }
    }
    else {
      b(arrayOfMethodWriter, i1, k, i2, arrayOfInt);
    }
    boolean bool = true;
    i2 = arrayOfInt[0] + i7 + i8;
    i1 = arrayOfInt[1] + i5 + i6;
    if (paramInt1 == 1073741824) {
      paramInt1 = paramInt2;
    } else if (paramInt1 == Integer.MIN_VALUE) {
      paramInt1 = Math.min(i2, paramInt2);
    } else if (paramInt1 == 0) {
      paramInt1 = i2;
    } else {
      paramInt1 = 0;
    }
    if (paramInt3 == 1073741824) {
      paramInt2 = paramInt4;
    } else if (paramInt3 == Integer.MIN_VALUE) {
      paramInt2 = Math.min(i1, paramInt4);
    } else if (paramInt3 == 0) {
      paramInt2 = i1;
    } else {
      paramInt2 = 0;
    }
    a(paramInt1, paramInt2);
    append(paramInt1);
    get(paramInt2);
    if (i <= 0) {
      bool = false;
    }
    b(bool);
  }
  
  public void a(ClassWriter paramClassWriter, boolean paramBoolean)
  {
    super.a(paramClassWriter, paramBoolean);
    if ((l() != null) && (((f)l()).b())) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    int i1 = f;
    if (i1 != 0)
    {
      int i2;
      boolean bool;
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 == 3)
          {
            i2 = v.size();
            i1 = 0;
            while (i1 < i2)
            {
              paramClassWriter = (m)v.get(i1);
              if (i1 == i2 - 1) {
                bool = true;
              } else {
                bool = false;
              }
              paramClassWriter.a(paramBoolean, i1, bool);
              i1 += 1;
            }
          }
        }
        else {
          a(paramBoolean);
        }
      }
      else
      {
        i2 = v.size();
        i1 = 0;
        while (i1 < i2)
        {
          paramClassWriter = (m)v.get(i1);
          if (i1 == i2 - 1) {
            bool = true;
          } else {
            bool = false;
          }
          paramClassWriter.a(paramBoolean, i1, bool);
          i1 += 1;
        }
      }
    }
    else if (v.size() > 0)
    {
      ((m)v.get(0)).a(paramBoolean, 0, true);
    }
    b(false);
  }
  
  public void append(float paramFloat)
  {
    w = paramFloat;
  }
  
  public void getString(int paramInt)
  {
    k = paramInt;
  }
  
  public void load(int paramInt)
  {
    hash = paramInt;
  }
  
  public void padding(int paramInt)
  {
    b = paramInt;
  }
  
  public void remove(int paramInt)
  {
    i = paramInt;
  }
  
  public void setColor(float paramFloat)
  {
    g = paramFloat;
  }
  
  public void setColor(int paramInt)
  {
    index = paramInt;
  }
  
  public void setHour(int paramInt)
  {
    value = paramInt;
  }
  
  public void setIcon(int paramInt)
  {
    d = paramInt;
  }
  
  public void setId(int paramInt)
  {
    h = paramInt;
  }
  
  public void setMinute(int paramInt)
  {
    f = paramInt;
  }
  
  public void setProgress(float paramFloat)
  {
    B = paramFloat;
  }
  
  public void setSecondaryProgress(float paramFloat)
  {
    x = paramFloat;
  }
  
  public void setValue(float paramFloat)
  {
    n = paramFloat;
  }
  
  public void setValue(int paramInt)
  {
    a = paramInt;
  }
  
  public void setWidth(int paramInt)
  {
    e = paramInt;
  }
  
  public void update(int paramInt)
  {
    j = paramInt;
  }
  
  public void updateStatus(int paramInt)
  {
    count = paramInt;
  }
}
