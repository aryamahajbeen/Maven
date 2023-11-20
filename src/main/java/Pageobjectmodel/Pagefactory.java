package Pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.BaseUI;

public class Pagefactory  extends BaseUI {
	WebDriver driver;

	@FindBy(id="username")//driver.findElement(By.id("username"));
	 WebElement username;
	@FindBy(id="password")
	 WebElement password;
	@FindBy(id="submit")
	 WebElement submit;
	@FindBy(id="error")
	 WebElement error;
	
	public Pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void setUsername(String usernameValue) {
		username.sendKeys("String usernameValue");
		logger.log(Status.INFO,"Entered username");

		
	}
	public void setpassword(String PasswordValue) {
		password.sendKeys("String PasswordValue");
		logger.log(Status.INFO,"Entered password");


	}
	public void clickSubmit() {
		submit.click();
		logger.log(Status.INFO,"Clicked on submit button");

	}
	public String getErrorMassage() {
		return error.getText();
	}


}
