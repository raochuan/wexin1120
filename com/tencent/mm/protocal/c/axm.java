package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class axm
  extends com.tencent.mm.bl.a
{
  public String mDg;
  public int mEi;
  public String urW;
  
  public axm()
  {
    GMTrace.i(19142937673728L, 142626);
    GMTrace.o(19142937673728L, 142626);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19143071891456L, 142627);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urW != null) {
        paramVarArgs.e(1, this.urW);
      }
      paramVarArgs.fd(2, this.mEi);
      if (this.mDg != null) {
        paramVarArgs.e(3, this.mDg);
      }
      GMTrace.o(19143071891456L, 142627);
      return 0;
    }
    if (paramInt == 1) {
      if (this.urW == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.urW) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.mEi);
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mDg);
      }
      GMTrace.o(19143071891456L, 142627);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(19143071891456L, 142627);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        axm localaxm = (axm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19143071891456L, 142627);
          return -1;
        case 1: 
          localaxm.urW = locala.xSv.readString();
          GMTrace.o(19143071891456L, 142627);
          return 0;
        case 2: 
          localaxm.mEi = locala.xSv.nm();
          GMTrace.o(19143071891456L, 142627);
          return 0;
        }
        localaxm.mDg = locala.xSv.readString();
        GMTrace.o(19143071891456L, 142627);
        return 0;
      }
      GMTrace.o(19143071891456L, 142627);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */