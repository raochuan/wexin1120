package com.tencent.mm.plugin.favorite.ui.c;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class m
  extends a
{
  private HashMap<String, SpannableString> lXE;
  
  public m(g paramg)
  {
    super(paramg);
    GMTrace.i(6432116178944L, 47923);
    this.lXE = new HashMap();
    GMTrace.o(6432116178944L, 47923);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6432250396672L, 47924);
    paramViewGroup = paramViewGroup.getContext();
    View localView;
    if (paramView == null)
    {
      paramView = new a();
      localView = a(View.inflate(paramViewGroup, R.i.cUg, null), paramView, paramj);
      paramView.kGV = ((TextView)localView.findViewById(R.h.bHv));
      paramViewGroup = paramView;
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      if ((paramj.field_favProto.desc != null) && (paramj.field_favProto.desc.length() > 0)) {
        break;
      }
      paramViewGroup.kGV.setText("");
      GMTrace.o(6432250396672L, 47924);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
    w.d("MicroMsg.FavBaseListItem", "desc %s", new Object[] { paramj.field_favProto.desc });
    paramViewGroup.kGV.setText(h.b(paramViewGroup.kGV.getContext(), paramj.field_favProto.desc, paramViewGroup.kGV.getTextSize()));
    GMTrace.o(6432250396672L, 47924);
    return localView;
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6432384614400L, 47925);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6432384614400L, 47925);
  }
  
  public static final class a
    extends a.b
  {
    TextView kGV;
    
    public a()
    {
      GMTrace.i(6434800533504L, 47943);
      GMTrace.o(6434800533504L, 47943);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */