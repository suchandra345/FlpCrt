package com.qa.flipcart.testcases;

import org.testng.annotations.Test;

import com.qa.flipcart.base.TestBase;
import com.qa.flipcart.pages.LoginPageFlipcart;
import com.qa.flipcart.pages.SearchPageFlipcart;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTestCases extends TestBase {
	
	LoginPageFlipcart LPF;
	SearchPageFlipcart SPF;
	
	public LoginPageTestCases()
	{
		super();
	}
	
 @BeforeTest
 public void beforeTest() {
	 
	 initiaization();
	 LPF=new LoginPageFlipcart();
	 
	  }	
	
	
  @Test(priority=1)
  public void LoginPageTitleTest() {
	  
	  String LoginPageTitle=LPF.ValidationLoginPage();
	  Assert.assertEquals(LoginPageTitle, "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More","Page Name Not matching");
  }

  @Test(priority=2)
  public void LoginLogoTest() {
	  
	  String LogoName=LPF.ValidateLoginLogo();
	  Assert.assertEquals(LogoName, "Login","Login Logo Not Matching");
  }
  
  @Test(priority=3)
  public void LoginFuncTest() throws InterruptedException {
	  
	  SPF=LPF.ValidationloginFunc();
	  Thread.sleep(5000);
	  
  }
  



  @AfterTest
  public void TearDown() {
	  
	  driver.quit();
  }

}
