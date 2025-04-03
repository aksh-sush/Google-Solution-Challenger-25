package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import r2.b;
import t2.f;

public final class a implements f {

    /* renamed from: c  reason: collision with root package name */
    static final String f5040c;

    /* renamed from: d  reason: collision with root package name */
    static final String f5041d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f5042e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set f5043f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final a f5044g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f5045h;

    /* renamed from: a  reason: collision with root package name */
    private final String f5046a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5047b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5040c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f5041d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5042e = a12;
        f5044g = new a(a10, (String) null);
        f5045h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f5046a = str;
        this.f5047b = str2;
    }

    public static a d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set a() {
        return f5043f;
    }

    public byte[] b() {
        return c();
    }

    public byte[] c() {
        String str = this.f5047b;
        if (str == null && this.f5046a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5046a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.f5047b;
    }

    public String f() {
        return this.f5046a;
    }

    public String getName() {
        return "cct";
    }
}
