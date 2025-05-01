package com.google.gson.internal;

import com.google.gson.a;
import com.google.gson.b;
import java.util.Collections;
import java.util.List;

public final class Excluder implements b, Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Excluder f8501j = new Excluder();

    /* renamed from: e  reason: collision with root package name */
    private double f8502e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    private int f8503f = 136;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8504g = true;

    /* renamed from: h  reason: collision with root package name */
    private List f8505h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    private List f8506i = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$1  reason: invalid class name */
    class AnonymousClass1 extends a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
