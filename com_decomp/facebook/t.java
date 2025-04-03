package com.facebook;

import db.g;
import db.l;

public final class t extends v {

    /* renamed from: h  reason: collision with root package name */
    public static final a f4970h = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private final int f4971f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4972g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public t(String str, int i10, String str2) {
        super(str);
        this.f4971f = i10;
        this.f4972g = str2;
    }

    public String toString() {
        String str = "{FacebookDialogException: " + "errorCode: " + this.f4971f + ", message: " + getMessage() + ", url: " + this.f4972g + "}";
        l.d(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
