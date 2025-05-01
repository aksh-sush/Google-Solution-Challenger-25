package com.onesignal.core.internal.purchases.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import db.g;
import db.l;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l7.e;
import l7.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.e;

public final class c implements z7.b, e {
    public static final a Companion = new a((g) null);
    /* access modifiers changed from: private */
    public static Class<?> iInAppBillingServiceClass;
    /* access modifiers changed from: private */
    public static int iapEnabled = -99;
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final v7.e _operationRepo;
    private final y7.a _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    /* access modifiers changed from: private */
    public Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting = true;
    private final List<String> purchaseTokens = new ArrayList();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            l.d(methods, "clazz.methods");
            for (Method method : methods) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && l.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            l.b(cls);
            Method[] methods = cls.getMethods();
            l.d(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && l.a(parameterTypes[0], Integer.TYPE)) {
                    Class<String> cls2 = String.class;
                    if (l.a(parameterTypes[1], cls2) && l.a(parameterTypes[2], cls2) && l.a(parameterTypes[3], cls2)) {
                        return method;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            l.b(cls);
            Method[] methods = cls.getMethods();
            l.d(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && l.a(parameterTypes[0], Integer.TYPE)) {
                    Class<String> cls2 = String.class;
                    if (l.a(parameterTypes[1], cls2) && l.a(parameterTypes[2], cls2)) {
                        Class<Bundle> cls3 = Bundle.class;
                        if (l.a(parameterTypes[3], cls3) && l.a(returnType, cls3)) {
                            return method;
                        }
                    }
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            l.e(context, "context");
            if (c.iapEnabled == -99) {
                c.iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (c.iapEnabled == 0) {
                    c.iInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                return c.iapEnabled == 0;
            } catch (Throwable unused) {
                c.iapEnabled = 0;
                return false;
            }
        }
    }

    public static final class b implements ServiceConnection {
        final /* synthetic */ c this$0;

        b(c cVar) {
            this.this$0 = cVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.e(componentName, "name");
            l.e(iBinder, "service");
            try {
                Class<?> cls = Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                a aVar = c.Companion;
                l.d(cls, "stubClass");
                Method access$getAsInterfaceMethod = aVar.getAsInterfaceMethod(cls);
                l.b(access$getAsInterfaceMethod);
                access$getAsInterfaceMethod.setAccessible(true);
                this.this$0.mIInAppBillingService = access$getAsInterfaceMethod.invoke((Object) null, new Object[]{iBinder});
                this.this$0.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.e(componentName, "name");
            c.iapEnabled = -99;
            this.this$0.mIInAppBillingService = null;
        }
    }

    public c(f fVar, y7.a aVar, v7.e eVar, com.onesignal.core.internal.config.b bVar, com.onesignal.user.internal.identity.b bVar2) {
        l.e(fVar, "_applicationService");
        l.e(aVar, "_prefs");
        l.e(eVar, "_operationRepo");
        l.e(bVar, "_configModelStore");
        l.e(bVar2, "_identityModelStore");
        this._applicationService = fVar;
        this._prefs = aVar;
        this._operationRepo = eVar;
        this._configModelStore = bVar;
        this._identityModelStore = bVar2;
    }

    /* access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (!this.isWaitingForPurchasesRequest) {
            new Thread(new b(this)).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: queryBoughtItems$lambda-0  reason: not valid java name */
    public static final void m3queryBoughtItems$lambda0(c cVar) {
        l.e(cVar, "this$0");
        cVar.isWaitingForPurchasesRequest = true;
        try {
            if (cVar.getPurchasesMethod == null) {
                Method access$getGetPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                cVar.getPurchasesMethod = access$getGetPurchasesMethod;
                l.b(access$getGetPurchasesMethod);
                access$getGetPurchasesMethod.setAccessible(true);
            }
            Method method = cVar.getPurchasesMethod;
            l.b(method);
            Object invoke = method.invoke(cVar.mIInAppBillingService, new Object[]{3, cVar._applicationService.getAppContext().getPackageName(), "inapp", null});
            l.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) invoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                l.b(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l.b(stringArrayList);
                    String str = stringArrayList.get(i10);
                    String string = new JSONObject(stringArrayList2.get(i10)).getString("purchaseToken");
                    if (!cVar.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    cVar.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    cVar.newAsExisting = false;
                    cVar._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        cVar.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method access$getGetSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = access$getGetSkuDetailsMethod;
                l.b(access$getGetSkuDetailsMethod);
                access$getGetSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            l.b(method);
            Object invoke = method.invoke(this.mIInAppBillingService, new Object[]{3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle});
            l.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) invoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                l.b(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    l.d(divide, "price.divide(BigDecimal(1000000))");
                    l.d(string, "sku");
                    l.d(string2, "iso");
                    linkedHashMap.put(string, new com.onesignal.user.internal.operations.g(string, string2, divide));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (linkedHashMap.containsKey(next)) {
                        Object obj = linkedHashMap.get(next);
                        l.b(obj);
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    e.a.enqueue$default(this._operationRepo, new com.onesignal.user.internal.operations.l(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((com.onesignal.user.internal.identity.a) this._identityModelStore.getModel()).getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, (Object) null);
                    this.purchaseTokens.addAll(arrayList2);
                    this._prefs.saveString("GTPlayerPurchases", "purchaseTokens", this.purchaseTokens.toString());
                    this._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    this.newAsExisting = false;
                    this.isWaitingForPurchasesRequest = false;
                }
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.a.warn("Failed to track IAP purchases", th);
        }
    }

    private final void trackIAP() {
        if (this.mServiceConn == null) {
            b bVar = new b(this);
            this.mServiceConn = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this._applicationService.getAppContext().getApplicationContext().bindService(intent, bVar, 1);
        } else if (this.mIInAppBillingService != null) {
            queryBoughtItems();
        }
    }

    public void onFocus() {
        trackIAP();
    }

    public void onUnfocused() {
    }

    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    this.purchaseTokens.add(jSONArray.get(i10).toString());
                }
                if (jSONArray.length() == 0) {
                    z10 = true;
                }
                this.newAsExisting = z10;
                if (z10) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    l.b(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }
}
