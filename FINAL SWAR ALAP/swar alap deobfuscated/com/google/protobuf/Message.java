package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

public abstract class Message
  implements MessageLite
{
  protected int memoizedHashCode = 0;
  
  public Message() {}
  
  protected static void addAll(Iterable paramIterable, Collection paramCollection)
  {
    AbstractMessageLite.Builder.addAll(paramIterable, (List)paramCollection);
  }
  
  protected static void addAll(Iterable paramIterable, List paramList)
  {
    AbstractMessageLite.Builder.addAll(paramIterable, paramList);
  }
  
  private String build(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Serializing ");
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(" to a ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" threw an IOException (should never happen).");
    return localStringBuilder.toString();
  }
  
  protected static void checkByteStringIsUtf8(ByteString paramByteString)
  {
    if (paramByteString.equals()) {
      return;
    }
    throw new IllegalArgumentException("Byte string is not UTF-8.");
  }
  
  abstract int getMemoizedSerializedSize();
  
  int getSerializedSize(Object paramObject)
  {
    int j = getMemoizedSerializedSize();
    int i = j;
    if (j == -1)
    {
      i = paramObject.c(this);
      setMemoizedSerializedSize(i);
    }
    return i;
  }
  
  UninitializedMessageException newUninitializedMessageException()
  {
    return new UninitializedMessageException(this);
  }
  
  abstract void setMemoizedSerializedSize(int paramInt);
  
  public byte[] toByteArray()
  {
    try
    {
      int i = getSerializedSize();
      byte[] arrayOfByte = new byte[i];
      Log localLog = Log.newInstance(arrayOfByte);
      writeTo(localLog);
      localLog.close();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(build("byte array"), localIOException);
    }
  }
  
  public ByteString toByteString()
  {
    try
    {
      Object localObject = ByteString.newCodedBuilder(getSerializedSize());
      writeTo(((ByteString.CodedBuilder)localObject).getCodedOutput());
      localObject = ((ByteString.CodedBuilder)localObject).build();
      return localObject;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(build("ByteString"), localIOException);
    }
  }
  
  public void writeDelimitedTo(OutputStream paramOutputStream)
  {
    int i = getSerializedSize();
    paramOutputStream = Log.newInstance(paramOutputStream, Log.computePreferredBufferSize(Log.value(i) + i));
    paramOutputStream.setText(i);
    writeTo(paramOutputStream);
    paramOutputStream.flush();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    paramOutputStream = Log.newInstance(paramOutputStream, Log.computePreferredBufferSize(getSerializedSize()));
    writeTo(paramOutputStream);
    paramOutputStream.flush();
  }
}
