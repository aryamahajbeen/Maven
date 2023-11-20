package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop_Demo {
	
	@Test
	public void DragDrop() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement photo=driver.findElement(By.id("Accepted Elements"));
		photo.click();
		WebElement frame=driver.findElement(By.className("demo-frame lazyloaded"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=	driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	
		
	}
	

}
