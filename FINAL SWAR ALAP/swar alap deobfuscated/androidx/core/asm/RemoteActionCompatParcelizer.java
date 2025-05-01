package androidx.core.asm;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.ByteVector;

public class RemoteActionCompatParcelizer
{
  public RemoteActionCompatParcelizer() {}
  
  public static RemoteActionCompat read(ByteVector paramByteVector)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    N = ((IconCompat)paramByteVector.get(N, 1));
    c = paramByteVector.add(c, 2);
    a = paramByteVector.add(a, 3);
    i = ((PendingIntent)paramByteVector.get(i, 4));
    s = paramByteVector.a(s, 5);
    b = paramByteVector.a(b, 6);
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, ByteVector paramByteVector)
  {
    paramByteVector.add(false, false);
    paramByteVector.a(N, 1);
    paramByteVector.a(c, 2);
    paramByteVector.a(a, 3);
    paramByteVector.put(i, 4);
    paramByteVector.write(s, 5);
    paramByteVector.write(b, 6);
  }
}
