package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

public final class g implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public g(double d10, double d11) {
        this.mAmplitude = d10;
        this.mFrequency = d11;
    }

    public float getInterpolation(float f10) {
        return (float) ((((double) -1) * Math.pow(2.718281828459045d, ((double) (-f10)) / this.mAmplitude) * Math.cos(this.mFrequency * ((double) f10))) + ((double) 1));
    }
}
