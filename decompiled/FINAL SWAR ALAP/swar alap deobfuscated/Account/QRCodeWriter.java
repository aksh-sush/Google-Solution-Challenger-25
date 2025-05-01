package Account;

import decoder.ErrorCorrectionLevel;
import detector.BitMatrix;
import java.util.Map;
import su.ByteMatrix;
import su.Encoder;
import su.QRCode;
import zxing.BarcodeFormat;
import zxing.EncodeHintType;
import zxing.Writer;

public final class QRCodeWriter
  implements Writer
{
  public QRCodeWriter() {}
  
  private static BitMatrix renderResult(QRCode paramQRCode, int paramInt1, int paramInt2, int paramInt3)
  {
    paramQRCode = paramQRCode.getMatrix();
    if (paramQRCode != null)
    {
      int k = paramQRCode.getWidth();
      int m = paramQRCode.getHeight();
      paramInt3 <<= 1;
      int i = k + paramInt3;
      int j = paramInt3 + m;
      paramInt3 = Math.max(paramInt1, i);
      paramInt2 = Math.max(paramInt2, j);
      int n = Math.min(paramInt3 / i, paramInt2 / j);
      j = (paramInt3 - k * n) / 2;
      paramInt1 = (paramInt2 - m * n) / 2;
      BitMatrix localBitMatrix = new BitMatrix(paramInt3, paramInt2);
      paramInt2 = 0;
      while (paramInt2 < m)
      {
        paramInt3 = j;
        i = 0;
        while (i < k)
        {
          if (paramQRCode.get(i, paramInt2) == 1) {
            localBitMatrix.setRegion(paramInt3, paramInt1, n, n);
          }
          i += 1;
          paramInt3 += n;
        }
        paramInt2 += 1;
        paramInt1 += n;
      }
      return localBitMatrix;
    }
    throw new IllegalStateException();
  }
  
  public BitMatrix encode(String paramString, BarcodeFormat paramBarcodeFormat, int paramInt1, int paramInt2, Map paramMap)
  {
    if (!paramString.isEmpty())
    {
      if (paramBarcodeFormat == BarcodeFormat.QR_CODE)
      {
        if ((paramInt1 >= 0) && (paramInt2 >= 0))
        {
          paramBarcodeFormat = ErrorCorrectionLevel.L;
          int j = 4;
          Object localObject = paramBarcodeFormat;
          int i = j;
          if (paramMap != null)
          {
            localObject = EncodeHintType.ERROR_CORRECTION;
            if (paramMap.containsKey(localObject)) {
              paramBarcodeFormat = ErrorCorrectionLevel.valueOf(paramMap.get(localObject).toString());
            }
            EncodeHintType localEncodeHintType = EncodeHintType.CHARACTER_SET;
            localObject = paramBarcodeFormat;
            i = j;
            if (paramMap.containsKey(localEncodeHintType))
            {
              i = Integer.parseInt(paramMap.get(localEncodeHintType).toString());
              localObject = paramBarcodeFormat;
            }
          }
          return renderResult(Encoder.encode(paramString, (ErrorCorrectionLevel)localObject, paramMap), paramInt1, paramInt2, i);
        }
        paramString = new StringBuilder("Requested dimensions are too small: ");
        paramString.append(paramInt1);
        paramString.append('x');
        paramString.append(paramInt2);
        throw new IllegalArgumentException(paramString.toString());
      }
      throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(paramBarcodeFormat)));
    }
    throw new IllegalArgumentException("Found empty contents");
  }
}
