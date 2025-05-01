package model;

import java.io.Serializable;

public abstract class Lambda
  implements FunctionImpl, Serializable
{
  private final int arity;
  
  public Lambda(int paramInt)
  {
    arity = paramInt;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  public String toString()
  {
    String str = f.c(this);
    Log.append(str, "renderLambdaToString(this)");
    return str;
  }
}
