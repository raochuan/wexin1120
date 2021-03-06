package com.tencent.mm.plugin.aa.a.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class d
  extends i<c>
{
  public static final String[] gMz;
  private static final String[] ihy;
  public static Map<String, c> ihz;
  private e gMB;
  
  static
  {
    GMTrace.i(5587081363456L, 41627);
    gMz = new String[] { i.a(c.gLR, "AARecord") };
    ihy = new String[] { "*", "rowid" };
    ihz = new HashMap();
    GMTrace.o(5587081363456L, 41627);
  }
  
  public d(e parame)
  {
    super(parame, c.gLR, "AARecord", null);
    GMTrace.i(5586812928000L, 41625);
    this.gMB = parame;
    GMTrace.o(5586812928000L, 41625);
  }
  
  public final boolean a(c paramc)
  {
    GMTrace.i(18433999634432L, 137344);
    if ((paramc != null) && (ihz.containsKey(paramc.field_billNo))) {
      ihz.put(paramc.field_billNo, paramc);
    }
    boolean bool = super.b(paramc);
    GMTrace.o(18433999634432L, 137344);
    return bool;
  }
  
  public final boolean a(c paramc, String... paramVarArgs)
  {
    GMTrace.i(18434133852160L, 137345);
    if ((paramc != null) && (ihz.containsKey(paramc.field_billNo))) {
      ihz.remove(paramc.field_billNo);
    }
    boolean bool = super.a(paramc, paramVarArgs);
    GMTrace.o(18434133852160L, 137345);
    return bool;
  }
  
  public final boolean b(c paramc)
  {
    GMTrace.i(18434268069888L, 137346);
    if ((paramc != null) && (ihz.containsKey(paramc.field_billNo))) {
      ihz.put(paramc.field_billNo, paramc);
    }
    boolean bool = super.a(paramc);
    GMTrace.o(18434268069888L, 137346);
    return bool;
  }
  
  public final c ni(String paramString)
  {
    GMTrace.i(5586947145728L, 41626);
    if (bg.mZ(paramString))
    {
      GMTrace.o(5586947145728L, 41626);
      return null;
    }
    paramString = this.gMB.a("AARecord", ihy, "billNo=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(5586947145728L, 41626);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AARecordStorage", "getRecordByBillno error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label159;
      }
      paramString.close();
    }
    GMTrace.o(5586947145728L, 41626);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */