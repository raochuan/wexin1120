package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bow
  extends com.tencent.mm.bl.a
{
  public b uEX;
  public b uEY;
  
  public bow()
  {
    GMTrace.i(3620120559616L, 26972);
    GMTrace.o(3620120559616L, 26972);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3620254777344L, 26973);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEX != null) {
        paramVarArgs.b(1, this.uEX);
      }
      if (this.uEY != null) {
        paramVarArgs.b(2, this.uEY);
      }
      GMTrace.o(3620254777344L, 26973);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uEX == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.uEX) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uEY != null) {
        i = paramInt + b.a.a.a.a(2, this.uEY);
      }
      GMTrace.o(3620254777344L, 26973);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3620254777344L, 26973);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bow localbow = (bow)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3620254777344L, 26973);
          return -1;
        case 1: 
          localbow.uEX = locala.cpI();
          GMTrace.o(3620254777344L, 26973);
          return 0;
        }
        localbow.uEY = locala.cpI();
        GMTrace.o(3620254777344L, 26973);
        return 0;
      }
      GMTrace.o(3620254777344L, 26973);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */