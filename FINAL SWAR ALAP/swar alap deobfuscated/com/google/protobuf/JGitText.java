package com.google.protobuf;

import java.io.IOException;

public abstract class JGitText
  extends AbstractMessageLite.Builder
{
  private final z defaultInstance;
  protected z instance;
  protected boolean isBuilt;
  
  protected JGitText(DescriptorProtos.MessageOptions paramMessageOptions)
  {
    defaultInstance = paramMessageOptions;
    instance = ((DescriptorProtos.MessageOptions)paramMessageOptions.dynamicMethod(RealmFieldType.TRUE));
    isBuilt = false;
  }
  
  private void add(DescriptorProtos.MessageOptions paramMessageOptions1, DescriptorProtos.MessageOptions paramMessageOptions2)
  {
    Map.Entry.next().next(paramMessageOptions1).a(paramMessageOptions1, paramMessageOptions2);
  }
  
  public final DescriptorProtos.MessageOptions build()
  {
    DescriptorProtos.MessageOptions localMessageOptions = buildPartial();
    if (localMessageOptions.isInitialized()) {
      return localMessageOptions;
    }
    throw AbstractMessageLite.Builder.newUninitializedMessageException(localMessageOptions);
  }
  
  public DescriptorProtos.MessageOptions buildPartial()
  {
    if (isBuilt) {
      return instance;
    }
    instance.makeImmutable();
    isBuilt = true;
    return instance;
  }
  
  public final JGitText clear()
  {
    instance = ((DescriptorProtos.MessageOptions)instance.dynamicMethod(RealmFieldType.TRUE));
    return this;
  }
  
  public JGitText clone()
  {
    JGitText localJGitText = getDefaultInstanceForType().newBuilderForType();
    localJGitText.mergeFrom(buildPartial());
    return localJGitText;
  }
  
  protected final void copyOnWrite()
  {
    if (isBuilt)
    {
      copyOnWriteInternal();
      isBuilt = false;
    }
  }
  
  protected void copyOnWriteInternal()
  {
    DescriptorProtos.MessageOptions localMessageOptions = (DescriptorProtos.MessageOptions)instance.dynamicMethod(RealmFieldType.TRUE);
    add(localMessageOptions, instance);
    instance = localMessageOptions;
  }
  
  public DescriptorProtos.MessageOptions getDefaultInstanceForType()
  {
    return defaultInstance;
  }
  
  protected JGitText internalMergeFrom(DescriptorProtos.MessageOptions paramMessageOptions)
  {
    return mergeFrom(paramMessageOptions);
  }
  
  public final boolean isInitialized()
  {
    return DescriptorProtos.MessageOptions.isInitialized(instance, false);
  }
  
  public JGitText mergeFrom(Class paramClass, InputStream paramInputStream)
  {
    copyOnWrite();
    try
    {
      Map.Entry.next().next(instance).a(instance, Resources.toString(paramClass), paramInputStream);
      return this;
    }
    catch (RuntimeException paramClass)
    {
      if ((paramClass.getCause() instanceof IOException)) {
        throw ((IOException)paramClass.getCause());
      }
      throw paramClass;
    }
  }
  
  public JGitText mergeFrom(DescriptorProtos.MessageOptions paramMessageOptions)
  {
    copyOnWrite();
    add(instance, paramMessageOptions);
    return this;
  }
  
  public JGitText mergeFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return mergeFrom(paramArrayOfByte, paramInt1, paramInt2, InputStream.newInstance());
  }
  
  public JGitText mergeFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2, InputStream paramInputStream)
  {
    copyOnWrite();
    try
    {
      Object localObject = Map.Entry.next();
      DescriptorProtos.MessageOptions localMessageOptions = instance;
      localObject = ((Map.Entry)localObject).next(localMessageOptions);
      localMessageOptions = instance;
      ((Object)localObject).put(localMessageOptions, paramArrayOfByte, paramInt1, paramInt1 + paramInt2, new Context(paramInputStream));
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
      throw Iterator.iterator();
    }
    catch (Iterator paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      for (;;) {}
    }
  }
}
