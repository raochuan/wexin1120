package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<DeleteRequest>
{
  static void a(DeleteRequest paramDeleteRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramDeleteRequest.agh, paramInt);
    b.c(paramParcel, 1000, paramDeleteRequest.mVersionCode);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */