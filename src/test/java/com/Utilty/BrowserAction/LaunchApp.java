package com.Utilty.BrowserAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Config.Config;

public class LaunchApp {

	public void openBrowser(String path)
	{
		System.setProperty("webdriver.chrome.driver", path);
		Config.driver=new ChromeDriver();
	}
	public void enterAppUrl(String url)
	{
		Config.driver.get(url);
	}
	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();
	}
	public void waitTillPageload(int time)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		
		LaunchApp la=new LaunchApp();
		la.openBrowser("G:\\Software\\Selenium\\chromedriver_74\\chromedriver_win32\\chromedriver.exe");
		la.enterAppUrl("http://newtours.demoaut.com/mercurywelcome.php");
		la.maximizeBrowser();
		la.waitTillPageload(10);
		CloseBrowesr cb=new CloseBrowesr();
		cb.closeBrowser();
	}
	
}
