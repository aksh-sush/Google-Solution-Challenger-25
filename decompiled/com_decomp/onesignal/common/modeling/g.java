package com.onesignal.common.modeling;

import cb.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.events.b;
import com.onesignal.common.events.d;
import db.m;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sa.t;

public class g implements d {
    private g _parentModel;
    private final String _parentProperty;
    private final b changeNotifier;
    private final Map<String, Object> data;
    private final Object initializationLock;

    static final class a extends m implements l {
        final /* synthetic */ h $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, String str) {
            super(1);
            this.$changeArgs = hVar;
            this.$tag = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a) obj);
            return t.f15300a;
        }

        public final void invoke(a aVar) {
            db.l.e(aVar, "it");
            aVar.onChanged(this.$changeArgs, this.$tag);
        }
    }

    public g() {
        this((g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    public static /* synthetic */ Object getAnyProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getAnyProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getBigDecimalProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
    }

    public static /* synthetic */ boolean getBooleanProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getBooleanProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
    }

    public static /* synthetic */ double getDoubleProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getDoubleProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
    }

    public static /* synthetic */ float getFloatProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getFloatProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
    }

    public static /* synthetic */ int getIntProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getIntProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
    }

    public static /* synthetic */ List getListProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getListProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
    }

    public static /* synthetic */ long getLongProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getLongProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
    }

    public static /* synthetic */ f getMapModelProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getMapModelProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
    }

    public static /* synthetic */ Object getOptAnyProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptAnyProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptBigDecimalProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptBooleanProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptDoubleProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
    }

    public static /* synthetic */ Float getOptFloatProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptFloatProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
    }

    public static /* synthetic */ Integer getOptIntProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptIntProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
    }

    public static /* synthetic */ List getOptListProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptListProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
    }

    public static /* synthetic */ Long getOptLongProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptLongProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
    }

    public static /* synthetic */ f getOptMapModelProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptMapModelProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
    }

    public static /* synthetic */ String getOptStringProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getOptStringProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
    }

    public static /* synthetic */ String getStringProperty$default(g gVar, String str, cb.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return gVar.getStringProperty(str, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new h(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            g gVar = this._parentModel;
            db.l.b(gVar);
            gVar.notifyChanged(this._parentProperty + '.' + str, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(g gVar, String str, Object obj, String str2, boolean z10, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setAnyProperty(str, obj, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
    }

    public static /* synthetic */ void setBigDecimalProperty$default(g gVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setBigDecimalProperty(str, bigDecimal, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
    }

    public static /* synthetic */ void setBooleanProperty$default(g gVar, String str, boolean z10, String str2, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z11 = false;
            }
            gVar.setBooleanProperty(str, z10, str2, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
    }

    public static /* synthetic */ void setDoubleProperty$default(g gVar, String str, double d10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            gVar.setDoubleProperty(str, d10, str2, (i10 & 8) != 0 ? false : z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
    }

    public static /* synthetic */ void setEnumProperty$default(g gVar, String str, Enum enumR, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            db.l.e(str, "name");
            db.l.e(enumR, FirebaseAnalytics.Param.VALUE);
            db.l.e(str2, "tag");
            gVar.setOptAnyProperty(str, enumR.toString(), str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
    }

    public static /* synthetic */ void setFloatProperty$default(g gVar, String str, float f10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setFloatProperty(str, f10, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
    }

    public static /* synthetic */ void setIntProperty$default(g gVar, String str, int i10, String str2, boolean z10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            gVar.setIntProperty(str, i10, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
    }

    public static /* synthetic */ void setListProperty$default(g gVar, String str, List list, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setListProperty(str, list, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
    }

    public static /* synthetic */ void setLongProperty$default(g gVar, String str, long j10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            gVar.setLongProperty(str, j10, str2, (i10 & 8) != 0 ? false : z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
    }

    public static /* synthetic */ void setMapModelProperty$default(g gVar, String str, f fVar, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setMapModelProperty(str, fVar, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
    }

    public static /* synthetic */ void setOptAnyProperty$default(g gVar, String str, Object obj, String str2, boolean z10, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptAnyProperty(str, obj, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(g gVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptBigDecimalProperty(str, bigDecimal, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
    }

    public static /* synthetic */ void setOptBooleanProperty$default(g gVar, String str, Boolean bool, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptBooleanProperty(str, bool, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
    }

    public static /* synthetic */ void setOptDoubleProperty$default(g gVar, String str, Double d10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptDoubleProperty(str, d10, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
    }

    public static /* synthetic */ void setOptEnumProperty$default(g gVar, String str, Enum enumR, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            db.l.e(str, "name");
            db.l.e(str2, "tag");
            gVar.setOptAnyProperty(str, enumR != null ? enumR.toString() : null, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
    }

    public static /* synthetic */ void setOptFloatProperty$default(g gVar, String str, Float f10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptFloatProperty(str, f10, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
    }

    public static /* synthetic */ void setOptIntProperty$default(g gVar, String str, Integer num, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptIntProperty(str, num, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
    }

    public static /* synthetic */ void setOptListProperty$default(g gVar, String str, List list, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptListProperty(str, list, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
    }

    public static /* synthetic */ void setOptLongProperty$default(g gVar, String str, Long l10, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptLongProperty(str, l10, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
    }

    public static /* synthetic */ void setOptMapModelProperty$default(g gVar, String str, f fVar, String str2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptMapModelProperty(str, fVar, str2, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
    }

    public static /* synthetic */ void setOptStringProperty$default(g gVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str3 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setOptStringProperty(str, str2, str3, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
    }

    public static /* synthetic */ void setStringProperty$default(g gVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str3 = "NORMAL";
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            gVar.setStringProperty(str, str2, str3, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
    }

    /* access modifiers changed from: protected */
    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        db.l.e(str, "property");
        db.l.e(jSONArray, "jsonArray");
        return null;
    }

    /* access modifiers changed from: protected */
    public g createModelForProperty(String str, JSONObject jSONObject) {
        db.l.e(str, "property");
        db.l.e(jSONObject, "jsonObject");
        return null;
    }

    /* access modifiers changed from: protected */
    public final Object getAnyProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        db.l.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    /* access modifiers changed from: protected */
    public final BigDecimal getBigDecimalProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(str, aVar);
        db.l.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    /* access modifiers changed from: protected */
    public final boolean getBooleanProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(str, aVar);
        db.l.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final Map<String, Object> getData() {
        return this.data;
    }

    /* access modifiers changed from: protected */
    public final double getDoubleProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Double optDoubleProperty = getOptDoubleProperty(str, aVar);
        db.l.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String str) {
        db.l.e(str, "name");
        T t10 = null;
        T optAnyProperty$default = getOptAnyProperty$default(this, str, (cb.a) null, 2, (Object) null);
        if (optAnyProperty$default != null) {
            db.l.i(3, "T");
            if (!(optAnyProperty$default instanceof Enum)) {
                if (optAnyProperty$default instanceof String) {
                    db.l.i(5, "T");
                    t10 = Enum.valueOf((Class) null, (String) optAnyProperty$default);
                } else {
                    db.l.i(1, "T");
                }
            }
            t10 = (Enum) optAnyProperty$default;
        }
        db.l.i(1, "T");
        return t10;
    }

    /* access modifiers changed from: protected */
    public final float getFloatProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Float optFloatProperty = getOptFloatProperty(str, aVar);
        db.l.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", (cb.a) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final int getIntProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Integer optIntProperty = getOptIntProperty(str, aVar);
        db.l.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    /* access modifiers changed from: protected */
    public final <T> List<T> getListProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        List<T> optListProperty = getOptListProperty(str, aVar);
        db.l.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    /* access modifiers changed from: protected */
    public final long getLongProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Long optLongProperty = getOptLongProperty(str, aVar);
        db.l.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    /* access modifiers changed from: protected */
    public final <T> f getMapModelProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        f optMapModelProperty = getOptMapModelProperty(str, aVar);
        db.l.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    /* access modifiers changed from: protected */
    public final Object getOptAnyProperty(String str, cb.a aVar) {
        Object obj;
        db.l.e(str, "name");
        synchronized (this.data) {
            if (!this.data.containsKey(str)) {
                if (aVar != null) {
                    obj = aVar.invoke();
                    this.data.put(str, obj);
                }
            }
            obj = this.data.get(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final BigDecimal getOptBigDecimalProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return new BigDecimal(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Long) {
            return new BigDecimal(((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return new BigDecimal((double) ((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Double) {
            return new BigDecimal(((Number) optAnyProperty).doubleValue());
        }
        return optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    /* access modifiers changed from: protected */
    public final Boolean getOptBooleanProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        return (Boolean) getOptAnyProperty(str, aVar);
    }

    /* access modifiers changed from: protected */
    public final Double getOptDoubleProperty(String str, cb.a aVar) {
        double longValue;
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Double) {
            return (Double) optAnyProperty;
        }
        if (optAnyProperty instanceof Float) {
            longValue = (double) ((Number) optAnyProperty).floatValue();
        } else if (optAnyProperty instanceof Integer) {
            longValue = (double) ((Number) optAnyProperty).intValue();
        } else if (!(optAnyProperty instanceof Long)) {
            return (Double) optAnyProperty;
        } else {
            longValue = (double) ((Number) optAnyProperty).longValue();
        }
        return Double.valueOf(longValue);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String str) {
        db.l.e(str, "name");
        T optAnyProperty$default = getOptAnyProperty$default(this, str, (cb.a) null, 2, (Object) null);
        if (optAnyProperty$default == null) {
            return null;
        }
        db.l.i(3, "T");
        if (optAnyProperty$default instanceof Enum) {
            return (Enum) optAnyProperty$default;
        }
        if (optAnyProperty$default instanceof String) {
            db.l.i(5, "T");
            return Enum.valueOf((Class) null, (String) optAnyProperty$default);
        }
        db.l.i(1, "T");
        return (Enum) optAnyProperty$default;
    }

    /* access modifiers changed from: protected */
    public final Float getOptFloatProperty(String str, cb.a aVar) {
        float longValue;
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Float) {
            return (Float) optAnyProperty;
        }
        if (optAnyProperty instanceof Double) {
            longValue = (float) ((Number) optAnyProperty).doubleValue();
        } else if (optAnyProperty instanceof Integer) {
            longValue = (float) ((Number) optAnyProperty).intValue();
        } else if (!(optAnyProperty instanceof Long)) {
            return (Float) optAnyProperty;
        } else {
            longValue = (float) ((Number) optAnyProperty).longValue();
        }
        return Float.valueOf(longValue);
    }

    /* access modifiers changed from: protected */
    public final Integer getOptIntProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return (Integer) optAnyProperty;
        }
        if (optAnyProperty instanceof Long) {
            return Integer.valueOf((int) ((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return Integer.valueOf((int) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    /* access modifiers changed from: protected */
    public final <T> List<T> getOptListProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        return (List) getOptAnyProperty(str, aVar);
    }

    /* access modifiers changed from: protected */
    public final Long getOptLongProperty(String str, cb.a aVar) {
        long doubleValue;
        db.l.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Long) {
            return (Long) optAnyProperty;
        }
        if (optAnyProperty instanceof Integer) {
            doubleValue = (long) ((Number) optAnyProperty).intValue();
        } else if (optAnyProperty instanceof Float) {
            doubleValue = (long) ((Number) optAnyProperty).floatValue();
        } else if (!(optAnyProperty instanceof Double)) {
            return (Long) optAnyProperty;
        } else {
            doubleValue = (long) ((Number) optAnyProperty).doubleValue();
        }
        return Long.valueOf(doubleValue);
    }

    /* access modifiers changed from: protected */
    public final <T> f getOptMapModelProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        return (f) getOptAnyProperty(str, aVar);
    }

    /* access modifiers changed from: protected */
    public final String getOptStringProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        return (String) getOptAnyProperty(str, aVar);
    }

    /* access modifiers changed from: protected */
    public final String getStringProperty(String str, cb.a aVar) {
        db.l.e(str, "name");
        String optStringProperty = getOptStringProperty(str, aVar);
        db.l.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String str) {
        db.l.e(str, "name");
        return this.data.containsKey(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[LOOP:1: B:13:0x005a->B:22:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0087 A[EDGE_INSN: B:69:0x0087->B:24:0x0087 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initializeFromJson(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r0 = "jsonObject"
            db.l.e(r12, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.data
            r0.clear()
            java.util.Iterator r0 = r12.keys()
            java.lang.String r1 = "jsonObject.keys()"
            db.l.d(r0, r1)
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.get(r1)
            boolean r3 = r2 instanceof org.json.JSONObject
            java.lang.String r4 = "property"
            if (r3 == 0) goto L_0x003a
            db.l.d(r1, r4)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.onesignal.common.modeling.g r2 = r11.createModelForProperty(r1, r2)
            if (r2 == 0) goto L_0x0013
        L_0x0034:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r11.data
            r3.put(r1, r2)
            goto L_0x0013
        L_0x003a:
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x004a
            db.l.d(r1, r4)
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.util.List r2 = r11.createListForProperty(r1, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0034
        L_0x004a:
            java.lang.Class r2 = r11.getClass()
            java.lang.reflect.Method[] r2 = r2.getMethods()
            java.lang.String r3 = "this.javaClass.methods"
            db.l.d(r2, r3)
            int r3 = r2.length
            r5 = 0
            r6 = 0
        L_0x005a:
            r7 = 1
            if (r6 >= r3) goto L_0x0086
            r8 = r2[r6]
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<java.lang.Void> r10 = java.lang.Void.class
            boolean r9 = db.l.a(r9, r10)
            if (r9 != 0) goto L_0x007f
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "it.name"
            db.l.d(r9, r10)
            db.l.d(r1, r4)
            boolean r9 = lb.q.v(r9, r1, r7)
            if (r9 == 0) goto L_0x007f
            r9 = 1
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 == 0) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0086:
            r8 = 0
        L_0x0087:
            if (r8 != 0) goto L_0x0097
        L_0x0089:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            java.lang.Object r3 = r12.get(r1)
        L_0x0092:
            r2.put(r1, r3)
            goto L_0x0013
        L_0x0097:
            java.lang.Class r2 = r8.getReturnType()
            java.lang.Class r3 = java.lang.Double.TYPE
            boolean r3 = db.l.a(r2, r3)
            if (r3 == 0) goto L_0x00a5
            r3 = 1
            goto L_0x00ab
        L_0x00a5:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            boolean r3 = db.l.a(r2, r3)
        L_0x00ab:
            if (r3 == 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            double r3 = r12.getDouble(r1)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0092
        L_0x00bb:
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r3 = db.l.a(r2, r3)
            if (r3 == 0) goto L_0x00c5
            r3 = 1
            goto L_0x00cb
        L_0x00c5:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r3 = db.l.a(r2, r3)
        L_0x00cb:
            if (r3 == 0) goto L_0x00db
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            long r3 = r12.getLong(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0092
        L_0x00db:
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r3 = db.l.a(r2, r3)
            if (r3 == 0) goto L_0x00e5
            r3 = 1
            goto L_0x00eb
        L_0x00e5:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            boolean r3 = db.l.a(r2, r3)
        L_0x00eb:
            if (r3 == 0) goto L_0x00fc
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            double r3 = r12.getDouble(r1)
            float r3 = (float) r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0092
        L_0x00fc:
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = db.l.a(r2, r3)
            if (r3 == 0) goto L_0x0106
            r3 = 1
            goto L_0x010c
        L_0x0106:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            boolean r3 = db.l.a(r2, r3)
        L_0x010c:
            if (r3 == 0) goto L_0x011d
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            int r3 = r12.getInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0092
        L_0x011d:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r3 = db.l.a(r2, r3)
            if (r3 == 0) goto L_0x0127
            r3 = 1
            goto L_0x012d
        L_0x0127:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            boolean r3 = db.l.a(r2, r3)
        L_0x012d:
            if (r3 == 0) goto L_0x013e
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            boolean r3 = r12.getBoolean(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0092
        L_0x013e:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r5 = db.l.a(r2, r3)
            if (r5 == 0) goto L_0x0147
            goto L_0x014b
        L_0x0147:
            boolean r7 = db.l.a(r2, r3)
        L_0x014b:
            if (r7 == 0) goto L_0x0089
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.data
            db.l.d(r1, r4)
            java.lang.String r3 = r12.getString(r1)
            goto L_0x0092
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.common.modeling.g.initializeFromJson(org.json.JSONObject):void");
    }

    public final void initializeFromModel(String str, g gVar) {
        db.l.e(gVar, "model");
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry next : gVar.data.entrySet()) {
            if (next.getValue() instanceof g) {
                Object value = next.getValue();
                db.l.c(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                g gVar2 = (g) value;
                gVar2._parentModel = this;
                db.l.d(synchronizedMap, "newData");
                synchronizedMap.put(next.getKey(), gVar2);
            } else {
                db.l.d(synchronizedMap, "newData");
                synchronizedMap.put(next.getKey(), next.getValue());
            }
        }
        if (str != null) {
            db.l.d(synchronizedMap, "newData");
            synchronizedMap.put("id", str);
        }
        synchronized (this.initializationLock) {
            this.data.clear();
            Map<String, Object> map = this.data;
            db.l.d(synchronizedMap, "newData");
            map.putAll(synchronizedMap);
            t tVar = t.f15300a;
        }
    }

    public final void setAnyProperty(String str, Object obj, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(obj, FirebaseAnalytics.Param.VALUE);
        db.l.e(str2, "tag");
        setOptAnyProperty(str, obj, str2, z10);
    }

    public final void setBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(bigDecimal, FirebaseAnalytics.Param.VALUE);
        db.l.e(str2, "tag");
        setOptBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public final void setBooleanProperty(String str, boolean z10, String str2, boolean z11) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptBooleanProperty(str, Boolean.valueOf(z10), str2, z11);
    }

    public final void setDoubleProperty(String str, double d10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptDoubleProperty(str, Double.valueOf(d10), str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String str, T t10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(t10, FirebaseAnalytics.Param.VALUE);
        db.l.e(str2, "tag");
        setOptAnyProperty(str, t10.toString(), str2, z10);
    }

    public final void setFloatProperty(String str, float f10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptFloatProperty(str, Float.valueOf(f10), str2, z10);
    }

    public final void setId(String str) {
        db.l.e(str, FirebaseAnalytics.Param.VALUE);
        setStringProperty$default(this, "id", str, (String) null, false, 12, (Object) null);
    }

    public final void setIntProperty(String str, int i10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptIntProperty(str, Integer.valueOf(i10), str2, z10);
    }

    public final <T> void setListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(list, FirebaseAnalytics.Param.VALUE);
        db.l.e(str2, "tag");
        setOptListProperty(str, list, str2, z10);
    }

    public final void setLongProperty(String str, long j10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptLongProperty(str, Long.valueOf(j10), str2, z10);
    }

    public final <T> void setMapModelProperty(String str, f fVar, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(fVar, FirebaseAnalytics.Param.VALUE);
        db.l.e(str2, "tag");
        setOptMapModelProperty(str, fVar, str2, z10);
    }

    public final void setOptAnyProperty(String str, Object obj, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        synchronized (this.data) {
            Object obj2 = this.data.get(str);
            if (!db.l.a(obj2, obj) || z10) {
                if (obj != null) {
                    this.data.put(str, obj);
                } else if (this.data.containsKey(str)) {
                    this.data.remove(str);
                }
                notifyChanged(str, str, str2, obj2, obj);
                t tVar = t.f15300a;
            }
        }
    }

    public final void setOptBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, bigDecimal != null ? bigDecimal.toString() : null, str2, z10);
    }

    public final void setOptBooleanProperty(String str, Boolean bool, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, bool, str2, z10);
    }

    public final void setOptDoubleProperty(String str, Double d10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, d10, str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String str, T t10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, t10 != null ? t10.toString() : null, str2, z10);
    }

    public final void setOptFloatProperty(String str, Float f10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, f10, str2, z10);
    }

    public final void setOptIntProperty(String str, Integer num, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, num, str2, z10);
    }

    public final <T> void setOptListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, list, str2, z10);
    }

    public final void setOptLongProperty(String str, Long l10, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, l10, str2, z10);
    }

    public final <T> void setOptMapModelProperty(String str, f fVar, String str2, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, "tag");
        setOptAnyProperty(str, fVar, str2, z10);
    }

    public final void setOptStringProperty(String str, String str2, String str3, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str3, "tag");
        setOptAnyProperty(str, str2, str3, z10);
    }

    public final void setStringProperty(String str, String str2, String str3, boolean z10) {
        db.l.e(str, "name");
        db.l.e(str2, FirebaseAnalytics.Param.VALUE);
        db.l.e(str3, "tag");
        setOptStringProperty(str, str2, str3, z10);
    }

    public void subscribe(a aVar) {
        db.l.e(aVar, "handler");
        this.changeNotifier.subscribe(aVar);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject;
        String str;
        synchronized (this.initializationLock) {
            jSONObject = new JSONObject();
            for (Map.Entry next : this.data.entrySet()) {
                Object value = next.getValue();
                if (value instanceof g) {
                    str = (String) next.getKey();
                    value = ((g) value).toJSON();
                } else if (value instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object next2 : (List) value) {
                        if (next2 instanceof g) {
                            next2 = ((g) next2).toJSON();
                        }
                        jSONArray.put(next2);
                    }
                    jSONObject.put((String) next.getKey(), jSONArray);
                } else {
                    str = (String) next.getKey();
                }
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public void unsubscribe(a aVar) {
        db.l.e(aVar, "handler");
        this.changeNotifier.unsubscribe(aVar);
    }

    public g(g gVar, String str, Object obj) {
        db.l.e(obj, "initializationLock");
        this._parentModel = gVar;
        this._parentProperty = str;
        this.initializationLock = obj;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        db.l.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.data = synchronizedMap;
        this.changeNotifier = new b();
        g gVar2 = this._parentModel;
        if (gVar2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        } else if (gVar2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(g gVar, String str, Object obj, int i10, db.g gVar2) {
        this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? new Object() : obj);
    }
}
