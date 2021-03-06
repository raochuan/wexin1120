package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public enum q
{
  static
  {
    GMTrace.i(10604542689280L, 79010);
    iBF = new q[0];
    GMTrace.o(10604542689280L, 79010);
  }
  
  public static Pair<a, WxaPkgWrappingInfo> bW(boolean paramBoolean)
  {
    GMTrace.i(15542278684672L, 115799);
    if (paramBoolean) {}
    for (int i = 0;; i = 999)
    {
      Pair localPair = p("@LibraryAppId", i, -1);
      GMTrace.o(15542278684672L, 115799);
      return localPair;
    }
  }
  
  private static WxaPkgWrappingInfo o(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10604408471552L, 79009);
    if (("@LibraryAppId".equals(paramString)) && (paramInt1 == 0) && ((paramInt2 < 0) || (63 >= paramInt2)))
    {
      w.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "use local library version = %d | query appId = %s, debugType = %d, pkgVersion = %d", new Object[] { Integer.valueOf(63), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = m.Sw();
      GMTrace.o(10604408471552L, 79009);
      return paramString;
    }
    GMTrace.o(10604408471552L, 79009);
    return null;
  }
  
  public static Pair<a, WxaPkgWrappingInfo> p(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(15542412902400L, 115800);
    if (((a)h.h(a.class)).RT() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "get null storage, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = Pair.create(a.iBL, null);
      GMTrace.o(15542412902400L, 115800);
      return paramString;
    }
    Object localObject1 = new String[4];
    localObject1[0] = "pkgPath";
    localObject1[1] = "versionMd5";
    localObject1[2] = "version";
    localObject1[3] = "createTime";
    if ((c.a.hK(paramInt1)) && (paramInt2 > 0)) {
      localObject1 = ((a)h.h(a.class)).RT().a(paramString, paramInt2, paramInt1, (String[])localObject1);
    }
    while (localObject1 == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "get null record, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = o(paramString, paramInt1, -1);
      if (paramString != null)
      {
        paramString = Pair.create(a.iBG, paramString);
        GMTrace.o(15542412902400L, 115800);
        return paramString;
        localObject1 = ((a)h.h(a.class)).RT().a(paramString, paramInt1, (String[])localObject1);
      }
      else
      {
        paramString = Pair.create(a.iBH, null);
        GMTrace.o(15542412902400L, 115800);
        return paramString;
      }
    }
    String str = ((r)localObject1).field_pkgPath;
    Object localObject2 = ((r)localObject1).field_versionMd5;
    if (paramInt2 < 0) {}
    long l;
    for (int i = ((r)localObject1).field_version;; i = paramInt2)
    {
      l = ((r)localObject1).field_createTime;
      localObject3 = o(paramString, paramInt1, i);
      if (localObject3 == null) {
        break;
      }
      paramString = Pair.create(a.iBG, localObject3);
      GMTrace.o(15542412902400L, 115800);
      return paramString;
    }
    if ((bg.mZ(str)) || (!e.aZ(str)))
    {
      w.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "file not exists, pkgPath = %s, appId = %s, debugType = %d, version = %d", new Object[] { str, paramString, Integer.valueOf(paramInt1), Integer.valueOf(i) });
      paramString = Pair.create(a.iBK, null);
      GMTrace.o(15542412902400L, 115800);
      return paramString;
    }
    Object localObject3 = g.bg(str);
    if ((!bg.mZ((String)localObject2)) && (!((String)localObject2).equals(localObject3)))
    {
      w.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "md5 mismatch | realMd5 = %s, manifestMd5 = %s, appId = %s, debugType = %d, version = %d", new Object[] { localObject3, localObject2, paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = Pair.create(a.iBK, null);
      GMTrace.o(15542412902400L, 115800);
      return paramString;
    }
    localObject2 = WxaPkgWrappingInfo.of(str);
    if (localObject2 == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "obtain wxPkg failed, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = Pair.create(a.iBK, null);
      GMTrace.o(15542412902400L, 115800);
      return paramString;
    }
    ((WxaPkgWrappingInfo)localObject2).iCy = i;
    ((WxaPkgWrappingInfo)localObject2).iCz = l;
    ((WxaPkgWrappingInfo)localObject2).iCF = str;
    ((WxaPkgWrappingInfo)localObject2).iCA = false;
    ((WxaPkgWrappingInfo)localObject2).iCx = paramInt1;
    w.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "check ok, params: appId = %s, debugType = %d, version = %d, pkgVersion = %d, startTime = %d, endTime = %d, return %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Long.valueOf(((r)localObject1).field_startTime), Long.valueOf(((r)localObject1).field_endTime), localObject2 });
    paramString = Pair.create(a.iBG, localObject2);
    GMTrace.o(15542412902400L, 115800);
    return paramString;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10610716704768L, 79056);
      iBG = new a("APP_READY", 0);
      iBH = new a("APP_MANIFEST_NULL", 1);
      iBI = new a("PKG_EXPIRED", 2);
      iBJ = new a("APP_NOT_INSTALLED", 3);
      iBK = new a("APP_BROKEN", 4);
      iBL = new a("ENV_ERR", 5);
      iBM = new a[] { iBG, iBH, iBI, iBJ, iBK, iBL };
      GMTrace.o(10610716704768L, 79056);
    }
    
    private a()
    {
      GMTrace.i(10610448269312L, 79054);
      GMTrace.o(10610448269312L, 79054);
    }
    
    public final int SK()
    {
      GMTrace.i(10610582487040L, 79055);
      int i = super.ordinal();
      GMTrace.o(10610582487040L, 79055);
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */