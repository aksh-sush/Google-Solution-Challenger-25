package android.support.v4.provider;

import androidx.core.asm.RemoteActionCompat;
import androidx.versionedparcelable.ByteVector;

public final class RemoteActionCompatParcelizer
  extends androidx.core.asm.RemoteActionCompatParcelizer
{
  public RemoteActionCompatParcelizer() {}
  
  public static RemoteActionCompat read(ByteVector paramByteVector)
  {
    return androidx.core.asm.RemoteActionCompatParcelizer.read(paramByteVector);
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, ByteVector paramByteVector)
  {
    androidx.core.asm.RemoteActionCompatParcelizer.write(paramRemoteActionCompat, paramByteVector);
  }
}
