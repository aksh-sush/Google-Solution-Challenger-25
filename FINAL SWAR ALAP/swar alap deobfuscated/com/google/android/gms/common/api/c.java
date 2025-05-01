package com.google.android.gms.common.api;

import android.content.Intent;
import com.google.android.gms.common.internal.Widget;
import com.google.android.gms.common.internal.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import module.Label;

public abstract interface c
  extends Object
{
  public abstract void connect(com.google.android.gms.common.internal.Object paramObject);
  
  public abstract void disconnect();
  
  public abstract void disconnect(String paramString);
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract Label[] getAvailableFeatures();
  
  public abstract String getEndpointPackageName();
  
  public abstract String getLastDisconnectMessage();
  
  public abstract int getMinApkVersion();
  
  public abstract void getRemoteService(e paramE, Set paramSet);
  
  public abstract Set getScopesForConnectionlessNonSignIn();
  
  public abstract Intent getSignInIntent();
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public abstract void onUserSignOut(Widget paramWidget);
  
  public abstract boolean providesSignIn();
  
  public abstract boolean requiresGooglePlayServices();
  
  public abstract boolean requiresSignIn();
}
