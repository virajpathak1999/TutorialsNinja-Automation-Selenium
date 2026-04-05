package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectClassesPOM.ProductBrowsingAndFilters;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearchandFiltersStepdef {

	WebDriver driver;
	ProductBrowsingAndFilters productSearch;
	
	@Before
	public void setup() 
	{
		driver = new ChromeDriver();
		productSearch = new ProductBrowsingAndFilters(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	}
	
	@Given("enter the product name in search box")
	public void enter_the_product_name_in_search_box() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		productSearch.searchForProduct("MacBook");
	}

	@When("clicks on search option")
	public void clicks_on_search_option() {
		productSearch.clickButton();
	}
	
	@When("verify product name and price") 
	public void verify_product_name_and_price() {
		String productName = productSearch.getProductName();
	     String productPrice = productSearch.getProductPrice();
	     System.out.println("Product Name: " + productName);
	     System.out.println("Product Price: " + productPrice);
	}

	@When("user enters the product in criteria search")
	public void user_enters_the_product_in_criteria_search() {
		productSearch.criteria_search("Apple Cinema 30");
	}

	@When("selects dropdown")
	public void selects_dropdown() {
		productSearch.selectOption("Monitors");
	}

	@When("selects the subcategory checkbox")
	public void selects_the_subcategory_checkbox() {
		productSearch.checkSubCategory();
	}

	@When("selects the description checkbox")
	public void selects_the_description_checkbox() {
		productSearch.checkDescription();
	}

	@When("apply filters")
	public void apply_filters() {
	    productSearch.filter();
	}

	@When("select the list option")
	public void select_the_list_option() {
		productSearch.listAndGrid();
	}

	@Then("user sort the items")
	public void user_sort_the_items() {
		productSearch.SortBy("Price (Low > High)");
	}

	@Then("product added to wishlist")
	public void product_added_to_wishlist() {
		productSearch.wishlist();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
