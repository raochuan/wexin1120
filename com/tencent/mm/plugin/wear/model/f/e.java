package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.protocal.c.bpv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.x.m;
import java.io.IOException;
import java.util.List;

public final class e
  extends c
{
  public e()
  {
    GMTrace.i(9191632666624L, 68483);
    GMTrace.o(9191632666624L, 68483);
  }
  
  public final String getName()
  {
    GMTrace.i(9191901102080L, 68485);
    GMTrace.o(9191901102080L, 68485);
    return "WearFailMsgCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9191766884352L, 68484);
    int i = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aNc().aNi().size();
    bpv localbpv = new bpv();
    localbpv.mGz = a.bzo().shj.Ka(m.zF()).id;
    localbpv.fuw = ab.getContext().getString(R.l.bis);
    localbpv.ovi = ab.getContext().getString(R.l.esc, new Object[] { Integer.valueOf(i) });
    try
    {
      a.bzo();
      r.a(20005, localbpv.toByteArray(), true);
      GMTrace.o(9191766884352L, 68484);
      return;
    }
    catch (IOException localIOException)
    {
      GMTrace.o(9191766884352L, 68484);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */