package androidx.activity;

import android.window.BackEvent;

public final class b
{
  public static final Token TOK_FACT = new Token(null);
  private final float a;
  private final int b;
  private final float j;
  private final float k;
  
  public b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    j = paramFloat1;
    k = paramFloat2;
    a = paramFloat3;
    b = paramInt;
  }
  
  public b(BackEvent paramBackEvent)
  {
    this(localI.b(paramBackEvent), localI.a(paramBackEvent), localI.f(paramBackEvent), localI.i(paramBackEvent));
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BackEventCompat{touchX=");
    localStringBuilder.append(j);
    localStringBuilder.append(", touchY=");
    localStringBuilder.append(k);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(a);
    localStringBuilder.append(", swipeEdge=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}
