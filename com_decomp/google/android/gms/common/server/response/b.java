package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;
import s3.d;

public abstract class b extends a implements d {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0089a next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                if (!aVar.isFieldSet(next) || !q.b(getFieldValue(next), aVar.getFieldValue(next))) {
                    return false;
                }
            } else if (aVar.isFieldSet(next)) {
                return false;
            }
        }
        return true;
    }

    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (a.C0089a next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                i10 = (i10 * 31) + s.k(getFieldValue(next)).hashCode();
            }
        }
        return i10;
    }

    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
