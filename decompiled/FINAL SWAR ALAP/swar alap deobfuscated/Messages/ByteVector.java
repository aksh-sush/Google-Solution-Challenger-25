package Messages;

import activity.MethodInfo;
import astuetz.MethodVisitor;
import javac.MethodWriter;
import kotlinx.coroutines.internal.f;
import widgets.Attribute;
import widgets.Path;
import widgets.Ref.ObjectRef;
import widgets.c;

public abstract class ByteVector
{
  public static final void a(MethodInfo paramMethodInfo1, MethodInfo paramMethodInfo2)
  {
    try
    {
      paramMethodInfo1 = MethodWriter.a(paramMethodInfo1);
      Path localPath = Attribute.i;
      f.add(paramMethodInfo1, Attribute.getValue(Ref.ObjectRef.i), null, 2, null);
      return;
    }
    catch (Throwable paramMethodInfo1)
    {
      read(paramMethodInfo2, paramMethodInfo1);
    }
  }
  
  public static final void a(MethodVisitor paramMethodVisitor, Object paramObject, MethodInfo paramMethodInfo, astuetz.Object paramObject1)
  {
    try
    {
      paramMethodVisitor = MethodWriter.a(MethodWriter.a(paramMethodVisitor, paramObject, paramMethodInfo));
      paramObject = Attribute.i;
      f.a(paramMethodVisitor, Attribute.getValue(Ref.ObjectRef.i), paramObject1);
      return;
    }
    catch (Throwable paramMethodVisitor)
    {
      read(paramMethodInfo, paramMethodVisitor);
    }
  }
  
  private static final void read(MethodInfo paramMethodInfo, Throwable paramThrowable)
  {
    Path localPath = Attribute.i;
    paramMethodInfo.resumeWith(Attribute.getValue(c.add(paramThrowable)));
    throw paramThrowable;
  }
}
