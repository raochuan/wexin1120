package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.d;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;

public class GetHdHeadImageGalleryView
  extends MMGestureGallery
{
  public String pqd;
  public p sYv;
  private Bitmap sYw;
  private Bitmap sYx;
  private a sYy;
  public String username;
  
  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1160178040832L, 8644);
    init();
    GMTrace.o(1160178040832L, 8644);
  }
  
  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1160043823104L, 8643);
    init();
    GMTrace.o(1160043823104L, 8643);
  }
  
  private void init()
  {
    GMTrace.i(1160312258560L, 8645);
    this.sYy = new a((byte)0);
    setVerticalFadingEdgeEnabled(false);
    setHorizontalFadingEdgeEnabled(false);
    setAdapter(this.sYy);
    setSelection(0);
    this.wKI = new c();
    this.wKJ = new b();
    GMTrace.o(1160312258560L, 8645);
  }
  
  public final void M(Bitmap paramBitmap)
  {
    GMTrace.i(1160580694016L, 8647);
    this.sYx = paramBitmap;
    this.sYy.notifyDataSetChanged();
    GMTrace.o(1160580694016L, 8647);
  }
  
  public final void setThumbImage(Bitmap paramBitmap)
  {
    GMTrace.i(1160446476288L, 8646);
    this.sYw = paramBitmap;
    this.sYy.notifyDataSetChanged();
    GMTrace.o(1160446476288L, 8646);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(1170110152704L, 8718);
      GMTrace.o(1170110152704L, 8718);
    }
    
    public final int getCount()
    {
      GMTrace.i(1170244370432L, 8719);
      GMTrace.o(1170244370432L, 8719);
      return 1;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1170378588160L, 8720);
      GMTrace.o(1170378588160L, 8720);
      return Integer.valueOf(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1170512805888L, 8721);
      long l = paramInt;
      GMTrace.o(1170512805888L, 8721);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1170647023616L, 8722);
      View localView;
      if (paramView == null)
      {
        paramView = new a();
        localView = View.inflate(GetHdHeadImageGalleryView.this.getContext(), R.i.dhr, null);
        paramView.mLS = ((ProgressBar)localView.findViewById(R.h.bOq));
        paramView.fDY = ((ImageView)localView.findViewById(R.h.bOp));
        paramView.sYA = localView.findViewById(R.h.bOr);
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        localView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        if (GetHdHeadImageGalleryView.d(GetHdHeadImageGalleryView.this) == null) {
          break;
        }
        paramViewGroup.mLS.setVisibility(8);
        paramViewGroup.fDY.setVisibility(8);
        paramViewGroup.sYA.setVisibility(8);
        paramView = new MultiTouchImageView(GetHdHeadImageGalleryView.this.getContext(), GetHdHeadImageGalleryView.d(GetHdHeadImageGalleryView.this).getWidth(), GetHdHeadImageGalleryView.d(GetHdHeadImageGalleryView.this).getHeight());
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap(GetHdHeadImageGalleryView.d(GetHdHeadImageGalleryView.this));
        paramView.aw(2.0F);
        paramView.vKH = true;
        GMTrace.o(1170647023616L, 8722);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
      paramViewGroup.mLS.setVisibility(0);
      paramViewGroup.sYA.setVisibility(0);
      if (GetHdHeadImageGalleryView.e(GetHdHeadImageGalleryView.this) != null)
      {
        paramViewGroup.fDY.setVisibility(0);
        paramViewGroup.fDY.setImageBitmap(GetHdHeadImageGalleryView.e(GetHdHeadImageGalleryView.this));
      }
      for (;;)
      {
        GMTrace.o(1170647023616L, 8722);
        return localView;
        paramViewGroup.fDY.setVisibility(8);
      }
    }
    
    final class a
    {
      ImageView fDY;
      ProgressBar mLS;
      View sYA;
      
      a()
      {
        GMTrace.i(929055113216L, 6922);
        GMTrace.o(929055113216L, 6922);
      }
    }
  }
  
  private final class b
    implements MMGestureGallery.c
  {
    public b()
    {
      GMTrace.i(1171183894528L, 8726);
      GMTrace.o(1171183894528L, 8726);
    }
    
    public final void axH()
    {
      GMTrace.i(1171318112256L, 8727);
      if ((GetHdHeadImageGalleryView.b(GetHdHeadImageGalleryView.this) != null) && (GetHdHeadImageGalleryView.c(GetHdHeadImageGalleryView.this) != null))
      {
        String[] arrayOfString = GetHdHeadImageGalleryView.this.getContext().getResources().getStringArray(R.c.aMD);
        h.a(GetHdHeadImageGalleryView.this.getContext(), null, arrayOfString, "", new h.c()
        {
          public final void hC(int paramAnonymousInt)
          {
            GMTrace.i(1175747297280L, 8760);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(1175747297280L, 8760);
              return;
              String str = e.gKA + "hdImg_" + g.n(GetHdHeadImageGalleryView.c(GetHdHeadImageGalleryView.this).getBytes()) + System.currentTimeMillis() + ".jpg";
              FileOp.deleteFile(str);
              FileOp.o(GetHdHeadImageGalleryView.b(GetHdHeadImageGalleryView.this), str);
              d.b(str, GetHdHeadImageGalleryView.this.getContext());
              Toast.makeText(GetHdHeadImageGalleryView.this.getContext(), GetHdHeadImageGalleryView.this.getContext().getString(R.l.eey, new Object[] { e.gKA }), 1).show();
            }
          }
        });
      }
      GMTrace.o(1171318112256L, 8727);
    }
  }
  
  private final class c
    implements MMGestureGallery.f
  {
    public c()
    {
      GMTrace.i(1221783977984L, 9103);
      GMTrace.o(1221783977984L, 9103);
    }
    
    public final void alc()
    {
      GMTrace.i(1221918195712L, 9104);
      if (GetHdHeadImageGalleryView.a(GetHdHeadImageGalleryView.this) != null) {
        GetHdHeadImageGalleryView.a(GetHdHeadImageGalleryView.this).dismiss();
      }
      GMTrace.o(1221918195712L, 9104);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/GetHdHeadImageGalleryView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */