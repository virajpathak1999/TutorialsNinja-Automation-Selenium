package POM_Test_Files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectClassesPOM.AccountManagementFunctionality;
import PageObjectClassesPOM.CartFunctionality;
import PageObjectClassesPOM.CheckOutFunctionality;
import PageObjectClassesPOM.LoginFunctionality;
import PageObjectClassesPOM.MultiCurrencyFunctionality;
import PageObjectClassesPOM.ProductBrowsingAndFilters;
import PageObjectClassesPOM.SearchFunctionality;
import PageObjectClassesPOM.UserRegistration;

public class All_POM_TesT_files {

	WebDriver driver;

	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	void testRegistration() throws InterruptedException
	{
		UserRegistration ur = new UserRegistration(driver);
		ur.myAccount();
		ur.clickOnRegister();
		ur.firstName("Viraj");
		ur.lastName("Pathak");
		ur.email("virajrpathak1999@gmail.com");
		ur.tphone("8793457546");
		ur.entrPwd("Pass@123");
		ur.entrCfrmPwd("Pass@123");
		ur.subscribe();
		ur.AgreeCheckbox();
		ur.clickContinue();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	void testLogin() throws InterruptedException
	{
		LoginFunctionality login = new LoginFunctionality(driver);
		login.myAccount();
		login.clickOnLogin();
		login.enterEmail("virajrpathak1999@gmail.com");
		login.enterPwd("Pass@123");
		login.login();
		//Assert.assertTrue(driver.getPageSource().contains("Warning: No match for E-Mail Address and/or Password."));
		Thread.sleep(5000);
	}
	
	@Test
	public void testLoginWithInvalidCredentials() throws InterruptedException
	{
		LoginFunctionality login = new LoginFunctionality(driver);
		login.myAccount();
		login.clickOnLogin();
		login.enterEmail("viraj123@gmail.com");
		login.enterPwd("Viraj");
		login.login(); 
	    Thread.sleep(5000);
	}
	
	 @Test(priority = 3)
	 public void testProductSearch() throws InterruptedException 
	 {
		 ProductBrowsingAndFilters pb = new ProductBrowsingAndFilters(driver);
	     // Perform product search
	     pb.searchForProduct("MacBook");
	     pb.clickButton();
	     // Verify product name and price
	     String productName = pb.getProductName();
	     String productPrice = pb.getProductPrice();
	     System.out.println("Product Name: " + productName);
	     System.out.println("Product Price: " + productPrice);
	     pb.criteria_search("Apple Cinema 30");
	     pb.selectOption("Monitors");
	     pb.checkSubCategory();
	     pb.checkDescription();
	     pb.filter();
	     pb.listAndGrid();
	     pb.SortBy("Price (Low > High)");
	     pb.wishlist();
         Thread.sleep(10000);
	  }
	 
	  @Test(priority = 4)
	  public void searchValidProducts() throws InterruptedException
	  {
		 SearchFunctionality srch = new SearchFunctionality(driver);
		 srch.search("iphone");
		 srch.click();
		 Thread.sleep(10000);
		
	  }
	 
	  @Test
	  public void searchinvalidProducts() throws InterruptedException
	  {
		 SearchFunctionality searchPage = new SearchFunctionality(driver);
		 searchPage.search("");
		 searchPage.click();
		 Thread.sleep(10000);
	   }
	 
	   @Test(priority = 5)
	   public void AddToCart() throws InterruptedException
	   {
		   CartFunctionality addToCart = new CartFunctionality(driver);
		   addToCart.search("iphone");
		   addToCart.click();
		   addToCart.cart();
		   addToCart.search("Mac");
		   addToCart.click();
		   addToCart.cart1();
		   Thread.sleep(2000);
		   addToCart.clickcart();
		   addToCart.remove();
		   Thread.sleep(10000);
	   }
	   
	   @Test(priority = 6)
	   public void CheckOut() throws InterruptedException
	   {
		   CheckOutFunctionality checkout = new CheckOutFunctionality(driver);
		   checkout.search("iphone");
		   checkout.click();
		   checkout.cart();
		   checkout.clickcart();
		   Thread.sleep(2000);
		   checkout.couponCode("HAIR20");
		   checkout.checkoutbutton();
		   Thread.sleep(10000);
	   }
	   
	   @Test(priority = 7)
	   public void AccountManagement() throws InterruptedException
	   {
		   AccountManagementFunctionality accnt = new AccountManagementFunctionality(driver);
		   accnt.profilePage();
		   accnt.account();
		   accnt.editData();
		   accnt.ModifyName();
		   accnt.submit();
		   Thread.sleep(10000);
	   }
	   
	   @Test
	   public void MultiCurrency() throws InterruptedException 
	   {
		   MultiCurrencyFunctionality currency = new MultiCurrencyFunctionality(driver);
		   currency.currency();
		   currency.euro();       
	   }
		 
	   @AfterClass
		void tearDown()
		{
			driver.quit();
		}
}
