package Testcase;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pageobjectmodel.Login;
import Utilities.Filelo;
import Utilities.PropertiesfileReading;
import Utilities.Readingthe_Excel;
import base.BaseUI;
import base.BrowserConfig;

@Listeners(Utilities.Listeners.class)
public class Reading extends BaseUI{//(Filelo.PropertiesfileReading
	WebDriver driver;
	String data[][];
	@BeforeMethod
	public void test()throws IOException{
	
	  if(PropertiesfileReading.Shathi("browsertype").equals("chrome")) {
	 driver=BrowserConfig.getChromeDriver();
	 setDriver(driver);//set the baseui
		driver.get("https://practicetestautomation.com/practice-test-login/");
	  }
	  }
	@DataProvider(name="testdata")
	
	public Object[][] testdata()throws IOException{
		data= Readingthe_Excel.excldata();
		return data;
		
	}
	@Test(dataProvider= "testdata")
	public void testcase(String username,String Password)	{
		Login login =new Login(driver);
		login.setUsername(username);
		login.setPassword(Password);		
		login.clicksubmit();
		if(username.equals("student")||Password.equals("rumana")) {
	Assert.assertEquals("your password is invalid", login.getErrorMessage());
			
		}else if(Password.equals("rumana")) {
		Assert.assertEquals("your username is invalid", login.getErrorMessage());
		}else {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));  
		}
		
	}
}
