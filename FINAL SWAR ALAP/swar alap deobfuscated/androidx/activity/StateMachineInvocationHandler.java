package androidx.activity;

import astuetz.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import model.Log;
import widgets.Ref.ObjectRef;

public final class StateMachineInvocationHandler
{
  private final List a;
  private final Runnable b;
  private boolean currentState;
  private boolean found;
  private final Executor httpExecutor;
  private int log;
  private final Object object;
  private final Function this$0;
  
  public StateMachineInvocationHandler(Executor paramExecutor, Function paramFunction)
  {
    httpExecutor = paramExecutor;
    this$0 = paramFunction;
    object = new Object();
    a = new ArrayList();
    b = new AgendaListView.2(this);
  }
  
  private static final void invoke(StateMachineInvocationHandler paramStateMachineInvocationHandler)
  {
    Log.get(paramStateMachineInvocationHandler, "this$0");
    Object localObject = object;
    try
    {
      found = false;
      if ((log == 0) && (!currentState))
      {
        this$0.invoke();
        paramStateMachineInvocationHandler.invoke();
      }
      paramStateMachineInvocationHandler = Ref.ObjectRef.i;
      return;
    }
    catch (Throwable paramStateMachineInvocationHandler)
    {
      throw paramStateMachineInvocationHandler;
    }
  }
  
  public final boolean getValue()
  {
    Object localObject = object;
    try
    {
      boolean bool = currentState;
      return bool;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  public final void invoke()
  {
    Object localObject1 = object;
    try
    {
      currentState = true;
      Object localObject2 = a.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Function)((Iterator)localObject2).next()).invoke();
      }
      a.clear();
      localObject2 = Ref.ObjectRef.i;
      return;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
}
