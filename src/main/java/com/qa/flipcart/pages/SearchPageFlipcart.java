package com.qa.flipcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.flipcart.base.TestBase;

public class SearchPageFlipcart extends TestBase{

	
	@FindBy (xpath="//span[@class='_2cyQi_']")
	WebElement LoginName;
	
	@FindBy (xpath="//input[@title='Search for products, brands and more']")
	WebElement SearchText;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement Searchbtn;
	
	@FindBy (xpath="//span[contains(text(),'results for')]")
	WebElement SearchResult;
	
	@FindBy (partialLinkText="Lenovo APU Dual Core A9 7th Gen")
	WebElement ExactSearchResult;
	
	
	public SearchPageFlipcart()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyLoginName()
	{

		return LoginName.getText();
	}
	

	
	public String SearchFunc()
	{	
		SearchText.sendKeys(prop.getProperty("Search"));
		Searchbtn.click();
		return SearchResult.getText();
	}
	
	public ProductDetailPage ClickSearchResult()
	{
		ExactSearchResult.click();
		return new ProductDetailPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
