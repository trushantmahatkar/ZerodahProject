package com.ZerodahTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZerodahPOM.TestBaseClass;

import utility.TakesScreenshotClass;

public class TC01LoginFunctionality extends TestBaseClass
{
	@Test
	public void  verifyLoginFunctionality() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		TakesScreenshotClass.screenShot(driver,"HomePage");
		String actualURL = driver.getCurrentUrl();
		String expectedURL= "https://kite.zerodha.com/dashboard";
		Assert.assertEquals(actualURL,expectedURL,"TC is Failed");
		
	}
}
