package Testcase;



import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pageobjectmodel.ConformationPage;
import Pageobjectmodel.Login;
import Utilities.Filelo;
import Utilities.PropertiesfileReading;
import Utilities.Readingthe_Excel;
import base.BaseUI;
import base.BrowserConfig;
@Listeners(Utilities.Listeners.class)
public class App extends BaseUI {
WebDriver driver;
String data[][];
 @BeforeMethod
 public void browser() throws IOException {
	 
	  if(PropertiesfileReading.Shathi("browsertype").equals("chrome")) {
	 driver=BrowserConfig.getChromeDriver();
	 setDriver(driver);//set the driver to baseui
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		}
 }
 @DataProvider(name="testdata")
 	public Object[][]testdata() throws IOException {
 		data=Readingthe_Excel.excldata();
 		return data;
 	}
 	
 	
	@Test(priority=0)//priority 0 meaning it is height priority it is run fast
	public void testcase1()	{
		Login login =new Login(driver);
		login.setUsername("student");
		login.setPassword("Password123");		
		login.clicksubmit();
		
		String expectedtext= "Congratulations student. You successfully logged in!";
		 ConformationPage cp=new  ConformationPage(driver);
		 assertEquals(cp.successMessage(),expectedtext); 
			System.out.println(expectedtext);
		}
	@Test(dependsOnMethods = "testcase1")//secend test case depend on first testcase
	public void testcase2() {
		Login login =new Login(driver);
		login.setUsername("student");
		login.setPassword("aassword123");		
		login.clicksubmit();
		
		String expectedtext="your password is invalid!";
	//	 assertEquals(login.invalidpassword(),expectedtext); 
		 System.out.println(expectedtext);
		 
		
	}
	@Test//2nd test case depend on first testcase1 (dependensonMathod=testcase1)
	public void testcase3() {
		Login login =new Login(driver);
		login.setUsername("baba");
		login.setPassword("Password123");		
		login.clicksubmit();
		String expectedtext="your username is invalid!";
	//	 assertEquals(login.invalidusername(),expectedtext); 
		 System.out.println(expectedtext);

		
}// if i see something is priorities 0 is going work first then work number 1
	//if i see two projacet has same priorties like 0 and 0 in this case i have to go alphabeat order which letter is come first we need to woerk with that first

}

