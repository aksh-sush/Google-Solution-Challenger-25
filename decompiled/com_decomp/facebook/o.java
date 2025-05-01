package com.facebook;

import android.content.Intent;
import db.l;
import e2.d;

public interface o {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f4928a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4929b;

        /* renamed from: c  reason: collision with root package name */
        private final Intent f4930c;

        public a(int i10, int i11, Intent intent) {
            this.f4928a = i10;
            this.f4929b = i11;
            this.f4930c = intent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4928a == aVar.f4928a && this.f4929b == aVar.f4929b && l.a(this.f4930c, aVar.f4930c);
        }

        public int hashCode() {
            int i10 = ((this.f4928a * 31) + this.f4929b) * 31;
            Intent intent = this.f4930c;
            return i10 + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f4928a + ", resultCode=" + this.f4929b + ", data=" + this.f4930c + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f4931a = new b();

        private b() {
        }

        public static final o a() {
            return new d();
        }
    }

    boolean a(int i10, int i11, Intent intent);
}
