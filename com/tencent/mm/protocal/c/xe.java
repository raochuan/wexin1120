package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xe
  extends axc
{
  public int ttf;
  public String ttg;
  
  public xe()
  {
    GMTrace.i(4041832660992L, 30114);
    GMTrace.o(4041832660992L, 30114);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4041966878720L, 30115);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.ttf);
      if (this.ttg != null) {
        paramVarArgs.e(3, this.ttg);
      }
      GMTrace.o(4041966878720L, 30115);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.ttf);
      paramInt = i;
      if (this.ttg != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ttg);
      }
      GMTrace.o(4041966878720L, 30115);
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
      GMTrace.o(4041966878720L, 30115);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xe localxe = (xe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4041966878720L, 30115);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localxe.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4041966878720L, 30115);
        return 0;
      case 2: 
        localxe.ttf = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4041966878720L, 30115);
        return 0;
      }
      localxe.ttg = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4041966878720L, 30115);
      return 0;
    }
    GMTrace.o(4041966878720L, 30115);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */