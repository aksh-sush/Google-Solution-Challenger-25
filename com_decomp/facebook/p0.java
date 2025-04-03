package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import db.g;
import db.l;
import db.w;
import e2.s0;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

public class p0 extends AsyncTask {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4933d = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f4934e = p0.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f4935a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f4936b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f4937c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var) {
        this((HttpURLConnection) null, q0Var);
        l.e(q0Var, "requests");
    }

    /* renamed from: a */
    public List doInBackground(Void... voidArr) {
        l.e(voidArr, "params");
        try {
            HttpURLConnection httpURLConnection = this.f4935a;
            return httpURLConnection == null ? this.f4936b.h() : m0.f4893n.o(httpURLConnection, this.f4936b);
        } catch (Exception e10) {
            this.f4937c = e10;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(List list) {
        l.e(list, "result");
        super.onPostExecute(list);
        Exception exc = this.f4937c;
        if (exc != null) {
            s0 s0Var = s0.f9663a;
            String str = f4934e;
            w wVar = w.f9429a;
            String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            s0.j0(str, format);
        }
    }

    public void onPreExecute() {
        super.onPreExecute();
        if (i0.D()) {
            s0 s0Var = s0.f9663a;
            String str = f4934e;
            w wVar = w.f9429a;
            String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
            l.d(format, "java.lang.String.format(format, *args)");
            s0.j0(str, format);
        }
        if (this.f4936b.o() == null) {
            this.f4936b.A(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask: " + " connection: " + this.f4935a + ", requests: " + this.f4936b + "}";
        l.d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public p0(HttpURLConnection httpURLConnection, q0 q0Var) {
        l.e(q0Var, "requests");
        this.f4935a = httpURLConnection;
        this.f4936b = q0Var;
    }
}
