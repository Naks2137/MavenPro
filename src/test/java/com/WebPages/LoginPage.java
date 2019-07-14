package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Config.Config;
import com.Utilty.BrowserAction.CloseBrowesr;
import com.Utilty.BrowserAction.LaunchApp;

public class LoginPage {

	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusernm;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void enterUsername(String username)
	{
		objusernm.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
	}
	public void clickOnLogin()
	{
		objlogin.click();
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
		
		CloseBrowesr cb=new CloseBrowesr();
		cb.closeBrowser();
	}
}
