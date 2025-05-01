package a;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.e0;
import java.util.List;
import tts.Item;
import tts.h;

public class d
  implements i
{
  public d() {}
  
  public void a(RecyclerView.e0 paramE0, int paramInt)
  {
    h localH = Item.c(paramE0, paramInt);
    if (localH != null) {
      try
      {
        localH.setIcon(paramE0);
        return;
      }
      catch (AbstractMethodError paramE0)
      {
        Log.e("FastAdapter", paramE0.toString());
      }
    }
  }
  
  public void add(RecyclerView.e0 paramE0, int paramInt, List paramList)
  {
    Object localObject = a.getTag(tts.d.c);
    if ((localObject instanceof Item))
    {
      localObject = ((Item)localObject).toString(paramInt);
      if (localObject != null)
      {
        ((h)localObject).a(paramE0, paramList);
        a.setTag(tts.d.l, localObject);
      }
    }
  }
  
  public void b(RecyclerView.e0 paramE0, int paramInt)
  {
    h localH = Item.c(paramE0, paramInt);
    if (localH != null) {
      localH.getItem(paramE0);
    }
  }
  
  public boolean c(RecyclerView.e0 paramE0, int paramInt)
  {
    h localH = (h)a.getTag(tts.d.l);
    if (localH != null) {
      return localH.c(paramE0);
    }
    return false;
  }
  
  public void e(RecyclerView.e0 paramE0, int paramInt)
  {
    Object localObject = a;
    paramInt = tts.d.l;
    localObject = (h)((View)localObject).getTag(paramInt);
    if (localObject != null)
    {
      ((h)localObject).b(paramE0);
      a.setTag(paramInt, null);
      a.setTag(tts.d.c, null);
      return;
    }
    Log.e("FastAdapter", "The bindView method of this item should set the `Tag` on its itemView (https://github.com/mikepenz/FastAdapter/blob/develop/library-core/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java#L189)");
  }
}
