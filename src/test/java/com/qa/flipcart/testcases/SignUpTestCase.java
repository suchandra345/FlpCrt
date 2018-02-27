package com.qa.flipcart.testcases;

import org.testng.annotations.Test;

import com.qa.flipcart.base.TestBase;
import com.qa.flipcart.pages.LoginPageFlipcart;
import com.qa.flipcart.pages.SignUpPage;
import com.qa.flipcart.utill.ExcelReaderUtill;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class SignUpTestCase extends TestBase{
	
	SignUpPage SUP;
	ExcelReaderUtill Utill;
	
	public SignUpTestCase()
	{
		super();
	}
	
	@DataProvider
	public Object MultipleUserLoginTest()
	{
		Object data[][]=Utill.getTestData("Sheet1");
		return data;
	}
	
	
  @Test(dataProvider="MultipleUserLoginTest")
  public void f(String Usnme, String Password) {
	  SUP.VerifySignUpFunc(Usnme, Password);

	  
  }
  @BeforeTest
  public void beforeTest() {
	  
		 initiaization();
		 SUP=new SignUpPage();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
