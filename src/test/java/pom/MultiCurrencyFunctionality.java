package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiCurrencyFunctionality {

    WebDriver driver;
	
	// Constructor
    public MultiCurrencyFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
	    
	// Locators
    By curency = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    By eur = By.xpath("//button[contains(text(),'€Euro')]");
    By poun = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By dollar = By.xpath("//button[normalize-space()='$US Dollar']");
   
    
    // Action methods
    public void currency()
    {
    	driver.findElement(curency).click();
    }
    
    public void euro()
    {
    	driver.findElement(eur).click();
    }
    
    public void pound()
    {
    	driver.findElement(poun).click();
    }
    
    public void USdollar()
    {
    	driver.findElement(dollar).click();
    }
	

    
}
