package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.Filelo;
import base.BaseUI;
import base.BrowserConfig;

public class ScrollDemo extends  BaseUI{
	
	@BeforeMethod
	 public void browser() throws IOException {
		 
		  if(Filelo.PropertiesfileReading("browsertype").equals("chrome")) {
		 driver=BrowserConfig.getChromeDriver();
		 setDriver(driver);
			driver.get("https://practicetestautomation.com/practice-test-login/");

}
}
	@Test
	public void testcase1() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath(""));
		//to scroll only 500 pixel downwards
		js.executeScript("window, scrollBy(0,500");
		//to scroll up to the element
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		js.executeScript("arguments[0].click()",element);
	}
	
	
	
}