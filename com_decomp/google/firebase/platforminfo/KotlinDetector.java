package com.google.firebase.platforminfo;

import sa.f;

public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return f.f15286j.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
