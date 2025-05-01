package androidx.fragment.package_33;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.asm.ActivityCompat;
import androidx.core.asm.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.asm.ActivityCompat21.SharedElementCallback21;
import androidx.core.asm.ActivityCompatApi23.RequestPermissionsRequestCodeValidator;
import androidx.lifecycle.Label;
import androidx.lifecycle.LifecycleEvent;
import androidx.lifecycle.f;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

public abstract class FragmentActivity
  extends ComponentActivity
  implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompatApi23.RequestPermissionsRequestCodeValidator
{
  static final String FRAGMENTS_TAG = "android:support:fragments";
  boolean mCreated;
  final f mFragmentLifecycleRegistry = new f(this);
  final FragmentController mFragments = FragmentController.createController(new FragmentActivity.HostCallbacks(this));
  boolean mResumed;
  boolean mStopped = true;
  
  public FragmentActivity()
  {
    visitFrame();
  }
  
  private static boolean a(FragmentManagerImpl paramFragmentManagerImpl, Label paramLabel)
  {
    paramFragmentManagerImpl = paramFragmentManagerImpl.getValue().iterator();
    boolean bool1 = false;
    while (paramFragmentManagerImpl.hasNext())
    {
      Fragment localFragment = (Fragment)paramFragmentManagerImpl.next();
      if (localFragment != null)
      {
        boolean bool2 = bool1;
        if (localFragment.getHost() != null) {
          bool2 = bool1 | a(localFragment.getChildFragmentManager(), paramLabel);
        }
        MethodWriter localMethodWriter = mViewLifecycleOwner;
        bool1 = bool2;
        if (localMethodWriter != null)
        {
          bool1 = bool2;
          if (localMethodWriter.getLifecycle().c().a(Label.c))
          {
            mViewLifecycleOwner.a(paramLabel);
            bool1 = true;
          }
        }
        if (mLifecycleRegistry.c().a(Label.c))
        {
          mLifecycleRegistry.a(paramLabel);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  private void visitFrame()
  {
    getSavedStateRegistry().a("android:support:fragments", new CordovaInterfaceImpl(this));
    addOnContextAvailableListener(new ByteVector(this));
  }
  
  final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return mFragments.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(mCreated);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(mStopped);
    if (getApplication() != null) {
      LoaderManager.getLoaderManager(this).dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    mFragments.getSupportFragmentManager().dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public FragmentManagerImpl getSupportFragmentManager()
  {
    return mFragments.getSupportFragmentManager();
  }
  
  public LoaderManager getSupportLoaderManager()
  {
    return LoaderManager.getLoaderManager(this);
  }
  
  void markFragmentsCreated()
  {
    while (a(getSupportFragmentManager(), Label.d)) {}
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    mFragments.noteStateNotSaved();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    mFragments.noteStateNotSaved();
    super.onConfigurationChanged(paramConfiguration);
    mFragments.dispatchConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_CREATE);
    mFragments.dispatchCreate();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      return super.onCreatePanelMenu(paramInt, paramMenu) | mFragments.dispatchCreateOptionsMenu(paramMenu, getMenuInflater());
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView2 = dispatchFragmentsOnCreateView(null, paramString, paramContext, paramAttributeSet);
    View localView1 = localView2;
    if (localView2 == null) {
      localView1 = super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView1;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    mFragments.dispatchDestroy();
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_DESTROY);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    mFragments.dispatchLowMemory();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt != 0)
    {
      if (paramInt != 6) {
        return false;
      }
      return mFragments.dispatchContextItemSelected(paramMenuItem);
    }
    return mFragments.dispatchOptionsItemSelected(paramMenuItem);
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    mFragments.restoreAllState(paramBoolean);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    mFragments.noteStateNotSaved();
    super.onNewIntent(paramIntent);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      mFragments.dispatchOptionsMenuClosed(paramMenu);
    }
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPause()
  {
    super.onPause();
    mResumed = false;
    mFragments.dispatchPause();
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_PAUSE);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    mFragments.dispatchReallyStop(paramBoolean);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    onResumeFragments();
  }
  
  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt == 0) {
      return onPrepareOptionsPanel(paramView, paramMenu) | mFragments.dispatchPrepareOptionsMenu(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    mFragments.noteStateNotSaved();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onResume()
  {
    mFragments.noteStateNotSaved();
    super.onResume();
    mResumed = true;
    mFragments.execPendingActions();
  }
  
  protected void onResumeFragments()
  {
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_RESUME);
    mFragments.dispatchResume();
  }
  
  protected void onStart()
  {
    mFragments.noteStateNotSaved();
    super.onStart();
    mStopped = false;
    if (!mCreated)
    {
      mCreated = true;
      mFragments.dispatchActivityCreated();
    }
    mFragments.execPendingActions();
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_START);
    mFragments.dispatchStart();
  }
  
  public void onStateNotSaved()
  {
    mFragments.noteStateNotSaved();
  }
  
  protected void onStop()
  {
    super.onStop();
    mStopped = true;
    markFragmentsCreated();
    mFragments.dispatchStop();
    mFragmentLifecycleRegistry.append(LifecycleEvent.ON_STOP);
  }
  
  public void setEnterSharedElementCallback(ActivityCompat21.SharedElementCallback21 paramSharedElementCallback21)
  {
    ActivityCompat.setEnterSharedElementCallback(this, paramSharedElementCallback21);
  }
  
  public void setExitSharedElementCallback(ActivityCompat21.SharedElementCallback21 paramSharedElementCallback21)
  {
    ActivityCompat.setExitSharedElementCallback(this, paramSharedElementCallback21);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      ActivityCompat.startActivityForResult(this, paramIntent, -1, paramBundle);
      return;
    }
    paramFragment.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderFromFragment(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (paramInt1 == -1)
    {
      ActivityCompat.a(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    paramFragment.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void supportFinishAfterTransition()
  {
    ActivityCompat.finishAfterTransition(this);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    invalidateOptionsMenu();
  }
  
  public void supportPostponeEnterTransition()
  {
    ActivityCompat.postponeEnterTransition(this);
  }
  
  public void supportStartPostponedEnterTransition()
  {
    ActivityCompat.startPostponedEnterTransition(this);
  }
  
  public final void validateRequestPermissionsRequestCode(int paramInt) {}
}
