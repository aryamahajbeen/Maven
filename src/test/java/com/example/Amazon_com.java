package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BrowserConfig;

public class Amazon_com {
	@Test
	public void amazontesting() {
		WebDriver driver=BrowserConfig.getChromeDriver();
	//	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement arrow=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		
		Actions a=new Actions(driver);
		WebElement acount=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
		a.click();
	}

}
