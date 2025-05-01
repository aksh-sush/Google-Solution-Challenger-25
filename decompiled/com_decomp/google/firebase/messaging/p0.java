package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import java.util.regex.Pattern;

final class p0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f8440d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f8441a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8442b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8443c;

    private p0(String str, String str2) {
        this.f8441a = d(str2, str);
        this.f8442b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f8443c = sb2.toString();
    }

    static p0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new p0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f8440d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public static p0 f(String str) {
        return new p0("S", str);
    }

    public static p0 g(String str) {
        return new p0("U", str);
    }

    public String b() {
        return this.f8442b;
    }

    public String c() {
        return this.f8441a;
    }

    public String e() {
        return this.f8443c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f8441a.equals(p0Var.f8441a) && this.f8442b.equals(p0Var.f8442b);
    }

    public int hashCode() {
        return q.c(this.f8442b, this.f8441a);
    }
}
