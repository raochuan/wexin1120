package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brc
  extends com.tencent.mm.bl.a
{
  public int uGl;
  public long uGm;
  
  public brc()
  {
    GMTrace.i(3875000025088L, 28871);
    GMTrace.o(3875000025088L, 28871);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3875134242816L, 28872);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uGl);
      paramVarArgs.R(2, this.uGm);
      GMTrace.o(3875134242816L, 28872);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.uGl);
      int i = b.a.a.a.Q(2, this.uGm);
      GMTrace.o(3875134242816L, 28872);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3875134242816L, 28872);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brc localbrc = (brc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3875134242816L, 28872);
        return -1;
      case 1: 
        localbrc.uGl = locala.xSv.nm();
        GMTrace.o(3875134242816L, 28872);
        return 0;
      }
      localbrc.uGm = locala.xSv.nn();
      GMTrace.o(3875134242816L, 28872);
      return 0;
    }
    GMTrace.o(3875134242816L, 28872);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */