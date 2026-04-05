package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClassesPOM.UserRegistration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Userregistration {

	WebDriver driver;
	UserRegistration ur;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		ur = new UserRegistration(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	}
	
	@Given("user clicks the my account button")
	public void user_clicks_the_my_account_button() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		 driver.manage().window().maximize();
	    ur.myAccount();
	}
	@Given("user clicks the register button")
	public void user_clicks_the_register_button() {
	    ur.clickOnRegister();
	}

	@When("enters the first name")
	public void enters_the_first_name() {
	    ur.firstName("Viraj");
	}

	@When("enters the last name")
	public void enters_the_last_name() {
	    ur.lastName("Pathak");
	}

	@When("enters the email")
	public void enters_the_email() {
	    ur.email("virajrpathak1999@gmail.com");
	}

	@When("enters the mobile number")
	public void enters_the_mobile_number() {
	    ur.tphone("8793457546");
	}

	@When("enters the password")
	public void enters_the_password() {
	    ur.entrPwd("Pass@123");
	}

	@When("enters the confirm password")
	public void enters_the_confirm_password() {
	    ur.entrCfrmPwd("Pass@123");
	}

	@When("user click the subscribe")
	public void user_click_the_subscribe() {
	    ur.subscribe();
	}

	@When("user clicks the Agree button")
	public void user_clicks_the_agree_button() {
			ur.AgreeCheckbox();
	}

	@Then("click on the continue button")
	public void click_on_the_continue_button() {
	    ur.clickContinue();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
