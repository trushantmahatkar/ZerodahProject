package com.ZerodahTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZerodahPOM.HomePagePOMClass;
import com.ZerodahPOM.TestBaseClass;

import utility.TakesScreenshotClass;

public class TC03LogoutFunctionality extends TestBaseClass 
{
	@Test
	public void LogoutFunctionality() throws InterruptedException, IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		Thread.sleep(2000);
		hp.ClickProfile();
		log.info("Clicked on Profile");
		Thread.sleep(2000);
		hp.ClickLogoutButton();
		log.info("Clicked on Logout");
		Thread.sleep(2000);
		TakesScreenshotClass.screenShot(driver,"logout");
		String actualURL = driver.getCurrentUrl();
		String expectedURL= "https://kite.zerodha.com/#loggedout";
		Assert.assertEquals(actualURL,expectedURL,"TC is Failed");

	}
	
}
