package Testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import Pageobjectmodel.Pagefactory;
import Utilities.Filelo;
import Utilities.Readingthe_Excel;
import base.BaseUI;
import base.BrowserConfig;

public class Test_Fectory extends BaseUI{
	WebDriver driver;
	String data[][];
	@BeforeMethod
	public void test()throws IOException{
	
	  if(Filelo.PropertiesfileReading("browsertype").equals("chrome")) {
	 driver=BrowserConfig.getChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		}
 }
	@DataProvider(name="testdata")
	public String[][] testdata()throws IOException{
		data= Readingthe_Excel .excldata();
		return data;
		
	}

	@Test(dataProvider="testdata")
	public void testcase1(String username,String password)	{
		Pagefactory pf=new Pagefactory(driver);
	//	ConformationPage  cp=new ConformationPage (driver);
		pf.setUsername(username);
		pf.setpassword(password);		
		pf.clickSubmit();
		pf.getErrorMassage();
		if(username.equals("student")||password.equals("rumana")) {
	Assert.assertEquals("your password is invalid!", pf.getErrorMassage());
			
		}else if(password.equals("rumana")) {
		Assert.assertEquals("your username is invalid!", pf.getErrorMassage());
		}else {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
		}
}
 
}
	
	

