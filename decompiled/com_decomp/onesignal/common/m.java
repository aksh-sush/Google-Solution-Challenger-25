package com.onesignal.common;

public final class m {
    public static final m INSTANCE = new m();
    private static String sdkType;
    private static String sdkVersion;

    private m() {
    }

    public static final String getSdkType() {
        return sdkType;
    }

    public static /* synthetic */ void getSdkType$annotations() {
    }

    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final void setSdkType(String str) {
        sdkType = str;
    }

    public static final void setSdkVersion(String str) {
        sdkVersion = str;
    }
}
