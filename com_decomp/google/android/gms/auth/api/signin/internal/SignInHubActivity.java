package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import o3.p;
import o3.x;

@KeepName
public class SignInHubActivity extends e {

    /* renamed from: j  reason: collision with root package name */
    private static boolean f5177j = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5178e = false;

    /* renamed from: f  reason: collision with root package name */
    private SignInConfiguration f5179f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5180g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f5181h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Intent f5182i;

    private final void x() {
        getSupportLoaderManager().c(0, (Bundle) null, new a(this, (x) null));
        f5177j = false;
    }

    private final void y(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5177j = false;
    }

    private final void z(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f5179f);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5178e = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            y(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f5178e) {
            setResult(0);
            if (i10 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.U() != null) {
                        GoogleSignInAccount U = signInAccount.U();
                        p a10 = p.a(this);
                        GoogleSignInOptions U2 = this.f5179f.U();
                        U.getClass();
                        a10.c(U2, U);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", U);
                        this.f5180g = true;
                        this.f5181h = i11;
                        this.f5182i = intent;
                        x();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        y(intExtra);
                        return;
                    }
                }
                y(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            y(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f5179f = signInConfiguration;
            if (bundle != null) {
                boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
                this.f5180g = z10;
                if (z10) {
                    this.f5181h = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.f5182i = intent2;
                    x();
                }
            } else if (f5177j) {
                setResult(0);
                y(12502);
            } else {
                f5177j = true;
                z(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f5177j = false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5180g);
        if (this.f5180g) {
            bundle.putInt("signInResultCode", this.f5181h);
            bundle.putParcelable("signInResultData", this.f5182i);
        }
    }
}
