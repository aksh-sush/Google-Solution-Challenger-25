package adapters;

import t.d.b;

public enum Handle
{
  static
  {
    Handle localHandle1 = new Handle("NONE", 0);
    CENTER = localHandle1;
    Handle localHandle2 = new Handle("LEFT", 1);
    c = localHandle2;
    Handle localHandle3 = new Handle("TOP", 2);
    i = localHandle3;
    Handle localHandle4 = new Handle("RIGHT", 3);
    a = localHandle4;
    Handle localHandle5 = new Handle("BOTTOM", 4);
    b = localHandle5;
    Handle localHandle6 = new Handle("BASELINE", 5);
    d = localHandle6;
    Handle localHandle7 = new Handle("CENTER", 6);
    r = localHandle7;
    Handle localHandle8 = new Handle("CENTER_X", 7);
    g = localHandle8;
    Handle localHandle9 = new Handle("CENTER_Y", 8);
    e = localHandle9;
    $VALUES = new Handle[] { localHandle1, localHandle2, localHandle3, localHandle4, localHandle5, localHandle6, localHandle7, localHandle8, localHandle9 };
  }
}
