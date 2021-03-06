package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.protocal.c.als;
import com.tencent.mm.protocal.c.axa;
import com.tencent.mm.protocal.c.axb;
import com.tencent.mm.sdk.platformtools.bg;

public final class AppBrandOpReportLogic
{
  public static final class AppBrandOnOpReportStartEvent
    implements Parcelable
  {
    public static final Parcelable.Creator<AppBrandOnOpReportStartEvent> CREATOR;
    String appId;
    
    static
    {
      GMTrace.i(17384551219200L, 129525);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17384551219200L, 129525);
    }
    
    AppBrandOnOpReportStartEvent()
    {
      GMTrace.i(17384282783744L, 129523);
      GMTrace.o(17384282783744L, 129523);
    }
    
    AppBrandOnOpReportStartEvent(Parcel paramParcel)
    {
      GMTrace.i(17384417001472L, 129524);
      this.appId = paramParcel.readString();
      GMTrace.o(17384417001472L, 129524);
    }
    
    public static void qs(String paramString)
    {
      GMTrace.i(17383880130560L, 129520);
      AppBrandOnOpReportStartEvent localAppBrandOnOpReportStartEvent = new AppBrandOnOpReportStartEvent();
      localAppBrandOnOpReportStartEvent.appId = paramString;
      d.a(localAppBrandOnOpReportStartEvent);
      GMTrace.o(17383880130560L, 129520);
    }
    
    public final int describeContents()
    {
      GMTrace.i(17384014348288L, 129521);
      GMTrace.o(17384014348288L, 129521);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17384148566016L, 129522);
      paramParcel.writeString(this.appId);
      GMTrace.o(17384148566016L, 129522);
    }
  }
  
  static final class ReportTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<ReportTask> CREATOR;
    String appId;
    int fNP;
    int fNV;
    String ftz;
    int iQS;
    int iUz;
    String iZJ;
    int scene;
    String username;
    
    static
    {
      GMTrace.i(17386027614208L, 129536);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17386027614208L, 129536);
    }
    
    ReportTask()
    {
      GMTrace.i(17385759178752L, 129534);
      GMTrace.o(17385759178752L, 129534);
    }
    
    ReportTask(Parcel paramParcel)
    {
      GMTrace.i(17385893396480L, 129535);
      f(paramParcel);
      GMTrace.o(17385893396480L, 129535);
    }
    
    public final void RS()
    {
      GMTrace.i(17385222307840L, 129530);
      AppBrandOpReportLogic.b.a(this);
      GMTrace.o(17385222307840L, 129530);
    }
    
    public final int describeContents()
    {
      GMTrace.i(17385356525568L, 129531);
      GMTrace.o(17385356525568L, 129531);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17385624961024L, 129533);
      this.appId = paramParcel.readString();
      this.username = paramParcel.readString();
      this.iQS = paramParcel.readInt();
      this.fNP = paramParcel.readInt();
      this.scene = paramParcel.readInt();
      this.fNV = paramParcel.readInt();
      this.ftz = paramParcel.readString();
      this.iUz = paramParcel.readInt();
      this.iZJ = paramParcel.readString();
      GMTrace.o(17385624961024L, 129533);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17385490743296L, 129532);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.username);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeInt(this.fNP);
      paramParcel.writeInt(this.scene);
      paramParcel.writeInt(this.fNV);
      paramParcel.writeString(this.ftz);
      paramParcel.writeInt(this.iUz);
      paramParcel.writeString(this.iZJ);
      GMTrace.o(17385490743296L, 129532);
    }
  }
  
  public static final class a
  {
    private static boolean iZH;
    
    static
    {
      GMTrace.i(17384819654656L, 129527);
      iZH = false;
      GMTrace.o(17384819654656L, 129527);
    }
    
    /* Error */
    public static void WQ()
    {
      // Byte code:
      //   0: ldc 2
      //   2: monitorenter
      //   3: ldc2_w 30
      //   6: ldc 32
      //   8: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   11: getstatic 24	com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic$a:iZH	Z
      //   14: ifeq +15 -> 29
      //   17: ldc2_w 30
      //   20: ldc 32
      //   22: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   25: ldc 2
      //   27: monitorexit
      //   28: return
      //   29: new 9	com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic$a$1
      //   32: dup
      //   33: invokespecial 35	com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic$a$1:<init>	()V
      //   36: invokestatic 40	com/tencent/mm/plugin/appbrand/ipc/MMToClientEvent:a	(Lcom/tencent/mm/plugin/appbrand/ipc/MMToClientEvent$a;)V
      //   39: iconst_1
      //   40: putstatic 24	com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic$a:iZH	Z
      //   43: ldc2_w 30
      //   46: ldc 32
      //   48: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   51: goto -26 -> 25
      //   54: astore_0
      //   55: ldc 2
      //   57: monitorexit
      //   58: aload_0
      //   59: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   54	5	0	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   3	25	54	finally
      //   29	51	54	finally
    }
  }
  
  public static final class b
  {
    private static final SparseIntArray iZI;
    
    static
    {
      GMTrace.i(17383745912832L, 129519);
      iZI = new SparseIntArray();
      GMTrace.o(17383745912832L, 129519);
    }
    
    static void a(AppBrandOpReportLogic.ReportTask paramReportTask)
    {
      GMTrace.i(17383611695104L, 129518);
      if (paramReportTask == null)
      {
        GMTrace.o(17383611695104L, 129518);
        return;
      }
      b.a locala = new b.a();
      locala.hlW = 1345;
      locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/reportwxaappexpose";
      locala.hlY = new axb();
      String str = paramReportTask.appId;
      axa localaxa = new axa();
      localaxa.urC = new als();
      localaxa.urC.fKY = str;
      localaxa.urC.username = paramReportTask.username;
      localaxa.urC.ude = paramReportTask.iQS;
      localaxa.urC.tAS = paramReportTask.fNP;
      localaxa.urC.ttY = paramReportTask.scene;
      localaxa.urC.ugv = paramReportTask.fNV;
      localaxa.urC.ugw = 1;
      localaxa.urC.ugx = paramReportTask.ftz;
      localaxa.urC.ugy = paramReportTask.iUz;
      localaxa.tSf = paramReportTask.iZJ;
      locala.hlX = localaxa;
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(17382940606464L, 129513);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = (axb)paramAnonymousb.hlV.hmc;
            if (paramAnonymousString != null) {
              AppBrandOpReportLogic.b.am(this.fnb, paramAnonymousString.urD);
            }
          }
          GMTrace.o(17382940606464L, 129513);
          return 0;
        }
      }, true);
      GMTrace.o(17383611695104L, 129518);
    }
    
    static void am(String paramString, int paramInt)
    {
      GMTrace.i(17383477477376L, 129517);
      if (bg.mZ(paramString))
      {
        GMTrace.o(17383477477376L, 129517);
        return;
      }
      synchronized (iZI)
      {
        iZI.put(paramString.hashCode(), paramInt);
        GMTrace.o(17383477477376L, 129517);
        return;
      }
    }
    
    public static int qt(String paramString)
    {
      GMTrace.i(17383343259648L, 129516);
      if (bg.mZ(paramString))
      {
        GMTrace.o(17383343259648L, 129516);
        return 0;
      }
      synchronized (iZI)
      {
        int i = iZI.get(paramString.hashCode(), 0);
        GMTrace.o(17383343259648L, 129516);
        return i;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */