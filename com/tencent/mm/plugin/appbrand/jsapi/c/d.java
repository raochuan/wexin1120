package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "updateContainer";
  
  public d()
  {
    GMTrace.i(15466848321536L, 115237);
    GMTrace.o(15466848321536L, 115237);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(15466982539264L, 115238);
    if (!(paramView instanceof a))
    {
      GMTrace.o(15466982539264L, 115238);
      return false;
    }
    int i = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "contentOffsetLeft");
    int j = com.tencent.mm.plugin.appbrand.n.c.b(paramJSONObject, "contentOffsetTop");
    paramAppBrandPageView = (a)paramView;
    for (;;)
    {
      try
      {
        if (!paramJSONObject.getBoolean("visible")) {
          continue;
        }
        paramInt = 0;
        paramAppBrandPageView.setVisibility(paramInt);
      }
      catch (JSONException paramView)
      {
        continue;
      }
      paramAppBrandPageView.setPadding(-i, -j, 0, 0);
      GMTrace.o(15466982539264L, 115238);
      return true;
      paramInt = 4;
    }
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(15467116756992L, 115239);
    int i = paramJSONObject.getInt("containerId");
    GMTrace.o(15467116756992L, 115239);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */