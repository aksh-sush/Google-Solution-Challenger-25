package model;

import commons.Item;

public abstract class FunctionReference
  extends FilterIterator
  implements FunctionImpl, Item
{
  private final int arity;
  private final int position;
  
  public FunctionReference(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2)
  {
    super(paramObject, paramClass, paramString1, paramString2, bool);
    arity = paramInt1;
    position = (paramInt2 >> 1);
  }
  
  protected commons.Object b()
  {
    return f.c(this);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof FunctionReference))
    {
      paramObject = (FunctionReference)paramObject;
      return (getRepositoryName().equals(paramObject.getRepositoryName())) && (toNormalizedString().equals(paramObject.toNormalizedString())) && (position == position) && (arity == arity) && (Log.append(remove(), paramObject.remove())) && (Log.append(next(), paramObject.next()));
    }
    if ((paramObject instanceof Item)) {
      return paramObject.equals(hasNext());
    }
    return false;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  public int hashCode()
  {
    int i;
    if (next() == null) {
      i = 0;
    } else {
      i = next().hashCode() * 31;
    }
    return (i + getRepositoryName().hashCode()) * 31 + toNormalizedString().hashCode();
  }
  
  public String toString()
  {
    Object localObject = hasNext();
    if (localObject != this) {
      return localObject.toString();
    }
    if ("<init>".equals(getRepositoryName())) {
      return "constructor (Kotlin reflection is not available)";
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("function ");
    ((StringBuilder)localObject).append(getRepositoryName());
    ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
    return ((StringBuilder)localObject).toString();
  }
}
