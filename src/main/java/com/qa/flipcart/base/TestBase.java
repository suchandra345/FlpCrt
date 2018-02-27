package com.qa.flipcart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	

public TestBase()
{

		try {			
			prop=new Properties();
			FileInputStream fp;
			
			fp = new FileInputStream( "C:\\Users\\SUCHHANDRA\\workspace\\FlipcartDemoProj\\"
					+ "src\\main\\java\\com\\qa\\flipcart\\config\\config.properties");
			prop.load(fp);
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}		

public static void initiaization()
{
	String BrowserName=prop.getProperty("Browser");
	
	if(BrowserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUCHHANDRA\\workspace\\FlipcartDemoProj\\"
				+ "src\\main\\java\\com\\qa\\flipcart\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
	}else
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUCHHANDRA\\Desktop\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get(prop.getProperty("URL"));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);














}

		













	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
