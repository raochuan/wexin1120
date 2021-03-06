package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;

public class MailMMWebView
  extends MMWebViewWithJsApi
{
  private float jIU;
  private float kht;
  boolean oKp;
  View oKq;
  View oKr;
  private boolean oKs;
  private boolean oKt;
  
  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5552184754176L, 41367);
    GMTrace.o(5552184754176L, 41367);
  }
  
  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5552318971904L, 41368);
    GMTrace.o(5552318971904L, 41368);
  }
  
  private int aXL()
  {
    GMTrace.i(5553124278272L, 41374);
    int i = Math.max(getTitleHeight() - getWebScrollY(), 0);
    GMTrace.o(5553124278272L, 41374);
    return i;
  }
  
  public final int aXM()
  {
    GMTrace.i(5553526931456L, 41377);
    if (this.oKr != null)
    {
      int i = this.oKr.getHeight();
      GMTrace.o(5553526931456L, 41377);
      return i;
    }
    GMTrace.o(5553526931456L, 41377);
    return 0;
  }
  
  public final void aXN()
  {
    GMTrace.i(5553661149184L, 41378);
    int i = (int)(getTitleHeight() / getScale());
    evaluateJavascript("javascript:_updateTitleBarHeight(" + i + ");", null);
    GMTrace.o(5553661149184L, 41378);
  }
  
  public final void aXO()
  {
    GMTrace.i(5553795366912L, 41379);
    int i = (int)(aXM() / getScale());
    evaluateJavascript("javascript:_updateBottomBarHeight(" + i + ");", null);
    GMTrace.o(5553795366912L, 41379);
  }
  
  public int computeVerticalScrollExtent()
  {
    GMTrace.i(5552855842816L, 41372);
    int j = getHeight();
    int i = j;
    if (isHorizontalScrollBarEnabled())
    {
      i = j;
      if (!overlayHorizontalScrollbar()) {
        i = j - getHorizontalScrollbarHeight();
      }
    }
    j = aXL();
    GMTrace.o(5552855842816L, 41372);
    return i - j;
  }
  
  public int computeVerticalScrollOffset()
  {
    GMTrace.i(5552990060544L, 41373);
    int i = Math.max(getWebScrollY() - getTitleHeight(), 0);
    GMTrace.o(5552990060544L, 41373);
    return i;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(5552587407360L, 41370);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i = getWebScrollY();
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    while ((this.oKs) && (this.oKq != null))
    {
      paramMotionEvent.setLocation(f1, f2 + i);
      bool = this.oKq.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(5552587407360L, 41370);
      return bool;
      this.kht = f1;
      this.jIU = f2;
      if ((this.oKq != null) && ((int)this.jIU < aXL()))
      {
        this.oKs = true;
      }
      else if ((this.oKr != null) && (this.oKr.getVisibility() == 0) && (this.jIU + aXM() > getHeight()))
      {
        this.oKt = true;
        continue;
        if ((Math.abs(f2 - this.jIU) > 50.0F) && (this.oKs))
        {
          paramMotionEvent.setAction(3);
          paramMotionEvent.setLocation(this.kht, this.jIU + i);
          this.oKq.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(0);
          paramMotionEvent.setLocation(this.kht, this.jIU);
          super.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(2);
          paramMotionEvent.setLocation(f1, f2);
        }
      }
    }
    if ((this.oKt) && (this.oKr != null))
    {
      paramMotionEvent.setLocation(f1, f2 + aXM() - getHeight());
      bool = this.oKr.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(5552587407360L, 41370);
      return bool;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(5552587407360L, 41370);
    return bool;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    GMTrace.i(5553258496000L, 41375);
    boolean bool;
    if (paramView == this.oKq)
    {
      int i = getWebScrollY();
      paramCanvas.save();
      paramCanvas.translate(0.0F, -i);
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restore();
    }
    for (;;)
    {
      GMTrace.o(5553258496000L, 41375);
      return bool;
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    }
  }
  
  public final void gJ(boolean paramBoolean)
  {
    GMTrace.i(5553929584640L, 41380);
    if (this.oKr != null)
    {
      if (paramBoolean)
      {
        this.oKr.setVisibility(0);
        GMTrace.o(5553929584640L, 41380);
        return;
      }
      this.oKr.setVisibility(4);
    }
    GMTrace.o(5553929584640L, 41380);
  }
  
  public final int getTitleHeight()
  {
    GMTrace.i(5553392713728L, 41376);
    if (this.oKq != null)
    {
      int i = this.oKq.getHeight();
      GMTrace.o(5553392713728L, 41376);
      return i;
    }
    GMTrace.o(5553392713728L, 41376);
    return 0;
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(5552453189632L, 41369);
    this.oKp = true;
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    GMTrace.o(5552453189632L, 41369);
  }
  
  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19547738341376L, 145642);
    int i = (int)(getContentHeight() * getScale());
    int j = getHeight() + paramInt2;
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    if (i - j < aXM())
    {
      if (Math.abs(i - j) <= 20) {
        break label96;
      }
      aXO();
      gJ(false);
    }
    for (;;)
    {
      if (getVisibleTitleHeight() == 0) {
        aXN();
      }
      GMTrace.o(19547738341376L, 145642);
      return;
      label96:
      gJ(true);
    }
  }
  
  private final class a
    extends FrameLayout
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(5543057948672L, 41299);
      GMTrace.o(5543057948672L, 41299);
    }
    
    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      GMTrace.i(5543192166400L, 41300);
      if ((!MailMMWebView.a(MailMMWebView.this)) && (!MailMMWebView.b(MailMMWebView.this)))
      {
        GMTrace.o(5543192166400L, 41300);
        return false;
      }
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      }
      for (;;)
      {
        super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(5543192166400L, 41300);
        return true;
        MailMMWebView.c(MailMMWebView.this);
        MailMMWebView.d(MailMMWebView.this);
      }
    }
    
    protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(5543326384128L, 41301);
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      if ((this == MailMMWebView.e(MailMMWebView.this)) && (MailMMWebView.this.getTitleHeight() > 0))
      {
        MailMMWebView.this.aXN();
        GMTrace.o(5543326384128L, 41301);
        return;
      }
      if ((this == MailMMWebView.f(MailMMWebView.this)) && (MailMMWebView.this.aXM() > 0)) {
        MailMMWebView.this.aXO();
      }
      GMTrace.o(5543326384128L, 41301);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailMMWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */