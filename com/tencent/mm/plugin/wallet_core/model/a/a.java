package com.tencent.mm.plugin.wallet_core.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import org.json.JSONObject;

public final class a
  extends d
{
  private static a rSc;
  
  static
  {
    GMTrace.i(6900267614208L, 51411);
    rSc = null;
    GMTrace.o(6900267614208L, 51411);
  }
  
  public a()
  {
    GMTrace.i(6899864961024L, 51408);
    GMTrace.o(6899864961024L, 51408);
  }
  
  public static a bxt()
  {
    GMTrace.i(6899999178752L, 51409);
    if (rSc == null) {
      rSc = new a();
    }
    a locala = rSc;
    GMTrace.o(6899999178752L, 51409);
    return locala;
  }
  
  public final Bankcard N(JSONObject paramJSONObject)
  {
    GMTrace.i(6900133396480L, 51410);
    Bankcard localBankcard = super.N(paramJSONObject);
    localBankcard.field_ext_msg = b.S(paramJSONObject);
    localBankcard.field_bankcardClientType = 1;
    localBankcard.field_desc = paramJSONObject.optString("description");
    localBankcard.field_trueName = paramJSONObject.optString("name_on_card");
    if ("CREDITCARD_PAYU".equals(paramJSONObject.optString("bank_type"))) {}
    for (localBankcard.field_cardType |= Bankcard.rMP;; localBankcard.field_cardType |= Bankcard.rMR)
    {
      GMTrace.o(6900133396480L, 51410);
      return localBankcard;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */