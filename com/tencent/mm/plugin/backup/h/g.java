package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class g
  extends com.tencent.mm.bl.a
{
  public String jWO;
  public int jWP;
  
  public g()
  {
    GMTrace.i(14832803774464L, 110513);
    GMTrace.o(14832803774464L, 110513);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832937992192L, 110514);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWO == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.jWO != null) {
        paramVarArgs.e(1, this.jWO);
      }
      paramVarArgs.fd(2, this.jWP);
      GMTrace.o(14832937992192L, 110514);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWO == null) {
        break label318;
      }
    }
    label318:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWO) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.jWP);
      GMTrace.o(14832937992192L, 110514);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jWO == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        GMTrace.o(14832937992192L, 110514);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        g localg = (g)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14832937992192L, 110514);
          return -1;
        case 1: 
          localg.jWO = locala.xSv.readString();
          GMTrace.o(14832937992192L, 110514);
          return 0;
        }
        localg.jWP = locala.xSv.nm();
        GMTrace.o(14832937992192L, 110514);
        return 0;
      }
      GMTrace.o(14832937992192L, 110514);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */