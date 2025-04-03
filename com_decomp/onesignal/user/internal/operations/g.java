package com.onesignal.user.internal.operations;

import cb.a;
import db.l;
import java.math.BigDecimal;

public final class g extends com.onesignal.common.modeling.g {
    public g() {
        super((com.onesignal.common.modeling.g) null, (String) null, (Object) null, 7, (db.g) null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        com.onesignal.common.modeling.g.setBigDecimalProperty$default(this, "amount", bigDecimal, (String) null, false, 12, (Object) null);
    }

    private final void setIso(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "iso", str, (String) null, false, 12, (Object) null);
    }

    private final void setSku(String str) {
        com.onesignal.common.modeling.g.setStringProperty$default(this, "sku", str, (String) null, false, 12, (Object) null);
    }

    public final BigDecimal getAmount() {
        return com.onesignal.common.modeling.g.getBigDecimalProperty$default(this, "amount", (a) null, 2, (Object) null);
    }

    public final String getIso() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "iso", (a) null, 2, (Object) null);
    }

    public final String getSku() {
        return com.onesignal.common.modeling.g.getStringProperty$default(this, "sku", (a) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, BigDecimal bigDecimal) {
        this();
        l.e(str, "sku");
        l.e(str2, "iso");
        l.e(bigDecimal, "amount");
        setSku(str);
        setIso(str2);
        setAmount(bigDecimal);
    }
}
