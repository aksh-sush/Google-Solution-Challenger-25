package ClickListeners;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.JsonNode;
import androidx.core.view.PdfContentStreamProcessor.SetTextWordSpacing;
import java.util.Iterator;
import model.Log;
import sequences.Sequence;

public abstract class Context
{
  private static final int b = c.b;
  private static final int g = c.a;
  
  private static final Platform get(View paramView)
  {
    int i = g;
    Platform localPlatform2 = (Platform)paramView.getTag(i);
    Platform localPlatform1 = localPlatform2;
    if (localPlatform2 == null)
    {
      localPlatform1 = new Platform();
      paramView.setTag(i, localPlatform1);
    }
    return localPlatform1;
  }
  
  public static final void invoke(View paramView)
  {
    Log.get(paramView, "<this>");
    paramView = PdfContentStreamProcessor.SetTextWordSpacing.invoke(paramView).iterator();
    while (paramView.hasNext()) {
      get((View)paramView.next()).invoke();
    }
  }
  
  public static final void invoke(View paramView, boolean paramBoolean)
  {
    Log.get(paramView, "<this>");
    paramView.setTag(b, Boolean.valueOf(paramBoolean));
  }
  
  public static final void invoke(ViewGroup paramViewGroup)
  {
    Log.get(paramViewGroup, "<this>");
    paramViewGroup = JsonNode.get(paramViewGroup).iterator();
    while (paramViewGroup.hasNext()) {
      get((View)paramViewGroup.next()).invoke();
    }
  }
}
