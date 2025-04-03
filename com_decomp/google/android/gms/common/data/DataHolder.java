package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import s3.c;

@KeepName
public final class DataHolder extends s3.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final a f5563o = new a(new String[0], (String) null);

    /* renamed from: e  reason: collision with root package name */
    final int f5564e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f5565f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f5566g;

    /* renamed from: h  reason: collision with root package name */
    private final CursorWindow[] f5567h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5568i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f5569j;

    /* renamed from: k  reason: collision with root package name */
    int[] f5570k;

    /* renamed from: l  reason: collision with root package name */
    int f5571l;

    /* renamed from: m  reason: collision with root package name */
    boolean f5572m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5573n = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f5574a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList f5575b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final HashMap f5576c = new HashMap();

        /* synthetic */ a(String[] strArr, String str, r3.a aVar) {
            this.f5574a = (String[]) s.k(strArr);
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f5564e = i10;
        this.f5565f = strArr;
        this.f5567h = cursorWindowArr;
        this.f5568i = i11;
        this.f5569j = bundle;
    }

    public Bundle U() {
        return this.f5569j;
    }

    public int V() {
        return this.f5568i;
    }

    public boolean W() {
        boolean z10;
        synchronized (this) {
            z10 = this.f5572m;
        }
        return z10;
    }

    public final void X() {
        this.f5566g = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f5565f;
            if (i11 >= strArr.length) {
                break;
            }
            this.f5566g.putInt(strArr[i11], i11);
            i11++;
        }
        this.f5570k = new int[this.f5567h.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f5567h;
            if (i10 < cursorWindowArr.length) {
                this.f5570k[i10] = i12;
                i12 += this.f5567h[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
                i10++;
            } else {
                this.f5571l = i12;
                return;
            }
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.f5572m) {
                this.f5572m = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f5567h;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f5573n && this.f5567h.length > 0 && !W()) {
                close();
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
                Log.e("DataBuffer", sb2.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.E(parcel, 1, this.f5565f, false);
        c.G(parcel, 2, this.f5567h, i10, false);
        c.t(parcel, 3, V());
        c.j(parcel, 4, U(), false);
        c.t(parcel, 1000, this.f5564e);
        c.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
