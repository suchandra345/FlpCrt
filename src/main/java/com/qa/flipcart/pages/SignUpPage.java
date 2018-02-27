package com.qa.flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.flipcart.base.TestBase;

public class SignUpPage extends TestBase{

	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy (xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement LoginBtn;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifySignUpFunc(String uname, String pwd)
	{
		UserName.sendKeys(uname);
		Password.sendKeys(pwd);
		LoginBtn.click();
		UserName.clear();
		Password.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
