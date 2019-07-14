package com.Modules_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Utilty.BrowserAction.LaunchApp;

public class Launch {

	@Parameters({"browser","url","timeoutseconds"})
	@Test
	 public void executeLaunch(String browsernm,String urlnm,int timeoutseconds)
	  {
		  LaunchApp lc=new LaunchApp();
		  lc.openBrowser(browsernm);
		  lc.enterAppUrl(urlnm);
		  lc.maximizeBrowser();
		  lc.waitTillPageload(10);
		  
		  
		  
		  
		 
		  
	  }
}
