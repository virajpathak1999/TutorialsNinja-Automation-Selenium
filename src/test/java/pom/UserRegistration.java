package PageObjectClassesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistration {

	WebDriver driver;

	// Constructor
	public UserRegistration(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Locators
	By my_Account_Page = By.xpath("//a[@title='My Account']");
	By click_on_register = By.xpath("//a[contains(text(),'Register')]");
	By txt_firstName_loc = By.xpath("//input[@id='input-firstname']");
    By txt_LastName_loc = By.xpath("//input[@id='input-lastname']");
    By txt_email_loc = By.xpath("//input[@id='input-email']");
    By txt_telephone_loc = By.id("input-telephone");
    By txt_password_loc = By.xpath("//input[@id='input-password']");
    By txt_confirmPwd_loc =  By.xpath("//input[@id='input-confirm']");
    By btn_subscribe_loc = By.xpath("//label[normalize-space()='Yes']");
    By chkbox_agree_loc = By.xpath("//input[@name='agree']");
    By btn_rgtr_loc = By.xpath("//input[@value='Continue']");
    
    
    // Action methods
    public void myAccount()
    {
    	driver.findElement(my_Account_Page).click();
    }
    
    public void clickOnRegister()
    {
    	driver.findElement(click_on_register).click();
    }
    
    public void firstName(String fname)
    {
    	driver.findElement(txt_firstName_loc).sendKeys(fname);
    }
    
    public void lastName(String lname)
    {
    	driver.findElement(txt_LastName_loc).sendKeys(lname);
    }
    
    public void email(String eml)
    {
    	driver.findElement(txt_email_loc).sendKeys(eml);
    }
    
    public void tphone(String phone)
    {
    	driver.findElement(txt_telephone_loc).sendKeys(phone);
    }
    
    public void entrPwd(String password) {
        driver.findElement(txt_password_loc).sendKeys(password);
    }

    public void entrCfrmPwd(String confirmPassword) {
        driver.findElement(txt_confirmPwd_loc).sendKeys(confirmPassword);
    }

    public void subscribe() {
        driver.findElement(btn_subscribe_loc).click();
    }

    public void AgreeCheckbox() {
        driver.findElement(chkbox_agree_loc).click();
    }

    public void clickContinue() {
        driver.findElement(btn_rgtr_loc).click();
    }
	
}
