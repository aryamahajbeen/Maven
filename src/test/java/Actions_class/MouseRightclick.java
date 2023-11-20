package Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseRightclick {
	
	@Test
	public void Rightclick() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/simple-dynamic-context-menu/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/div[3]")).click();
	WebElement rigth=	driver.findElement(By.xpath("/html/body/div[2]/button"));
	Actions a=new Actions(driver);
	a.contextClick(rigth).perform();
	WebElement twitter=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]"));
	Actions b=new Actions(driver);
	b.click(twitter).build().perform();
	Alert c=driver.switchTo().alert();
	c.accept();
	}

}
