package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickr {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div[1]/div/div/button")).click();
       String month="march 2024";
       String day="20";
       while(true) {
    String text=  driver.findElement(By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/div[3]/div/div/div/div[1]/span")).getText();
  if(text.equals(month)) {
	  break;
	  
  }else {
	  driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[2]/button")).click();
  }
       }
	}

}
