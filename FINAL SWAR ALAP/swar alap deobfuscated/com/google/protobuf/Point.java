package com.google.protobuf;

public abstract interface Point
{
  public abstract MessageLite getDefaultInstanceForType();
  
  public abstract boolean isInitialized();
}
