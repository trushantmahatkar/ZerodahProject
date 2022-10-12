package com.ZerodahPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionalityPOMClass 
{		
	public WebDriver driver;
	
		public LoginFunctionalityPOMClass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath= "//input[@id='userid']")
		WebElement userID;
		
		public void sendUserID()
		{
			userID.sendKeys("LH5526");
		}
		
		@FindBy(xpath= "//input[@id='password']")
		WebElement password;
		
		public void sendPassword()
		{
			password.sendKeys("Trushant@5373");
		}
		
		@FindBy(xpath= "//button[@type='submit']")
		WebElement loginButton;
		
		public void clickLoginButton()
		{
			loginButton.click();
		}
		
		@FindBy(xpath= "//button[@type='submit']")
		WebElement continueButton;
		
		public void clickContinueButton()
		{
			continueButton.click();
		}
		
	
	
}
