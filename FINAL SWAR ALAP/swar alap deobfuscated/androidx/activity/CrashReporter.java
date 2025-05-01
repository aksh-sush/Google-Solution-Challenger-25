package androidx.activity;

import android.view.View;
import model.Log;

public abstract class CrashReporter
{
  public static final void init(View paramView, Point paramPoint)
  {
    Log.get(paramView, "<this>");
    Log.get(paramPoint, "onBackPressedDispatcherOwner");
    paramView.setTag(R.id.tag, paramPoint);
  }
}
