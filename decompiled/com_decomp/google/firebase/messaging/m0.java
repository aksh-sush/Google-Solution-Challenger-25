package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f8420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8421b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8422c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque f8423d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8424e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8425f = false;

    private m0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8420a = sharedPreferences;
        this.f8421b = "topic_operation_queue";
        this.f8422c = ",";
        this.f8424e = executor;
    }

    private boolean c(boolean z10) {
        if (!z10 || this.f8425f) {
            return z10;
        }
        j();
        return true;
    }

    static m0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        m0 m0Var = new m0(sharedPreferences, "topic_operation_queue", ",", executor);
        m0Var.e();
        return m0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r6 = this;
            java.util.ArrayDeque r0 = r6.f8423d
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r6.f8423d     // Catch:{ all -> 0x0049 }
            r1.clear()     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences r1 = r6.f8420a     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r6.f8421b     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0049 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0047
            java.lang.String r2 = r6.f8422c     // Catch:{ all -> 0x0049 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0021
            goto L_0x0047
        L_0x0021:
            java.lang.String r2 = r6.f8422c     // Catch:{ all -> 0x0049 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0049 }
            int r2 = r1.length     // Catch:{ all -> 0x0049 }
            r3 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r5 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0033:
            if (r3 >= r2) goto L_0x0045
            r4 = r1[r3]     // Catch:{ all -> 0x0049 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x0042
            java.util.ArrayDeque r5 = r6.f8423d     // Catch:{ all -> 0x0049 }
            r5.add(r4)     // Catch:{ all -> 0x0049 }
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.m0.e():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void b() {
        synchronized (this.f8423d) {
            this.f8420a.edit().putString(this.f8421b, h()).commit();
        }
    }

    private void j() {
        this.f8424e.execute(new l0(this));
    }

    public boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f8422c)) {
            return false;
        }
        synchronized (this.f8423d) {
            add = this.f8423d.add(str);
            c(add);
        }
        return add;
    }

    public String f() {
        String str;
        synchronized (this.f8423d) {
            str = (String) this.f8423d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean remove;
        synchronized (this.f8423d) {
            remove = this.f8423d.remove(obj);
            c(remove);
        }
        return remove;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f8423d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f8422c);
        }
        return sb2.toString();
    }
}
