package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.firebase_messaging.zzl;
import com.google.android.gms.internal.firebase_messaging.zzm;
import com.google.android.gms.internal.firebase_messaging.zzt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import n4.i;
import n4.l;

class g0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f8400e;

    /* renamed from: f  reason: collision with root package name */
    private i f8401f;

    /* renamed from: g  reason: collision with root package name */
    private volatile InputStream f8402g;

    private g0(URL url) {
        this.f8400e = url;
    }

    private byte[] c() {
        URLConnection openConnection = this.f8400e.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f8402g = inputStream;
                byte[] zza = zzl.zza(zzl.zzb(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(Constants.TAG, 2)) {
                    String valueOf = String.valueOf(this.f8400e);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(zza.length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v(Constants.TAG, sb2.toString());
                }
                if (zza.length <= 1048576) {
                    return zza;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                zzt.zza(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static g0 g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new g0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w(Constants.TAG, valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public Bitmap a() {
        String valueOf = String.valueOf(this.f8400e);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i(Constants.TAG, sb2.toString());
        byte[] c10 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c10, 0, c10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                String valueOf2 = String.valueOf(this.f8400e);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf2);
                Log.d(Constants.TAG, sb3.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f8400e);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 24);
        sb4.append("Failed to decode image: ");
        sb4.append(valueOf3);
        throw new IOException(sb4.toString());
    }

    public void close() {
        try {
            zzm.zza(this.f8402g);
        } catch (NullPointerException e10) {
            Log.e(Constants.TAG, "Failed to close the image download stream.", e10);
        }
    }

    public i h() {
        return (i) s.k(this.f8401f);
    }

    public void n(Executor executor) {
        this.f8401f = l.c(executor, new f0(this));
    }
}
