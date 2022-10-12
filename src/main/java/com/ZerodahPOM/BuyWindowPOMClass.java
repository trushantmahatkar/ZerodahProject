package com.ZerodahPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BuyWindowPOMClass 
{
	public WebDriver driver;
	Actions act;
	

	public BuyWindowPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		act= new Actions(driver);
		
	}
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement searchTab;
	
	public void sendSharesearchTab()
	{
		searchTab.sendKeys("COALINDIA");
	}

	@FindBy(xpath= "//span[text()='COALINDIA']")
	WebElement selectShare;
	
	public void ClickShare()
	{
		selectShare.click();
	}
	
	@FindBy(xpath= "//button[@class='button-blue']")
	WebElement hoverBuy;
	public void hoveronBuyIcon()
	{
		act.moveToElement(hoverBuy).perform();;
	}
	
//	OPEN BUY WINDOW
	@FindBy(xpath= "//button[@class='button-blue buy']")
	WebElement clickBuyIcon;
	
	public void openBuyWindow()
	{
		clickBuyIcon.click();
	}
	
	@FindBy(xpath= "//label[@for='radio-109']")
	WebElement hoverBSE;
	public void hoverBSE()
	{
		act.moveToElement(hoverBSE).perform();
	}
	
	@FindBy(xpath= "//label[@for='radio-109']")
	WebElement selectBSE;
	
	public void ClickBSE()
	{
		selectBSE.click();
	}
	

	@FindBy(xpath= "//label[@for='radio-309']")
	WebElement selectINTRADAY;
	
	public void ClickINTRADAY()
	{
		selectINTRADAY.click();
	}
	
	@FindBy(xpath= "//label[@for='radio-315']")
	WebElement selectMARKET;
	
	public void ClickMARKET()
	{
		selectMARKET.click();
	}
	
	@FindBy(xpath= "//input[@label='Qty.']")
	WebElement selectQuantity;
	
	public void enterMARKET()
	{
		selectQuantity.sendKeys("5");
	}
	
	@FindBy(xpath= "//span[@class='margin-value']")
	WebElement marginValue;
	
	public String Clickcount()
	{
		String text1=marginValue.getText();
		return text1;
	}
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement buyButton;
	
	public void ClickBuyButton()
	{
		buyButton.click();
	}
	

}
