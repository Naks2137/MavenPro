package com.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;
import com.Utilty.BrowserAction.CloseBrowesr;
import com.Utilty.BrowserAction.LaunchApp;

public class FlightFinderPage {

	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflight;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;

	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyFlightFinder()
	{
		boolean flag=objflight.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is displayed");
		}
	}
	
	public void clickonSignoff()
	{
		objSignoff.click();
	}
	
	public static void main(String[] args) {
		
		LaunchApp la=new LaunchApp();
		la.openBrowser("G:\\Software\\Selenium\\chromedriver_74\\chromedriver_win32\\chromedriver.exe");
		la.enterAppUrl("http://newtours.demoaut.com/mercurywelcome.php");
		la.maximizeBrowser();
		la.waitTillPageload(10);
		
		LoginPage lp=new LoginPage();
		lp.loadPage();
		lp.enterUsername("Suvidyap1");
		lp.enterPassword("P@ssword1");
		lp.clickOnLogin();
		
		FlightFinderPage ff=new FlightFinderPage();
		ff.loadPage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
		
		CloseBrowesr cb=new CloseBrowesr();
		cb.closeBrowser();
	}
	
}
