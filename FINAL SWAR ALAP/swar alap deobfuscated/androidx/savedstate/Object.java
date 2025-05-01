package androidx.savedstate;

import android.os.Bundle;

public abstract interface Object
{
  public abstract Bundle onSaveInstanceState();
}
