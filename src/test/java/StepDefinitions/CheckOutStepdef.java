package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClassesPOM.CheckOutFunctionality;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepdef {

	WebDriver driver;
	CheckOutFunctionality checkout;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		checkout = new CheckOutFunctionality(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	}
	
	@Given("user enter the product name in search box")
	public void user_enter_the_product_name_in_search_box() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		checkout.search("iphone");
	}
	
	@When("user clicks on search option")
	public void user_clicks_on_search_option() {
		checkout.click();
	}
	
	@When("add the product to the cart")
	public void add_the_product_to_the_cart() {
	    checkout.cart();
	}

	@When("user clicked cart option")
	public void user_clicked_cart_option() {
		checkout.clickcart();
	}

	@When("apply coupen code")
	public void apply_coupen_code() {
		checkout.couponCode("HAIR20");
	}

	@Then("clicks the checkout button")
	public void clicks_the_checkout_button() {
		checkout.checkoutbutton();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
