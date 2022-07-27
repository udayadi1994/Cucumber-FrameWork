//package stepdefinations;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import com.pages.Add_on_service;
//import com.pages.HomePage;
//import com.pages.LoginPage;
//import com.pages.ProductStore;
//import com.pages.ProductlistPage;
//import com.pages.SignupPage;
//
//import appHooks.ApplicationHooks;
//import cucumberAutomation.Base;
//import io.cucumber.java.en.And;
//
////import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class Login_RetailerStepdef {
//
//	public WebDriver driver;
//	
//	HomePage h;
//	LoginPage l;
//	SignupPage s;
////	ProductlistPage pl;
////	ProductStore ps;
////	Add_on_service ADD;
//	//ApplicationHooks hooks;
//	
//
//	@Given("^user is in landing page$")
//	public void user_is_in_landing_page() throws Throwable
//	{
//		System.out.println("User is in landing page");
//		
//		Base base = new Base();
//		driver= base.getDriver();
//		driver.manage().window().maximize();
//	Thread.sleep(3000);
//	
//	}
//	
//	
//	  
//	   
//	   @When("^user enters valid username$")
//	  
//	    public void user_enters_valid_Username() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.enter_username().sendKeys("jibutest@getnada.com");
////	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @When("^user enters vaid  password$")
//		  
//	    public void user_enters_valid_password() throws Throwable {
//	        
//	    	
//  l=new LoginPage(driver);
//  l.enterpassword().sendKeys("etail_1202");
// 
// 	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @And("^clicks on Sign-in button$")
//		  
//	    public void known_user_clicks_signin() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.Rememberme().click();
//  l.clicksignIn().click();
//
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	   
//		@Then("^user select Bookit from dashboard$")
//		public void user_select_Bookit_from_dashboard() throws Throwable
//		{	
//			WebElement Source = driver.findElement(By.id("dashboard-toggle"));
//			  Select dd1=new Select(Source);
//			  dd1.selectByValue("bookit_only");
//			  System.out.println("Passed!");
//			  driver.close();
//			Thread.sleep(5000);
//		
//		}
//
//		
//
//	   @Then("^user clicks on signup link$")
//	    public void user_clicks_signuplink() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.clicksignin().click();
////	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters firstname$")
//	    public void user_enters_firstname() throws Throwable {
//	        
//	    
////	    s=new SignupPage(driver);
////	    s.enterfirstname().sendKeys("Rah");
////	  
//	    	
//	    	
//	    }
//	   @When("^user enters lastname$")
//	    public void user_enters_lastname() throws Throwable {
////		   s=new SignupPage(driver);
////		    s.enterlastname().sendKeys("Karth");
////	
//		   Thread.sleep(3000);
//		    
//	    }
//	   @When("^user enters Email$")
//	    public void user_enters_mail() throws Throwable {
//	        
//	    	
////		   s=new SignupPage(driver);
////		    s.enteremail().sendKeys("rahul12karthik@gmail.com");
//		    Thread.sleep(3000);
//	    	
//	    	
//	    }
//	   @When("^user enters phonenum$")
//	    public void user_enters_phoenum() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.enterphonenum().sendKeys("9123456789");
////		    
//		   Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters externalID$")
//	    public void user_enters_externaid() throws Throwable {
//	            	
////		   s=new SignupPage(driver);
////		    s.enterexternalID().sendKeys("etailpet123456");
////		    
//		    Thread.sleep(3000);
//	    	
//	    }
//	   @When("^user enters seconID$")
//	    public void user_enters_secondid() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.secondID().sendKeys("91234567891");
//		   Thread.sleep(5000);
////	    	
//	    }
//	   @When("^user enters first pwd$")
//	    public void user_enters_firstpwd() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.enterpwd().sendKeys("Rahul123@!");
//		   Thread.sleep(5000);
//		   
////	    	
//	    }
//	   @When("^user enters second pwd$")
//	    public void user_enters_secondpwd() throws Throwable {
//	        
////		   s=new SignupPage(driver);
////		    s.entersecondpwd().sendKeys("Rahul123@!");
//		   Thread.sleep(5000);
////	  
//	    	
//	    }
//	   @When("^user clicks on signup button$")
//	    public void user_clicks_on_signup_button() throws Throwable {
//		   
////		   s=new SignupPage(driver);
////		    s.signup().click();
//		   Thread.sleep(5000);
////	    	
//	    }
//	   
//	   
//	   @When("^user enters Invalid username$")
//		  
//	    public void user_enters_invalid_Username() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.enter_username().sendKeys("Rahul@123");
////	  
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	   @When("^user enters Invaid  password$")
//		  
//	    public void user_enters_invalid_password() throws Throwable {
//	        
//	    	
////	    l=new LoginPage(driver);
////	    l.enterpassword().sendKeys("qcbdekd!");
////	  
//	    	Thread.sleep(5000);
//	    	
//	    }
//	
//	   
//	   @And("^clicks on Add to cart in product view screen$")
//		  
//	    public void add_to_cart1() throws Throwable {
//	        
//	    	
//	  //  pl=new ProductlistPage (driver);
//	  //  pl.addtoCart1().click();
// 
//	    	//Thread.sleep(5000);
//		   System.out.println("User selected product to add it to cart");
//	    	
//	    }
//	   
//	   @And("^confirms add to cart$")
//	    public void add_to_cart2() throws Throwable {
//	        
//	    	
//	    //ps=new ProductStore (driver);
//	   // ps.addtoCart2().click();
//		   System.out.println("User added product to cart ");
//
//	    	Thread.sleep(5000);
//	    	
//	    }
//	   
//	  @And("^User clicks on logout button$")
//	  public void add_logout_check() throws Throwable {
//	        
//	    	
////		   ps=new ProductStore (driver);
////		    ps.addtoCart2().click();
//			   System.out.println("User sucessfuly logged out  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	  @Then("^check for Product tab and apply filters$")
//	  public void checK_UI_elements() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("Apply filters and Ui tabs are displayed as expected ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	   
//	   
//	 
//	  @Given("^user is in Product list page$")
//	  public void user_in_productlist_page() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("user is in product list page  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	  @Then("^clicks on Dropdown Menu$")
//	  public void click_dropdown_menu() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("drop down list displayed ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	 
//	  @Then("^clicks on SignOut$")
//	  public void clicks_on_signout() throws Throwable {
//	        
//	    	
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//			   System.out.println("user signed out succesfully  ");
//
//		    	Thread.sleep(5000);
//		    	
//		    }
//	  
//	   
//	   
//	   
//	   
//}
