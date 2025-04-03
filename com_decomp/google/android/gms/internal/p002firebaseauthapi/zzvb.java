package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
public final class zzvb {
    public static void zza(String str, zzui zzui, zzuz zzuz, Type type, zzum zzum) {
        String str2;
        BufferedOutputStream bufferedOutputStream;
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzui.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzum.zza(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = zzb(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            String sb3 = sb2.toString();
            if (!zzb(responseCode)) {
                zzuz.zza((String) zzuh.zza(sb3, String.class));
                return;
            } else {
                zzuz.zzb((zzuj) zzuh.zza(sb3, type));
                return;
            }
            throw th;
            throw th;
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            zzuz.zza(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            zzuz.zza(str2);
        } catch (zzpz | IOException | JSONException e10) {
            str2 = e10.getMessage();
            zzuz.zza(str2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    private static final boolean zzb(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
