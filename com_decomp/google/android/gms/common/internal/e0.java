package com.google.android.gms.common.internal;

import a4.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.g;
import androidx.core.os.f;
import java.util.Locale;
import p3.c;
import q3.n;
import q3.q;
import y3.i;

public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final g f5619a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f5620b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(c.f14430g);
    }

    public static String c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : c.f14424a : c.f14433j : c.f14427d);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(c.f14428e, new Object[]{a10});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(c.f14425b, new Object[]{a10});
            } else if (i10 == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i10 == 7) {
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(c.f14432i, new Object[]{a10});
                } else if (i10 == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i10) {
                        case 16:
                            return h(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return h(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(c.f14436m, new Object[]{a10});
                        default:
                            return resources.getString(q.f14697a, new Object[]{a10});
                    }
                }
            }
        } else if (i.d(context)) {
            return resources.getString(c.f14437n);
        } else {
            return resources.getString(c.f14434k, new Object[]{a10});
        }
    }

    public static String e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i10);
    }

    public static String f(Context context, int i10) {
        String i11 = i10 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i10);
        return i11 == null ? context.getResources().getString(c.f14431h) : i11;
    }

    public static String g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(c.f14429f);
            case 2:
                return resources.getString(c.f14435l);
            case 3:
                return resources.getString(c.f14426c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                str = sb2.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(q.f14697a);
        }
        return String.format(resources.getConfiguration().locale, i10, new Object[]{str2});
    }

    private static String i(Context context, String str) {
        g gVar = f5619a;
        synchronized (gVar) {
            Locale d10 = f.a(context.getResources().getConfiguration()).d(0);
            if (!d10.equals(f5620b)) {
                gVar.clear();
                f5620b = d10;
            }
            String str2 = (String) gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources f10 = n.f(context);
            if (f10 == null) {
                return null;
            }
            int identifier = f10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = f10.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
