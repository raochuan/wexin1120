package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
  implements z
{
  private String appId;
  private String appName;
  private String fFg;
  private String fMb;
  private MMActivity fsU;
  private int h;
  private String hNh;
  private Bitmap hkH;
  private TextView iin;
  private View jSz;
  private boolean nJR;
  private int qyA;
  private String qyB;
  private String qyC;
  private com.tencent.mm.modelsns.b qyD;
  private String qyu;
  private byte[] qyv;
  private String qyw;
  private int qyx;
  private CdnImageView qyy;
  private TextView qyz;
  private String title;
  private int w;
  
  public n(MMActivity paramMMActivity)
  {
    GMTrace.i(8369549082624L, 62358);
    this.w = -1;
    this.h = -1;
    this.hNh = "";
    this.title = "";
    this.qyu = "";
    this.qyv = null;
    this.hkH = null;
    this.jSz = null;
    this.qyy = null;
    this.iin = null;
    this.qyz = null;
    this.nJR = false;
    this.qyB = "";
    this.qyC = "";
    this.appName = "";
    this.appId = "";
    this.fFg = "";
    this.qyD = null;
    this.fsU = paramMMActivity;
    GMTrace.o(8369549082624L, 62358);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8369683300352L, 62359);
    this.qyD = com.tencent.mm.modelsns.b.q(this.fsU.getIntent());
    this.w = this.fsU.getIntent().getIntExtra("Ksnsupload_width", -1);
    this.h = this.fsU.getIntent().getIntExtra("Ksnsupload_height", -1);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.hNh = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_link"), "");
    this.title = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_title"), "");
    this.qyu = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
    this.fFg = this.fsU.getIntent().getStringExtra("KsnsUpload_imgPath");
    this.nJR = this.fsU.getIntent().getBooleanExtra("ksnsis_video", false);
    this.fMb = bg.ap(this.fsU.getIntent().getStringExtra("src_username"), "");
    this.qyw = bg.ap(this.fsU.getIntent().getStringExtra("src_displayname"), "");
    this.qyC = bg.ap(this.fsU.getIntent().getStringExtra("KContentObjDesc"), "");
    this.qyB = bg.ap(this.fsU.getIntent().getStringExtra("KUploadProduct_UserData"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.appId = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.qyA = this.fsU.getIntent().getIntExtra("KUploadProduct_subType", 0);
    GMTrace.o(8369683300352L, 62359);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8369817518080L, 62360);
    GMTrace.o(8369817518080L, 62360);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8370220171264L, 62363);
    paramString2 = new aw(17);
    paramPInt.value = paramString2.jOR;
    if (paramInt3 > a.pXZ) {
      paramString2.uk(2);
    }
    if (parami != null) {
      paramString2.dw(parami.token, parami.uih);
    }
    paramString2.GW(this.title).GU(this.qyC).GV(this.hNh).GR(paramString1);
    boolean bool2 = false;
    boolean bool1;
    if (!bg.mZ(this.fFg))
    {
      bool1 = paramString2.a(FileOp.c(this.fFg, 0, -1), this.qyC, this.title, this.qyA, this.qyB);
      bool2 = bool1;
      if (!bool1)
      {
        w.i("MicroMsg.EmojiDesignerShareWidget", "set userData user imgurl ");
        bool2 = paramString2.a(this.qyu, this.qyu, this.qyC, this.qyA, this.qyB);
      }
      if (!bool2) {
        w.e("MicroMsg.EmojiDesignerShareWidget", "set userData faild");
      }
      paramString2.uo(this.qyx);
      paramString2.GZ(this.fMb);
      paramString2.Ha(this.qyw);
      paramString2.d(null, null, null, paramInt4, paramInt5);
      if (!paramBoolean) {
        break label452;
      }
      paramString2.up(1);
    }
    for (;;)
    {
      paramString2.bq(paramList2);
      if (!bg.mZ(this.appId))
      {
        paramString2.GX(this.appId);
        paramString2.GY(this.appName);
      }
      parami = new LinkedList();
      if (paramList1 == null) {
        break label462;
      }
      new LinkedList();
      paramString1 = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (String)paramList1.next();
        if (!paramString1.contains(paramList2))
        {
          paramPInt = new bes();
          paramPInt.jWW = paramList2;
          parami.add(paramPInt);
        }
      }
      bool1 = bool2;
      if (bg.mZ(this.qyu)) {
        break;
      }
      bool1 = bool2;
      if (com.tencent.mm.an.n.IV() == null) {
        break;
      }
      com.tencent.mm.an.n.IV();
      parami = com.tencent.mm.an.b.hm(this.qyu);
      bool1 = bool2;
      if (parami == null) {
        break;
      }
      bool1 = paramString2.a(com.tencent.mm.sdk.platformtools.d.Q(parami), this.qyC, this.title, this.qyA, this.qyB);
      break;
      label452:
      paramString2.up(0);
    }
    label462:
    paramString2.ak(parami);
    paramString2.a(paramakv);
    paramInt1 = paramString2.commit();
    if (this.qyD != null)
    {
      this.qyD.gO(paramInt1);
      e.qkT.b(this.qyD);
    }
    ae.bhl().bgd();
    this.fsU.finish();
    ((c)h.j(c.class)).getEmojiMgr().vy(this.qyB);
    ((c)h.j(c.class)).getEmojiMgr().vz(this.qyB);
    GMTrace.o(8370220171264L, 62363);
    return false;
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8370354388992L, 62364);
    GMTrace.o(8370354388992L, 62364);
    return false;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8369951735808L, 62361);
    GMTrace.o(8369951735808L, 62361);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8370085953536L, 62362);
    this.jSz = v.fa(this.fsU).inflate(i.g.pPS, null);
    this.qyy = ((CdnImageView)this.jSz.findViewById(i.f.pJY));
    this.iin = ((TextView)this.jSz.findViewById(i.f.pNx));
    this.qyz = ((TextView)this.jSz.findViewById(i.f.pKS));
    if (this.nJR)
    {
      this.jSz.findViewById(i.f.state).setVisibility(0);
      this.iin.setText(this.title);
      if (bg.mZ(this.qyu)) {
        break label186;
      }
      this.qyy.setVisibility(0);
      this.qyy.O(this.qyu, 0, 0);
    }
    for (;;)
    {
      com.tencent.mm.plugin.sns.data.i.b(this.qyy, this.fsU);
      View localView = this.jSz;
      GMTrace.o(8370085953536L, 62362);
      return localView;
      this.jSz.findViewById(i.f.state).setVisibility(8);
      break;
      label186:
      if (!bg.bp(this.qyv))
      {
        this.qyy.setVisibility(0);
        this.hkH = com.tencent.mm.sdk.platformtools.d.bf(this.qyv);
        this.qyy.setImageBitmap(this.hkH);
      }
      else
      {
        this.qyy.setVisibility(8);
      }
    }
  }
  
  public final boolean bld()
  {
    GMTrace.i(8370488606720L, 62365);
    if ((this.hkH != null) && (!this.hkH.isRecycled())) {
      this.hkH.recycle();
    }
    GMTrace.o(8370488606720L, 62365);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */