package com.tencent.mm.plugin.appbrand.menu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.ui.base.m;

final class c
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  c()
  {
    super(l.jis - 1);
    GMTrace.i(18835444858880L, 140335);
    GMTrace.o(18835444858880L, 140335);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(18835579076608L, 140336);
    if (b.bMv()) {
      paramm.e(this.jix, "appId: " + paramString);
    }
    GMTrace.o(18835579076608L, 140336);
  }
  
  public final void a(Context paramContext, final AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(18835713294336L, 140337);
    paramk = (ClipboardManager)paramContext.getSystemService("clipboard");
    if (paramk == null)
    {
      GMTrace.o(18835713294336L, 140337);
      return;
    }
    paramk.setPrimaryClip(ClipData.newPlainText("text", paramString));
    Toast.makeText(paramContext, "copied appId: " + paramString, 1).show();
    paramAppBrandPageView.jlc.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19694169882624L, 146733);
        try
        {
          a.a.ce(paramAppBrandPageView.jlc.getX5WebViewExtension()).l("notifyMemoryPressure", new Object[] { Integer.valueOf(80) });
          GMTrace.o(19694169882624L, 146733);
          return;
        }
        catch (Exception localException)
        {
          GMTrace.o(19694169882624L, 146733);
        }
      }
    }, 1000L);
    GMTrace.o(18835713294336L, 140337);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */