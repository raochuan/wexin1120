package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;

public class BakMoveBaseUI
  extends MMActivity
{
  protected TextView jUA;
  protected Button jUB;
  protected TextView jUx;
  protected TextView jUy;
  protected ProgressBar jUz;
  private PowerManager.WakeLock wakeLock;
  
  public BakMoveBaseUI()
  {
    GMTrace.i(14796967641088L, 110246);
    GMTrace.o(14796967641088L, 110246);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14797504512000L, 110250);
    int i = R.i.cMU;
    GMTrace.o(14797504512000L, 110250);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14797101858816L, 110247);
    super.onCreate(paramBundle);
    this.jUx = ((TextView)findViewById(R.h.czf));
    this.jUy = ((TextView)findViewById(R.h.cza));
    this.jUz = ((ProgressBar)findViewById(R.h.clb));
    this.jUA = ((TextView)findViewById(R.h.chI));
    this.jUB = ((Button)findViewById(R.h.bjX));
    this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(26, "My Lock");
    GMTrace.o(14797101858816L, 110247);
  }
  
  public void onPause()
  {
    GMTrace.i(14797370294272L, 110249);
    super.onPause();
    this.wakeLock.release();
    GMTrace.o(14797370294272L, 110249);
  }
  
  public void onResume()
  {
    GMTrace.i(14797236076544L, 110248);
    super.onResume();
    this.wakeLock.acquire();
    GMTrace.o(14797236076544L, 110248);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */