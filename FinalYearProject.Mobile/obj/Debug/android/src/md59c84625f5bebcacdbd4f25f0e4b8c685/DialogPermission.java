package md59c84625f5bebcacdbd4f25f0e4b8c685;


public class DialogPermission
	extends android.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;:GetOnCreateDialog_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("FinalYearProjectMobile.DialogPermission, FinalYearProject.Mobile, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DialogPermission.class, __md_methods);
	}


	public DialogPermission () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogPermission.class)
			mono.android.TypeManager.Activate ("FinalYearProjectMobile.DialogPermission, FinalYearProject.Mobile, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public android.app.Dialog onCreateDialog (android.os.Bundle p0)
	{
		return n_onCreateDialog (p0);
	}

	private native android.app.Dialog n_onCreateDialog (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
