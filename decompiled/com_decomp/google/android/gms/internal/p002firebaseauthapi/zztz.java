package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import me.zhanghai.android.materialprogressbar.R;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztz  reason: invalid package */
public abstract class zztz extends zzb implements zzua {
    public zztz() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zztx zztx = null;
        switch (i10) {
            case 101:
                zzme zzme = (zzme) zzc.zza(parcel, zzme.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface instanceof zztx ? (zztx) queryLocalInterface : new zztv(readStrongBinder);
                }
                zzk(zzme, zztx);
                break;
            case 102:
                zznc zznc = (zznc) zzc.zza(parcel, zznc.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface2 instanceof zztx ? (zztx) queryLocalInterface2 : new zztv(readStrongBinder2);
                }
                zzw(zznc, zztx);
                break;
            case 103:
                zzna zzna = (zzna) zzc.zza(parcel, zzna.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface3 instanceof zztx ? (zztx) queryLocalInterface3 : new zztv(readStrongBinder3);
                }
                zzv(zzna, zztx);
                break;
            case 104:
                zznu zznu = (zznu) zzc.zza(parcel, zznu.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface4 instanceof zztx ? (zztx) queryLocalInterface4 : new zztv(readStrongBinder4);
                }
                zzF(zznu, zztx);
                break;
            case 105:
                zzlo zzlo = (zzlo) zzc.zza(parcel, zzlo.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface5 instanceof zztx ? (zztx) queryLocalInterface5 : new zztv(readStrongBinder5);
                }
                zzc(zzlo, zztx);
                break;
            case 106:
                zzlq zzlq = (zzlq) zzc.zza(parcel, zzlq.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface6 instanceof zztx ? (zztx) queryLocalInterface6 : new zztv(readStrongBinder6);
                }
                zzd(zzlq, zztx);
                break;
            case 107:
                zzlw zzlw = (zzlw) zzc.zza(parcel, zzlw.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface7 instanceof zztx ? (zztx) queryLocalInterface7 : new zztv(readStrongBinder7);
                }
                zzg(zzlw, zztx);
                break;
            case 108:
                zzne zzne = (zzne) zzc.zza(parcel, zzne.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface8 instanceof zztx ? (zztx) queryLocalInterface8 : new zztv(readStrongBinder8);
                }
                zzx(zzne, zztx);
                break;
            case 109:
                zzmg zzmg = (zzmg) zzc.zza(parcel, zzmg.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface9 instanceof zztx ? (zztx) queryLocalInterface9 : new zztv(readStrongBinder9);
                }
                zzl(zzmg, zztx);
                break;
            case 111:
                zzmi zzmi = (zzmi) zzc.zza(parcel, zzmi.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface10 instanceof zztx ? (zztx) queryLocalInterface10 : new zztv(readStrongBinder10);
                }
                zzm(zzmi, zztx);
                break;
            case 112:
                zzmk zzmk = (zzmk) zzc.zza(parcel, zzmk.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface11 instanceof zztx ? (zztx) queryLocalInterface11 : new zztv(readStrongBinder11);
                }
                zzn(zzmk, zztx);
                break;
            case 113:
                zznq zznq = (zznq) zzc.zza(parcel, zznq.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface12 instanceof zztx ? (zztx) queryLocalInterface12 : new zztv(readStrongBinder12);
                }
                zzD(zznq, zztx);
                break;
            case 114:
                zzns zzns = (zzns) zzc.zza(parcel, zzns.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface13 instanceof zztx ? (zztx) queryLocalInterface13 : new zztv(readStrongBinder13);
                }
                zzE(zzns, zztx);
                break;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /*115*/:
                zzmo zzmo = (zzmo) zzc.zza(parcel, zzmo.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface14 instanceof zztx ? (zztx) queryLocalInterface14 : new zztv(readStrongBinder14);
                }
                zzp(zzmo, zztx);
                break;
            case 116:
                zzmy zzmy = (zzmy) zzc.zza(parcel, zzmy.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface15 instanceof zztx ? (zztx) queryLocalInterface15 : new zztv(readStrongBinder15);
                }
                zzu(zzmy, zztx);
                break;
            case 117:
                zzly zzly = (zzly) zzc.zza(parcel, zzly.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface16 instanceof zztx ? (zztx) queryLocalInterface16 : new zztv(readStrongBinder16);
                }
                zzh(zzly, zztx);
                break;
            case 119:
                zzls zzls = (zzls) zzc.zza(parcel, zzls.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface17 instanceof zztx ? (zztx) queryLocalInterface17 : new zztv(readStrongBinder17);
                }
                zze(zzls, zztx);
                break;
            case 120:
                zzlm zzlm = (zzlm) zzc.zza(parcel, zzlm.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface18 instanceof zztx ? (zztx) queryLocalInterface18 : new zztv(readStrongBinder18);
                }
                zzb(zzlm, zztx);
                break;
            case 121:
                zzlu zzlu = (zzlu) zzc.zza(parcel, zzlu.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface19 instanceof zztx ? (zztx) queryLocalInterface19 : new zztv(readStrongBinder19);
                }
                zzf(zzlu, zztx);
                break;
            case 122:
                zzmu zzmu = (zzmu) zzc.zza(parcel, zzmu.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface20 instanceof zztx ? (zztx) queryLocalInterface20 : new zztv(readStrongBinder20);
                }
                zzs(zzmu, zztx);
                break;
            case 123:
                zzni zzni = (zzni) zzc.zza(parcel, zzni.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface21 instanceof zztx ? (zztx) queryLocalInterface21 : new zztv(readStrongBinder21);
                }
                zzz(zzni, zztx);
                break;
            case 124:
                zzmm zzmm = (zzmm) zzc.zza(parcel, zzmm.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface22 instanceof zztx ? (zztx) queryLocalInterface22 : new zztv(readStrongBinder22);
                }
                zzo(zzmm, zztx);
                break;
            case 126:
                zzmq zzmq = (zzmq) zzc.zza(parcel, zzmq.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface23 instanceof zztx ? (zztx) queryLocalInterface23 : new zztv(readStrongBinder23);
                }
                zzq(zzmq, zztx);
                break;
            case 127:
                zzmw zzmw = (zzmw) zzc.zza(parcel, zzmw.CREATOR);
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface24 instanceof zztx ? (zztx) queryLocalInterface24 : new zztv(readStrongBinder24);
                }
                zzt(zzmw, zztx);
                break;
            case 128:
                zzms zzms = (zzms) zzc.zza(parcel, zzms.CREATOR);
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface25 instanceof zztx ? (zztx) queryLocalInterface25 : new zztv(readStrongBinder25);
                }
                zzr(zzms, zztx);
                break;
            case 129:
                zzng zzng = (zzng) zzc.zza(parcel, zzng.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface26 instanceof zztx ? (zztx) queryLocalInterface26 : new zztv(readStrongBinder26);
                }
                zzy(zzng, zztx);
                break;
            case 130:
                zznk zznk = (zznk) zzc.zza(parcel, zznk.CREATOR);
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface27 instanceof zztx ? (zztx) queryLocalInterface27 : new zztv(readStrongBinder27);
                }
                zzA(zznk, zztx);
                break;
            case 131:
                zzno zzno = (zzno) zzc.zza(parcel, zzno.CREATOR);
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface28 instanceof zztx ? (zztx) queryLocalInterface28 : new zztv(readStrongBinder28);
                }
                zzC(zzno, zztx);
                break;
            case 132:
                zzma zzma = (zzma) zzc.zza(parcel, zzma.CREATOR);
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface29 instanceof zztx ? (zztx) queryLocalInterface29 : new zztv(readStrongBinder29);
                }
                zzi(zzma, zztx);
                break;
            case 133:
                zznm zznm = (zznm) zzc.zza(parcel, zznm.CREATOR);
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface30 instanceof zztx ? (zztx) queryLocalInterface30 : new zztv(readStrongBinder30);
                }
                zzB(zznm, zztx);
                break;
            case 134:
                zzmc zzmc = (zzmc) zzc.zza(parcel, zzmc.CREATOR);
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface31 instanceof zztx ? (zztx) queryLocalInterface31 : new zztv(readStrongBinder31);
                }
                zzj(zzmc, zztx);
                break;
            case 135:
                zznw zznw = (zznw) zzc.zza(parcel, zznw.CREATOR);
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    zztx = queryLocalInterface32 instanceof zztx ? (zztx) queryLocalInterface32 : new zztv(readStrongBinder32);
                }
                zzG(zznw, zztx);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
