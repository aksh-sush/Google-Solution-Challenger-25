package adapters;

import androidplot.b;
import androidplot.h;
import androidplot.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MethodWriter
{
  public static float children;
  public int A = 0;
  public int B = 0;
  Label C = new Label(this, Handle.e);
  Label D = new Label(this, Handle.g);
  public b E;
  public h[] F = new h[2];
  private boolean G;
  public int[] H = new int[2];
  private float I = 0.0F;
  private boolean K = false;
  boolean L;
  private boolean M = true;
  private boolean N = false;
  private int P = 0;
  public b Q;
  MethodWriter R;
  public int S;
  MethodWriter U;
  public Label V;
  private boolean[] W;
  public s.ClassWriter X = new s.ClassWriter(this);
  private int Y = 0;
  public Label a = new Label(this, Handle.b);
  private Object access;
  public Label b = new Label(this, Handle.c);
  protected MethodWriter[] bottom;
  private int buffer = -1;
  public Label c = new Label(this, Handle.a);
  boolean channel;
  private int code;
  private boolean count = true;
  public String currentStep;
  public Label d = new Label(this, Handle.d);
  protected int data;
  int e = -1;
  private boolean end = false;
  public m f = null;
  private boolean first = false;
  protected int flags;
  public float g = 1.0F;
  public int h = 0;
  private int[] height = { Integer.MAX_VALUE, Integer.MAX_VALUE };
  public int i = 0;
  int id;
  private boolean index = false;
  boolean initialized;
  public Label j = new Label(this, Handle.i);
  public boolean k = false;
  public androidplot.XYPlot l = null;
  boolean last = false;
  public float[] left;
  protected int length;
  int level;
  protected int limit;
  private boolean localVar;
  public float m = 1.0F;
  int mLeft;
  public float n;
  float name;
  protected int next;
  int nextBucket;
  public int o;
  int p;
  private int pos = -1;
  float position;
  int q;
  public MethodWriter r;
  boolean read;
  protected ArrayList right;
  private int s;
  protected int size;
  private int stackSize = 0;
  private boolean start = false;
  public int state = -1;
  private String string;
  public c[] t;
  private String text;
  public boolean[] this$0 = { 1, 1 };
  boolean token;
  public int top = 0;
  public int type = -1;
  public Label[] u;
  private boolean v = false;
  float w = 1.0F;
  protected MethodWriter[] width;
  int x;
  protected int y;
  public int z = 0;
  
  public MethodWriter()
  {
    Object localObject = new Label(this, Handle.r);
    V = ((Label)localObject);
    u = new Label[] { b, c, j, a, d, localObject };
    right = new ArrayList();
    W = new boolean[2];
    localObject = c.b;
    t = new c[] { localObject, localObject };
    r = null;
    p = 0;
    x = 0;
    n = 0.0F;
    flags = -1;
    length = 0;
    y = 0;
    mLeft = 0;
    nextBucket = 0;
    next = 0;
    limit = 0;
    q = 0;
    float f1 = children;
    position = f1;
    name = f1;
    code = 0;
    s = 0;
    G = false;
    string = null;
    text = null;
    channel = false;
    id = 0;
    level = 0;
    left = new float[] { -1.0F, -1.0F };
    width = new MethodWriter[] { null, null };
    bottom = new MethodWriter[] { null, null };
    U = null;
    R = null;
    S = -1;
    o = -1;
    a();
  }
  
  private void a()
  {
    right.add(b);
    right.add(j);
    right.add(c);
    right.add(a);
    right.add(D);
    right.add(C);
    right.add(V);
    right.add(d);
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString, Label paramLabel)
  {
    if (b == null) {
      return;
    }
    paramStringBuilder.append("    ");
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramStringBuilder.append(b);
    paramStringBuilder.append("'");
    if ((n != Integer.MIN_VALUE) || (r != 0))
    {
      paramStringBuilder.append(",");
      paramStringBuilder.append(r);
      if (n != Integer.MIN_VALUE)
      {
        paramStringBuilder.append(",");
        paramStringBuilder.append(n);
        paramStringBuilder.append(",");
      }
    }
    paramStringBuilder.append(" ] ,\n");
  }
  
  private void a(tree.ClassWriter paramClassWriter, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, tree.Label paramLabel1, tree.Label paramLabel2, c paramC, boolean paramBoolean5, Label paramLabel3, Label paramLabel4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean11)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private void append(StringBuilder paramStringBuilder, String paramString, float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramFloat1);
    paramStringBuilder.append(",\n");
  }
  
  private void append(StringBuilder paramStringBuilder, String paramString, float paramFloat, int paramInt)
  {
    if (paramFloat == 0.0F) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  [");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",");
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append("");
    paramStringBuilder.append("],\n");
  }
  
  private void append(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramInt1);
    paramStringBuilder.append(",\n");
  }
  
  private void append(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2)
  {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    append(paramStringBuilder, "      size", paramInt1, 0);
    append(paramStringBuilder, "      min", paramInt2, 0);
    append(paramStringBuilder, "      max", paramInt3, Integer.MAX_VALUE);
    append(paramStringBuilder, "      matchMin", paramInt5, 0);
    append(paramStringBuilder, "      matchDef", paramInt6, 0);
    append(paramStringBuilder, "      matchPercent", paramFloat1, 1.0F);
    paramStringBuilder.append("    },\n");
  }
  
  private boolean b(int paramInt)
  {
    paramInt *= 2;
    Object localObject = u;
    Label localLabel1 = localObject[paramInt];
    Label localLabel2 = b;
    if ((localLabel2 != null) && (b != localLabel1))
    {
      localObject = localObject[(paramInt + 1)];
      localLabel1 = b;
      if ((localLabel1 != null) && (b == localObject)) {
        return true;
      }
    }
    return false;
  }
  
  public Label a(Handle paramHandle)
  {
    switch (Type.c[paramHandle.ordinal()])
    {
    default: 
      throw new AssertionError(paramHandle.name());
    case 9: 
      return null;
    case 8: 
      return C;
    case 7: 
      return D;
    case 6: 
      return V;
    case 5: 
      return d;
    case 4: 
      return a;
    case 3: 
      return c;
    case 2: 
      return j;
    }
    return b;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    h = paramInt1;
    z = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE) {
      paramInt2 = 0;
    }
    A = paramInt2;
    m = paramFloat;
    if ((paramFloat > 0.0F) && (paramFloat < 1.0F) && (paramInt1 == 0)) {
      h = 2;
    }
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    W[paramInt] = paramBoolean;
  }
  
  public void a(Handle paramHandle1, MethodWriter paramMethodWriter, Handle paramHandle2, int paramInt)
  {
    Object localObject1 = Handle.r;
    Object localObject2;
    Label localLabel1;
    Handle localHandle1;
    Object localObject3;
    if (paramHandle1 == localObject1)
    {
      paramHandle1 = Handle.c;
      if (paramHandle2 == localObject1)
      {
        paramHandle2 = a(paramHandle1);
        localObject2 = Handle.a;
        localLabel1 = a((Handle)localObject2);
        localHandle1 = Handle.i;
        localObject3 = a(localHandle1);
        Handle localHandle2 = Handle.b;
        Label localLabel2 = a(localHandle2);
        int i1 = 1;
        if (((paramHandle2 != null) && (paramHandle2.remove())) || ((localLabel1 != null) && (localLabel1.remove())))
        {
          paramInt = 0;
        }
        else
        {
          a(paramHandle1, paramMethodWriter, paramHandle1, 0);
          a((Handle)localObject2, paramMethodWriter, (Handle)localObject2, 0);
          paramInt = 1;
        }
        if (((localObject3 != null) && (((Label)localObject3).remove())) || ((localLabel2 != null) && (localLabel2.remove()))) {
          i1 = 0;
        } else {
          a(localHandle1, paramMethodWriter, localHandle1, 0);
        }
        try
        {
          a(localHandle2, paramMethodWriter, localHandle2, 0);
          if ((paramInt != 0) && (i1 != 0))
          {
            paramHandle1 = a((Handle)localObject1);
            paramMethodWriter = paramMethodWriter.a((Handle)localObject1);
            break label396;
          }
          if (paramInt != 0) {}
          for (paramHandle1 = Handle.g;; paramHandle1 = Handle.e)
          {
            a(paramHandle1).a(paramMethodWriter.a(paramHandle1), 0);
            return;
            if (i1 == 0) {
              break;
            }
          }
          if (paramHandle2 == paramHandle1) {
            break label285;
          }
        }
        catch (Throwable paramHandle1)
        {
          throw paramHandle1;
        }
      }
      if (paramHandle2 != Handle.a)
      {
        paramHandle1 = Handle.i;
        if ((paramHandle2 != paramHandle1) && (paramHandle2 != Handle.b)) {
          return;
        }
        a(paramHandle1, paramMethodWriter, paramHandle2, 0);
        paramHandle1 = Handle.b;
      }
      else
      {
        label285:
        a(paramHandle1, paramMethodWriter, paramHandle2, 0);
        paramHandle1 = Handle.a;
      }
      a(paramHandle1, paramMethodWriter, paramHandle2, 0);
      paramHandle1 = a((Handle)localObject1);
    }
    else
    {
      for (;;)
      {
        paramMethodWriter = paramMethodWriter.a(paramHandle2);
        break label396;
        localHandle1 = Handle.g;
        if (paramHandle1 == localHandle1)
        {
          localObject2 = Handle.c;
          if ((paramHandle2 == localObject2) || (paramHandle2 == Handle.a))
          {
            localObject1 = a((Handle)localObject2);
            paramHandle1 = paramMethodWriter.a(paramHandle2);
            paramMethodWriter = paramHandle1;
            paramHandle2 = a(Handle.a);
            ((Label)localObject1).a(paramHandle1, 0);
            paramHandle2.a(paramHandle1, 0);
            paramHandle1 = a(localHandle1);
            label396:
            paramHandle1.a(paramMethodWriter, 0);
            return;
          }
        }
        localObject3 = Handle.e;
        if (paramHandle1 == localObject3)
        {
          localObject2 = Handle.i;
          if ((paramHandle2 == localObject2) || (paramHandle2 == Handle.b))
          {
            paramHandle1 = paramMethodWriter.a(paramHandle2);
            a((Handle)localObject2).a(paramHandle1, 0);
            a(Handle.b).a(paramHandle1, 0);
            a((Handle)localObject3).a(paramHandle1, 0);
            return;
          }
        }
        if ((paramHandle1 == localHandle1) && (paramHandle2 == localHandle1))
        {
          paramHandle1 = Handle.c;
          a(paramHandle1).a(paramMethodWriter.a(paramHandle1), 0);
          paramHandle1 = Handle.a;
          a(paramHandle1).a(paramMethodWriter.a(paramHandle1), 0);
          paramHandle1 = a(localHandle1);
        }
        else
        {
          if ((paramHandle1 != localObject3) || (paramHandle2 != localObject3)) {
            break;
          }
          paramHandle1 = Handle.i;
          a(paramHandle1).a(paramMethodWriter.a(paramHandle1), 0);
          paramHandle1 = Handle.b;
          a(paramHandle1).a(paramMethodWriter.a(paramHandle1), 0);
          paramHandle1 = a((Handle)localObject3);
        }
      }
      localObject2 = a(paramHandle1);
      localLabel1 = paramMethodWriter.a(paramHandle2);
      if (((Label)localObject2).a(localLabel1))
      {
        paramMethodWriter = Handle.d;
        if (paramHandle1 == paramMethodWriter)
        {
          paramHandle2 = a(Handle.i);
          paramMethodWriter = a(Handle.b);
          paramHandle1 = paramMethodWriter;
          if (paramHandle2 != null) {
            paramHandle2.add();
          }
          if (paramMethodWriter == null) {
            break label812;
          }
        }
        else
        {
          if ((paramHandle1 == Handle.i) || (paramHandle1 == Handle.b)) {
            break label750;
          }
          if ((paramHandle1 != Handle.c) && (paramHandle1 != Handle.a)) {
            break label812;
          }
          paramMethodWriter = a((Handle)localObject1);
          if (paramMethodWriter.getText() != localLabel1) {
            paramMethodWriter.add();
          }
          paramMethodWriter = a(paramHandle1).b();
          paramHandle2 = a(localHandle1);
          paramHandle1 = paramHandle2;
          if (!paramHandle2.remove()) {
            break label812;
          }
        }
        label750:
        do
        {
          paramMethodWriter.add();
          paramHandle1.add();
          break;
          paramMethodWriter = a(paramMethodWriter);
          if (paramMethodWriter != null) {
            paramMethodWriter.add();
          }
          paramMethodWriter = a((Handle)localObject1);
          if (paramMethodWriter.getText() != localLabel1) {
            paramMethodWriter.add();
          }
          paramMethodWriter = a(paramHandle1).b();
          paramHandle2 = a((Handle)localObject3);
          paramHandle1 = paramHandle2;
        } while (paramHandle2.remove());
        label812:
        ((Label)localObject2).a(localLabel1, paramInt);
      }
    }
  }
  
  public void a(Handle paramHandle1, MethodWriter paramMethodWriter, Handle paramHandle2, int paramInt1, int paramInt2)
  {
    a(paramHandle1).a(paramMethodWriter.a(paramHandle2), paramInt1, paramInt2, true);
  }
  
  public void a(Label paramLabel1, Label paramLabel2, int paramInt)
  {
    if (paramLabel1.getName() == this) {
      a(paramLabel1.d(), paramLabel2.getName(), paramLabel2.d(), paramInt);
    }
  }
  
  public void a(MethodWriter paramMethodWriter, float paramFloat, int paramInt)
  {
    Handle localHandle = Handle.r;
    a(localHandle, paramMethodWriter, localHandle, paramInt, 0);
    I = paramFloat;
  }
  
  public void a(c paramC)
  {
    t[1] = paramC;
  }
  
  public void a(f paramF, tree.ClassWriter paramClassWriter, HashSet paramHashSet, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!paramHashSet.contains(this)) {
        return;
      }
      w.a(paramF, paramClassWriter, this);
      paramHashSet.remove(this);
      a(paramClassWriter, paramF.b(64));
    }
    Object localObject;
    if (paramInt == 0)
    {
      localObject = b.get();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nexta.a(paramF, paramClassWriter, paramHashSet, paramInt, true);
        }
      }
      localObject = c.get();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nexta.a(paramF, paramClassWriter, paramHashSet, paramInt, true);
        }
      }
    }
    else
    {
      localObject = j.get();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nexta.a(paramF, paramClassWriter, paramHashSet, paramInt, true);
        }
      }
      localObject = a.get();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nexta.a(paramF, paramClassWriter, paramHashSet, paramInt, true);
        }
      }
      localObject = d.get();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          MethodWriter localMethodWriter = nexta;
          try
          {
            localMethodWriter.a(paramF, paramClassWriter, paramHashSet, paramInt, true);
          }
          catch (Throwable paramF)
          {
            throw paramF;
          }
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    string = paramString;
  }
  
  public void a(tree.ClassWriter paramClassWriter, boolean paramBoolean)
  {
    Object localObject3 = paramClassWriter.a(b);
    Object localObject4 = paramClassWriter.a(c);
    Object localObject7 = paramClassWriter.a(j);
    Object localObject6 = paramClassWriter.a(a);
    Object localObject5 = paramClassWriter.a(d);
    Object localObject1 = r;
    if (localObject1 != null)
    {
      if ((localObject1 != null) && (t[0] == c.c)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      if ((localObject1 != null) && (t[1] == c.c)) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      i1 = P;
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            bool2 = bool1;
            break label165;
          }
        }
        else
        {
          bool2 = false;
          break label165;
        }
      }
      else {
        break label158;
      }
    }
    boolean bool1 = false;
    label158:
    boolean bool3 = false;
    boolean bool2 = bool1;
    label165:
    if ((s == 8) && (!G) && (!select()))
    {
      localObject1 = W;
      if ((localObject1[0] == 0) && (localObject1[1] == 0)) {
        return;
      }
    }
    bool1 = first;
    if ((bool1) || (v))
    {
      if (bool1)
      {
        paramClassWriter.a((tree.Label)localObject3, length);
        paramClassWriter.a((tree.Label)localObject4, length + p);
        if (bool2)
        {
          localObject1 = r;
          if (localObject1 != null) {
            if (M)
            {
              localObject1 = (f)localObject1;
              ((f)localObject1).b(b);
              ((f)localObject1).add(c);
            }
            else
            {
              paramClassWriter.d(paramClassWriter.a(c), (tree.Label)localObject4, 0, 5);
            }
          }
        }
      }
      if (v)
      {
        paramClassWriter.a((tree.Label)localObject7, y);
        paramClassWriter.a((tree.Label)localObject6, y + x);
        if (d.put()) {
          paramClassWriter.a((tree.Label)localObject5, y + q);
        }
        if (bool3)
        {
          localObject1 = r;
          if (localObject1 != null) {
            if (M)
            {
              localObject1 = (f)localObject1;
              ((f)localObject1).a(j);
              ((f)localObject1).e(a);
            }
            else
            {
              paramClassWriter.d(paramClassWriter.a(a), (tree.Label)localObject6, 0, 5);
            }
          }
        }
      }
      if ((first) && (v))
      {
        first = false;
        v = false;
        return;
      }
    }
    bool1 = tree.ClassWriter.x;
    if (paramBoolean)
    {
      localObject1 = l;
      if (localObject1 != null)
      {
        localObject2 = f;
        if (localObject2 != null)
        {
          localObject8 = c;
          if ((b) && (b.b) && (c.b) && (b.b))
          {
            paramClassWriter.a((tree.Label)localObject3, g);
            paramClassWriter.a((tree.Label)localObject4, l.b.g);
            paramClassWriter.a((tree.Label)localObject7, f.c.g);
            paramClassWriter.a((tree.Label)localObject6, f.b.g);
            paramClassWriter.a((tree.Label)localObject5, f.a.g);
            if (r != null)
            {
              if ((bool2) && (this$0[0] != 0) && (!f())) {
                paramClassWriter.d(paramClassWriter.a(r.c), (tree.Label)localObject4, 0, 8);
              }
              if ((bool3) && (this$0[1] != 0) && (!equals())) {
                paramClassWriter.d(paramClassWriter.a(r.a), (tree.Label)localObject6, 0, 8);
              }
            }
            first = false;
            v = false;
            return;
          }
        }
      }
    }
    boolean bool4;
    boolean bool5;
    if (r != null)
    {
      if (b(0))
      {
        ((f)r).a(this, 0);
        bool1 = true;
      }
      else
      {
        bool1 = f();
      }
      if (b(1))
      {
        ((f)r).a(this, 1);
        bool4 = true;
      }
      else
      {
        bool4 = equals();
      }
      if ((!bool1) && (bool2) && (s != 8) && (b.b == null) && (c.b == null)) {
        paramClassWriter.d(paramClassWriter.a(r.c), (tree.Label)localObject4, 0, 1);
      }
      if ((!bool4) && (bool3) && (s != 8) && (j.b == null) && (a.b == null) && (d == null)) {
        paramClassWriter.d(paramClassWriter.a(r.a), (tree.Label)localObject6, 0, 1);
      }
      bool5 = bool1;
    }
    else
    {
      bool4 = false;
      bool5 = false;
    }
    int i7 = p;
    int i2 = data;
    if (i7 >= i2) {
      i2 = i7;
    }
    int i8 = x;
    int i1 = size;
    if (i8 >= i1) {
      i1 = i8;
    }
    Object localObject2 = t;
    localObject1 = localObject2[0];
    c localC = c.a;
    if (localObject1 != localC) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    localObject2 = localObject2[1];
    if (localObject2 != localC) {
      bool6 = true;
    } else {
      bool6 = false;
    }
    int i9 = flags;
    e = i9;
    float f1 = n;
    w = f1;
    int i5 = h;
    int i6 = i;
    int i3;
    int i4;
    if ((f1 > 0.0F) && (s != 8))
    {
      i3 = i5;
      if (localObject1 == localC)
      {
        i3 = i5;
        if (i5 == 0) {
          i3 = 3;
        }
      }
      i4 = i6;
      if (localObject2 == localC)
      {
        i4 = i6;
        if (i6 == 0) {
          i4 = 3;
        }
      }
      if ((localObject1 == localC) && (localObject2 == localC) && (i3 == 3) && (i4 == 3))
      {
        a(bool2, bool3, bool1, bool6);
        i6 = i1;
        i5 = i2;
      }
      else if ((localObject1 == localC) && (i3 == 3))
      {
        e = 0;
        i2 = (int)(f1 * i8);
        if (localObject2 != localC)
        {
          bool1 = false;
          i3 = 4;
          break label1350;
        }
        i6 = i1;
        i5 = i2;
      }
      else
      {
        i6 = i1;
        i5 = i2;
        if (localObject2 == localC)
        {
          i6 = i1;
          i5 = i2;
          if (i4 == 3)
          {
            e = 1;
            if (i9 == -1) {
              w = (1.0F / f1);
            }
            i1 = (int)(w * i7);
            if (localObject1 != localC)
            {
              bool1 = false;
              i4 = 4;
              break label1350;
            }
            i6 = i1;
            i5 = i2;
          }
        }
      }
      bool1 = true;
      i1 = i6;
      i2 = i5;
    }
    else
    {
      bool1 = false;
      i4 = i6;
      i3 = i5;
    }
    label1350:
    localObject1 = H;
    localObject1[0] = i3;
    localObject1[1] = i4;
    last = bool1;
    if (bool1)
    {
      i5 = e;
      if ((i5 == 0) || (i5 == -1))
      {
        bool7 = true;
        break label1405;
      }
    }
    boolean bool7 = false;
    label1405:
    if (bool1)
    {
      i5 = e;
      if ((i5 == 1) || (i5 == -1))
      {
        bool6 = true;
        break label1437;
      }
    }
    boolean bool6 = false;
    label1437:
    localObject1 = t[0];
    Object localObject10 = c.c;
    if ((localObject1 == localObject10) && ((this instanceof f))) {
      bool8 = true;
    } else {
      bool8 = false;
    }
    if (bool8) {
      i2 = 0;
    }
    boolean bool10 = V.remove() ^ true;
    localObject1 = W;
    int i12 = localObject1[0];
    int i11 = localObject1[1];
    Label localLabel1;
    if ((type != 2) && (!first))
    {
      if (paramBoolean)
      {
        localObject1 = l;
        if (localObject1 != null)
        {
          localObject2 = c;
          if ((b) && (b.b))
          {
            if (paramBoolean)
            {
              paramClassWriter.a((tree.Label)localObject3, g);
              paramClassWriter.a((tree.Label)localObject4, l.b.g);
              if ((r != null) && (bool2) && (this$0[0] != 0) && (!f())) {
                paramClassWriter.d(paramClassWriter.a(r.c), (tree.Label)localObject4, 0, 8);
              }
              break label1852;
            }
            break label1852;
          }
        }
      }
      localObject1 = r;
      if (localObject1 != null) {
        localObject1 = paramClassWriter.a(c);
      } else {
        localObject1 = null;
      }
      localObject2 = r;
      if (localObject2 != null) {
        localObject2 = paramClassWriter.a(b);
      } else {
        localObject2 = null;
      }
      int i13 = this$0[0];
      localObject8 = t;
      localObject9 = localObject8[0];
      localLabel1 = b;
      Label localLabel2 = c;
      i5 = length;
      i6 = data;
      i7 = height[0];
      f1 = position;
      boolean bool9;
      if (localObject8[1] == localC) {
        bool9 = true;
      } else {
        bool9 = false;
      }
      a(paramClassWriter, true, bool2, bool3, i13, (tree.Label)localObject2, (tree.Label)localObject1, (c)localObject9, bool8, localLabel1, localLabel2, i5, i2, i6, i7, f1, bool7, bool9, bool5, bool4, i12, i3, i4, z, A, m, bool10);
    }
    label1852:
    localObject1 = localObject7;
    boolean bool8 = bool3;
    localObject2 = localObject6;
    if (paramBoolean)
    {
      localObject6 = f;
      if (localObject6 != null)
      {
        localObject7 = c;
        if ((b) && (b.b))
        {
          paramClassWriter.a((tree.Label)localObject1, g);
          paramClassWriter.a((tree.Label)localObject2, f.b.g);
          paramClassWriter.a((tree.Label)localObject5, f.a.g);
          localObject6 = r;
          if ((localObject6 != null) && (!bool4) && (bool8)) {
            if (this$0[1] != 0) {
              paramClassWriter.d(paramClassWriter.a(a), (tree.Label)localObject2, 0, 8);
            } else {}
          }
          i2 = 0;
          break label2014;
        }
      }
    }
    i2 = 1;
    label2014:
    Object localObject8 = paramClassWriter;
    Object localObject9 = localObject5;
    localObject7 = this;
    if (state == 2) {
      i2 = 0;
    }
    if ((i2 != 0) && (!v))
    {
      if ((t[1] == localObject10) && ((localObject7 instanceof f))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      if (paramBoolean) {
        i1 = 0;
      }
      localObject5 = r;
      if (localObject5 != null) {
        localObject5 = ((tree.ClassWriter)localObject8).a(a);
      } else {
        localObject5 = null;
      }
      localObject6 = r;
      if (localObject6 != null) {
        localObject6 = ((tree.ClassWriter)localObject8).a(j);
      } else {
        localObject6 = null;
      }
      if ((q > 0) || (s == 8))
      {
        localObject10 = d;
        if (b != null)
        {
          ((tree.ClassWriter)localObject8).a((tree.Label)localObject9, (tree.Label)localObject1, readUnsignedShort(), 8);
          ((tree.ClassWriter)localObject8).a((tree.Label)localObject9, ((tree.ClassWriter)localObject8).a(d.b), d.a(), 8);
          if (bool8) {
            ((tree.ClassWriter)localObject8).d((tree.Label)localObject5, ((tree.ClassWriter)localObject8).a(a), 0, 5);
          }
          bool3 = false;
        }
        else
        {
          if (s == 8) {
            i2 = ((Label)localObject10).a();
          } else {
            i2 = readUnsignedShort();
          }
          ((tree.ClassWriter)localObject8).a((tree.Label)localObject9, (tree.Label)localObject1, i2, 8);
        }
      }
      else
      {
        bool3 = bool10;
      }
      int i10 = this$0[1];
      localObject8 = t;
      localObject9 = localObject8[1];
      localObject10 = j;
      localLabel1 = a;
      i2 = y;
      i5 = size;
      i6 = height[1];
      f1 = name;
      if (localObject8[0] == localC) {
        bool7 = true;
      } else {
        bool7 = false;
      }
      a(paramClassWriter, false, bool8, bool2, i10, (tree.Label)localObject6, (tree.Label)localObject5, (c)localObject9, paramBoolean, (Label)localObject10, localLabel1, i2, i1, i5, i6, f1, bool6, bool7, bool4, bool5, i11, i4, i3, top, B, g, bool3);
    }
    if (bool1)
    {
      i1 = e;
      f1 = w;
      if (i1 == 1)
      {
        localObject5 = localObject2;
        localObject6 = localObject1;
      }
      else
      {
        localObject6 = localObject3;
        localObject5 = localObject4;
        localObject4 = localObject2;
        localObject3 = localObject1;
      }
      paramClassWriter.a((tree.Label)localObject5, (tree.Label)localObject6, (tree.Label)localObject4, (tree.Label)localObject3, f1, 8);
    }
    localObject1 = this;
    if (V.remove()) {
      paramClassWriter.a((MethodWriter)localObject1, V.getText().getName(), (float)Math.toRadians(I + 90.0F), V.a());
    }
    first = false;
    v = false;
  }
  
  public void a(tree.c paramC)
  {
    b.a(paramC);
    j.a(paramC);
    c.a(paramC);
    a.a(paramC);
    d.a(paramC);
    V.a(paramC);
    D.a(paramC);
    C.a(paramC);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = paramBoolean1 & l.i();
    boolean bool1 = paramBoolean2 & f.i();
    androidplot.XYPlot localXYPlot = l;
    int i1 = c.g;
    m localM = f;
    int i2 = c.g;
    int i4 = b.g;
    int i5 = b.g;
    int i3;
    if ((i4 - i1 >= 0) && (i5 - i2 >= 0) && (i1 != Integer.MIN_VALUE) && (i1 != Integer.MAX_VALUE) && (i2 != Integer.MIN_VALUE) && (i2 != Integer.MAX_VALUE) && (i4 != Integer.MIN_VALUE) && (i4 != Integer.MAX_VALUE) && (i5 != Integer.MIN_VALUE))
    {
      i3 = i5;
      if (i5 != Integer.MAX_VALUE) {}
    }
    else
    {
      i4 = 0;
      i1 = 0;
      i3 = 0;
      i2 = 0;
    }
    i4 -= i1;
    i3 -= i2;
    if (bool2) {
      length = i1;
    }
    if (bool1) {
      y = i2;
    }
    if (s == 8)
    {
      p = 0;
      x = 0;
      return;
    }
    if (bool2)
    {
      i1 = i4;
      if (t[0] == c.b)
      {
        i2 = p;
        i1 = i4;
        if (i4 < i2) {
          i1 = i2;
        }
      }
      p = i1;
      i2 = data;
      if (i1 < i2) {
        p = i2;
      }
    }
    if (bool1)
    {
      i1 = i3;
      if (t[1] == c.b)
      {
        i2 = x;
        i1 = i3;
        if (i3 < i2) {
          i1 = i2;
        }
      }
      x = i1;
      i2 = size;
      if (i1 < i2) {
        x = i2;
      }
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (e == -1) {
      if ((paramBoolean3) && (!paramBoolean4))
      {
        e = 0;
      }
      else if ((!paramBoolean3) && (paramBoolean4))
      {
        e = 1;
        if (flags == -1) {
          w = (1.0F / w);
        }
      }
    }
    if ((e == 0) && ((!j.remove()) || (!a.remove()))) {
      e = 1;
    } else if ((e == 1) && ((!b.remove()) || (!c.remove()))) {
      e = 0;
    }
    if ((e == -1) && ((!j.remove()) || (!a.remove()) || (!b.remove()) || (!c.remove()))) {
      if ((j.remove()) && (a.remove()))
      {
        e = 0;
      }
      else if ((b.remove()) && (c.remove()))
      {
        w = (1.0F / w);
        e = 1;
      }
    }
    if (e == -1)
    {
      int i1 = z;
      if ((i1 > 0) && (top == 0))
      {
        e = 0;
        return;
      }
      if ((i1 == 0) && (top > 0))
      {
        w = (1.0F / w);
        e = 1;
      }
    }
  }
  
  public MethodWriter accept(int paramInt)
  {
    Label localLabel1;
    Label localLabel2;
    if (paramInt == 0)
    {
      localLabel1 = b;
      localLabel2 = b;
      if ((localLabel2 != null) && (b == localLabel1)) {
        return a;
      }
    }
    else if (paramInt == 1)
    {
      localLabel1 = j;
      localLabel2 = b;
      if ((localLabel2 != null) && (b == localLabel1)) {
        return a;
      }
    }
    return null;
  }
  
  public void add(float paramFloat)
  {
    name = paramFloat;
  }
  
  public void add(int paramInt)
  {
    level = paramInt;
  }
  
  public void add(int paramInt1, int paramInt2)
  {
    if (first) {
      return;
    }
    b.a(paramInt1);
    c.a(paramInt2);
    length = paramInt1;
    p = (paramInt2 - paramInt1);
    first = true;
  }
  
  public void add(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    i = paramInt1;
    top = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE) {
      paramInt2 = 0;
    }
    B = paramInt2;
    g = paramFloat;
    if ((paramFloat > 0.0F) && (paramFloat < 1.0F) && (paramInt1 == 0)) {
      i = 2;
    }
  }
  
  public void add(String paramString)
  {
    int i2;
    int i1;
    String str;
    if ((paramString != null) && (paramString.length() != 0))
    {
      int i6 = paramString.length();
      int i7 = paramString.indexOf(',');
      int i5 = 0;
      int i3 = 0;
      int i4 = -1;
      i2 = i4;
      i1 = i5;
      if (i7 > 0)
      {
        i2 = i4;
        i1 = i5;
        if (i7 < i6 - 1)
        {
          str = paramString.substring(0, i7);
          if (str.equalsIgnoreCase("W")) {
            i1 = i3;
          } else if (str.equalsIgnoreCase("H")) {
            i1 = 1;
          } else {
            i1 = -1;
          }
          i2 = i1;
          i1 = i7 + 1;
        }
      }
      i3 = paramString.indexOf(':');
      if ((i3 >= 0) && (i3 < i6 - 1))
      {
        str = paramString.substring(i1, i3);
        paramString = paramString.substring(i3 + 1);
        if ((str.length() <= 0) || (paramString.length() <= 0)) {
          break label255;
        }
      }
    }
    try
    {
      f1 = Float.parseFloat(str);
      float f2 = Float.parseFloat(paramString);
      if ((f1 <= 0.0F) || (f2 <= 0.0F)) {
        break label255;
      }
      if (i2 == 1)
      {
        f1 = f2 / f1;
        f1 = Math.abs(f1);
      }
      else
      {
        f1 /= f2;
        f1 = Math.abs(f1);
      }
    }
    catch (NumberFormatException paramString)
    {
      float f1;
      for (;;) {}
    }
    paramString = paramString.substring(i1);
    if (paramString.length() > 0) {}
    try
    {
      f1 = Float.parseFloat(paramString);
    }
    catch (NumberFormatException paramString)
    {
      label255:
      for (;;) {}
    }
    f1 = 0.0F;
    if (f1 > 0.0F)
    {
      n = f1;
      flags = i2;
      return;
      n = 0.0F;
      return;
    }
  }
  
  public void addAll()
  {
    MethodWriter localMethodWriter = l();
    if ((localMethodWriter != null) && ((localMethodWriter instanceof f)) && (((f)l()).flagActionItems())) {
      return;
    }
    int i2 = right.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((Label)right.get(i1)).add();
      i1 += 1;
    }
  }
  
  public void append(int paramInt)
  {
    p = paramInt;
    int i1 = data;
    if (paramInt < i1) {
      p = i1;
    }
  }
  
  public void b(float paramFloat)
  {
    left[0] = paramFloat;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    if (v) {
      return;
    }
    j.a(paramInt1);
    a.a(paramInt2);
    y = paramInt1;
    x = (paramInt2 - paramInt1);
    if (K) {
      d.a(paramInt1 + q);
    }
    v = true;
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2;
    length = paramInt1;
    y = paramInt2;
    if (s == 8)
    {
      p = 0;
      x = 0;
      return;
    }
    c[] arrayOfC = t;
    c localC1 = arrayOfC[0];
    c localC2 = c.b;
    paramInt1 = i1;
    if (localC1 == localC2)
    {
      paramInt2 = p;
      paramInt1 = i1;
      if (i1 < paramInt2) {
        paramInt1 = paramInt2;
      }
    }
    paramInt2 = paramInt3;
    if (arrayOfC[1] == localC2)
    {
      paramInt4 = x;
      paramInt2 = paramInt3;
      if (paramInt3 < paramInt4) {
        paramInt2 = paramInt4;
      }
    }
    p = paramInt1;
    x = paramInt2;
    paramInt3 = size;
    if (paramInt2 < paramInt3) {
      x = paramInt3;
    }
    paramInt3 = data;
    if (paramInt1 < paramInt3) {
      p = paramInt3;
    }
    paramInt3 = A;
    if ((paramInt3 > 0) && (localC1 == c.a)) {
      p = Math.min(p, paramInt3);
    }
    paramInt3 = B;
    if ((paramInt3 > 0) && (t[1] == c.a)) {
      x = Math.min(x, paramInt3);
    }
    paramInt3 = p;
    if (paramInt1 != paramInt3) {
      pos = paramInt3;
    }
    paramInt1 = x;
    if (paramInt2 != paramInt1) {
      buffer = paramInt1;
    }
  }
  
  public void b(tree.ClassWriter paramClassWriter)
  {
    paramClassWriter.a(b);
    paramClassWriter.a(j);
    paramClassWriter.a(c);
    paramClassWriter.a(a);
    if (q > 0) {
      paramClassWriter.a(d);
    }
  }
  
  public void b(tree.ClassWriter paramClassWriter, boolean paramBoolean)
  {
    int i2 = paramClassWriter.b(b);
    int i5 = paramClassWriter.b(j);
    int i4 = paramClassWriter.b(c);
    int i6 = paramClassWriter.b(a);
    int i3 = i2;
    int i1 = i4;
    Object localObject;
    if (paramBoolean)
    {
      localObject = l;
      i3 = i2;
      i1 = i4;
      if (localObject != null)
      {
        paramClassWriter = c;
        i3 = i2;
        i1 = i4;
        if (b)
        {
          localObject = b;
          i3 = i2;
          i1 = i4;
          if (b)
          {
            i3 = g;
            i1 = g;
          }
        }
      }
    }
    i4 = i5;
    i2 = i6;
    if (paramBoolean)
    {
      localObject = f;
      i4 = i5;
      i2 = i6;
      if (localObject != null)
      {
        paramClassWriter = c;
        i4 = i5;
        i2 = i6;
        if (b)
        {
          localObject = b;
          i4 = i5;
          i2 = i6;
          if (b)
          {
            i4 = g;
            i2 = g;
          }
        }
      }
    }
    if ((i1 - i3 >= 0) && (i2 - i4 >= 0) && (i3 != Integer.MIN_VALUE) && (i3 != Integer.MAX_VALUE) && (i4 != Integer.MIN_VALUE) && (i4 != Integer.MAX_VALUE) && (i1 != Integer.MIN_VALUE) && (i1 != Integer.MAX_VALUE) && (i2 != Integer.MIN_VALUE))
    {
      i5 = i1;
      i1 = i2;
      if (i2 != Integer.MAX_VALUE) {}
    }
    else
    {
      i3 = 0;
      i1 = 0;
      i4 = 0;
      i5 = 0;
    }
    b(i3, i4, i5, i1);
  }
  
  public boolean c(int paramInt)
  {
    int i1;
    if (paramInt == 0)
    {
      if (b.b != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (c.b != null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      return paramInt + i1 < 2;
    }
    if (j.b != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (a.b != null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2;
    if (d.b != null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    return paramInt + i1 + i2 < 2;
  }
  
  public c charAt()
  {
    return t[0];
  }
  
  public void close(float paramFloat)
  {
    position = paramFloat;
  }
  
  public int contains(int paramInt)
  {
    if (paramInt == 0) {
      return get();
    }
    if (paramInt == 1) {
      return getValue();
    }
    return 0;
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    length = paramInt1;
    y = paramInt2;
  }
  
  public void d(MethodWriter paramMethodWriter)
  {
    r = paramMethodWriter;
  }
  
  public void d(Object paramObject)
  {
    access = paramObject;
  }
  
  public boolean d()
  {
    return (first) || ((b.equals()) && (c.equals()));
  }
  
  public float doubleValue()
  {
    return n;
  }
  
  public void e()
  {
    if (l == null) {
      l = new androidplot.XYPlot(this);
    }
    if (f == null) {
      f = new m(this);
    }
  }
  
  public void e(boolean paramBoolean)
  {
    count = paramBoolean;
  }
  
  public void equals(int paramInt)
  {
    length = paramInt;
  }
  
  public boolean equals()
  {
    Label localLabel1 = j;
    Label localLabel2 = b;
    if ((localLabel2 == null) || (b != localLabel1))
    {
      localLabel1 = a;
      localLabel2 = b;
    }
    return (localLabel2 != null) && (b == localLabel1);
  }
  
  public c f(int paramInt)
  {
    if (paramInt == 0) {
      return charAt();
    }
    if (paramInt == 1) {
      return isEmpty();
    }
    return null;
  }
  
  public boolean f()
  {
    Label localLabel1 = b;
    Label localLabel2 = b;
    if ((localLabel2 == null) || (b != localLabel1))
    {
      localLabel1 = c;
      localLabel2 = b;
    }
    return (localLabel2 != null) && (b == localLabel1);
  }
  
  public int get()
  {
    if (s == 8) {
      return 0;
    }
    return p;
  }
  
  public void get(int paramInt)
  {
    x = paramInt;
    int i1 = size;
    if (paramInt < i1) {
      x = i1;
    }
  }
  
  public int getHeight()
  {
    return height[0];
  }
  
  public int getLevel()
  {
    return level;
  }
  
  public int getSize()
  {
    return height[1];
  }
  
  public String getString()
  {
    return string;
  }
  
  public int getValue()
  {
    if (s == 8) {
      return 0;
    }
    return x;
  }
  
  public h getValue(int paramInt)
  {
    if (paramInt == 0) {
      return l;
    }
    if (paramInt == 1) {
      return f;
    }
    return null;
  }
  
  public boolean h()
  {
    return (count) && (s != 8);
  }
  
  public boolean indexOf()
  {
    return index;
  }
  
  public void init()
  {
    b.add();
    j.add();
    c.add();
    a.add();
    d.add();
    D.add();
    C.add();
    V.add();
    r = null;
    I = 0.0F;
    p = 0;
    x = 0;
    n = 0.0F;
    flags = -1;
    length = 0;
    y = 0;
    next = 0;
    limit = 0;
    q = 0;
    data = 0;
    size = 0;
    float f1 = children;
    position = f1;
    name = f1;
    Object localObject = t;
    c localC = c.b;
    localObject[0] = localC;
    localObject[1] = localC;
    access = null;
    code = 0;
    s = 0;
    text = null;
    L = false;
    token = false;
    id = 0;
    level = 0;
    initialized = false;
    read = false;
    localObject = left;
    localObject[0] = -1.0F;
    localObject[1] = -1.0F;
    type = -1;
    state = -1;
    localObject = height;
    localObject[0] = Integer.MAX_VALUE;
    localObject[1] = Integer.MAX_VALUE;
    h = 0;
    i = 0;
    m = 1.0F;
    g = 1.0F;
    A = Integer.MAX_VALUE;
    B = Integer.MAX_VALUE;
    z = 0;
    top = 0;
    last = false;
    e = -1;
    w = 1.0F;
    channel = false;
    localObject = this$0;
    localObject[0] = 1;
    localObject[1] = 1;
    index = false;
    localObject = W;
    localObject[0] = 0;
    localObject[1] = 0;
    count = true;
    localObject = H;
    localObject[0] = 0;
    localObject[1] = 0;
    pos = -1;
    buffer = -1;
  }
  
  public int intValue()
  {
    return data;
  }
  
  public c isEmpty()
  {
    return t[1];
  }
  
  boolean isPrimitive()
  {
    return ((this instanceof XYPlot)) || ((this instanceof i));
  }
  
  public int iterator()
  {
    return s;
  }
  
  public boolean k()
  {
    return s != 8;
  }
  
  public MethodWriter l()
  {
    return r;
  }
  
  public boolean m()
  {
    return (v) || ((j.equals()) && (a.equals()));
  }
  
  public float offset()
  {
    return position;
  }
  
  public int put()
  {
    MethodWriter localMethodWriter = r;
    if ((localMethodWriter != null) && ((localMethodWriter instanceof f))) {
      return size + length;
    }
    return length;
  }
  
  public void put(float paramFloat)
  {
    left[1] = paramFloat;
  }
  
  public void put(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = 0;
    }
    data = i1;
  }
  
  public void put(c paramC)
  {
    t[0] = paramC;
  }
  
  public void put(boolean paramBoolean)
  {
    K = paramBoolean;
  }
  
  public boolean put(int paramInt1, int paramInt2)
  {
    Label localLabel;
    if (paramInt1 == 0)
    {
      localLabel = b.b;
      if ((localLabel != null) && (localLabel.equals()))
      {
        localLabel = c.b;
        if ((localLabel != null) && (localLabel.equals())) {
          return c.b.e() - c.a() - (b.b.e() + b.a()) >= paramInt2;
        }
      }
    }
    else
    {
      localLabel = j.b;
      if ((localLabel != null) && (localLabel.equals()))
      {
        localLabel = a.b;
        if ((localLabel != null) && (localLabel.equals())) {
          return a.b.e() - a.a() - (j.b.e() + j.a()) >= paramInt2;
        }
      }
    }
    return false;
  }
  
  public void putInt(int paramInt)
  {
    id = paramInt;
  }
  
  public int readInt()
  {
    return flags;
  }
  
  public int readUnsignedShort()
  {
    return q;
  }
  
  public int register()
  {
    return id;
  }
  
  public boolean select()
  {
    int i2 = right.size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((Label)right.get(i1)).put()) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  public void set()
  {
    int i1 = 0;
    first = false;
    v = false;
    start = false;
    end = false;
    int i2 = right.size();
    while (i1 < i2)
    {
      ((Label)right.get(i1)).next();
      i1 += 1;
    }
  }
  
  public void set(int paramInt)
  {
    if (!K) {
      return;
    }
    int i1 = paramInt - q;
    int i2 = x;
    y = i1;
    j.a(i1);
    a.a(i2 + i1);
    d.a(paramInt);
    v = true;
  }
  
  public void set(boolean paramBoolean)
  {
    index = paramBoolean;
  }
  
  public void setText(int paramInt)
  {
    y = paramInt;
  }
  
  public int size()
  {
    MethodWriter localMethodWriter = r;
    if ((localMethodWriter != null) && ((localMethodWriter instanceof f))) {
      return state + y;
    }
    return y;
  }
  
  public float toString(int paramInt)
  {
    if (paramInt == 0) {
      return position;
    }
    if (paramInt == 1) {
      return name;
    }
    return -1.0F;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = text;
    String str = "";
    if (localObject != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("type: ");
      ((StringBuilder)localObject).append(text);
      ((StringBuilder)localObject).append(" ");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    localObject = str;
    if (string != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("id: ");
      ((StringBuilder)localObject).append(string);
      ((StringBuilder)localObject).append(" ");
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("(");
    localStringBuilder.append(length);
    localStringBuilder.append(", ");
    localStringBuilder.append(y);
    localStringBuilder.append(") - (");
    localStringBuilder.append(p);
    localStringBuilder.append(" x ");
    localStringBuilder.append(x);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void toString(StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("  ");
    localStringBuilder.append(currentStep);
    localStringBuilder.append(":{\n");
    paramStringBuilder.append(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualWidth:");
    localStringBuilder.append(p);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualHeight:");
    localStringBuilder.append(x);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualLeft:");
    localStringBuilder.append(length);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualTop:");
    localStringBuilder.append(y);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    a(paramStringBuilder, "left", b);
    a(paramStringBuilder, "top", j);
    a(paramStringBuilder, "right", c);
    a(paramStringBuilder, "bottom", a);
    a(paramStringBuilder, "baseline", d);
    a(paramStringBuilder, "centerX", D);
    a(paramStringBuilder, "centerY", C);
    append(paramStringBuilder, "    width", p, data, height[0], pos, z, h, m, left[0]);
    append(paramStringBuilder, "    height", x, size, height[1], buffer, top, i, g, left[1]);
    append(paramStringBuilder, "    dimensionRatio", n, flags);
    append(paramStringBuilder, "    horizontalBias", position, children);
    append(paramStringBuilder, "    verticalBias", name, children);
    append(paramStringBuilder, "    horizontalChainStyle", id, 0);
    append(paramStringBuilder, "    verticalChainStyle", level, 0);
    paramStringBuilder.append("  }");
  }
  
  public boolean trim()
  {
    return K;
  }
  
  public boolean visitAnnotation()
  {
    c[] arrayOfC = t;
    c localC1 = arrayOfC[0];
    c localC2 = c.a;
    return (localC1 == localC2) && (arrayOfC[1] == localC2);
  }
  
  public float visitAttribute()
  {
    return name;
  }
  
  public void visitFieldInsn(int paramInt)
  {
    q = paramInt;
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    K = bool;
  }
  
  public int visitFrame()
  {
    return size() + x;
  }
  
  public void visitFrame(int paramInt1, int paramInt2)
  {
    y = paramInt1;
    paramInt1 = paramInt2 - paramInt1;
    x = paramInt1;
    paramInt2 = size;
    if (paramInt1 < paramInt2) {
      x = paramInt2;
    }
  }
  
  public void visitInsn(int paramInt)
  {
    height[0] = paramInt;
  }
  
  public int visitInsnAnnotation()
  {
    return Y;
  }
  
  public int visitIntInsn()
  {
    return stackSize;
  }
  
  public void visitIntInsn(int paramInt)
  {
    s = paramInt;
  }
  
  public int visitInvokeDynamicInsn()
  {
    Label localLabel = b;
    int i1 = 0;
    if (localLabel != null) {
      i1 = 0 + j.r;
    }
    int i2 = i1;
    if (c != null) {
      i2 = i1 + a.r;
    }
    return i2;
  }
  
  public void visitJumpInsn(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 3)) {
      P = paramInt;
    }
  }
  
  public boolean visitLdcInsn()
  {
    return end;
  }
  
  public void visitLineNumber()
  {
    start = true;
  }
  
  public void visitLineNumber(int paramInt)
  {
    height[1] = paramInt;
  }
  
  public void visitLocalVariable(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = 0;
    }
    size = i1;
  }
  
  public boolean visitLocalVariable()
  {
    return localVar;
  }
  
  public boolean visitLocalVariableAnnotation(int paramInt)
  {
    return W[paramInt];
  }
  
  public int visitLookupSwitchInsn()
  {
    return put() + p;
  }
  
  public void visitMaxs(int paramInt)
  {
    j.a(paramInt);
    y = paramInt;
  }
  
  public boolean visitMaxs()
  {
    return start;
  }
  
  public int visitMethodInsn()
  {
    Label localLabel = b;
    int i1 = 0;
    if (localLabel != null) {
      i1 = 0 + r;
    }
    localLabel = c;
    int i2 = i1;
    if (localLabel != null) {
      i2 = i1 + r;
    }
    return i2;
  }
  
  public MethodWriter visitMethodInsn(int paramInt)
  {
    Label localLabel1;
    Label localLabel2;
    if (paramInt == 0)
    {
      localLabel1 = c;
      localLabel2 = b;
      if ((localLabel2 != null) && (b == localLabel1)) {
        return a;
      }
    }
    else if (paramInt == 1)
    {
      localLabel1 = a;
      localLabel2 = b;
      if ((localLabel2 != null) && (b == localLabel1)) {
        return a;
      }
    }
    return null;
  }
  
  public void visitMethodInsn(boolean paramBoolean)
  {
    localVar = paramBoolean;
  }
  
  public Object visitParameterAnnotation()
  {
    return access;
  }
  
  public void visitTableSwitchInsn(int paramInt)
  {
    b.a(paramInt);
    length = paramInt;
  }
  
  public void visitTableSwitchInsn(int paramInt1, int paramInt2)
  {
    length = paramInt1;
    paramInt1 = paramInt2 - paramInt1;
    p = paramInt1;
    paramInt2 = data;
    if (paramInt1 < paramInt2) {
      p = paramInt2;
    }
  }
  
  public void visitTryCatchBlock()
  {
    end = true;
  }
  
  public void visitVarInsn(int paramInt1, int paramInt2)
  {
    stackSize = paramInt1;
    Y = paramInt2;
    e(false);
  }
  
  public int width()
  {
    return size;
  }
  
  public boolean write()
  {
    return (pos != -1) || (buffer != -1);
  }
}
