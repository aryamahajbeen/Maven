package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDoubleclick {
	
	@Test
	public void Double() {
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement Field1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
        Field1.clear();
        Field1.sendKeys("Welcome");
        WebElement copytext=driver.findElement(By.xpath("/html/body/button"));
        Actions act=new Actions(driver);
        act.doubleClick(copytext).perform();
	}

}
