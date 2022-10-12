package com.ZerodahPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.TakesScreenshotClass;

public class TestBaseClass 
{
	public WebDriver driver;
	public Logger log = Logger.getLogger("ZerodahProject");
	
	
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws InterruptedException, IOException
	{
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Browser is Opened");
		}
		else
		{
		System.setProperty("webdriver.gecko.driver","./DriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("Browser is Opened");
		}
		PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		log.info("Url is Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		TakesScreenshotClass.screenShot(driver,"url");
		
		LoginFunctionalityPOMClass lp = new LoginFunctionalityPOMClass(driver);
		
		lp.sendUserID();
		log.info("UserID is Entered");
		lp.sendPassword();
		log.info("Password is Entered");
		lp.clickLoginButton();
		log.info("Clicked on Login Button");
		Thread.sleep(15000);
		lp.clickContinueButton();
		log.info("Clicked on Continue Button");
		Thread.sleep(3000);

	}
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
		log.info("end of program");
	}
}
