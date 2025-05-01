package androidplot;

import adapters.ByteVector;
import adapters.Handle;
import adapters.Label;
import adapters.MethodWriter;
import adapters.f;
import adapters.h;
import adapters.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class c
{
  private static ClassWriter a = new ClassWriter();
  private static int h = 0;
  private static int i = 0;
  
  private static void a(int paramInt, MethodWriter paramMethodWriter, d paramD)
  {
    if (paramMethodWriter.visitLdcInsn()) {
      return;
    }
    h += 1;
    int j;
    if ((!(paramMethodWriter instanceof f)) && (paramMethodWriter.h()))
    {
      j = paramInt + 1;
      if (a(j, paramMethodWriter)) {
        f.a(j, paramMethodWriter, paramD, new ClassWriter(), ClassWriter.j);
      }
    }
    Object localObject2 = paramMethodWriter.a(Handle.i);
    Object localObject1 = paramMethodWriter.a(Handle.b);
    int m = ((Label)localObject2).e();
    int k = ((Label)localObject1).e();
    Object localObject3;
    Object localObject4;
    boolean bool;
    Object localObject5;
    if ((((Label)localObject2).get() != null) && (((Label)localObject2).equals()))
    {
      localObject2 = ((Label)localObject2).get().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Label)((Iterator)localObject2).next();
        localObject4 = a;
        int n = paramInt + 1;
        bool = a(n, (MethodWriter)localObject4);
        if ((((MethodWriter)localObject4).h()) && (bool)) {
          f.a(n, (MethodWriter)localObject4, paramD, new ClassWriter(), ClassWriter.j);
        }
        if (localObject3 == j)
        {
          localObject5 = a.b;
          if ((localObject5 != null) && (((Label)localObject5).equals())) {}
        }
        else
        {
          if (localObject3 != a) {
            break label263;
          }
          localObject5 = j.b;
          if ((localObject5 == null) || (!((Label)localObject5).equals())) {
            break label263;
          }
        }
        j = 1;
        break label265;
        label263:
        j = 0;
        label265:
        localObject5 = ((MethodWriter)localObject4).isEmpty();
        Object localObject6 = adapters.c.a;
        if ((localObject5 == localObject6) && (!bool))
        {
          if ((((MethodWriter)localObject4).isEmpty() == localObject6) && (B >= 0) && (top >= 0) && ((((MethodWriter)localObject4).iterator() == 8) || ((i == 0) && (((MethodWriter)localObject4).doubleValue() == 0.0F))) && (!((MethodWriter)localObject4).equals()) && (!((MethodWriter)localObject4).indexOf()) && (j != 0) && (!((MethodWriter)localObject4).equals())) {
            a(n, paramMethodWriter, paramD, (MethodWriter)localObject4);
          }
        }
        else if (!((MethodWriter)localObject4).h())
        {
          localObject5 = j;
          if ((localObject3 == localObject5) && (a.b == null))
          {
            j = ((Label)localObject5).a() + m;
            ((MethodWriter)localObject4).b(j, ((MethodWriter)localObject4).getValue() + j);
          }
          for (;;)
          {
            a(n, (MethodWriter)localObject4, paramD);
            break;
            localObject6 = a;
            if ((localObject3 != localObject6) || (b != null)) {
              break label502;
            }
            j = m - ((Label)localObject6).a();
            ((MethodWriter)localObject4).b(j - ((MethodWriter)localObject4).getValue(), j);
          }
          label502:
          if ((j != 0) && (!((MethodWriter)localObject4).equals())) {
            a(n, paramD, (MethodWriter)localObject4);
          }
        }
      }
    }
    if ((paramMethodWriter instanceof i)) {
      return;
    }
    if ((((Label)localObject1).get() != null) && (((Label)localObject1).equals()))
    {
      localObject1 = ((Label)localObject1).get().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Label)((Iterator)localObject1).next();
        localObject3 = a;
        m = paramInt + 1;
        bool = a(m, (MethodWriter)localObject3);
        if ((((MethodWriter)localObject3).h()) && (bool)) {
          f.a(m, (MethodWriter)localObject3, paramD, new ClassWriter(), ClassWriter.j);
        }
        if (localObject2 == j)
        {
          localObject4 = a.b;
          if ((localObject4 != null) && (((Label)localObject4).equals())) {}
        }
        else
        {
          if (localObject2 != a) {
            break label705;
          }
          localObject4 = j.b;
          if ((localObject4 == null) || (!((Label)localObject4).equals())) {
            break label705;
          }
        }
        j = 1;
        break label707;
        label705:
        j = 0;
        label707:
        localObject4 = ((MethodWriter)localObject3).isEmpty();
        localObject5 = adapters.c.a;
        if ((localObject4 == localObject5) && (!bool))
        {
          if ((((MethodWriter)localObject3).isEmpty() == localObject5) && (B >= 0) && (top >= 0) && ((((MethodWriter)localObject3).iterator() == 8) || ((i == 0) && (((MethodWriter)localObject3).doubleValue() == 0.0F))) && (!((MethodWriter)localObject3).equals()) && (!((MethodWriter)localObject3).indexOf()) && (j != 0) && (!((MethodWriter)localObject3).equals())) {
            a(m, paramMethodWriter, paramD, (MethodWriter)localObject3);
          }
        }
        else if (!((MethodWriter)localObject3).h())
        {
          localObject4 = j;
          if ((localObject2 == localObject4) && (a.b == null))
          {
            j = ((Label)localObject4).a() + k;
            ((MethodWriter)localObject3).b(j, ((MethodWriter)localObject3).getValue() + j);
            a(m, (MethodWriter)localObject3, paramD);
          }
          else
          {
            localObject5 = a;
            if ((localObject2 == localObject5) && (b == null))
            {
              j = k - ((Label)localObject5).a();
              ((MethodWriter)localObject3).b(j - ((MethodWriter)localObject3).getValue(), j);
              try
              {
                a(m, (MethodWriter)localObject3, paramD);
              }
              catch (Throwable paramMethodWriter)
              {
                throw paramMethodWriter;
              }
            }
            else if ((j != 0) && (!((MethodWriter)localObject3).equals()))
            {
              a(m, paramD, (MethodWriter)localObject3);
            }
          }
        }
      }
    }
    localObject1 = paramMethodWriter.a(Handle.d);
    if ((((Label)localObject1).get() != null) && (((Label)localObject1).equals()))
    {
      j = ((Label)localObject1).e();
      localObject1 = ((Label)localObject1).get().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Label)((Iterator)localObject1).next();
        localObject3 = a;
        k = paramInt + 1;
        bool = a(k, (MethodWriter)localObject3);
        if ((((MethodWriter)localObject3).h()) && (bool)) {
          f.a(k, (MethodWriter)localObject3, paramD, new ClassWriter(), ClassWriter.j);
        }
        if (((((MethodWriter)localObject3).isEmpty() != adapters.c.a) || (bool)) && (!((MethodWriter)localObject3).h()) && (localObject2 == d))
        {
          ((MethodWriter)localObject3).set(((Label)localObject2).a() + j);
          a(k, (MethodWriter)localObject3, paramD);
        }
      }
    }
    paramMethodWriter.visitTryCatchBlock();
  }
  
  private static void a(int paramInt, MethodWriter paramMethodWriter1, d paramD, MethodWriter paramMethodWriter2)
  {
    float f = paramMethodWriter2.visitAttribute();
    int m = j.b.e() + j.a();
    int n = a.b.e() - a.a();
    if (n >= m)
    {
      int k = paramMethodWriter2.getValue();
      int j = k;
      if (paramMethodWriter2.iterator() != 8)
      {
        int i1 = i;
        if (i1 == 2)
        {
          if (!(paramMethodWriter1 instanceof f)) {
            paramMethodWriter1 = paramMethodWriter1.l();
          }
          j = (int)(f * 0.5F * paramMethodWriter1.getValue());
        }
        else
        {
          j = k;
          if (i1 == 0) {
            j = n - m;
          }
        }
        k = Math.max(top, j);
        j = k;
        i1 = B;
        if (i1 > 0) {
          j = Math.min(i1, k);
        }
      }
      k = m + (int)(f * (n - m - j) + 0.5F);
      paramMethodWriter2.b(k, j + k);
      a(paramInt + 1, paramMethodWriter2, paramD);
    }
  }
  
  private static void a(int paramInt, MethodWriter paramMethodWriter1, d paramD, MethodWriter paramMethodWriter2, boolean paramBoolean)
  {
    float f = paramMethodWriter2.offset();
    int m = b.b.e() + b.a();
    int n = c.b.e() - c.a();
    if (n >= m)
    {
      int k = paramMethodWriter2.get();
      int j = k;
      if (paramMethodWriter2.iterator() != 8)
      {
        int i1 = h;
        if (i1 == 2)
        {
          if (!(paramMethodWriter1 instanceof f)) {
            paramMethodWriter1 = paramMethodWriter1.l();
          }
          j = paramMethodWriter1.get();
          j = (int)(paramMethodWriter2.offset() * 0.5F * j);
        }
        else
        {
          j = k;
          if (i1 == 0) {
            j = n - m;
          }
        }
        k = Math.max(z, j);
        j = k;
        i1 = A;
        if (i1 > 0) {
          j = Math.min(i1, k);
        }
      }
      k = m + (int)(f * (n - m - j) + 0.5F);
      paramMethodWriter2.add(k, j + k);
      a(paramInt + 1, paramMethodWriter2, paramD, paramBoolean);
    }
  }
  
  private static void a(int paramInt, MethodWriter paramMethodWriter, d paramD, boolean paramBoolean)
  {
    if (paramMethodWriter.visitMaxs()) {
      return;
    }
    i += 1;
    int j;
    if ((!(paramMethodWriter instanceof f)) && (paramMethodWriter.h()))
    {
      j = paramInt + 1;
      if (a(j, paramMethodWriter)) {
        f.a(j, paramMethodWriter, paramD, new ClassWriter(), ClassWriter.j);
      }
    }
    Object localObject2 = paramMethodWriter.a(Handle.c);
    Object localObject1 = paramMethodWriter.a(Handle.a);
    int m = ((Label)localObject2).e();
    int k = ((Label)localObject1).e();
    Object localObject3;
    Object localObject4;
    boolean bool;
    Object localObject5;
    if ((((Label)localObject2).get() != null) && (((Label)localObject2).equals()))
    {
      localObject2 = ((Label)localObject2).get().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Label)((Iterator)localObject2).next();
        localObject4 = a;
        int n = paramInt + 1;
        bool = a(n, (MethodWriter)localObject4);
        if ((((MethodWriter)localObject4).h()) && (bool)) {
          f.a(n, (MethodWriter)localObject4, paramD, new ClassWriter(), ClassWriter.j);
        }
        if (localObject3 == b)
        {
          localObject5 = c.b;
          if ((localObject5 != null) && (((Label)localObject5).equals())) {}
        }
        else
        {
          if (localObject3 != c) {
            break label267;
          }
          localObject5 = b.b;
          if ((localObject5 == null) || (!((Label)localObject5).equals())) {
            break label267;
          }
        }
        j = 1;
        break label270;
        label267:
        j = 0;
        label270:
        localObject5 = ((MethodWriter)localObject4).charAt();
        Object localObject6 = adapters.c.a;
        if ((localObject5 == localObject6) && (!bool))
        {
          if ((((MethodWriter)localObject4).charAt() == localObject6) && (A >= 0) && (z >= 0) && ((((MethodWriter)localObject4).iterator() == 8) || ((h == 0) && (((MethodWriter)localObject4).doubleValue() == 0.0F))) && (!((MethodWriter)localObject4).f()) && (!((MethodWriter)localObject4).indexOf()) && (j != 0) && (!((MethodWriter)localObject4).f())) {
            a(n, paramMethodWriter, paramD, (MethodWriter)localObject4, paramBoolean);
          }
        }
        else {
          if (((MethodWriter)localObject4).h()) {
            continue;
          }
        }
        for (;;)
        {
          localObject5 = b;
          if ((localObject3 == localObject5) && (c.b == null))
          {
            j = ((Label)localObject5).a() + m;
            ((MethodWriter)localObject4).add(j, ((MethodWriter)localObject4).get() + j);
          }
          for (;;)
          {
            a(n, (MethodWriter)localObject4, paramD, paramBoolean);
            break;
            localObject6 = c;
            if ((localObject3 != localObject6) || (b != null)) {
              break label516;
            }
            j = m - ((Label)localObject6).a();
            ((MethodWriter)localObject4).add(j - ((MethodWriter)localObject4).get(), j);
          }
          label516:
          if ((j != 0) && (!((MethodWriter)localObject4).f())) {
            a(n, paramD, (MethodWriter)localObject4, paramBoolean);
          }
        }
      }
    }
    if ((paramMethodWriter instanceof i)) {
      return;
    }
    if ((((Label)localObject1).get() != null) && (((Label)localObject1).equals()))
    {
      localObject1 = ((Label)localObject1).get().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Label)((Iterator)localObject1).next();
        localObject3 = a;
        m = paramInt + 1;
        bool = a(m, (MethodWriter)localObject3);
        if ((((MethodWriter)localObject3).h()) && (bool)) {
          f.a(m, (MethodWriter)localObject3, paramD, new ClassWriter(), ClassWriter.j);
        }
        if (localObject2 == b)
        {
          localObject4 = c.b;
          if ((localObject4 != null) && (((Label)localObject4).equals())) {}
        }
        else
        {
          if (localObject2 != c) {
            break label722;
          }
          localObject4 = b.b;
          if ((localObject4 == null) || (!((Label)localObject4).equals())) {
            break label722;
          }
        }
        j = 1;
        break label725;
        label722:
        j = 0;
        label725:
        localObject4 = ((MethodWriter)localObject3).charAt();
        localObject5 = adapters.c.a;
        if ((localObject4 == localObject5) && (!bool))
        {
          if ((((MethodWriter)localObject3).charAt() == localObject5) && (A >= 0) && (z >= 0) && ((((MethodWriter)localObject3).iterator() == 8) || ((h == 0) && (((MethodWriter)localObject3).doubleValue() == 0.0F))) && (!((MethodWriter)localObject3).f()) && (!((MethodWriter)localObject3).indexOf()) && (j != 0) && (!((MethodWriter)localObject3).f())) {
            a(m, paramMethodWriter, paramD, (MethodWriter)localObject3, paramBoolean);
          }
        }
        else if (!((MethodWriter)localObject3).h())
        {
          localObject4 = b;
          if ((localObject2 == localObject4) && (c.b == null))
          {
            j = ((Label)localObject4).a() + k;
            ((MethodWriter)localObject3).add(j, ((MethodWriter)localObject3).get() + j);
          }
          for (;;)
          {
            a(m, (MethodWriter)localObject3, paramD, paramBoolean);
            break;
            localObject5 = c;
            if ((localObject2 != localObject5) || (b != null)) {
              break label971;
            }
            j = k - ((Label)localObject5).a();
            ((MethodWriter)localObject3).add(j - ((MethodWriter)localObject3).get(), j);
          }
          label971:
          if ((j != 0) && (!((MethodWriter)localObject3).f())) {
            a(m, paramD, (MethodWriter)localObject3, paramBoolean);
          }
        }
      }
    }
    paramMethodWriter.visitLineNumber();
  }
  
  private static void a(int paramInt1, h paramH, d paramD, int paramInt2, boolean paramBoolean)
  {
    if (paramH.a())
    {
      paramInt1 += 1;
      if (paramInt2 == 0)
      {
        a(paramInt1, paramH, paramD, paramBoolean);
        return;
      }
      a(paramInt1, paramH, paramD);
    }
  }
  
  private static void a(int paramInt, d paramD, MethodWriter paramMethodWriter)
  {
    float f = paramMethodWriter.visitAttribute();
    int n = j.b.e();
    int j = n;
    int m = a.b.e();
    int k = m;
    int i2 = j.a();
    int i1 = a.a();
    if (n == m)
    {
      f = 0.5F;
    }
    else
    {
      j = i2 + n;
      k = m - i1;
    }
    i1 = paramMethodWriter.getValue();
    m = k - j - i1;
    if (j > k) {
      m = j - k - i1;
    }
    if (m > 0) {
      f = f * m + 0.5F;
    } else {
      f *= m;
    }
    i2 = (int)f;
    m = j + i2;
    n = m + i1;
    if (j > k)
    {
      m = j - i2;
      n = m - i1;
    }
    paramMethodWriter.b(m, n);
    a(paramInt + 1, paramMethodWriter, paramD);
  }
  
  private static void a(int paramInt, d paramD, MethodWriter paramMethodWriter, boolean paramBoolean)
  {
    float f = paramMethodWriter.offset();
    int n = b.b.e();
    int j = n;
    int m = c.b.e();
    int k = m;
    int i2 = b.a();
    int i1 = c.a();
    if (n == m)
    {
      f = 0.5F;
    }
    else
    {
      j = i2 + n;
      k = m - i1;
    }
    n = paramMethodWriter.get();
    m = k - j - n;
    if (j > k) {
      m = j - k - n;
    }
    if (m > 0) {
      f = f * m + 0.5F;
    } else {
      f *= m;
    }
    i1 = (int)f + j;
    m = i1 + n;
    if (j > k) {
      m = i1 - n;
    }
    paramMethodWriter.add(i1, m);
    a(paramInt + 1, paramMethodWriter, paramD, paramBoolean);
  }
  
  public static void a(f paramF, d paramD)
  {
    Object localObject2 = paramF.charAt();
    Object localObject1 = paramF.isEmpty();
    i = 0;
    h = 0;
    paramF.set();
    ArrayList localArrayList = paramF.read();
    int i2 = localArrayList.size();
    int j = 0;
    while (j < i2)
    {
      ((MethodWriter)localArrayList.get(j)).set();
      j += 1;
    }
    boolean bool = paramF.b();
    if (localObject2 == adapters.c.b) {
      paramF.add(0, paramF.get());
    } else {
      paramF.visitTableSwitchInsn(0);
    }
    int m = 0;
    j = 0;
    int n;
    int i1;
    for (int k = 0; m < i2; k = i1)
    {
      localObject2 = (MethodWriter)localArrayList.get(m);
      if ((localObject2 instanceof i))
      {
        localObject2 = (i)localObject2;
        n = j;
        i1 = k;
        if (((i)localObject2).b() == 1)
        {
          if (((i)localObject2).i() != -1) {
            j = ((i)localObject2).i();
          }
          for (;;)
          {
            ((i)localObject2).e(j);
            break;
            if ((((i)localObject2).n() != -1) && (paramF.d()))
            {
              j = paramF.get() - ((i)localObject2).n();
            }
            else
            {
              if (!paramF.d()) {
                break;
              }
              j = (int)(((i)localObject2).g() * paramF.get() + 0.5F);
            }
          }
          n = 1;
          i1 = k;
        }
      }
      else
      {
        n = j;
        i1 = k;
        if ((localObject2 instanceof h))
        {
          n = j;
          i1 = k;
          if (((h)localObject2).c() == 0)
          {
            i1 = 1;
            n = j;
          }
        }
      }
      m += 1;
      j = n;
    }
    if (j != 0)
    {
      j = 0;
      while (j < i2)
      {
        localObject2 = (MethodWriter)localArrayList.get(j);
        if ((localObject2 instanceof i))
        {
          localObject2 = (i)localObject2;
          if (((i)localObject2).b() == 1) {
            a(0, (MethodWriter)localObject2, paramD, bool);
          }
        }
        j += 1;
      }
    }
    a(0, paramF, paramD, bool);
    if (k != 0)
    {
      j = 0;
      while (j < i2)
      {
        localObject2 = (MethodWriter)localArrayList.get(j);
        if ((localObject2 instanceof h))
        {
          localObject2 = (h)localObject2;
          if (((h)localObject2).c() == 0) {
            a(0, (h)localObject2, paramD, 0, bool);
          }
        }
        j += 1;
      }
    }
    if (localObject1 == adapters.c.b) {
      paramF.b(0, paramF.getValue());
    } else {
      paramF.visitMaxs(0);
    }
    m = 0;
    j = 0;
    for (k = 0; m < i2; k = i1)
    {
      localObject1 = (MethodWriter)localArrayList.get(m);
      if ((localObject1 instanceof i))
      {
        localObject1 = (i)localObject1;
        n = j;
        i1 = k;
        if (((i)localObject1).b() == 0)
        {
          if (((i)localObject1).i() != -1) {
            j = ((i)localObject1).i();
          }
          for (;;)
          {
            ((i)localObject1).e(j);
            break;
            if ((((i)localObject1).n() != -1) && (paramF.m()))
            {
              j = paramF.getValue() - ((i)localObject1).n();
            }
            else
            {
              if (!paramF.m()) {
                break;
              }
              j = (int)(((i)localObject1).g() * paramF.getValue() + 0.5F);
            }
          }
          n = 1;
          i1 = k;
        }
      }
      else
      {
        n = j;
        i1 = k;
        if ((localObject1 instanceof h))
        {
          n = j;
          i1 = k;
          if (((h)localObject1).c() == 1)
          {
            i1 = 1;
            n = j;
          }
        }
      }
      m += 1;
      j = n;
    }
    if (j != 0)
    {
      j = 0;
      while (j < i2)
      {
        localObject1 = (MethodWriter)localArrayList.get(j);
        if ((localObject1 instanceof i))
        {
          localObject1 = (i)localObject1;
          if (((i)localObject1).b() == 0) {
            a(1, (MethodWriter)localObject1, paramD);
          }
        }
        j += 1;
      }
    }
    a(0, paramF, paramD);
    if (k != 0)
    {
      j = 0;
      while (j < i2)
      {
        paramF = (MethodWriter)localArrayList.get(j);
        if ((paramF instanceof h))
        {
          paramF = (h)paramF;
          if (paramF.c() == 1) {
            a(0, paramF, paramD, 1, bool);
          }
        }
        j += 1;
      }
    }
    j = 0;
    while (j < i2)
    {
      paramF = (MethodWriter)localArrayList.get(j);
      if ((paramF.h()) && (a(0, paramF)))
      {
        f.a(0, paramF, paramD, a, ClassWriter.j);
        if ((paramF instanceof i))
        {
          if (((i)paramF).b() != 0)
          {
            a(0, paramF, paramD, bool);
            break label863;
          }
        }
        else {
          a(0, paramF, paramD, bool);
        }
        a(0, paramF, paramD);
      }
      label863:
      j += 1;
    }
  }
  
  private static boolean a(int paramInt, MethodWriter paramMethodWriter)
  {
    adapters.c localC2 = paramMethodWriter.charAt();
    adapters.c localC1 = paramMethodWriter.isEmpty();
    if (paramMethodWriter.l() != null) {
      localObject = (f)paramMethodWriter.l();
    } else {
      localObject = null;
    }
    adapters.c localC3;
    if (localObject != null)
    {
      ((MethodWriter)localObject).charAt();
      localC3 = adapters.c.b;
    }
    if (localObject != null)
    {
      ((MethodWriter)localObject).isEmpty();
      localObject = adapters.c.b;
    }
    Object localObject = adapters.c.b;
    if ((localC2 != localObject) && (!paramMethodWriter.d()) && (localC2 != adapters.c.c))
    {
      localC3 = adapters.c.a;
      if (((localC2 != localC3) || (h != 0) || (n != 0.0F) || (!paramMethodWriter.c(0))) && ((localC2 != localC3) || (h != 1) || (!paramMethodWriter.put(0, paramMethodWriter.get()))))
      {
        paramInt = 0;
        break label157;
      }
    }
    paramInt = 1;
    label157:
    if ((localC1 != localObject) && (!paramMethodWriter.m()) && (localC1 != adapters.c.c))
    {
      localObject = adapters.c.a;
      if (((localC1 != localObject) || (i != 0) || (n != 0.0F) || (!paramMethodWriter.c(1))) && ((localC1 != localObject) || (i != 1) || (!paramMethodWriter.put(1, paramMethodWriter.getValue()))))
      {
        j = 0;
        break label248;
      }
    }
    int j = 1;
    label248:
    if (n > 0.0F)
    {
      if (paramInt != 0) {
        break label277;
      }
      if (j != 0) {
        return true;
      }
    }
    if ((paramInt != 0) && (j != 0))
    {
      return true;
      label277:
      return true;
    }
    return false;
  }
}
