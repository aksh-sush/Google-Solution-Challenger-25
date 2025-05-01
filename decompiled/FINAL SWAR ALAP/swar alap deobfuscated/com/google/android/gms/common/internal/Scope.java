package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.b;
import com.google.android.gms.common.api.GoogleApiClient.c;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.MediaBrowserCompatApi21.ConnectionCallback;
import com.google.android.gms.common.api.internal.Segment;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import module.Label;

public abstract class Scope
  extends Context
  implements c, Paint
{
  private static volatile Executor callbackExecutor;
  private final Account account;
  private final h replaced;
  private final Set<com.google.android.gms.common.api.Scope> scopes;
  
  protected Scope(android.content.Context paramContext, Looper paramLooper, int paramInt, h paramH, GoogleApiClient.b paramB, GoogleApiClient.c paramC)
  {
    this(paramContext, paramLooper, paramInt, paramH, paramB, paramC);
  }
  
  protected Scope(android.content.Context paramContext, Looper paramLooper, int paramInt, h paramH, MediaBrowserCompatApi21.ConnectionCallback paramConnectionCallback, Segment paramSegment)
  {
    this(paramContext, paramLooper, f.a(paramContext), module.f.a(), paramInt, paramH, (MediaBrowserCompatApi21.ConnectionCallback)Log.append(paramConnectionCallback), (Segment)Log.append(paramSegment));
  }
  
  protected Scope(android.content.Context paramContext, Looper paramLooper, f paramF, module.f paramF1, int paramInt, h paramH, MediaBrowserCompatApi21.ConnectionCallback paramConnectionCallback, Segment paramSegment)
  {
    super(paramContext, paramLooper, paramF, paramF1, paramInt, paramConnectionCallback, paramSegment, paramH.f());
    replaced = paramH;
    account = paramH.getIntent();
    scopes = create(paramH.getValue());
  }
  
  private final Set create(Set paramSet)
  {
    Set localSet = validateScopes(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((com.google.android.gms.common.api.Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  public final Account getAccount()
  {
    return account;
  }
  
  protected final Executor getBindServiceExecutor()
  {
    return null;
  }
  
  protected final h getClientSettings()
  {
    return replaced;
  }
  
  public Label[] getRequiredFeatures()
  {
    return new Label[0];
  }
  
  protected final Set getScopes()
  {
    return scopes;
  }
  
  public Set getScopesForConnectionlessNonSignIn()
  {
    if (requiresSignIn()) {
      return scopes;
    }
    return Collections.emptySet();
  }
  
  protected Set validateScopes(Set paramSet)
  {
    return paramSet;
  }
}
