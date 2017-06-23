package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("InfusionGames.CityScramble.Droid.Application, InfusionGames.CityScramble.Droid, Version=1.1.0.0, Culture=neutral, PublicKeyToken=null", md5e068fe4ba6f6c8858bdf3417a43c29d9.Application.class, md5e068fe4ba6f6c8858bdf3417a43c29d9.Application.__md_methods);
		mono.android.Runtime.register ("InfusionGames.CityScramble.Droid.MainApplication, InfusionGames.CityScramble.Droid, Version=1.1.0.0, Culture=neutral, PublicKeyToken=null", md5e068fe4ba6f6c8858bdf3417a43c29d9.MainApplication.class, md5e068fe4ba6f6c8858bdf3417a43c29d9.MainApplication.__md_methods);
		mono.android.Runtime.register ("Caliburn.Micro.CaliburnApplication, Caliburn.Micro.Platform, Version=3.0.1.0, Culture=neutral, PublicKeyToken=null", md5a184a05ea3e9cf8109d676e32a99dff2.CaliburnApplication.class, md5a184a05ea3e9cf8109d676e32a99dff2.CaliburnApplication.__md_methods);
		
	}
}
