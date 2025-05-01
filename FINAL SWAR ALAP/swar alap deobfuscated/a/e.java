package a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.e0;
import opengl.w;
import tts.Item;
import tts.h;

public class e
  implements l
{
  public e() {}
  
  public RecyclerView.e0 a(Item paramItem, ViewGroup paramViewGroup, int paramInt)
  {
    return paramItem.c(paramInt).a(paramViewGroup);
  }
  
  public RecyclerView.e0 a(Item paramItem, RecyclerView.e0 paramE0)
  {
    w.a(paramE0, paramItem.newClass());
    return paramE0;
  }
}
