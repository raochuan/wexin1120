package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class be
  extends a
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorage";
  
  public be()
  {
    GMTrace.i(10360132206592L, 77189);
    GMTrace.o(10360132206592L, 77189);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10360266424320L, 77190);
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10360266424320L, 77190);
      return;
    }
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = paramk.iqL;
    localJsApiRemoveStorageTask.amo = paramJSONObject;
    AppBrandMainProcessService.a(localJsApiRemoveStorageTask);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10360266424320L, 77190);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */