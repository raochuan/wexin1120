package com.tencent.smtt.export.external.interfaces;

public abstract interface HttpAuthHandler
{
  public abstract void cancel();
  
  public abstract void proceed(String paramString1, String paramString2);
  
  public abstract boolean useHttpAuthUsernamePassword();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/export/external/interfaces/HttpAuthHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */