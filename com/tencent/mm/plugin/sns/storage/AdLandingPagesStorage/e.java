package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v.a;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class e
{
  public static int quh;
  public static int qui;
  private static Set<a> quj;
  
  static
  {
    GMTrace.i(8201374269440L, 61105);
    quh = 750;
    qui = 10;
    quj = null;
    GMTrace.o(8201374269440L, 61105);
  }
  
  private static boolean Ht(String paramString)
  {
    GMTrace.i(8200300527616L, 61097);
    if (bg.RF(bg.ap((String)bh.p(paramString, "adCanvasInfo").get(".adCanvasInfo.bizId"), "")) == 1)
    {
      GMTrace.o(8200300527616L, 61097);
      return true;
    }
    GMTrace.o(8200300527616L, 61097);
    return false;
  }
  
  /* Error */
  public static boolean Hu(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 75
    //   3: ldc 77
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 83	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: ifeq +13 -> 25
    //   15: ldc2_w 75
    //   18: ldc 77
    //   20: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: iconst_0
    //   24: ireturn
    //   25: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   28: ifnonnull +525 -> 553
    //   31: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   34: ifnonnull +519 -> 553
    //   37: new 85	java/util/HashSet
    //   40: dup
    //   41: invokespecial 88	java/util/HashSet:<init>	()V
    //   44: putstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   47: aconst_null
    //   48: astore 7
    //   50: aconst_null
    //   51: astore 5
    //   53: aconst_null
    //   54: astore 6
    //   56: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   59: invokevirtual 100	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   62: ldc 102
    //   64: invokevirtual 108	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   67: astore 8
    //   69: aload 8
    //   71: astore 6
    //   73: aload 8
    //   75: astore 7
    //   77: aload 8
    //   79: astore 5
    //   81: invokestatic 114	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   84: invokevirtual 118	org/xmlpull/v1/XmlPullParserFactory:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   87: astore 9
    //   89: aload 8
    //   91: astore 6
    //   93: aload 8
    //   95: astore 7
    //   97: aload 8
    //   99: astore 5
    //   101: aload 9
    //   103: aload 8
    //   105: ldc 120
    //   107: invokeinterface 126 3 0
    //   112: aload 8
    //   114: astore 6
    //   116: aload 8
    //   118: astore 7
    //   120: aload 8
    //   122: astore 5
    //   124: aload 9
    //   126: invokeinterface 130 1 0
    //   131: istore_2
    //   132: iconst_m1
    //   133: istore_3
    //   134: iconst_m1
    //   135: istore_1
    //   136: iload_2
    //   137: iconst_1
    //   138: if_icmpeq +486 -> 624
    //   141: iload_2
    //   142: iconst_2
    //   143: if_icmpne +1089 -> 1232
    //   146: aload 8
    //   148: astore 6
    //   150: aload 8
    //   152: astore 7
    //   154: aload 8
    //   156: astore 5
    //   158: aload 9
    //   160: invokeinterface 134 1 0
    //   165: astore 10
    //   167: aload 8
    //   169: astore 6
    //   171: aload 8
    //   173: astore 7
    //   175: aload 8
    //   177: astore 5
    //   179: ldc -120
    //   181: aload 10
    //   183: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +104 -> 290
    //   189: iconst_0
    //   190: istore_1
    //   191: iconst_0
    //   192: istore_2
    //   193: iload_2
    //   194: iconst_m1
    //   195: if_icmpeq +1077 -> 1272
    //   198: aload 8
    //   200: astore 6
    //   202: aload 8
    //   204: astore 7
    //   206: aload 8
    //   208: astore 5
    //   210: aload 9
    //   212: aconst_null
    //   213: ldc -114
    //   215: invokeinterface 145 3 0
    //   220: iconst_0
    //   221: invokestatic 149	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   224: iconst_1
    //   225: if_icmpne +1001 -> 1226
    //   228: aload 8
    //   230: astore 6
    //   232: aload 8
    //   234: astore 7
    //   236: aload 8
    //   238: astore 5
    //   240: aload 9
    //   242: aconst_null
    //   243: ldc -105
    //   245: invokeinterface 145 3 0
    //   250: iconst_m1
    //   251: invokestatic 149	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   254: istore 4
    //   256: goto +983 -> 1239
    //   259: aload 8
    //   261: astore 6
    //   263: aload 8
    //   265: astore 7
    //   267: aload 8
    //   269: astore 5
    //   271: aload 9
    //   273: invokeinterface 154 1 0
    //   278: istore 4
    //   280: iload_1
    //   281: istore_3
    //   282: iload_2
    //   283: istore_1
    //   284: iload 4
    //   286: istore_2
    //   287: goto -151 -> 136
    //   290: aload 8
    //   292: astore 6
    //   294: aload 8
    //   296: astore 7
    //   298: aload 8
    //   300: astore 5
    //   302: ldc -100
    //   304: aload 10
    //   306: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   309: ifeq +10 -> 319
    //   312: iconst_1
    //   313: istore_1
    //   314: iconst_1
    //   315: istore_2
    //   316: goto -123 -> 193
    //   319: aload 8
    //   321: astore 6
    //   323: aload 8
    //   325: astore 7
    //   327: aload 8
    //   329: astore 5
    //   331: ldc -98
    //   333: aload 10
    //   335: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   338: ifeq +10 -> 348
    //   341: iconst_2
    //   342: istore_2
    //   343: iconst_2
    //   344: istore_1
    //   345: goto -152 -> 193
    //   348: aload 8
    //   350: astore 6
    //   352: aload 8
    //   354: astore 7
    //   356: aload 8
    //   358: astore 5
    //   360: ldc -96
    //   362: aload 10
    //   364: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   367: ifeq +912 -> 1279
    //   370: iconst_3
    //   371: istore_2
    //   372: goto -179 -> 193
    //   375: iload_1
    //   376: iconst_m1
    //   377: if_icmpeq +895 -> 1272
    //   380: iload_3
    //   381: iconst_m1
    //   382: if_icmpeq +890 -> 1272
    //   385: iload 4
    //   387: iconst_m1
    //   388: if_icmpeq +884 -> 1272
    //   391: aload 8
    //   393: astore 6
    //   395: aload 8
    //   397: astore 7
    //   399: aload 8
    //   401: astore 5
    //   403: new 6	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a
    //   406: dup
    //   407: invokespecial 161	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:<init>	()V
    //   410: astore 10
    //   412: aload 8
    //   414: astore 6
    //   416: aload 8
    //   418: astore 7
    //   420: aload 8
    //   422: astore 5
    //   424: aload 10
    //   426: iload_1
    //   427: putfield 164	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:quk	I
    //   430: aload 8
    //   432: astore 6
    //   434: aload 8
    //   436: astore 7
    //   438: aload 8
    //   440: astore 5
    //   442: aload 10
    //   444: iload_3
    //   445: putfield 167	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qul	I
    //   448: aload 8
    //   450: astore 6
    //   452: aload 8
    //   454: astore 7
    //   456: aload 8
    //   458: astore 5
    //   460: aload 10
    //   462: iload 4
    //   464: putfield 170	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qum	I
    //   467: aload 8
    //   469: astore 6
    //   471: aload 8
    //   473: astore 7
    //   475: aload 8
    //   477: astore 5
    //   479: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   482: aload 10
    //   484: invokeinterface 175 2 0
    //   489: pop
    //   490: aload 8
    //   492: astore 6
    //   494: aload 8
    //   496: astore 7
    //   498: aload 8
    //   500: astore 5
    //   502: ldc -79
    //   504: new 179	java/lang/StringBuilder
    //   507: dup
    //   508: ldc -75
    //   510: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   513: aload 10
    //   515: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   518: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   521: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   524: goto +748 -> 1272
    //   527: astore 7
    //   529: aload 6
    //   531: astore 5
    //   533: ldc -79
    //   535: aload 7
    //   537: invokestatic 200	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   540: invokestatic 203	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   543: aload 6
    //   545: ifnull +8 -> 553
    //   548: aload 6
    //   550: invokevirtual 208	java/io/InputStream:close	()V
    //   553: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   556: ifnull +650 -> 1206
    //   559: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   562: invokeinterface 211 1 0
    //   567: ifne +639 -> 1206
    //   570: aload_0
    //   571: ldc 41
    //   573: invokestatic 47	com/tencent/mm/sdk/platformtools/bh:p	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   576: astore 6
    //   578: aload 6
    //   580: ifnull +13 -> 593
    //   583: aload 6
    //   585: invokeinterface 212 1 0
    //   590: ifeq +99 -> 689
    //   593: ldc -79
    //   595: new 179	java/lang/StringBuilder
    //   598: dup
    //   599: ldc -42
    //   601: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   604: aload_0
    //   605: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   611: invokestatic 220	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   614: ldc2_w 75
    //   617: ldc 77
    //   619: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   622: iconst_0
    //   623: ireturn
    //   624: aload 8
    //   626: ifnull -73 -> 553
    //   629: aload 8
    //   631: invokevirtual 208	java/io/InputStream:close	()V
    //   634: goto -81 -> 553
    //   637: astore 5
    //   639: goto -86 -> 553
    //   642: astore 6
    //   644: aload 7
    //   646: astore 5
    //   648: ldc -79
    //   650: aload 6
    //   652: invokestatic 200	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   655: invokestatic 203	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   658: aload 7
    //   660: ifnull -107 -> 553
    //   663: aload 7
    //   665: invokevirtual 208	java/io/InputStream:close	()V
    //   668: goto -115 -> 553
    //   671: astore 5
    //   673: goto -120 -> 553
    //   676: astore_0
    //   677: aload 5
    //   679: ifnull +8 -> 687
    //   682: aload 5
    //   684: invokevirtual 208	java/io/InputStream:close	()V
    //   687: aload_0
    //   688: athrow
    //   689: new 6	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a
    //   692: dup
    //   693: invokespecial 161	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:<init>	()V
    //   696: astore 7
    //   698: aload 7
    //   700: iconst_0
    //   701: putfield 164	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:quk	I
    //   704: aload 7
    //   706: aload 6
    //   708: ldc -34
    //   710: invokeinterface 55 2 0
    //   715: checkcast 57	java/lang/String
    //   718: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   721: putfield 167	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qul	I
    //   724: aload 7
    //   726: aload 6
    //   728: ldc -32
    //   730: invokeinterface 55 2 0
    //   735: checkcast 57	java/lang/String
    //   738: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   741: putfield 170	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qum	I
    //   744: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   747: aload 7
    //   749: invokeinterface 227 2 0
    //   754: ifne +35 -> 789
    //   757: ldc -79
    //   759: new 179	java/lang/StringBuilder
    //   762: dup
    //   763: ldc -27
    //   765: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   768: aload 7
    //   770: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   773: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   776: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   779: ldc2_w 75
    //   782: ldc 77
    //   784: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   787: iconst_0
    //   788: ireturn
    //   789: iconst_0
    //   790: istore_1
    //   791: aload 7
    //   793: iconst_1
    //   794: putfield 164	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:quk	I
    //   797: iload_1
    //   798: ifne +154 -> 952
    //   801: ldc -25
    //   803: astore_0
    //   804: aload 6
    //   806: new 179	java/lang/StringBuilder
    //   809: dup
    //   810: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   813: aload_0
    //   814: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: ldc -22
    //   819: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   822: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   825: invokeinterface 237 2 0
    //   830: ifeq +366 -> 1196
    //   833: aload 7
    //   835: aload 6
    //   837: new 179	java/lang/StringBuilder
    //   840: dup
    //   841: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   844: aload_0
    //   845: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   848: ldc -17
    //   850: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   853: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   856: invokeinterface 55 2 0
    //   861: checkcast 57	java/lang/String
    //   864: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   867: putfield 167	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qul	I
    //   870: aload 7
    //   872: aload 6
    //   874: new 179	java/lang/StringBuilder
    //   877: dup
    //   878: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   881: aload_0
    //   882: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   885: ldc -15
    //   887: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   893: invokeinterface 55 2 0
    //   898: checkcast 57	java/lang/String
    //   901: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   904: putfield 170	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qum	I
    //   907: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   910: aload 7
    //   912: invokeinterface 227 2 0
    //   917: ifne +58 -> 975
    //   920: ldc -79
    //   922: new 179	java/lang/StringBuilder
    //   925: dup
    //   926: ldc -13
    //   928: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   931: aload 7
    //   933: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   936: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   939: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   942: ldc2_w 75
    //   945: ldc 77
    //   947: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   950: iconst_0
    //   951: ireturn
    //   952: new 179	java/lang/StringBuilder
    //   955: dup
    //   956: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   959: ldc -25
    //   961: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: iload_1
    //   965: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   968: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   971: astore_0
    //   972: goto -168 -> 804
    //   975: new 179	java/lang/StringBuilder
    //   978: dup
    //   979: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   982: aload_0
    //   983: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   986: ldc -8
    //   988: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   991: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   994: astore 5
    //   996: aload 7
    //   998: iconst_2
    //   999: putfield 164	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:quk	I
    //   1002: iconst_0
    //   1003: istore_2
    //   1004: iload_2
    //   1005: ifne +154 -> 1159
    //   1008: aload 5
    //   1010: astore_0
    //   1011: aload 6
    //   1013: new 179	java/lang/StringBuilder
    //   1016: dup
    //   1017: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   1020: aload_0
    //   1021: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1024: ldc -17
    //   1026: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1032: invokeinterface 237 2 0
    //   1037: ifeq +152 -> 1189
    //   1040: aload 7
    //   1042: aload 6
    //   1044: new 179	java/lang/StringBuilder
    //   1047: dup
    //   1048: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   1051: aload_0
    //   1052: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: ldc -17
    //   1057: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1060: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1063: invokeinterface 55 2 0
    //   1068: checkcast 57	java/lang/String
    //   1071: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   1074: putfield 167	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qul	I
    //   1077: aload 7
    //   1079: aload 6
    //   1081: new 179	java/lang/StringBuilder
    //   1084: dup
    //   1085: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   1088: aload_0
    //   1089: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1092: ldc -15
    //   1094: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1097: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1100: invokeinterface 55 2 0
    //   1105: checkcast 57	java/lang/String
    //   1108: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:RF	(Ljava/lang/String;)I
    //   1111: putfield 170	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e$a:qum	I
    //   1114: getstatic 30	com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e:quj	Ljava/util/Set;
    //   1117: aload 7
    //   1119: invokeinterface 227 2 0
    //   1124: ifne +58 -> 1182
    //   1127: ldc -79
    //   1129: new 179	java/lang/StringBuilder
    //   1132: dup
    //   1133: ldc -6
    //   1135: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1138: aload 7
    //   1140: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1143: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1146: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1149: ldc2_w 75
    //   1152: ldc 77
    //   1154: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1157: iconst_0
    //   1158: ireturn
    //   1159: new 179	java/lang/StringBuilder
    //   1162: dup
    //   1163: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   1166: aload 5
    //   1168: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1171: iload_2
    //   1172: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1175: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1178: astore_0
    //   1179: goto -168 -> 1011
    //   1182: iload_2
    //   1183: iconst_1
    //   1184: iadd
    //   1185: istore_2
    //   1186: goto -182 -> 1004
    //   1189: iload_1
    //   1190: iconst_1
    //   1191: iadd
    //   1192: istore_1
    //   1193: goto -402 -> 791
    //   1196: ldc2_w 75
    //   1199: ldc 77
    //   1201: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1204: iconst_1
    //   1205: ireturn
    //   1206: ldc2_w 75
    //   1209: ldc 77
    //   1211: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1214: iconst_0
    //   1215: ireturn
    //   1216: astore 5
    //   1218: goto -665 -> 553
    //   1221: astore 5
    //   1223: goto -536 -> 687
    //   1226: iconst_m1
    //   1227: istore 4
    //   1229: goto +10 -> 1239
    //   1232: iload_1
    //   1233: istore_2
    //   1234: iload_3
    //   1235: istore_1
    //   1236: goto -977 -> 259
    //   1239: iload_2
    //   1240: tableswitch	default:+32->1272, 0:+44->1284, 1:+44->1284, 2:+44->1284, 3:+-865->375
    //   1272: iload_1
    //   1273: istore_2
    //   1274: iload_3
    //   1275: istore_1
    //   1276: goto -1017 -> 259
    //   1279: iconst_m1
    //   1280: istore_2
    //   1281: goto -1088 -> 193
    //   1284: iload_1
    //   1285: istore_2
    //   1286: iload 4
    //   1288: istore_1
    //   1289: goto -1030 -> 259
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1292	0	paramString	String
    //   135	1154	1	i	int
    //   131	1155	2	j	int
    //   133	1142	3	k	int
    //   254	1033	4	m	int
    //   51	481	5	localObject1	Object
    //   637	1	5	localIOException1	java.io.IOException
    //   646	1	5	localIOException2	java.io.IOException
    //   671	12	5	localIOException3	java.io.IOException
    //   994	173	5	str	String
    //   1216	1	5	localIOException4	java.io.IOException
    //   1221	1	5	localIOException5	java.io.IOException
    //   54	530	6	localObject2	Object
    //   642	438	6	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   48	449	7	localObject3	Object
    //   527	137	7	localIOException6	java.io.IOException
    //   696	443	7	locala	a
    //   67	563	8	localInputStream	java.io.InputStream
    //   87	185	9	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   165	349	10	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   56	69	527	java/io/IOException
    //   81	89	527	java/io/IOException
    //   101	112	527	java/io/IOException
    //   124	132	527	java/io/IOException
    //   158	167	527	java/io/IOException
    //   179	189	527	java/io/IOException
    //   210	228	527	java/io/IOException
    //   240	256	527	java/io/IOException
    //   271	280	527	java/io/IOException
    //   302	312	527	java/io/IOException
    //   331	341	527	java/io/IOException
    //   360	370	527	java/io/IOException
    //   403	412	527	java/io/IOException
    //   424	430	527	java/io/IOException
    //   442	448	527	java/io/IOException
    //   460	467	527	java/io/IOException
    //   479	490	527	java/io/IOException
    //   502	524	527	java/io/IOException
    //   629	634	637	java/io/IOException
    //   56	69	642	org/xmlpull/v1/XmlPullParserException
    //   81	89	642	org/xmlpull/v1/XmlPullParserException
    //   101	112	642	org/xmlpull/v1/XmlPullParserException
    //   124	132	642	org/xmlpull/v1/XmlPullParserException
    //   158	167	642	org/xmlpull/v1/XmlPullParserException
    //   179	189	642	org/xmlpull/v1/XmlPullParserException
    //   210	228	642	org/xmlpull/v1/XmlPullParserException
    //   240	256	642	org/xmlpull/v1/XmlPullParserException
    //   271	280	642	org/xmlpull/v1/XmlPullParserException
    //   302	312	642	org/xmlpull/v1/XmlPullParserException
    //   331	341	642	org/xmlpull/v1/XmlPullParserException
    //   360	370	642	org/xmlpull/v1/XmlPullParserException
    //   403	412	642	org/xmlpull/v1/XmlPullParserException
    //   424	430	642	org/xmlpull/v1/XmlPullParserException
    //   442	448	642	org/xmlpull/v1/XmlPullParserException
    //   460	467	642	org/xmlpull/v1/XmlPullParserException
    //   479	490	642	org/xmlpull/v1/XmlPullParserException
    //   502	524	642	org/xmlpull/v1/XmlPullParserException
    //   663	668	671	java/io/IOException
    //   56	69	676	finally
    //   81	89	676	finally
    //   101	112	676	finally
    //   124	132	676	finally
    //   158	167	676	finally
    //   179	189	676	finally
    //   210	228	676	finally
    //   240	256	676	finally
    //   271	280	676	finally
    //   302	312	676	finally
    //   331	341	676	finally
    //   360	370	676	finally
    //   403	412	676	finally
    //   424	430	676	finally
    //   442	448	676	finally
    //   460	467	676	finally
    //   479	490	676	finally
    //   502	524	676	finally
    //   533	543	676	finally
    //   648	658	676	finally
    //   548	553	1216	java/io/IOException
    //   682	687	1221	java/io/IOException
  }
  
  public static float a(double paramDouble, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8198689914880L, 61085);
    if (paramInt1 == 0)
    {
      f1 = (float)paramDouble;
      GMTrace.o(8198689914880L, 61085);
      return f1;
    }
    if (paramInt2 == 0)
    {
      f1 = (float)paramDouble;
      GMTrace.o(8198689914880L, 61085);
      return f1;
    }
    paramInt1 = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getWidth();
    float f1 = (float)paramDouble;
    float f2 = paramInt3;
    f1 = paramInt1 * (f1 * f2) / paramInt2;
    paramInt2 = (int)f1;
    paramInt1 = paramInt2;
    if (f1 - paramInt2 > 0.001D) {
      paramInt1 = paramInt2 + 1;
    }
    f1 = paramInt1;
    GMTrace.o(8198689914880L, 61085);
    return f1;
  }
  
  private static p a(Map<String, String> paramMap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    GMTrace.i(8199897874432L, 61094);
    int j = bg.RF((String)paramMap.get(paramString + ".type"));
    p localp = null;
    if (uA(j)) {}
    for (;;)
    {
      try
      {
        localp = a(paramMap, paramString, paramInt1, paramInt3, paramInt2, paramInt4);
        paramMap = localp;
      }
      catch (Exception localException)
      {
        paramMap = a(paramMap, paramString, paramInt1, paramInt3, paramInt2, 0);
        continue;
      }
      GMTrace.o(8199897874432L, 61094);
      return paramMap;
      if (j == 101) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label133;
        }
        paramMap = d(paramMap, paramString, paramInt1, paramInt3, paramInt2, paramInt4);
        break;
      }
      label133:
      if (uB(j))
      {
        paramMap = e(paramMap, paramString, paramInt1, paramInt3, paramInt2, paramInt4);
      }
      else
      {
        w.e("AdLandingPagesParseHelper", "the type" + j + " is not client known type");
        paramMap = localException;
      }
    }
  }
  
  private static p a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8198824132608L, 61086);
    int k = bg.RF((String)paramMap.get(paramString + ".type"));
    int m = bg.RF((String)paramMap.get(paramString + ".subType"));
    Object localObject;
    switch (k)
    {
    default: 
      GMTrace.o(8198824132608L, 61086);
      return null;
    case 82: 
      localObject = new u();
      ((u)localObject).url = bg.ap((String)paramMap.get(paramString + ".webviewUrl"), "");
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((p)localObject).qnw = uC(paramInt4);
        ((p)localObject).type = k;
        ((p)localObject).fvu = m;
        a((p)localObject, paramMap, paramString, paramInt1, paramInt2, paramInt3);
      }
      GMTrace.o(8198824132608L, 61086);
      return (p)localObject;
      List localList = b(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)localObject).qmO = localList;
      continue;
      localObject = c(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
      continue;
      localObject = new r();
      ((r)localObject).qnp = k;
      ((r)localObject).fvu = m;
      ((r)localObject).qnH = bg.ap((String)paramMap.get(paramString + ".content"), "");
      ((r)localObject).textAlignment = bg.RF((String)paramMap.get(paramString + ".textAlignment"));
      ((r)localObject).qnI = bg.ap((String)paramMap.get(paramString + ".fontColor"), "");
      ((r)localObject).gUs = a(bg.RH((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
      if ((bg.RF((String)paramMap.get(paramString + ".showType")) & r.qnE) > 0)
      {
        bool = true;
        label591:
        ((r)localObject).qnJ = bool;
        if ((bg.RF((String)paramMap.get(paramString + ".showType")) & r.qnF) <= 0) {
          break label742;
        }
        bool = true;
        label640:
        ((r)localObject).qnK = bool;
        if ((bg.RF((String)paramMap.get(paramString + ".showType")) & r.qnG) <= 0) {
          break label748;
        }
      }
      label742:
      label748:
      for (boolean bool = true;; bool = false)
      {
        ((r)localObject).qnL = bool;
        ((r)localObject).maxLines = bg.RF((String)paramMap.get(paramString + ".maxLines"));
        break;
        bool = false;
        break label591;
        bool = false;
        break label640;
      }
      if (m == 2)
      {
        localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b();
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).fKY = ((String)paramMap.get(paramString + ".appid"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).qmJ = ((String)paramMap.get(paramString + ".appPageUrlAndroid"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).channelId = ((String)paramMap.get(paramString + ".channelId"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).tK = ((String)paramMap.get(paramString + ".pkg"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).qmH = bg.RF((String)paramMap.get(paramString + ".platform"));
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)localObject).qmI = ((String)paramMap.get(paramString + ".warningAndroid"));
      }
      for (;;)
      {
        ((i)localObject).qnp = k;
        ((i)localObject).fvu = m;
        ((i)localObject).title = bg.ap((String)paramMap.get(paramString + ".btnTitle"), "");
        ((i)localObject).qmR = bg.RF((String)paramMap.get(paramString + ".btnType"));
        ((i)localObject).qmS = bg.ap((String)paramMap.get(paramString + ".btnJumpUrl"), "");
        ((i)localObject).qmT = bg.ap((String)paramMap.get(paramString + ".btnJumpApp"), "");
        ((i)localObject).qmU = bg.ap((String)paramMap.get(paramString + ".fontColor"), "");
        ((i)localObject).qmV = a(bg.RH((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
        ((i)localObject).textAlignment = bg.RF((String)paramMap.get(paramString + ".btnAlignment"));
        ((i)localObject).qmW = a(bg.RH((String)paramMap.get(paramString + ".borderSize")), paramInt1, paramInt2, paramInt3);
        ((i)localObject).height = a(bg.RH((String)paramMap.get(paramString + ".btnHeight")), paramInt1, paramInt2, paramInt3);
        ((i)localObject).qmX = bg.ap((String)paramMap.get(paramString + ".btnBgColorTheme"), "");
        ((i)localObject).qmY = bg.ap((String)paramMap.get(paramString + ".btnBorderColorTheme"), "");
        ((i)localObject).qmZ = bg.ap((String)paramMap.get(paramString + ".btnBgImgUrl"), "");
        break;
        if (m == 4)
        {
          localObject = new f();
          ((f)localObject).koj = bg.ap((String)paramMap.get(paramString + ".cardTpId"), "");
          ((f)localObject).koZ = bg.ap((String)paramMap.get(paramString + ".cardExt"), "");
        }
        else if (m == 7)
        {
          localObject = new h();
          ((h)localObject).qmQ = bg.RG((String)paramMap.get(paramString + ".jumpCanvasId"));
        }
        else
        {
          localObject = new i();
        }
      }
      localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qnp = k;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).fvu = m;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qne = bg.ap((String)paramMap.get(paramString + ".pureImageUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).width = a(bg.RH((String)paramMap.get(paramString + ".imageWidth")), paramInt1, paramInt2, paramInt3);
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).height = a(bg.RH((String)paramMap.get(paramString + ".imageHeight")), paramInt1, paramInt2, paramInt3);
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qnb = false;
      continue;
      localObject = new l();
      ((l)localObject).qnp = k;
      ((l)localObject).fvu = m;
      ((l)localObject).qne = bg.ap((String)paramMap.get(paramString + ".panoramaImageUrl"), "");
      ((l)localObject).width = a(bg.RH((String)paramMap.get(paramString + ".imageWidth")), paramInt1, paramInt2, paramInt3);
      ((l)localObject).height = a(bg.RH((String)paramMap.get(paramString + ".imageHeight")), paramInt1, paramInt2, paramInt3);
      continue;
      localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qnp = k;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).fvu = m;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qne = bg.ap((String)paramMap.get(paramString + ".fullScreenImageUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject).qnb = true;
      continue;
      localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n();
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnp = k;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).fvu = m;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnf = bg.ap((String)paramMap.get(paramString + ".sightVideoUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qng = bg.ap((String)paramMap.get(paramString + ".sightThumbUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnh = bg.ap((String)paramMap.get(paramString + ".streamVideoUrl"), "");
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qni = bg.ap((String)paramMap.get(paramString + ".jumpText"), "");
      try
      {
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnj = Color.parseColor((String)paramMap.get(paramString + ".jumpTextColor"));
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnk = Color.parseColor((String)paramMap.get(paramString + ".separatorColor"));
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).width = a(bg.RH((String)paramMap.get(paramString + ".sightDisplayWidth")), paramInt1, paramInt2, paramInt3);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).height = a(bg.RH((String)paramMap.get(paramString + ".sightDisplayHeight")), paramInt1, paramInt2, paramInt3);
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnl = bg.RF((String)paramMap.get(paramString + ".sightDisplayType"));
            break;
            localException1 = localException1;
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnj = Color.rgb(255, 255, 255);
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject).qnk = Color.rgb(255, 255, 255);
          }
        }
      }
      localObject = new t();
      ((t)localObject).qnp = k;
      ((t)localObject).fvu = m;
      ((t)localObject).qnh = bg.ap((String)paramMap.get(paramString + ".streamVideoUrl"), "");
      ((t)localObject).qnM = bg.ap((String)paramMap.get(paramString + ".streamVideoThumb"), "");
      ((t)localObject).width = a(bg.RH((String)paramMap.get(paramString + ".streamDisplayWidth")), paramInt1, paramInt2, paramInt3);
      ((t)localObject).height = a(bg.RH((String)paramMap.get(paramString + ".streamDisplayHeight")), paramInt1, paramInt2, paramInt3);
      ((t)localObject).qnN = bg.RF((String)paramMap.get(paramString + ".streamDisplayType"));
      continue;
      localObject = new s();
      ((s)localObject).qnp = k;
      ((s)localObject).fvu = m;
      ((s)localObject).mPK = bg.ap((String)paramMap.get(paramString + ".webviewUrl"), "");
      continue;
      double d1 = a(bg.RH((String)paramMap.get(paramString + ".topLineSize")), paramInt1, paramInt2, paramInt3);
      double d2 = a(bg.RH((String)paramMap.get(paramString + ".bottomLineSize")), paramInt1, paramInt2, paramInt3);
      int i;
      if (uC(paramInt4)) {
        i = Color.argb(51, 0, 0, 0);
      }
      int j;
      String str;
      for (;;)
      {
        if (k == 121)
        {
          double d3 = bg.RH((String)paramMap.get(paramString + ".location.$x"));
          double d4 = bg.RH((String)paramMap.get(paramString + ".location.$y"));
          j = bg.RF((String)paramMap.get(paramString + ".location.$scale"));
          localObject = (String)paramMap.get(paramString + ".location.$label");
          str = (String)paramMap.get(paramString + ".location.$poiname");
          if ((TextUtils.isEmpty((CharSequence)localObject)) && (TextUtils.isEmpty(str)))
          {
            GMTrace.o(8198824132608L, 61086);
            return null;
            i = Color.argb(51, 255, 255, 255);
          }
          else
          {
            localObject = new g(d1, d2, new g.a(d3, d4, j, (String)localObject, str), i);
            break;
          }
        }
      }
      if (k == 122)
      {
        str = paramString + ".phoneNumList.phoneNum";
        ArrayList localArrayList = new ArrayList();
        j = 0;
        if (j == 0) {}
        for (localObject = (String)paramMap.get(str);; localObject = (String)paramMap.get(str + j))
        {
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            break label3212;
          }
          localArrayList.add(localObject);
          j += 1;
          break;
        }
        label3212:
        if (!localArrayList.isEmpty())
        {
          localObject = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d(d1, d2, i, localArrayList);
        }
        else
        {
          GMTrace.o(8198824132608L, 61086);
          return null;
          localObject = new q();
          ((q)localObject).qnp = k;
          ((q)localObject).fvu = m;
          ((q)localObject).label = bg.ap((String)paramMap.get(paramString + ".label"), "");
          ((q)localObject).value = ((float)bg.RH((String)paramMap.get(paramString + ".value")));
          ((q)localObject).qnD = bg.ap((String)paramMap.get(paramString + ".foregroundImage"), "");
          ((q)localObject).qmV = a(bg.RH((String)paramMap.get(paramString + ".fontSize")), paramInt1, paramInt2, paramInt3);
          ((q)localObject).iHK = bg.ap((String)paramMap.get(paramString + ".backgroundColor"), "");
          continue;
          localObject = a(paramMap, paramString, paramInt1, paramInt2, paramInt3);
        }
      }
      else
      {
        localObject = null;
      }
    }
  }
  
  private static v a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8198958350336L, 61087);
    localv = new v();
    try
    {
      paramString = paramString + ".radarChart";
      localv.qnO = ((String)paramMap.get(paramString + ".borderImg"));
      localv.qnV = ((String)paramMap.get(paramString + ".maskImg"));
      localv.qnQ = ((String)paramMap.get(paramString + ".coverColor"));
      localv.qnR = Color.parseColor((String)paramMap.get(paramString + ".labelFont.$color"));
      localv.qnS = ((int)a(bg.RH((String)paramMap.get(paramString + ".labelFont.$size")), paramInt1, paramInt2, paramInt3));
      localv.qnT = Color.parseColor((String)paramMap.get(paramString + ".scoreFont.$color"));
      localv.qnU = ((int)a(bg.RH((String)paramMap.get(paramString + ".scoreFont.$size")), paramInt1, paramInt2, paramInt3));
      localv.qnP = a(bg.RH((String)paramMap.get(paramString + ".borderImgWidth")), paramInt1, paramInt2, paramInt3);
      String str = paramString + ".itemList.item";
      paramInt1 = 0;
      if (paramInt1 != 0) {}
      for (paramString = str + paramInt1;; paramString = str)
      {
        v.a locala = new v.a();
        locala.label = ((String)paramMap.get(paramString + ".label"));
        locala.qnW = ((String)paramMap.get(paramString + ".score"));
        locala.value = ((float)bg.RH((String)paramMap.get(paramString + ".value")));
        if ((TextUtils.isEmpty(locala.label)) && (TextUtils.isEmpty(locala.qnW))) {
          break label570;
        }
        localv.piV.add(locala);
        paramInt1 += 1;
        break;
      }
      label570:
      return localv;
    }
    catch (Exception paramMap)
    {
      w.e("AdLandingPagesParseHelper", bg.f(paramMap));
      GMTrace.o(8198958350336L, 61087);
    }
  }
  
  private static void a(p paramp, Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8199495221248L, 61091);
    paramp.qnp = bg.RF((String)paramMap.get(paramString + ".type"));
    paramp.type = paramp.qnp;
    paramp.qno = bg.ap((String)paramMap.get(paramString + ".id"), "");
    paramp.qnq = a(bg.RH((String)paramMap.get(paramString + ".paddingTop")), paramInt1, paramInt2, paramInt3);
    paramp.qnr = a(bg.RH((String)paramMap.get(paramString + ".paddingBottom")), paramInt1, paramInt2, paramInt3);
    paramp.qns = a(bg.RH((String)paramMap.get(paramString + ".paddingLeft")), paramInt1, paramInt2, paramInt3);
    paramp.qnt = a(bg.RH((String)paramMap.get(paramString + ".paddingRight")), paramInt1, paramInt2, paramInt3);
    paramp.fvu = bg.RF((String)paramMap.get(paramString + ".subType"));
    String str1 = paramString + ".if";
    boolean bool;
    label360:
    label413:
    label419:
    double d;
    if (paramMap.containsKey(str1)) {
      if ("1".equals(paramMap.get(str1)))
      {
        bool = true;
        paramp.qnz = bool;
        str1 = paramString + ".noReport";
        if (!paramMap.containsKey(str1)) {
          break label665;
        }
        if (!"1".equals(paramMap.get(str1))) {
          break label659;
        }
        bool = true;
        paramp.qnA = bool;
        str1 = bg.ap((String)paramMap.get(paramString + ".layoutWidth"), "");
        String str2 = bg.ap((String)paramMap.get(paramString + ".layoutHeight"), "");
        if (TextUtils.isEmpty(str1)) {
          break label690;
        }
        d = bg.RH(str1);
        if (d >= 0.0D) {
          break label673;
        }
        paramp.qnu = ((float)d);
        label520:
        if (TextUtils.isEmpty(str2)) {
          break label717;
        }
        d = bg.RH(str2);
        if (d >= 0.0D) {
          break label700;
        }
        paramp.qnv = ((float)d);
        label549:
        str1 = (String)paramMap.get(paramString + ".verticalAlignment");
        paramMap = (String)paramMap.get(paramString + ".horizontalAlignment");
        if (!TextUtils.isEmpty(str1)) {
          break label727;
        }
      }
    }
    label659:
    label665:
    label673:
    label690:
    label700:
    label717:
    label727:
    for (paramp.qnx = -1;; paramp.qnx = bg.RF(str1))
    {
      if (!TextUtils.isEmpty(paramMap)) {
        break label739;
      }
      paramp.qny = -1;
      GMTrace.o(8199495221248L, 61091);
      return;
      bool = false;
      break;
      paramp.qnz = true;
      break label360;
      bool = false;
      break label413;
      paramp.qnA = false;
      break label419;
      paramp.qnu = a(d, paramInt1, paramInt2, paramInt3);
      break label520;
      paramp.qnu = 2.14748365E9F;
      break label520;
      paramp.qnv = a(d, paramInt1, paramInt2, paramInt3);
      break label549;
      paramp.qnv = 2.14748365E9F;
      break label549;
    }
    label739:
    paramp.qny = bg.RF(paramMap);
    GMTrace.o(8199495221248L, 61091);
  }
  
  public static boolean a(bhc parambhc, Activity paramActivity)
  {
    GMTrace.i(8200971616256L, 61102);
    String str = parambhc.qAC;
    long l = new BigInteger(parambhc.nas).longValue();
    LinkedList localLinkedList = parambhc.uyu.tKd;
    boolean bool;
    Object localObject;
    int i;
    int j;
    if (!TextUtils.isEmpty(str))
    {
      if ((TextUtils.isEmpty(str)) || (!Hu(str))) {
        break label371;
      }
      bool = Ht(str);
      if (!bool) {
        break label391;
      }
      localObject = com.tencent.mm.x.c.c.Cv().getExpIdByKey("Sns_Canvas_GameShare_JumpWay");
      if (com.tencent.mm.x.c.c.Cv().cK("Sns_Canvas_GameShare_JumpWay", 0) == 0)
      {
        i = 0;
        j = i;
        parambhc = (bhc)localObject;
        if (i == 0)
        {
          j = i;
          parambhc = (bhc)localObject;
          if (bjD())
          {
            j = 1;
            parambhc = (bhc)localObject;
          }
        }
      }
    }
    for (;;)
    {
      if (j != 0)
      {
        localObject = ae.bhp().dP(l);
        Intent localIntent = new Intent();
        if (localObject != null)
        {
          localIntent.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject).bjM());
          localIntent.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject).bkq());
          localIntent.putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.m)localObject).bkl());
          localIntent.putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.m)localObject).bkm());
        }
        if ((localLinkedList != null) && (localLinkedList.size() > 0)) {
          localIntent.putExtra("sns_landing_pages_share_thumb_url", ((amn)localLinkedList.get(0)).uhA);
        }
        localIntent.putExtra("sns_landing_pages_expid", parambhc);
        localIntent.putExtra("sns_landig_pages_from_source", 11);
        localIntent.setClass(paramActivity, SnsAdNativeLandingPagesUI.class);
        localIntent.putExtra("sns_landing_pages_xml", str);
        localIntent.putExtra("sns_landing_pages_xml_prefix", "adxml");
        localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        localIntent.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject).bkt());
        paramActivity.startActivity(localIntent);
        GMTrace.o(8200971616256L, 61102);
        return true;
        i = 1;
        break;
      }
      b(str, paramActivity, bool, 11);
      for (;;)
      {
        GMTrace.o(8200971616256L, 61102);
        return false;
        label371:
        w.i("AdLandingPagesParseHelper", "invalid canvas xml %s", new Object[] { str });
      }
      label391:
      parambhc = "";
      j = 1;
    }
  }
  
  private static List<p> b(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8199092568064L, 61088);
    ArrayList localArrayList = new ArrayList();
    String str = paramString + ".layoutItems.componentItem";
    int i = 0;
    if (i == 0)
    {
      paramString = str;
      label51:
      paramString = a(paramMap, paramInt1, paramInt3, paramInt2, paramInt4, paramString);
      if (paramString == null) {
        break label150;
      }
      if (!paramString.qnz) {
        break label116;
      }
      localArrayList.add(paramString);
    }
    for (;;)
    {
      i += 1;
      break;
      paramString = str + i;
      break label51;
      label116:
      w.i("AdLandingPagesParseHelper", "comp " + paramString.toString() + " ifCondition is false");
    }
    label150:
    GMTrace.o(8199092568064L, 61088);
    return localArrayList;
  }
  
  private static boolean b(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8200434745344L, 61098);
    paramString = (String)bh.p(paramString, "adCanvasInfo").get(".adCanvasInfo.shareWebUrl");
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(8200434745344L, 61098);
      return false;
    }
    String str = paramString;
    if (paramBoolean) {
      str = "exp=" + com.tencent.mm.x.c.c.Cv().getExpIdByKey("Sns_Canvas_GameShare_JumpWay") + "_" + paramInt;
    }
    try
    {
      str = k(paramString, new String[] { str });
      paramString = str;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      for (;;) {}
    }
    w.i("AdLandingPagesParseHelper", "canvas jump url " + paramString);
    str = paramString;
    paramString = new Intent();
    paramString.putExtra("rawUrl", str);
    paramString.putExtra("showShare", true);
    com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
    GMTrace.o(8200434745344L, 61098);
    return true;
  }
  
  private static boolean bjD()
  {
    GMTrace.i(8200703180800L, 61100);
    com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100150");
    if (localc.isValid())
    {
      int i = bg.getInt((String)localc.bPn().get("openCanvas"), 0);
      w.i("AdLandingPagesParseHelper", "canOpenGameCanvas abtest=" + i);
      if (i == 1)
      {
        GMTrace.o(8200703180800L, 61100);
        return true;
      }
      GMTrace.o(8200703180800L, 61100);
      return false;
    }
    GMTrace.o(8200703180800L, 61100);
    return false;
  }
  
  private static j c(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8199226785792L, 61089);
    j localj = new j();
    try
    {
      i = Color.parseColor((String)paramMap.get(paramString + ".bgColorTheme"));
      localj.backgroundColor = ((int)(bg.getDouble((String)paramMap.get(paramString + ".bgColorAlpha"), 0.0D) * 255.0D) << 24 | i & 0xFFFFFF);
      paramString = paramString + ".componentGroupList";
      str = paramString + ".componentItem";
      i = 0;
      while (i == 0)
      {
        paramString = str;
        int j = bg.RF((String)paramMap.get(paramString + ".type"));
        p localp = null;
        if (uA(j)) {
          localp = a(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
        }
        if (localp == null) {
          break label311;
        }
        if (localp.qnz) {
          localj.qna.add(localp);
        }
        i += 1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i;
        String str;
        w.e("AdLandingPagesParseHelper", "%s", new Object[] { bg.f(localException) });
        localj.backgroundColor = Color.argb(51, 0, 0, 0);
        continue;
        paramString = str + i;
      }
      label311:
      GMTrace.o(8199226785792L, 61089);
    }
    return localj;
  }
  
  public static LinkedList<c> c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(8200032092160L, 61095);
    Object localObject2 = new String(paramString1);
    Object localObject1 = localObject2;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString3);
      localObject1 = localObject2;
      w.i("AdLandingPagesParseHelper", "the jsonObject is " + localJSONObject.toString());
      localObject1 = localObject2;
      Iterator localIterator = localJSONObject.keys();
      paramString3 = (String)localObject2;
      localObject1 = paramString3;
      localObject2 = paramString3;
      if (localIterator.hasNext())
      {
        localObject1 = paramString3;
        localObject2 = localIterator.next();
        if (localObject2 == null) {
          break label261;
        }
        localObject1 = paramString3;
        if (!(localObject2 instanceof String)) {
          break label261;
        }
        localObject1 = paramString3;
        localObject2 = (String)localObject2;
        localObject1 = paramString3;
        String str = localJSONObject.getString((String)localObject2);
        localObject1 = paramString3;
        if (bg.mZ(str)) {
          break label261;
        }
        localObject1 = paramString3;
        paramString3 = paramString3.replace("{{" + (String)localObject2 + "}}", "<![CDATA[" + str + "]]>");
      }
      for (;;)
      {
        break;
      }
    }
    catch (Exception paramString3)
    {
      w.e("AdLandingPagesParseHelper", "the json is parsed error : " + paramString1);
      localObject2 = localObject1;
      paramString1 = k((String)localObject2, paramString2, paramString4, paramString5);
      GMTrace.o(8200032092160L, 61095);
      return paramString1;
    }
  }
  
  private static k d(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8199361003520L, 61090);
    k localk = new k();
    a(localk, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    localk.qnc = bg.RF((String)paramMap.get(paramString + ".pageCtrType"));
    boolean bool;
    String str1;
    int i;
    if (bg.RF((String)paramMap.get(paramString + ".isFullScreen")) == 1)
    {
      bool = true;
      localk.qnd = bool;
      str1 = paramString + ".componentGroupList.componentGroup";
      i = 0;
    }
    for (;;)
    {
      label145:
      j localj;
      String str2;
      int j;
      if (i == 0)
      {
        paramString = str1;
        localj = new j();
        str2 = paramString + ".componentItem";
        j = 0;
        label179:
        if (j != 0) {
          break label307;
        }
      }
      label307:
      for (paramString = str2;; paramString = str2 + j)
      {
        int k = bg.RF((String)paramMap.get(paramString + ".type"));
        p localp = null;
        if (uA(k)) {
          localp = a(paramMap, paramString, paramInt1, paramInt2, paramInt3, paramInt4);
        }
        if (localp == null) {
          break label331;
        }
        if (localp.qnz) {
          localj.qna.add(localp);
        }
        j += 1;
        break label179;
        bool = false;
        break;
        paramString = str1 + i;
        break label145;
      }
      label331:
      if (localj.qna.size() == 0) {
        break label362;
      }
      localk.qna.add(localj);
      i += 1;
    }
    label362:
    GMTrace.o(8199361003520L, 61090);
    return localk;
  }
  
  private static p e(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8199629438976L, 61092);
    o localo = new o();
    localo.qnn = bg.RF((String)paramMap.get(paramString + ".subType"));
    a(localo, paramMap, paramString, paramInt1, paramInt2, paramInt3);
    String str2 = paramString + ".layoutItems.componentItem";
    int i = 0;
    String str1;
    label99:
    int j;
    if (i == 0)
    {
      str1 = str2;
      j = bg.RF((String)paramMap.get(str1 + ".type"));
      paramString = null;
      if (!uA(j)) {
        break label211;
      }
      paramString = a(paramMap, str1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    for (;;)
    {
      if (paramString == null) {
        break label235;
      }
      if (paramString.qnz) {
        localo.qnm.add(paramString);
      }
      i += 1;
      break;
      str1 = str2 + i;
      break label99;
      label211:
      if (uB(j)) {
        paramString = e(paramMap, str1, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    label235:
    GMTrace.o(8199629438976L, 61092);
    return localo;
  }
  
  private static String k(String paramString, String... paramVarArgs)
  {
    GMTrace.i(8200568963072L, 61099);
    URI localURI = new URI(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i <= 0)
    {
      localStringBuilder.append(paramVarArgs[0]).append("&");
      i += 1;
    }
    if (localStringBuilder.length() > 1)
    {
      paramString = localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
      paramVarArgs = localURI.getQuery();
      if (paramVarArgs == null) {}
      for (paramString = paramString.toString();; paramString = paramVarArgs + "&" + paramString.toString())
      {
        paramString = new URI(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramString, localURI.getFragment()).toString();
        GMTrace.o(8200568963072L, 61099);
        return paramString;
      }
    }
    GMTrace.o(8200568963072L, 61099);
    return paramString;
  }
  
  public static LinkedList<c> k(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(8199763656704L, 61093);
    LinkedList localLinkedList = new LinkedList();
    if (TextUtils.isEmpty(paramString1))
    {
      GMTrace.o(8199763656704L, 61093);
      return localLinkedList;
    }
    if (TextUtils.isEmpty(paramString1)) {}
    Map localMap;
    for (;;)
    {
      localMap = bh.p(paramString1, paramString2);
      if (localMap != null) {
        break;
      }
      w.w("AdLandingPagesParseHelper", " parse landingpages xml is error ," + paramString1);
      GMTrace.o(8199763656704L, 61093);
      return localLinkedList;
      paramString1 = paramString1.replaceAll("\\{\\{.*?\\}\\}", "");
    }
    int i1 = bg.RF((String)localMap.get("." + paramString2 + ".adCanvasInfo.sizeType"));
    int i = bg.RF((String)localMap.get("." + paramString2 + ".adCanvasInfo.basicRootFontSize"));
    int k = bg.RF((String)localMap.get("." + paramString2 + ".adCanvasInfo.basicWidth"));
    if ((i == 0) && (i1 == 1)) {
      i = qui;
    }
    for (;;)
    {
      int j = k;
      if (k == 0)
      {
        j = k;
        if (i1 == 1) {
          j = quh;
        }
      }
      if ((!bg.mZ(paramString2)) && (!".adCanvasInfo.PageList.Page".equals("adCanvasInfo"))) {}
      for (paramString1 = "." + paramString2 + ".adCanvasInfo.PageList.Page";; paramString1 = ".adCanvasInfo.PageList.Page")
      {
        k = 0;
        for (;;)
        {
          c localc;
          boolean bool;
          label435:
          Object localObject;
          label504:
          label511:
          String str;
          int m;
          if (k == 0)
          {
            paramString2 = paramString1;
            localc = new c();
            localc.qtV = bg.ap((String)localMap.get(paramString2 + ".backgroundCover"), "");
            localc.iHK = bg.ap((String)localMap.get(paramString2 + ".backgroundColor"), "");
            if (bg.RF((String)localMap.get(paramString2 + ".backgroundCover.$isAddBlur")) <= 0) {
              break label686;
            }
            bool = true;
            localc.qtW = bool;
            localc.id = k;
            localObject = paramString2 + ".if";
            if (!localMap.containsKey(localObject)) {
              break label698;
            }
            if (!"1".equals(localMap.get(localObject))) {
              break label692;
            }
            bool = true;
            localc.qnz = bool;
            if (!localc.qnz) {
              break label821;
            }
            str = paramString2 + ".componentItemList.componentItem";
            m = 0;
            label543:
            if (m != 0) {
              break label707;
            }
            paramString2 = str;
          }
          for (;;)
          {
            try
            {
              if (TextUtils.isEmpty(localc.iHK)) {
                continue;
              }
              n = Color.parseColor(localc.iHK);
              localObject = a(localMap, i1, i, j, n, paramString2);
            }
            catch (Exception localException)
            {
              int n;
              label686:
              label692:
              label698:
              label707:
              w.e("AdLandingPagesParseHelper", bg.f(localException));
              p localp = a(localMap, i1, i, j, 0, paramString2);
              continue;
              w.i("AdLandingPagesParseHelper", "comp " + localp.toString() + " ifCondition is false");
              continue;
            }
            if (localObject == null) {
              break label802;
            }
            if (!((p)localObject).qnz) {
              continue;
            }
            if (((p)localObject).type == 21)
            {
              ((i)localObject).qlo = paramString4;
              ((i)localObject).qlp = paramString3;
            }
            a((p)localObject, localMap, paramString2, i1, j, i);
            localc.qtX.add(localObject);
            m += 1;
            break label543;
            paramString2 = paramString1 + k;
            break;
            bool = false;
            break label435;
            bool = false;
            break label504;
            localc.qnz = true;
            break label511;
            paramString2 = str + m;
            continue;
            n = 0;
          }
          label802:
          if (localc.qtX.size() == 0) {
            break;
          }
          localLinkedList.add(localc);
          label821:
          k += 1;
        }
        if (localLinkedList.size() > 0) {
          ((c)localLinkedList.get(0)).qtY = true;
        }
        GMTrace.o(8199763656704L, 61093);
        return localLinkedList;
      }
    }
  }
  
  private static boolean uA(int paramInt)
  {
    GMTrace.i(8198421479424L, 61083);
    if ((paramInt == 101) || (paramInt == 103))
    {
      GMTrace.o(8198421479424L, 61083);
      return false;
    }
    GMTrace.o(8198421479424L, 61083);
    return true;
  }
  
  private static boolean uB(int paramInt)
  {
    GMTrace.i(8198555697152L, 61084);
    if (paramInt == 103)
    {
      GMTrace.o(8198555697152L, 61084);
      return true;
    }
    GMTrace.o(8198555697152L, 61084);
    return false;
  }
  
  private static boolean uC(int paramInt)
  {
    GMTrace.i(8200166309888L, 61096);
    paramInt |= 0xFF000000;
    if (paramInt + 16777216 > -1 - paramInt)
    {
      GMTrace.o(8200166309888L, 61096);
      return true;
    }
    GMTrace.o(8200166309888L, 61096);
    return false;
  }
  
  public static String w(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8201240051712L, 61104);
    if (paramm == null)
    {
      w.e("AdLandingPagesParseHelper", "the snsinfo is null");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    if (!paramm.uF(32))
    {
      w.e("AdLandingPagesParseHelper", "the snsinfo is not a ad");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    Object localObject1 = paramm.bkr();
    if (localObject1 == null)
    {
      w.e("AdLandingPagesParseHelper", "the adSnsInfo is null");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    Object localObject2 = paramm.bjH();
    if (localObject2 == null)
    {
      w.e("AdLandingPagesParseHelper", "the adxml is null");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    a locala = paramm.bjJ();
    if (locala == null)
    {
      w.e("AdLandingPagesParseHelper", "the adInfo is null");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    if (!((com.tencent.mm.plugin.sns.storage.b)localObject2).qln)
    {
      w.e("AdLandingPagesParseHelper", "the snsinfo is not a landingpage");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    if ((locala.qlq == null) || (locala.qlq.size() == 0))
    {
      w.e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
      GMTrace.o(8201240051712L, 61104);
      return null;
    }
    paramm = ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml;
    localObject2 = k(paramm, "adxml", "adId", "");
    Iterator localIterator1 = locala.qlq.keySet().iterator();
    String str2;
    String str1;
    Iterator localIterator2;
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      if (!bg.mZ(str2))
      {
        str1 = (String)locala.qlq.get(str2);
        if (!bg.mZ(str1))
        {
          localIterator2 = ((LinkedList)localObject2).iterator();
          localObject1 = null;
        }
      }
    }
    label395:
    label498:
    for (;;)
    {
      if (localIterator2.hasNext())
      {
        Iterator localIterator3 = ((c)localIterator2.next()).qtX.iterator();
        while (localIterator3.hasNext())
        {
          p localp = (p)localIterator3.next();
          if (((localp instanceof f)) && (!bg.mZ(((f)localp).koj)) && (((f)localp).koj.equals(str2)))
          {
            localObject1 = ((f)localp).koZ;
            if (localObject1 == null) {
              break label498;
            }
          }
        }
      }
      for (;;)
      {
        if (!bg.mZ((String)localObject1))
        {
          w.i("AdLandingPagesParseHelper", "old card ext is " + (String)localObject1 + " and new card ext is " + str1);
          paramm = paramm.replace((CharSequence)localObject1, str1);
          try
          {
            localObject1 = paramm.replace(bg.RD((String)localObject1), bg.RD(str1));
            paramm = (com.tencent.mm.plugin.sns.storage.m)localObject1;
          }
          catch (Exception localException)
          {
            w.e("AdLandingPagesParseHelper", "the xml is error");
          }
        }
        for (;;)
        {
          break;
          GMTrace.o(8201240051712L, 61104);
          return paramm;
        }
        break label395;
      }
    }
  }
  
  public static boolean z(Intent paramIntent, Context paramContext)
  {
    boolean bool1 = false;
    GMTrace.i(8200837398528L, 61101);
    String str2 = paramIntent.getStringExtra("sns_landing_pages_xml");
    String str1;
    boolean bool2;
    if (!TextUtils.isEmpty(str2)) {
      if ((!TextUtils.isEmpty(str2)) && (Hu(str2)))
      {
        str1 = "";
        bool2 = Ht(str2);
        if (!bool2) {
          break label232;
        }
        str1 = com.tencent.mm.x.c.c.Cv().getExpIdByKey("Sns_Canvas_GameShare_JumpWay");
        if (!TextUtils.isEmpty(str1))
        {
          int i = com.tencent.mm.x.c.c.Cv().cK("Sns_Canvas_GameShare_JumpWay", 0);
          w.i("AdLandingPagesParseHelper", "abtestvalue = " + i);
          if (i != 0) {}
        }
      }
    }
    for (;;)
    {
      if (bool1)
      {
        paramIntent = new Intent(paramIntent);
        paramIntent.setClass(paramContext, SnsAdNativeLandingPagesUI.class);
        paramIntent.putExtra("sns_landing_pages_expid", str1);
        paramContext.startActivity(paramIntent);
        GMTrace.o(8200837398528L, 61101);
        return true;
        bool1 = true;
        continue;
        bool1 = bjD();
      }
      else
      {
        bool1 = b(str2, paramContext, bool2, paramIntent.getIntExtra("sns_landig_pages_from_source", -1));
        GMTrace.o(8200837398528L, 61101);
        return bool1;
        w.i("AdLandingPagesParseHelper", "invalid canvas xml %s", new Object[] { str2 });
        GMTrace.o(8200837398528L, 61101);
        return false;
        label232:
        bool1 = true;
      }
    }
  }
  
  private static final class a
  {
    public int quk;
    public int qul;
    public int qum;
    
    public a()
    {
      GMTrace.i(8196005560320L, 61065);
      GMTrace.o(8196005560320L, 61065);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8196139778048L, 61066);
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((((a)paramObject).quk == this.quk) && (((a)paramObject).qul == this.qul) && (((a)paramObject).qum == this.qum))
        {
          GMTrace.o(8196139778048L, 61066);
          return true;
        }
        GMTrace.o(8196139778048L, 61066);
        return false;
      }
      GMTrace.o(8196139778048L, 61066);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(8196273995776L, 61067);
      int i = this.quk;
      int j = this.qul;
      int k = this.qum;
      GMTrace.o(8196273995776L, 61067);
      return i + j + k;
    }
    
    public final String toString()
    {
      GMTrace.i(8196408213504L, 61068);
      String str = "[nodeType=" + this.quk + ",compType=" + this.qul + ",subCompType=" + this.qum + "]";
      GMTrace.o(8196408213504L, 61068);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */