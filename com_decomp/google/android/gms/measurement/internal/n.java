package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class n extends h5 {

    /* renamed from: c  reason: collision with root package name */
    private long f6219c;

    /* renamed from: d  reason: collision with root package name */
    private String f6220d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f6221e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f6222f;

    /* renamed from: g  reason: collision with root package name */
    private long f6223g;

    n(n4 n4Var) {
        super(n4Var);
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        Calendar instance = Calendar.getInstance();
        this.f6219c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f6220d = sb2.toString();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long o() {
        h();
        return this.f6223g;
    }

    public final long p() {
        k();
        return this.f6219c;
    }

    public final String q() {
        k();
        return this.f6220d;
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        h();
        this.f6222f = null;
        this.f6223g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        h();
        long currentTimeMillis = this.f5994a.e().currentTimeMillis();
        if (currentTimeMillis - this.f6223g > 86400000) {
            this.f6222f = null;
        }
        Boolean bool = this.f6222f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(this.f5994a.c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f5994a.d().y().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f6221e == null) {
                this.f6221e = AccountManager.get(this.f5994a.c());
            }
            try {
                Account[] result = this.f6221e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f6221e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f6222f = Boolean.TRUE;
                        this.f6223g = currentTimeMillis;
                        return true;
                    }
                } else {
                    this.f6222f = Boolean.TRUE;
                    this.f6223g = currentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.f5994a.d().t().b("Exception checking account types", e10);
            }
        }
        this.f6223g = currentTimeMillis;
        this.f6222f = Boolean.FALSE;
        return false;
    }
}
