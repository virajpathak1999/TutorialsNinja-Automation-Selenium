package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchFunctionality {

	WebDriver driver;
	
	// Constructor
	public SearchFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
	    
	// Locators for product search and display
	By searchBox = By.xpath("//input[@placeholder='Search']");
    By searchbutton = By.cssSelector("[class=\"input-group-btn\"]");
    
    
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
    
    
	
}
