package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 104;
  private static final String NAME = "showModal";
  
  public c()
  {
    GMTrace.i(17681440833536L, 131737);
    GMTrace.o(17681440833536L, 131737);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17681575051264L, 131738);
    final Object localObject = b(paramk);
    if (localObject == null)
    {
      w.w("MicroMsg.JsApiShowModal", "invoke JsApi JsApiShowModal failed, current page view is null.");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17681575051264L, 131738);
      return;
    }
    m.k((AppBrandPageView)localObject);
    localObject = paramJSONObject.optString("title");
    final String str1 = paramJSONObject.optString("confirmText", paramk.mContext.getString(p.i.dwr));
    final String str2 = paramJSONObject.optString("cancelText", paramk.mContext.getString(p.i.duP));
    boolean bool = paramJSONObject.optBoolean("showCancel", true);
    final int i = com.tencent.mm.plugin.appbrand.n.c.aA(paramJSONObject.optString("confirmColor", ""), Color.parseColor("#3CC51F"));
    final int j = com.tencent.mm.plugin.appbrand.n.c.aA(paramJSONObject.optString("cancelColor", ""), Color.parseColor("#000000"));
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17680232873984L, 131728);
        if (!paramk.UF)
        {
          GMTrace.o(17680232873984L, 131728);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.c.a locala = new com.tencent.mm.plugin.appbrand.widget.c.a(c.this.a(paramk));
        if (!bg.mZ(localObject)) {
          locala.setTitle(localObject);
        }
        locala.setMessage(this.hMe);
        locala.a(str1, true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(17682111922176L, 131742);
            paramAnonymous2DialogInterface = new HashMap();
            paramAnonymous2DialogInterface.put("confirm", Boolean.valueOf(true));
            paramAnonymous2DialogInterface.put("cancel", Boolean.valueOf(false));
            c.1.this.iPN.v(c.1.this.gQa, c.this.d("ok", paramAnonymous2DialogInterface));
            GMTrace.o(17682111922176L, 131742);
          }
        });
        if (this.jaG.booleanValue()) {
          locala.b(str2, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(17682380357632L, 131744);
              HashMap localHashMap = new HashMap();
              localHashMap.put("confirm", Boolean.valueOf(false));
              localHashMap.put("cancel", Boolean.valueOf(true));
              paramAnonymous2DialogInterface.dismiss();
              c.1.this.iPN.v(c.1.this.gQa, c.this.d("ok", localHashMap));
              GMTrace.o(17682380357632L, 131744);
            }
          });
        }
        locala.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(17681038180352L, 131734);
            paramAnonymous2DialogInterface = new HashMap();
            paramAnonymous2DialogInterface.put("confirm", Boolean.valueOf(false));
            paramAnonymous2DialogInterface.put("cancel", Boolean.valueOf(false));
            c.1.this.iPN.v(c.1.this.gQa, c.this.d("ok", paramAnonymous2DialogInterface));
            GMTrace.o(17681038180352L, 131734);
          }
        });
        locala.Be(i);
        if (this.jaG.booleanValue()) {
          locala.Bf(j);
        }
        paramk.irS.a(locala);
        GMTrace.o(17680232873984L, 131728);
      }
    });
    GMTrace.o(17681575051264L, 131738);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */