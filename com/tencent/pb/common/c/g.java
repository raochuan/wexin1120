package com.tencent.pb.common.c;

import com.tencent.pb.common.b.a;
import com.tencent.pb.common.b.a.a.c;
import com.tencent.pb.common.b.a.a.u;
import com.tencent.pb.common.b.f;
import com.tencent.pb.common.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class g
{
  private static Object sj = new Object();
  private static HashMap<String, String> xrf = new HashMap();
  
  public static void Tn()
  {
    synchronized (sj)
    {
      xrf.clear();
      return;
    }
  }
  
  private static void ap(ArrayList<a.u> paramArrayList)
  {
    for (;;)
    {
      StringBuffer localStringBuffer;
      Object localObject3;
      String str1;
      String str2;
      synchronized (sj)
      {
        Object localObject2 = xrf.keySet();
        if ((localObject2 == null) || (((Set)localObject2).size() <= 0)) {
          return;
        }
        localStringBuffer = new StringBuffer();
        localObject2 = ((Set)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject3 = (String)((Iterator)localObject2).next();
        ??? = ((String)localObject3).split("---");
        if (???.length < 2) {
          continue;
        }
        str1 = ???[0];
        str2 = ???[1];
      }
      synchronized (sj)
      {
        localObject3 = (String)xrf.get(localObject3);
        if ((localObject3 != null) && (((String)localObject3).length() != 0))
        {
          localObject3 = ((String)localObject3).split("---");
          if ((localObject3 != null) && (localObject3.length != 0))
          {
            int j = localObject3.length;
            int i = 0;
            while (i < j)
            {
              ??? = localObject3[i];
              if ((??? != null) && (((String)???).length() != 0))
              {
                Object localObject4 = ((String)???).split("%");
                if (localObject4.length == 2) {
                  ??? = localObject4[1];
                }
                localObject4 = new a.u();
                ((a.u)localObject4).xpc = str1;
                localStringBuffer.setLength(0);
                localStringBuffer.append(str2);
                localStringBuffer.append("%");
                localStringBuffer.append((String)???);
                ((a.u)localObject4).xpd = localStringBuffer.toString();
                paramArrayList.add(localObject4);
              }
              i += 1;
            }
            paramArrayList = finally;
            throw paramArrayList;
          }
        }
      }
    }
  }
  
  public static void cjU()
  {
    if (!h.isNetworkConnected())
    {
      c.k("StatisticsUtil", new Object[] { "reportStatisticsData network is false" });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    ap(localArrayList);
    a.c localc;
    if (localArrayList.size() > 0)
    {
      localc = new a.c();
      a.u[] arrayOfu = new a.u[localArrayList.size()];
      localArrayList.toArray(arrayOfu);
      localc.xnO = arrayOfu;
    }
    while (localc == null)
    {
      c.k("StatisticsUtil", new Object[] { "reportStatisticsData CSClientReportReq is null" });
      return;
      localc = null;
    }
    c.k("yunying", new Object[] { "reportStatisticsData" });
    c.d("StatisticsUtil", new Object[] { "reportStatisticsData start ret: ", Integer.valueOf(f.cjC().a(new a()
    {
      public final void dl(String paramAnonymousString, int paramAnonymousInt)
      {
        if ("CsCmd.Cmd_CSClientReportReq".equals(paramAnonymousString))
        {
          if (paramAnonymousInt == 0) {
            g.Tn();
          }
          c.k("yunying", new Object[] { "reportStatisticsData isCommonData:  errCode: " + paramAnonymousInt });
        }
      }
    }, "CsCmd.Cmd_CSClientReportReq", localc)) });
  }
  
  public static void z(int paramInt1, int paramInt2, String paramString)
  {
    if (paramString == null)
    {
      c.k("gyz", new Object[] { "addEmergencyRecord value is null" });
      return;
    }
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramInt1);
      localStringBuffer.append("---");
      localStringBuffer.append(paramInt2);
      synchronized (sj)
      {
        String str = (String)xrf.get(localStringBuffer.toString());
        Object localObject1 = paramString;
        if (str != null)
        {
          localObject1 = paramString;
          if (str.length() > 0)
          {
            localObject1 = new StringBuffer(str);
            ((StringBuffer)localObject1).append("---");
            ((StringBuffer)localObject1).append(paramString);
            localObject1 = ((StringBuffer)localObject1).toString();
          }
        }
        xrf.put(localStringBuffer.toString(), localObject1);
        return;
      }
      return;
    }
    catch (Throwable paramString)
    {
      c.k("gyz", new Object[] { paramString });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */