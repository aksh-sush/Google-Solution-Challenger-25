package com.google.protobuf;

import java.io.OutputStream;

public abstract interface MessageLite
  extends Point
{
  public abstract Parser getParserForType();
  
  public abstract int getSerializedSize();
  
  public abstract t0.a newBuilderForType();
  
  public abstract t0.a toBuilder();
  
  public abstract byte[] toByteArray();
  
  public abstract void writeTo(Log paramLog);
  
  public abstract void writeTo(OutputStream paramOutputStream);
}
