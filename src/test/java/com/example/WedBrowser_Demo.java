package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WedBrowser_Demo {
   @Test
   public void browser() {
	WebDriver driver=new ChromeDriver() ; 
	//open webpage
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.amazon.com");
	// to maximize the window
	driver.manage().window().maximize();
	//how to do refresh,backward,forward
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
   }
}
