package androidplot;

import adapters.MethodWriter;
import adapters.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
{
  private d A = null;
  private ClassWriter a = new ClassWriter();
  private adapters.f b;
  ArrayList c = new ArrayList();
  private boolean e = true;
  private adapters.f f;
  private ArrayList l = new ArrayList();
  private ArrayList n = new ArrayList();
  private boolean p = true;
  
  public f(adapters.f paramF)
  {
    b = paramF;
    f = paramF;
  }
  
  private int a(adapters.f paramF, int paramInt)
  {
    int j = c.size();
    long l1 = 0L;
    int i = 0;
    while (i < j)
    {
      l1 = Math.max(l1, ((e)c.get(i)).a(paramF, paramInt));
      i += 1;
    }
    return (int)l1;
  }
  
  private void a(MethodWriter paramMethodWriter, c paramC1, int paramInt1, c paramC2, int paramInt2)
  {
    ClassWriter localClassWriter = a;
    c = paramC1;
    b = paramC2;
    i = paramInt1;
    f = paramInt2;
    A.a(paramMethodWriter, localClassWriter);
    paramMethodWriter.append(a.d);
    paramMethodWriter.get(a.a);
    paramMethodWriter.put(a.e);
    paramMethodWriter.visitFieldInsn(a.q);
  }
  
  private void a(Label paramLabel1, int paramInt1, int paramInt2, Label paramLabel2, ArrayList paramArrayList, e paramE)
  {
    Object localObject1 = a;
    if (f == null)
    {
      paramLabel1 = b;
      if (localObject1 != l)
      {
        if (localObject1 == f) {
          return;
        }
        paramLabel1 = paramE;
        if (paramE == null)
        {
          paramLabel1 = new e((h)localObject1, paramInt2);
          paramArrayList.add(paramLabel1);
        }
        f = paramLabel1;
        paramLabel1.a((h)localObject1);
        paramE = c.f.iterator();
        Object localObject2;
        while (paramE.hasNext())
        {
          localObject2 = (l)paramE.next();
          if ((localObject2 instanceof Label)) {
            a((Label)localObject2, paramInt1, 0, paramLabel2, paramArrayList, paramLabel1);
          }
        }
        paramE = b.f.iterator();
        while (paramE.hasNext())
        {
          localObject2 = (l)paramE.next();
          if ((localObject2 instanceof Label)) {
            a((Label)localObject2, paramInt1, 1, paramLabel2, paramArrayList, paramLabel1);
          }
        }
        if ((paramInt1 == 1) && ((localObject1 instanceof m)))
        {
          paramE = a.f.iterator();
          while (paramE.hasNext())
          {
            localObject2 = (l)paramE.next();
            if ((localObject2 instanceof Label)) {
              a((Label)localObject2, paramInt1, 2, paramLabel2, paramArrayList, paramLabel1);
            }
          }
        }
        paramE = c.c.iterator();
        while (paramE.hasNext())
        {
          localObject2 = (Label)paramE.next();
          if (localObject2 == paramLabel2) {
            i = true;
          }
          a((Label)localObject2, paramInt1, 0, paramLabel2, paramArrayList, paramLabel1);
        }
        paramE = b.c.iterator();
        while (paramE.hasNext())
        {
          localObject2 = (Label)paramE.next();
          if (localObject2 == paramLabel2) {
            i = true;
          }
          a((Label)localObject2, paramInt1, 1, paramLabel2, paramArrayList, paramLabel1);
        }
        if ((paramInt1 == 1) && ((localObject1 instanceof m)))
        {
          paramE = a.c.iterator();
          while (paramE.hasNext())
          {
            localObject1 = (Label)paramE.next();
            try
            {
              a((Label)localObject1, paramInt1, 2, paramLabel2, paramArrayList, paramLabel1);
            }
            catch (Throwable paramLabel1)
            {
              throw paramLabel1;
            }
          }
        }
      }
    }
  }
  
  private void a(h paramH, int paramInt, ArrayList paramArrayList)
  {
    Object localObject = c.f.iterator();
    l localL;
    while (((Iterator)localObject).hasNext())
    {
      localL = (l)((Iterator)localObject).next();
      if ((localL instanceof Label)) {
        a((Label)localL, paramInt, 0, b, paramArrayList, null);
      } else if ((localL instanceof h)) {
        a(c, paramInt, 0, b, paramArrayList, null);
      }
    }
    localObject = b.f.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localL = (l)((Iterator)localObject).next();
      if ((localL instanceof Label)) {
        a((Label)localL, paramInt, 1, c, paramArrayList, null);
      } else if ((localL instanceof h)) {
        a(b, paramInt, 1, c, paramArrayList, null);
      }
    }
    if (paramInt == 1)
    {
      paramH = a.f.iterator();
      while (paramH.hasNext())
      {
        localObject = (l)paramH.next();
        if ((localObject instanceof Label)) {
          a((Label)localObject, paramInt, 2, null, paramArrayList, null);
        }
      }
    }
  }
  
  private boolean a(adapters.f paramF)
  {
    Iterator localIterator = b.iterator();
    if (localIterator.hasNext())
    {
      MethodWriter localMethodWriter = (MethodWriter)localIterator.next();
      Object localObject1 = t;
      Object localObject3 = localObject1[0];
      Object localObject2 = localObject1[1];
      if (localMethodWriter.iterator() == 8) {}
      for (;;)
      {
        k = true;
        break;
        if ((m < 1.0F) && (localObject3 == c.a)) {
          h = 2;
        }
        if ((g < 1.0F) && (localObject2 == c.a)) {
          i = 2;
        }
        if (localMethodWriter.doubleValue() > 0.0F)
        {
          localObject1 = c.a;
          if ((localObject3 == localObject1) && ((localObject2 == c.c) || (localObject2 == c.b)))
          {
            h = 3;
          }
          else
          {
            if ((localObject2 == localObject1) && ((localObject3 == c.c) || (localObject3 == c.b))) {}
            do
            {
              i = 3;
              break;
              if ((localObject3 != localObject1) || (localObject2 != localObject1)) {
                break;
              }
              if (h == 0) {
                h = 3;
              }
            } while (i == 0);
          }
        }
        c localC = c.a;
        localObject1 = localObject3;
        if (localObject3 == localC)
        {
          localObject1 = localObject3;
          if (h == 1) {
            if (b.b != null)
            {
              localObject1 = localObject3;
              if (c.b != null) {}
            }
            else
            {
              localObject1 = c.c;
            }
          }
        }
        localObject3 = localObject2;
        if (localObject2 == localC)
        {
          localObject3 = localObject2;
          if (i == 1) {
            if (j.b != null)
            {
              localObject3 = localObject2;
              if (a.b != null) {}
            }
            else
            {
              localObject3 = c.c;
            }
          }
        }
        localObject2 = localObject3;
        Object localObject4 = l;
        g = ((c)localObject1);
        int i = h;
        h = i;
        localObject4 = f;
        g = ((c)localObject3);
        int j = i;
        h = j;
        localObject4 = c.d;
        if (((localObject1 != localObject4) && (localObject1 != c.b) && (localObject1 != c.c)) || ((localObject2 != localObject4) && (localObject2 != c.b) && (localObject2 != c.c)))
        {
          if (localObject1 == localC)
          {
            localObject3 = c.c;
            if ((localObject2 == localObject3) || (localObject2 == c.b)) {
              if (i == 3)
              {
                if (localObject2 == localObject3) {
                  a(localMethodWriter, (c)localObject3, 0, (c)localObject3, 0);
                }
                i = localMethodWriter.getValue();
                j = i;
                i = (int)(i * n + 0.5F);
              }
            }
          }
          label547:
          label589:
          Object localObject5;
          label704:
          label715:
          float f2;
          float f1;
          for (;;)
          {
            localObject1 = c.b;
            localObject2 = localObject1;
            break label1214;
            if (i == 1)
            {
              a(localMethodWriter, (c)localObject3, 0, (c)localObject2, 0);
              localObject1 = l.d;
              i = localMethodWriter.get();
              a = i;
              break;
            }
            if (i == 2)
            {
              localObject5 = t[0];
              localObject3 = c.b;
              if ((localObject5 != localObject3) && (localObject5 != localObject4)) {
                break label715;
              }
              i = (int)(m * paramF.get() + 0.5F);
              j = localMethodWriter.getValue();
              localObject1 = localObject3;
            }
            else
            {
              localObject5 = u;
              if ((0b != null) && (1b != null)) {
                break label715;
              }
              i = 0;
              j = 0;
              localObject1 = localObject3;
            }
            localObject3 = localObject1;
            localObject1 = localObject2;
            localObject2 = localObject3;
            break label1214;
            if (localObject2 != localC) {
              break label959;
            }
            localObject3 = c.c;
            if ((localObject1 != localObject3) && (localObject1 != c.b)) {
              break label959;
            }
            if (j != 3) {
              break label813;
            }
            if (localObject1 == localObject3) {
              a(localMethodWriter, (c)localObject3, 0, (c)localObject3, 0);
            }
            j = localMethodWriter.get();
            i = j;
            f2 = n;
            f1 = f2;
            if (localMethodWriter.readInt() == -1) {
              f1 = 1.0F / f2;
            }
            j = (int)(j * f1 + 0.5F);
          }
          label813:
          if (j == 1) {
            a(localMethodWriter, (c)localObject1, 0, (c)localObject3, 0);
          }
          for (;;)
          {
            localObject1 = f.d;
            i = localMethodWriter.getValue();
            break label589;
            if (j == 2)
            {
              localObject5 = t[1];
              localObject3 = c.b;
              if ((localObject5 == localObject3) || (localObject5 == localObject4))
              {
                f1 = g;
                i = localMethodWriter.get();
                f2 = paramF.getValue();
                localObject2 = localObject1;
                localObject1 = localObject3;
                j = (int)(f1 * f2 + 0.5F);
                break label1214;
              }
            }
            else
            {
              localObject4 = u;
              if ((2b == null) || (3b == null))
              {
                i = 0;
                j = 0;
                break label704;
              }
            }
            label959:
            if ((localObject1 != localC) || (localObject2 != localC)) {
              break;
            }
            if ((i != 1) && (j != 1))
            {
              if ((j != 2) || (i != 2)) {
                break;
              }
              localObject2 = t;
              localObject3 = localObject2[0];
              localObject1 = c.b;
              if ((localObject3 != localObject1) || (localObject2[1] != localObject1)) {
                break;
              }
              f1 = m;
              f2 = g;
              i = (int)(f1 * paramF.get() + 0.5F);
              j = (int)(f2 * paramF.getValue() + 0.5F);
              break label547;
            }
            localObject1 = c.c;
            a(localMethodWriter, (c)localObject1, 0, (c)localObject1, 0);
            l.d.a = localMethodWriter.get();
          }
        }
        if (localObject1 == localObject4)
        {
          i = paramF.get() - b.r - c.r;
          localObject1 = c.b;
        }
        else
        {
          i = localMethodWriter.get();
        }
        if (localObject2 == localObject4)
        {
          j = paramF.getValue() - j.r - a.r;
          localObject3 = c.b;
        }
        else
        {
          j = localMethodWriter.getValue();
          localObject3 = localObject2;
        }
        localObject2 = localObject1;
        localObject1 = localObject3;
        label1214:
        a(localMethodWriter, (c)localObject2, i, (c)localObject1, j);
        l.d.a(localMethodWriter.get());
        f.d.a(localMethodWriter.getValue());
      }
    }
    return false;
  }
  
  public void a()
  {
    Iterator localIterator = b.b.iterator();
    while (localIterator.hasNext())
    {
      MethodWriter localMethodWriter = (MethodWriter)localIterator.next();
      if (!k)
      {
        Object localObject2 = t;
        int k = 0;
        Object localObject1 = localObject2[0];
        Object localObject3 = localObject2[1];
        int i = h;
        int m = i;
        c localC = c.c;
        if ((localObject1 != localC) && ((localObject1 != c.a) || (i != 1))) {
          i = 0;
        } else {
          i = 1;
        }
        int j;
        if (localObject3 != localC)
        {
          j = k;
          if (localObject3 == c.a)
          {
            j = k;
            if (m != 1) {}
          }
        }
        else
        {
          j = 1;
        }
        localObject2 = l.d;
        boolean bool1 = b;
        ByteVector localByteVector = f.d;
        boolean bool2 = b;
        if ((bool1) && (bool2))
        {
          localObject1 = c.b;
          a(localMethodWriter, (c)localObject1, g, (c)localObject1, g);
          k = true;
        }
        else if ((bool1) && (j != 0))
        {
          a(localMethodWriter, c.b, g, localC, g);
          if (localObject3 == c.a)
          {
            localObject1 = f.d;
            i = localMethodWriter.getValue();
            label273:
            a = i;
          }
          else
          {
            localObject1 = f.d;
          }
        }
        else
        {
          for (i = localMethodWriter.getValue();; i = localMethodWriter.get())
          {
            ((ByteVector)localObject1).a(i);
            break;
            if ((!bool2) || (i == 0)) {
              break label383;
            }
            a(localMethodWriter, localC, g, c.b, g);
            if (localObject1 == c.a)
            {
              localObject1 = l.d;
              i = localMethodWriter.get();
              break label273;
            }
            localObject1 = l.d;
          }
        }
        label383:
        if (k)
        {
          localObject1 = f.b;
          if (localObject1 != null) {
            ((ByteVector)localObject1).a(localMethodWriter.readUnsignedShort());
          }
        }
      }
    }
  }
  
  public void a(ArrayList paramArrayList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a9 = a8\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public boolean a(boolean paramBoolean)
  {
    boolean bool3 = true;
    boolean bool2 = paramBoolean & true;
    if ((e) || (p))
    {
      localObject1 = b.b.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MethodWriter)((Iterator)localObject1).next();
        ((MethodWriter)localObject2).e();
        k = false;
        l.d();
        f.d();
      }
      b.e();
      localObject1 = b;
      k = false;
      l.d();
      b.f.d();
      p = false;
    }
    if (a(f)) {
      return false;
    }
    b.equals(0);
    b.setText(0);
    Object localObject1 = b.f(0);
    Object localObject2 = b.f(1);
    if (e) {
      b();
    }
    int k = b.put();
    int j = b.size();
    b.l.c.a(k);
    b.f.c.a(j);
    a();
    Object localObject3 = c.c;
    boolean bool1;
    if ((localObject1 == localObject3) || (localObject2 == localObject3))
    {
      bool1 = bool2;
      if (bool2)
      {
        localObject3 = l.iterator();
        do
        {
          bool1 = bool2;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
        } while (((h)((Iterator)localObject3).next()).b());
        bool1 = false;
      }
      if ((bool1) && (localObject1 == c.c))
      {
        b.put(c.b);
        localObject3 = b;
        ((MethodWriter)localObject3).append(a((adapters.f)localObject3, 0));
        localObject3 = b;
        l.d.a(((MethodWriter)localObject3).get());
      }
      if ((bool1) && (localObject2 == c.c))
      {
        b.a(c.b);
        localObject3 = b;
        ((MethodWriter)localObject3).get(a((adapters.f)localObject3, 1));
        localObject3 = b;
        f.d.a(((MethodWriter)localObject3).getValue());
      }
    }
    Object localObject4 = b;
    c localC = t[0];
    localObject3 = c.b;
    int i;
    if ((localC != localObject3) && (localC != c.d))
    {
      bool1 = false;
    }
    else
    {
      i = ((MethodWriter)localObject4).get() + k;
      b.l.b.a(i);
      b.l.d.a(i - k);
      a();
      localObject4 = b;
      localC = t[1];
      if ((localC == localObject3) || (localC == c.d))
      {
        i = ((MethodWriter)localObject4).getValue() + j;
        b.f.b.a(i);
        b.f.d.a(i - j);
      }
      a();
      i = 1;
    }
    localObject3 = l.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (h)((Iterator)localObject3).next();
      if ((a != b) || (k)) {
        ((h)localObject4).c();
      }
    }
    localObject3 = l.iterator();
    do
    {
      paramBoolean = bool3;
      if (!((Iterator)localObject3).hasNext()) {
        break;
      }
      localObject4 = (h)((Iterator)localObject3).next();
    } while ((i == 0) && (a == b));
    if (!c.b) {}
    for (;;)
    {
      paramBoolean = false;
      break label773;
      if ((b.b) || ((localObject4 instanceof p))) {
        if ((d.b) || ((localObject4 instanceof b)) || ((localObject4 instanceof p))) {
          break;
        }
      }
    }
    label773:
    b.put((c)localObject1);
    b.a((c)localObject2);
    return paramBoolean;
  }
  
  public boolean a(boolean paramBoolean, int paramInt)
  {
    boolean bool3 = true;
    boolean bool2 = paramBoolean & true;
    c localC1 = b.f(0);
    c localC2 = b.f(1);
    int j = b.put();
    int k = b.size();
    Object localObject2;
    if (bool2)
    {
      localObject1 = c.c;
      if ((localC1 == localObject1) || (localC2 == localObject1))
      {
        localObject1 = l.iterator();
        do
        {
          bool1 = bool2;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (h)((Iterator)localObject1).next();
        } while ((i != paramInt) || (((h)localObject2).b()));
        boolean bool1 = false;
        if (paramInt == 0)
        {
          if ((!bool1) || (localC1 != c.c)) {
            break label260;
          }
          b.put(c.b);
          localObject1 = b;
          ((MethodWriter)localObject1).append(a((adapters.f)localObject1, 0));
          localObject2 = b;
          localObject1 = l.d;
          i = ((MethodWriter)localObject2).get();
        }
        else
        {
          if ((i == 0) || (localC2 != c.c)) {
            break label260;
          }
          b.a(c.b);
          localObject1 = b;
          ((MethodWriter)localObject1).get(a((adapters.f)localObject1, 1));
          localObject2 = b;
          localObject1 = f.d;
          i = ((MethodWriter)localObject2).getValue();
        }
        ((ByteVector)localObject1).a(i);
      }
    }
    label260:
    Object localObject1 = b;
    if (paramInt == 0)
    {
      localObject2 = t[0];
      if ((localObject2 == c.b) || (localObject2 == c.d))
      {
        i = ((MethodWriter)localObject1).get() + j;
        b.l.b.a(i);
        b.l.d.a(i - j);
        break label411;
      }
    }
    else
    {
      localObject2 = t[1];
      if ((localObject2 == c.b) || (localObject2 == c.d)) {
        break label371;
      }
    }
    int i = 0;
    break label413;
    label371:
    i = ((MethodWriter)localObject1).getValue() + k;
    b.f.b.a(i);
    b.f.d.a(i - k);
    label411:
    i = 1;
    label413:
    a();
    localObject1 = l.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (h)((Iterator)localObject1).next();
      if ((i == paramInt) && ((a != b) || (k))) {
        ((h)localObject2).c();
      }
    }
    localObject1 = l.iterator();
    do
    {
      paramBoolean = bool3;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject2 = (h)((Iterator)localObject1).next();
    } while ((i != paramInt) || ((i == 0) && (a == b)));
    if (!c.b) {}
    for (;;)
    {
      paramBoolean = false;
      break label608;
      if (b.b) {
        if (((localObject2 instanceof b)) || (d.b)) {
          break;
        }
      }
    }
    label608:
    b.put(localC1);
    b.a(localC2);
    return paramBoolean;
  }
  
  public void b()
  {
    a(l);
    c.clear();
    e.e = 0;
    a(b.l, 0, c);
    a(b.f, 1, c);
    e = false;
  }
  
  public boolean b(boolean paramBoolean)
  {
    if (e)
    {
      Object localObject1 = b.b.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (MethodWriter)((Iterator)localObject1).next();
        ((MethodWriter)localObject2).e();
        k = false;
        XYPlot localXYPlot = l;
        d.b = false;
        k = false;
        localXYPlot.d();
        localObject2 = f;
        d.b = false;
        k = false;
        ((m)localObject2).d();
      }
      b.e();
      localObject1 = b;
      k = false;
      localObject1 = l;
      d.b = false;
      k = false;
      ((XYPlot)localObject1).d();
      localObject1 = b.f;
      d.b = false;
      k = false;
      ((m)localObject1).d();
      b();
    }
    if (a(f)) {
      return false;
    }
    b.equals(0);
    b.setText(0);
    b.l.c.a(0);
    b.f.c.a(0);
    return true;
  }
  
  public void c()
  {
    p = true;
  }
  
  public void d()
  {
    e = true;
  }
  
  public void d(d paramD)
  {
    A = paramD;
  }
}
