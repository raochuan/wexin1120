package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xc
  extends axc
{
  public xc()
  {
    GMTrace.i(3772189245440L, 28105);
    GMTrace.o(3772189245440L, 28105);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3772323463168L, 28106);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      GMTrace.o(3772323463168L, 28106);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      GMTrace.o(3772323463168L, 28106);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3772323463168L, 28106);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xc localxc = (xc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3772323463168L, 28106);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new en();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localxc.urE = ((en)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3772323463168L, 28106);
      return 0;
    }
    GMTrace.o(3772323463168L, 28106);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */