package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.CustomViewPager;
import java.lang.ref.SoftReference;

public class AppBrandSmileyViewPager
  extends CustomViewPager
{
  private int jFA;
  b jFB;
  c jFc;
  private int jFz;
  
  public AppBrandSmileyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19871068848128L, 148051);
    this.jFz = 0;
    this.jFA = 0;
    if (Build.VERSION.SDK_INT >= 9) {
      setOverScrollMode(2);
    }
    GMTrace.o(19871068848128L, 148051);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19871203065856L, 148052);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.jFc != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.jFz)) || ((paramInt1 > 0) && (paramInt1 != this.jFA))))))
    {
      this.jFc.jFw = paramInt2;
      this.jFc.jFx = paramInt1;
      if (this.jFB != null) {
        this.jFB.acV();
      }
    }
    if (paramInt2 > 0) {
      this.jFz = paramInt2;
    }
    if (paramInt1 > 0) {
      this.jFA = paramInt1;
    }
    GMTrace.o(19871203065856L, 148052);
  }
  
  static final class a
    extends u
  {
    SparseArray<SoftReference<View>> jFC;
    private boolean jFD;
    c jFc;
    
    a()
    {
      GMTrace.i(19876571774976L, 148092);
      this.jFC = new SparseArray();
      this.jFD = false;
      GMTrace.o(19876571774976L, 148092);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(19877242863616L, 148097);
      paramViewGroup.removeView((View)paramObject);
      GMTrace.o(19877242863616L, 148097);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(19877108645888L, 148096);
      if (paramView == paramObject)
      {
        GMTrace.o(19877108645888L, 148096);
        return true;
      }
      GMTrace.o(19877108645888L, 148096);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(19877377081344L, 148098);
      View localView = null;
      if (this.jFC.get(paramInt) != null) {
        localView = (View)((SoftReference)this.jFC.get(paramInt)).get();
      }
      if (localView == null)
      {
        localView = this.jFc.acY().kd(paramInt);
        if (localView != null)
        {
          paramViewGroup.addView(localView, 0);
          this.jFC.put(paramInt, new SoftReference(localView));
        }
        for (;;)
        {
          GMTrace.o(19877377081344L, 148098);
          return localView;
          w.e("MicroMsg.AppBrandSmileyViewPagerAdapter", "contentView == null!");
        }
      }
      if (localView.getParent() != null) {
        ((ViewGroup)localView.getParent()).removeView(localView);
      }
      paramViewGroup.addView(localView, 0);
      GMTrace.o(19877377081344L, 148098);
      return localView;
    }
    
    public final int getCount()
    {
      GMTrace.i(19876974428160L, 148095);
      int i = this.jFc.acY().getPageCount();
      GMTrace.o(19876974428160L, 148095);
      return i;
    }
    
    public final int j(Object paramObject)
    {
      GMTrace.i(19876705992704L, 148093);
      if (this.jFD)
      {
        GMTrace.o(19876705992704L, 148093);
        return -2;
      }
      int i = super.j(paramObject);
      GMTrace.o(19876705992704L, 148093);
      return i;
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(19876840210432L, 148094);
      this.jFD = true;
      super.notifyDataSetChanged();
      this.jFD = false;
      GMTrace.o(19876840210432L, 148094);
    }
  }
  
  public static abstract interface b
  {
    public abstract void acV();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/AppBrandSmileyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */