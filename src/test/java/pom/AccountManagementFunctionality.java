package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountManagementFunctionality {

WebDriver driver;
	
	// Constructor
    public AccountManagementFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}
    
    // Locators
    By profile = By.xpath("//a[@title='My Account']");
    By myAccount = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']");
    By edit = By.xpath("//a[normalize-space()='Edit your account information']");
    By modifyName = By.xpath("//input[@id='input-firstname']");
    By continu = By.xpath("//input[@value='Continue']");
    
    // Action methods
    public void profilePage() 
    {
    	driver.findElement(profile).click();
    }
    
    public void account() 
    {
    	driver.findElement(myAccount).click();
    }
    
    public void editData() 
    {
    	driver.findElement(edit).click();
    }
    
    public void ModifyName() 
    {
    	driver.findElement(modifyName).click();
    }
    
    public void submit() 
    {
    	driver.findElement(continu).click();
    }
    
}
