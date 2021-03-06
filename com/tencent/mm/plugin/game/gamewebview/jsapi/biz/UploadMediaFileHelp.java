package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.an.n;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.c.b;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import java.util.HashMap;

public final class UploadMediaFileHelp
{
  public static ProgressDialog ilL;
  public MMActivity iqJ;
  public String iqL;
  public com.tencent.mm.plugin.game.gamewebview.ui.d muE;
  public String mvs;
  public boolean mvt;
  public b mvu;
  
  static
  {
    GMTrace.i(17062965542912L, 127129);
    ilL = null;
    GMTrace.o(17062965542912L, 127129);
  }
  
  public UploadMediaFileHelp()
  {
    GMTrace.i(20361231990784L, 151703);
    GMTrace.o(20361231990784L, 151703);
  }
  
  public static void a(Context paramContext, WebViewJSSDKFileItem paramWebViewJSSDKFileItem, String paramString1, final String paramString2, int paramInt, boolean paramBoolean, final a parama)
  {
    GMTrace.i(17062697107456L, 127127);
    c.b local5 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(17046456762368L, 127006);
        w.i("MicroMsg.UploadMediaFileHelp", " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
        if ((!bg.mZ(paramAnonymousString1)) && (paramAnonymousString1.equals(this.mvy)))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(this);
          if (UploadMediaFileHelp.ilL != null)
          {
            UploadMediaFileHelp.ilL.dismiss();
            UploadMediaFileHelp.ilL = null;
          }
          parama.b(paramAnonymousBoolean, paramAnonymousString2, paramAnonymousString3);
        }
        GMTrace.o(17046456762368L, 127006);
      }
    };
    if (paramWebViewJSSDKFileItem.iGo) {}
    for (int i = 0;; i = 1)
    {
      Object localObject1 = new PString();
      Object localObject2 = new PInt();
      PInt localPInt = new PInt();
      long l = n.IW().a(paramWebViewJSSDKFileItem.iGk, i, 0, 0, (PString)localObject1, (PInt)localObject2, localPInt);
      localObject2 = n.IW().b(Long.valueOf(l));
      localObject1 = paramWebViewJSSDKFileItem.iGk;
      localObject2 = n.IW().l(((com.tencent.mm.an.d)localObject2).hzf, "", "");
      paramWebViewJSSDKFileItem.iGk = ((String)localObject2);
      w.i("MicroMsg.UploadMediaFileHelp", "Image Inserted: %s", new Object[] { localObject2 });
      boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(paramString1, paramString2, paramInt, 202, 2, local5);
      w.i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
      paramWebViewJSSDKFileItem.iGk = ((String)localObject1);
      if (bool) {
        break;
      }
      parama.b(false, "", "");
      GMTrace.o(17062697107456L, 127127);
      return;
    }
    if (paramBoolean)
    {
      paramContext.getString(R.l.dxm);
      ilL = h.a(paramContext, paramContext.getString(R.l.fcS), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(17041759141888L, 126971);
          com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(this.mvA);
          com.tencent.mm.plugin.webview.modeltools.f.bAJ();
          ac.ou(paramString2);
          parama.b(false, "", "");
          GMTrace.o(17041759141888L, 126971);
        }
      });
    }
    GMTrace.o(17062697107456L, 127127);
  }
  
  public static void a(Context paramContext, String paramString1, final String paramString2, int paramInt, boolean paramBoolean, final a parama)
  {
    GMTrace.i(17062831325184L, 127128);
    c.b local7 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(17035853561856L, 126927);
        w.i("MicroMsg.UploadMediaFileHelp", "on cdn finish,  is success : %s, mediaId : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
        if ((bg.mZ(paramAnonymousString1)) || (!paramAnonymousString1.equals(this.mvy)))
        {
          GMTrace.o(17035853561856L, 126927);
          return;
        }
        com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(this);
        if (UploadMediaFileHelp.ilL != null)
        {
          UploadMediaFileHelp.ilL.dismiss();
          UploadMediaFileHelp.ilL = null;
        }
        parama.b(paramAnonymousBoolean, paramAnonymousString2, paramAnonymousString3);
        GMTrace.o(17035853561856L, 126927);
      }
    };
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(paramString1, paramString2, paramInt, 202, 2, local7);
    w.i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      parama.b(false, "", "");
      GMTrace.o(17062831325184L, 127128);
      return;
    }
    if (paramBoolean)
    {
      paramContext.getString(R.l.dxm);
      paramString1 = h.a(paramContext, paramContext.getString(R.l.fcS), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(17063770849280L, 127135);
          com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(this.mvA);
          com.tencent.mm.plugin.webview.modeltools.f.bAJ();
          ac.ou(paramString2);
          parama.b(false, "", "");
          GMTrace.o(17063770849280L, 127135);
        }
      });
      ilL = paramString1;
      paramString1.setOnKeyListener(new DialogInterface.OnKeyListener()
      {
        public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(17065515679744L, 127148);
          if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
          {
            h.a(this.val$context, true, this.val$context.getString(R.l.fbs), "", this.val$context.getString(R.l.fbp), this.val$context.getString(R.l.fbq), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(17035585126400L, 126925);
                UploadMediaFileHelp.ilL.cancel();
                GMTrace.o(17035585126400L, 126925);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(17057865269248L, 127091);
                GMTrace.o(17057865269248L, 127091);
              }
            });
            GMTrace.o(17065515679744L, 127148);
            return true;
          }
          GMTrace.o(17065515679744L, 127148);
          return false;
        }
      });
    }
    GMTrace.o(17062831325184L, 127128);
  }
  
  public final void aCS()
  {
    GMTrace.i(17062294454272L, 127124);
    if (this.muE.mwO != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("close_window_confirm_dialog_switch", true);
      localBundle.putString("close_window_confirm_dialog_title_cn", this.iqJ.getString(R.l.fbs));
      localBundle.putString("close_window_confirm_dialog_title_eng", this.iqJ.getString(R.l.fbs));
      localBundle.putString("close_window_confirm_dialog_ok_cn", this.iqJ.getString(R.l.fbp));
      localBundle.putString("close_window_confirm_dialog_ok_eng", this.iqJ.getString(R.l.fbp));
      localBundle.putString("close_window_confirm_dialog_cancel_cn", this.iqJ.getString(R.l.fbq));
      localBundle.putString("close_window_confirm_dialog_cancel_eng", this.iqJ.getString(R.l.fbq));
      this.muE.mwO.z(localBundle);
    }
    aCT();
    GMTrace.o(17062294454272L, 127124);
  }
  
  final void aCT()
  {
    GMTrace.i(17062428672000L, 127125);
    if (this.mvt)
    {
      localObject = new UploadMediaFileActivity(this.iqJ);
      ((UploadMediaFileActivity)localObject).mvD = this.mvs;
      ((UploadMediaFileActivity)localObject).appId = this.iqL;
      ((UploadMediaFileActivity)localObject).mvE = this.mvt;
      ((UploadMediaFileActivity)localObject).iQi = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17060549623808L, 127111);
          UploadMediaFileHelp.this.aCU();
          if (localObject.mvG)
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put("serverId", bg.mY(localObject.mediaId));
            localHashMap.put("mediaUrl", bg.mY(localObject.mvF));
            UploadMediaFileHelp.this.mvu.a(true, localHashMap);
            GMTrace.o(17060549623808L, 127111);
            return;
          }
          UploadMediaFileHelp.this.mvu.a(false, null);
          GMTrace.o(17060549623808L, 127111);
        }
      };
      ((UploadMediaFileActivity)localObject).azb();
      GMTrace.o(17062428672000L, 127125);
      return;
    }
    final Object localObject = new UploadMediaFileTask();
    ((UploadMediaFileTask)localObject).mvD = this.mvs;
    ((UploadMediaFileTask)localObject).appId = this.iqL;
    ((UploadMediaFileTask)localObject).iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17037464174592L, 126939);
        localObject.VE();
        UploadMediaFileHelp.this.aCU();
        if (localObject.success)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("serverId", bg.mY(localObject.mediaId));
          localHashMap.put("mediaUrl", bg.mY(localObject.mvF));
          UploadMediaFileHelp.this.mvu.a(true, localHashMap);
          GMTrace.o(17037464174592L, 126939);
          return;
        }
        UploadMediaFileHelp.this.mvu.a(false, null);
        GMTrace.o(17037464174592L, 126939);
      }
    };
    ((UploadMediaFileTask)localObject).VD();
    GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
    GMTrace.o(17062428672000L, 127125);
  }
  
  public final void aCU()
  {
    GMTrace.i(17062562889728L, 127126);
    if (this.muE.mwO != null)
    {
      e locale = this.muE.mwO;
      if (locale.mya != null)
      {
        locale.mya.dismiss();
        locale.mya = null;
      }
      this.muE.mwO.z(null);
    }
    GMTrace.o(17062562889728L, 127126);
  }
  
  public static class UploadMediaFileActivity
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<UploadMediaFileActivity> CREATOR;
    public String appId;
    public Runnable iQi;
    public String mediaId;
    private UploadMediaFileHelp.a mvC;
    public String mvD;
    public boolean mvE;
    public String mvF;
    public boolean mvG;
    
    static
    {
      GMTrace.i(17049677987840L, 127030);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17049677987840L, 127030);
    }
    
    public UploadMediaFileActivity(Parcel paramParcel)
    {
      GMTrace.i(17049543770112L, 127029);
      f(paramParcel);
      GMTrace.o(17049543770112L, 127029);
    }
    
    public UploadMediaFileActivity(MMActivity paramMMActivity)
    {
      super();
      GMTrace.i(17049409552384L, 127028);
      GMTrace.o(17049409552384L, 127028);
    }
    
    public final void VB()
    {
      GMTrace.i(17049006899200L, 127025);
      if (this.iQi != null) {
        this.iQi.run();
      }
      GMTrace.o(17049006899200L, 127025);
    }
    
    public final void a(Context paramContext, final GameProcessActivityTask.a parama)
    {
      GMTrace.i(17048872681472L, 127024);
      w.i("MicroMsg.UploadMediaFileActivity", "runInMainProcess");
      if (this.mvC == null) {
        this.mvC = new UploadMediaFileHelp.a()
        {
          public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2)
          {
            GMTrace.i(17038001045504L, 126943);
            w.i("MicroMsg.UploadMediaFileActivity", "success = %b, mediaId = %s, mediaUrl = %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString1, paramAnonymousString2 });
            if (paramAnonymousBoolean)
            {
              UploadMediaFileHelp.UploadMediaFileActivity localUploadMediaFileActivity = UploadMediaFileHelp.UploadMediaFileActivity.this;
              GameProcessActivityTask.a locala = parama;
              localUploadMediaFileActivity.mediaId = paramAnonymousString1;
              localUploadMediaFileActivity.mvF = paramAnonymousString2;
              localUploadMediaFileActivity.mvG = true;
              locala.WJ();
              GMTrace.o(17038001045504L, 126943);
              return;
            }
            UploadMediaFileHelp.UploadMediaFileActivity.this.a(parama);
            GMTrace.o(17038001045504L, 126943);
          }
        };
      }
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bAK().Ks(this.mvD);
      if (localWebViewJSSDKFileItem == null)
      {
        a(parama);
        GMTrace.o(17048872681472L, 127024);
        return;
      }
      switch (localWebViewJSSDKFileItem.fzJ)
      {
      case 2: 
      case 3: 
      default: 
        UploadMediaFileHelp.a(paramContext, this.appId, this.mvD, b.hrB, this.mvE, this.mvC);
        GMTrace.o(17048872681472L, 127024);
        return;
      case 1: 
        UploadMediaFileHelp.a(paramContext, localWebViewJSSDKFileItem, this.appId, this.mvD, b.hrA, this.mvE, this.mvC);
        GMTrace.o(17048872681472L, 127024);
        return;
      }
      UploadMediaFileHelp.a(paramContext, this.appId, this.mvD, b.hrB, this.mvE, this.mvC);
      GMTrace.o(17048872681472L, 127024);
    }
    
    public final void a(GameProcessActivityTask.a parama)
    {
      GMTrace.i(17048738463744L, 127023);
      this.mvG = false;
      parama.WJ();
      GMTrace.o(17048738463744L, 127023);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(17049141116928L, 127026);
      this.mvD = paramParcel.readString();
      this.appId = paramParcel.readString();
      if (paramParcel.readByte() == 1)
      {
        bool1 = true;
        this.mvE = bool1;
        this.mediaId = paramParcel.readString();
        this.mvF = paramParcel.readString();
        if (paramParcel.readByte() != 1) {
          break label86;
        }
      }
      label86:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.mvG = bool1;
        GMTrace.o(17049141116928L, 127026);
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(17049275334656L, 127027);
      paramParcel.writeString(this.mvD);
      paramParcel.writeString(this.appId);
      if (this.mvE)
      {
        paramInt = 1;
        paramParcel.writeByte((byte)paramInt);
        paramParcel.writeString(this.mediaId);
        paramParcel.writeString(this.mvF);
        if (!this.mvG) {
          break label86;
        }
      }
      label86:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(17049275334656L, 127027);
        return;
        paramInt = 0;
        break;
      }
    }
  }
  
  public static class UploadMediaFileTask
    extends GWMainProcessTask
  {
    public static final Parcelable.Creator<UploadMediaFileTask> CREATOR;
    public String appId;
    public Runnable iQi;
    public String mediaId;
    private UploadMediaFileHelp.a mvC;
    public String mvD;
    public String mvF;
    public boolean success;
    
    static
    {
      GMTrace.i(17056523091968L, 127081);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17056523091968L, 127081);
    }
    
    public UploadMediaFileTask()
    {
      GMTrace.i(17056120438784L, 127078);
      GMTrace.o(17056120438784L, 127078);
    }
    
    public UploadMediaFileTask(Parcel paramParcel)
    {
      GMTrace.i(17056254656512L, 127079);
      f(paramParcel);
      GMTrace.o(17056254656512L, 127079);
    }
    
    public final void RS()
    {
      GMTrace.i(17055583567872L, 127074);
      w.i("MicroMsg.UploadMediaTask", "runInMainProcess");
      if (this.mvC == null) {
        this.mvC = new UploadMediaFileHelp.a()
        {
          public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2)
          {
            GMTrace.i(17064978808832L, 127144);
            w.i("MicroMsg.UploadMediaTask", "success = %b, mediaId = %s, mediaUrl = %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString1, paramAnonymousString2 });
            UploadMediaFileHelp.UploadMediaFileTask.this.success = paramAnonymousBoolean;
            UploadMediaFileHelp.UploadMediaFileTask.this.mediaId = paramAnonymousString1;
            UploadMediaFileHelp.UploadMediaFileTask.this.mvF = paramAnonymousString2;
            UploadMediaFileHelp.UploadMediaFileTask.a(UploadMediaFileHelp.UploadMediaFileTask.this);
            GMTrace.o(17064978808832L, 127144);
          }
        };
      }
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bAK().Ks(this.mvD);
      if (localWebViewJSSDKFileItem == null)
      {
        VC();
        GMTrace.o(17055583567872L, 127074);
        return;
      }
      switch (localWebViewJSSDKFileItem.fzJ)
      {
      case 2: 
      case 3: 
      default: 
        UploadMediaFileHelp.a(ab.getContext(), this.appId, this.mvD, b.hrB, false, this.mvC);
        GMTrace.o(17055583567872L, 127074);
        return;
      case 1: 
        UploadMediaFileHelp.a(ab.getContext(), localWebViewJSSDKFileItem, this.appId, this.mvD, b.hrA, false, this.mvC);
        GMTrace.o(17055583567872L, 127074);
        return;
      }
      UploadMediaFileHelp.a(ab.getContext(), this.appId, this.mvD, b.hrB, false, this.mvC);
      GMTrace.o(17055583567872L, 127074);
    }
    
    public final void VB()
    {
      GMTrace.i(17055717785600L, 127075);
      if (this.iQi != null) {
        this.iQi.run();
      }
      GMTrace.o(17055717785600L, 127075);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(17055852003328L, 127076);
      this.mvD = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.mediaId = paramParcel.readString();
      this.mvF = paramParcel.readString();
      if (paramParcel.readByte() == 1) {}
      for (;;)
      {
        this.success = bool;
        GMTrace.o(17055852003328L, 127076);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17055986221056L, 127077);
      paramParcel.writeString(this.mvD);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.mediaId);
      paramParcel.writeString(this.mvF);
      if (this.success) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(17055986221056L, 127077);
        return;
      }
    }
  }
  
  private static abstract interface a
  {
    public abstract void b(boolean paramBoolean, String paramString1, String paramString2);
  }
  
  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean, HashMap<String, Object> paramHashMap);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/UploadMediaFileHelp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */