package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aui;
import com.tencent.mm.protocal.c.awc;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;

public final class l
  implements b<k>
{
  protected k rCc;
  public final c rCd;
  public final a rCe;
  public final b rCf;
  
  public l()
  {
    this(new k());
    GMTrace.i(18414940717056L, 137202);
    GMTrace.o(18414940717056L, 137202);
  }
  
  public l(k paramk)
  {
    GMTrace.i(18415074934784L, 137203);
    this.rCd = new c();
    this.rCe = new a();
    this.rCf = new b();
    this.rCc = paramk;
    GMTrace.o(18415074934784L, 137203);
  }
  
  public final class a
    implements e<awc, Integer>
  {
    public a()
    {
      GMTrace.i(18416551329792L, 137214);
      GMTrace.o(18416551329792L, 137214);
    }
    
    public final String PD()
    {
      GMTrace.i(18416685547520L, 137215);
      GMTrace.o(18416685547520L, 137215);
      return "Vending.UI";
    }
  }
  
  public final class b
    implements e<Void, Void>
  {
    public b()
    {
      GMTrace.i(18417356636160L, 137220);
      GMTrace.o(18417356636160L, 137220);
    }
    
    public final String PD()
    {
      GMTrace.i(18417490853888L, 137221);
      GMTrace.o(18417490853888L, 137221);
      return "Vending.UI";
    }
  }
  
  public final class c
    implements e<aui, Integer>
  {
    public c()
    {
      GMTrace.i(18420175208448L, 137241);
      GMTrace.o(18420175208448L, 137241);
    }
    
    public final String PD()
    {
      GMTrace.i(18420309426176L, 137242);
      GMTrace.o(18420309426176L, 137242);
      return "Vending.UI";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */