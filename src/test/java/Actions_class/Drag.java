package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Drag {//public meaning global use or public meaning the they can access the own class, sub class, non
					// public is a access modifier
					//none sub class,same package,other package too
	@Test			//class meaning is blue print or template from which objects are created
	public void Drageable() {//void meaning it is not return any value
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.linkText("Draggable"));
	drag.click();
	WebElement frame=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	WebElement rag=driver.findElement(By.id("draggable"));
	Actions a=new Actions(driver);//action is class and new is keyword to create an instance of the class
	a.dragAndDropBy(rag, 300, 129).perform();

		
	}//what is the TestNg=TestNg is a framework, what is the framework?it is a structure to write the code
	//	TestNg mainly focus only Report files @Test/annotation it is work like a main method
}
