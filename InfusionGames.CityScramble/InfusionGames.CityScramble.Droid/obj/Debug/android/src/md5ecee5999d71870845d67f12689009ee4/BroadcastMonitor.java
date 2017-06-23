package md5ecee5999d71870845d67f12689009ee4;


public abstract class BroadcastMonitor
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("InfusionGames.CityScramble.Droid.Services.BroadcastMonitor, InfusionGames.CityScramble.Droid, Version=1.1.0.0, Culture=neutral, PublicKeyToken=null", BroadcastMonitor.class, __md_methods);
	}


	public BroadcastMonitor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BroadcastMonitor.class)
			mono.android.TypeManager.Activate ("InfusionGames.CityScramble.Droid.Services.BroadcastMonitor, InfusionGames.CityScramble.Droid, Version=1.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
