package androidx.appcompat.app;

import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.FloatingActionButton;
import androidx.appcompat.widget.Switch;
import androidx.appcompat.widget.TextView;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.ViewCompat;
import handle.R.styleable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppCompatViewInflater
{
  private static final int[] a = { 16844156 };
  private static final int[] b = { 16844148 };
  private static final int[] c;
  private static final String[] sClassPrefixList = { "android.widget.", "android.view.", "android.webkit." };
  private static final androidx.collection.Context sConstructorMap = new androidx.collection.Context();
  private static final Class[] sConstructorSignature = { android.content.Context.class, AttributeSet.class };
  private static final int[] sOnClickAttrs = { 16843375 };
  private final Object[] mConstructorArgs = new Object[2];
  
  static
  {
    c = new int[] { 16844160 };
  }
  
  public AppCompatViewInflater() {}
  
  private void a(android.content.Context paramContext, View paramView, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT > 28) {
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c);
    if (localTypedArray.hasValue(0)) {
      ViewCompat.b(paramView, localTypedArray.getBoolean(0, false));
    }
    localTypedArray.recycle();
    localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a);
    if (localTypedArray.hasValue(0)) {
      ViewCompat.b(paramView, localTypedArray.getString(0));
    }
    localTypedArray.recycle();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b);
    if (paramContext.hasValue(0)) {
      ViewCompat.a(paramView, paramContext.getBoolean(0, false));
    }
    paramContext.recycle();
  }
  
  private void checkOnClickListener(View paramView, AttributeSet paramAttributeSet)
  {
    Object localObject = paramView.getContext();
    if ((localObject instanceof ContextWrapper))
    {
      if (!ViewCompat.hasOnClickListeners(paramView)) {
        return;
      }
      paramAttributeSet = ((android.content.Context)localObject).obtainStyledAttributes(paramAttributeSet, sOnClickAttrs);
      localObject = paramAttributeSet.getString(0);
      if (localObject != null) {
        paramView.setOnClickListener(new DeclaredOnClickListener(paramView, (String)localObject));
      }
      paramAttributeSet.recycle();
    }
  }
  
  private View createView(android.content.Context paramContext, String paramString1, String paramString2)
  {
    androidx.collection.Context localContext = sConstructorMap;
    Constructor localConstructor = (Constructor)localContext.get(paramString1);
    Object localObject = localConstructor;
    if ((localConstructor != null) || (paramString2 != null)) {}
    try
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append(paramString1);
      paramString2 = ((StringBuilder)localObject).toString();
      break label63;
      paramString2 = paramString1;
      label63:
      paramContext = Class.forName(paramString2, false, paramContext.getClassLoader()).asSubclass(View.class);
      paramString2 = sConstructorSignature;
      paramContext = paramContext.getConstructor(paramString2);
      localObject = paramContext;
      localContext.put(paramString1, paramContext);
      ((AccessibleObject)localObject).setAccessible(true);
      paramContext = mConstructorArgs;
      paramContext = ((Constructor)localObject).newInstance(paramContext);
      return (View)paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  /* Error */
  private View createViewFromTag(android.content.Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_2
    //   1: astore 6
    //   3: aload_2
    //   4: ldc -78
    //   6: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifeq +14 -> 23
    //   12: aload_3
    //   13: aconst_null
    //   14: ldc -72
    //   16: invokeinterface 188 3 0
    //   21: astore 6
    //   23: aload_0
    //   24: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   27: astore_2
    //   28: aload_2
    //   29: iconst_0
    //   30: aload_1
    //   31: aastore
    //   32: aload_2
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: aload 6
    //   38: bipush 46
    //   40: invokevirtual 192	java/lang/String:indexOf	(I)I
    //   43: istore 4
    //   45: iconst_m1
    //   46: iload 4
    //   48: if_icmpne +78 -> 126
    //   51: iconst_0
    //   52: istore 4
    //   54: getstatic 51	androidx/appcompat/app/AppCompatViewInflater:sClassPrefixList	[Ljava/lang/String;
    //   57: astore_2
    //   58: aload_2
    //   59: arraylength
    //   60: istore 5
    //   62: iload 4
    //   64: iload 5
    //   66: if_icmpge +45 -> 111
    //   69: aload_2
    //   70: iload 4
    //   72: aaload
    //   73: astore_2
    //   74: aload_0
    //   75: aload_1
    //   76: aload 6
    //   78: aload_2
    //   79: invokespecial 194	androidx/appcompat/app/AppCompatViewInflater:createView	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   82: astore_2
    //   83: aload_2
    //   84: ifnull +18 -> 102
    //   87: aload_0
    //   88: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   91: astore_1
    //   92: aload_1
    //   93: iconst_0
    //   94: aconst_null
    //   95: aastore
    //   96: aload_1
    //   97: iconst_1
    //   98: aconst_null
    //   99: aastore
    //   100: aload_2
    //   101: areturn
    //   102: iload 4
    //   104: iconst_1
    //   105: iadd
    //   106: istore 4
    //   108: goto -54 -> 54
    //   111: aload_0
    //   112: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   115: astore_1
    //   116: aload_1
    //   117: iconst_0
    //   118: aconst_null
    //   119: aastore
    //   120: aload_1
    //   121: iconst_1
    //   122: aconst_null
    //   123: aastore
    //   124: aconst_null
    //   125: areturn
    //   126: aload_0
    //   127: aload_1
    //   128: aload 6
    //   130: aconst_null
    //   131: invokespecial 194	androidx/appcompat/app/AppCompatViewInflater:createView	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   134: astore_1
    //   135: aload_0
    //   136: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   139: astore_2
    //   140: aload_2
    //   141: iconst_0
    //   142: aconst_null
    //   143: aastore
    //   144: aload_2
    //   145: iconst_1
    //   146: aconst_null
    //   147: aastore
    //   148: aload_1
    //   149: areturn
    //   150: astore_1
    //   151: aload_0
    //   152: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   155: astore_2
    //   156: aload_2
    //   157: iconst_0
    //   158: aconst_null
    //   159: aastore
    //   160: aload_2
    //   161: iconst_1
    //   162: aconst_null
    //   163: aastore
    //   164: aload_1
    //   165: athrow
    //   166: aload_0
    //   167: getfield 62	androidx/appcompat/app/AppCompatViewInflater:mConstructorArgs	[Ljava/lang/Object;
    //   170: astore_1
    //   171: aload_1
    //   172: iconst_0
    //   173: aconst_null
    //   174: aastore
    //   175: aload_1
    //   176: iconst_1
    //   177: aconst_null
    //   178: aastore
    //   179: aconst_null
    //   180: areturn
    //   181: astore_1
    //   182: goto -16 -> 166
    //   185: astore_1
    //   186: goto -20 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	AppCompatViewInflater
    //   0	189	1	paramContext	android.content.Context
    //   0	189	2	paramString	String
    //   0	189	3	paramAttributeSet	AttributeSet
    //   43	64	4	i	int
    //   60	7	5	j	int
    //   1	128	6	str	String
    // Exception table:
    //   from	to	target	type
    //   36	45	150	java/lang/Throwable
    //   54	62	150	java/lang/Throwable
    //   74	83	150	java/lang/Throwable
    //   126	135	150	java/lang/Throwable
    //   36	45	181	java/lang/Exception
    //   74	83	181	java/lang/Exception
    //   126	135	185	java/lang/Exception
  }
  
  private void put(View paramView, String paramString)
  {
    if (paramView != null) {
      return;
    }
    paramView = new StringBuilder();
    paramView.append(getClass().getName());
    paramView.append(" asked to inflate view for <");
    paramView.append(paramString);
    paramView.append(">, but returned null");
    throw new IllegalStateException(paramView.toString());
  }
  
  private static android.content.Context themifyContext(android.content.Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.View, 0, 0);
    int i;
    if (paramBoolean1) {
      i = paramAttributeSet.getResourceId(R.styleable.View_android_theme, 0);
    } else {
      i = 0;
    }
    int j = i;
    if (paramBoolean2)
    {
      j = i;
      if (i == 0)
      {
        int k = paramAttributeSet.getResourceId(R.styleable.View_theme, 0);
        i = k;
        j = i;
        if (k != 0)
        {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
          j = i;
        }
      }
    }
    paramAttributeSet.recycle();
    if ((j != 0) && ((!(paramContext instanceof ContextThemeWrapper)) || (((ContextThemeWrapper)paramContext).getThemeResId() != j))) {
      return new ContextThemeWrapper(paramContext, j);
    }
    return paramContext;
  }
  
  protected TextView a(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new TextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatCheckBox createListView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatCheckBox(paramContext, paramAttributeSet);
  }
  
  protected View createView(android.content.Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  public final View createView(View paramView, String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramBoolean1) && (paramView != null)) {
      localObject = paramView.getContext();
    } else {
      localObject = paramContext;
    }
    if (!paramBoolean2)
    {
      paramView = (View)localObject;
      if (!paramBoolean3) {}
    }
    else
    {
      paramView = themifyContext((android.content.Context)localObject, paramAttributeSet, paramBoolean2, paramBoolean3);
    }
    Object localObject = paramView;
    if (paramBoolean4) {
      localObject = TintContextWrapper.wrap(paramView);
    }
    paramString.hashCode();
    int j = paramString.hashCode();
    int i = -1;
    switch (j)
    {
    default: 
      break;
    case 2001146706: 
      if (paramString.equals("Button")) {
        i = 13;
      }
      break;
    case 1666676343: 
      if (paramString.equals("EditText")) {
        i = 12;
      }
      break;
    case 1601505219: 
      if (paramString.equals("CheckBox")) {
        i = 11;
      }
      break;
    case 1413872058: 
      if (paramString.equals("AutoCompleteTextView")) {
        i = 10;
      }
      break;
    case 1125864064: 
      if (paramString.equals("ImageView")) {
        i = 9;
      }
      break;
    case 799298502: 
      if (paramString.equals("ToggleButton")) {
        i = 8;
      }
      break;
    case 776382189: 
      if (paramString.equals("RadioButton")) {
        i = 7;
      }
      break;
    case -339785223: 
      if (paramString.equals("Spinner")) {
        i = 6;
      }
      break;
    case -658531749: 
      if (paramString.equals("SeekBar")) {
        i = 5;
      }
      break;
    case -937446323: 
      if (paramString.equals("ImageButton")) {
        i = 4;
      }
      break;
    case -938935918: 
      if (paramString.equals("TextView")) {
        i = 3;
      }
      break;
    case -1346021293: 
      if (paramString.equals("MultiAutoCompleteTextView")) {
        i = 2;
      }
      break;
    case -1455429095: 
      if (paramString.equals("CheckedTextView")) {
        i = 1;
      }
      break;
    case -1946472170: 
      if (paramString.equals("RatingBar")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      paramView = createView((android.content.Context)localObject, paramString, paramAttributeSet);
      break;
    case 13: 
      paramView = setBackgroundDrawable((android.content.Context)localObject, paramAttributeSet);
      break;
    case 12: 
      paramView = createView((android.content.Context)localObject, paramAttributeSet);
      break;
    case 11: 
      paramView = createListView((android.content.Context)localObject, paramAttributeSet);
      break;
    case 10: 
      paramView = init((android.content.Context)localObject, paramAttributeSet);
      break;
    case 9: 
      paramView = newInstance((android.content.Context)localObject, paramAttributeSet);
      break;
    case 8: 
      paramView = get((android.content.Context)localObject, paramAttributeSet);
      break;
    case 7: 
      paramView = onCreateView((android.content.Context)localObject, paramAttributeSet);
      break;
    case 6: 
      paramView = wrap((android.content.Context)localObject, paramAttributeSet);
      break;
    case 5: 
      paramView = inflate((android.content.Context)localObject, paramAttributeSet);
      break;
    case 4: 
      paramView = setImageDrawable((android.content.Context)localObject, paramAttributeSet);
      break;
    case 3: 
      paramView = a((android.content.Context)localObject, paramAttributeSet);
    }
    for (;;)
    {
      put(paramView, paramString);
      break;
      paramView = toString((android.content.Context)localObject, paramAttributeSet);
      continue;
      paramView = update((android.content.Context)localObject, paramAttributeSet);
      continue;
      paramView = createViewFromTag((android.content.Context)localObject, paramAttributeSet);
    }
    View localView = paramView;
    if (paramView == null)
    {
      localView = paramView;
      if (paramContext != localObject) {
        localView = createViewFromTag((android.content.Context)localObject, paramString, paramAttributeSet);
      }
    }
    if (localView != null)
    {
      checkOnClickListener(localView, paramAttributeSet);
      a((android.content.Context)localObject, localView, paramAttributeSet);
    }
    return localView;
  }
  
  protected AppCompatEditText createView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatEditText(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRatingBar createViewFromTag(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatRatingBar(paramContext, paramAttributeSet);
  }
  
  protected AppCompatImageButton get(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatImageButton(paramContext, paramAttributeSet);
  }
  
  protected Switch inflate(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new Switch(paramContext, paramAttributeSet);
  }
  
  protected AppCompatAutoCompleteTextView init(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatImageView newInstance(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatImageView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRadioButton onCreateView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatRadioButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatButton setBackgroundDrawable(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatButton(paramContext, paramAttributeSet);
  }
  
  protected FloatingActionButton setImageDrawable(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new FloatingActionButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatMultiAutoCompleteTextView toString(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatMultiAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatTextView update(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatSpinner wrap(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatSpinner(paramContext, paramAttributeSet);
  }
  
  class DeclaredOnClickListener
    implements View.OnClickListener
  {
    private final String mMethodName;
    private android.content.Context mResolvedContext;
    private Method mResolvedMethod;
    
    public DeclaredOnClickListener(String paramString)
    {
      mMethodName = paramString;
    }
    
    private void resolveMethod(android.content.Context paramContext)
    {
      while (paramContext != null)
      {
        try
        {
          boolean bool = paramContext.isRestricted();
          if (!bool)
          {
            localObject = paramContext.getClass();
            String str = mMethodName;
            localObject = ((Class)localObject).getMethod(str, new Class[] { View.class });
            if (localObject != null)
            {
              mResolvedMethod = ((Method)localObject);
              mResolvedContext = paramContext;
              return;
            }
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Object localObject;
          int i;
          for (;;) {}
        }
        if ((paramContext instanceof ContextWrapper)) {
          paramContext = ((ContextWrapper)paramContext).getBaseContext();
        } else {
          paramContext = null;
        }
      }
      i = getId();
      if (i == -1)
      {
        paramContext = "";
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append(" with id '");
        paramContext.append(getContext().getResources().getResourceEntryName(i));
        paramContext.append("'");
        paramContext = paramContext.toString();
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not find method ");
      ((StringBuilder)localObject).append(mMethodName);
      ((StringBuilder)localObject).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
      ((StringBuilder)localObject).append(getClass());
      ((StringBuilder)localObject).append(paramContext);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    public void onClick(View paramView)
    {
      if (mResolvedMethod == null) {
        resolveMethod(getContext());
      }
      Method localMethod = mResolvedMethod;
      android.content.Context localContext = mResolvedContext;
      try
      {
        localMethod.invoke(localContext, new Object[] { paramView });
        return;
      }
      catch (InvocationTargetException paramView)
      {
        throw new IllegalStateException("Could not execute method for android:onClick", paramView);
      }
      catch (IllegalAccessException paramView)
      {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", paramView);
      }
    }
  }
}
