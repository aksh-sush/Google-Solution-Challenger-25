package VCard;

import com.google.protobuf.JGitText;
import com.google.protobuf.Point;
import package_30.ControllerOverlay;

public final class f
  extends JGitText
  implements Point
{
  private f()
  {
    super(MapPack.name());
  }
  
  public f f(c paramC)
  {
    copyOnWrite();
    MapPack.f((MapPack)instance, paramC);
    return this;
  }
  
  public f f(String paramString)
  {
    copyOnWrite();
    MapPack.dependsOn((MapPack)instance, paramString);
    return this;
  }
  
  public f f(ControllerOverlay paramControllerOverlay)
  {
    copyOnWrite();
    MapPack.dependsOn((MapPack)instance, paramControllerOverlay);
    return this;
  }
}
