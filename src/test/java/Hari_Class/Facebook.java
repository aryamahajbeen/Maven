package Hari_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Facebook {
	@Test
    public void face() {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.com");
    	driver.manage().window().maximize();
    	WebElement email=driver.findElement(By.xpath("//span[normalize-space()='Modern classics']"));
    	email.click();
    	driver.findElement(By.xpath("//img[@alt='Jackets']")).click();
    	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[1]/div/span/a/div/img")).click();
    WebElement s=	driver.findElement(By.xpath("//*[@id=\"dropdown_selected_size_name\"]/span/span/span"));
    s.click();
   driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name_2\"]")).click();
   driver.findElement(By.xpath("add-to-cart-button")).click();
   
    
	}
}
