package com.tencent.mm.plugin.favorite.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class e
  extends c
{
  public e(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16649977593856L, 124052);
    GMTrace.o(16649977593856L, 124052);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18032017539072L, 134349);
    f localf = new f();
    localf.mku = 1;
    localf.fIW = this.fIW;
    localf.mkx = 1;
    localf.mky = paramHashSet;
    localf.handler = paramae;
    localf.mkA = this;
    paramae = ((l)h.j(l.class)).search(6, localf);
    GMTrace.o(18032017539072L, 134349);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16650380247040L, 124055);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        localObject = new a(paramInt);
        ((a)localObject).iOg = locali;
        ((a)localObject).iOh = parama.iOh;
        ((a)localObject).cf(locali.type, locali.hJy);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
    }
    GMTrace.o(16650380247040L, 124055);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18032151756800L, 134350);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -1;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnk = paramg;
      if (paramHashSet.mnk.size() > 1)
      {
        paramHashSet.mnj = true;
        paramHashSet.mnk = paramHashSet.mnk.subList(0, 1);
      }
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18032151756800L, 134350);
  }
  
  public final int getType()
  {
    GMTrace.i(6436142710784L, 47953);
    GMTrace.o(6436142710784L, 47953);
    return 128;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */