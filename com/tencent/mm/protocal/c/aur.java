package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aur
  extends com.tencent.mm.bl.a
{
  public String info;
  public int tKO;
  public int tKP;
  
  public aur()
  {
    GMTrace.i(4034853339136L, 30062);
    GMTrace.o(4034853339136L, 30062);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4034987556864L, 30063);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tKO);
      paramVarArgs.fd(2, this.tKP);
      if (this.info != null) {
        paramVarArgs.e(3, this.info);
      }
      GMTrace.o(4034987556864L, 30063);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tKO) + 0 + b.a.a.a.fa(2, this.tKP);
      paramInt = i;
      if (this.info != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.info);
      }
      GMTrace.o(4034987556864L, 30063);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4034987556864L, 30063);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aur localaur = (aur)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4034987556864L, 30063);
        return -1;
      case 1: 
        localaur.tKO = locala.xSv.nm();
        GMTrace.o(4034987556864L, 30063);
        return 0;
      case 2: 
        localaur.tKP = locala.xSv.nm();
        GMTrace.o(4034987556864L, 30063);
        return 0;
      }
      localaur.info = locala.xSv.readString();
      GMTrace.o(4034987556864L, 30063);
      return 0;
    }
    GMTrace.o(4034987556864L, 30063);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */