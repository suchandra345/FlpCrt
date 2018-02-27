package com.qa.flipcart.pages;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.flipcart.base.TestBase;

public class ProductDetailPage extends TestBase{
	
	@FindBy (xpath="//input[@id='pincodeInputId']")
	WebElement PinCode;
	
	@FindBy(xpath="//span[contains(text(),'Check')]")
	WebElement Check;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement AddToCart;
	
	
	public ProductDetailPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void VerifyAddtoCartFunc()
	{	
		
		PinCode.sendKeys("700047");
		Check.click();
		AddToCart.click();
		}
	}
	
	
	
	
	
	
	
	


