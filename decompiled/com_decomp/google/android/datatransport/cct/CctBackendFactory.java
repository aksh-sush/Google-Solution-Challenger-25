package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import u2.d;
import u2.h;
import u2.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
