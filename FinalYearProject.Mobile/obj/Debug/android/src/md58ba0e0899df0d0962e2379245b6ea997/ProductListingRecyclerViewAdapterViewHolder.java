package md58ba0e0899df0d0962e2379245b6ea997;


public class ProductListingRecyclerViewAdapterViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("FinalYearProject.Mobile.Adapters.ProductListingRecyclerViewAdapterViewHolder, FinalYearProject.Mobile, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ProductListingRecyclerViewAdapterViewHolder.class, __md_methods);
	}


	public ProductListingRecyclerViewAdapterViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == ProductListingRecyclerViewAdapterViewHolder.class)
			mono.android.TypeManager.Activate ("FinalYearProject.Mobile.Adapters.ProductListingRecyclerViewAdapterViewHolder, FinalYearProject.Mobile, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

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
