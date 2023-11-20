package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import base.BaseUI;




public class Login  extends BaseUI{
	WebDriver driver;
	//pageobjactmodel is repository of webelement of particuler page
	//location of web element using by class
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit");
	By error=By.id("error");
	
	
//	By errorMessagePasswordMessageElement=By.xpath("//*[@id=\"error\"]");
//	By errorMessageUsernameMessaeElement=By.xpath("//*[@id=\"error\"]");
	//constructor to initialize driver
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public void setUsername(String usernameValue) {
		driver.findElement(username).sendKeys(usernameValue);
		logger.log(Status.INFO,"Entered username");
		
	}
	public void setPassword(String PasswordValue) {
		driver.findElement(password).sendKeys(PasswordValue);	
		logger.log(Status.INFO,"Entered password");

	}
	public void clicksubmit() {
		driver.findElement(submit).click();
		logger.log(Status.INFO,"Clicked on submit button");

	}
	public String getErrorMessage() {
		return driver.findElement(error).getText();
    
 
		
	}
	
	}
    

