package analysis;

import java.io.File;

public final class m
{
  public static final f.b.a i = new f.b.a(null);
  private String a;
  private d b;
  private String c;
  private String e;
  private File f;
  private float[] n;
  private Runnable q;
  private int s;
  
  public m(String paramString1, String paramString2, String paramString3, int paramInt, float[] paramArrayOfFloat)
  {
    a = paramString1;
    e = paramString2;
    c = paramString3;
    s = paramInt;
    n = paramArrayOfFloat;
  }
  
  public final m a(Runnable paramRunnable)
  {
    q = paramRunnable;
    return this;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final d b()
  {
    return b;
  }
  
  public final String c()
  {
    return c;
  }
  
  public final void c(File paramFile)
  {
    f = paramFile;
  }
  
  public final float[] d()
  {
    return n;
  }
  
  public final String e()
  {
    return e;
  }
  
  public final void e(d paramD)
  {
    b = paramD;
  }
  
  public final File f()
  {
    return f;
  }
  
  public final int getValue()
  {
    return s;
  }
}
