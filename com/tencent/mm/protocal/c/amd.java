package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amd
  extends axk
{
  public int mdg;
  public int mdh;
  public LinkedList<amf> ugY;
  
  public amd()
  {
    GMTrace.i(3674344521728L, 27376);
    this.ugY = new LinkedList();
    GMTrace.o(3674344521728L, 27376);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3674478739456L, 27377);
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
      paramVarArgs.d(2, 8, this.ugY);
      paramVarArgs.fd(3, this.mdh);
      paramVarArgs.fd(4, this.mdg);
      GMTrace.o(3674478739456L, 27377);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.ugY);
      int j = b.a.a.a.fa(3, this.mdh);
      int k = b.a.a.a.fa(4, this.mdg);
      GMTrace.o(3674478739456L, 27377);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ugY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3674478739456L, 27377);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amd localamd = (amd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3674478739456L, 27377);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localamd.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3674478739456L, 27377);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localamd.ugY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3674478739456L, 27377);
        return 0;
      case 3: 
        localamd.mdh = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3674478739456L, 27377);
        return 0;
      }
      localamd.mdg = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3674478739456L, 27377);
      return 0;
    }
    GMTrace.o(3674478739456L, 27377);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */