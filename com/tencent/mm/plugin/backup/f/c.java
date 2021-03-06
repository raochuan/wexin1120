package com.tencent.mm.plugin.backup.f;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.bl.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.x.ap;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.LinkedList;

public final class c
  extends b
{
  public static String TAG;
  private com.tencent.mm.ac.e hnC;
  public x jRj;
  y jRk;
  int jRl;
  PByteArray jRm;
  public a jRn;
  
  static
  {
    GMTrace.i(9515902697472L, 70899);
    TAG = "MicroMsg.dkBackupDataPush";
    GMTrace.o(9515902697472L, 70899);
  }
  
  private c(final b paramb, String paramString, a parama, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811865808896L, 110357);
    this.jRj = new x();
    this.jRk = new y();
    this.jRl = 0;
    this.jRm = new PByteArray();
    this.jRn = null;
    this.jRj.jXS = paramString;
    this.jRj.jXT = 2;
    this.hnC = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(9511070859264L, 70863);
        paramAnonymousString = (c)paramAnonymousk;
        paramAnonymousk = paramb;
        c.a locala = paramAnonymousString.jRn;
        if ((!locala.jRq.contains(paramAnonymousString)) && (paramAnonymousString.jRj.jXT == 2)) {
          w.e(c.TAG, "!!!!!Error checkSceneAllFinish media scene not in sceneHashSet");
        }
        locala.jRq.remove(paramAnonymousString);
        paramAnonymousk.c(locala.jRq.isEmpty(), paramAnonymousString.jRj.jXS, paramAnonymousString.aeZ());
        GMTrace.o(9511070859264L, 70863);
      }
    };
    this.jRn = parama;
    parama.jRq.add(this);
    paramb = this.jRn;
    if (paramb.hld <= 0)
    {
      paramb = new Pair(Integer.valueOf(0), new byte[0]);
      if ((paramb.second == null) || (paramb.first == null))
      {
        w.w(TAG, "doScene Error Read OVERFLOW    file:%s", new Object[] { this.jRn.filePath });
        this.jRj.jWD = null;
        GMTrace.o(14811865808896L, 110357);
      }
    }
    else
    {
      if (paramb.hld - paramb.offset > 524288L) {}
      int i;
      for (long l = 524288L;; l = paramb.hld - paramb.offset)
      {
        i = (int)l;
        paramString = new byte[i];
        if (paramb.jRr == null) {
          break label281;
        }
        System.arraycopy(paramb.jRr, paramb.offset, paramString, 0, i);
        int j = paramb.offset;
        paramb.offset += i;
        paramb = new Pair(Integer.valueOf(j), paramString);
        break;
      }
      label281:
      if (i < 524288L) {}
      for (bool = true;; bool = false)
      {
        paramb.a(paramString, bool);
        break;
      }
    }
    paramString = (byte[])paramb.second;
    this.jRj.jXU = this.jRn.hld;
    this.jRj.jXV = ((Integer)paramb.first).intValue();
    this.jRj.jXW = (this.jRj.jXV + paramString.length);
    paramb = this.jRj;
    if (this.jRj.jXW == this.jRj.jXU) {}
    for (boolean bool = true;; bool = false)
    {
      paramb.jWD = a(paramString, bool, paramArrayOfByte);
      aeY();
      GMTrace.o(14811865808896L, 110357);
      return;
    }
  }
  
  private c(final b paramb, String paramString, LinkedList<eh> paramLinkedList, byte[] paramArrayOfByte)
  {
    GMTrace.i(14812000026624L, 110358);
    this.jRj = new x();
    this.jRk = new y();
    this.jRl = 0;
    this.jRm = new PByteArray();
    this.jRn = null;
    this.jRj.jXS = paramString;
    this.jRj.jXT = 1;
    this.hnC = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(9505031061504L, 70818);
        paramAnonymousString = (c)paramAnonymousk;
        paramb.c(true, paramAnonymousString.jRj.jXS, paramAnonymousString.aeZ());
        GMTrace.o(9505031061504L, 70818);
      }
    };
    try
    {
      paramb = new ei();
      paramb.jWR = paramLinkedList;
      paramb.jWQ = paramLinkedList.size();
      paramb = paramb.toByteArray();
      paramString = paramb;
      if (paramb == null) {
        paramString = new byte[0];
      }
      this.jRj.jXV = 0;
      this.jRj.jXW = paramString.length;
      this.jRj.jXU = paramString.length;
      this.jRj.jWD = a(paramString, true, paramArrayOfByte);
      aeY();
      GMTrace.o(14812000026624L, 110358);
      return;
    }
    catch (Exception paramb)
    {
      paramString = TAG;
      if (paramLinkedList != null) {}
    }
    for (int i = -1;; i = paramLinkedList.size())
    {
      w.e(paramString, "ERROR: BakChatMsgList to Buffer list:%d :%s", new Object[] { Integer.valueOf(i), paramb.getMessage() });
      paramb = null;
      break;
    }
  }
  
  private static com.tencent.mm.bl.b a(byte[] paramArrayOfByte1, boolean paramBoolean, byte[] paramArrayOfByte2)
  {
    GMTrace.i(14812134244352L, 110359);
    if ((bg.bq(paramArrayOfByte2) > 0) && (bg.bq(paramArrayOfByte1) > 0))
    {
      paramArrayOfByte1 = new com.tencent.mm.bl.b(AesEcb.aesCryptEcb(paramArrayOfByte1, paramArrayOfByte2, true, paramBoolean));
      GMTrace.o(14812134244352L, 110359);
      return paramArrayOfByte1;
    }
    paramArrayOfByte1 = new com.tencent.mm.bl.b(paramArrayOfByte1);
    GMTrace.o(14812134244352L, 110359);
    return paramArrayOfByte1;
  }
  
  public static void a(b paramb, c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811597373440L, 110355);
    paramString2 = new a(paramString2);
    int i;
    if (paramString2.hld <= 0) {
      i = 1;
    }
    for (;;)
    {
      new LinkedList();
      int j = 0;
      while (j < i)
      {
        paramc.a(new c(paramb, paramString1, paramString2, paramArrayOfByte));
        j += 1;
      }
      j = (int)(paramString2.hld / 524288L);
      i = j;
      if (paramString2.hld % 524288L != 0L) {
        i = j + 1;
      }
    }
    GMTrace.o(14811597373440L, 110355);
  }
  
  public static void a(b paramb, c paramc, String paramString, LinkedList<eh> paramLinkedList, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811731591168L, 110356);
    paramc.a(new c(paramb, paramString, paramLinkedList, paramArrayOfByte));
    GMTrace.o(14811731591168L, 110356);
  }
  
  private void aeY()
  {
    GMTrace.i(9514694737920L, 70890);
    this.jRl = aeX();
    try
    {
      com.tencent.mm.plugin.backup.e.c.a(this.jRj.toByteArray(), this.jRl, (short)6, this.jRm, b.jLd);
      GMTrace.o(9514694737920L, 70890);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace(TAG, localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9514694737920L, 70890);
    }
  }
  
  public final a aeP()
  {
    GMTrace.i(9515231608832L, 70894);
    y localy = this.jRk;
    GMTrace.o(9515231608832L, 70894);
    return localy;
  }
  
  public final a aeQ()
  {
    GMTrace.i(15404302860288L, 114771);
    x localx = this.jRj;
    GMTrace.o(15404302860288L, 114771);
    return localx;
  }
  
  public final void aeR()
  {
    GMTrace.i(9514560520192L, 70889);
    this.hnC.a(0, this.jRk.jXo, "", this);
    GMTrace.o(9514560520192L, 70889);
  }
  
  public final boolean aeV()
  {
    GMTrace.i(9514828955648L, 70891);
    byte[] arrayOfByte = this.jRm.value;
    int i = this.jRl;
    long l = System.currentTimeMillis();
    int j = b.jRc.j(i, arrayOfByte);
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene [%d] ret:%d sendSeq:%d, type:%d, len:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(getType()), Integer.valueOf(arrayOfByte.length) });
    GMTrace.o(9514828955648L, 70891);
    return true;
  }
  
  public final int aeZ()
  {
    GMTrace.i(9515097391104L, 70893);
    if (this.jRm.value == null)
    {
      GMTrace.o(9515097391104L, 70893);
      return 0;
    }
    int i = this.jRm.value.length;
    GMTrace.o(9515097391104L, 70893);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(15404437078016L, 114772);
    GMTrace.o(15404437078016L, 114772);
    return 6;
  }
  
  private static final class a
  {
    String filePath;
    int hld;
    HashSet<c> jRq;
    byte[] jRr;
    private FileInputStream jRs;
    int offset;
    
    public a(String paramString)
    {
      GMTrace.i(9499393916928L, 70776);
      this.jRq = new HashSet();
      this.hld = 0;
      this.filePath = null;
      this.offset = 0;
      this.jRr = null;
      this.jRs = null;
      this.filePath = paramString;
      this.jRr = null;
      paramString = this.filePath;
      ap.AS();
      int i;
      if (!paramString.startsWith(com.tencent.mm.x.c.zc()))
      {
        i = 0;
        if (i == 0) {
          break label225;
        }
      }
      label225:
      for (this.hld = bg.bq(this.jRr);; this.hld = com.tencent.mm.a.e.aY(this.filePath))
      {
        if (this.hld < 0) {
          this.hld = 0;
        }
        GMTrace.o(9499393916928L, 70776);
        return;
        paramString = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
        paramString = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vr(paramString);
        if (paramString == null)
        {
          i = 0;
          break;
        }
        if ((paramString.field_reserved4 & EmojiInfo.vgD) != EmojiInfo.vgD)
        {
          i = 0;
          break;
        }
        this.jRr = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(paramString);
        if (bg.bq(this.jRr) <= 0)
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
    }
    
    final boolean a(byte[] paramArrayOfByte, boolean paramBoolean)
    {
      GMTrace.i(9499528134656L, 70777);
      try
      {
        if (this.jRs == null) {
          this.jRs = new FileInputStream(this.filePath);
        }
        int i = this.jRs.read(paramArrayOfByte);
        int j = paramArrayOfByte.length;
        if (i != j)
        {
          GMTrace.o(9499528134656L, 70777);
          return false;
        }
        if (paramBoolean) {
          this.jRs.close();
        }
        GMTrace.o(9499528134656L, 70777);
        return true;
      }
      catch (Exception paramArrayOfByte)
      {
        GMTrace.o(9499528134656L, 70777);
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract void c(boolean paramBoolean, String paramString, int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void a(c paramc);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */