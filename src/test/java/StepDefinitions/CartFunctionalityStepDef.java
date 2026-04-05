package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClassesPOM.CartFunctionality;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartFunctionalityStepDef {

	WebDriver driver;
	CartFunctionality cart;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		cart = new CartFunctionality(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	}
	   
	@Given("enter product name in search box")
	public void enter_product_name_in_search_box() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	    cart.search("iphone");
	}

	@When("click on search option")
	public void click_on_search_option() {
		cart.click();
	}

	@When("adds the product to the cart")
	public void adds_the_product_to_the_cart() {
		cart.cart();
	}

	@When("user enters the product name in search box")
	public void user_enters_the_product_name_in_search_box() {
		cart.search("Mac");
	}
	
	@And("click the search option")
	public void click_the_search_option() {
		cart.click();
	}

	@And("add product to the cart")
	public void add_product_to_the_cart() {
		cart.cart1();
	}
	
	@And("user clicks the cart option")
	public void user_clicks_the_cart_option() {
	    cart.clickcart();
	}

	@Then("user removes the items from the cart")
	public void user_removes_the_items_from_the_cart() {
	    cart.remove();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
