package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.modelappbrand.q;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.dynamic.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.a.2;
import com.tencent.mm.plugin.appbrand.dynamic.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.a.b;
import com.tencent.mm.plugin.appbrand.dynamic.a.c;
import com.tencent.mm.plugin.appbrand.dynamic.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.a.f;
import com.tencent.mm.plugin.appbrand.dynamic.a.g;
import com.tencent.mm.plugin.appbrand.widget.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONArray;

public class IPCDynamicPageView
  extends LinearLayout
  implements j, com.tencent.mm.plugin.appbrand.canvas.widget.a, com.tencent.mm.plugin.appbrand.dynamic.g
{
  public static ae iKp;
  private static LinearLayout.LayoutParams iNU;
  public String gQf;
  private long iFD;
  private k iKt;
  private Bundle iNM;
  private com.tencent.mm.plugin.appbrand.dynamic.a iNN;
  private q iNO;
  public volatile boolean iNP;
  public long iNQ;
  private com.tencent.mm.plugin.appbrand.canvas.widget.a iNR;
  private Runnable iNS;
  private Runnable iNT;
  private volatile boolean oI;
  
  static
  {
    GMTrace.i(18334410080256L, 136602);
    HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.Sc("MiniJsApiFramework#UIActionThread");
    localHandlerThread.start();
    iKp = new ae(localHandlerThread.getLooper());
    iNU = new LinearLayout.LayoutParams(-1, -1);
    GMTrace.o(18334410080256L, 136602);
  }
  
  public IPCDynamicPageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18331323072512L, 136579);
    this.iNS = new Runnable()
    {
      public final void run()
      {
        int i = 1;
        GMTrace.i(18337765523456L, 136627);
        long l;
        if (!IPCDynamicPageView.a(IPCDynamicPageView.this))
        {
          IPCDynamicPageView.a(IPCDynamicPageView.this, true);
          IPCDynamicPageView.b(IPCDynamicPageView.this);
          l = System.currentTimeMillis() - IPCDynamicPageView.c(IPCDynamicPageView.this);
          if (l > 1000L) {
            break label103;
          }
          i = 0;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(645L, i, 1L, false);
          IPCDynamicPageView.a(IPCDynamicPageView.this, System.currentTimeMillis());
          IPCDynamicPageView.d(IPCDynamicPageView.this).TC();
          GMTrace.o(18337765523456L, 136627);
          return;
          label103:
          if (l > 2000L) {
            if (l <= 3000L) {
              i = 2;
            } else if (l <= 4000L) {
              i = 3;
            } else if (l <= 5000L) {
              i = 4;
            } else if (l <= 6000L) {
              i = 5;
            } else if (l <= 7000L) {
              i = 6;
            } else if (l <= 8000L) {
              i = 7;
            } else if (l <= 9000L) {
              i = 8;
            } else if (l <= 10000L) {
              i = 9;
            } else {
              i = 10;
            }
          }
        }
      }
    };
    this.iNT = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18339107700736L, 136637);
        Object localObject1 = IPCDynamicPageView.e(IPCDynamicPageView.this);
        if (bg.mZ((String)localObject1))
        {
          w.i("MicroMsg.IPCDynamicPageView", "detach failed, id is null or nil.");
          GMTrace.o(18339107700736L, 136637);
          return;
        }
        IPCDynamicPageView.b(IPCDynamicPageView.this, true);
        Object localObject2 = IPCDynamicPageView.f(IPCDynamicPageView.this);
        if ((localObject1 == null) || (((String)localObject1).length() == 0))
        {
          w.v("MicroMsg.DynamicIPCJsBridge", "detach(%s) failed, id is null or nil.", new Object[] { Integer.valueOf(localObject2.hashCode()) });
          localObject2 = com.tencent.mm.plugin.appbrand.dynamic.e.UC();
          if (!bg.mZ((String)localObject1)) {
            break label231;
          }
          w.w("MicroMsg.DynamicPageViewMgr", "remove view from manager failed, key is null or nil.");
        }
        for (;;)
        {
          IPCDynamicPageView.this.cleanup();
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, false);
          IPCDynamicPageView.d(IPCDynamicPageView.this).TG();
          GMTrace.o(18339107700736L, 136637);
          return;
          w.i("MicroMsg.DynamicIPCJsBridge", "detach(%s, id : %s)", new Object[] { Integer.valueOf(localObject2.hashCode()), localObject1 });
          Bundle localBundle = new Bundle();
          localBundle.putString("id", (String)localObject1);
          com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.b.class, new a.2((com.tencent.mm.plugin.appbrand.dynamic.a)localObject2, (String)localObject1));
          break;
          label231:
          localObject1 = (WeakReference)((com.tencent.mm.plugin.appbrand.dynamic.e)localObject2).iKF.remove(localObject1);
          if (localObject1 != null) {
            ((WeakReference)localObject1).get();
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(18331323072512L, 136579);
  }
  
  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18331457290240L, 136580);
    this.iNS = new Runnable()
    {
      public final void run()
      {
        int i = 1;
        GMTrace.i(18337765523456L, 136627);
        long l;
        if (!IPCDynamicPageView.a(IPCDynamicPageView.this))
        {
          IPCDynamicPageView.a(IPCDynamicPageView.this, true);
          IPCDynamicPageView.b(IPCDynamicPageView.this);
          l = System.currentTimeMillis() - IPCDynamicPageView.c(IPCDynamicPageView.this);
          if (l > 1000L) {
            break label103;
          }
          i = 0;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(645L, i, 1L, false);
          IPCDynamicPageView.a(IPCDynamicPageView.this, System.currentTimeMillis());
          IPCDynamicPageView.d(IPCDynamicPageView.this).TC();
          GMTrace.o(18337765523456L, 136627);
          return;
          label103:
          if (l > 2000L) {
            if (l <= 3000L) {
              i = 2;
            } else if (l <= 4000L) {
              i = 3;
            } else if (l <= 5000L) {
              i = 4;
            } else if (l <= 6000L) {
              i = 5;
            } else if (l <= 7000L) {
              i = 6;
            } else if (l <= 8000L) {
              i = 7;
            } else if (l <= 9000L) {
              i = 8;
            } else if (l <= 10000L) {
              i = 9;
            } else {
              i = 10;
            }
          }
        }
      }
    };
    this.iNT = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18339107700736L, 136637);
        Object localObject1 = IPCDynamicPageView.e(IPCDynamicPageView.this);
        if (bg.mZ((String)localObject1))
        {
          w.i("MicroMsg.IPCDynamicPageView", "detach failed, id is null or nil.");
          GMTrace.o(18339107700736L, 136637);
          return;
        }
        IPCDynamicPageView.b(IPCDynamicPageView.this, true);
        Object localObject2 = IPCDynamicPageView.f(IPCDynamicPageView.this);
        if ((localObject1 == null) || (((String)localObject1).length() == 0))
        {
          w.v("MicroMsg.DynamicIPCJsBridge", "detach(%s) failed, id is null or nil.", new Object[] { Integer.valueOf(localObject2.hashCode()) });
          localObject2 = com.tencent.mm.plugin.appbrand.dynamic.e.UC();
          if (!bg.mZ((String)localObject1)) {
            break label231;
          }
          w.w("MicroMsg.DynamicPageViewMgr", "remove view from manager failed, key is null or nil.");
        }
        for (;;)
        {
          IPCDynamicPageView.this.cleanup();
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, false);
          IPCDynamicPageView.d(IPCDynamicPageView.this).TG();
          GMTrace.o(18339107700736L, 136637);
          return;
          w.i("MicroMsg.DynamicIPCJsBridge", "detach(%s, id : %s)", new Object[] { Integer.valueOf(localObject2.hashCode()), localObject1 });
          Bundle localBundle = new Bundle();
          localBundle.putString("id", (String)localObject1);
          com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.b.class, new a.2((com.tencent.mm.plugin.appbrand.dynamic.a)localObject2, (String)localObject1));
          break;
          label231:
          localObject1 = (WeakReference)((com.tencent.mm.plugin.appbrand.dynamic.e)localObject2).iKF.remove(localObject1);
          if (localObject1 != null) {
            ((WeakReference)localObject1).get();
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(18331457290240L, 136580);
  }
  
  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18331591507968L, 136581);
    this.iNS = new Runnable()
    {
      public final void run()
      {
        int i = 1;
        GMTrace.i(18337765523456L, 136627);
        long l;
        if (!IPCDynamicPageView.a(IPCDynamicPageView.this))
        {
          IPCDynamicPageView.a(IPCDynamicPageView.this, true);
          IPCDynamicPageView.b(IPCDynamicPageView.this);
          l = System.currentTimeMillis() - IPCDynamicPageView.c(IPCDynamicPageView.this);
          if (l > 1000L) {
            break label103;
          }
          i = 0;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(645L, i, 1L, false);
          IPCDynamicPageView.a(IPCDynamicPageView.this, System.currentTimeMillis());
          IPCDynamicPageView.d(IPCDynamicPageView.this).TC();
          GMTrace.o(18337765523456L, 136627);
          return;
          label103:
          if (l > 2000L) {
            if (l <= 3000L) {
              i = 2;
            } else if (l <= 4000L) {
              i = 3;
            } else if (l <= 5000L) {
              i = 4;
            } else if (l <= 6000L) {
              i = 5;
            } else if (l <= 7000L) {
              i = 6;
            } else if (l <= 8000L) {
              i = 7;
            } else if (l <= 9000L) {
              i = 8;
            } else if (l <= 10000L) {
              i = 9;
            } else {
              i = 10;
            }
          }
        }
      }
    };
    this.iNT = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18339107700736L, 136637);
        Object localObject1 = IPCDynamicPageView.e(IPCDynamicPageView.this);
        if (bg.mZ((String)localObject1))
        {
          w.i("MicroMsg.IPCDynamicPageView", "detach failed, id is null or nil.");
          GMTrace.o(18339107700736L, 136637);
          return;
        }
        IPCDynamicPageView.b(IPCDynamicPageView.this, true);
        Object localObject2 = IPCDynamicPageView.f(IPCDynamicPageView.this);
        if ((localObject1 == null) || (((String)localObject1).length() == 0))
        {
          w.v("MicroMsg.DynamicIPCJsBridge", "detach(%s) failed, id is null or nil.", new Object[] { Integer.valueOf(localObject2.hashCode()) });
          localObject2 = com.tencent.mm.plugin.appbrand.dynamic.e.UC();
          if (!bg.mZ((String)localObject1)) {
            break label231;
          }
          w.w("MicroMsg.DynamicPageViewMgr", "remove view from manager failed, key is null or nil.");
        }
        for (;;)
        {
          IPCDynamicPageView.this.cleanup();
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, null);
          IPCDynamicPageView.a(IPCDynamicPageView.this, false);
          IPCDynamicPageView.d(IPCDynamicPageView.this).TG();
          GMTrace.o(18339107700736L, 136637);
          return;
          w.i("MicroMsg.DynamicIPCJsBridge", "detach(%s, id : %s)", new Object[] { Integer.valueOf(localObject2.hashCode()), localObject1 });
          Bundle localBundle = new Bundle();
          localBundle.putString("id", (String)localObject1);
          com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.b.class, new a.2((com.tencent.mm.plugin.appbrand.dynamic.a)localObject2, (String)localObject1));
          break;
          label231:
          localObject1 = (WeakReference)((com.tencent.mm.plugin.appbrand.dynamic.e)localObject2).iKF.remove(localObject1);
          if (localObject1 != null) {
            ((WeakReference)localObject1).get();
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(18331591507968L, 136581);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(18851685203968L, 140456);
    this.iNN = new com.tencent.mm.plugin.appbrand.dynamic.a(this);
    paramContext = b.aY(paramContext);
    addView(paramContext, iNU);
    this.iNR = ((com.tencent.mm.plugin.appbrand.canvas.widget.a)paramContext);
    GMTrace.o(18851685203968L, 140456);
  }
  
  private void iv(final int paramInt)
  {
    GMTrace.i(18332665249792L, 136589);
    if (this.iNO == null)
    {
      w.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener wrapper is null.", new Object[] { this.gQf, Integer.valueOf(paramInt) });
      GMTrace.o(18332665249792L, 136589);
      return;
    }
    final f localf = this.iNO.CQ();
    if (localf == null)
    {
      w.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener is null.", new Object[] { this.gQf, Integer.valueOf(paramInt) });
      GMTrace.o(18332665249792L, 136589);
      return;
    }
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      localf.q(this, paramInt);
      GMTrace.o(18332665249792L, 136589);
      return;
    }
    com.tencent.mm.plugin.appbrand.dynamic.b.l(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18334946951168L, 136606);
        localf.q(IPCDynamicPageView.this, paramInt);
        GMTrace.o(18334946951168L, 136606);
      }
    });
    GMTrace.o(18332665249792L, 136589);
  }
  
  public final boolean P(String paramString1, String paramString2)
  {
    GMTrace.i(19941130502144L, 148573);
    Object localObject = this.iNN;
    String str = this.gQf;
    if ((((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).gQf == null) || (((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).gQf.length() == 0) || (paramString1 == null) || (paramString1.length() == 0))
    {
      GMTrace.o(19941130502144L, 148573);
      return false;
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("id", str);
    ((Bundle)localObject).putString("event", paramString1);
    ((Bundle)localObject).putString("data", paramString2);
    paramString1 = (IPCBoolean)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", (Parcelable)localObject, a.f.class);
    if (paramString1 != null)
    {
      boolean bool = paramString1.value;
      GMTrace.o(19941130502144L, 148573);
      return bool;
    }
    GMTrace.o(19941130502144L, 148573);
    return false;
  }
  
  public final void TC()
  {
    GMTrace.i(18332262596608L, 136586);
    long l = System.currentTimeMillis() - this.iFD;
    iKp.removeCallbacks(this.iNS);
    if (l < 12L)
    {
      iKp.postDelayed(this.iNS, l);
      GMTrace.o(18332262596608L, 136586);
      return;
    }
    this.iNS.run();
    GMTrace.o(18332262596608L, 136586);
  }
  
  public final void TD()
  {
    GMTrace.i(18852222074880L, 140460);
    this.iNR.TD();
    GMTrace.o(18852222074880L, 140460);
  }
  
  public final int TE()
  {
    GMTrace.i(18966575579136L, 141312);
    int i = this.iNR.TE();
    GMTrace.o(18966575579136L, 141312);
    return i;
  }
  
  public final int TF()
  {
    GMTrace.i(18966709796864L, 141313);
    int i = this.iNR.TF();
    GMTrace.o(18966709796864L, 141313);
    return i;
  }
  
  public final void TG()
  {
    GMTrace.i(18853027381248L, 140466);
    this.iNR.TG();
    GMTrace.o(18853027381248L, 140466);
  }
  
  public final void a(String paramString, p paramp)
  {
    GMTrace.i(19940727848960L, 148570);
    if (this.iNO == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940727848960L, 148570);
      return;
    }
    u localu = (u)this.iNO.hd("openApp");
    if (localu == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940727848960L, 148570);
      return;
    }
    localu.hf(paramString);
    GMTrace.o(19940727848960L, 148570);
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, p paramp)
  {
    GMTrace.i(19940862066688L, 148571);
    if (this.iNO == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940862066688L, 148571);
      return;
    }
    t localt = (t)this.iNO.hd("OnTapCallback");
    if (localt == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940862066688L, 148571);
      return;
    }
    localt.b(paramBoolean1, paramString, paramBoolean2);
    GMTrace.o(19940862066688L, 148571);
  }
  
  public final void b(int paramInt, p paramp)
  {
    GMTrace.i(18942684823552L, 141134);
    if (this.iNO == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(18942684823552L, 141134);
      return;
    }
    v localv = (v)this.iNO.hd("setWidgetSize");
    if (localv == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(18942684823552L, 141134);
      return;
    }
    localv.a(paramInt, paramp);
    GMTrace.o(18942684823552L, 141134);
  }
  
  public final void b(String paramString, p paramp)
  {
    GMTrace.i(19940593631232L, 148569);
    if (this.iNO == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940593631232L, 148569);
      return;
    }
    s locals = (s)this.iNO.hd("makePhoneCall");
    if (locals == null)
    {
      paramp.b(false, "listener is null", null);
      GMTrace.o(19940593631232L, 148569);
      return;
    }
    locals.he(paramString);
    GMTrace.o(19940593631232L, 148569);
  }
  
  public final void cleanup()
  {
    GMTrace.i(18331994161152L, 136584);
    if (this.iKt != null) {
      w.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s, %s, %s, %s)", new Object[] { this.gQf, this.iKt.field_id, this.iKt.field_appId, this.iKt.field_cacheKey });
    }
    for (;;)
    {
      TD();
      GMTrace.o(18331994161152L, 136584);
      return;
      w.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s)", new Object[] { this.gQf });
    }
  }
  
  public final void d(final String paramString1, final String paramString2, final Bundle paramBundle)
  {
    GMTrace.i(18331725725696L, 136582);
    iKp.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18338033958912L, 136629);
        String str = "";
        if (paramBundle != null) {
          str = paramBundle.getString("cache_key", "");
        }
        w.i("MicroMsg.IPCDynamicPageView", "attach(%s, %s, %s)", new Object[] { paramString1, paramString2, str });
        IPCDynamicPageView.a(IPCDynamicPageView.this, com.tencent.mm.plugin.appbrand.dynamic.i.b.pI(paramString1));
        if (IPCDynamicPageView.g(IPCDynamicPageView.this) == null) {
          IPCDynamicPageView.a(IPCDynamicPageView.this, new k());
        }
        IPCDynamicPageView.g(IPCDynamicPageView.this).field_id = paramString1;
        IPCDynamicPageView.g(IPCDynamicPageView.this).field_cacheKey = str;
        IPCDynamicPageView.g(IPCDynamicPageView.this).field_appId = paramString2;
        IPCDynamicPageView.this.os(paramString1);
        Object localObject1 = com.tencent.mm.plugin.appbrand.dynamic.e.UC();
        str = paramString1;
        Object localObject2 = IPCDynamicPageView.this;
        if (bg.mZ(str)) {
          w.w("MicroMsg.DynamicPageViewMgr", "add view into manager failed, key is null or nil.");
        }
        for (;;)
        {
          if (paramBundle != null) {
            paramBundle.putBundle("__env_args", IPCDynamicPageView.b(IPCDynamicPageView.this, paramBundle));
          }
          IPCDynamicPageView.f(IPCDynamicPageView.this);
          str = paramString1;
          localObject1 = paramString2;
          localObject2 = paramBundle;
          Bundle localBundle = new Bundle();
          localBundle.putString("id", str);
          localBundle.putString("appId", (String)localObject1);
          localBundle.putBundle("extData", (Bundle)localObject2);
          com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.a.class, null);
          GMTrace.o(18338033958912L, 136629);
          return;
          if (localObject2 == null)
          {
            w.w("MicroMsg.DynamicPageViewMgr", "add view into manager failed, view is null.");
          }
          else
          {
            localObject1 = (WeakReference)((com.tencent.mm.plugin.appbrand.dynamic.e)localObject1).iKF.put(str, new WeakReference(localObject2));
            if ((localObject1 != null) && (((WeakReference)localObject1).get() != null)) {
              w.i("MicroMsg.DynamicPageViewMgr", "add a new view and remove old one with key : %s.", new Object[] { str });
            }
          }
        }
      }
    });
    GMTrace.o(18331725725696L, 136582);
  }
  
  public final void d(JSONArray paramJSONArray)
  {
    GMTrace.i(18851953639424L, 140458);
    this.iNR.d(paramJSONArray);
    GMTrace.o(18851953639424L, 140458);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(18851819421696L, 140457);
    boolean bool = this.iNR.d(paramCanvas);
    GMTrace.o(18851819421696L, 140457);
    return bool;
  }
  
  public final void detach()
  {
    GMTrace.i(18331859943424L, 136583);
    if (Looper.myLooper() == iKp.getLooper())
    {
      this.iNT.run();
      GMTrace.o(18331859943424L, 136583);
      return;
    }
    iKp.post(this.iNT);
    GMTrace.o(18331859943424L, 136583);
  }
  
  public final void e(JSONArray paramJSONArray)
  {
    GMTrace.i(18852087857152L, 140459);
    this.iNR.e(paramJSONArray);
    GMTrace.o(18852087857152L, 140459);
  }
  
  public final int getType()
  {
    GMTrace.i(19940996284416L, 148572);
    int i = this.iNR.getType();
    GMTrace.o(19940996284416L, 148572);
    return i;
  }
  
  public final void id(int paramInt)
  {
    GMTrace.i(18332128378880L, 136585);
    iv(paramInt);
    detach();
    GMTrace.o(18332128378880L, 136585);
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18852624728064L, 140463);
    boolean bool = this.iNR.isPaused();
    GMTrace.o(18852624728064L, 140463);
    return bool;
  }
  
  public final void j(Runnable paramRunnable)
  {
    GMTrace.i(18852490510336L, 140462);
    this.iNR.j(paramRunnable);
    GMTrace.o(18852490510336L, 140462);
  }
  
  public final void onPause()
  {
    GMTrace.i(18332396814336L, 136587);
    w.v("MicroMsg.IPCDynamicPageView", "onPause(%s)", new Object[] { this.gQf });
    this.iNR.onPause();
    iKp.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18331188854784L, 136578);
        IPCDynamicPageView.f(IPCDynamicPageView.this);
        String str = IPCDynamicPageView.e(IPCDynamicPageView.this);
        Bundle localBundle = new Bundle();
        localBundle.putString("id", str);
        com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.d.class, null);
        GMTrace.o(18331188854784L, 136578);
      }
    });
    GMTrace.o(18332396814336L, 136587);
  }
  
  public final void onResume()
  {
    GMTrace.i(18332531032064L, 136588);
    w.v("MicroMsg.IPCDynamicPageView", "onResume(%s)", new Object[] { this.gQf });
    this.iNR.onResume();
    iKp.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18334678515712L, 136604);
        IPCDynamicPageView.f(IPCDynamicPageView.this);
        String str = IPCDynamicPageView.e(IPCDynamicPageView.this);
        Bundle localBundle = new Bundle();
        localBundle.putString("id", str);
        com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle, a.e.class, null);
        GMTrace.o(18334678515712L, 136604);
      }
    });
    GMTrace.o(18332531032064L, 136588);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18942819041280L, 141135);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    w.i("MicroMsg.IPCDynamicPageView", "onSizeChanged(w : %d, h : %d, oldw : %d, oldh : %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("__page_view_width", paramInt1);
    localBundle1.putInt("__page_view_height", paramInt2);
    String str = this.gQf;
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("id", str);
    localBundle2.putBundle("__env_args", localBundle1);
    com.tencent.mm.ipcinvoker.e.a("com.tencent.mm:support", localBundle2, a.g.class, null);
    GMTrace.o(18942819041280L, 141135);
  }
  
  public final void os(String paramString)
  {
    GMTrace.i(18852356292608L, 140461);
    this.iNR.os(paramString);
    GMTrace.o(18852356292608L, 140461);
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(18852758945792L, 140464);
    this.iNR.ot(paramString);
    GMTrace.o(18852758945792L, 140464);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18852893163520L, 140465);
    this.iNR.setStartTime(paramLong);
    GMTrace.o(18852893163520L, 140465);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/widget/IPCDynamicPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */