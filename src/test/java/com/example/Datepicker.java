package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
	@Test
	public void clander() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com");
		WebElement depature=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input"));
		depature.click();
		String expecteddepatureText="Decmber 2023";
		String actualdepatureText="month";
		while( 
			actualdepatureText.equals(expecteddepatureText)){
			WebElement monthName=driver.findElement(By.className("rd-month-label"));
			actualdepatureText= monthName.getText();
			System.out.println(actualdepatureText);
			if(actualdepatureText.equals(expecteddepatureText)) {
				System.out.println("Expected text found"+actualdepatureText);
			}else {
				WebElement arrowBotton=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/button"));
				arrowBotton.click();
			}
		}
		
	//  WebElement date=driver.findElements(By.xpath("\"/html/body/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[4]/div[1]\""));
//	  date.click();
	//	System.out.println("date"+((WebElement) date).getText());
					
				

			}
		}
	
			
			
		
	


