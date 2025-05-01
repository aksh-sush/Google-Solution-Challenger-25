package SevenZip;

import java.nio.ByteBuffer;

public final class h
  extends f
{
  public h() {}
  
  public int a()
  {
    int i = add(16);
    if (i != 0) {
      return c(i);
    }
    return 0;
  }
  
  public int a(int paramInt)
  {
    int i = add(16);
    if (i != 0) {
      return b.getInt(size(i) + paramInt * 4);
    }
    return 0;
  }
  
  public h a(int paramInt, ByteBuffer paramByteBuffer)
  {
    f(paramInt, paramByteBuffer);
    return this;
  }
  
  public short add()
  {
    int i = add(12);
    if (i != 0) {
      return b.getShort(i + a);
    }
    return 0;
  }
  
  public short b()
  {
    int i = add(14);
    if (i != 0) {
      return b.getShort(i + a);
    }
    return 0;
  }
  
  public short c()
  {
    int i = add(8);
    if (i != 0) {
      return b.getShort(i + a);
    }
    return 0;
  }
  
  public void f(int paramInt, ByteBuffer paramByteBuffer)
  {
    add(paramInt, paramByteBuffer);
  }
  
  public boolean f()
  {
    int i = add(6);
    return (i != 0) && (b.get(i + a) != 0);
  }
  
  public int getCount()
  {
    int i = add(4);
    if (i != 0) {
      return b.getInt(i + a);
    }
    return 0;
  }
}
