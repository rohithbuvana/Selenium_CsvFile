package com.capgemini.casestudyselenium1;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterTestSteps {
	
	WebDriver driver=null;
	RegisterPage registerPage = null;	
	ProjectPage projectPage=null;
	
	@After
	public void destroy()
	{
		driver.close();
	}
	@Given("^: that user loads the register page$")
	public void that_user_loads_the_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("D:/BDD/register.html");
		registerPage=PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@When("^: User enters the fname as \"([^\"]*)\"$")
	public void user_enters_the_fname_as(String arg1) throws Throwable {
	   registerPage.fname.sendKeys(arg1);
	   	
	}

	@When("^: User enters the lname as \"([^\"]*)\"$")
	public void user_enters_the_lname_as(String arg1) throws Throwable {
	    registerPage.lname.sendKeys(arg1);
	   	
	}

	@When("^: User enters the email as \"([^\"]*)\"$")
	public void user_enters_the_email_as(String arg1) throws Throwable {
	    registerPage.email.sendKeys(arg1);
	   	
	}

	@When("^: User enters the contact numbers as \"([^\"]*)\"$")
	public void user_enters_the_contact_numbers_as(String arg1) throws Throwable {
	    registerPage.mobile.sendKeys(arg1);
	   	
	}

	@When("^: User enters the address as \"([^\"]*)\"$")
	public void user_enters_the_address_as(String arg1) throws Throwable {
	   registerPage.address.sendKeys(arg1);
	   	
	}

	@When("^: User enters the city as \"([^\"]*)\"$")
	public void user_enters_the_city_as(String arg1) throws Throwable {
	    registerPage.city.sendKeys(arg1);
	   	
	}

	@When("^: User selects the state as \"([^\"]*)\"$")
	public void user_selects_the_state_as(String arg1) throws Throwable {
		Select dropdown= new Select(registerPage.state);
		dropdown.selectByVisibleText(arg1);
			
	}

	@When("^: User clicks submit$")
	public void user_clicks_submit() throws Throwable {
		registerPage.submit.click();
		
	}
	@When("^: Loads next page$")
	public void loadingnextpage() throws Throwable
	{
		driver.get("D:/BDD/projectdetails.html");
		projectPage=PageFactory.initElements(driver, ProjectPage.class);
			
	}

	@When("^: User enters the project name as \"([^\"]*)\"$")
	public void user_enters_the_project_name_as(String arg1) throws Throwable {
	    projectPage.pname.sendKeys(arg1);
	    	
	}

	@When("^: User enters the client name as \"([^\"]*)\"$")
	public void user_enters_the_client_name_as(String arg1) throws Throwable {
	   projectPage.cname.sendKeys(arg1);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@When("^: User enters the team size as (\\d+)$")
	public void user_enters_the_team_size_as(int arg1) throws Throwable {
		 projectPage.tsize.sendKeys(String.valueOf(arg1));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@When("^: User clicks register$")
	public void user_clicks_register() throws Throwable {
	    projectPage.submit.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@Then("^: the user registered successfully$")
	public void the_user_registered_successfully() throws Throwable {
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 assertEquals("Registered Successfully",alert.getText());
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 
	}
	@Then("^: the user registerion unsuccessfull$")
	public void the_user_registerion_unsuccessfull() throws Throwable {
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 assertEquals("You have entered an invalid email address!",alert.getText());
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 
	}
	
}
