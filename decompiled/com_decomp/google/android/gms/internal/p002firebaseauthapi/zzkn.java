package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkn  reason: invalid package */
public final class zzkn {
    public static int zza(EllipticCurve ellipticCurve) {
        return (zzb(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger zzb(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static BigInteger zzc(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger zzb = zzb(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zzb);
        if (zzb.signum() == 1) {
            BigInteger mod2 = mod.mod(zzb);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!zzb.testBit(0) || !zzb.testBit(1)) {
                    if (zzb.testBit(0) && !zzb.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = zzb.subtract(bigInteger3).shiftRight(1);
                        int i10 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(zzb);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, zzb);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(zzb)) {
                                BigInteger shiftRight2 = zzb.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(zzb).multiply(mod3)).mod(zzb);
                                    BigInteger mod4 = multiply.add(multiply).mod(zzb);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(zzb);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(zzb);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i10++;
                                if (i10 == 128 && !zzb.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(zzb.add(BigInteger.ONE).shiftRight(2), zzb);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(zzb).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z10 != bigInteger3.testBit(0) ? zzb.subtract(bigInteger3).mod(zzb) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    static void zzd(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger zzb = zzb(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(zzb) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(zzb) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(zzb).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(zzb))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static ECPublicKey zze(int i10, byte[] bArr, byte[] bArr2) {
        ECParameterSpec zzf = zzf(i10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        zzd(eCPoint, zzf.getCurve());
        return (ECPublicKey) zzkp.zzg.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, zzf));
    }

    public static ECParameterSpec zzf(int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str2 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
            str3 = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str4 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str5 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
        } else if (i11 != 1) {
            str = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str2 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
            str3 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str4 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str5 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
        } else {
            str = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str2 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
            str3 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str4 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str5 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
        }
        return zzg(str3, str4, str5, str, str2);
    }

    private static ECParameterSpec zzg(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
