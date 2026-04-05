package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClassesPOM.AccountManagementFunctionality;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountManagementStepDef {

	WebDriver driver;
	AccountManagementFunctionality accnt;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		accnt = new AccountManagementFunctionality(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	}
	
	 @Given("user open the profile page")
	 public void user_open_the_profile_page() {
		 driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		 driver.manage().window().maximize();
	     accnt.profilePage();
	 }

	 @When("click the account")
	 public void click_the_account() {
	     accnt.account();
	 }

	 @When("user edits the data")
	 public void user_edits_the_data() {
	     accnt.editData();
	 }

	 @And("user modify the name")
	 public void user_modify_the_name() {
	     accnt.ModifyName();
	 }

	 @Then("clicks the submit button")
	 public void clicks_the_submit_button() {
	     accnt.submit();
	 }
	 @After
		public void tearDown()
		{
			driver.quit();
		}
}
