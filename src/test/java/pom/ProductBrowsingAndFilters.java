package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductBrowsingAndFilters {

	 WebDriver driver;

	// Constructor
	 public ProductBrowsingAndFilters(WebDriver driver)
	{
		this.driver = driver;
	}
	    
	// Locators for product search and display
    By searchBox = By.cssSelector("[name=\"search\"]");
    By searchButton = By.cssSelector("[class=\"input-group-btn\"]");
	By productName = By.linkText("MacBook");
	By productPrice = By.className("price");
	By criteria = By.xpath("(//input[@name=\"search\"])[2]");
    By dropDown = By.name("category_id");
    By subCategoryCheckbox = By.name("sub_category");
    By descriptionCheckbox = By.id("description");
    By clickSearch = By.id("button-search");
    By list = By.cssSelector("[class=\"fa fa-th-list\"]");
    By sortBy = By.id("input-sort");
    By wishlist = By.xpath("//div[@class='product-layout product-list col-xs-12']//button[2]");
	    

	    // Method to search for a product
	    public void searchForProduct(String product) {
	        WebElement searchInput = driver.findElement(searchBox);
	        searchInput.sendKeys(product);  // Enter product name into the search box
	    }
	    public void clickButton( ) {

	        driver.findElement(searchButton).click();  // Click the search button
	    }

	    // Method to get the product name
	    public String getProductName() {
	        WebElement product = driver.findElement(productName);
	        return product.getText();  // Return the product name text
	    }

	    // Method to get the product price
	    public String getProductPrice() {
	        WebElement price = driver.findElement(productPrice);
	        return price.getText();  // Return the product price text
	    }
	    
	    public void criteria_search(String name)
	    {
	    	WebElement ele = driver.findElement(criteria);
	    	ele.clear();
	    	ele.sendKeys(name);
	    }
	   
	    public void selectOption(String option) {
	        driver.findElement(dropDown).sendKeys(option);
	    }
	    
	    public void checkSubCategory() {
	        driver.findElement(subCategoryCheckbox).click();
	    }

	    public void checkDescription() {
	        driver.findElement(descriptionCheckbox).click();
	    }
	    
	    public void filter()
	    {
	    	driver.findElement(clickSearch).click();
	    }
	    
	    public void listAndGrid()
	    {
	    	driver.findElement(list).click();
	    }
	    
	    public void SortBy(String filter)
	    {
	    	driver.findElement(sortBy).sendKeys(filter);
	    }
	    
	    public void wishlist()
	    {
	    	driver.findElement(wishlist).click();
	    }
}
