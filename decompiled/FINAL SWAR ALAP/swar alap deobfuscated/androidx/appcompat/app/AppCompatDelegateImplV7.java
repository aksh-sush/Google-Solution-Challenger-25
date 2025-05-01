package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Adapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.l.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.a;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.Prefs;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.asm.ActivityCompat;
import androidx.core.asm.NavUtils;
import androidx.core.content.asm.BadgeStyle;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.lifecycle.m;
import handle.Handle;
import handle.R.attr;
import handle.R.layout;
import handle.R.style;
import handle.R.styleable;
import java.lang.reflect.Constructor;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImplV7
  extends f
  implements MenuBuilder.Callback, LayoutInflater.Factory2
{
  private static final androidx.collection.Context l = new androidx.collection.Context();
  private static final boolean p = true;
  private static final int[] q;
  private static final boolean s;
  private static final boolean y = false;
  final Object a;
  private ClassWriter b;
  private InactivityTimer c;
  private OnBackInvokedDispatcher h;
  private int j = -100;
  private int k;
  ActionBar mActionBar;
  private ActionMenuPresenterCallback mActionMenuPresenterCallback;
  ActionMode mActionMode;
  PopupWindow mActionModePopup;
  ActionBarContextView mActionModeView;
  final AppCompatCallback mAppCompatCallback;
  private boolean mClosingActionMenu;
  final android.content.Context mContext;
  private DecorContentParent mDecorContentParent;
  private boolean mEnableDefaultActionBarUp;
  ViewPropertyAnimatorCompat mFadeAnim = null;
  private boolean mFeatureIndeterminateProgress;
  private boolean mFeatureProgress;
  private boolean mHandleNativeActionModes = true;
  boolean mHasActionBar;
  int mInvalidatePanelMenuFeatures;
  boolean mInvalidatePanelMenuPosted;
  private final Runnable mInvalidatePanelMenuRunnable = new MonthByWeekFragment.2(this);
  boolean mIsDestroyed;
  boolean mIsFloating;
  private boolean mLongPressBackDown;
  MenuInflater mMenuInflater;
  private WindowCallbackWrapper mOriginalWindowCallback;
  boolean mOverlayActionBar;
  boolean mOverlayActionMode;
  private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
  private PanelFeatureState[] mPanels;
  private PanelFeatureState mPreparedPanel;
  Runnable mShowActionModePopup;
  private android.view.View mStatusGuard;
  ViewGroup mSubDecor;
  private boolean mSubDecorInstalled;
  private Rect mTempRect1;
  private Rect mTempRect2;
  private CharSequence mTitleText;
  private TextView mTitleView;
  android.view.Window mWindow;
  boolean mWindowNoTitle;
  private OnBackInvokedCallback n;
  private boolean r;
  private InactivityTimer this$0;
  private Configuration type;
  private int v;
  private boolean w;
  private AppCompatViewInflater x;
  private boolean z;
  
  static
  {
    q = new int[] { 16842836 };
    s = "robolectric".equals(Build.FINGERPRINT) ^ true;
  }
  
  AppCompatDelegateImplV7(Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    this(paramActivity, null, paramAppCompatCallback, paramActivity);
  }
  
  AppCompatDelegateImplV7(Dialog paramDialog, AppCompatCallback paramAppCompatCallback)
  {
    this(paramDialog.getContext(), paramDialog.getWindow(), paramAppCompatCallback, paramDialog);
  }
  
  private AppCompatDelegateImplV7(android.content.Context paramContext, android.view.Window paramWindow, AppCompatCallback paramAppCompatCallback, Object paramObject)
  {
    mContext = paramContext;
    mAppCompatCallback = paramAppCompatCallback;
    a = paramObject;
    if ((j == -100) && ((paramObject instanceof Dialog)))
    {
      paramContext = inflate();
      if (paramContext != null) {
        j = paramContext.getDelegate().e();
      }
    }
    if (j == -100)
    {
      paramContext = l;
      paramAppCompatCallback = (Integer)paramContext.get(paramObject.getClass().getName());
      if (paramAppCompatCallback != null)
      {
        j = paramAppCompatCallback.intValue();
        paramContext.remove(paramObject.getClass().getName());
      }
    }
    if (paramWindow != null) {
      a(paramWindow);
    }
    androidx.appcompat.widget.ViewCompat.getMinimumWidth();
  }
  
  private Configuration a(android.content.Context paramContext, int paramInt, androidx.core.menu.Label paramLabel, Configuration paramConfiguration, boolean paramBoolean)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramBoolean) {
          paramInt = 0;
        } else {
          paramInt = getApplicationContextgetResourcesgetConfigurationuiMode & 0x30;
        }
      }
      else {
        paramInt = 32;
      }
    }
    else {
      paramInt = 16;
    }
    paramContext = new Configuration();
    fontScale = 0.0F;
    if (paramConfiguration != null) {
      paramContext.setTo(paramConfiguration);
    }
    uiMode = (paramInt | uiMode & 0xFFFFFFCF);
    if (paramLabel != null) {
      a(paramContext, paramLabel);
    }
    return paramContext;
  }
  
  private void a(int paramInt, androidx.core.menu.Label paramLabel, boolean paramBoolean, Configuration paramConfiguration)
  {
    Resources localResources = mContext.getResources();
    Configuration localConfiguration = new Configuration(localResources.getConfiguration());
    if (paramConfiguration != null) {
      localConfiguration.updateFrom(paramConfiguration);
    }
    uiMode = (paramInt | getConfigurationuiMode & 0xFFFFFFCF);
    if (paramLabel != null) {
      a(localConfiguration, paramLabel);
    }
    localResources.updateConfiguration(localConfiguration, null);
    paramInt = Build.VERSION.SDK_INT;
    if (paramInt < 26) {
      ActionMenuItemView.onCreateView(localResources);
    }
    int i = v;
    if (i != 0)
    {
      mContext.setTheme(i);
      if (paramInt >= 23) {
        mContext.getTheme().applyStyle(v, true);
      }
    }
    if ((paramBoolean) && ((a instanceof Activity))) {
      b(localConfiguration);
    }
  }
  
  private void a(android.view.View paramView)
  {
    int i;
    if ((androidx.core.view.ViewCompat.getWindowSystemUiVisibility(paramView) & 0x2000) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    android.content.Context localContext;
    if (i != 0)
    {
      localContext = mContext;
      i = Handle.RIGHT;
    }
    else
    {
      localContext = mContext;
      i = Handle.d;
    }
    paramView.setBackgroundColor(androidx.core.content.Context.getColor(localContext, i));
  }
  
  private void a(android.view.Window paramWindow)
  {
    if (mWindow == null)
    {
      Object localObject = paramWindow.getCallback();
      if (!(localObject instanceof WindowCallbackWrapper))
      {
        localObject = new WindowCallbackWrapper(this, (Window.Callback)localObject);
        mOriginalWindowCallback = ((WindowCallbackWrapper)localObject);
        paramWindow.setCallback((Window.Callback)localObject);
        localObject = TintTypedArray.obtainStyledAttributes(mContext, null, q);
        android.graphics.drawable.Drawable localDrawable = ((TintTypedArray)localObject).getDrawableIfKnown(0);
        if (localDrawable != null) {
          paramWindow.setBackgroundDrawable(localDrawable);
        }
        ((TintTypedArray)localObject).recycle();
        mWindow = paramWindow;
        if ((Build.VERSION.SDK_INT >= 33) && (h == null)) {
          a(null);
        }
      }
      else
      {
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
      }
    }
    else
    {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
  }
  
  private boolean a(int paramInt, androidx.core.menu.Label paramLabel, boolean paramBoolean)
  {
    Configuration localConfiguration = a(mContext, paramInt, paramLabel, null, false);
    int i1 = b(mContext);
    Object localObject2 = type;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = mContext.getResources().getConfiguration();
    }
    int i = uiMode;
    int i2 = uiMode & 0x30;
    localObject2 = a((Configuration)localObject1);
    if (paramLabel == null) {
      localObject1 = null;
    } else {
      localObject1 = a(localConfiguration);
    }
    boolean bool2 = false;
    if ((i & 0x30) != i2) {
      i = 512;
    } else {
      i = 0;
    }
    int m = i;
    if (localObject1 != null)
    {
      m = i;
      if (!((androidx.core.menu.Label)localObject2).equals(localObject1)) {
        m = i | 0x4 | 0x2000;
      }
    }
    boolean bool1 = true;
    if (((i1 & m) != 0) && (paramBoolean) && (w) && ((s) || (r)))
    {
      localObject2 = a;
      if (((localObject2 instanceof Activity)) && (!((Activity)localObject2).isChild()))
      {
        ActivityCompat.requestPermissions((Activity)a);
        paramBoolean = true;
        break label228;
      }
    }
    paramBoolean = false;
    label228:
    if ((!paramBoolean) && (m != 0))
    {
      paramBoolean = bool2;
      if ((m & i1) == m) {
        paramBoolean = true;
      }
      a(i2, (androidx.core.menu.Label)localObject1, paramBoolean, null);
      paramBoolean = bool1;
    }
    if (paramBoolean)
    {
      localObject2 = a;
      if ((localObject2 instanceof AppCompatActivity))
      {
        if ((m & 0x200) != 0) {
          ((AppCompatActivity)localObject2).onPanelClosed(paramInt);
        }
        if ((m & 0x4) != 0) {
          ((AppCompatActivity)a).visitLineNumber(paramLabel);
        }
      }
    }
    if ((paramBoolean) && (localObject1 != null)) {
      a(a(mContext.getResources().getConfiguration()));
    }
    return paramBoolean;
  }
  
  private boolean a(boolean paramBoolean)
  {
    return a(paramBoolean, true);
  }
  
  private boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mIsDestroyed) {
      return false;
    }
    int i = h();
    int m = a(mContext, i);
    if (Build.VERSION.SDK_INT < 33) {
      localObject1 = a(mContext);
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (!paramBoolean2)
    {
      localObject2 = localObject1;
      if (localObject1 != null) {
        localObject2 = a(mContext.getResources().getConfiguration());
      }
    }
    paramBoolean1 = a(m, (androidx.core.menu.Label)localObject2, paramBoolean1);
    if (i == 0)
    {
      p(mContext).onResume();
    }
    else
    {
      localObject1 = this$0;
      if (localObject1 != null) {
        ((InactivityTimer)localObject1).cancel();
      }
    }
    if (i == 3)
    {
      c(mContext).onResume();
      return paramBoolean1;
    }
    Object localObject1 = c;
    if (localObject1 != null) {
      ((InactivityTimer)localObject1).cancel();
    }
    return paramBoolean1;
  }
  
  private void applyFixedSizeWindow()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)mSubDecor.findViewById(16908290);
    Object localObject = mWindow.getDecorView();
    localContentFrameLayout.setDecorPadding(((android.view.View)localObject).getPaddingLeft(), ((android.view.View)localObject).getPaddingTop(), ((android.view.View)localObject).getPaddingRight(), ((android.view.View)localObject).getPaddingBottom());
    localObject = mContext.obtainStyledAttributes(R.styleable.Theme);
    ((TypedArray)localObject).getValue(R.styleable.Theme_windowFixedWidthMajor, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(R.styleable.Theme_windowFixedWidthMinor, localContentFrameLayout.getMinWidthMinor());
    int i = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedWidthMajor());
    }
    i = R.styleable.AppCompatTheme_windowFixedHeightMinor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedWidthMinor());
    }
    i = R.styleable.Theme_windowMinWidthMajor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedHeightMajor());
    }
    i = R.styleable.Theme_windowMinWidthMinor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedHeightMinor());
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private int b(android.content.Context paramContext)
  {
    if ((!z) && ((a instanceof Activity)))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return 0;
      }
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        i = 269221888;
      } else if (i >= 24) {
        i = 786432;
      } else {
        i = 0;
      }
      Object localObject = a;
      try
      {
        paramContext = localPackageManager.getActivityInfo(new ComponentName(paramContext, localObject.getClass()), i);
        if (paramContext != null) {
          k = configChanges;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", paramContext);
        k = 0;
      }
    }
    z = true;
    return k;
  }
  
  private void b(Configuration paramConfiguration)
  {
    Activity localActivity = (Activity)a;
    if ((localActivity instanceof m) ? ((m)localActivity).getLifecycle().c().a(androidx.lifecycle.Label.d) : (r) && (!mIsDestroyed)) {
      localActivity.onConfigurationChanged(paramConfiguration);
    }
  }
  
  private InactivityTimer c(android.content.Context paramContext)
  {
    if (c == null) {
      c = new Main(this, paramContext);
    }
    return c;
  }
  
  private ViewGroup createSubDecor()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a7 = a6\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  private void ensureSubDecor()
  {
    if (!mSubDecorInstalled)
    {
      mSubDecor = createSubDecor();
      Object localObject1 = getTitle();
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        Object localObject2 = mDecorContentParent;
        if (localObject2 != null)
        {
          ((DecorContentParent)localObject2).setWindowTitle((CharSequence)localObject1);
        }
        else if (peekSupportActionBar() != null)
        {
          peekSupportActionBar().setWindowTitle((CharSequence)localObject1);
        }
        else
        {
          localObject2 = mTitleView;
          if (localObject2 != null) {
            ((TextView)localObject2).setText((CharSequence)localObject1);
          }
        }
      }
      applyFixedSizeWindow();
      onSubDecorInstalled(mSubDecor);
      mSubDecorInstalled = true;
      localObject1 = getPanelState(0, false);
      if ((!mIsDestroyed) && ((localObject1 == null) || (menu == null))) {
        invalidatePanelMenu(108);
      }
    }
  }
  
  private void f()
  {
    InactivityTimer localInactivityTimer = this$0;
    if (localInactivityTimer != null) {
      localInactivityTimer.cancel();
    }
    localInactivityTimer = c;
    if (localInactivityTimer != null) {
      localInactivityTimer.cancel();
    }
  }
  
  private int h()
  {
    int i = j;
    if (i != -100) {
      return i;
    }
    return f.q();
  }
  
  private AppCompatActivity inflate()
  {
    for (android.content.Context localContext = mContext; localContext != null; localContext = ((ContextWrapper)localContext).getBaseContext())
    {
      if ((localContext instanceof AppCompatActivity)) {
        return (AppCompatActivity)localContext;
      }
      if (!(localContext instanceof ContextWrapper)) {
        break;
      }
    }
    return null;
  }
  
  private static Configuration init(Configuration paramConfiguration1, Configuration paramConfiguration2)
  {
    Configuration localConfiguration = new Configuration();
    fontScale = 0.0F;
    if (paramConfiguration2 != null)
    {
      if (paramConfiguration1.diff(paramConfiguration2) == 0) {
        return localConfiguration;
      }
      float f1 = fontScale;
      float f2 = fontScale;
      if (f1 != f2) {
        fontScale = f2;
      }
      int i = mcc;
      int m = mcc;
      if (i != m) {
        mcc = m;
      }
      i = mnc;
      m = mnc;
      if (i != m) {
        mnc = m;
      }
      i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        Handler.init(paramConfiguration1, paramConfiguration2, localConfiguration);
      } else if (!androidx.core.util.View.equals(locale, locale)) {
        locale = locale;
      }
      m = touchscreen;
      int i1 = touchscreen;
      if (m != i1) {
        touchscreen = i1;
      }
      m = keyboard;
      i1 = keyboard;
      if (m != i1) {
        keyboard = i1;
      }
      m = keyboardHidden;
      i1 = keyboardHidden;
      if (m != i1) {
        keyboardHidden = i1;
      }
      m = navigation;
      i1 = navigation;
      if (m != i1) {
        navigation = i1;
      }
      m = navigationHidden;
      i1 = navigationHidden;
      if (m != i1) {
        navigationHidden = i1;
      }
      m = orientation;
      i1 = orientation;
      if (m != i1) {
        orientation = i1;
      }
      m = screenLayout;
      i1 = screenLayout;
      if ((m & 0xF) != (i1 & 0xF)) {
        screenLayout |= i1 & 0xF;
      }
      m = screenLayout;
      i1 = screenLayout;
      if ((m & 0xC0) != (i1 & 0xC0)) {
        screenLayout |= i1 & 0xC0;
      }
      m = screenLayout;
      i1 = screenLayout;
      if ((m & 0x30) != (i1 & 0x30)) {
        screenLayout |= i1 & 0x30;
      }
      m = screenLayout;
      i1 = screenLayout;
      if ((m & 0x300) != (i1 & 0x300)) {
        screenLayout |= i1 & 0x300;
      }
      if (i >= 26) {
        L.d(paramConfiguration1, paramConfiguration2, localConfiguration);
      }
      i = uiMode;
      m = uiMode;
      if ((i & 0xF) != (m & 0xF)) {
        uiMode |= m & 0xF;
      }
      i = uiMode;
      m = uiMode;
      if ((i & 0x30) != (m & 0x30)) {
        uiMode |= m & 0x30;
      }
      i = screenWidthDp;
      m = screenWidthDp;
      if (i != m) {
        screenWidthDp = m;
      }
      i = screenHeightDp;
      m = screenHeightDp;
      if (i != m) {
        screenHeightDp = m;
      }
      i = smallestScreenWidthDp;
      m = smallestScreenWidthDp;
      if (i != m) {
        smallestScreenWidthDp = m;
      }
      h.onCreate(paramConfiguration1, paramConfiguration2, localConfiguration);
    }
    return localConfiguration;
  }
  
  private void initWindowDecorActionBar()
  {
    ensureSubDecor();
    if (mHasActionBar)
    {
      if (mActionBar != null) {
        return;
      }
      Object localObject = a;
      if ((localObject instanceof Activity)) {}
      for (localObject = new WindowDecorActionBar((Activity)a, mOverlayActionBar);; localObject = new WindowDecorActionBar((Dialog)a))
      {
        mActionBar = ((ActionBar)localObject);
        break;
        if (!(localObject instanceof Dialog)) {
          break;
        }
      }
      localObject = mActionBar;
      if (localObject != null) {
        ((ActionBar)localObject).setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
      }
    }
  }
  
  private boolean initializePanelContent(PanelFeatureState paramPanelFeatureState)
  {
    android.view.View localView = createdPanelView;
    if (localView != null)
    {
      shownPanelView = localView;
      return true;
    }
    if (menu == null) {
      return false;
    }
    if (mPanelMenuPresenterCallback == null) {
      mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
    }
    localView = (android.view.View)paramPanelFeatureState.getListMenuView(mPanelMenuPresenterCallback);
    shownPanelView = localView;
    return localView != null;
  }
  
  private boolean initializePanelDecor(PanelFeatureState paramPanelFeatureState)
  {
    paramPanelFeatureState.setStyle(getActionBarThemedContext());
    decorView = new ListMenuDecorView(listPresenterContext);
    gravity = 81;
    return true;
  }
  
  private boolean initializePanelMenu(PanelFeatureState paramPanelFeatureState)
  {
    android.content.Context localContext = mContext;
    int i = featureId;
    if (i != 0)
    {
      localObject1 = localContext;
      if (i != 108) {}
    }
    else
    {
      localObject1 = localContext;
      if (mDecorContentParent != null)
      {
        TypedValue localTypedValue = new TypedValue();
        Resources.Theme localTheme = localContext.getTheme();
        localTheme.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
        if (resourceId != 0)
        {
          localObject2 = localContext.getResources().newTheme();
          localObject1 = localObject2;
          ((Resources.Theme)localObject2).setTo(localTheme);
          ((Resources.Theme)localObject2).applyStyle(resourceId, true);
          ((Resources.Theme)localObject2).resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        }
        else
        {
          localTheme.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
          localObject1 = null;
        }
        Object localObject2 = localObject1;
        if (resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject1 = localContext.getResources().newTheme();
            localObject2 = localObject1;
            ((Resources.Theme)localObject1).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(resourceId, true);
        }
        localObject1 = localContext;
        if (localObject2 != null)
        {
          localObject1 = new androidx.appcompat.view.ContextThemeWrapper(localContext, 0);
          ((android.content.Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
        }
      }
    }
    Object localObject1 = new androidx.appcompat.view.menu.f((android.content.Context)localObject1);
    ((androidx.appcompat.view.menu.f)localObject1).setCallback(this);
    paramPanelFeatureState.setMenu((androidx.appcompat.view.menu.f)localObject1);
    return true;
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    mInvalidatePanelMenuFeatures = (1 << paramInt | mInvalidatePanelMenuFeatures);
    if (!mInvalidatePanelMenuPosted)
    {
      androidx.core.view.ViewCompat.postOnAnimation(mWindow.getDecorView(), mInvalidatePanelMenuRunnable);
      mInvalidatePanelMenuPosted = true;
    }
  }
  
  private void onCreate()
  {
    if (mWindow == null)
    {
      Object localObject = a;
      if ((localObject instanceof Activity)) {
        a(((Activity)localObject).getWindow());
      }
    }
    if (mWindow != null) {
      return;
    }
    throw new IllegalStateException("We have not been given a Window");
  }
  
  private boolean onKeyDownPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
      if (!isOpen) {
        return preparePanel(localPanelFeatureState, paramKeyEvent);
      }
    }
    return false;
  }
  
  private boolean onKeyUpPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    if (mActionMode != null) {
      return false;
    }
    boolean bool2 = true;
    PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
    if (paramInt == 0)
    {
      DecorContentParent localDecorContentParent = mDecorContentParent;
      if ((localDecorContentParent != null) && (localDecorContentParent.canShowOverflowMenu()) && (!ViewConfiguration.get(mContext).hasPermanentMenuKey()))
      {
        if (!mDecorContentParent.isOverflowMenuShowing())
        {
          if ((mIsDestroyed) || (!preparePanel(localPanelFeatureState, paramKeyEvent))) {
            break label186;
          }
          bool1 = mDecorContentParent.showOverflowMenu();
          break label198;
        }
        bool1 = mDecorContentParent.hideOverflowMenu();
        break label198;
      }
    }
    boolean bool1 = isOpen;
    if ((!bool1) && (!isHandled))
    {
      if (isPrepared)
      {
        if (refreshMenuContent)
        {
          isPrepared = false;
          bool1 = preparePanel(localPanelFeatureState, paramKeyEvent);
        }
        else
        {
          bool1 = true;
        }
        if (bool1)
        {
          openPanel(localPanelFeatureState, paramKeyEvent);
          bool1 = bool2;
          break label198;
        }
      }
      label186:
      bool1 = false;
    }
    else
    {
      closePanel(localPanelFeatureState, true);
    }
    label198:
    if (bool1)
    {
      paramKeyEvent = (AudioManager)mContext.getApplicationContext().getSystemService("audio");
      if (paramKeyEvent != null)
      {
        paramKeyEvent.playSoundEffect(0);
        return bool1;
      }
      Log.w("AppCompatDelegate", "Couldn't get audio manager");
    }
    return bool1;
  }
  
  private void openPanel(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (!isOpen)
    {
      if (mIsDestroyed) {
        return;
      }
      if (featureId == 0)
      {
        if ((mContext.getResources().getConfiguration().screenLayout & 0xF) == 4) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          return;
        }
      }
      Object localObject = getWindowCallback();
      if ((localObject != null) && (!((Window.Callback)localObject).onMenuOpened(featureId, menu)))
      {
        closePanel(paramPanelFeatureState, true);
        return;
      }
      WindowManager localWindowManager = (WindowManager)mContext.getSystemService("window");
      if (localWindowManager == null) {
        return;
      }
      if (!preparePanel(paramPanelFeatureState, paramKeyEvent)) {
        return;
      }
      paramKeyEvent = decorView;
      if ((paramKeyEvent != null) && (!refreshDecorView))
      {
        paramKeyEvent = createdPanelView;
        if (paramKeyEvent != null)
        {
          paramKeyEvent = paramKeyEvent.getLayoutParams();
          if ((paramKeyEvent != null) && (width == -1))
          {
            i = -1;
            break label334;
          }
        }
      }
      else
      {
        if (paramKeyEvent == null)
        {
          if (!initializePanelDecor(paramPanelFeatureState)) {
            return;
          }
          if (decorView != null) {}
        }
        else if ((refreshDecorView) && (paramKeyEvent.getChildCount() > 0))
        {
          decorView.removeAllViews();
        }
        if ((!initializePanelContent(paramPanelFeatureState)) || (!paramPanelFeatureState.hasPanelItems())) {
          break label411;
        }
        localObject = shownPanelView.getLayoutParams();
        paramKeyEvent = (KeyEvent)localObject;
        if (localObject == null) {
          paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
        }
        i = background;
        decorView.setBackgroundResource(i);
        localObject = shownPanelView.getParent();
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(shownPanelView);
        }
        decorView.addView(shownPanelView, paramKeyEvent);
        if (!shownPanelView.hasFocus()) {
          shownPanelView.requestFocus();
        }
      }
      int i = -2;
      label334:
      isHandled = false;
      paramKeyEvent = new WindowManager.LayoutParams(i, -2, x, y, 1002, 8519680, -3);
      gravity = gravity;
      windowAnimations = windowAnimations;
      localWindowManager.addView(decorView, paramKeyEvent);
      isOpen = true;
      if (featureId == 0)
      {
        p();
        return;
        label411:
        refreshDecorView = true;
      }
    }
  }
  
  private InactivityTimer p(android.content.Context paramContext)
  {
    if (this$0 == null) {
      this$0 = new Window(this, TwilightManager.getLastKnownLocation(paramContext));
    }
    return this$0;
  }
  
  private boolean performPanelShortcut(PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (!isPrepared)
    {
      bool1 = bool2;
      if (!preparePanel(paramPanelFeatureState, paramKeyEvent)) {}
    }
    else
    {
      androidx.appcompat.view.menu.f localF = menu;
      bool1 = bool2;
      if (localF != null) {
        bool1 = localF.performShortcut(paramInt1, paramKeyEvent, paramInt2);
      }
    }
    if ((bool1) && ((paramInt2 & 0x1) == 0) && (mDecorContentParent == null)) {
      closePanel(paramPanelFeatureState, true);
    }
    return bool1;
  }
  
  private boolean preparePanel(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (mIsDestroyed) {
      return false;
    }
    if (isPrepared) {
      return true;
    }
    Object localObject1 = mPreparedPanel;
    if ((localObject1 != null) && (localObject1 != paramPanelFeatureState)) {
      closePanel((PanelFeatureState)localObject1, false);
    }
    localObject1 = getWindowCallback();
    if (localObject1 != null) {
      createdPanelView = ((Window.Callback)localObject1).onCreatePanelView(featureId);
    }
    int i = featureId;
    if ((i != 0) && (i != 108)) {
      i = 0;
    } else {
      i = 1;
    }
    Object localObject2;
    if (i != 0)
    {
      localObject2 = mDecorContentParent;
      if (localObject2 != null) {
        ((DecorContentParent)localObject2).setMenuPrepared();
      }
    }
    if ((createdPanelView == null) && ((i == 0) || (!(peekSupportActionBar() instanceof ToolbarActionBar))))
    {
      localObject2 = menu;
      if ((localObject2 == null) || (refreshMenuContent))
      {
        if (localObject2 == null)
        {
          if (!initializePanelMenu(paramPanelFeatureState)) {
            break label441;
          }
          if (menu == null) {
            return false;
          }
        }
        if ((i != 0) && (mDecorContentParent != null))
        {
          if (mActionMenuPresenterCallback == null) {
            mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
          }
          mDecorContentParent.setMenu(menu, mActionMenuPresenterCallback);
        }
        menu.stopDispatchingItemsChanged();
        if (!((Window.Callback)localObject1).onCreatePanelMenu(featureId, menu))
        {
          paramPanelFeatureState.setMenu(null);
          if (i != 0)
          {
            paramPanelFeatureState = mDecorContentParent;
            if (paramPanelFeatureState != null)
            {
              paramPanelFeatureState.setMenu(null, mActionMenuPresenterCallback);
              return false;
            }
          }
        }
        else
        {
          refreshMenuContent = false;
        }
      }
      else
      {
        menu.stopDispatchingItemsChanged();
        localObject2 = frozenActionViewState;
        if (localObject2 != null)
        {
          menu.restoreActionViewStates((Bundle)localObject2);
          frozenActionViewState = null;
        }
        if (!((Window.Callback)localObject1).onPreparePanel(0, createdPanelView, menu))
        {
          if (i != 0)
          {
            paramKeyEvent = mDecorContentParent;
            if (paramKeyEvent != null) {
              paramKeyEvent.setMenu(null, mActionMenuPresenterCallback);
            }
          }
          menu.startDispatchingItemsChanged();
          return false;
        }
        if (paramKeyEvent != null) {
          i = paramKeyEvent.getDeviceId();
        } else {
          i = -1;
        }
        boolean bool;
        if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
          bool = true;
        } else {
          bool = false;
        }
        qwertyMode = bool;
        menu.setQwertyMode(bool);
        menu.startDispatchingItemsChanged();
      }
    }
    else
    {
      isPrepared = true;
      isHandled = false;
      mPreparedPanel = paramPanelFeatureState;
      return true;
    }
    label441:
    return false;
  }
  
  private void reopenMenu(boolean paramBoolean)
  {
    Object localObject = mDecorContentParent;
    if ((localObject != null) && (((DecorContentParent)localObject).canShowOverflowMenu()) && ((!ViewConfiguration.get(mContext).hasPermanentMenuKey()) || (mDecorContentParent.isOverflowMenuShowPending())))
    {
      localObject = getWindowCallback();
      if ((mDecorContentParent.isOverflowMenuShowing()) && (paramBoolean))
      {
        mDecorContentParent.hideOverflowMenu();
        if (!mIsDestroyed) {
          ((Window.Callback)localObject).onPanelClosed(108, getPanelState0menu);
        }
      }
      else if ((localObject != null) && (!mIsDestroyed))
      {
        if ((mInvalidatePanelMenuPosted) && ((mInvalidatePanelMenuFeatures & 0x1) != 0))
        {
          mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
          mInvalidatePanelMenuRunnable.run();
        }
        PanelFeatureState localPanelFeatureState = getPanelState(0, true);
        androidx.appcompat.view.menu.f localF = menu;
        if ((localF != null) && (!refreshMenuContent) && (((Window.Callback)localObject).onPreparePanel(0, createdPanelView, localF)))
        {
          ((Window.Callback)localObject).onMenuOpened(108, menu);
          mDecorContentParent.showOverflowMenu();
        }
      }
    }
    else
    {
      localObject = getPanelState(0, true);
      refreshDecorView = true;
      closePanel((PanelFeatureState)localObject, false);
      openPanel((PanelFeatureState)localObject, null);
    }
  }
  
  private int sanitizeWindowFeatureId(int paramInt)
  {
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    }
    if (paramInt == 9)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      return 109;
    }
    return paramInt;
  }
  
  private boolean shouldInheritContext(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    android.view.View localView = mWindow.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof android.view.View))) {
        break;
      }
      if (androidx.core.view.ViewCompat.append((android.view.View)paramViewParent)) {
        return false;
      }
      paramViewParent = paramViewParent.getParent();
    }
    return false;
  }
  
  private void throwFeatureRequestIfSubDecorInstalled()
  {
    if (!mSubDecorInstalled) {
      return;
    }
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  int a(android.content.Context paramContext, int paramInt)
  {
    if (paramInt != -100)
    {
      if (paramInt != -1)
      {
        if (paramInt != 0)
        {
          if ((paramInt == 1) || (paramInt == 2)) {
            return paramInt;
          }
          if (paramInt != 3) {}
        }
        for (paramContext = c(paramContext);; paramContext = p(paramContext))
        {
          return paramContext.start();
          throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          if ((Build.VERSION.SDK_INT >= 23) && (((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() == 0)) {
            return -1;
          }
        }
      }
      else
      {
        return paramInt;
      }
    }
    else {
      return -1;
    }
    return paramInt;
  }
  
  androidx.core.menu.Label a(android.content.Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 33) {
      return null;
    }
    androidx.core.menu.Label localLabel2 = f.c();
    if (localLabel2 == null) {
      return null;
    }
    androidx.core.menu.Label localLabel1 = a(paramContext.getApplicationContext().getResources().getConfiguration());
    if (i >= 24) {
      paramContext = ClassReader.b(localLabel2, localLabel1);
    } else if (localLabel2.a()) {
      paramContext = androidx.core.menu.Label.c();
    } else {
      paramContext = androidx.core.menu.Label.a(localLabel2.a(0).toString());
    }
    if (paramContext.a()) {
      return localLabel1;
    }
    return paramContext;
  }
  
  androidx.core.menu.Label a(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Handler.a(paramConfiguration);
    }
    return androidx.core.menu.Label.a(Format.getTitle(locale));
  }
  
  public void a()
  {
    if ((a instanceof Activity)) {
      f.close(this);
    }
    if (mInvalidatePanelMenuPosted) {
      mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
    }
    mIsDestroyed = true;
    if (j != -100)
    {
      localObject = a;
      if (((localObject instanceof Activity)) && (((Activity)localObject).isChangingConfigurations()))
      {
        l.put(a.getClass().getName(), Integer.valueOf(j));
        break label116;
      }
    }
    l.remove(a.getClass().getName());
    label116:
    Object localObject = mActionBar;
    if (localObject != null) {
      ((ActionBar)localObject).onDestroy();
    }
    f();
  }
  
  void a(Configuration paramConfiguration, androidx.core.menu.Label paramLabel)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      Handler.a(paramConfiguration, paramLabel);
      return;
    }
    h.setLocale(paramConfiguration, paramLabel.a(0));
    h.a(paramConfiguration, paramLabel.a(0));
  }
  
  public void a(Bundle paramBundle) {}
  
  public void a(OnBackInvokedDispatcher paramOnBackInvokedDispatcher)
  {
    super.a(paramOnBackInvokedDispatcher);
    OnBackInvokedDispatcher localOnBackInvokedDispatcher = h;
    Object localObject;
    if (localOnBackInvokedDispatcher != null)
    {
      localObject = n;
      if (localObject != null)
      {
        i.a(localOnBackInvokedDispatcher, localObject);
        n = null;
      }
    }
    localOnBackInvokedDispatcher = paramOnBackInvokedDispatcher;
    if (paramOnBackInvokedDispatcher == null)
    {
      localObject = a;
      localOnBackInvokedDispatcher = paramOnBackInvokedDispatcher;
      if ((localObject instanceof Activity))
      {
        localOnBackInvokedDispatcher = paramOnBackInvokedDispatcher;
        if (((Activity)localObject).getWindow() != null) {
          localOnBackInvokedDispatcher = i.run((Activity)a);
        }
      }
    }
    h = localOnBackInvokedDispatcher;
    p();
  }
  
  void a(androidx.core.menu.Label paramLabel)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      Handler.a(paramLabel);
      return;
    }
    Locale.setDefault(paramLabel.a(0));
  }
  
  final int access$300(androidx.core.view.Window paramWindow, Rect paramRect)
  {
    int i4 = 0;
    int i;
    if (paramWindow != null) {
      i = paramWindow.getWidth();
    } else if (paramRect != null) {
      i = top;
    } else {
      i = 0;
    }
    Object localObject = mActionModeView;
    int i3;
    int i2;
    if ((localObject != null) && ((((android.view.View)localObject).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject = (ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
      boolean bool = mActionModeView.isShown();
      int i1 = 1;
      i3 = 1;
      int m;
      if (bool)
      {
        if (mTempRect1 == null)
        {
          mTempRect1 = new Rect();
          mTempRect2 = new Rect();
        }
        Rect localRect1 = mTempRect1;
        Rect localRect2 = mTempRect2;
        if (paramWindow == null) {
          localRect1.set(paramRect);
        } else {
          localRect1.set(paramWindow.getHeight(), paramWindow.getWidth(), paramWindow.set(), paramWindow.get());
        }
        ViewUtils.computeFitSystemWindows(mSubDecor, localRect1, localRect2);
        int i5 = top;
        m = left;
        int i6 = right;
        paramWindow = androidx.core.view.ViewCompat.build(mSubDecor);
        if (paramWindow == null) {
          i1 = 0;
        } else {
          i1 = paramWindow.getHeight();
        }
        if (paramWindow == null) {
          i2 = 0;
        } else {
          i2 = paramWindow.set();
        }
        if ((topMargin == i5) && (leftMargin == m) && (rightMargin == i6))
        {
          m = 0;
        }
        else
        {
          topMargin = i5;
          leftMargin = m;
          rightMargin = i6;
          m = 1;
        }
        if ((i5 > 0) && (mStatusGuard == null))
        {
          paramWindow = new android.view.View(mContext);
          mStatusGuard = paramWindow;
          paramWindow.setVisibility(8);
          paramWindow = new FrameLayout.LayoutParams(-1, topMargin, 51);
          leftMargin = i1;
          rightMargin = i2;
          mSubDecor.addView(mStatusGuard, -1, paramWindow);
        }
        else
        {
          paramWindow = mStatusGuard;
          if (paramWindow != null)
          {
            paramWindow = (ViewGroup.MarginLayoutParams)paramWindow.getLayoutParams();
            i5 = height;
            i6 = topMargin;
            if ((i5 != i6) || (leftMargin != i1) || (rightMargin != i2))
            {
              height = i6;
              leftMargin = i1;
              rightMargin = i2;
              mStatusGuard.setLayoutParams(paramWindow);
            }
          }
        }
        paramWindow = mStatusGuard;
        if (paramWindow != null) {
          i2 = i3;
        } else {
          i2 = 0;
        }
        if ((i2 != 0) && (paramWindow.getVisibility() != 0)) {
          a(mStatusGuard);
        }
        i1 = i;
        if (!mOverlayActionMode)
        {
          i1 = i;
          if (i2 != 0) {
            i1 = 0;
          }
        }
        i = i1;
        i1 = m;
        m = i2;
      }
      else if (topMargin != 0)
      {
        topMargin = 0;
        m = 0;
      }
      else
      {
        m = 0;
        i1 = 0;
      }
      i2 = i;
      i3 = m;
      if (i1 != 0)
      {
        mActionModeView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        i2 = i;
        i3 = m;
      }
    }
    else
    {
      i3 = 0;
      i2 = i;
    }
    paramWindow = mStatusGuard;
    if (paramWindow != null)
    {
      if (i3 != 0) {
        i = i4;
      } else {
        i = 8;
      }
      paramWindow.setVisibility(i);
    }
    return i2;
  }
  
  public void addContentView(android.view.View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ((ViewGroup)mSubDecor.findViewById(16908290)).addView(paramView, paramLayoutParams);
    mOriginalWindowCallback.onContentChanged(mWindow.getCallback());
  }
  
  public void b(int paramInt)
  {
    v = paramInt;
  }
  
  void callOnPanelClosed(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localObject1 = mPanels;
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < localObject1.length) {
            localPanelFeatureState = localObject1[paramInt];
          }
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = menu;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!isOpen)) {
      return;
    }
    if (!mIsDestroyed) {
      mOriginalWindowCallback.onPanelClosed(mWindow.getCallback(), paramInt, (Menu)localObject2);
    }
  }
  
  void checkCloseActionMenu(androidx.appcompat.view.menu.f paramF)
  {
    if (mClosingActionMenu) {
      return;
    }
    mClosingActionMenu = true;
    mDecorContentParent.dismissPopups();
    Window.Callback localCallback = getWindowCallback();
    if ((localCallback != null) && (!mIsDestroyed)) {
      localCallback.onPanelClosed(108, paramF);
    }
    mClosingActionMenu = false;
  }
  
  void closePanel(int paramInt)
  {
    closePanel(getPanelState(paramInt, true), true);
  }
  
  void closePanel(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (featureId == 0))
    {
      localObject = mDecorContentParent;
      if ((localObject != null) && (((DecorContentParent)localObject).isOverflowMenuShowing()))
      {
        checkCloseActionMenu(menu);
        return;
      }
    }
    Object localObject = (WindowManager)mContext.getSystemService("window");
    if ((localObject != null) && (isOpen))
    {
      ViewGroup localViewGroup = decorView;
      if (localViewGroup != null)
      {
        ((ViewManager)localObject).removeView(localViewGroup);
        if (paramBoolean) {
          callOnPanelClosed(featureId, paramPanelFeatureState, null);
        }
      }
    }
    isPrepared = false;
    isHandled = false;
    isOpen = false;
    shownPanelView = null;
    refreshDecorView = true;
    if (mPreparedPanel == paramPanelFeatureState) {
      mPreparedPanel = null;
    }
    if (featureId == 0) {
      p();
    }
  }
  
  final boolean d()
  {
    if (mSubDecorInstalled)
    {
      ViewGroup localViewGroup = mSubDecor;
      if ((localViewGroup != null) && (androidx.core.view.ViewCompat.b(localViewGroup))) {
        return true;
      }
    }
    return false;
  }
  
  void dismissPopups()
  {
    Object localObject = mDecorContentParent;
    if (localObject != null) {
      ((DecorContentParent)localObject).dismissPopups();
    }
    if (mActionModePopup != null)
    {
      mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
      if (mActionModePopup.isShowing()) {
        localObject = mActionModePopup;
      }
    }
    try
    {
      ((PopupWindow)localObject).dismiss();
      mActionModePopup = null;
      endOnGoingFadeAnimation();
      localObject = getPanelState(0, false);
      if (localObject != null)
      {
        localObject = menu;
        if (localObject != null)
        {
          ((androidx.appcompat.view.menu.f)localObject).close();
          return;
        }
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public boolean dispatchKeyEvent()
  {
    return a(true);
  }
  
  boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    Object localObject = a;
    boolean bool = localObject instanceof androidx.core.view.Drawable;
    int i = 1;
    if ((bool) || ((localObject instanceof AppCompatDialog)))
    {
      localObject = mWindow.getDecorView();
      if ((localObject != null) && (androidx.core.view.i.a((android.view.View)localObject, paramKeyEvent))) {
        return true;
      }
    }
    if ((paramKeyEvent.getKeyCode() == 82) && (mOriginalWindowCallback.dispatchKeyEvent(mWindow.getCallback(), paramKeyEvent))) {
      return true;
    }
    int m = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0) {
      i = 0;
    }
    if (i != 0) {
      return onKeyDown(m, paramKeyEvent);
    }
    return onKeyUp(m, paramKeyEvent);
  }
  
  void doInvalidatePanelMenu(int paramInt)
  {
    PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
    if (menu != null)
    {
      Bundle localBundle = new Bundle();
      menu.saveActionViewStates(localBundle);
      if (localBundle.size() > 0) {
        frozenActionViewState = localBundle;
      }
      menu.stopDispatchingItemsChanged();
      menu.clear();
    }
    refreshMenuContent = true;
    refreshDecorView = true;
    if (((paramInt == 108) || (paramInt == 0)) && (mDecorContentParent != null))
    {
      localPanelFeatureState = getPanelState(0, false);
      if (localPanelFeatureState != null)
      {
        isPrepared = false;
        preparePanel(localPanelFeatureState, null);
      }
    }
  }
  
  public int e()
  {
    return j;
  }
  
  void endOnGoingFadeAnimation()
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = mFadeAnim;
    if (localViewPropertyAnimatorCompat != null) {
      localViewPropertyAnimatorCompat.cancel();
    }
  }
  
  PanelFeatureState findMenuPanel(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = mPanels;
    int m = 0;
    int i;
    if (arrayOfPanelFeatureState != null) {
      i = arrayOfPanelFeatureState.length;
    } else {
      i = 0;
    }
    while (m < i)
    {
      PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[m];
      if ((localPanelFeatureState != null) && (menu == paramMenu)) {
        return localPanelFeatureState;
      }
      m += 1;
    }
    return null;
  }
  
  public android.view.View findViewById(int paramInt)
  {
    ensureSubDecor();
    return mWindow.findViewById(paramInt);
  }
  
  final android.content.Context getActionBarThemedContext()
  {
    Object localObject1 = getSupportActionBar();
    if (localObject1 != null) {
      localObject1 = ((ActionBar)localObject1).getThemedContext();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = mContext;
    }
    return localObject2;
  }
  
  public android.content.Context getContext()
  {
    return mContext;
  }
  
  public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    return new AppCompatDelegateImplBase.ActionBarDrawableToggleImpl(this);
  }
  
  public MenuInflater getMenuInflater()
  {
    if (mMenuInflater == null)
    {
      initWindowDecorActionBar();
      Object localObject = mActionBar;
      if (localObject != null) {
        localObject = ((ActionBar)localObject).getThemedContext();
      } else {
        localObject = mContext;
      }
      mMenuInflater = new SupportMenuInflater((android.content.Context)localObject);
    }
    return mMenuInflater;
  }
  
  protected PanelFeatureState getPanelState(int paramInt, boolean paramBoolean)
  {
    Object localObject2 = mPanels;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new PanelFeatureState[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      mPanels = ((PanelFeatureState[])localObject1);
    }
    Object localObject3 = localObject1[paramInt];
    localObject2 = localObject3;
    if (localObject3 == null)
    {
      localObject2 = new PanelFeatureState(paramInt);
      localObject1[paramInt] = localObject2;
    }
    return localObject2;
  }
  
  public ActionBar getSupportActionBar()
  {
    initWindowDecorActionBar();
    return mActionBar;
  }
  
  final CharSequence getTitle()
  {
    Object localObject = a;
    if ((localObject instanceof Activity)) {
      return ((Activity)localObject).getTitle();
    }
    return mTitleText;
  }
  
  final Window.Callback getWindowCallback()
  {
    return mWindow.getCallback();
  }
  
  public android.view.View init(android.view.View paramView, String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject = x;
    boolean bool1 = false;
    if (localObject == null)
    {
      localObject = mContext.obtainStyledAttributes(R.styleable.Theme).getString(R.styleable.ColorPickerView_alphaChannelText);
      if (localObject == null) {
        localObject = new AppCompatViewInflater();
      }
      for (;;)
      {
        x = ((AppCompatViewInflater)localObject);
        break;
        try
        {
          x = ((AppCompatViewInflater)mContext.getClassLoader().loadClass((String)localObject).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        catch (Throwable localThrowable)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to instantiate custom view inflater ");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(". Falling back to default.");
          Log.i("AppCompatDelegate", localStringBuilder.toString(), localThrowable);
          localObject = new AppCompatViewInflater();
        }
      }
    }
    boolean bool2 = y;
    if (bool2)
    {
      if (b == null) {
        b = new ClassWriter();
      }
      if (b.put(paramAttributeSet)) {
        bool1 = true;
      } else if ((paramAttributeSet instanceof XmlPullParser))
      {
        if (((XmlPullParser)paramAttributeSet).getDepth() > 1) {
          bool1 = true;
        }
      }
      else {
        bool1 = shouldInheritContext((ViewParent)paramView);
      }
    }
    else
    {
      bool1 = false;
    }
    return x.createView(paramView, paramString, paramContext, paramAttributeSet, bool1, bool2, true, Prefs.getValue());
  }
  
  public void installViewFactory()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(mContext);
    if (localLayoutInflater.getFactory() == null)
    {
      LayoutInflaterCompat.setFactory(localLayoutInflater, this);
      return;
    }
    if (!(localLayoutInflater.getFactory2() instanceof AppCompatDelegateImplV7)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    }
  }
  
  public void invalidateOptionsMenu()
  {
    if (peekSupportActionBar() != null)
    {
      if (getSupportActionBar().invalidateOptionsMenu()) {
        return;
      }
      invalidatePanelMenu(0);
    }
  }
  
  public boolean isHandleNativeActionModesEnabled()
  {
    return mHandleNativeActionModes;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((mHasActionBar) && (mSubDecorInstalled))
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.onConfigurationChanged(paramConfiguration);
      }
    }
    androidx.appcompat.widget.ViewCompat.get().getDrawable(mContext);
    type = new Configuration(mContext.getResources().getConfiguration());
    a(false, false);
  }
  
  public android.content.Context onCreate(android.content.Context paramContext)
  {
    i = 1;
    w = true;
    m = a(paramContext, h());
    if (f.add(paramContext)) {
      f.run(paramContext);
    }
    Object localObject2 = a(paramContext);
    if ((p) && ((paramContext instanceof android.view.ContextThemeWrapper)))
    {
      localObject1 = a(paramContext, m, (androidx.core.menu.Label)localObject2, null, false);
      localObject3 = (android.view.ContextThemeWrapper)paramContext;
    }
    try
    {
      ThemeManager.applyTheme((android.view.ContextThemeWrapper)localObject3, (Configuration)localObject1);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException1)
    {
      for (;;) {}
    }
    if ((paramContext instanceof androidx.appcompat.view.ContextThemeWrapper))
    {
      localObject1 = a(paramContext, m, (androidx.core.menu.Label)localObject2, null, false);
      localObject3 = (androidx.appcompat.view.ContextThemeWrapper)paramContext;
    }
    try
    {
      ((androidx.appcompat.view.ContextThemeWrapper)localObject3).initialize((Configuration)localObject1);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException2)
    {
      for (;;) {}
    }
    if (!s) {
      return super.onCreate(paramContext);
    }
    Object localObject1 = new Configuration();
    uiMode = -1;
    fontScale = 0.0F;
    localObject1 = h.f(paramContext, (Configuration)localObject1).getResources().getConfiguration();
    Object localObject3 = paramContext.getResources().getConfiguration();
    uiMode = uiMode;
    if (!((Configuration)localObject1).equals((Configuration)localObject3)) {
      localObject1 = init((Configuration)localObject1, (Configuration)localObject3);
    } else {
      localObject1 = null;
    }
    localObject2 = a(paramContext, m, (androidx.core.menu.Label)localObject2, (Configuration)localObject1, true);
    localObject1 = new androidx.appcompat.view.ContextThemeWrapper(paramContext, R.style.NORMAL);
    ((androidx.appcompat.view.ContextThemeWrapper)localObject1).initialize((Configuration)localObject2);
    m = 0;
    try
    {
      paramContext = paramContext.getTheme();
      if (paramContext == null) {
        i = 0;
      }
    }
    catch (NullPointerException paramContext)
    {
      for (;;)
      {
        i = m;
      }
    }
    if (i != 0) {
      BadgeStyle.getColor(((androidx.appcompat.view.ContextThemeWrapper)localObject1).getTheme());
    }
    return super.onCreate((android.content.Context)localObject1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    w = true;
    a(false);
    onCreate();
    paramBundle = a;
    if ((paramBundle instanceof Activity)) {
      paramBundle = (Activity)paramBundle;
    }
    try
    {
      paramBundle = NavUtils.getParentActivityName(paramBundle);
    }
    catch (IllegalArgumentException paramBundle)
    {
      for (;;) {}
    }
    paramBundle = null;
    if (paramBundle != null)
    {
      paramBundle = peekSupportActionBar();
      if (paramBundle == null) {
        mEnableDefaultActionBarUp = true;
      } else {
        paramBundle.setDefaultDisplayHomeAsUpEnabled(true);
      }
    }
    f.add(this);
    type = new Configuration(mContext.getResources().getConfiguration());
    r = true;
  }
  
  public final android.view.View onCreateView(android.view.View paramView, String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return init(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public android.view.View onCreateView(String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt != 4)
    {
      if (paramInt != 82) {
        return false;
      }
      onKeyDownPanel(0, paramKeyEvent);
      return true;
    }
    if ((paramKeyEvent.getFlags() & 0x80) == 0) {
      bool = false;
    }
    mLongPressBackDown = bool;
    return false;
  }
  
  boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = getSupportActionBar();
    if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent))) {
      return true;
    }
    localObject = mPreparedPanel;
    if ((localObject != null) && (performPanelShortcut((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)))
    {
      paramKeyEvent = mPreparedPanel;
      if (paramKeyEvent != null)
      {
        isHandled = true;
        return true;
      }
    }
    else
    {
      if (mPreparedPanel == null)
      {
        localObject = getPanelState(0, true);
        preparePanel((PanelFeatureState)localObject, paramKeyEvent);
        boolean bool = performPanelShortcut((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
        isPrepared = false;
        if (!bool) {
          break label117;
        }
        return true;
      }
      return false;
    }
    return true;
    label117:
    return false;
  }
  
  boolean onKeyUp()
  {
    boolean bool = mLongPressBackDown;
    mLongPressBackDown = false;
    Object localObject = getPanelState(0, false);
    if ((localObject != null) && (isOpen))
    {
      if (!bool)
      {
        closePanel((PanelFeatureState)localObject, true);
        return true;
      }
    }
    else
    {
      localObject = mActionMode;
      if (localObject != null)
      {
        ((ActionMode)localObject).finish();
        return true;
      }
      localObject = getSupportActionBar();
      if (localObject != null)
      {
        if (!((ActionBar)localObject).collapseActionView()) {
          break label77;
        }
        return true;
      }
      return false;
    }
    return true;
    label77:
    return false;
  }
  
  boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt != 4)
    {
      if (paramInt != 82) {
        return false;
      }
      onKeyUpPanel(0, paramKeyEvent);
      return true;
    }
    return onKeyUp();
  }
  
  boolean onKeyUpPanel()
  {
    if (h == null) {
      return false;
    }
    PanelFeatureState localPanelFeatureState = getPanelState(0, false);
    if ((localPanelFeatureState != null) && (isOpen)) {
      return true;
    }
    return mActionMode != null;
  }
  
  public boolean onMenuItemSelected(androidx.appcompat.view.menu.f paramF, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = getWindowCallback();
    if ((localCallback != null) && (!mIsDestroyed))
    {
      paramF = findMenuPanel(paramF.getRootMenu());
      if (paramF != null) {
        return localCallback.onMenuItemSelected(featureId, paramMenuItem);
      }
    }
    return false;
  }
  
  public void onMenuModeChange(androidx.appcompat.view.menu.f paramF)
  {
    reopenMenu(true);
  }
  
  void onMenuOpened(int paramInt)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.dispatchMenuVisibilityChanged(true);
      }
    }
  }
  
  void onPanelClosed(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = getSupportActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).dispatchMenuVisibilityChanged(false);
      }
    }
    else if (paramInt == 0)
    {
      localObject = getPanelState(paramInt, true);
      if (isOpen) {
        closePanel((PanelFeatureState)localObject, false);
      }
    }
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    ensureSubDecor();
  }
  
  public void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(true);
    }
  }
  
  public void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(false);
    }
  }
  
  void onSubDecorInstalled(ViewGroup paramViewGroup) {}
  
  public final void onTitleChanged(CharSequence paramCharSequence)
  {
    mTitleText = paramCharSequence;
    Object localObject = mDecorContentParent;
    if (localObject != null)
    {
      ((DecorContentParent)localObject).setWindowTitle(paramCharSequence);
      return;
    }
    if (peekSupportActionBar() != null)
    {
      peekSupportActionBar().setWindowTitle(paramCharSequence);
      return;
    }
    localObject = mTitleView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
  }
  
  void p()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      boolean bool = onKeyUpPanel();
      if ((bool) && (n == null))
      {
        n = i.a(h, this);
        return;
      }
      if (!bool)
      {
        OnBackInvokedCallback localOnBackInvokedCallback = n;
        if (localOnBackInvokedCallback != null) {
          i.a(h, localOnBackInvokedCallback);
        }
      }
    }
  }
  
  final ActionBar peekSupportActionBar()
  {
    return mActionBar;
  }
  
  public boolean requestWindowFeature(int paramInt)
  {
    paramInt = sanitizeWindowFeatureId(paramInt);
    if ((mWindowNoTitle) && (paramInt == 108)) {
      return false;
    }
    if ((mHasActionBar) && (paramInt == 1)) {
      mHasActionBar = false;
    }
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 5)
        {
          if (paramInt != 10)
          {
            if (paramInt != 108)
            {
              if (paramInt != 109) {
                return mWindow.requestFeature(paramInt);
              }
              throwFeatureRequestIfSubDecorInstalled();
              mOverlayActionBar = true;
              return true;
            }
            throwFeatureRequestIfSubDecorInstalled();
            mHasActionBar = true;
            return true;
          }
          throwFeatureRequestIfSubDecorInstalled();
          mOverlayActionMode = true;
          return true;
        }
        throwFeatureRequestIfSubDecorInstalled();
        mFeatureProgress = true;
        return true;
      }
      throwFeatureRequestIfSubDecorInstalled();
      mFeatureIndeterminateProgress = true;
      return true;
    }
    throwFeatureRequestIfSubDecorInstalled();
    mWindowNoTitle = true;
    return true;
  }
  
  public void setContentView()
  {
    a(true, false);
  }
  
  public void setContentView(int paramInt)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(mContext).inflate(paramInt, localViewGroup);
    mOriginalWindowCallback.onContentChanged(mWindow.getCallback());
  }
  
  public void setContentView(android.view.View paramView)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    mOriginalWindowCallback.onContentChanged(mWindow.getCallback());
  }
  
  public void setContentView(android.view.View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    mOriginalWindowCallback.onContentChanged(mWindow.getCallback());
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    if (!(a instanceof Activity)) {
      return;
    }
    Object localObject = getSupportActionBar();
    if (!(localObject instanceof WindowDecorActionBar))
    {
      mMenuInflater = null;
      if (localObject != null) {
        ((ActionBar)localObject).onDestroy();
      }
      mActionBar = null;
      if (paramToolbar != null)
      {
        localObject = new ToolbarActionBar(paramToolbar, getTitle(), mOriginalWindowCallback);
        mActionBar = ((ActionBar)localObject);
        mOriginalWindowCallback.onPanelClosed(mWindow);
        paramToolbar.setBackInvokedCallbackEnabled(true);
      }
      else
      {
        mOriginalWindowCallback.onPanelClosed(null);
      }
      invalidateOptionsMenu();
      return;
    }
    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public ActionMode startSupportActionMode(ActionMode.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      Object localObject = mActionMode;
      if (localObject != null) {
        ((ActionMode)localObject).finish();
      }
      paramCallback = new ActionModeCallbackWrapperV7(paramCallback);
      localObject = getSupportActionBar();
      if (localObject != null)
      {
        localObject = ((ActionBar)localObject).startActionMode(paramCallback);
        mActionMode = ((ActionMode)localObject);
        if (localObject != null)
        {
          AppCompatCallback localAppCompatCallback = mAppCompatCallback;
          if (localAppCompatCallback != null) {
            localAppCompatCallback.onSupportActionModeStarted((ActionMode)localObject);
          }
        }
      }
      if (mActionMode == null) {
        mActionMode = startSupportActionModeFromWindow(paramCallback);
      }
      p();
      return mActionMode;
    }
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a15 = a14\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  final class ActionMenuPresenterCallback
    implements l.a
  {
    ActionMenuPresenterCallback() {}
    
    public void onCloseMenu(androidx.appcompat.view.menu.f paramF, boolean paramBoolean)
    {
      checkCloseActionMenu(paramF);
    }
    
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.f paramF)
    {
      Window.Callback localCallback = getWindowCallback();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramF);
      }
      return true;
    }
  }
  
  class ActionModeCallbackWrapperV7
    implements ActionMode.Callback
  {
    private ActionMode.Callback mWrapped;
    
    public ActionModeCallbackWrapperV7(ActionMode.Callback paramCallback)
    {
      mWrapped = paramCallback;
    }
    
    public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
    {
      return mWrapped.onActionItemClicked(paramActionMode, paramMenuItem);
    }
    
    public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      return mWrapped.onCreateActionMode(paramActionMode, paramMenu);
    }
    
    public void onDestroyActionMode(ActionMode paramActionMode)
    {
      mWrapped.onDestroyActionMode(paramActionMode);
      paramActionMode = AppCompatDelegateImplV7.this;
      if (mActionModePopup != null) {
        mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
      }
      paramActionMode = AppCompatDelegateImplV7.this;
      if (mActionModeView != null)
      {
        paramActionMode.endOnGoingFadeAnimation();
        paramActionMode = AppCompatDelegateImplV7.this;
        mFadeAnim = androidx.core.view.ViewCompat.animate(mActionModeView).alpha(0.0F);
        mFadeAnim.setListener(new h.i.a(this));
      }
      paramActionMode = AppCompatDelegateImplV7.this;
      AppCompatCallback localAppCompatCallback = mAppCompatCallback;
      if (localAppCompatCallback != null) {
        localAppCompatCallback.onSupportActionModeFinished(mActionMode);
      }
      paramActionMode = AppCompatDelegateImplV7.this;
      mActionMode = null;
      androidx.core.view.ViewCompat.requestApplyInsets(mSubDecor);
      p();
    }
    
    public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      androidx.core.view.ViewCompat.requestApplyInsets(mSubDecor);
      return mWrapped.onPrepareActionMode(paramActionMode, paramMenu);
    }
  }
  
  class ListMenuDecorView
    extends ContentFrameLayout
  {
    public ListMenuDecorView(android.content.Context paramContext)
    {
      super();
    }
    
    private boolean isOutOfBounds(int paramInt1, int paramInt2)
    {
      return (paramInt1 < -5) || (paramInt2 < -5) || (paramInt1 > getWidth() + 5) || (paramInt2 > getHeight() + 5);
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (AppCompatDelegateImplV7.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if ((paramMotionEvent.getAction() == 0) && (isOutOfBounds((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
      {
        closePanel(0);
        return true;
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(Menu.View.getDrawable(getContext(), paramInt));
    }
  }
  
  public final class PanelFeatureState
  {
    int background;
    android.view.View createdPanelView;
    ViewGroup decorView;
    int featureId;
    Bundle frozenActionViewState;
    int gravity;
    boolean isHandled;
    boolean isOpen;
    boolean isPrepared;
    e listMenuPresenter;
    android.content.Context listPresenterContext;
    androidx.appcompat.view.menu.f menu;
    public boolean qwertyMode;
    boolean refreshDecorView;
    boolean refreshMenuContent;
    android.view.View shownPanelView;
    int windowAnimations;
    int x;
    int y;
    
    PanelFeatureState()
    {
      featureId = this$1;
      refreshDecorView = false;
    }
    
    MenuView getListMenuView(l.a paramA)
    {
      if (menu == null) {
        return null;
      }
      if (listMenuPresenter == null)
      {
        e localE = new e(listPresenterContext, R.layout.abc_list_menu_item_layout);
        listMenuPresenter = localE;
        localE.a(paramA);
        menu.a(listMenuPresenter);
      }
      return listMenuPresenter.getMenuView(decorView);
    }
    
    public boolean hasPanelItems()
    {
      if (shownPanelView == null) {
        return false;
      }
      if (createdPanelView != null) {
        return true;
      }
      return listMenuPresenter.a().getCount() > 0;
    }
    
    void setMenu(androidx.appcompat.view.menu.f paramF)
    {
      Object localObject = menu;
      if (paramF == localObject) {
        return;
      }
      if (localObject != null) {
        ((androidx.appcompat.view.menu.f)localObject).b(listMenuPresenter);
      }
      menu = paramF;
      if (paramF != null)
      {
        localObject = listMenuPresenter;
        if (localObject != null) {
          paramF.a((l)localObject);
        }
      }
    }
    
    void setStyle(android.content.Context paramContext)
    {
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme = paramContext.getResources().newTheme();
      localTheme.setTo(paramContext.getTheme());
      localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
      int i = resourceId;
      if (i != 0) {
        localTheme.applyStyle(i, true);
      }
      localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
      i = resourceId;
      if (i == 0) {
        i = R.style.Theme_AppCompat_CompactMenu;
      }
      localTheme.applyStyle(i, true);
      paramContext = new androidx.appcompat.view.ContextThemeWrapper(paramContext, 0);
      paramContext.getTheme().setTo(localTheme);
      listPresenterContext = paramContext;
      paramContext = paramContext.obtainStyledAttributes(R.styleable.Theme);
      background = paramContext.getResourceId(R.styleable.Theme_panelBackground, 0);
      windowAnimations = paramContext.getResourceId(R.styleable.Theme_android_windowAnimationStyle, 0);
      paramContext.recycle();
    }
  }
  
  final class PanelMenuPresenterCallback
    implements l.a
  {
    PanelMenuPresenterCallback() {}
    
    public void onCloseMenu(androidx.appcompat.view.menu.f paramF, boolean paramBoolean)
    {
      androidx.appcompat.view.menu.f localF = paramF.getRootMenu();
      int i;
      if (localF != paramF) {
        i = 1;
      } else {
        i = 0;
      }
      AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
      if (i != 0) {
        paramF = localF;
      }
      paramF = localAppCompatDelegateImplV7.findMenuPanel(paramF);
      if (paramF != null)
      {
        if (i != 0)
        {
          callOnPanelClosed(featureId, paramF, localF);
          closePanel(paramF, true);
          return;
        }
        closePanel(paramF, paramBoolean);
      }
    }
    
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.f paramF)
    {
      if (paramF == paramF.getRootMenu())
      {
        Object localObject = AppCompatDelegateImplV7.this;
        if (mHasActionBar)
        {
          localObject = ((AppCompatDelegateImplV7)localObject).getWindowCallback();
          if ((localObject != null) && (!mIsDestroyed)) {
            ((Window.Callback)localObject).onMenuOpened(108, paramF);
          }
        }
      }
      return true;
    }
  }
}
