package com.ZerodahPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
	public WebDriver driver;
	Actions act;
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		act= new Actions(driver);
	}
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement searchTab;
	
	public void sendSharesearchTab()
	{
		searchTab.sendKeys("CoalIndia");
	}

	@FindBy(xpath= "//span[text()='COALINDIA']")
	WebElement selectShare;
	
	public void ClickShare()
	{
		selectShare.click();
	}
	
	//span[@class='counts']
	@FindBy(xpath= "//span[@class='counts']")
	WebElement count;
	
	public String Clickcount()
	{
		String text=count.getText();
		return text;
	}
	
	@FindBy(xpath= "//span[@class='user-id']")
	WebElement profile;
	
	public void ClickProfile()
	{
		profile.click();
	}
	
	@FindBy(xpath= "//a[@target='_self']")
	WebElement logoutButton;
	
	public void ClickLogoutButton()
	{
		logoutButton.click();
	}
	
	
	
}
