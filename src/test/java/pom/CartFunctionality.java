package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartFunctionality {

    WebDriver driver;
	
	// Constructor
    public CartFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
	    
	// Locators for product search and display
	By searchBox = By.xpath("//input[@placeholder='Search']");
    By searchbutton = By.cssSelector("[class=\"input-group-btn\"]");
    By addToCart = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]");
    By addToCart1 = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]");
    By clickCart = By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']");
    By removeItem = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[2]/i[1]");
    
    // Action methods
    public void search(String mobile)
    {
    	WebElement ele = driver.findElement(searchBox);
    	ele.clear();
    	ele.sendKeys(mobile);
    }
    
    public void click()
    {
    	driver.findElement(searchbutton).click();
    }
    
    public void cart()
    {
    	driver.findElement(addToCart).click();
    }
    
    public void cart1()
    {
    	driver.findElement(addToCart1).click();
    }
    
    public void clickcart()
    {
        driver.findElement(clickCart).click();	 
    }
    
    public void remove()
    {
    	driver.findElement(removeItem).click();
    }
    
   

}
