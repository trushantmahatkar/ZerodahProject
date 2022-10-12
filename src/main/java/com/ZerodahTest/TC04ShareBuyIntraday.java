package com.ZerodahTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZerodahPOM.BuyWindowPOMClass;
import com.ZerodahPOM.TestBaseClass;

import utility.TakesScreenshotClass;

public class TC04ShareBuyIntraday extends TestBaseClass 
{
	@Test
	public void verifyBuyShare() throws IOException, InterruptedException
	{
		BuyWindowPOMClass buy =new BuyWindowPOMClass(driver);
		Thread.sleep(2000);
		buy.sendSharesearchTab();
		log.info("Share Entered");
		TakesScreenshotClass.screenShot(driver,"shareName");
		Thread.sleep(2000);
		buy.ClickShare();
		log.info("Share is Selected");
		TakesScreenshotClass.screenShot(driver,"ShareAdded");
		buy.hoveronBuyIcon();
		Thread.sleep(2000);
		buy.openBuyWindow();
		log.info("Clicked on Buy icon");
		TakesScreenshotClass.screenShot(driver,"ButWindow");
		Thread.sleep(2000);
		buy.hoverBSE();
		buy.ClickBSE();
		Thread.sleep(2000);
		log.info("Clicked on BSE");
		TakesScreenshotClass.screenShot(driver,"SelectNSE");
		buy.ClickINTRADAY();
		log.info("Clicked on INTRADAY");
		Thread.sleep(2000);
		TakesScreenshotClass.screenShot(driver,"url");
		buy.ClickMARKET();
		log.info("Clicked on Market");
		buy.enterMARKET();
		log.info("Clicked on Buy Button");	
		String actualMarginValue =buy.Clickcount();
		String expectedMarginValue ="₹1,148.50";
		Assert.assertEquals(actualMarginValue,expectedMarginValue);
		TakesScreenshotClass.screenShot(driver,"BuyShare");
		buy.ClickBuyButton();
		Thread.sleep(2000);
		TakesScreenshotClass.screenShot(driver,"ClickedBUYButton");
	}
}
