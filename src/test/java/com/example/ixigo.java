package com.example;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ixigo {
	@Test
	public void calender() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com");
		driver.manage().window().maximize();
		WebElement departure=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input"));
		departure.click();
		String year="2023";
		String month="November";
		String date="12";
		WebElement arrow=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/button"));
		arrow.click();
		WebElement mn=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div"));
		mn.click();
		WebElement dt=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[1]/div[1]"));
		dt.click();
		WebElement trave=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div/label"));
		trave.click();
		WebElement adult=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[1]/div[1]/div[1]"));
		adult.click();
		WebElement total=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[1]/div[2]/span[2]"));
		total.click();
		WebElement child=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[2]/div[1]/div[1]"));
		child.click();
		WebElement totalchild=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[2]/div[2]/span[3]"));
		totalchild.click();
		WebElement infant=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[3]/div[1]/div[1]"));
		infant.click();
		WebElement totalin=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[3]/div[2]/span[2]"));
			totalin.click();
		WebElement clas=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[3]"));
		clas.click();
		WebElement clasE=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[3]"));
		clasE.click();
		WebElement EC=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[4]/span/div[2]/span[1]"));
		EC.click();
		WebElement CloseX=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[1]/div"));
		CloseX.click();
		WebElement Return=driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div[1]/div[5]/div/div/div[4]/div/div[2]/div/input"));
		Return.click();

	
		//String Returnmonth="April 2024";
		//String Returnday="20";
		
	/*	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/button")).click();
		while(true){
			String text2=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div")).getText();
			if(text2.equals(Returnmonth)) {
				break;
			}
			else{
				driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/button")).click();
			}
		}List<WebElement>Date=driver.findElements(By.xpath("/html/body/div[5]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div"));
		int totalday=Date.size();
		for(int i=0;i<totalday;i++) {
			String da=Date.get(i).getText();
			if(da.equals(Returnday)) {
				Date.get(i).click();
				break; */


			}
		
	}


		
	
	

				
		
			
		
	


