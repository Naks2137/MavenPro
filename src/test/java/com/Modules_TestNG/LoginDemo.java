package com.Modules_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Utilty.BrowserAction.CloseBrowesr;
import com.WebPages.FlightFinderPage;
import com.WebPages.LoginPage;

public class LoginDemo {

	@Parameters({"usernm","passwd"})
	@Test
	public void executeLogin(String username,String password)
	{
		
		LoginPage lg=new LoginPage();
		lg.loadPage();
		lg.enterUsername(username);
		lg.enterPassword(password);
		lg.clickOnLogin();
		
		FlightFinderPage ff=new FlightFinderPage();
		ff.loadPage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
		
		CloseBrowesr cb= new CloseBrowesr();
		cb.closeBrowser();
		
	}
}
