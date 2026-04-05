package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutFunctionality {

    WebDriver driver;
	
	// Constructor
    public CheckOutFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
	    
	// Locators for product search and display
	By searchBox = By.xpath("//input[@placeholder='Search']");
    By searchbutton = By.cssSelector("[class=\"input-group-btn\"]");
    By addToCart = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]");
    By clickCart = By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']");
    By coupon = By.xpath("//a[normalize-space()='Use Coupon Code']//i[@class='fa fa-caret-down']");
    By button = By.xpath("//a[@class='btn btn-primary']");
    
    // Action methods
    public void search(String phone)
    {
    	WebElement ele = driver.findElement(searchBox);
    	ele.clear();
    	ele.sendKeys(phone);
    }
    
    public void click()
    {
    	driver.findElement(searchbutton).click();
    }
    
    public void cart()
    {
    	driver.findElement(addToCart).click();
    }
   
    public void clickcart()
    {
        driver.findElement(clickCart).click();	 
    }
    
    public void couponCode(String code) 
    {
    	driver.findElement(coupon).sendKeys(code);
    }
    
    public void checkoutbutton()
    {
    	driver.findElement(button).click();
    }
}
