package com.tencent.mm.plugin.appbrand.launching;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;

 enum l
{
  static
  {
    GMTrace.i(10145115406336L, 75587);
    jgn = new l[0];
    GMTrace.o(10145115406336L, 75587);
  }
  
  static String e(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10144981188608L, 75586);
    paramVarArgs = d.e(paramInt, paramVarArgs);
    GMTrace.o(10144981188608L, 75586);
    return paramVarArgs;
  }
  
  static void iO(int paramInt)
  {
    GMTrace.i(10144712753152L, 75584);
    qL(ab.getResources().getString(paramInt));
    GMTrace.o(10144712753152L, 75584);
  }
  
  static void qL(String paramString)
  {
    GMTrace.i(10144846970880L, 75585);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10145652277248L, 75591);
        Toast.makeText(ab.getContext(), this.gLJ, 0).show();
        GMTrace.o(10145652277248L, 75591);
      }
    });
    GMTrace.o(10144846970880L, 75585);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */