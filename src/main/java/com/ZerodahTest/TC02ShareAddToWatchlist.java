package com.ZerodahTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZerodahPOM.HomePagePOMClass;
import com.ZerodahPOM.TestBaseClass;

import utility.TakesScreenshotClass;

public class TC02ShareAddToWatchlist extends TestBaseClass
{
	@Test
	public void shareAddToWatchlist() throws InterruptedException, IOException
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		Thread.sleep(2000);
		hp.sendSharesearchTab();
		log.info("Share Name Entered");
		Thread.sleep(2000);
		hp.ClickShare();
		Thread.sleep(2000);
		log.info("Share is Selected");
		TakesScreenshotClass.screenShot(driver,"ShareAddToWatchlist");
		String actualcount=hp.Clickcount();
		String expectedcount ="1 / 50";
		Assert.assertEquals(actualcount,expectedcount);
	
	}
}
