package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o
  extends h
{
  public String kJV;
  public long kKr;
  public int kKs;
  public int kKt;
  public int type;
  
  public o(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(5401995116544L, 40248);
    this.kJV = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bill_id", paramString);
    localHashMap.put("type", String.valueOf(paramInt));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    x(localHashMap);
    GMTrace.o(5401995116544L, 40248);
  }
  
  public final int Bc()
  {
    GMTrace.i(5402263552000L, 40250);
    GMTrace.o(5402263552000L, 40250);
    return 1964;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(5402531987456L, 40252);
    this.kKs = paramJSONObject.optInt("total_num", 0);
    this.kKt = paramJSONObject.optInt("total_amt", 0);
    this.type = paramJSONObject.optInt("type", 0);
    this.kKr = paramJSONObject.optLong("from_timestamp", 0L);
    GMTrace.o(5402531987456L, 40252);
  }
  
  public final int anK()
  {
    GMTrace.i(5402397769728L, 40251);
    GMTrace.o(5402397769728L, 40251);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(5402129334272L, 40249);
    GMTrace.o(5402129334272L, 40249);
    return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */