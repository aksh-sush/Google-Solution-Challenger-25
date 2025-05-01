package SevenZip;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class Buffer
  extends f
{
  public Buffer() {}
  
  public static Buffer read(ByteBuffer paramByteBuffer)
  {
    return read(paramByteBuffer, new Buffer());
  }
  
  public static Buffer read(ByteBuffer paramByteBuffer, Buffer paramBuffer)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return paramBuffer.copyTo(paramByteBuffer.getInt(paramByteBuffer.position()) + paramByteBuffer.position(), paramByteBuffer);
  }
  
  public int a()
  {
    int i = add(6);
    if (i != 0) {
      return c(i);
    }
    return 0;
  }
  
  public h a(h paramH, int paramInt)
  {
    int i = add(6);
    if (i != 0) {
      return paramH.a(d(size(i) + paramInt * 4), b);
    }
    return null;
  }
  
  public void close(int paramInt, ByteBuffer paramByteBuffer)
  {
    add(paramInt, paramByteBuffer);
  }
  
  public Buffer copyTo(int paramInt, ByteBuffer paramByteBuffer)
  {
    close(paramInt, paramByteBuffer);
    return this;
  }
  
  public int size()
  {
    int i = add(4);
    if (i != 0) {
      return b.getInt(i + a);
    }
    return 0;
  }
}
