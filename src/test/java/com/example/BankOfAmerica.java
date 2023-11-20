package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import base.BrowserConfig;

public class BankOfAmerica {
	@Test
	public void wedBank() throws IOException {
		
		WebDriver driver=BrowserConfig.getChromeDriver();
		// WebDriver driver=new ChromeDriver();
		 driver.get("https://www.bankofamerica.com");
		 driver.manage().window().maximize();
	WebElement useID=	driver.findElement(By.xpath("//*[@id=\"onlineId1\"]"));
	useID.sendKeys("anmcd");
	WebElement password=driver.findElement(By.id("passcode1"));
	password.sendKeys("momoa");
	WebElement login=driver.findElement(By.xpath("//*[@id=\"signIn\"]/span[1]"));
	login.click();
	TakesScreenshot bank=(TakesScreenshot)driver;
	File src=bank.getScreenshotAs(OutputType.FILE);
	File contact=new File(".\\screenshots\\homepage.png");
	FileUtils.copyFile(src, contact);
	//driver.close();
	driver.quit();

	}

}

