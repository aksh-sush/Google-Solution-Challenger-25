package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final boolean f4550e = false;

    /* renamed from: f, reason: collision with root package name */
    final Handler f4551f = null;

    /* renamed from: g, reason: collision with root package name */
    c.a f4552g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0078b extends a.AbstractBinderC0076a {
        BinderC0078b() {
        }

        @Override // c.a
        public void V(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4551f;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final int f4554e;

        /* renamed from: f, reason: collision with root package name */
        final Bundle f4555f;

        c(int i10, Bundle bundle) {
            this.f4554e = i10;
            this.f4555f = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f4554e, this.f4555f);
        }
    }

    b(Parcel parcel) {
        this.f4552g = a.AbstractBinderC0076a.c(parcel.readStrongBinder());
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f4552g == null) {
                this.f4552g = new BinderC0078b();
            }
            parcel.writeStrongBinder(this.f4552g.asBinder());
        }
    }
}