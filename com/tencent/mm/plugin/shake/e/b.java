package com.tencent.mm.plugin.shake.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class b
  implements i
{
  private c.a pAD;
  private String thumburl;
  
  public b(c.a parama)
  {
    GMTrace.i(6614786506752L, 49284);
    this.pAD = null;
    this.thumburl = "";
    this.pAD = parama;
    GMTrace.o(6614786506752L, 49284);
  }
  
  public b(String paramString)
  {
    GMTrace.i(6614920724480L, 49285);
    this.pAD = null;
    this.thumburl = "";
    this.thumburl = paramString;
    GMTrace.o(6614920724480L, 49285);
  }
  
  public final void F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6616128684032L, 49294);
    GMTrace.o(6616128684032L, 49294);
  }
  
  public final i.b Pf()
  {
    GMTrace.i(6616531337216L, 49297);
    GMTrace.o(6616531337216L, 49297);
    return null;
  }
  
  public final String Pg()
  {
    GMTrace.i(6615054942208L, 49286);
    String str;
    if ((this.pAD != null) && (this.pAD.field_thumburl != null))
    {
      str = m.dk(this.pAD.field_thumburl, "@S");
      GMTrace.o(6615054942208L, 49286);
      return str;
    }
    if (this.thumburl != null)
    {
      str = m.dk(this.thumburl, "@S");
      GMTrace.o(6615054942208L, 49286);
      return str;
    }
    GMTrace.o(6615054942208L, 49286);
    return "";
  }
  
  public final String Ph()
  {
    GMTrace.i(6615189159936L, 49287);
    if ((this.pAD != null) && (this.pAD.field_thumburl != null))
    {
      str = this.pAD.field_thumburl;
      GMTrace.o(6615189159936L, 49287);
      return str;
    }
    String str = this.thumburl;
    GMTrace.o(6615189159936L, 49287);
    return str;
  }
  
  public final String Pi()
  {
    GMTrace.i(6615323377664L, 49288);
    String str = Ph() + "_tv";
    GMTrace.o(6615323377664L, 49288);
    return str;
  }
  
  public final String Pj()
  {
    GMTrace.i(6615457595392L, 49289);
    String str = Ph() + "_tv";
    GMTrace.o(6615457595392L, 49289);
    return str;
  }
  
  public final boolean Pk()
  {
    GMTrace.i(6615591813120L, 49290);
    GMTrace.o(6615591813120L, 49290);
    return false;
  }
  
  public final boolean Pl()
  {
    GMTrace.i(6615726030848L, 49291);
    GMTrace.o(6615726030848L, 49291);
    return false;
  }
  
  public final Bitmap Pm()
  {
    GMTrace.i(6616397119488L, 49296);
    if (ab.getContext() == null)
    {
      GMTrace.o(6616397119488L, 49296);
      return null;
    }
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.bbq);
    GMTrace.o(6616397119488L, 49296);
    return localBitmap;
  }
  
  public final void Pn()
  {
    GMTrace.i(6615994466304L, 49293);
    GMTrace.o(6615994466304L, 49293);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(6615860248576L, 49292);
    if (i.a.iaZ == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pg(), false);
      GMTrace.o(6615860248576L, 49292);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TVImgGetStrategy", parama, "", new Object[0]);
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(6616262901760L, 49295);
    GMTrace.o(6616262901760L, 49295);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */