package Console;

import android.support.v4.media.session.Log;
import detector.BitMatrix;
import encoders.ByteVector;
import encoders.ErrorCorrection;
import encoders.HighLevelEncoder;
import encoders.SymbolInfo;
import encoders.SymbolShapeHint;
import java.util.Map;
import su.ByteMatrix;
import zxing.BarcodeFormat;
import zxing.EncodeHintType;
import zxing.Writer;

public final class DataMatrixWriter
  implements Writer
{
  public DataMatrixWriter() {}
  
  private static BitMatrix encodeLowLevel(ByteVector paramByteVector, SymbolInfo paramSymbolInfo, int paramInt1, int paramInt2)
  {
    int i1 = paramSymbolInfo.getSymbolDataHeight();
    int i2 = paramSymbolInfo.getSymbolDataWidth();
    ByteMatrix localByteMatrix = new ByteMatrix(paramSymbolInfo.getSymbolHeight(), paramSymbolInfo.getSymbolWidth());
    int j = 0;
    int i = 0;
    while (j < i2)
    {
      int k = i;
      boolean bool;
      if (j % matrixHeight == 0)
      {
        k = 0;
        m = 0;
        while (k < paramSymbolInfo.getSymbolHeight())
        {
          if (k % 2 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          localByteMatrix.set(m, i, bool);
          m += 1;
          k += 1;
        }
        k = i + 1;
      }
      int m = 0;
      i = 0;
      while (m < i1)
      {
        int n = i;
        if (m % matrixWidth == 0)
        {
          localByteMatrix.set(i, k, true);
          n = i + 1;
        }
        localByteMatrix.set(n, k, paramByteVector.add(m, j));
        n += 1;
        int i3 = matrixWidth;
        i = n;
        if (m % i3 == i3 - 1)
        {
          if (j % 2 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          localByteMatrix.set(n, k, bool);
          i = n + 1;
        }
        m += 1;
      }
      m = k + 1;
      k = matrixHeight;
      i = m;
      if (j % k == k - 1)
      {
        i = 0;
        k = 0;
        while (i < paramSymbolInfo.getSymbolHeight())
        {
          localByteMatrix.set(k, m, true);
          k += 1;
          i += 1;
        }
        i = m + 1;
      }
      j += 1;
    }
    return renderResult(localByteMatrix, paramInt1, paramInt2);
  }
  
  private static BitMatrix renderResult(ByteMatrix paramByteMatrix, int paramInt1, int paramInt2)
  {
    int m = paramByteMatrix.getWidth();
    int n = paramByteMatrix.getHeight();
    int i = Math.max(paramInt1, m);
    int j = Math.max(paramInt2, n);
    int i1 = Math.min(i / m, j / n);
    i = (i - m * i1) / 2;
    j = (j - n * i1) / 2;
    BitMatrix localBitMatrix;
    if ((paramInt2 >= n) && (paramInt1 >= m))
    {
      localBitMatrix = new BitMatrix(paramInt1, paramInt2);
      paramInt1 = i;
      paramInt2 = j;
    }
    else
    {
      localBitMatrix = new BitMatrix(m, n);
      paramInt1 = 0;
      paramInt2 = 0;
    }
    localBitMatrix.clear();
    i = 0;
    while (i < n)
    {
      j = paramInt1;
      int k = 0;
      while (k < m)
      {
        if (paramByteMatrix.get(k, i) == 1) {
          localBitMatrix.setRegion(j, paramInt2, i1, i1);
        }
        k += 1;
        j += i1;
      }
      i += 1;
      paramInt2 += i1;
    }
    return localBitMatrix;
  }
  
  public BitMatrix encode(String paramString, BarcodeFormat paramBarcodeFormat, int paramInt1, int paramInt2, Map paramMap)
  {
    if (!paramString.isEmpty())
    {
      if (paramBarcodeFormat == BarcodeFormat.DATA_MATRIX)
      {
        if ((paramInt1 >= 0) && (paramInt2 >= 0))
        {
          paramBarcodeFormat = SymbolShapeHint.FORCE_NONE;
          Object localObject = paramBarcodeFormat;
          if (paramMap != null)
          {
            localObject = (SymbolShapeHint)paramMap.get(EncodeHintType.g);
            if (localObject != null) {
              paramBarcodeFormat = (BarcodeFormat)localObject;
            }
            Log.get(paramMap.get(EncodeHintType.h));
            Log.get(paramMap.get(EncodeHintType.AZTEC_LAYERS));
            localObject = paramBarcodeFormat;
          }
          paramString = HighLevelEncoder.encodeHighLevel(paramString, (SymbolShapeHint)localObject, null, null);
          paramBarcodeFormat = SymbolInfo.lookup(paramString.length(), (SymbolShapeHint)localObject, null, null, true);
          paramString = new ByteVector(ErrorCorrection.encodeECC200(paramString, paramBarcodeFormat), paramBarcodeFormat.getSymbolDataHeight(), paramBarcodeFormat.getSymbolDataWidth());
          paramString.a();
          return encodeLowLevel(paramString, paramBarcodeFormat, paramInt1, paramInt2);
        }
        paramString = new StringBuilder("Requested dimensions can't be negative: ");
        paramString.append(paramInt1);
        paramString.append('x');
        paramString.append(paramInt2);
        throw new IllegalArgumentException(paramString.toString());
      }
      throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(paramBarcodeFormat)));
    }
    throw new IllegalArgumentException("Found empty contents");
  }
}
