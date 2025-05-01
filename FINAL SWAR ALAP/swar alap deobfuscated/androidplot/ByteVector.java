package androidplot;

import java.util.Iterator;
import java.util.List;

class ByteVector
  extends Label
{
  public int a;
  
  public ByteVector(h paramH)
  {
    super(paramH);
    if ((paramH instanceof XYPlot)) {
      paramH = Plot.RenderMode.renderMode;
    } else {
      paramH = Plot.RenderMode.USE_BACKGROUND_THREAD;
    }
    k = paramH;
  }
  
  public void a(int paramInt)
  {
    if (b) {
      return;
    }
    b = true;
    g = paramInt;
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      l localL = (l)localIterator.next();
      localL.a(localL);
    }
  }
}
