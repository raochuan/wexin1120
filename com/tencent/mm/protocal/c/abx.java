package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abx
  extends axk
{
  public String URL;
  
  public abx()
  {
    GMTrace.i(3779973873664L, 28163);
    GMTrace.o(3779973873664L, 28163);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3780108091392L, 28164);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      GMTrace.o(3780108091392L, 28164);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.URL != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.URL);
      }
      GMTrace.o(3780108091392L, 28164);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.URL == null) {
        throw new b("Not all required fields were included: URL");
      }
      GMTrace.o(3780108091392L, 28164);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abx localabx = (abx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3780108091392L, 28164);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localabx.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3780108091392L, 28164);
        return 0;
      }
      localabx.URL = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3780108091392L, 28164);
      return 0;
    }
    GMTrace.o(3780108091392L, 28164);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/abx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */