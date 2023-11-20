package com.example;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PracticeTestCase {
	
	String[]testdata;
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
		
		
	}
	@Test


	
	public void test()throws IOException{
	//	testdata=PracticeTestData.exceldata();
		driver.get("https://www.bankofamerica.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("useID")).sendKeys(testdata[1]);
		driver.findElement(By.id("Password")).sendKeys(testdata[2]);
		driver.findElement(By.xpath("LogIn")).click();
		
	}	

}
