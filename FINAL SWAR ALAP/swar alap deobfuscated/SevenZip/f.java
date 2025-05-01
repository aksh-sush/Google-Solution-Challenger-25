package SevenZip;

import java.nio.ByteBuffer;

public abstract class f
{
  protected int a;
  protected ByteBuffer b;
  private int c;
  ClassWriter d = ClassWriter.newUTF8();
  private int z;
  
  public f() {}
  
  protected int add(int paramInt)
  {
    if (paramInt < z) {
      return b.getShort(c + paramInt);
    }
    return 0;
  }
  
  protected void add(int paramInt, ByteBuffer paramByteBuffer)
  {
    b = paramByteBuffer;
    if (paramByteBuffer != null)
    {
      a = paramInt;
      paramInt -= paramByteBuffer.getInt(paramInt);
      c = paramInt;
      paramInt = b.getShort(paramInt);
    }
    else
    {
      paramInt = 0;
      a = 0;
      c = 0;
    }
    z = paramInt;
  }
  
  protected int c(int paramInt)
  {
    paramInt += a;
    int i = b.getInt(paramInt);
    return b.getInt(paramInt + i);
  }
  
  protected int d(int paramInt)
  {
    return paramInt + b.getInt(paramInt);
  }
  
  protected int size(int paramInt)
  {
    paramInt += a;
    return paramInt + b.getInt(paramInt) + 4;
  }
}
