package com.google.firebase.platforminfo;

final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8496a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8497b;

    a(String str, String str2) {
        if (str != null) {
            this.f8496a = str;
            if (str2 != null) {
                this.f8497b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f8496a;
    }

    public String c() {
        return this.f8497b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8496a.equals(cVar.b()) && this.f8497b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f8496a.hashCode() ^ 1000003) * 1000003) ^ this.f8497b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f8496a + ", version=" + this.f8497b + "}";
    }
}
