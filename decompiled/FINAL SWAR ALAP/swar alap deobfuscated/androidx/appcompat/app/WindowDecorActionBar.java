package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.DownloadService;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

import java.util.ArrayList;

public class WindowDecorActionBar
  extends ActionBar
  implements ActionBarOverlayLayout.d
{
  private static final Interpolator sHideInterpolator = new AccelerateInterpolator();
  private static final Interpolator sShowInterpolator = new DecelerateInterpolator();
  i0.d mActionMode;
  private Activity mActivity;
  ActionBarContainer mContainerView;
  boolean mContentAnimations = true;
  View mContentView;
  Context mContext;
  ActionBarContextView mContextView;
  private int mCurWindowVisibility = 0;
  ViewPropertyAnimatorCompatSet mCurrentShowAnim;
  DecorToolbar mDecorToolbar;
  ActionMode mDeferredDestroyActionMode;
  ActionMode.Callback mDeferredModeDestroyCallback;
  private boolean mDisplayHomeAsUpSet;
  private boolean mHasEmbeddedTabs;
  boolean mHiddenByApp;
  boolean mHiddenBySystem;
  final ViewPropertyAnimatorListener mHideListener = new i0.a(this);
  boolean mHideOnContentScroll;
  private boolean mLastMenuVisibility;
  private ArrayList mMenuVisibilityListeners = new ArrayList();
  private boolean mNowShowing = true;
  ActionBarOverlayLayout mOverlayLayout;
  private int mSavedTabPosition = -1;
  private boolean mShowHideAnimationEnabled;
  final ViewPropertyAnimatorListener mShowListener = new i0.b(this);
  private boolean mShowingForMode;
  private ArrayList mTabs = new ArrayList();
  private Context mThemedContext;
  final DownloadService mUpdateListener = new i0.c(this);
  
  public WindowDecorActionBar(Activity paramActivity, boolean paramBoolean)
  {
    mActivity = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    init(paramActivity);
    if (!paramBoolean) {
      mContentView = paramActivity.findViewById(16908290);
    }
  }
  
  public WindowDecorActionBar(Dialog paramDialog)
  {
    init(paramDialog.getWindow().getDecorView());
  }
  
  static boolean checkShowingFlags(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {
      return true;
    }
    return (!paramBoolean1) && (!paramBoolean2);
  }
  
  private DecorToolbar getDecorToolbar(View paramView)
  {
    if ((paramView instanceof DecorToolbar)) {
      return (DecorToolbar)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Can't make a decor toolbar out of ");
    if (paramView != null) {
      paramView = paramView.getClass().getSimpleName();
    } else {
      paramView = "null";
    }
    localStringBuilder.append(paramView);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void hideForActionMode()
  {
    if (mShowingForMode)
    {
      mShowingForMode = false;
      ActionBarOverlayLayout localActionBarOverlayLayout = mOverlayLayout;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(false);
      }
      updateVisibility(false);
    }
  }
  
  private void init(View paramView)
  {
    Object localObject = (ActionBarOverlayLayout)paramView.findViewById(R.id.decor_content_parent);
    mOverlayLayout = ((ActionBarOverlayLayout)localObject);
    if (localObject != null) {
      ((ActionBarOverlayLayout)localObject).setActionBarVisibilityCallback(this);
    }
    mDecorToolbar = getDecorToolbar(paramView.findViewById(R.id.action_bar));
    mContextView = ((ActionBarContextView)paramView.findViewById(R.id.action_context_bar));
    paramView = (ActionBarContainer)paramView.findViewById(R.id.action_bar_container);
    mContainerView = paramView;
    localObject = mDecorToolbar;
    if ((localObject != null) && (mContextView != null) && (paramView != null))
    {
      mContext = ((DecorToolbar)localObject).getContext();
      if ((mDecorToolbar.getDisplayOptions() & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        mDisplayHomeAsUpSet = true;
      }
      paramView = ActionBarPolicy.get(mContext);
      boolean bool;
      if ((!paramView.enableHomeButtonByDefault()) && (i == 0)) {
        bool = false;
      } else {
        bool = true;
      }
      setHomeButtonEnabled(bool);
      setHasEmbeddedTabs(paramView.hasEmbeddedTabs());
      paramView = mContext.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
      if (paramView.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
        setHideOnContentScrollEnabled(true);
      }
      int i = paramView.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
      if (i != 0) {
        setElevation(i);
      }
      paramView.recycle();
      return;
    }
    paramView = new StringBuilder();
    paramView.append(getClass().getSimpleName());
    paramView.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(paramView.toString());
  }
  
  private void setHasEmbeddedTabs(boolean paramBoolean)
  {
    mHasEmbeddedTabs = paramBoolean;
    if (!paramBoolean)
    {
      mDecorToolbar.setEmbeddedTabView(null);
      mContainerView.setTabContainer(null);
    }
    else
    {
      mContainerView.setTabContainer(null);
      mDecorToolbar.setEmbeddedTabView(null);
    }
    int i = getNavigationMode();
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject = mDecorToolbar;
    if ((!mHasEmbeddedTabs) && (i != 0)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    ((DecorToolbar)localObject).setCollapsible(paramBoolean);
    localObject = mOverlayLayout;
    if ((!mHasEmbeddedTabs) && (i != 0)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
  }
  
  private boolean show()
  {
    return ViewCompat.b(mContainerView);
  }
  
  private void showForActionMode()
  {
    if (!mShowingForMode)
    {
      mShowingForMode = true;
      ActionBarOverlayLayout localActionBarOverlayLayout = mOverlayLayout;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(true);
      }
      updateVisibility(false);
    }
  }
  
  private void updateVisibility(boolean paramBoolean)
  {
    if (checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
    {
      if (!mNowShowing)
      {
        mNowShowing = true;
        doShow(paramBoolean);
      }
    }
    else if (mNowShowing)
    {
      mNowShowing = false;
      doHide(paramBoolean);
    }
  }
  
  public void animateToMode(boolean paramBoolean)
  {
    if (paramBoolean) {
      showForActionMode();
    } else {
      hideForActionMode();
    }
    if (show())
    {
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1;
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2;
      if (paramBoolean)
      {
        localViewPropertyAnimatorCompat1 = mDecorToolbar.setupAnimatorToVisibility(4, 100L);
        localViewPropertyAnimatorCompat2 = mContextView.setupAnimatorToVisibility(0, 200L);
      }
      else
      {
        localViewPropertyAnimatorCompat2 = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
        localViewPropertyAnimatorCompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
      }
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
      localViewPropertyAnimatorCompatSet.playSequentially(localViewPropertyAnimatorCompat1, localViewPropertyAnimatorCompat2);
      localViewPropertyAnimatorCompatSet.start();
      return;
    }
    if (paramBoolean)
    {
      mDecorToolbar.setVisibility(4);
      mContextView.setVisibility(0);
      return;
    }
    mDecorToolbar.setVisibility(0);
    mContextView.setVisibility(8);
  }
  
  public boolean collapseActionView()
  {
    DecorToolbar localDecorToolbar = mDecorToolbar;
    if ((localDecorToolbar != null) && (localDecorToolbar.hasExpandedActionView()))
    {
      mDecorToolbar.collapseActionView();
      return true;
    }
    return false;
  }
  
  void completeDeferredDestroyActionMode()
  {
    ActionMode.Callback localCallback = mDeferredModeDestroyCallback;
    if (localCallback != null)
    {
      localCallback.onDestroyActionMode(mDeferredDestroyActionMode);
      mDeferredDestroyActionMode = null;
      mDeferredModeDestroyCallback = null;
    }
  }
  
  public void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    if (paramBoolean == mLastMenuVisibility) {
      return;
    }
    mLastMenuVisibility = paramBoolean;
    if (mMenuVisibilityListeners.size() <= 0) {
      return;
    }
    Log.get(mMenuVisibilityListeners.get(0));
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public void doHide(boolean paramBoolean)
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
    if (localViewPropertyAnimatorCompatSet != null) {
      localViewPropertyAnimatorCompatSet.cancel();
    }
    if ((mCurWindowVisibility == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
    {
      mContainerView.setAlpha(1.0F);
      mContainerView.setTransitioning(true);
      localViewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
      float f2 = -mContainerView.getHeight();
      float f1 = f2;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp82_80 = localObject;
        tmp82_80[0] = 0;
        Object tmp86_82 = tmp82_80;
        tmp86_82[1] = 0;
        tmp86_82;
        mContainerView.getLocationInWindow((int[])localObject);
        f1 = f2 - localObject[1];
      }
      Object localObject = ViewCompat.animate(mContainerView).translationY(f1);
      ((ViewPropertyAnimatorCompat)localObject).setUpdateListener(mUpdateListener);
      localViewPropertyAnimatorCompatSet.play((ViewPropertyAnimatorCompat)localObject);
      if (mContentAnimations)
      {
        localObject = mContentView;
        if (localObject != null) {
          localViewPropertyAnimatorCompatSet.play(ViewCompat.animate((View)localObject).translationY(f1));
        }
      }
      localViewPropertyAnimatorCompatSet.setInterpolator(sHideInterpolator);
      localViewPropertyAnimatorCompatSet.setDuration(250L);
      localViewPropertyAnimatorCompatSet.setListener(mHideListener);
      mCurrentShowAnim = localViewPropertyAnimatorCompatSet;
      localViewPropertyAnimatorCompatSet.start();
      return;
    }
    mHideListener.onAnimationEnd(null);
  }
  
  public void doShow(boolean paramBoolean)
  {
    Object localObject1 = mCurrentShowAnim;
    if (localObject1 != null) {
      ((ViewPropertyAnimatorCompatSet)localObject1).cancel();
    }
    mContainerView.setVisibility(0);
    if ((mCurWindowVisibility == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
    {
      mContainerView.setTranslationY(0.0F);
      float f2 = -mContainerView.getHeight();
      float f1 = f2;
      if (paramBoolean)
      {
        localObject1 = new int[2];
        Object tmp73_71 = localObject1;
        tmp73_71[0] = 0;
        Object tmp77_73 = tmp73_71;
        tmp77_73[1] = 0;
        tmp77_73;
        mContainerView.getLocationInWindow((int[])localObject1);
        f1 = f2 - localObject1[1];
      }
      mContainerView.setTranslationY(f1);
      localObject1 = new ViewPropertyAnimatorCompatSet();
      Object localObject2 = ViewCompat.animate(mContainerView).translationY(0.0F);
      ((ViewPropertyAnimatorCompat)localObject2).setUpdateListener(mUpdateListener);
      ((ViewPropertyAnimatorCompatSet)localObject1).play((ViewPropertyAnimatorCompat)localObject2);
      if (mContentAnimations)
      {
        localObject2 = mContentView;
        if (localObject2 != null)
        {
          ((View)localObject2).setTranslationY(f1);
          ((ViewPropertyAnimatorCompatSet)localObject1).play(ViewCompat.animate(mContentView).translationY(0.0F));
        }
      }
      ((ViewPropertyAnimatorCompatSet)localObject1).setInterpolator(sShowInterpolator);
      ((ViewPropertyAnimatorCompatSet)localObject1).setDuration(250L);
      ((ViewPropertyAnimatorCompatSet)localObject1).setListener(mShowListener);
      mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet)localObject1);
      ((ViewPropertyAnimatorCompatSet)localObject1).start();
    }
    else
    {
      mContainerView.setAlpha(1.0F);
      mContainerView.setTranslationY(0.0F);
      if (mContentAnimations)
      {
        localObject1 = mContentView;
        if (localObject1 != null) {
          ((View)localObject1).setTranslationY(0.0F);
        }
      }
      mShowListener.onAnimationEnd(null);
    }
    localObject1 = mOverlayLayout;
    if (localObject1 != null) {
      ViewCompat.requestApplyInsets((View)localObject1);
    }
  }
  
  public void enableContentAnimations(boolean paramBoolean)
  {
    mContentAnimations = paramBoolean;
  }
  
  public int getDisplayOptions()
  {
    return mDecorToolbar.getDisplayOptions();
  }
  
  public int getNavigationMode()
  {
    return mDecorToolbar.getNavigationMode();
  }
  
  public Context getThemedContext()
  {
    if (mThemedContext == null)
    {
      TypedValue localTypedValue = new TypedValue();
      mContext.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      int i = resourceId;
      if (i != 0) {
        mThemedContext = new ContextThemeWrapper(mContext, i);
      } else {
        mThemedContext = mContext;
      }
    }
    return mThemedContext;
  }
  
  public void hideForSystem()
  {
    if (!mHiddenBySystem)
    {
      mHiddenBySystem = true;
      updateVisibility(true);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
  }
  
  public void onContentScrollStarted()
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
    if (localViewPropertyAnimatorCompatSet != null)
    {
      localViewPropertyAnimatorCompatSet.cancel();
      mCurrentShowAnim = null;
    }
  }
  
  public void onContentScrollStopped() {}
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = mActionMode;
    if (localObject == null) {
      return false;
    }
    localObject = ((i0.d)localObject).getMenu();
    if (localObject != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      ((Menu)localObject).setQwertyMode(bool);
      return ((Menu)localObject).performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    mCurWindowVisibility = paramInt;
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (!mDisplayHomeAsUpSet) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 4;
    } else {
      i = 0;
    }
    setDisplayOptions(i, 4);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = mDecorToolbar.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      mDisplayHomeAsUpSet = true;
    }
    mDecorToolbar.setDisplayOptions(paramInt1 & paramInt2 | paramInt2 & i);
  }
  
  public void setElevation(float paramFloat)
  {
    ViewCompat.setElevation(mContainerView, paramFloat);
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if ((paramBoolean) && (!mOverlayLayout.isInOverlayMode())) {
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    mHideOnContentScroll = paramBoolean;
    mOverlayLayout.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    mDecorToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    mDecorToolbar.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean)
  {
    mDecorToolbar.setHomeButtonEnabled(paramBoolean);
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean)
  {
    mShowHideAnimationEnabled = paramBoolean;
    if (!paramBoolean)
    {
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
      if (localViewPropertyAnimatorCompatSet != null) {
        localViewPropertyAnimatorCompatSet.cancel();
      }
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public void showForSystem()
  {
    if (mHiddenBySystem)
    {
      mHiddenBySystem = false;
      updateVisibility(true);
    }
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    i0.d localD = mActionMode;
    if (localD != null) {
      localD.finish();
    }
    mOverlayLayout.setHideOnContentScrollEnabled(false);
    mContextView.killMode();
    paramCallback = new i0.d(this, mContextView.getContext(), paramCallback);
    if (paramCallback.dispatchOnCreate())
    {
      mActionMode = paramCallback;
      paramCallback.invalidate();
      mContextView.initForMode(paramCallback);
      animateToMode(true);
      return paramCallback;
    }
    return null;
  }
}
