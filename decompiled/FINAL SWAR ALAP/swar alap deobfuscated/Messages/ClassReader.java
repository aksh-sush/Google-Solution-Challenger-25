package Messages;

import activity.MethodInfo;
import astuetz.MethodVisitor;
import kotlin.coroutines.stats.internal.Log;
import kotlinx.coroutines.internal.Label;
import kotlinx.coroutines.internal.NavigationMenuPresenter;
import model.TypeIntrinsics;
import package_32.XYPlot;
import package_32.f;
import package_32.l;
import widgets.Attribute;
import widgets.c;

public abstract class ClassReader
{
  public static final Object a(NavigationMenuPresenter paramNavigationMenuPresenter, Object paramObject, MethodVisitor paramMethodVisitor)
  {
    int i = 0;
    try
    {
      paramObject = ((MethodVisitor)TypeIntrinsics.a(paramMethodVisitor, 2)).invoke(paramObject, paramNavigationMenuPresenter);
    }
    catch (Throwable paramObject)
    {
      paramObject = new l(paramObject, false, 2, null);
    }
    if (paramObject == javac.MethodWriter.f()) {}
    do
    {
      return javac.MethodWriter.f();
      paramMethodVisitor = paramNavigationMenuPresenter.b(paramObject);
    } while (paramMethodVisitor == package_32.MethodWriter.d);
    if ((paramMethodVisitor instanceof l))
    {
      paramMethodVisitor = a;
      if ((!(paramMethodVisitor instanceof XYPlot)) || (j != paramNavigationMenuPresenter)) {
        i = 1;
      }
      if (i == 0)
      {
        if (!(paramObject instanceof l)) {
          return paramObject;
        }
        throw a;
      }
      throw paramMethodVisitor;
    }
    return package_32.MethodWriter.a(paramMethodVisitor);
  }
  
  public static final void a(MethodVisitor paramMethodVisitor, Object paramObject, MethodInfo paramMethodInfo)
  {
    MethodInfo localMethodInfo = Log.getText(paramMethodInfo);
    try
    {
      paramMethodInfo = paramMethodInfo.getContext();
      Object localObject = Label.a(paramMethodInfo, null);
      try
      {
        paramObject = ((MethodVisitor)TypeIntrinsics.a(paramMethodVisitor, 2)).invoke(paramObject, localMethodInfo);
        paramMethodVisitor = paramObject;
        Label.b(paramMethodInfo, localObject);
        if (paramObject == javac.MethodWriter.f()) {}
      }
      catch (Throwable paramMethodVisitor)
      {
        Label.b(paramMethodInfo, localObject);
        throw paramMethodVisitor;
      }
      return;
    }
    catch (Throwable paramMethodVisitor)
    {
      paramObject = Attribute.i;
      paramMethodVisitor = c.add(paramMethodVisitor);
      localMethodInfo.resumeWith(Attribute.getValue(paramMethodVisitor));
    }
  }
  
  public static final Object b(NavigationMenuPresenter paramNavigationMenuPresenter, Object paramObject, MethodVisitor paramMethodVisitor)
  {
    try
    {
      paramObject = ((MethodVisitor)TypeIntrinsics.a(paramMethodVisitor, 2)).invoke(paramObject, paramNavigationMenuPresenter);
    }
    catch (Throwable paramObject)
    {
      paramObject = new l(paramObject, false, 2, null);
    }
    if (paramObject == javac.MethodWriter.f()) {}
    do
    {
      return javac.MethodWriter.f();
      paramNavigationMenuPresenter = paramNavigationMenuPresenter.b(paramObject);
    } while (paramNavigationMenuPresenter == package_32.MethodWriter.d);
    if (!(paramNavigationMenuPresenter instanceof l)) {
      return package_32.MethodWriter.a(paramNavigationMenuPresenter);
    }
    throw a;
  }
}
