package com.example;//aug25/chat/ kiruba class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazonmousedrop {
	@Test
	public void Amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("captchacharacters")).sendKeys("SCMLI");
		WebElement account=driver.findElement(By.className("nav-line-1-container"));
		Actions a=new Actions(driver);
		a.moveToElement(account).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
	}

}
