package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.core.menu.Label;

abstract class JsonParser
{
  static void disable(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      ComponentName localComponentName = new ComponentName(paramContext, "androidx.appcompat.app.AppLocalesMetadataHolderService");
      if (paramContext.getPackageManager().getComponentEnabledSetting(localComponentName) != 1)
      {
        if (f.b().a())
        {
          String str = parse(paramContext);
          Object localObject = paramContext.getSystemService("locale");
          if (localObject != null) {
            a.setEnabled(localObject, SparseArray.append(str));
          }
        }
        paramContext.getPackageManager().setComponentEnabledSetting(localComponentName, 1, 1);
      }
    }
  }
  
  /* Error */
  static String parse(Context paramContext)
  {
    // Byte code:
    //   0: ldc 85
    //   2: astore 6
    //   4: aload_0
    //   5: ldc 87
    //   7: invokevirtual 91	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   10: astore 8
    //   12: invokestatic 97	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 7
    //   17: aload 7
    //   19: aload 8
    //   21: ldc 99
    //   23: invokeinterface 105 3 0
    //   28: aload 7
    //   30: invokeinterface 109 1 0
    //   35: istore_1
    //   36: aload 7
    //   38: invokeinterface 112 1 0
    //   43: istore_2
    //   44: aload 6
    //   46: astore 5
    //   48: iload_2
    //   49: iconst_1
    //   50: if_icmpeq +69 -> 119
    //   53: iload_2
    //   54: iconst_3
    //   55: if_icmpne +20 -> 75
    //   58: aload 7
    //   60: invokeinterface 109 1 0
    //   65: istore_3
    //   66: aload 6
    //   68: astore 5
    //   70: iload_3
    //   71: iload_1
    //   72: if_icmple +47 -> 119
    //   75: iload_2
    //   76: iconst_3
    //   77: if_icmpeq -41 -> 36
    //   80: iload_2
    //   81: iconst_4
    //   82: if_icmpne +6 -> 88
    //   85: goto -49 -> 36
    //   88: aload 7
    //   90: invokeinterface 116 1 0
    //   95: ldc 118
    //   97: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   100: istore 4
    //   102: iload 4
    //   104: ifeq -68 -> 36
    //   107: aload 7
    //   109: aconst_null
    //   110: ldc 126
    //   112: invokeinterface 130 3 0
    //   117: astore 5
    //   119: aload 5
    //   121: astore 7
    //   123: aload 8
    //   125: ifnull +50 -> 175
    //   128: aload 8
    //   130: invokevirtual 136	java/io/FileInputStream:close	()V
    //   133: aload 5
    //   135: astore 7
    //   137: goto +38 -> 175
    //   140: aload 5
    //   142: astore 7
    //   144: goto +31 -> 175
    //   147: astore_0
    //   148: goto +80 -> 228
    //   151: ldc -118
    //   153: ldc -116
    //   155: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: aload 6
    //   161: astore 7
    //   163: aload 8
    //   165: ifnull +10 -> 175
    //   168: aload 6
    //   170: astore 5
    //   172: goto -44 -> 128
    //   175: aload 7
    //   177: invokevirtual 149	java/lang/String:isEmpty	()Z
    //   180: ifne +38 -> 218
    //   183: new 151	java/lang/StringBuilder
    //   186: dup
    //   187: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   190: astore_0
    //   191: aload_0
    //   192: ldc -101
    //   194: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_0
    //   199: aload 7
    //   201: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: ldc -118
    //   207: aload_0
    //   208: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   214: pop
    //   215: aload 7
    //   217: areturn
    //   218: aload_0
    //   219: ldc 87
    //   221: invokevirtual 168	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   224: pop
    //   225: aload 7
    //   227: areturn
    //   228: aload 8
    //   230: ifnull +8 -> 238
    //   233: aload 8
    //   235: invokevirtual 136	java/io/FileInputStream:close	()V
    //   238: aload_0
    //   239: athrow
    //   240: ldc -118
    //   242: ldc -86
    //   244: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   247: pop
    //   248: ldc 85
    //   250: areturn
    //   251: astore_0
    //   252: goto -12 -> 240
    //   255: astore 5
    //   257: goto -106 -> 151
    //   260: astore 5
    //   262: goto -111 -> 151
    //   265: astore 6
    //   267: goto -127 -> 140
    //   270: astore 5
    //   272: goto -34 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	paramContext	Context
    //   35	38	1	i	int
    //   43	40	2	j	int
    //   65	8	3	k	int
    //   100	3	4	bool	boolean
    //   46	125	5	str1	String
    //   255	1	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   260	1	5	localIOException1	java.io.IOException
    //   270	1	5	localIOException2	java.io.IOException
    //   2	167	6	str2	String
    //   265	1	6	localIOException3	java.io.IOException
    //   15	211	7	localObject	Object
    //   10	224	8	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   12	36	147	java/lang/Throwable
    //   36	44	147	java/lang/Throwable
    //   58	66	147	java/lang/Throwable
    //   88	102	147	java/lang/Throwable
    //   107	119	147	java/lang/Throwable
    //   151	159	147	java/lang/Throwable
    //   4	12	251	java/io/FileNotFoundException
    //   12	36	255	org/xmlpull/v1/XmlPullParserException
    //   36	44	255	org/xmlpull/v1/XmlPullParserException
    //   58	66	255	org/xmlpull/v1/XmlPullParserException
    //   88	102	255	org/xmlpull/v1/XmlPullParserException
    //   107	119	255	org/xmlpull/v1/XmlPullParserException
    //   12	36	260	java/io/IOException
    //   36	44	260	java/io/IOException
    //   58	66	260	java/io/IOException
    //   88	102	260	java/io/IOException
    //   107	119	260	java/io/IOException
    //   128	133	265	java/io/IOException
    //   233	238	270	java/io/IOException
  }
  
  /* Error */
  static void save(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 85
    //   3: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   6: ifeq +11 -> 17
    //   9: aload_0
    //   10: ldc 87
    //   12: invokevirtual 168	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   15: pop
    //   16: return
    //   17: aload_0
    //   18: ldc 87
    //   20: iconst_0
    //   21: invokevirtual 177	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   24: astore_0
    //   25: invokestatic 181	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   28: astore_2
    //   29: aload_2
    //   30: aload_0
    //   31: aconst_null
    //   32: invokeinterface 187 3 0
    //   37: getstatic 193	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   40: astore_3
    //   41: aload_2
    //   42: ldc 99
    //   44: aload_3
    //   45: invokeinterface 197 3 0
    //   50: aload_2
    //   51: aconst_null
    //   52: ldc 118
    //   54: invokeinterface 201 3 0
    //   59: pop
    //   60: aload_2
    //   61: aconst_null
    //   62: ldc 126
    //   64: aload_1
    //   65: invokeinterface 205 4 0
    //   70: pop
    //   71: aload_2
    //   72: aconst_null
    //   73: ldc 118
    //   75: invokeinterface 208 3 0
    //   80: pop
    //   81: aload_2
    //   82: invokeinterface 211 1 0
    //   87: new 151	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   94: astore_2
    //   95: aload_2
    //   96: ldc -43
    //   98: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload_2
    //   103: aload_1
    //   104: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_2
    //   109: ldc -41
    //   111: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: ldc -118
    //   117: aload_2
    //   118: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   124: pop
    //   125: aload_0
    //   126: ifnull +52 -> 178
    //   129: aload_0
    //   130: invokevirtual 218	java/io/FileOutputStream:close	()V
    //   133: return
    //   134: astore_1
    //   135: goto +44 -> 179
    //   138: astore_2
    //   139: new 151	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   146: astore_3
    //   147: aload_3
    //   148: ldc -36
    //   150: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_3
    //   155: aload_1
    //   156: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: ldc -118
    //   162: aload_3
    //   163: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: aload_2
    //   167: invokestatic 223	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aload_0
    //   172: ifnull +48 -> 220
    //   175: goto -46 -> 129
    //   178: return
    //   179: aload_0
    //   180: ifnull +7 -> 187
    //   183: aload_0
    //   184: invokevirtual 218	java/io/FileOutputStream:close	()V
    //   187: aload_1
    //   188: athrow
    //   189: ldc -118
    //   191: ldc -31
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: ldc 87
    //   201: aastore
    //   202: invokestatic 229	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   205: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   208: pop
    //   209: return
    //   210: astore_0
    //   211: goto -22 -> 189
    //   214: astore_0
    //   215: return
    //   216: astore_0
    //   217: goto -30 -> 187
    //   220: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	221	0	paramContext	Context
    //   0	221	1	paramString	String
    //   28	90	2	localObject1	Object
    //   138	29	2	localException	Exception
    //   40	123	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   29	37	134	java/lang/Throwable
    //   37	41	134	java/lang/Throwable
    //   41	87	134	java/lang/Throwable
    //   87	125	134	java/lang/Throwable
    //   139	171	134	java/lang/Throwable
    //   29	37	138	java/lang/Exception
    //   41	87	138	java/lang/Exception
    //   87	125	138	java/lang/Exception
    //   17	25	210	java/io/FileNotFoundException
    //   129	133	214	java/io/IOException
    //   183	187	216	java/io/IOException
  }
}
