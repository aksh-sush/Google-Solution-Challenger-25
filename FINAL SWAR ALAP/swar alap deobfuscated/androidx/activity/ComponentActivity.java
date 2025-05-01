package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ChatMessage;
import androidx.core.asm.AbstractGalleryActivity;
import androidx.core.asm.ActivityCompat;
import androidx.core.asm.ClassVisitor;
import androidx.core.asm.FieldWriter;
import androidx.core.asm.StandardShowcaseDrawer;
import androidx.core.util.Log;
import androidx.core.view.AnnotationVisitor;
import androidx.lifecycle.BaseFragment;
import androidx.lifecycle.Frame;
import androidx.lifecycle.HttpManager;
import androidx.lifecycle.LifecycleEvent;
import androidx.lifecycle.RecyclerView;
import androidx.lifecycle.Timber.Tree;
import androidx.lifecycle.i0.a;
import androidx.lifecycle.i0.b;
import androidx.lifecycle.m;
import contacts.PositionMetric;
import filter.x;
import introspect.ByteVector;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import showcaseview.Request;
import showcaseview.h;

public abstract class ComponentActivity
  extends AbstractGalleryActivity
  implements RecyclerView, Timber.Tree, search.c, Point, ChatMessage, GeoPoint
{
  private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
  private final ActivityResultRegistry mActivityResultRegistry;
  private int mContentLayoutId;
  final filter.b mContextAwareHelper = new filter.b();
  private i0.b mDefaultFactory;
  private boolean mDispatchingOnMultiWindowModeChanged;
  private boolean mDispatchingOnPictureInPictureModeChanged;
  final StateMachineInvocationHandler mFullyDrawnReporter;
  private final androidx.lifecycle.f mLifecycleRegistry = new androidx.lifecycle.f(this);
  private final androidx.core.view.f mMenuHostHelper = new androidx.core.view.f(new MonthByWeekFragment.2(this));
  private final AtomicInteger mNextLocalRequestCode;
  private OnBackPressedDispatcher mOnBackPressedDispatcher;
  private final CopyOnWriteArrayList<androidx.core.util.a> mOnConfigurationChangedListeners;
  private final CopyOnWriteArrayList<androidx.core.util.a> mOnMultiWindowModeChangedListeners;
  private final CopyOnWriteArrayList<androidx.core.util.a> mOnNewIntentListeners;
  private final CopyOnWriteArrayList<androidx.core.util.a> mOnPictureInPictureModeChangedListeners;
  private final CopyOnWriteArrayList<androidx.core.util.a> mOnTrimMemoryListeners;
  final f mReportFullyDrawnExecutor;
  final search.f mSavedStateRegistryController;
  private androidx.lifecycle.g mViewModelStore;
  
  public ComponentActivity()
  {
    search.f localF = search.f.a(this);
    mSavedStateRegistryController = localF;
    mOnBackPressedDispatcher = null;
    f localF1 = log1p();
    mReportFullyDrawnExecutor = localF1;
    mFullyDrawnReporter = new StateMachineInvocationHandler(localF1, new ZoomButtonsController.1(this));
    mNextLocalRequestCode = new AtomicInteger();
    mActivityResultRegistry = new a();
    mOnConfigurationChangedListeners = new CopyOnWriteArrayList();
    mOnTrimMemoryListeners = new CopyOnWriteArrayList();
    mOnNewIntentListeners = new CopyOnWriteArrayList();
    mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
    mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
    mDispatchingOnMultiWindowModeChanged = false;
    mDispatchingOnPictureInPictureModeChanged = false;
    if (getLifecycle() != null)
    {
      int i = Build.VERSION.SDK_INT;
      getLifecycle().a(new androidx.lifecycle.c()
      {
        public void a(m paramAnonymousM, LifecycleEvent paramAnonymousLifecycleEvent)
        {
          if (paramAnonymousLifecycleEvent == LifecycleEvent.ON_STOP)
          {
            paramAnonymousM = getWindow();
            if (paramAnonymousM != null) {
              paramAnonymousM = paramAnonymousM.peekDecorView();
            } else {
              paramAnonymousM = null;
            }
            if (paramAnonymousM != null) {
              ComponentActivity.c.a(paramAnonymousM);
            }
          }
        }
      });
      getLifecycle().a(new androidx.lifecycle.c()
      {
        public void a(m paramAnonymousM, LifecycleEvent paramAnonymousLifecycleEvent)
        {
          if (paramAnonymousLifecycleEvent == LifecycleEvent.ON_DESTROY)
          {
            mContextAwareHelper.a();
            if (!isChangingConfigurations()) {
              getViewModelStore().a();
            }
            mReportFullyDrawnExecutor.show();
          }
        }
      });
      getLifecycle().a(new androidx.lifecycle.c()
      {
        public void a(m paramAnonymousM, LifecycleEvent paramAnonymousLifecycleEvent)
        {
          ensureViewModelStore();
          getLifecycle().c(this);
        }
      });
      localF.b();
      Frame.b(this);
      if (i <= 23) {
        getLifecycle().a(new ImmLeaksCleaner(this));
      }
      getSavedStateRegistry().a("android:support:activity-result", new Preferences(this));
      addOnContextAvailableListener(new g(this));
      return;
    }
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  private f log1p()
  {
    return new g();
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.a(getWindow().getDecorView());
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public void addMenuProvider(AnnotationVisitor paramAnnotationVisitor)
  {
    mMenuHostHelper.l(paramAnnotationVisitor);
  }
  
  public void addMenuProvider(AnnotationVisitor paramAnnotationVisitor, m paramM)
  {
    mMenuHostHelper.a(paramAnnotationVisitor, paramM);
  }
  
  public void addMenuProvider(AnnotationVisitor paramAnnotationVisitor, m paramM, androidx.lifecycle.Label paramLabel)
  {
    mMenuHostHelper.a(paramAnnotationVisitor, paramM, paramLabel);
  }
  
  public final void addOnConfigurationChangedListener(Log paramLog)
  {
    mOnConfigurationChangedListeners.add(paramLog);
  }
  
  public final void addOnContextAvailableListener(x paramX)
  {
    mContextAwareHelper.a(paramX);
  }
  
  public final void addOnMultiWindowModeChangedListener(Log paramLog)
  {
    mOnMultiWindowModeChangedListeners.add(paramLog);
  }
  
  public final void addOnNewIntentListener(Log paramLog)
  {
    mOnNewIntentListeners.add(paramLog);
  }
  
  public final void addOnPictureInPictureModeChangedListener(Log paramLog)
  {
    mOnPictureInPictureModeChangedListeners.add(paramLog);
  }
  
  public final void addOnTrimMemoryListener(Log paramLog)
  {
    mOnTrimMemoryListeners.add(paramLog);
  }
  
  void ensureViewModelStore()
  {
    if (mViewModelStore == null)
    {
      e localE = (e)getLastNonConfigurationInstance();
      if (localE != null) {
        mViewModelStore = loginTask;
      }
      if (mViewModelStore == null) {
        mViewModelStore = new androidx.lifecycle.g();
      }
    }
  }
  
  public final ActivityResultRegistry getActivityResultRegistry()
  {
    return mActivityResultRegistry;
  }
  
  public contacts.a getDefaultViewModelCreationExtras()
  {
    PositionMetric localPositionMetric = new PositionMetric();
    if (getApplication() != null) {
      localPositionMetric.set(i0.a.a, getApplication());
    }
    localPositionMetric.set(Frame.d, this);
    localPositionMetric.set(Frame.c, this);
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {
      localPositionMetric.set(Frame.b, getIntent().getExtras());
    }
    return localPositionMetric;
  }
  
  public i0.b getDefaultViewModelProviderFactory()
  {
    if (mDefaultFactory == null)
    {
      Application localApplication = getApplication();
      Bundle localBundle;
      if (getIntent() != null) {
        localBundle = getIntent().getExtras();
      } else {
        localBundle = null;
      }
      mDefaultFactory = new androidx.lifecycle.b(localApplication, this, localBundle);
    }
    return mDefaultFactory;
  }
  
  public StateMachineInvocationHandler getFullyDrawnReporter()
  {
    return mFullyDrawnReporter;
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    e localE = (e)getLastNonConfigurationInstance();
    if (localE != null) {
      return custom;
    }
    return null;
  }
  
  public androidx.lifecycle.ClassWriter getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  public final OnBackPressedDispatcher getOnBackPressedDispatcher()
  {
    if (mOnBackPressedDispatcher == null)
    {
      mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b());
      getLifecycle().a(new androidx.lifecycle.c()
      {
        public void a(m paramAnonymousM, LifecycleEvent paramAnonymousLifecycleEvent)
        {
          if ((paramAnonymousLifecycleEvent == LifecycleEvent.ON_CREATE) && (Build.VERSION.SDK_INT >= 33)) {
            mOnBackPressedDispatcher.a(ComponentActivity.d.visitParameterAnnotation((ComponentActivity)paramAnonymousM));
          }
        }
      });
    }
    return mOnBackPressedDispatcher;
  }
  
  public final androidx.savedstate.ClassWriter getSavedStateRegistry()
  {
    return mSavedStateRegistryController.a();
  }
  
  public androidx.lifecycle.g getViewModelStore()
  {
    if (getApplication() != null)
    {
      ensureViewModelStore();
      return mViewModelStore;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public void initializeViewTreeOwners()
  {
    HttpManager.init(getWindow().getDecorView(), this);
    androidx.lifecycle.Fragment.init(getWindow().getDecorView(), this);
    search.Fragment.init(getWindow().getDecorView(), this);
    CrashReporter.init(getWindow().getDecorView(), this);
    s.onClick(getWindow().getDecorView(), this);
  }
  
  public void invalidateMenu()
  {
    invalidateOptionsMenu();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!mActivityResultRegistry.add(paramInt1, paramInt2, paramIntent)) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    getOnBackPressedDispatcher().get();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Iterator localIterator = mOnConfigurationChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Log)localIterator.next()).accept(paramConfiguration);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    mSavedStateRegistryController.a(paramBundle);
    mContextAwareHelper.a(this);
    super.onCreate(paramBundle);
    BaseFragment.onCreate(this);
    int i = mContentLayoutId;
    if (i != 0) {
      setContentView(i);
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onCreatePanelMenu(paramInt, paramMenu);
      mMenuHostHelper.a(paramMenu, getMenuInflater());
    }
    return true;
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt == 0) {
      return mMenuHostHelper.a(paramMenuItem);
    }
    return false;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    mDispatchingOnMultiWindowModeChanged = true;
    try
    {
      super.onMultiWindowModeChanged(paramBoolean, paramConfiguration);
      mDispatchingOnMultiWindowModeChanged = false;
      Iterator localIterator = mOnMultiWindowModeChangedListeners.iterator();
      while (localIterator.hasNext()) {
        ((Log)localIterator.next()).accept(new StandardShowcaseDrawer(paramBoolean, paramConfiguration));
      }
      return;
    }
    catch (Throwable paramConfiguration)
    {
      mDispatchingOnMultiWindowModeChanged = false;
      throw paramConfiguration;
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    Iterator localIterator = mOnNewIntentListeners.iterator();
    while (localIterator.hasNext()) {
      ((Log)localIterator.next()).accept(paramIntent);
    }
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    mMenuHostHelper.b(paramMenu);
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    mDispatchingOnPictureInPictureModeChanged = true;
    try
    {
      super.onPictureInPictureModeChanged(paramBoolean, paramConfiguration);
      mDispatchingOnPictureInPictureModeChanged = false;
      Iterator localIterator = mOnPictureInPictureModeChangedListeners.iterator();
      while (localIterator.hasNext()) {
        ((Log)localIterator.next()).accept(new FieldWriter(paramBoolean, paramConfiguration));
      }
      return;
    }
    catch (Throwable paramConfiguration)
    {
      mDispatchingOnPictureInPictureModeChanged = false;
      throw paramConfiguration;
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onPreparePanel(paramInt, paramView, paramMenu);
      mMenuHostHelper.a(paramMenu);
    }
    return true;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((!mActivityResultRegistry.add(paramInt, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfInt))) && (Build.VERSION.SDK_INT >= 23)) {
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject3 = onRetainCustomNonConfigurationInstance();
    Object localObject2 = mViewModelStore;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      e localE = (e)getLastNonConfigurationInstance();
      localObject1 = localObject2;
      if (localE != null) {
        localObject1 = loginTask;
      }
    }
    if ((localObject1 == null) && (localObject3 == null)) {
      return null;
    }
    localObject2 = new e();
    custom = localObject3;
    loginTask = ((androidx.lifecycle.g)localObject1);
    return localObject2;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    androidx.lifecycle.ClassWriter localClassWriter = getLifecycle();
    if ((localClassWriter instanceof androidx.lifecycle.f)) {
      ((androidx.lifecycle.f)localClassWriter).a(androidx.lifecycle.Label.d);
    }
    super.onSaveInstanceState(paramBundle);
    mSavedStateRegistryController.d(paramBundle);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    Iterator localIterator = mOnTrimMemoryListeners.iterator();
    while (localIterator.hasNext()) {
      ((Log)localIterator.next()).accept(Integer.valueOf(paramInt));
    }
  }
  
  public Context peekAvailableContext()
  {
    return mContextAwareHelper.b();
  }
  
  public final androidx.activity.result.f registerForActivityResult(h paramH, ActivityResultRegistry paramActivityResultRegistry, androidx.activity.result.ClassWriter paramClassWriter)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("activity_rq#");
    localStringBuilder.append(mNextLocalRequestCode.getAndIncrement());
    return paramActivityResultRegistry.a(localStringBuilder.toString(), this, paramH, paramClassWriter);
  }
  
  public final androidx.activity.result.f registerForActivityResult(h paramH, androidx.activity.result.ClassWriter paramClassWriter)
  {
    return registerForActivityResult(paramH, mActivityResultRegistry, paramClassWriter);
  }
  
  public void removeMenuProvider(AnnotationVisitor paramAnnotationVisitor)
  {
    mMenuHostHelper.a(paramAnnotationVisitor);
  }
  
  public final void removeOnConfigurationChangedListener(Log paramLog)
  {
    mOnConfigurationChangedListeners.remove(paramLog);
  }
  
  public final void removeOnContextAvailableListener(x paramX)
  {
    mContextAwareHelper.b(paramX);
  }
  
  public final void removeOnMultiWindowModeChangedListener(Log paramLog)
  {
    mOnMultiWindowModeChangedListeners.remove(paramLog);
  }
  
  public final void removeOnNewIntentListener(Log paramLog)
  {
    mOnNewIntentListeners.remove(paramLog);
  }
  
  public final void removeOnPictureInPictureModeChangedListener(Log paramLog)
  {
    mOnPictureInPictureModeChangedListeners.remove(paramLog);
  }
  
  public final void removeOnTrimMemoryListener(Log paramLog)
  {
    mOnTrimMemoryListeners.remove(paramLog);
  }
  
  public void reportFullyDrawn()
  {
    try
    {
      boolean bool = ByteVector.add();
      if (bool) {
        ByteVector.add("reportFullyDrawn() for ComponentActivity");
      }
      super.reportFullyDrawn();
      mFullyDrawnReporter.invoke();
      ByteVector.run();
      return;
    }
    catch (Throwable localThrowable)
    {
      ByteVector.run();
      throw localThrowable;
    }
  }
  
  public void setContentView(int paramInt)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.a(getWindow().getDecorView());
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.a(getWindow().getDecorView());
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.a(getWindow().getDecorView());
    super.setContentView(paramView, paramLayoutParams);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  class a
    extends ActivityResultRegistry
  {
    a() {}
    
    public void a(final int paramInt, final h paramH, Object paramObject, ClassVisitor paramClassVisitor)
    {
      paramClassVisitor = ComponentActivity.this;
      final Request localRequest = paramH.invoke(paramClassVisitor, paramObject);
      if (localRequest != null)
      {
        new Handler(Looper.getMainLooper()).post(new a(paramInt, localRequest));
        return;
      }
      paramObject = paramH.a(paramClassVisitor, paramObject);
      if ((paramObject.getExtras() != null) && (paramObject.getExtras().getClassLoader() == null)) {
        paramObject.setExtrasClassLoader(paramClassVisitor.getClassLoader());
      }
      if (paramObject.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
      {
        paramH = paramObject.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramObject.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      }
      else
      {
        paramH = null;
      }
      if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(paramObject.getAction()))
      {
        paramObject = paramObject.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        paramH = paramObject;
        if (paramObject == null) {
          paramH = new String[0];
        }
        ActivityCompat.execute(paramClassVisitor, paramH, paramInt);
        return;
      }
      if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(paramObject.getAction()))
      {
        paramObject = (androidx.activity.result.Label)paramObject.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try
        {
          ActivityCompat.a(paramClassVisitor, paramObject.getName(), paramInt, paramObject.a(), paramObject.c(), paramObject.b(), 0, paramH);
          return;
        }
        catch (IntentSender.SendIntentException paramH)
        {
          new Handler(Looper.getMainLooper()).post(new b(paramInt, paramH));
          return;
        }
      }
      ActivityCompat.startActivityForResult(paramClassVisitor, paramObject, paramInt, paramH);
    }
    
    class a
      implements Runnable
    {
      a(int paramInt, Request paramRequest) {}
      
      public void run()
      {
        a(paramInt, localRequest.getListener());
      }
    }
    
    class b
      implements Runnable
    {
      b(int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
      
      public void run()
      {
        add(paramInt, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", paramH));
      }
    }
  }
  
  class b
    implements Runnable
  {
    b() {}
    
    public void run()
    {
      ComponentActivity localComponentActivity = ComponentActivity.this;
      try
      {
        localComponentActivity.onBackPressed();
        return;
      }
      catch (NullPointerException localNullPointerException)
      {
        if (TextUtils.equals(localNullPointerException.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
          return;
        }
        throw localNullPointerException;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if (TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
          return;
        }
        throw localIllegalStateException;
      }
    }
  }
  
  static abstract class c
  {
    static void a(View paramView)
    {
      paramView.cancelPendingInputEvents();
    }
  }
  
  static abstract class d
  {
    static OnBackInvokedDispatcher visitParameterAnnotation(Activity paramActivity)
    {
      return paramActivity.getOnBackInvokedDispatcher();
    }
  }
  
  static final class e
  {
    Object custom;
    androidx.lifecycle.g loginTask;
    
    e() {}
  }
  
  private static abstract interface f
    extends Executor
  {
    public abstract void a(View paramView);
    
    public abstract void show();
  }
  
  class g
    implements ComponentActivity.f, ViewTreeObserver.OnDrawListener, Runnable
  {
    boolean b = false;
    final long l = SystemClock.uptimeMillis() + 10000L;
    Runnable r;
    
    g() {}
    
    public void a(View paramView)
    {
      if (!b)
      {
        b = true;
        paramView.getViewTreeObserver().addOnDrawListener(this);
      }
    }
    
    public void execute(Runnable paramRunnable)
    {
      r = paramRunnable;
      paramRunnable = getWindow().getDecorView();
      if (b)
      {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
          paramRunnable.invalidate();
          return;
        }
        paramRunnable.postInvalidate();
        return;
      }
      paramRunnable.postOnAnimation(new FileUtils.23(this));
    }
    
    public void onDraw()
    {
      Runnable localRunnable = r;
      if (localRunnable != null)
      {
        localRunnable.run();
        r = null;
        if (!mFullyDrawnReporter.getValue()) {
          return;
        }
      }
      else if (SystemClock.uptimeMillis() <= l)
      {
        return;
      }
      b = false;
      getWindow().getDecorView().post(this);
    }
    
    public void run()
    {
      getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
    
    public void show()
    {
      getWindow().getDecorView().removeCallbacks(this);
      getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
  }
}
