package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BrowserConfig;

public class Alert_Demo {
	@Test
	public void alertdemo() {
		WebDriver driver=BrowserConfig.getChromeDriver();
	//	WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
	//	driver.findElement(By.name("confirmalertbox")).click();
	//	Alert a=driver.switchTo().alert();
		//a.accept();//ok
        //  a.dismiss();//cancel
	//	driver.findElement(By.name("promptalertbox1234")).click();
	//	Alert B=driver.switchTo().alert();
	//	B.sendKeys("no");
	//	B.accept();
	driver.close();	
	}
/*<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="Practice Suite">
	  <test name="Test Basics 1">
	      <classes>
	      <class name="HelloJava.HelloJava.FirstSeleniumHomeworkV1"/>
	      </classes>
	  </test> 
	   
	</suite> */

}
