package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class GameJsApiGetGameCommInfo
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 241;
  public static final String NAME = "getGameCommInfo";
  
  public GameJsApiGetGameCommInfo()
  {
    GMTrace.i(17036256215040L, 126930);
    GMTrace.o(17036256215040L, 126930);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17036390432768L, 126931);
    w.i("MicroMsg.GameJsApiGetGameCommInfo", "invoke");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiGetGameCommInfo", "data is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameCommInfo:fail_invalid_data", null));
      GMTrace.o(17036390432768L, 126931);
      return;
    }
    GetGameCommInfoTask localGetGameCommInfoTask = new GetGameCommInfoTask();
    localGetGameCommInfoTask.nN = paramJSONObject.optInt("cmd", 0);
    localGetGameCommInfoTask.fCA = paramJSONObject.optString("param");
    GameWebViewMainProcessService.b(localGetGameCommInfoTask);
    paramJSONObject = new HashMap();
    paramJSONObject.put("gameRegionName", localGetGameCommInfoTask.result);
    paramd.v(paramInt, d("getGameCommInfo:ok", paramJSONObject));
    GMTrace.o(17036390432768L, 126931);
  }
  
  private static class GetGameCommInfoTask
    extends GWMainProcessTask
  {
    public static final Parcelable.Creator<GetGameCommInfoTask> CREATOR;
    public String fCA;
    public int nN;
    public String result;
    
    static
    {
      GMTrace.i(17057328398336L, 127087);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17057328398336L, 127087);
    }
    
    public GetGameCommInfoTask()
    {
      GMTrace.i(17057059962880L, 127085);
      GMTrace.o(17057059962880L, 127085);
    }
    
    public GetGameCommInfoTask(Parcel paramParcel)
    {
      GMTrace.i(17057194180608L, 127086);
      f(paramParcel);
      GMTrace.o(17057194180608L, 127086);
    }
    
    public final void RS()
    {
      GMTrace.i(17056657309696L, 127082);
      gj localgj = new gj();
      localgj.fCy.nN = this.nN;
      localgj.fCy.fCA = this.fCA;
      localgj.fCy.context = ab.getContext();
      com.tencent.mm.sdk.b.a.uLm.m(localgj);
      this.result = localgj.fCz.result;
      GMTrace.o(17056657309696L, 127082);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17056791527424L, 127083);
      this.nN = paramParcel.readInt();
      this.fCA = paramParcel.readString();
      this.result = paramParcel.readString();
      GMTrace.o(17056791527424L, 127083);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17056925745152L, 127084);
      paramParcel.writeInt(this.nN);
      paramParcel.writeString(this.fCA);
      paramParcel.writeString(this.result);
      GMTrace.o(17056925745152L, 127084);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/GameJsApiGetGameCommInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */