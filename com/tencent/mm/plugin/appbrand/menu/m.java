package com.tencent.mm.plugin.appbrand.menu;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class m
{
  public Map<Integer, com.tencent.mm.plugin.appbrand.menu.a.a> jiv;
  
  public m()
  {
    GMTrace.i(15553284538368L, 115881);
    this.jiv = new HashMap();
    a(new a());
    a(new f());
    a(new b());
    a(new MenuDelegate_SendToDesktop());
    a(new g());
    a(new i());
    a(new j());
    a(new MenuDelegate_EnableDebug());
    a(new h());
    a(new e());
    a(new d());
    a(new c());
    GMTrace.o(15553284538368L, 115881);
  }
  
  private void a(com.tencent.mm.plugin.appbrand.menu.a.a parama)
  {
    GMTrace.i(15554224062464L, 115888);
    this.jiv.put(Integer.valueOf(parama.jix), parama);
    GMTrace.o(15554224062464L, 115888);
  }
  
  public static void a(List<k> paramList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15554089844736L, 115887);
    k localk = new k(paramInt);
    localk.jih = paramBoolean;
    paramList.add(localk);
    GMTrace.o(15554089844736L, 115887);
  }
  
  public static k d(List<k> paramList, int paramInt)
  {
    GMTrace.i(15553955627008L, 115886);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(15553955627008L, 115886);
      return null;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      k localk = (k)paramList.next();
      if ((localk != null) && (localk.id == paramInt))
      {
        GMTrace.o(15553955627008L, 115886);
        return localk;
      }
    }
    GMTrace.o(15553955627008L, 115886);
    return null;
  }
  
  private static final class a
  {
    public static m jiw;
    
    static
    {
      GMTrace.i(19693498793984L, 146728);
      jiw = new m();
      GMTrace.o(19693498793984L, 146728);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */