package adapters;

import androidplot.ClassReader;
import androidplot.d;
import androidplot.g;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class f
  extends ByteVector
{
  public androidplot.ClassWriter A = new androidplot.ClassWriter();
  protected tree.ClassWriter a = new tree.ClassWriter();
  protected d b = null;
  private boolean c = false;
  g d = new g(this);
  private boolean e = false;
  int f = 0;
  ClassWriter[] g = new ClassWriter[4];
  private int h;
  public int height = 0;
  private WeakReference i = null;
  private WeakReference j = null;
  public int k = 0;
  public boolean l = false;
  private WeakReference m = null;
  HashSet n = new HashSet();
  public androidplot.f o = new androidplot.f(this);
  public int p = 0;
  public int q = 0;
  int r;
  private boolean s = false;
  int size;
  int state;
  int t;
  ClassWriter[] u = new ClassWriter[4];
  public boolean v = false;
  public boolean w = false;
  private WeakReference x = null;
  private int y = 257;
  public boolean z = false;
  
  public f() {}
  
  private void a(Label paramLabel, tree.Label paramLabel1)
  {
    paramLabel = a.a(paramLabel);
    a.d(paramLabel1, paramLabel, 0, 5);
  }
  
  public static boolean a(int paramInt1, MethodWriter paramMethodWriter, d paramD, androidplot.ClassWriter paramClassWriter, int paramInt2)
  {
    if (paramD == null) {
      return false;
    }
    if ((paramMethodWriter.iterator() != 8) && (!(paramMethodWriter instanceof i)) && (!(paramMethodWriter instanceof h)))
    {
      c = paramMethodWriter.charAt();
      b = paramMethodWriter.isEmpty();
      i = paramMethodWriter.get();
      f = paramMethodWriter.getValue();
      o = false;
      k = paramInt2;
      c localC1 = c;
      c localC2 = c.a;
      if (localC1 == localC2) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (b == localC2) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      int i3;
      if ((paramInt1 != 0) && (n > 0.0F)) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      int i2;
      if ((paramInt2 != 0) && (n > 0.0F)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i1 = paramInt1;
      if (paramInt1 != 0)
      {
        i1 = paramInt1;
        if (paramMethodWriter.c(0))
        {
          i1 = paramInt1;
          if (h == 0)
          {
            i1 = paramInt1;
            if (i3 == 0)
            {
              c = c.c;
              if ((paramInt2 != 0) && (i == 0)) {
                c = c.b;
              }
              i1 = 0;
            }
          }
        }
      }
      paramInt1 = paramInt2;
      if (paramInt2 != 0)
      {
        paramInt1 = paramInt2;
        if (paramMethodWriter.c(1))
        {
          paramInt1 = paramInt2;
          if (i == 0)
          {
            paramInt1 = paramInt2;
            if (i2 == 0)
            {
              b = c.c;
              if ((i1 != 0) && (h == 0)) {
                b = c.b;
              }
              paramInt1 = 0;
            }
          }
        }
      }
      if (paramMethodWriter.d())
      {
        c = c.b;
        i1 = 0;
      }
      if (paramMethodWriter.m())
      {
        b = c.b;
        paramInt1 = 0;
      }
      if (i3 != 0) {
        if (H[0] == 4)
        {
          c = c.b;
        }
        else if (paramInt1 == 0)
        {
          localC1 = b;
          localC2 = c.b;
          if (localC1 == localC2)
          {
            paramInt1 = f;
          }
          else
          {
            c = c.c;
            paramD.a(paramMethodWriter, paramClassWriter);
            paramInt1 = a;
          }
          c = localC2;
          i = ((int)(paramMethodWriter.doubleValue() * paramInt1));
        }
      }
      if (i2 != 0) {
        if (H[1] == 4)
        {
          b = c.b;
        }
        else if (i1 == 0)
        {
          localC1 = c;
          localC2 = c.b;
          if (localC1 == localC2)
          {
            paramInt1 = i;
          }
          else
          {
            b = c.c;
            paramD.a(paramMethodWriter, paramClassWriter);
            paramInt1 = d;
          }
          b = localC2;
          if (paramMethodWriter.readInt() == -1) {
            paramInt1 = (int)(paramInt1 / paramMethodWriter.doubleValue());
          } else {
            paramInt1 = (int)(paramMethodWriter.doubleValue() * paramInt1);
          }
          f = paramInt1;
        }
      }
      paramD.a(paramMethodWriter, paramClassWriter);
      paramMethodWriter.append(d);
      paramMethodWriter.get(a);
      paramMethodWriter.put(e);
      paramMethodWriter.visitFieldInsn(q);
      k = androidplot.ClassWriter.j;
      return o;
    }
    d = 0;
    a = 0;
    return false;
  }
  
  private void b(Label paramLabel, tree.Label paramLabel1)
  {
    paramLabel = a.a(paramLabel);
    a.d(paramLabel, paramLabel1, 0, 5);
  }
  
  private void b(MethodWriter paramMethodWriter)
  {
    int i1 = p;
    ClassWriter[] arrayOfClassWriter = u;
    if (i1 + 1 >= arrayOfClassWriter.length) {
      u = ((ClassWriter[])Arrays.copyOf(arrayOfClassWriter, arrayOfClassWriter.length * 2));
    }
    u[p] = new ClassWriter(paramMethodWriter, 0, b());
    p += 1;
  }
  
  private void c(MethodWriter paramMethodWriter)
  {
    int i1 = q;
    ClassWriter[] arrayOfClassWriter = g;
    if (i1 + 1 >= arrayOfClassWriter.length) {
      g = ((ClassWriter[])Arrays.copyOf(arrayOfClassWriter, arrayOfClassWriter.length * 2));
    }
    g[q] = new ClassWriter(paramMethodWriter, 1, b());
    q += 1;
  }
  
  private void close()
  {
    p = 0;
    q = 0;
  }
  
  public d a()
  {
    return b;
  }
  
  public void a(int paramInt)
  {
    y = paramInt;
    tree.ClassWriter.x = b(512);
  }
  
  void a(Label paramLabel)
  {
    WeakReference localWeakReference = j;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramLabel.e() > ((Label)j.get()).e())) {
      j = new WeakReference(paramLabel);
    }
  }
  
  void a(MethodWriter paramMethodWriter, int paramInt)
  {
    if (paramInt == 0)
    {
      b(paramMethodWriter);
      return;
    }
    if (paramInt == 1) {
      c(paramMethodWriter);
    }
  }
  
  public void a(d paramD)
  {
    b = paramD;
    o.d(paramD);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.a(paramBoolean1, paramBoolean2);
    int i2 = b.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((MethodWriter)b.get(i1)).a(paramBoolean1, paramBoolean2);
      i1 += 1;
    }
  }
  
  public boolean a(tree.ClassWriter paramClassWriter)
  {
    boolean bool = b(64);
    a(paramClassWriter, bool);
    int i3 = b.size();
    int i1 = 0;
    int i2 = 0;
    Object localObject1;
    while (i1 < i3)
    {
      localObject1 = (MethodWriter)b.get(i1);
      ((MethodWriter)localObject1).a(0, false);
      ((MethodWriter)localObject1).a(1, false);
      if ((localObject1 instanceof h)) {
        i2 = 1;
      }
      i1 += 1;
    }
    if (i2 != 0)
    {
      i1 = 0;
      while (i1 < i3)
      {
        localObject1 = (MethodWriter)b.get(i1);
        if ((localObject1 instanceof h)) {
          ((h)localObject1).b();
        }
        i1 += 1;
      }
    }
    n.clear();
    i1 = 0;
    while (i1 < i3)
    {
      localObject1 = (MethodWriter)b.get(i1);
      if (((MethodWriter)localObject1).isPrimitive()) {
        if ((localObject1 instanceof XYPlot)) {
          n.add(localObject1);
        } else {
          ((MethodWriter)localObject1).a(paramClassWriter, bool);
        }
      }
      i1 += 1;
    }
    Object localObject2;
    while (n.size() > 0)
    {
      i1 = n.size();
      localObject1 = n.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (XYPlot)((Iterator)localObject1).next();
        if (((XYPlot)localObject2).a(n))
        {
          ((MethodWriter)localObject2).a(paramClassWriter, bool);
          n.remove(localObject2);
        }
      }
      if (i1 == n.size())
      {
        localObject1 = n.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((MethodWriter)((Iterator)localObject1).next()).a(paramClassWriter, bool);
        }
        n.clear();
      }
    }
    if (tree.ClassWriter.x)
    {
      localObject1 = new HashSet();
      i1 = 0;
      while (i1 < i3)
      {
        localObject2 = (MethodWriter)b.get(i1);
        if (!((MethodWriter)localObject2).isPrimitive()) {
          ((HashSet)localObject1).add(localObject2);
        }
        i1 += 1;
      }
      if (charAt() == c.c) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      a(this, paramClassWriter, (HashSet)localObject1, i1, false);
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MethodWriter)((Iterator)localObject1).next();
        w.a(this, paramClassWriter, (MethodWriter)localObject2);
        ((MethodWriter)localObject2).a(paramClassWriter, bool);
      }
    }
    i1 = 0;
    while (i1 < i3)
    {
      localObject1 = (MethodWriter)b.get(i1);
      if ((localObject1 instanceof f))
      {
        Object localObject3 = t;
        localObject2 = localObject3[0];
        localObject3 = localObject3[1];
        c localC = c.c;
        if (localObject2 == localC) {
          ((MethodWriter)localObject1).put(c.b);
        }
        if (localObject3 == localC) {
          ((MethodWriter)localObject1).a(c.b);
        }
        ((MethodWriter)localObject1).a(paramClassWriter, bool);
        if (localObject2 == localC) {
          ((MethodWriter)localObject1).put((c)localObject2);
        }
        if (localObject3 == localC) {
          ((MethodWriter)localObject1).a((c)localObject3);
        }
      }
      else
      {
        w.a(this, paramClassWriter, (MethodWriter)localObject1);
        if (!((MethodWriter)localObject1).isPrimitive()) {
          ((MethodWriter)localObject1).a(paramClassWriter, bool);
        }
      }
      i1 += 1;
    }
    if (p > 0) {
      a.a(this, paramClassWriter, null, 0);
    }
    if (q > 0) {
      a.a(this, paramClassWriter, null, 1);
    }
    return true;
  }
  
  public boolean a(tree.ClassWriter paramClassWriter, boolean[] paramArrayOfBoolean)
  {
    int i1 = 0;
    paramArrayOfBoolean[2] = false;
    boolean bool2 = b(64);
    b(paramClassWriter, bool2);
    int i2 = b.size();
    boolean bool1 = false;
    while (i1 < i2)
    {
      paramArrayOfBoolean = (MethodWriter)b.get(i1);
      paramArrayOfBoolean.b(paramClassWriter, bool2);
      if (paramArrayOfBoolean.write()) {
        bool1 = true;
      }
      i1 += 1;
    }
    return bool1;
  }
  
  public boolean a(boolean paramBoolean)
  {
    return o.b(paramBoolean);
  }
  
  public long add(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    size = paramInt8;
    state = paramInt9;
    return d.a(this, paramInt1, paramInt8, paramInt9, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public void add(Label paramLabel)
  {
    WeakReference localWeakReference = x;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramLabel.e() > ((Label)x.get()).e())) {
      x = new WeakReference(paramLabel);
    }
  }
  
  public void b(Label paramLabel)
  {
    WeakReference localWeakReference = i;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramLabel.e() > ((Label)i.get()).e())) {
      i = new WeakReference(paramLabel);
    }
  }
  
  public boolean b()
  {
    return e;
  }
  
  public boolean b(int paramInt)
  {
    return (y & paramInt) == paramInt;
  }
  
  public void c()
  {
    d.b(this);
  }
  
  public void c(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public void clear()
  {
    o.d();
  }
  
  public boolean d(boolean paramBoolean)
  {
    return o.a(paramBoolean);
  }
  
  public boolean d(boolean paramBoolean, int paramInt)
  {
    return o.a(paramBoolean, paramInt);
  }
  
  public void e(int paramInt)
  {
    h = paramInt;
  }
  
  void e(Label paramLabel)
  {
    WeakReference localWeakReference = m;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramLabel.e() > ((Label)m.get()).e())) {
      m = new WeakReference(paramLabel);
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public boolean g()
  {
    return s;
  }
  
  public tree.ClassWriter getItem()
  {
    return a;
  }
  
  public void i()
  {
    o.c();
  }
  
  public void init()
  {
    a.b();
    size = 0;
    r = 0;
    state = 0;
    t = 0;
    v = false;
    super.init();
  }
  
  public boolean q()
  {
    return c;
  }
  
  public int r()
  {
    return y;
  }
  
  public void run()
  {
    length = 0;
    y = 0;
    s = false;
    c = false;
    int i9 = b.size();
    int i2 = Math.max(0, get());
    int i5 = i2;
    int i4 = Math.max(0, getValue());
    int i3 = i4;
    Object localObject2 = t;
    Object localObject1 = localObject2[1];
    localObject2 = localObject2[0];
    Object localObject7;
    int i6;
    if ((h == 0) && (w.a(y, 1)))
    {
      androidplot.c.a(this, a());
      i1 = 0;
      while (i1 < i9)
      {
        localObject3 = (MethodWriter)b.get(i1);
        if ((((MethodWriter)localObject3).h()) && (!(localObject3 instanceof i)) && (!(localObject3 instanceof h)) && (!(localObject3 instanceof XYPlot)) && (!((MethodWriter)localObject3).indexOf()))
        {
          localObject4 = ((MethodWriter)localObject3).f(0);
          localObject6 = ((MethodWriter)localObject3).f(1);
          localObject7 = c.a;
          if ((localObject4 == localObject7) && (h != 1) && (localObject6 == localObject7) && (i != 1)) {
            i6 = 1;
          } else {
            i6 = 0;
          }
          if (i6 == 0)
          {
            localObject4 = new androidplot.ClassWriter();
            a(0, (MethodWriter)localObject3, b, (androidplot.ClassWriter)localObject4, androidplot.ClassWriter.j);
          }
        }
        i1 += 1;
      }
    }
    if (i9 > 2)
    {
      localObject3 = c.c;
      if (((localObject2 == localObject3) || (localObject1 == localObject3)) && (w.a(y, 1024)) && (ClassReader.a(this, a())))
      {
        i1 = i5;
        if (localObject2 == localObject3) {
          if ((i2 < get()) && (i2 > 0))
          {
            append(i2);
            s = true;
            i1 = i5;
          }
          else
          {
            i1 = get();
          }
        }
        i2 = i3;
        if (localObject1 == localObject3) {
          if ((i4 < getValue()) && (i4 > 0))
          {
            get(i4);
            c = true;
            i2 = i3;
          }
          else
          {
            i2 = getValue();
          }
        }
        i3 = 1;
        i4 = i2;
        i5 = i1;
        i1 = i3;
        break label412;
      }
    }
    int i1 = 0;
    i5 = i2;
    label412:
    if ((!b(64)) && (!b(128))) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    Object localObject3 = a;
    e = false;
    i = false;
    if ((y != 0) && (i2 != 0)) {
      i = true;
    }
    localObject3 = b;
    Object localObject4 = charAt();
    Object localObject6 = c.c;
    if ((localObject4 != localObject6) && (isEmpty() != localObject6)) {
      i6 = 0;
    } else {
      i6 = 1;
    }
    close();
    i2 = 0;
    while (i2 < i9)
    {
      localObject4 = (MethodWriter)b.get(i2);
      if ((localObject4 instanceof ByteVector)) {
        ((ByteVector)localObject4).run();
      }
      i2 += 1;
    }
    boolean bool4 = b(64);
    i3 = 0;
    boolean bool1 = true;
    while (bool1)
    {
      int i8 = i3 + 1;
      localObject4 = a;
      boolean bool2 = bool1;
      boolean bool3;
      try
      {
        ((tree.ClassWriter)localObject4).b();
        bool2 = bool1;
        close();
        localObject4 = a;
        bool2 = bool1;
        b((tree.ClassWriter)localObject4);
        i2 = 0;
        while (i2 < i9)
        {
          localObject4 = b;
          bool2 = bool1;
          localObject4 = ((ArrayList)localObject4).get(i2);
          localObject4 = (MethodWriter)localObject4;
          localObject6 = a;
          bool2 = bool1;
          ((MethodWriter)localObject4).b((tree.ClassWriter)localObject6);
          i2 += 1;
        }
        localObject4 = a;
        bool2 = bool1;
        bool3 = a((tree.ClassWriter)localObject4);
        bool1 = bool3;
        localObject4 = j;
        if (localObject4 != null)
        {
          bool2 = bool1;
          localObject4 = ((Reference)localObject4).get();
          if (localObject4 != null)
          {
            localObject4 = j;
            bool2 = bool1;
            localObject4 = ((Reference)localObject4).get();
            localObject4 = (Label)localObject4;
            localObject6 = a;
            localObject7 = j;
            bool2 = bool1;
            b((Label)localObject4, ((tree.ClassWriter)localObject6).a(localObject7));
            j = null;
          }
        }
        localObject4 = m;
        if (localObject4 != null)
        {
          bool2 = bool1;
          localObject4 = ((Reference)localObject4).get();
          if (localObject4 != null)
          {
            localObject4 = m;
            bool2 = bool1;
            localObject4 = ((Reference)localObject4).get();
            localObject4 = (Label)localObject4;
            localObject6 = a;
            localObject7 = a;
            bool2 = bool1;
            a((Label)localObject4, ((tree.ClassWriter)localObject6).a(localObject7));
            m = null;
          }
        }
        localObject4 = i;
        if (localObject4 != null)
        {
          bool2 = bool1;
          localObject4 = ((Reference)localObject4).get();
          if (localObject4 != null)
          {
            localObject4 = i;
            bool2 = bool1;
            localObject4 = ((Reference)localObject4).get();
            localObject4 = (Label)localObject4;
            localObject6 = a;
            localObject7 = b;
            bool2 = bool1;
            b((Label)localObject4, ((tree.ClassWriter)localObject6).a(localObject7));
            i = null;
          }
        }
        localObject4 = x;
        if (localObject4 != null)
        {
          bool2 = bool1;
          localObject4 = ((Reference)localObject4).get();
          if (localObject4 != null)
          {
            localObject4 = x;
            bool2 = bool1;
            localObject4 = ((Reference)localObject4).get();
            localObject4 = (Label)localObject4;
            localObject6 = a;
            localObject7 = c;
            bool2 = bool1;
            a((Label)localObject4, ((tree.ClassWriter)localObject6).a(localObject7));
            x = null;
          }
        }
        bool2 = bool1;
        if (bool3)
        {
          localObject4 = a;
          bool2 = bool1;
          ((tree.ClassWriter)localObject4).accept();
          bool2 = bool1;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        localObject6 = System.out;
        localObject7 = new StringBuilder();
        ((StringBuilder)localObject7).append("EXCEPTION : ");
        ((StringBuilder)localObject7).append(localException);
        ((PrintStream)localObject6).println(((StringBuilder)localObject7).toString());
      }
      Object localObject5 = a;
      if (bool2)
      {
        bool1 = a((tree.ClassWriter)localObject5, w.b);
      }
      else
      {
        b((tree.ClassWriter)localObject5, bool4);
        i2 = 0;
        while (i2 < i9)
        {
          ((MethodWriter)b.get(i2)).b(a, bool4);
          i2 += 1;
        }
        bool1 = false;
      }
      i2 = i1;
      bool2 = bool1;
      if (i6 != 0)
      {
        i2 = i1;
        bool2 = bool1;
        if (i8 < 8)
        {
          i2 = i1;
          bool2 = bool1;
          if (w.b[2] != 0)
          {
            i3 = 0;
            i2 = 0;
            int i7 = 0;
            while (i3 < i9)
            {
              localObject5 = (MethodWriter)b.get(i3);
              i7 = Math.max(i7, length + ((MethodWriter)localObject5).get());
              i2 = Math.max(i2, y + ((MethodWriter)localObject5).getValue());
              i3 += 1;
            }
            int i10 = Math.max(data, i7);
            i7 = Math.max(size, i2);
            localObject5 = c.c;
            i3 = i1;
            bool3 = bool1;
            if (localObject2 == localObject5)
            {
              i3 = i1;
              bool3 = bool1;
              if (get() < i10)
              {
                append(i10);
                t[0] = localObject5;
                i3 = 1;
                bool3 = true;
              }
            }
            i2 = i3;
            bool2 = bool3;
            if (localObject1 == localObject5)
            {
              i2 = i3;
              bool2 = bool3;
              if (getValue() < i7)
              {
                get(i7);
                t[1] = localObject5;
                i2 = 1;
                bool2 = true;
              }
            }
          }
        }
      }
      i3 = Math.max(data, get());
      i1 = i2;
      bool1 = bool2;
      if (i3 > get())
      {
        append(i3);
        t[0] = c.b;
        i1 = 1;
        bool1 = true;
      }
      i2 = Math.max(size, getValue());
      if (i2 > getValue())
      {
        get(i2);
        t[1] = c.b;
        i1 = 1;
        bool1 = true;
      }
      i2 = i1;
      bool2 = bool1;
      if (i1 == 0)
      {
        localObject5 = t[0];
        localObject6 = c.c;
        i3 = i1;
        bool3 = bool1;
        if (localObject5 == localObject6)
        {
          i3 = i1;
          bool3 = bool1;
          if (i5 > 0)
          {
            i3 = i1;
            bool3 = bool1;
            if (get() > i5)
            {
              s = true;
              t[0] = c.b;
              append(i5);
              i3 = 1;
              bool3 = true;
            }
          }
        }
        i2 = i3;
        bool2 = bool3;
        if (t[1] == localObject6)
        {
          i2 = i3;
          bool2 = bool3;
          if (i4 > 0)
          {
            i2 = i3;
            bool2 = bool3;
            if (getValue() > i4)
            {
              c = true;
              t[1] = c.b;
              get(i4);
              bool2 = true;
              i2 = 1;
            }
          }
        }
      }
      bool1 = bool2;
      if (i8 > 8) {
        bool1 = false;
      }
      i3 = i8;
      i1 = i2;
    }
    b = ((ArrayList)localObject3);
    if (i1 != 0)
    {
      localObject3 = t;
      localObject3[0] = localObject2;
      localObject3[1] = localObject1;
    }
    a(a.get());
  }
  
  public void toString(StringBuilder paramStringBuilder)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(currentStep);
    ((StringBuilder)localObject).append(":{\n");
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("  actualWidth:");
    ((StringBuilder)localObject).append(p);
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    paramStringBuilder.append("\n");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("  actualHeight:");
    ((StringBuilder)localObject).append(x);
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    paramStringBuilder.append("\n");
    localObject = read().iterator();
    while (((Iterator)localObject).hasNext())
    {
      ((MethodWriter)((Iterator)localObject).next()).toString(paramStringBuilder);
      paramStringBuilder.append(",\n");
    }
    paramStringBuilder.append("}");
  }
}
