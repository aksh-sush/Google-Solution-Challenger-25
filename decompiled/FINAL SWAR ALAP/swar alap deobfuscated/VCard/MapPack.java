package VCard;

import com.google.protobuf.DescriptorProtos.MessageOptions;
import com.google.protobuf.Point;
import com.google.protobuf.RealmFieldType;
import com.google.protobuf.d1;
import package_30.ControllerOverlay;
import s5.a;

public final class MapPack
  extends DescriptorProtos.MessageOptions
  implements Point
{
  private static final MapPack DEFAULT_INSTANCE;
  public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
  public static final int PARENT_FIELD_NUMBER = 1;
  private static volatile d1 PARSER;
  public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
  private int limitType_;
  private String parent_ = "";
  private int queryTypeCase_ = 0;
  private Object queryType_;
  
  static
  {
    MapPack localMapPack = new MapPack();
    DEFAULT_INSTANCE = localMapPack;
    DescriptorProtos.MessageOptions.registerDefaultInstance(a.class, localMapPack);
  }
  
  private MapPack() {}
  
  private void a(c paramC)
  {
    limitType_ = paramC.getNumber();
  }
  
  public static f access$getMMenu()
  {
    return (f)DEFAULT_INSTANCE.createBuilder();
  }
  
  private void contains(ControllerOverlay paramControllerOverlay)
  {
    paramControllerOverlay.getClass();
    queryType_ = paramControllerOverlay;
    queryTypeCase_ = 2;
  }
  
  private void getName(String paramString)
  {
    paramString.getClass();
    parent_ = paramString;
  }
  
  public static MapPack getSize(byte[] paramArrayOfByte)
  {
    return (MapPack)DescriptorProtos.MessageOptions.parseFrom(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public c a()
  {
    c localC2 = c.a(limitType_);
    c localC1 = localC2;
    if (localC2 == null) {
      localC1 = c.b;
    }
    return localC1;
  }
  
  public String current()
  {
    return parent_;
  }
  
  protected final Object dynamicMethod(RealmFieldType paramRealmFieldType, Object paramObject1, Object paramObject2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a7 = a6\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public ControllerOverlay path()
  {
    if (queryTypeCase_ == 2) {
      return (ControllerOverlay)queryType_;
    }
    return ControllerOverlay.getInstance();
  }
}
