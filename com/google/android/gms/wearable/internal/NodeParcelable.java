package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.m;

public class NodeParcelable
  implements SafeParcelable, m
{
  public static final Parcelable.Creator<NodeParcelable> CREATOR = new ad();
  final int aBO;
  final boolean aBP;
  final String abS;
  final String axO;
  final int mVersionCode;
  
  NodeParcelable(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.abS = paramString1;
    this.axO = paramString2;
    this.aBO = paramInt2;
    this.aBP = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof NodeParcelable)) {
      return false;
    }
    return ((NodeParcelable)paramObject).abS.equals(this.abS);
  }
  
  public final String getId()
  {
    return this.abS;
  }
  
  public int hashCode()
  {
    return this.abS.hashCode();
  }
  
  public String toString()
  {
    return "Node{" + this.axO + ", id=" + this.abS + ", hops=" + this.aBO + ", isNearby=" + this.aBP + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ad.a(this, paramParcel);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/NodeParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */