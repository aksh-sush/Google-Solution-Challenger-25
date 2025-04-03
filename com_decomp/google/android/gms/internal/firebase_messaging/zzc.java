package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class zzc implements ObjectEncoder<zze> {
    static final zzc zza = new zzc();
    private static final FieldDescriptor zzb = FieldDescriptor.of("messagingClientEventExtension");

    private zzc() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(zzb, (Object) ((zze) obj).zzc());
    }
}
