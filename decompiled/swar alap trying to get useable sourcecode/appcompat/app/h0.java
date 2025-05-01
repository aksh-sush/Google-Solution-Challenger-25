package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.util.Calendar;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: d, reason: collision with root package name */
    private static h0 f494d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f495a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f496b;

    /* renamed from: c, reason: collision with root package name */
    private final a f497c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f498a;

        /* renamed from: b, reason: collision with root package name */
        long f499b;

        a() {
        }
    }

    h0(Context context, LocationManager locationManager) {
        this.f495a = context;
        this.f496b = locationManager;
    }

    static h0 a(Context context) {
        if (f494d == null) {
            Context applicationContext = context.getApplicationContext();
            f494d = new h0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f494d;
    }

    private Location b() {
        Location c10 = androidx.core.content.c.b(this.f495a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.c.b(this.f495a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f496b.isProviderEnabled(str)) {
                return this.f496b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f497c.f499b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f497c;
        long currentTimeMillis = System.currentTimeMillis();
        g0 b10 = g0.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f418c == 1;
        long j11 = b10.f417b;
        long j12 = b10.f416a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b10.f417b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS;
        }
        aVar.f498a = z10;
        aVar.f499b = j10;
    }

    boolean d() {
        a aVar = this.f497c;
        if (e()) {
            return aVar.f498a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f498a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}