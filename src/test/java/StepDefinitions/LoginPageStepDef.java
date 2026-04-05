package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectClassesPOM.LoginFunctionality;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	WebDriver driver;
	LoginFunctionality login;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		login = new LoginFunctionality(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();  
		Thread.sleep(2000);
	}
	
	@When("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{  
		login.myAccount();
		login.clickOnLogin();
		Thread.sleep(2000);
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException 
	{
		login.enterEmail("virajrpathak1999@gmail.com");
		login.enterPwd("Pass@123");
		Thread.sleep(2000);
	}
	
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String username, String password) throws InterruptedException {
		login.enterEmail(username);
		login.enterPwd(password);
		Thread.sleep(2000);
	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException
	{
		login.login();
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
