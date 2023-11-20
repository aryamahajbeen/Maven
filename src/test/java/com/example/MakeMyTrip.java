package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BrowserConfig;

public class MakeMyTrip {
	@Test
	public void Trip() {
	WebDriver driver= BrowserConfig.getChromeDriver();
		driver.get("https://www.expedia.com/");
		
		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
		driver.findElement(By.xpath("//input[@id='destination_form_field']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//button[@aria-label='Bangladesh']")).click();
	}

}
