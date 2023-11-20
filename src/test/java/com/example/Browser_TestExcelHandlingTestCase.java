package com.example;//sep14

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.Browser_TestExcelHandling;

public class Browser_TestExcelHandlingTestCase {
	
	String[]testdata;//taht testcase i need ti created a variable the variable name is testdata
	WebDriver driver;
	@BeforeTest//first i need to created brforetestinside i need to created a method where i need to open my chrome
	public void beforeTest() {
		driver=new ChromeDriver();
	}//what is beforetest meaning=will execute before all your@test methods//open only ones
	// if i have multiplies method  use beforemathod
@Test
public void test()throws IOException{
	testdata=Browser_TestExcelHandling.excelData();//i call the class(excelData)is static menthod we can call right way we dont need to make objact
	driver.get("https://www.mycontactForm.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Sample Forms")).click();
	driver.findElement(By.id("subject")).sendKeys(testdata[0]);
}
}
