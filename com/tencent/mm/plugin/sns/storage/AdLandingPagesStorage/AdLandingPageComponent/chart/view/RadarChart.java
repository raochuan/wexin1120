package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart;
import java.util.ArrayList;

public class RadarChart
  extends Chart
{
  private Context context;
  public ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a> qoB;
  public c qoC;
  public TextView qoD;
  public RadarGrid qoE;
  private RadarDataLayer[] qoF;
  private a qoG;
  private boolean qoH;
  private boolean qoI;
  public int qoJ;
  public int qoK;
  public int qoL;
  public Spannable[] qoM;
  private float qoN;
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8211037945856L, 61177);
    this.qoC = new c();
    this.qoH = true;
    this.qoI = true;
    this.qoJ = 3;
    this.qoK = 0;
    this.qoL = 4;
    this.qoN = 1.0F;
    this.context = paramContext;
    GMTrace.o(8211037945856L, 61177);
  }
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8211172163584L, 61178);
    this.qoC = new c();
    this.qoH = true;
    this.qoI = true;
    this.qoJ = 3;
    this.qoK = 0;
    this.qoL = 4;
    this.qoN = 1.0F;
    this.context = paramContext;
    GMTrace.o(8211172163584L, 61178);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a... paramVarArgs)
  {
    int k = 0;
    GMTrace.i(8211306381312L, 61179);
    removeAllViews();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      if (paramVarArgs[i].size() <= 0) {
        throw new Exception("Not enough elements.");
      }
      i += 1;
    }
    i = 0;
    while (i < paramVarArgs.length)
    {
      j = 0;
      while (j < paramVarArgs.length)
      {
        if (!paramVarArgs[i].a(paramVarArgs[j])) {
          throw new Error("Layer not compatible.");
        }
        j += 1;
      }
      i += 1;
    }
    this.qoM = paramVarArgs[0].biD();
    this.qoK = paramVarArgs[0].size();
    if (this.qoB == null) {
      this.qoB = new ArrayList();
    }
    j = paramVarArgs.length;
    i = 0;
    while (i < j)
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a locala = paramVarArgs[i];
      this.qoB.add(locala);
      i += 1;
    }
    this.qoE = new RadarGrid(this.context, this.qoK, this.qoL, this.qoN, this.qoM, this.qoC);
    addView(this.qoE);
    this.qoF = new RadarDataLayer[this.qoJ];
    i = k;
    while ((i < this.qoF.length) && (this.qoB.size() > i))
    {
      this.qoF[i] = new RadarDataLayer(this.context, this.qoN, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)this.qoB.get(i));
      addView(this.qoF[i]);
      i += 1;
    }
    if (this.qoG == null) {
      this.qoG = new a(this.context, this.qoC);
    }
    addView(this.qoG);
    GMTrace.o(8211306381312L, 61179);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8211440599040L, 61180);
    paramInt2 = getChildCount();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      getChildAt(paramInt1).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 += 1;
    }
    GMTrace.o(8211440599040L, 61180);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarChart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */