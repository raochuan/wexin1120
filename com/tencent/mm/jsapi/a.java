package com.tencent.mm.jsapi;

import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
{
  public static void a(e parame, String paramString, a parama)
  {
    GMTrace.i(20023808622592L, 149189);
    if (bg.mZ(paramString))
    {
      parama.ep("");
      GMTrace.o(20023808622592L, 149189);
      return;
    }
    parame.evaluateJavascript(paramString + String.format(";var ___result_return = function(){return %d;};___result_return();", new Object[] { Integer.valueOf(11111) }), new ValueCallback() {});
    GMTrace.o(20023808622592L, 149189);
  }
  
  public static abstract interface a
  {
    public abstract void ep(String paramString);
    
    public abstract void wp();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */