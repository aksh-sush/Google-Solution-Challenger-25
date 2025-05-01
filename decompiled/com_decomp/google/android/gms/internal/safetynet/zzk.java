package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import i4.a;
import i4.b;
import i4.c;
import i4.d;
import i4.e;
import i4.g;
import i4.j;
import i4.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzk implements e {
    private static final String TAG = "zzk";

    static class zza implements e.b {
        private final Status zzad;
        private final g zzae;

        public zza(Status status, g gVar) {
            this.zzad = status;
            this.zzae = gVar;
        }

        public final String getJwsResult() {
            g gVar = this.zzae;
            if (gVar == null) {
                return null;
            }
            return gVar.getJwsResult();
        }

        public final Status getStatus() {
            return this.zzad;
        }
    }

    static abstract class zzb extends zzf<e.b> {
        protected zzg zzaf = new zzs(this);

        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ h createFailedResult(Status status) {
            return new zza(status, (g) null);
        }
    }

    static abstract class zzc extends zzf<e.c> {
        protected zzg zzaf = new zzt(this);

        public zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ h createFailedResult(Status status) {
            return new zzj(status, false);
        }
    }

    static abstract class zzd extends zzf<Object> {
        protected final zzg zzaf = new zzu(this);

        public zzd(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ h createFailedResult(Status status) {
            return new zzg(status, (j) null);
        }
    }

    static abstract class zze extends zzf<Object> {
        protected zzg zzaf = new zzv(this);

        public zze(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ h createFailedResult(Status status) {
            return new zzh(status, (l) null);
        }
    }

    static abstract class zzf extends zzf<Object> {
        protected zzg zzaf = new zzw(this);

        public zzf(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ h createFailedResult(Status status) {
            return new zzi(status, (b) null);
        }
    }

    static class zzg implements h {
        private final Status zzad;
        private final j zzal;

        public zzg(Status status, j jVar) {
            this.zzad = status;
            this.zzal = jVar;
        }

        public final List<a> getHarmfulAppsList() {
            j jVar = this.zzal;
            return jVar == null ? Collections.emptyList() : Arrays.asList(jVar.f11315f);
        }

        public final int getHoursSinceLastScanWithHarmfulApp() {
            j jVar = this.zzal;
            if (jVar == null) {
                return -1;
            }
            return jVar.f11316g;
        }

        public final long getLastScanTimeMs() {
            j jVar = this.zzal;
            if (jVar == null) {
                return 0;
            }
            return jVar.f11314e;
        }

        public final Status getStatus() {
            return this.zzad;
        }
    }

    static class zzh implements h {
        private final Status zzad;
        private final l zzam;

        public zzh(Status status, l lVar) {
            this.zzad = status;
            this.zzam = lVar;
        }

        public final Status getStatus() {
            return this.zzad;
        }

        public final String getTokenResult() {
            l lVar = this.zzam;
            if (lVar == null) {
                return null;
            }
            return lVar.U();
        }
    }

    public static class zzi implements h {
        private Status zzad;
        private final b zzan;
        private String zzm = null;
        private long zzp;
        private byte[] zzq;

        public zzi(Status status, b bVar) {
            this.zzad = status;
            this.zzan = bVar;
            if (bVar != null) {
                this.zzm = bVar.X();
                this.zzp = bVar.W();
                this.zzq = bVar.j0();
            } else if (status.j0()) {
                this.zzad = new Status(8);
            }
        }

        public final List<c> getDetectedThreats() {
            ArrayList arrayList = new ArrayList();
            if (this.zzm == null) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONObject(this.zzm).getJSONArray("matches");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(new c(Integer.parseInt(jSONArray.getJSONObject(i10).getString("threat_type"))));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
            return arrayList;
        }

        public final long getLastUpdateTimeMs() {
            return this.zzp;
        }

        public final String getMetadata() {
            return this.zzm;
        }

        public final byte[] getState() {
            return this.zzq;
        }

        public final Status getStatus() {
            return this.zzad;
        }
    }

    static class zzj implements e.c {
        private Status zzad;
        private boolean zzao;

        public zzj() {
        }

        public zzj(Status status, boolean z10) {
            this.zzad = status;
            this.zzao = z10;
        }

        public final Status getStatus() {
            return this.zzad;
        }

        public final boolean isVerifyAppsEnabled() {
            Status status = this.zzad;
            if (status == null || !status.j0()) {
                return false;
            }
            return this.zzao;
        }
    }

    public static PendingResult zza(GoogleApiClient googleApiClient, String str, int i10, String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return googleApiClient.f(new zzn(googleApiClient, iArr, i10, str, str2));
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }

    public PendingResult attest(GoogleApiClient googleApiClient, byte[] bArr) {
        return zza(googleApiClient, bArr, (String) null);
    }

    public PendingResult enableVerifyApps(GoogleApiClient googleApiClient) {
        return googleApiClient.f(new zzp(this, googleApiClient));
    }

    public PendingResult isVerifyAppsEnabled(GoogleApiClient googleApiClient) {
        return googleApiClient.f(new zzo(this, googleApiClient));
    }

    public PendingResult listHarmfulApps(GoogleApiClient googleApiClient) {
        return googleApiClient.f(new zzq(this, googleApiClient));
    }

    public PendingResult lookupUri(GoogleApiClient googleApiClient, String str, String str2, int... iArr) {
        return zza(googleApiClient, str, 1, str2, iArr);
    }

    public PendingResult verifyWithRecaptcha(GoogleApiClient googleApiClient, String str) {
        if (!TextUtils.isEmpty(str)) {
            return googleApiClient.f(new zzr(this, googleApiClient, str));
        }
        throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
    }

    public static PendingResult zza(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        return googleApiClient.f(new zzl(googleApiClient, bArr, str));
    }

    public boolean isVerifyAppsEnabled(Context context) {
        GoogleApiClient d10 = new GoogleApiClient.a(context).a(d.f11310c).d();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            boolean z10 = false;
            if (d10.d(3, timeUnit).j0()) {
                e.c cVar = (e.c) isVerifyAppsEnabled(d10).await(3, timeUnit);
                if (cVar != null && cVar.isVerifyAppsEnabled()) {
                    z10 = true;
                }
                d10.disconnect();
                return z10;
            }
            d10.disconnect();
            return false;
        } catch (Throwable th) {
            if (d10 != null) {
                d10.disconnect();
            }
            throw th;
        }
    }

    public PendingResult lookupUri(GoogleApiClient googleApiClient, List<Integer> list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return googleApiClient.f(new zzm(this, googleApiClient, list, str, (String) null));
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }
}
