package activities;

import android.os.Parcel;
import com.google.android.gms.auth.params.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.Frame;
import com.google.android.gms.internal.base.IDeathCallback_0_8.Stub;

public abstract class e
  extends IDeathCallback_0_8.Stub
  implements c
{
  public e()
  {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean execute(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      break;
    case 5: 
      return false;
    case 9: 
      paramParcel1 = (Task)Frame.get(paramParcel1, Task.CREATOR);
      break;
    case 8: 
      a((f)Frame.get(paramParcel1, f.CREATOR));
      break;
    case 7: 
      localObject = (Status)Frame.get(paramParcel1, Status.CREATOR);
      paramParcel1 = (GoogleSignInAccount)Frame.get(paramParcel1, GoogleSignInAccount.CREATOR);
      break;
    case 4: 
    case 6: 
      paramParcel1 = (Status)Frame.get(paramParcel1, Status.CREATOR);
      break;
    }
    Object localObject = (module.Item)Frame.get(paramParcel1, module.Item.CREATOR);
    paramParcel1 = (Item)Frame.get(paramParcel1, Item.CREATOR);
    paramParcel2.writeNoException();
    return true;
  }
}
