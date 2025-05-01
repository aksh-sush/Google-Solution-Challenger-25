package androidx.activity;

import android.view.View;
import model.Log;

public abstract class s
{
  public static final void onClick(View paramView, GeoPoint paramGeoPoint)
  {
    Log.get(paramView, "<this>");
    Log.get(paramGeoPoint, "fullyDrawnReporterOwner");
    paramView.setTag(R.id.name, paramGeoPoint);
  }
}
