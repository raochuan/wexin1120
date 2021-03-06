package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class b
  extends com.tencent.mm.sdk.e.j
{
  public static final String[] gMz;
  public com.tencent.mm.bt.g hhi;
  
  static
  {
    GMTrace.i(11216709746688L, 83571);
    gMz = new String[] { "CREATE TABLE IF NOT EXISTS massendinfo ( clientid text  PRIMARY KEY , status int  , createtime long  , lastmodifytime long  , filename text  , thumbfilename text  , tolist text  , tolistcount int  , msgtype int  , mediatime int  , datanetoffset int  , datalen int  , thumbnetoffset int  , thumbtotallen int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  massendinfostatus_index ON massendinfo ( status )" };
    GMTrace.o(11216709746688L, 83571);
  }
  
  public b(com.tencent.mm.bt.g paramg)
  {
    GMTrace.i(11215904440320L, 83565);
    this.hhi = paramg;
    GMTrace.o(11215904440320L, 83565);
  }
  
  public static Bitmap Be(String paramString)
  {
    GMTrace.i(11216172875776L, 83567);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(11216172875776L, 83567);
      return null;
    }
    paramString = paramString.trim();
    StringBuilder localStringBuilder = new StringBuilder();
    ap.AS();
    paramString = com.tencent.mm.platformtools.j.mS(c.yV() + paramString);
    GMTrace.o(11216172875776L, 83567);
    return paramString;
  }
  
  public static String a(a parama)
  {
    GMTrace.i(11216441311232L, 83569);
    switch (parama.msgType)
    {
    default: 
      parama = ab.getContext().getResources().getString(R.l.dNd);
      GMTrace.o(11216441311232L, 83569);
      return parama;
    case 1: 
      parama = parama.aMr();
      GMTrace.o(11216441311232L, 83569);
      return parama;
    case 3: 
      parama = ab.getContext().getResources().getString(R.l.dwG);
      GMTrace.o(11216441311232L, 83569);
      return parama;
    case 34: 
      parama = ab.getContext().getResources().getString(R.l.dxw);
      GMTrace.o(11216441311232L, 83569);
      return parama;
    }
    parama = ab.getContext().getResources().getString(R.l.dxv);
    GMTrace.o(11216441311232L, 83569);
    return parama;
  }
  
  public static Bitmap b(String paramString, float paramFloat)
  {
    GMTrace.i(11216038658048L, 83566);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(11216038658048L, 83566);
      return null;
    }
    paramString = paramString.trim();
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = BackwardSupportUtil.b.c(c.yV() + paramString, paramFloat);
    paramString = (String)localObject;
    if (localObject != null) {
      paramString = Bitmap.createScaledBitmap((Bitmap)localObject, (int)(((Bitmap)localObject).getWidth() * paramFloat), (int)(((Bitmap)localObject).getHeight() * paramFloat), true);
    }
    GMTrace.o(11216038658048L, 83566);
    return paramString;
  }
  
  public static a h(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(11216307093504L, 83568);
    if (!e.aZ(paramString1))
    {
      GMTrace.o(11216307093504L, 83568);
      return null;
    }
    ap.AS();
    Object localObject = c.yV();
    int i = BackwardSupportUtil.ExifHelper.QG(paramString1);
    String str = com.tencent.mm.a.g.n((paramString1 + System.currentTimeMillis()).getBytes());
    w.d("MicroMsg.MasSendInfoStorage", "insert : original img path = " + paramString1);
    BitmapFactory.Options localOptions = d.QI(paramString1);
    if ((paramInt2 == 0) && ((e.aY(paramString1) > 204800) || ((localOptions != null) && ((localOptions.outHeight > 960) || (localOptions.outWidth > 960)))))
    {
      if (!d.a(paramString1, 960, 960, Bitmap.CompressFormat.JPEG, 70, (String)localObject, str))
      {
        GMTrace.o(11216307093504L, 83568);
        return null;
      }
      e.g((String)localObject, str, str + ".jpg");
    }
    for (;;)
    {
      paramString1 = str + ".jpg";
      w.d("MicroMsg.MasSendInfoStorage", "insert: compressed bigImgPath = " + paramString1);
      if ((paramInt2 != 0) || (i == 0) || (d.a((String)localObject + paramString1, i, Bitmap.CompressFormat.JPEG, (String)localObject, str + ".jpg"))) {
        break;
      }
      GMTrace.o(11216307093504L, 83568);
      return null;
      e.a((String)localObject, str, ".jpg", e.c(paramString1, 0, e.aY(paramString1)));
    }
    str = com.tencent.mm.a.g.n((paramString1 + System.currentTimeMillis()).getBytes());
    if (!d.a((String)localObject + paramString1, 120, 120, Bitmap.CompressFormat.JPEG, 90, (String)localObject, str))
    {
      GMTrace.o(11216307093504L, 83568);
      return null;
    }
    w.d("MicroMsg.MasSendInfoStorage", "insert: thumbName = " + str);
    localObject = new a();
    ((a)localObject).msgType = 3;
    ((a)localObject).nGo = paramString2;
    ((a)localObject).nGp = paramInt1;
    ((a)localObject).nGn = str;
    ((a)localObject).filename = paramString1;
    GMTrace.o(11216307093504L, 83568);
    return (a)localObject;
  }
  
  public final a Bf(String paramString)
  {
    Object localObject = null;
    GMTrace.i(11216575528960L, 83570);
    paramString = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.clientid = \"" + bg.mX(paramString) + "\"";
    Cursor localCursor = this.hhi.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(11216575528960L, 83570);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new a();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(11216575528960L, 83570);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */