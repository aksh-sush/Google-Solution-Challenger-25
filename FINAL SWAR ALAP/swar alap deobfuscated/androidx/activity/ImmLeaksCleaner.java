package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class ImmLeaksCleaner
  implements c
{
  private static Field A;
  private static Field b;
  private static int m;
  private static Field r;
  private Activity a;
  
  ImmLeaksCleaner(Activity paramActivity)
  {
    a = paramActivity;
  }
  
  private static void init()
  {
    m = 2;
    try
    {
      Field localField = InputMethodManager.class.getDeclaredField("mServedView");
      b = localField;
      localField.setAccessible(true);
      localField = InputMethodManager.class.getDeclaredField("mNextServedView");
      r = localField;
      localField.setAccessible(true);
      localField = InputMethodManager.class.getDeclaredField("mH");
      A = localField;
      localField.setAccessible(true);
      m = 1;
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
  }
  
  /* Error */
  public void a(androidx.lifecycle.m paramM, androidx.lifecycle.LifecycleEvent paramLifecycleEvent)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 67	androidx/lifecycle/LifecycleEvent:ON_DESTROY	Landroidx/lifecycle/LifecycleEvent;
    //   4: if_acmpeq +4 -> 8
    //   7: return
    //   8: getstatic 28	androidx/activity/ImmLeaksCleaner:m	I
    //   11: ifne +6 -> 17
    //   14: invokestatic 69	androidx/activity/ImmLeaksCleaner:init	()V
    //   17: getstatic 28	androidx/activity/ImmLeaksCleaner:m	I
    //   20: iconst_1
    //   21: if_icmpne +114 -> 135
    //   24: aload_0
    //   25: getfield 23	androidx/activity/ImmLeaksCleaner:a	Landroid/app/Activity;
    //   28: ldc 71
    //   30: invokevirtual 77	android/app/Activity:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   33: checkcast 30	android/view/inputmethod/InputMethodManager
    //   36: astore_2
    //   37: getstatic 54	androidx/activity/ImmLeaksCleaner:A	Ljava/lang/reflect/Field;
    //   40: astore_1
    //   41: aload_1
    //   42: aload_2
    //   43: invokevirtual 83	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   46: astore_1
    //   47: aload_1
    //   48: ifnonnull +4 -> 52
    //   51: return
    //   52: aload_1
    //   53: monitorenter
    //   54: getstatic 40	androidx/activity/ImmLeaksCleaner:b	Ljava/lang/reflect/Field;
    //   57: astore_3
    //   58: aload_3
    //   59: aload_2
    //   60: invokevirtual 83	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 85	android/view/View
    //   68: astore_3
    //   69: aload_3
    //   70: ifnonnull +6 -> 76
    //   73: aload_1
    //   74: monitorexit
    //   75: return
    //   76: aload_3
    //   77: invokevirtual 89	android/view/View:isAttachedToWindow	()Z
    //   80: ifeq +6 -> 86
    //   83: aload_1
    //   84: monitorexit
    //   85: return
    //   86: getstatic 50	androidx/activity/ImmLeaksCleaner:r	Ljava/lang/reflect/Field;
    //   89: astore_3
    //   90: aload_3
    //   91: aload_2
    //   92: aconst_null
    //   93: invokevirtual 93	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   96: aload_1
    //   97: monitorexit
    //   98: aload_2
    //   99: invokevirtual 96	android/view/inputmethod/InputMethodManager:isActive	()Z
    //   102: pop
    //   103: return
    //   104: aload_1
    //   105: monitorexit
    //   106: return
    //   107: astore_2
    //   108: goto +9 -> 117
    //   111: aload_1
    //   112: monitorexit
    //   113: return
    //   114: aload_1
    //   115: monitorexit
    //   116: return
    //   117: aload_1
    //   118: monitorexit
    //   119: aload_2
    //   120: athrow
    //   121: astore_1
    //   122: return
    //   123: astore_2
    //   124: goto -10 -> 114
    //   127: astore_2
    //   128: goto -17 -> 111
    //   131: astore_2
    //   132: goto -28 -> 104
    //   135: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	ImmLeaksCleaner
    //   0	136	1	paramM	androidx.lifecycle.m
    //   0	136	2	paramLifecycleEvent	androidx.lifecycle.LifecycleEvent
    //   57	34	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   54	58	107	java/lang/Throwable
    //   58	64	107	java/lang/Throwable
    //   64	69	107	java/lang/Throwable
    //   73	75	107	java/lang/Throwable
    //   76	85	107	java/lang/Throwable
    //   90	96	107	java/lang/Throwable
    //   96	98	107	java/lang/Throwable
    //   104	106	107	java/lang/Throwable
    //   111	113	107	java/lang/Throwable
    //   114	116	107	java/lang/Throwable
    //   117	119	107	java/lang/Throwable
    //   41	47	121	java/lang/IllegalAccessException
    //   58	64	123	java/lang/IllegalAccessException
    //   58	64	127	java/lang/ClassCastException
    //   64	69	127	java/lang/ClassCastException
    //   90	96	131	java/lang/IllegalAccessException
  }
}
