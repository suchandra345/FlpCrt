package com.qa.flipcart.testcases;

import org.testng.annotations.Test;

import com.qa.flipcart.base.TestBase;
import com.qa.flipcart.pages.LoginPageFlipcart;
import com.qa.flipcart.pages.ProductDetailPage;
import com.qa.flipcart.pages.SearchPageFlipcart;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class NewTest extends TestBase{
	LoginPageFlipcart LPF;
	SearchPageFlipcart SPF;
	ProductDetailPage PF;

	
	
	public NewTest(){
		super();
	}
	
	
 @BeforeTest
 public void beforeTest() {
	 initiaization();
	 LPF=new LoginPageFlipcart();
	 SPF=LPF.ValidationloginFunc();
	 String Result= SPF.SearchFunc();
	 PF=SPF.ClickSearchResult();
	  }
	
	
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(20000);
	  Set<String> handles = driver.getWindowHandles();
	  Iterator<String> it= handles.iterator();
	  String ParentWindowID=it.next();
	  String ChildWindowID=it.next();
	  driver.switchTo().window(ChildWindowID);
	  PF.VerifyAddtoCartFunc();
	  driver.close();

  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
