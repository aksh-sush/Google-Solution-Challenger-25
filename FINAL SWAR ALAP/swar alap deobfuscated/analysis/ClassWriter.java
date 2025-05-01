package analysis;

import model.Log;

public final class ClassWriter
{
  public static final ClassWriter b = new ClassWriter();
  
  private ClassWriter() {}
  
  public static final Item a(Item paramItem1, Item paramItem2)
  {
    Log.get(paramItem1, "x");
    Log.get(paramItem2, "w");
    int j = paramItem1.get(0);
    int i = j;
    int i7 = paramItem1.get(1);
    int i8 = paramItem1.get(2);
    int i9 = paramItem2.get(0);
    int i10 = i7 - i9 + 1;
    int i11 = paramItem2.get(2);
    Item localItem = new Item(new int[] { j, i10, i11 });
    float[] arrayOfFloat1 = paramItem1.get();
    float[] arrayOfFloat2 = localItem.get();
    paramItem2 = paramItem2.get();
    if (j > 0)
    {
      j = 0;
      paramItem1 = localItem;
      for (;;)
      {
        int i2 = j + 1;
        if (i11 > 0)
        {
          int i3;
          for (int k = 0;; k = i3)
          {
            i3 = k + 1;
            if (i10 > 0)
            {
              int i4;
              for (int m = 0;; m = i4)
              {
                i4 = m + 1;
                float f2 = 0.0F;
                float f1 = 0.0F;
                if (i9 > 0)
                {
                  int i5;
                  for (int n = 0;; n = i5)
                  {
                    i5 = n + 1;
                    if (i8 > 0)
                    {
                      int i6;
                      for (int i1 = 0;; i1 = i6)
                      {
                        i6 = i1 + 1;
                        f1 += arrayOfFloat1[(i7 * i8 * j + (n + m) * i8 + i1)] * paramItem2[((n * i8 + i1) * i11 + k)];
                        if (i6 >= i8) {
                          break;
                        }
                      }
                    }
                    if (i5 >= i9) {
                      break;
                    }
                  }
                }
                f1 = f2;
                arrayOfFloat2[(i10 * i11 * j + m * i11 + k)] = f1;
                if (i4 >= i10) {
                  break;
                }
              }
            }
            if (i3 >= i11) {
              break;
            }
          }
        }
        if (i2 >= i) {
          return paramItem1;
        }
        j = i2;
      }
    }
    return localItem;
  }
  
  public static final Item a(Item paramItem1, Item paramItem2, Item paramItem3)
  {
    Log.get(paramItem1, "x");
    Log.get(paramItem2, "w");
    Log.get(paramItem3, "b");
    int n = paramItem1.get(0);
    int i1 = paramItem3.get(0);
    paramItem1 = c(paramItem1, paramItem2);
    paramItem2 = paramItem3.get();
    paramItem3 = paramItem1.get();
    if (n > 0)
    {
      int k;
      for (int i = 0;; i = k)
      {
        k = i + 1;
        if (i1 > 0)
        {
          int m;
          for (int j = 0;; j = m)
          {
            m = j + 1;
            int i2 = i * i1 + j;
            paramItem3[i2] += paramItem2[j];
            if (m >= i1) {
              break;
            }
          }
        }
        if (k >= n) {
          return paramItem1;
        }
      }
    }
    return paramItem1;
  }
  
  public static final Item a(Item[] paramArrayOfItem)
  {
    Log.get(paramArrayOfItem, "tensors");
    int i2 = paramArrayOfItem[0].get(0);
    int m = paramArrayOfItem.length - 1;
    int j;
    int k;
    if (m >= 0)
    {
      j = 0;
      i = 0;
      for (;;)
      {
        k = j + 1;
        i += paramArrayOfItem[j].get(1);
        if (k > m) {
          break;
        }
        j = k;
      }
    }
    int i = 0;
    Item localItem = new Item(new int[] { i2, i });
    float[] arrayOfFloat1 = localItem.get();
    if (i2 > 0)
    {
      int n;
      for (j = 0;; j = n)
      {
        n = j + 1;
        k = j * i;
        int i3 = paramArrayOfItem.length - 1;
        if (i3 >= 0)
        {
          int i1;
          for (m = 0;; m = i1)
          {
            i1 = m + 1;
            float[] arrayOfFloat2 = paramArrayOfItem[m].get();
            m = paramArrayOfItem[m].get(1);
            System.arraycopy(arrayOfFloat2, j * m, arrayOfFloat1, k, m);
            k += m;
            if (i1 > i3) {
              break;
            }
          }
        }
        if (n >= i2) {
          return localItem;
        }
      }
    }
    return localItem;
  }
  
  public static final Item a(String[] paramArrayOfString, int paramInt, Item paramItem)
  {
    Log.get(paramArrayOfString, "texts");
    Log.get(paramItem, "w");
    int n = paramArrayOfString.length;
    int i1 = paramItem.get(1);
    Item localItem = new Item(new int[] { n, paramInt, i1 });
    float[] arrayOfFloat = localItem.get();
    paramItem = paramItem.get();
    if (n > 0)
    {
      int k;
      for (int i = 0;; i = k)
      {
        k = i + 1;
        int[] arrayOfInt = Frame.h.a(paramArrayOfString[i], paramInt);
        if (paramInt > 0)
        {
          int m;
          for (int j = 0;; j = m)
          {
            m = j + 1;
            System.arraycopy(paramItem, arrayOfInt[j] * i1, arrayOfFloat, i1 * paramInt * i + j * i1, i1);
            if (m >= paramInt) {
              break;
            }
          }
        }
        if (k >= n) {
          return localItem;
        }
      }
    }
    return localItem;
  }
  
  public static final void a(Item paramItem)
  {
    Log.get(paramItem, "x");
    paramItem = paramItem.get();
    int k = paramItem.length - 1;
    if (k >= 0)
    {
      int j;
      for (int i = 0;; i = j)
      {
        j = i + 1;
        if (paramItem[i] < 0.0F) {
          paramItem[i] = 0.0F;
        }
        if (j > k) {
          return;
        }
      }
    }
  }
  
  public static final void a(Item paramItem, int paramInt)
  {
    Log.get(paramItem, "x");
    if (paramInt >= paramItem.a()) {
      return;
    }
    int m = paramItem.a();
    int i = 1;
    int k = 1;
    int j;
    if (paramInt < m)
    {
      j = paramInt;
      i = k;
      for (;;)
      {
        k = j + 1;
        i *= paramItem.get(j);
        if (k >= m) {
          break;
        }
        j = k;
      }
    }
    int[] arrayOfInt = new int[paramInt + 1];
    if (paramInt > 0) {
      for (j = 0;; j = k)
      {
        k = j + 1;
        arrayOfInt[j] = paramItem.get(j);
        if (k >= paramInt) {
          break;
        }
      }
    }
    arrayOfInt[paramInt] = i;
    paramItem.a(arrayOfInt);
  }
  
  public static final Item add(Item paramItem, int paramInt)
  {
    Log.get(paramItem, "x");
    int i4 = paramItem.get(0);
    int j = paramItem.get(1);
    int i = j;
    int i5 = paramItem.get(2);
    int i6 = j - paramInt + 1;
    Item localItem = new Item(new int[] { i4, i6, i5 });
    paramItem = paramItem.get();
    float[] arrayOfFloat = localItem.get();
    if (i4 > 0)
    {
      int n;
      for (j = 0;; j = n)
      {
        n = j + 1;
        if (i5 > 0)
        {
          int i1;
          for (int k = 0;; k = i1)
          {
            i1 = k + 1;
            if (i6 > 0)
            {
              int i2;
              for (int m = 0;; m = i2)
              {
                i2 = m + 1;
                int i7 = m * i5;
                int i8 = j * i6 * i5 + i7 + k;
                arrayOfFloat[i8] = Float.MIN_VALUE;
                if (paramInt > 0)
                {
                  int i3;
                  for (m = 0;; m = i3)
                  {
                    i3 = m + 1;
                    arrayOfFloat[i8] = Math.max(arrayOfFloat[i8], paramItem[(j * i * i5 + i7 + k + m * i5)]);
                    if (i3 >= paramInt) {
                      break;
                    }
                  }
                }
                if (i2 >= i6) {
                  break;
                }
              }
            }
            if (i1 >= i5) {
              break;
            }
          }
        }
        if (n >= i4) {
          return localItem;
        }
      }
    }
    return localItem;
  }
  
  public static final void add(Item paramItem)
  {
    Log.get(paramItem, "x");
    int i = 0;
    int n = paramItem.get(0);
    int i1 = paramItem.get(1);
    paramItem = paramItem.get();
    if (n > 0) {
      for (;;)
      {
        int k = i + 1;
        i *= i1;
        int i2 = i + i1;
        float f1 = Float.MIN_VALUE;
        float f2 = Float.MIN_VALUE;
        int j;
        int m;
        if (i < i2)
        {
          j = i;
          for (;;)
          {
            m = j + 1;
            f3 = paramItem[j];
            f1 = f2;
            if (f3 > f2) {
              f1 = f3;
            }
            if (m >= i2) {
              break;
            }
            j = m;
            f2 = f1;
          }
        }
        f2 = 0.0F;
        float f3 = 0.0F;
        if (i < i2)
        {
          j = i;
          f2 = f3;
          for (;;)
          {
            m = j + 1;
            f3 = (float)Math.exp(paramItem[j] - f1);
            paramItem[j] = f3;
            f2 += f3;
            if (m >= i2) {
              break;
            }
            j = m;
          }
        }
        if (i < i2) {
          for (;;)
          {
            j = i + 1;
            paramItem[i] /= f2;
            if (j >= i2) {
              break;
            }
            i = j;
          }
        }
        if (k >= n) {
          return;
        }
        i = k;
      }
    }
  }
  
  public static final Item b(Item paramItem)
  {
    Log.get(paramItem, "x");
    int i2 = paramItem.get(0);
    int i3 = paramItem.get(1);
    int i4 = paramItem.get(2);
    Item localItem = new Item(new int[] { i4, i3, i2 });
    paramItem = paramItem.get();
    float[] arrayOfFloat = localItem.get();
    if (i2 > 0)
    {
      int m;
      for (int i = 0;; i = m)
      {
        m = i + 1;
        if (i3 > 0)
        {
          int n;
          for (int j = 0;; j = n)
          {
            n = j + 1;
            if (i4 > 0)
            {
              int i1;
              for (int k = 0;; k = i1)
              {
                i1 = k + 1;
                arrayOfFloat[(k * i2 * i3 + j * i2 + i)] = paramItem[(i * i3 * i4 + j * i4 + k)];
                if (i1 >= i4) {
                  break;
                }
              }
            }
            if (n >= i3) {
              break;
            }
          }
        }
        if (m >= i2) {
          return localItem;
        }
      }
    }
    return localItem;
  }
  
  public static final void b(Item paramItem1, Item paramItem2)
  {
    Log.get(paramItem1, "x");
    Log.get(paramItem2, "b");
    int i2 = paramItem1.get(0);
    int i3 = paramItem1.get(1);
    int i4 = paramItem1.get(2);
    paramItem1 = paramItem1.get();
    paramItem2 = paramItem2.get();
    if (i2 > 0)
    {
      int m;
      for (int i = 0;; i = m)
      {
        m = i + 1;
        if (i3 > 0)
        {
          int n;
          for (int j = 0;; j = n)
          {
            n = j + 1;
            if (i4 > 0)
            {
              int i1;
              for (int k = 0;; k = i1)
              {
                i1 = k + 1;
                int i5 = i * i3 * i4 + j * i4 + k;
                paramItem1[i5] += paramItem2[k];
                if (i1 >= i4) {
                  break;
                }
              }
            }
            if (n >= i3) {
              break;
            }
          }
        }
        if (m >= i2) {
          return;
        }
      }
    }
  }
  
  public static final Item c(Item paramItem1, Item paramItem2)
  {
    Log.get(paramItem1, "x");
    Log.get(paramItem2, "w");
    int i2 = paramItem1.get(0);
    int i3 = paramItem2.get(0);
    int i4 = paramItem2.get(1);
    Item localItem = new Item(new int[] { i2, i4 });
    paramItem1 = paramItem1.get();
    paramItem2 = paramItem2.get();
    float[] arrayOfFloat = localItem.get();
    if (i2 > 0)
    {
      int m;
      for (int i = 0;; i = m)
      {
        m = i + 1;
        if (i4 > 0)
        {
          int n;
          for (int j = 0;; j = n)
          {
            n = j + 1;
            int i5 = i * i4 + j;
            arrayOfFloat[i5] = 0.0F;
            if (i3 > 0)
            {
              int i1;
              for (int k = 0;; k = i1)
              {
                i1 = k + 1;
                arrayOfFloat[i5] += paramItem1[(i * i3 + k)] * paramItem2[(k * i4 + j)];
                if (i1 >= i3) {
                  break;
                }
              }
            }
            if (n >= i4) {
              break;
            }
          }
        }
        if (m >= i2) {
          return localItem;
        }
      }
    }
    return localItem;
  }
  
  public static final Item get(Item paramItem)
  {
    Log.get(paramItem, "x");
    int n = paramItem.get(0);
    int i1 = paramItem.get(1);
    Item localItem = new Item(new int[] { i1, n });
    paramItem = paramItem.get();
    float[] arrayOfFloat = localItem.get();
    if (n > 0)
    {
      int k;
      for (int i = 0;; i = k)
      {
        k = i + 1;
        if (i1 > 0)
        {
          int m;
          for (int j = 0;; j = m)
          {
            m = j + 1;
            arrayOfFloat[(j * n + i)] = paramItem[(i * i1 + j)];
            if (m >= i1) {
              break;
            }
          }
        }
        if (k >= n) {
          return localItem;
        }
      }
    }
    return localItem;
  }
}
