package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bl.a
{
  public LinkedList<f> mDd;
  
  public e()
  {
    GMTrace.i(16560991240192L, 123389);
    this.mDd = new LinkedList();
    GMTrace.o(16560991240192L, 123389);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16561125457920L, 123390);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.mDd);
      GMTrace.o(16561125457920L, 123390);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.mDd);
      GMTrace.o(16561125457920L, 123390);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mDd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16561125457920L, 123390);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16561125457920L, 123390);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new f();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((f)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        locale.mDd.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(16561125457920L, 123390);
      return 0;
    }
    GMTrace.o(16561125457920L, 123390);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */