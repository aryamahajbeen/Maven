package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConformationPage {
WebDriver driver;

public ConformationPage(WebDriver driver) {//constructer always as same name like class name inisde the constructer  we nees to put parimatizer
	this.driver = driver;
	
}
By sucesMessage= By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong");
  public String successMessage() {
	  String s=driver.findElement(sucesMessage).getText();
	return s;
  }
}
// how to created constorctor first right click,then source,general constactor field