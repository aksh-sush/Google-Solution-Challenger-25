package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStarter {
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;
    private static ServiceStarter instance;
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private Boolean hasWakeLockPermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    private ServiceStarter() {
    }

    private int doStartService(Context context, Intent intent) {
        ComponentName componentName;
        String resolveServiceClassName = resolveServiceClassName(context, intent);
        if (resolveServiceClassName != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, resolveServiceClassName.length() != 0 ? "Restricting intent to a specific service: ".concat(resolveServiceClassName) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), resolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentName = u0.e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d(Constants.TAG, "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e(Constants.TAG, "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e10) {
            Log.e(Constants.TAG, "Error while delivering the message to the serviceIntent", e10);
            return 401;
        } catch (IllegalStateException e11) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf);
            Log.e(Constants.TAG, sb2.toString());
            return 402;
        }
    }

    static synchronized ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    private synchronized String resolveServiceClassName(Context context, Intent intent) {
        String str;
        String str2 = this.firebaseMessagingServiceClassName;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str3 = serviceInfo.name;
                    if (str3 != null) {
                        if (str3.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            str = serviceInfo.name;
                        }
                        this.firebaseMessagingServiceClassName = str;
                        return this.firebaseMessagingServiceClassName;
                    }
                }
                String str4 = serviceInfo.packageName;
                String str5 = serviceInfo.name;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb2.append(str4);
                sb2.append("/");
                sb2.append(str5);
                Log.e(Constants.TAG, sb2.toString());
                return null;
            }
        }
        Log.e(Constants.TAG, "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    /* access modifiers changed from: package-private */
    public Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    public int startMessagingService(Context context, Intent intent) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Starting service");
        }
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }
}
