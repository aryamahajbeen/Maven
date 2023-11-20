package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsLearing {
	@Test
	public void browserCOnfigure() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		WebElement opennew=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		opennew.click();
		WebElement clickButton=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		clickButton.click();
		Set<String> windrows=driver.getWindowHandles();
		List<String>windowslist=new ArrayList(windrows);
		System.out.println(windowslist.size());
		driver.switchTo().window(windowslist.get(1));
		System.out.println(driver.getTitle());
		WebElement download=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
		download.click();
		

	}

}
