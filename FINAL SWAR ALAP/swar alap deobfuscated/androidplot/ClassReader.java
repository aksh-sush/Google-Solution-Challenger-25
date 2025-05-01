package androidplot;

import adapters.Label;
import adapters.MethodWriter;
import adapters.b;
import adapters.c;
import adapters.f;
import java.util.ArrayList;

public abstract class ClassReader
{
  public static i a(MethodWriter paramMethodWriter, int paramInt, ArrayList paramArrayList, i paramI)
  {
    int i;
    if (paramInt == 0) {
      i = S;
    } else {
      i = o;
    }
    int k = 0;
    int j;
    if ((i != -1) && ((paramI == null) || (i != b)))
    {
      j = 0;
      for (;;)
      {
        localObject = paramI;
        if (j >= paramArrayList.size()) {
          break;
        }
        localObject = (i)paramArrayList.get(j);
        if (((i)localObject).b() == i)
        {
          if (paramI != null)
          {
            paramI.a(paramInt, (i)localObject);
            paramArrayList.remove(paramI);
          }
          break;
        }
        j += 1;
      }
    }
    Object localObject = paramI;
    if (i != -1) {
      return paramI;
    }
    paramI = (i)localObject;
    if (localObject == null)
    {
      paramI = (i)localObject;
      if ((paramMethodWriter instanceof b))
      {
        j = ((b)paramMethodWriter).a(paramInt);
        paramI = (i)localObject;
        if (j != -1)
        {
          i = 0;
          for (;;)
          {
            paramI = (i)localObject;
            if (i >= paramArrayList.size()) {
              break;
            }
            paramI = (i)paramArrayList.get(i);
            if (paramI.b() == j) {
              break;
            }
            i += 1;
          }
        }
      }
      localObject = paramI;
      if (paramI == null) {
        localObject = new i(paramInt);
      }
      paramArrayList.add(localObject);
      paramI = (i)localObject;
    }
    if (paramI.a(paramMethodWriter))
    {
      if ((paramMethodWriter instanceof adapters.i))
      {
        localObject = (adapters.i)paramMethodWriter;
        Label localLabel = ((adapters.i)localObject).a();
        i = k;
        if (((adapters.i)localObject).b() == 0) {
          i = 1;
        }
        localLabel.a(i, paramArrayList, paramI);
      }
      i = paramI.b();
      if (paramInt == 0)
      {
        S = i;
        b.a(paramInt, paramArrayList, paramI);
        localObject = c;
      }
      else
      {
        o = i;
        paramMethodWriter.j.a(paramInt, paramArrayList, paramI);
        d.a(paramInt, paramArrayList, paramI);
        localObject = a;
      }
      ((Label)localObject).a(paramInt, paramArrayList, paramI);
      V.a(paramInt, paramArrayList, paramI);
    }
    return paramI;
  }
  
  private static i a(ArrayList paramArrayList, int paramInt)
  {
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      i localI = (i)paramArrayList.get(i);
      if (paramInt == b) {
        return localI;
      }
      i += 1;
    }
    return null;
  }
  
  public static boolean a(f paramF, d paramD)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a26 = a25\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public static boolean b(c paramC1, c paramC2, c paramC3, c paramC4)
  {
    c localC1 = c.b;
    if (paramC3 != localC1)
    {
      c localC2 = c.c;
      if ((paramC3 != localC2) && ((paramC3 != c.d) || (paramC1 == localC2)))
      {
        i = 0;
        break label47;
      }
    }
    int i = 1;
    label47:
    if (paramC4 != localC1)
    {
      paramC1 = c.c;
      if ((paramC4 != paramC1) && ((paramC4 != c.d) || (paramC2 == paramC1)))
      {
        j = 0;
        break label86;
      }
    }
    int j = 1;
    label86:
    if (i == 0) {
      return j != 0;
    }
    return true;
  }
}
