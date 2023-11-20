package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindrow {
	@Test
	public void Newmessagewindow() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://nxtgenaiacademy.com/multiplewindows/");
			driver.findElement(By.id("button1")).click();
			Set<String> windows=driver.getWindowHandles();
			List<String> windowlist=new ArrayList(windows);
			System.out.println(windowlist.size());
			driver.switchTo().window(windowlist.get(1));
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
		//	WebElement tech=driver.findElement(By.xpath(""));
	}

}
