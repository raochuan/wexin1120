package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ba
  extends axk
{
  public String fvk;
  public int ret;
  
  public ba()
  {
    GMTrace.i(3963181072384L, 29528);
    GMTrace.o(3963181072384L, 29528);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3963315290112L, 29529);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.ret);
      if (this.fvk != null) {
        paramVarArgs.e(3, this.fvk);
      }
      GMTrace.o(3963315290112L, 29529);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.ret);
      paramInt = i;
      if (this.fvk != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.fvk);
      }
      GMTrace.o(3963315290112L, 29529);
      return paramInt;
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
      GMTrace.o(3963315290112L, 29529);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ba localba = (ba)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3963315290112L, 29529);
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
          localba.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3963315290112L, 29529);
        return 0;
      case 2: 
        localba.ret = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3963315290112L, 29529);
        return 0;
      }
      localba.fvk = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3963315290112L, 29529);
      return 0;
    }
    GMTrace.o(3963315290112L, 29529);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */