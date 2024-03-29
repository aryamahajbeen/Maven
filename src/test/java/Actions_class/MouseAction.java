package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
	@Test
	public void Mouse() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebElement droppable=driver.findElement(By.linkText("Droppable"));
		droppable.click();
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
	}

}
