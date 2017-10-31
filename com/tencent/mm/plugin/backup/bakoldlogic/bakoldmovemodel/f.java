package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.b;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public final class f
  implements a.b, d, b.c
{
  public boolean jNE;
  private boolean jNG;
  public com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a jTM;
  b jTS;
  private boolean jTT;
  public d jTU;
  public a.b jTV;
  private a jTW;
  public List<String> jTX;
  public PLong jTY;
  public PInt jTZ;
  public long jUa;
  public Object lock;
  
  public f()
  {
    GMTrace.i(14745696468992L, 109864);
    this.jTT = false;
    this.lock = new Object();
    this.jNG = true;
    this.jNE = false;
    GMTrace.o(14745696468992L, 109864);
  }
  
  private void afD()
  {
    GMTrace.i(14746233339904L, 109868);
    synchronized (this.lock)
    {
      if (this.jTM != null)
      {
        this.jTM.cancel();
        this.jTM = null;
      }
      if (this.jTS != null)
      {
        this.jTS.cancel();
        this.jTS = null;
      }
      com.tencent.mm.a.e.f(new File(com.tencent.mm.plugin.backup.a.h.adP()));
      GMTrace.o(14746233339904L, 109868);
      return;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(14745964904448L, 109866);
    StringBuilder localStringBuilder = new StringBuilder("setOnAuthOK onAuthCb is null : ");
    if (parama == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MoveBakServer", bool);
      this.jTW = parama;
      GMTrace.o(14745964904448L, 109866);
      return;
    }
  }
  
  public final void a(List<String> paramList, PLong paramPLong, PInt paramPInt)
  {
    GMTrace.i(14745830686720L, 109865);
    this.jTX = paramList;
    this.jTY = paramPLong;
    this.jTZ = paramPInt;
    GMTrace.o(14745830686720L, 109865);
  }
  
  /* Error */
  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 140
    //   3: ldc -114
    //   5: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_3
    //   9: ifnonnull +399 -> 408
    //   12: iconst_0
    //   13: istore 5
    //   15: ldc 109
    //   17: ldc -112
    //   19: iconst_4
    //   20: anewarray 4	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: iload_1
    //   26: invokestatic 150	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: iload_2
    //   33: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: iload 4
    //   41: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: dup
    //   46: iconst_3
    //   47: iload 5
    //   49: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   52: aastore
    //   53: invokestatic 158	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: iload_1
    //   57: ifeq +10 -> 67
    //   60: aload_0
    //   61: iload_2
    //   62: ldc -96
    //   64: invokevirtual 164	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:onError	(ILjava/lang/String;)V
    //   67: iload_2
    //   68: iconst_1
    //   69: if_icmpne +507 -> 576
    //   72: new 166	com/tencent/mm/plugin/backup/h/v
    //   75: dup
    //   76: invokespecial 167	com/tencent/mm/plugin/backup/h/v:<init>	()V
    //   79: astore 6
    //   81: aload 6
    //   83: aload_3
    //   84: invokevirtual 171	com/tencent/mm/plugin/backup/h/v:aC	([B)Lcom/tencent/mm/bl/a;
    //   87: pop
    //   88: ldc 109
    //   90: ldc -83
    //   92: iconst_2
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload 6
    //   100: getfield 177	com/tencent/mm/plugin/backup/h/v:ID	Ljava/lang/String;
    //   103: aastore
    //   104: dup
    //   105: iconst_1
    //   106: aload 6
    //   108: getfield 181	com/tencent/mm/plugin/backup/h/v:jXN	I
    //   111: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: aastore
    //   115: invokestatic 158	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   121: getfield 192	com/tencent/mm/plugin/backup/a/e:jKZ	Ljava/lang/String;
    //   124: invokestatic 198	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   127: ifeq +14 -> 141
    //   130: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   133: aload 6
    //   135: getfield 177	com/tencent/mm/plugin/backup/h/v:ID	Ljava/lang/String;
    //   138: putfield 192	com/tencent/mm/plugin/backup/a/e:jKZ	Ljava/lang/String;
    //   141: aload 6
    //   143: getfield 177	com/tencent/mm/plugin/backup/h/v:ID	Ljava/lang/String;
    //   146: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   149: getfield 192	com/tencent/mm/plugin/backup/a/e:jKZ	Ljava/lang/String;
    //   152: invokevirtual 204	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifeq +383 -> 538
    //   158: aload 6
    //   160: getfield 181	com/tencent/mm/plugin/backup/h/v:jXN	I
    //   163: ifne +163 -> 326
    //   166: aload 6
    //   168: getfield 208	com/tencent/mm/plugin/backup/h/v:jWD	Lcom/tencent/mm/bl/b;
    //   171: getfield 214	com/tencent/mm/bl/b:toK	[B
    //   174: astore_3
    //   175: aload 6
    //   177: getfield 217	com/tencent/mm/plugin/backup/h/v:jXQ	I
    //   180: getstatic 222	com/tencent/mm/plugin/backup/bakoldlogic/a/b:jSK	I
    //   183: iand
    //   184: ifne +231 -> 415
    //   187: aload_0
    //   188: iconst_0
    //   189: putfield 59	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jNG	Z
    //   192: new 224	com/tencent/mm/plugin/backup/h/w
    //   195: dup
    //   196: invokespecial 225	com/tencent/mm/plugin/backup/h/w:<init>	()V
    //   199: astore 7
    //   201: aload 7
    //   203: iconst_0
    //   204: putfield 226	com/tencent/mm/plugin/backup/h/w:jXN	I
    //   207: aload 7
    //   209: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   212: getfield 192	com/tencent/mm/plugin/backup/a/e:jKZ	Ljava/lang/String;
    //   215: putfield 227	com/tencent/mm/plugin/backup/h/w:ID	Ljava/lang/String;
    //   218: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   221: getfield 230	com/tencent/mm/plugin/backup/a/e:jLa	Ljava/lang/String;
    //   224: new 200	java/lang/String
    //   227: dup
    //   228: aload_3
    //   229: invokestatic 234	com/tencent/mm/plugin/backup/a/e:adK	()[B
    //   232: invokestatic 239	com/tencent/mm/a/k:a	([B[B)[B
    //   235: invokespecial 242	java/lang/String:<init>	([B)V
    //   238: invokevirtual 204	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   241: ifeq +225 -> 466
    //   244: ldc 109
    //   246: ldc -12
    //   248: invokestatic 246	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: aload 7
    //   253: iconst_0
    //   254: putfield 249	com/tencent/mm/plugin/backup/h/w:jXo	I
    //   257: aload 7
    //   259: new 210	com/tencent/mm/bl/b
    //   262: dup
    //   263: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   266: getfield 252	com/tencent/mm/plugin/backup/a/e:jLb	Ljava/lang/String;
    //   269: invokevirtual 255	java/lang/String:getBytes	()[B
    //   272: invokestatic 234	com/tencent/mm/plugin/backup/a/e:adK	()[B
    //   275: invokestatic 258	com/tencent/mm/a/k:b	([B[B)[B
    //   278: invokespecial 259	com/tencent/mm/bl/b:<init>	([B)V
    //   281: putfield 260	com/tencent/mm/plugin/backup/h/w:jWD	Lcom/tencent/mm/bl/b;
    //   284: invokestatic 266	com/tencent/mm/k/g:uz	()Lcom/tencent/mm/k/e;
    //   287: ldc_w 268
    //   290: invokevirtual 274	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   293: iconst_0
    //   294: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   297: ifne +17 -> 314
    //   300: aload 7
    //   302: aload 7
    //   304: getfield 279	com/tencent/mm/plugin/backup/h/w:jXQ	I
    //   307: getstatic 222	com/tencent/mm/plugin/backup/bakoldlogic/a/b:jSK	I
    //   310: ior
    //   311: putfield 279	com/tencent/mm/plugin/backup/h/w:jXQ	I
    //   314: aload 7
    //   316: invokevirtual 282	com/tencent/mm/plugin/backup/h/w:toByteArray	()[B
    //   319: iconst_2
    //   320: iload 4
    //   322: invokestatic 287	com/tencent/mm/plugin/backup/f/b:d	([BII)Z
    //   325: pop
    //   326: aload 6
    //   328: getfield 181	com/tencent/mm/plugin/backup/h/v:jXN	I
    //   331: iconst_1
    //   332: if_icmpne +235 -> 567
    //   335: aload 6
    //   337: getfield 208	com/tencent/mm/plugin/backup/h/v:jWD	Lcom/tencent/mm/bl/b;
    //   340: getfield 214	com/tencent/mm/bl/b:toK	[B
    //   343: astore_3
    //   344: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   347: getfield 252	com/tencent/mm/plugin/backup/a/e:jLb	Ljava/lang/String;
    //   350: new 200	java/lang/String
    //   353: dup
    //   354: aload_3
    //   355: invokestatic 234	com/tencent/mm/plugin/backup/a/e:adK	()[B
    //   358: invokestatic 239	com/tencent/mm/a/k:a	([B[B)[B
    //   361: invokespecial 242	java/lang/String:<init>	([B)V
    //   364: invokevirtual 204	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   367: ifeq +149 -> 516
    //   370: ldc 109
    //   372: ldc_w 289
    //   375: invokestatic 246	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   378: aload_0
    //   379: iconst_1
    //   380: putfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTT	Z
    //   383: aload_0
    //   384: getfield 124	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTW	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f$a;
    //   387: ifnull +112 -> 499
    //   390: aload_0
    //   391: getfield 124	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTW	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f$a;
    //   394: invokeinterface 292 1 0
    //   399: ldc2_w 140
    //   402: ldc -114
    //   404: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   407: return
    //   408: aload_3
    //   409: arraylength
    //   410: istore 5
    //   412: goto -397 -> 15
    //   415: aload_0
    //   416: iconst_1
    //   417: putfield 59	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jNG	Z
    //   420: goto -228 -> 192
    //   423: astore_3
    //   424: aload_0
    //   425: iconst_0
    //   426: putfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTT	Z
    //   429: ldc 109
    //   431: aload_3
    //   432: ldc -96
    //   434: iconst_0
    //   435: anewarray 4	java/lang/Object
    //   438: invokestatic 296	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   441: ldc 109
    //   443: ldc_w 298
    //   446: iconst_1
    //   447: anewarray 4	java/lang/Object
    //   450: dup
    //   451: iconst_0
    //   452: aload_3
    //   453: aastore
    //   454: invokestatic 301	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   457: ldc2_w 140
    //   460: ldc -114
    //   462: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   465: return
    //   466: aload 7
    //   468: iconst_1
    //   469: putfield 249	com/tencent/mm/plugin/backup/h/w:jXo	I
    //   472: ldc 109
    //   474: ldc_w 303
    //   477: invokestatic 305	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   480: goto -166 -> 314
    //   483: astore_3
    //   484: ldc 109
    //   486: aload_3
    //   487: ldc -96
    //   489: iconst_0
    //   490: anewarray 4	java/lang/Object
    //   493: invokestatic 296	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   496: goto -170 -> 326
    //   499: ldc 109
    //   501: ldc_w 307
    //   504: invokestatic 310	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   507: ldc2_w 140
    //   510: ldc -114
    //   512: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   515: return
    //   516: ldc 109
    //   518: ldc_w 312
    //   521: invokestatic 305	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   524: aload_0
    //   525: iconst_0
    //   526: putfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTT	Z
    //   529: ldc2_w 140
    //   532: ldc -114
    //   534: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   537: return
    //   538: ldc 109
    //   540: ldc_w 314
    //   543: iconst_2
    //   544: anewarray 4	java/lang/Object
    //   547: dup
    //   548: iconst_0
    //   549: invokestatic 187	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:aft	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   552: getfield 192	com/tencent/mm/plugin/backup/a/e:jKZ	Ljava/lang/String;
    //   555: aastore
    //   556: dup
    //   557: iconst_1
    //   558: aload 6
    //   560: getfield 177	com/tencent/mm/plugin/backup/h/v:ID	Ljava/lang/String;
    //   563: aastore
    //   564: invokestatic 301	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   567: ldc2_w 140
    //   570: ldc -114
    //   572: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   575: return
    //   576: aload_0
    //   577: getfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:jTT	Z
    //   580: ifne +39 -> 619
    //   583: ldc 109
    //   585: ldc_w 316
    //   588: iconst_2
    //   589: anewarray 4	java/lang/Object
    //   592: dup
    //   593: iconst_0
    //   594: iload_2
    //   595: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   598: aastore
    //   599: dup
    //   600: iconst_1
    //   601: iload 4
    //   603: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   606: aastore
    //   607: invokestatic 318	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   610: ldc2_w 140
    //   613: ldc -114
    //   615: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   618: return
    //   619: iload_2
    //   620: iconst_3
    //   621: if_icmpne +9 -> 630
    //   624: aload_0
    //   625: iload 4
    //   627: invokevirtual 322	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:kw	(I)V
    //   630: iload_2
    //   631: iconst_5
    //   632: if_icmpne +7 -> 639
    //   635: aload_0
    //   636: invokespecial 324	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f:afD	()V
    //   639: ldc2_w 140
    //   642: ldc -114
    //   644: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   647: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	648	0	this	f
    //   0	648	1	paramBoolean	boolean
    //   0	648	2	paramInt1	int
    //   0	648	3	paramArrayOfByte	byte[]
    //   0	648	4	paramInt2	int
    //   13	398	5	i	int
    //   79	480	6	localv	com.tencent.mm.plugin.backup.h.v
    //   199	268	7	localw	com.tencent.mm.plugin.backup.h.w
    // Exception table:
    //   from	to	target	type
    //   81	141	423	java/io/IOException
    //   141	192	423	java/io/IOException
    //   192	314	423	java/io/IOException
    //   326	407	423	java/io/IOException
    //   415	420	423	java/io/IOException
    //   466	480	423	java/io/IOException
    //   484	496	423	java/io/IOException
    //   499	515	423	java/io/IOException
    //   516	537	423	java/io/IOException
    //   538	567	423	java/io/IOException
    //   314	326	483	java/io/IOException
  }
  
  public final void adE()
  {
    GMTrace.i(14747172864000L, 109875);
    if (this.jTU != null) {
      this.jTU.adE();
    }
    GMTrace.o(14747172864000L, 109875);
  }
  
  public final void afq()
  {
    GMTrace.i(14747441299456L, 109877);
    if (this.jTV != null) {
      this.jTV.afq();
    }
    GMTrace.o(14747441299456L, 109877);
  }
  
  public final void afy()
  {
    GMTrace.i(14747038646272L, 109874);
    int i = (int)(System.currentTimeMillis() - this.jUa);
    com.tencent.mm.plugin.backup.h.d locald = new com.tencent.mm.plugin.backup.h.d();
    locald.ID = a.aft().jKZ;
    if ((this.jNG) && (bg.getInt(g.uz().getValue("ChattingRecordsKvstatDisable"), 0) == 0))
    {
      locald.jWF = this.jTX.size();
      locald.jWG = this.jTZ.value;
      locald.jWH = this.jTS.jTH;
      locald.jWI = ((int)(this.jTY.value / 1024L));
      locald.jWJ = ((int)(this.jTS.jTI / 1024L));
      locald.jWK = this.jTS.jTF;
      locald.jWL = this.jTS.jTG;
      locald.jWM = i;
      locald.jWN = com.tencent.mm.protocal.d.toX;
      w.i("MicroMsg.MoveBakServer", "NewBakMoveInfoKvstat, Server, ServerSessionCount:%d, ServerMessageCount:%d, ServerFileCount:%d, CalculateSize:%d, ServerDataPushSize:%d, ServerReadDBTotalTime:%d, ServerReadFileTotalTime:%d, ServerCostTotalTime:%d, ServerVersion:%x", new Object[] { Integer.valueOf(locald.jWF), Integer.valueOf(locald.jWG), Integer.valueOf(locald.jWH), Integer.valueOf(locald.jWI), Integer.valueOf(locald.jWJ), Integer.valueOf(locald.jWK), Integer.valueOf(locald.jWL), Integer.valueOf(locald.jWM), Integer.valueOf(locald.jWN) });
    }
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(locald.toByteArray(), 8);
      if (this.jTU != null) {
        this.jTU.afy();
      }
      GMTrace.o(14747038646272L, 109874);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MoveBakServer", "onNetFinish parse req failed");
        w.printErrStackTrace("MicroMsg.MoveBakServer", localException, "", new Object[0]);
      }
    }
  }
  
  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(14746770210816L, 109872);
    if (this.jTU != null) {
      this.jTU.b(paramLong1, paramLong2, paramInt);
    }
    GMTrace.o(14746770210816L, 109872);
  }
  
  public final void bH(int paramInt1, int paramInt2)
  {
    GMTrace.i(14746904428544L, 109873);
    GMTrace.o(14746904428544L, 109873);
  }
  
  public final void bI(boolean paramBoolean)
  {
    GMTrace.i(14746099122176L, 109867);
    com.tencent.mm.plugin.backup.h.a locala;
    if (!paramBoolean)
    {
      locala = new com.tencent.mm.plugin.backup.h.a();
      locala.ID = a.aft().jKZ;
    }
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      afD();
      GMTrace.o(14746099122176L, 109867);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MoveBakServer", localIOException, "", new Object[0]);
      }
    }
  }
  
  public final void kw(final int paramInt)
  {
    GMTrace.i(14746501775360L, 109870);
    n(0, 0L);
    com.tencent.mm.plugin.backup.g.a.afe().afh();
    List localList = this.jTX;
    PLong localPLong = this.jTY;
    PInt localPInt = this.jTZ;
    this.jTX = localList;
    this.jTY = localPLong;
    this.jTZ = localPInt;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14748246605824L, 109883);
        if ((f.this.jTX == null) || (f.this.jTY == null) || (f.this.jTZ == null))
        {
          f.this.jTY = new PLong();
          f.this.jTZ = new PInt();
          if (f.this.jTM != null) {
            f.this.jTM.cancel();
          }
          f.this.jTM = new com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a(f.this, null);
          f.this.jTX = f.this.jTM.a(f.this.jTY, f.this.jTZ);
          if ((f.this.jTX == null) || (f.this.jTY == null) || (f.this.jTZ == null))
          {
            w.e("MicroMsg.MoveBakServer", "isCancel, quit.");
            GMTrace.o(14748246605824L, 109883);
            return;
          }
          f.this.a(f.this.jTX, f.this.jTY, f.this.jTZ);
        }
        w.i("MicroMsg.MoveBakServer", "transfer conversation size:%d, addupSize:%d, pCount:%d", new Object[] { Integer.valueOf(f.this.jTX.size()), Long.valueOf(f.this.jTY.value), Integer.valueOf(f.this.jTZ.value) });
        for (;;)
        {
          synchronized (f.this.lock)
          {
            if (f.this.jTX == null)
            {
              f.this.jTS = null;
              GMTrace.o(14748246605824L, 109883);
              return;
            }
            if (f.this.jTS != null) {
              f.this.jTS.cancel();
            }
            f.this.jTS = new b();
            ??? = new o();
            ((o)???).ID = a.aft().jKZ;
            ((o)???).jXm = f.this.jTX.size();
            ((o)???).jXn = f.this.jTY.value;
            ((o)???).jXo = 0;
            if (f.this.jNE)
            {
              i = com.tencent.mm.plugin.backup.bakoldlogic.a.b.jKK;
              ((o)???).jXp = i;
            }
          }
          try
          {
            com.tencent.mm.plugin.backup.f.b.d(((o)???).toByteArray(), 4, paramInt);
            ??? = f.this.jTS;
            List localList = f.this.jTX;
            long l2 = f.this.jTY.value;
            ((b)???).jTx = localList;
            ((b)???).fBD = false;
            ((b)???).hng = false;
            ((b)???).jTB = false;
            long l1 = l2;
            if (l2 == 0L) {
              l1 = l2 + 1L;
            }
            ((b)???).jTC = l1;
            ((b)???).jTD = 0L;
            ((b)???).jTE = 0;
            ((b)???).jTy.clear();
            h.setProgress(0);
            f.this.jTS.jTz = f.this;
            f.this.jUa = System.currentTimeMillis();
            com.tencent.mm.sdk.f.e.d(new b.1(f.this.jTS), "BakPCServer_startBak", 1).start();
            GMTrace.o(14748246605824L, 109883);
            return;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.MoveBakServer", "prase resp error!!");
            w.printErrStackTrace("MicroMsg.MoveBakServer", localIOException, "", new Object[0]);
            GMTrace.o(14748246605824L, 109883);
          }
          localObject2 = finally;
          throw ((Throwable)localObject2);
          int i = com.tencent.mm.plugin.backup.bakoldlogic.a.b.jKJ;
        }
      }
    }, "MoveBakServer.calcelate");
    GMTrace.o(14746501775360L, 109870);
  }
  
  public final void n(int paramInt, long paramLong)
  {
    GMTrace.i(14747307081728L, 109876);
    w.i("MicroMsg.MoveBakServer", "onCalcuProgress progress:%d, calcuSize%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    if (this.jTV != null) {
      this.jTV.n(paramInt, paramLong);
    }
    GMTrace.o(14747307081728L, 109876);
  }
  
  public final void onError(int paramInt, String paramString)
  {
    GMTrace.i(14746635993088L, 109871);
    if (this.jTU != null) {
      this.jTU.onError(paramInt, paramString);
    }
    GMTrace.o(14746635993088L, 109871);
  }
  
  public static abstract interface a
  {
    public abstract void afE();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */