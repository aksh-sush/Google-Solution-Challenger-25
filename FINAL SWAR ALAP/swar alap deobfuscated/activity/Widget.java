package activity;

import astuetz.MethodVisitor;
import javac.MethodWriter;
import model.Log;
import widgets.Attribute;
import widgets.Ref.ObjectRef;

public abstract class Widget
{
  public static final void a(MethodVisitor paramMethodVisitor, Object paramObject, MethodInfo paramMethodInfo)
  {
    Log.get(paramMethodVisitor, "<this>");
    Log.get(paramMethodInfo, "completion");
    paramMethodVisitor = MethodWriter.a(MethodWriter.a(paramMethodVisitor, paramObject, paramMethodInfo));
    paramObject = Attribute.i;
    paramMethodVisitor.resumeWith(Attribute.getValue(Ref.ObjectRef.i));
  }
}
