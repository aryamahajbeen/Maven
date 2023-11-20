package cucumber_step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_test{
	WebDriver driver=new ChromeDriver();
	
	@Given("open browser")
	public void open_browser() {
		
	    driver.get("https://practicetestautomation.com/practice-test-login");
	    driver.manage().window().maximize();
	}

	@Given("I enter my username")
	public void i_enter_my_username() {
	 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(" student ");
	}

	@When("I enter my password")
	public void i_enter_my_password() {
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}

	@Given("I open login page")
	public void i_open_login_page() {
	    driver.findElement(By.xpath("//*[@id=\"login\"]/h2")).click();
	}

	@When("I enter invalid username")
	public void i_enter_invalid_username() {
	    driver.findElement(By.id("username")).sendKeys("shathi");
	}

	@When("I enter my invalid password")
	public void i_enter_my_invalid_password() {
	    driver.findElement(By.id("password")).sendKeys("password12");
	    
	    
	}

	@When("I click submit")
	public void i_click_submit() {
	    driver.findElement(By.id("submit")).click();
	}

	@Then("I should get error message")
	public void i_should_get_error_message() {
	    driver.findElement(By.id("error")).getText();
	}


	
	}

