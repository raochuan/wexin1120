package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.k;

@SuppressLint({"DefaultLocale"})
public class p
  extends k
{
  public final String appId;
  public final int fBH;
  public final int version;
  
  p(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this(String.format("WxaPkg_%s_%d", new Object[] { paramString1, Integer.valueOf(paramInt2) }), T(paramString1, paramInt2), paramString2, paramString1, paramInt2, paramInt1);
    GMTrace.i(19994012286976L, 148967);
    GMTrace.o(19994012286976L, 148967);
  }
  
  p(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, String.valueOf(paramInt1), "AppBrandWxaPkgDownloader", paramString3, "GET", 3, 2, 0);
    GMTrace.i(19994146504704L, 148968);
    this.appId = paramString4;
    this.version = paramInt1;
    this.fBH = paramInt2;
    GMTrace.o(19994146504704L, 148968);
  }
  
  static String T(String paramString, int paramInt)
  {
    GMTrace.i(19993878069248L, 148966);
    String str = o.SA();
    paramString = str + String.format("_%d_%d.wxapkg", new Object[] { Integer.valueOf(paramString.hashCode()), Integer.valueOf(paramInt) });
    GMTrace.o(19993878069248L, 148966);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */