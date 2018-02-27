package com.qa.flipcart.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.flipcart.base.TestBase;
import com.qa.flipcart.pages.LoginPageFlipcart;
import com.qa.flipcart.pages.ProductDetailPage;
import com.qa.flipcart.pages.SearchPageFlipcart;

public class SearchPageTestCases extends TestBase{
	
	LoginPageFlipcart LPF;
	SearchPageFlipcart SPF;
	ProductDetailPage PF;
	
	public SearchPageTestCases(){	
		super();
	}
	
	@BeforeTest
	public void setup(){
		initiaization();
		
	LPF=new LoginPageFlipcart();
	SPF=LPF.ValidationloginFunc();


	}
	

	
@Test
public void test() 
{
	String Result= SPF.SearchFunc();
	System.out.println("Search Result: "+Result);
	PF= SPF.ClickSearchResult();
	
}
	@AfterTest
	public void TearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	