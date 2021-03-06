package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.f;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends a
{
  public static final int CTRL_INDEX = 273;
  public static final String NAME = "operateUploadTask";
  
  public i()
  {
    GMTrace.i(18238175969280L, 135885);
    GMTrace.o(18238175969280L, 135885);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18238310187008L, 135886);
    w.d("MicroMsg.JsApiOperateUploadTask", "JsApiOperateUploadTask");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateUploadTask", "data is null");
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    String str = paramJSONObject.optString("uploadTaskId");
    if (bg.mZ(str))
    {
      w.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
      paramk.v(paramInt, d("fail:uploadTaskId is null or nil", null));
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bg.mZ(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
      paramk.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = h.YB().rc(paramk.iqL);
      if (paramJSONObject == null)
      {
        w.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
        paramk.v(paramInt, d("fail:no task", null));
        GMTrace.o(18238310187008L, 135886);
        return;
      }
      g localg = paramJSONObject.rb(str);
      if (localg == null)
      {
        w.i("MicroMsg.JsApiOperateUploadTask", "uploadInfo is null %s", new Object[] { str });
        paramk.v(paramInt, d("fail:no task", null));
        GMTrace.o(18238310187008L, 135886);
        return;
      }
      if (localg != null)
      {
        localg.aDR = false;
        paramJSONObject.a(localg.mUrl, localg.mName, localg.jjh, localg.jjb);
      }
      paramk.v(paramInt, d("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("uploadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paramk = new e.a().a(paramk);
      paramk.mData = paramJSONObject;
      paramk.VI();
      w.d("MicroMsg.JsApiOperateUploadTask", "abortTask finish %s", new Object[] { str });
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    paramk.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(18238310187008L, 135886);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */