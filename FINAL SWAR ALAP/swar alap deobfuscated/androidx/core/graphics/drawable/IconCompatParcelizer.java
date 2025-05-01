package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.ByteVector;

public class IconCompatParcelizer
{
  public IconCompatParcelizer() {}
  
  public static IconCompat read(ByteVector paramByteVector)
  {
    IconCompat localIconCompat = new IconCompat();
    b = paramByteVector.add(b, 1);
    c = paramByteVector.read(c, 2);
    i = paramByteVector.get(i, 3);
    g = paramByteVector.add(g, 4);
    p = paramByteVector.add(p, 5);
    position = ((ColorStateList)paramByteVector.get(position, 6));
    x = paramByteVector.a(x, 7);
    s = paramByteVector.a(s, 8);
    localIconCompat.a();
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, ByteVector paramByteVector)
  {
    paramByteVector.add(true, true);
    paramIconCompat.encode(paramByteVector.processBytes());
    int i = b;
    if (-1 != i) {
      paramByteVector.a(i, 1);
    }
    Object localObject = c;
    if (localObject != null) {
      paramByteVector.a((byte[])localObject, 2);
    }
    localObject = paramIconCompat.i;
    if (localObject != null) {
      paramByteVector.put((Parcelable)localObject, 3);
    }
    i = g;
    if (i != 0) {
      paramByteVector.a(i, 4);
    }
    i = p;
    if (i != 0) {
      paramByteVector.a(i, 5);
    }
    localObject = position;
    if (localObject != null) {
      paramByteVector.put((Parcelable)localObject, 6);
    }
    localObject = x;
    if (localObject != null) {
      paramByteVector.putByte((String)localObject, 7);
    }
    paramIconCompat = s;
    if (paramIconCompat != null) {
      paramByteVector.putByte(paramIconCompat, 8);
    }
  }
}
