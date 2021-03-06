package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private static ae iKp;
  private static ae iKq;
  private static ae iKr;
  
  static
  {
    GMTrace.i(17756871196672L, 132299);
    HandlerThread localHandlerThread = e.Sc("DynamicPage#WorkerThread");
    localHandlerThread.start();
    localHandlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
    {
      public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(17757944938496L, 132307);
        w.e("MicroMsg.DynamicPageLogic", "uncaughtException(%s, %s)", new Object[] { paramAnonymousThread.getName(), Log.getStackTraceString(paramAnonymousThrowable) });
        GMTrace.o(17757944938496L, 132307);
      }
    });
    iKp = new ae(localHandlerThread.getLooper());
    localHandlerThread = e.Sc("DynamicPage#IPCThread");
    localHandlerThread.start();
    localHandlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
    {
      public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
      {
        GMTrace.i(17740496633856L, 132177);
        w.e("MicroMsg.DynamicPageLogic", "uncaughtException(%s, %s)", new Object[] { paramAnonymousThread.getName(), Log.getStackTraceString(paramAnonymousThrowable) });
        GMTrace.o(17740496633856L, 132177);
      }
    });
    iKq = new ae(localHandlerThread.getLooper());
    iKr = new ae(Looper.getMainLooper());
    GMTrace.o(17756871196672L, 132299);
  }
  
  public static ae Uz()
  {
    GMTrace.i(17756334325760L, 132295);
    ae localae = iKp;
    GMTrace.o(17756334325760L, 132295);
    return localae;
  }
  
  public static boolean e(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(17756602761216L, 132297);
    if (paramRunnable == null)
    {
      GMTrace.o(17756602761216L, 132297);
      return false;
    }
    boolean bool = iKp.postDelayed(paramRunnable, paramLong);
    GMTrace.o(17756602761216L, 132297);
    return bool;
  }
  
  public static boolean k(Runnable paramRunnable)
  {
    GMTrace.i(17756468543488L, 132296);
    if (paramRunnable == null)
    {
      GMTrace.o(17756468543488L, 132296);
      return false;
    }
    boolean bool = iKp.post(paramRunnable);
    GMTrace.o(17756468543488L, 132296);
    return bool;
  }
  
  public static boolean l(Runnable paramRunnable)
  {
    GMTrace.i(17756736978944L, 132298);
    boolean bool = iKr.post(paramRunnable);
    GMTrace.o(17756736978944L, 132298);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */