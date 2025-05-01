package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class ClassWriter
{
  private final Deque queue = new ArrayDeque();
  
  ClassWriter() {}
  
  private static boolean apply(XmlPullParser paramXmlPullParser1, XmlPullParser paramXmlPullParser2)
  {
    if ((paramXmlPullParser2 != null) && (paramXmlPullParser1 != paramXmlPullParser2)) {}
    try
    {
      int i = paramXmlPullParser2.getEventType();
      if (i == 2)
      {
        boolean bool = "include".equals(paramXmlPullParser2.getName());
        return bool;
      }
    }
    catch (XmlPullParserException paramXmlPullParser1)
    {
      for (;;) {}
    }
    return false;
  }
  
  private static XmlPullParser get(Deque paramDeque)
  {
    while (!paramDeque.isEmpty())
    {
      XmlPullParser localXmlPullParser = (XmlPullParser)((WeakReference)paramDeque.peek()).get();
      if (get(localXmlPullParser)) {
        paramDeque.pop();
      } else {
        return localXmlPullParser;
      }
    }
    return null;
  }
  
  private static boolean get(XmlPullParser paramXmlPullParser)
  {
    if (paramXmlPullParser != null) {
      try
      {
        int i = paramXmlPullParser.getEventType();
        if (i != 3)
        {
          i = paramXmlPullParser.getEventType();
          return i == 1;
        }
      }
      catch (XmlPullParserException paramXmlPullParser) {}
    }
    return true;
  }
  
  boolean put(AttributeSet paramAttributeSet)
  {
    if ((paramAttributeSet instanceof XmlPullParser))
    {
      paramAttributeSet = (XmlPullParser)paramAttributeSet;
      if (paramAttributeSet.getDepth() == 1)
      {
        XmlPullParser localXmlPullParser = get(queue);
        queue.push(new WeakReference(paramAttributeSet));
        if (apply(paramAttributeSet, localXmlPullParser)) {
          return true;
        }
      }
    }
    return false;
  }
}
