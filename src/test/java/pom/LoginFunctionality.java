package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunctionality {
	
	WebDriver driver;

	// Constructor
	public LoginFunctionality(WebDriver driver)
	{
		this.driver = driver;
	}

	// Locators
	By my_account_Page = By.xpath("//a[@title='My Account']");
	By click_on_login = By.xpath("//a[normalize-space()='Login']");
	By txt_email_loc = By.xpath("//input[@id='input-email']");
    By txt_Pwd_loc =  By.xpath("//input[@id='input-password']");
    By btn_login_loc = By.cssSelector("input.btn.btn-primary");
    
    // Action methods
    public void myAccount()
    {
    	driver.findElement(my_account_Page).click();
    }
    
    public void clickOnLogin()
    {
    	driver.findElement(click_on_login).click();
    }
    public void enterEmail(String email)
    {
    	driver.findElement(txt_email_loc).sendKeys(email);
    }
    public void enterPwd(String pwd)
    {
    	driver.findElement(txt_Pwd_loc).sendKeys(pwd);
    }
    public void login()
    {
    	driver.findElement(btn_login_loc).click();    
    }
    public void invalidLogin(String email, String pwd)
    {
    	driver.findElement(my_account_Page).click();
    	driver.findElement(click_on_login).click();
    	driver.findElement(txt_email_loc).sendKeys(email);
    	driver.findElement(txt_Pwd_loc).sendKeys(pwd);
    	WebElement btn = driver.findElement(btn_login_loc);
    	btn.click();
    	
    }

}

