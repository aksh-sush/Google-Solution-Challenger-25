package com.google.firebase.auth.api.fallback.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirebaseAuthFallbackService extends Service {
    public final synchronized IBinder onBind(Intent intent) {
        if (!"com.google.firebase.auth.api.gms.service.START".equals(intent.getAction())) {
            return null;
        }
        return new a(this, this).asBinder();
    }
}
