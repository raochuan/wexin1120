package com.google.android.gms.common.stats;

import com.google.android.gms.c.j;

public final class c
{
  public static j<Integer> amV = j.a("gms:common:stats:max_num_of_events", Integer.valueOf(100));
  
  public static final class a
  {
    public static j<Integer> amW = j.a("gms:common:stats:connections:level", Integer.valueOf(d.LOG_LEVEL_OFF));
    public static j<String> amX = j.j("gms:common:stats:connections:ignored_calling_processes", "");
    public static j<String> amY = j.j("gms:common:stats:connections:ignored_calling_services", "");
    public static j<String> amZ = j.j("gms:common:stats:connections:ignored_target_processes", "");
    public static j<String> ana = j.j("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static j<Long> anb = j.a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000L));
  }
  
  public static final class b
  {
    public static j<Integer> amW = j.a("gms:common:stats:wakeLocks:level", Integer.valueOf(d.LOG_LEVEL_OFF));
    public static j<Long> anb = j.a("gms:common:stats:wakelocks:time_out_duration", Long.valueOf(600000L));
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/stats/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */