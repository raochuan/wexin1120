package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;

public abstract interface Channel
  extends Parcelable
{
  public abstract e<Status> a(c paramc, Uri paramUri);
  
  public abstract String getPath();
  
  public abstract String nc();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/Channel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */