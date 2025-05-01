package com.onesignal.core.internal.purchases.impl;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import db.g;
import db.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import l7.e;
import l7.f;
import sa.o;
import sa.t;
import v7.e;
import va.d;

public final class a implements z7.b, e {
    public static final C0135a Companion = new C0135a((g) null);
    /* access modifiers changed from: private */
    public final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.user.internal.identity.b _identityModelStore;
    private final v7.e _operationRepo;
    private boolean canTrack;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    /* access modifiers changed from: private */
    public b osPurchasingListener;
    private boolean registerListenerOnMainThread;

    /* renamed from: com.onesignal.core.internal.purchases.impl.a$a  reason: collision with other inner class name */
    public static final class C0135a {
        private C0135a() {
        }

        public /* synthetic */ C0135a(g gVar) {
            this();
        }

        public final boolean canTrack() {
            try {
                Class.forName("com.amazon.device.iap.PurchasingListener");
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
    }

    private final class b implements PurchasingListener {
        private final com.onesignal.core.internal.config.b _configModelStore;
        private final com.onesignal.user.internal.identity.b _identityModelStore;
        private final v7.e _operationRepo;
        private String currentMarket;
        private RequestId lastRequestId;
        private PurchasingListener orgPurchasingListener;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.core.internal.purchases.impl.a$b$a  reason: collision with other inner class name */
        public /* synthetic */ class C0136a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductDataResponse.RequestStatus.values().length];
                iArr[ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(a aVar, v7.e eVar, com.onesignal.core.internal.config.b bVar, com.onesignal.user.internal.identity.b bVar2) {
            l.e(eVar, "_operationRepo");
            l.e(bVar, "_configModelStore");
            l.e(bVar2, "_identityModelStore");
            this.this$0 = aVar;
            this._operationRepo = eVar;
            this._configModelStore = bVar;
            this._identityModelStore = bVar2;
        }

        private final String marketToCurrencyCode(String str) {
            if (str == null) {
                return "";
            }
            int hashCode = str.hashCode();
            return hashCode != 2100 ? hashCode != 2128 ? hashCode != 2142 ? hashCode != 2177 ? hashCode != 2222 ? hashCode != 2252 ? hashCode != 2267 ? hashCode != 2347 ? hashCode != 2374 ? (hashCode == 2718 && str.equals("US")) ? "USD" : "" : !str.equals("JP") ? "" : "JPY" : !str.equals("IT") ? "" : "EUR" : !str.equals("GB") ? "" : "GBP" : !str.equals("FR") ? "" : "EUR" : !str.equals("ES") ? "" : "EUR" : !str.equals("DE") ? "" : "EUR" : !str.equals("CA") ? "" : "CDN" : !str.equals("BR") ? "" : "BRL" : !str.equals("AU") ? "" : "AUD";
        }

        public final PurchasingListener getOrgPurchasingListener() {
            return this.orgPurchasingListener;
        }

        public void onProductDataResponse(ProductDataResponse productDataResponse) {
            l.e(productDataResponse, "response");
            RequestId requestId = this.lastRequestId;
            if (requestId == null || !l.a(String.valueOf(requestId), productDataResponse.getRequestId().toString())) {
                PurchasingListener purchasingListener = this.orgPurchasingListener;
                if (purchasingListener != null) {
                    l.b(purchasingListener);
                    purchasingListener.onProductDataResponse(productDataResponse);
                    return;
                }
                return;
            }
            ProductDataResponse.RequestStatus requestStatus = productDataResponse.getRequestStatus();
            if ((requestStatus == null ? -1 : C0136a.$EnumSwitchMapping$0[requestStatus.ordinal()]) == 1) {
                ArrayList arrayList = new ArrayList();
                Map productData = productDataResponse.getProductData();
                BigDecimal bigDecimal = new BigDecimal(0);
                BigDecimal bigDecimal2 = bigDecimal;
                for (String str : productData.keySet()) {
                    Product product = (Product) productData.get(str);
                    l.b(product);
                    String sku = product.getSku();
                    String marketToCurrencyCode = marketToCurrencyCode(this.currentMarket);
                    String price = product.getPrice();
                    l.d(price, "priceStr");
                    if (!new lb.f("^[0-9]").a(price)) {
                        l.d(price, "priceStr");
                        price = price.substring(1);
                        l.d(price, "this as java.lang.String).substring(startIndex)");
                    }
                    BigDecimal bigDecimal3 = new BigDecimal(price);
                    bigDecimal2 = bigDecimal2.add(bigDecimal3);
                    l.d(bigDecimal2, "this.add(other)");
                    l.d(sku, "sku");
                    arrayList.add(new com.onesignal.user.internal.operations.g(sku, marketToCurrencyCode, bigDecimal3));
                }
                e.a.enqueue$default(this._operationRepo, new com.onesignal.user.internal.operations.l(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((com.onesignal.user.internal.identity.a) this._identityModelStore.getModel()).getOnesignalId(), false, bigDecimal2, arrayList), false, 2, (Object) null);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            l.e(purchaseResponse, "response");
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = purchaseResponse.getUserData().getMarketplace();
                HashSet hashSet = new HashSet();
                String sku = purchaseResponse.getReceipt().getSku();
                l.d(sku, "response.receipt.sku");
                hashSet.add(sku);
                this.lastRequestId = PurchasingService.getProductData(hashSet);
            }
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                l.b(purchasingListener);
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            l.e(purchaseUpdatesResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                l.b(purchasingListener);
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            l.e(userDataResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                l.b(purchasingListener);
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }

        public final void setOrgPurchasingListener(PurchasingListener purchasingListener) {
            this.orgPurchasingListener = purchasingListener;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, d dVar) {
            super(1, dVar);
            this.this$0 = aVar;
        }

        public final d create(d dVar) {
            return new c(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                PurchasingService.registerListener(this.this$0._applicationService.getAppContext(), this.this$0.osPurchasingListener);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(d dVar) {
            return ((c) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(f fVar, v7.e eVar, com.onesignal.core.internal.config.b bVar, com.onesignal.user.internal.identity.b bVar2) {
        l.e(fVar, "_applicationService");
        l.e(eVar, "_operationRepo");
        l.e(bVar, "_configModelStore");
        l.e(bVar2, "_identityModelStore");
        this._applicationService = fVar;
        this._operationRepo = eVar;
        this._configModelStore = bVar;
        this._identityModelStore = bVar2;
    }

    private final void logAmazonIAPListenerError(Exception exc) {
        com.onesignal.debug.internal.logging.a.error("Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private final void setListener() {
        if (this.registerListenerOnMainThread) {
            com.onesignal.common.threading.a.suspendifyOnMain(new c(this, (d) null));
        } else {
            PurchasingService.registerListener(this._applicationService.getAppContext(), this.osPurchasingListener);
        }
    }

    public void onFocus() {
    }

    public void onUnfocused() {
        if (this.canTrack) {
            try {
                Field field = this.listenerHandlerField;
                l.b(field);
                b bVar = (PurchasingListener) field.get(this.listenerHandlerObject);
                b bVar2 = this.osPurchasingListener;
                if (bVar != bVar2) {
                    l.b(bVar2);
                    bVar2.setOrgPurchasingListener(bVar);
                    setListener();
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void start() {
        if (Companion.canTrack()) {
            try {
                Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
                try {
                    this.listenerHandlerObject = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
                } catch (NullPointerException unused) {
                    try {
                        this.listenerHandlerObject = cls.getMethod("e", new Class[0]).invoke((Object) null, new Object[0]);
                        this.registerListenerOnMainThread = true;
                    } catch (NullPointerException unused2) {
                        this.listenerHandlerObject = cls.getMethod("g", new Class[0]).invoke((Object) null, new Object[0]);
                        this.registerListenerOnMainThread = true;
                    }
                }
                Field declaredField = cls.getDeclaredField("f");
                declaredField.setAccessible(true);
                b bVar = new b(this, this._operationRepo, this._configModelStore, this._identityModelStore);
                this.osPurchasingListener = bVar;
                l.b(bVar);
                bVar.setOrgPurchasingListener((PurchasingListener) declaredField.get(this.listenerHandlerObject));
                this.listenerHandlerField = declaredField;
                this.canTrack = true;
                setListener();
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
                logAmazonIAPListenerError(e10);
            }
            this._applicationService.addApplicationLifecycleHandler(this);
        }
    }
}
