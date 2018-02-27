package com.qa.flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.flipcart.base.TestBase;

public class LoginPageFlipcart extends TestBase {
	
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy (xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement LoginBtn;
	
	@FindBy (xpath="//span[@class='_1hgiYz']")
	WebElement LoginLogo;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement Crossbtn;
	
	@FindBy (xpath="//a[contains(text(),'Login')]")
	WebElement LoginSignupLink;
	
	//initialization of the Page Object
	public LoginPageFlipcart()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidationLoginPage()
	{
		return driver.getTitle();
	}
	
	public String ValidateLoginLogo(){
		
		return LoginLogo.getText();
	}
	
	
	public SearchPageFlipcart ValidationloginFunc()
	{	
		Crossbtn.click();

		
		//UserName.sendKeys(prop.getProperty("UserName"));
		////Password.sendKeys(prop.getProperty("Password"));
	//	LoginBtn.click();
		return new SearchPageFlipcart();
	}
	
	
	
	
	
	
	
	
	
	

}
