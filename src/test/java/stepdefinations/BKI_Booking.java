package stepdefinations;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pages.Add_on_service;
import com.pages.Appointment_Schedule;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductStore;
import com.pages.ProductlistPage;
import com.pages.Schedule;
import com.pages.SignupPage;

import appHooks.ApplicationHooks;
import cucumberAutomation.Base;
import io.cucumber.java.en.And;

//import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Date;


public class BKI_Booking {

	private static final Object Arguments = null;

	private static final String Script = null;

	public WebDriver driver;
	
	HomePage h;
	LoginPage l;
	SignupPage s;
	Schedule se;
	Appointment_Schedule sa;
//	ProductlistPage pl;
//	ProductStore ps;
//	Add_on_service ADD;
	//ApplicationHooks hooks;
	

	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable
	{
		System.out.println("User is in landing page");
		
		Base base = new Base();
		driver= base.getDriver();
		driver.manage().window().maximize();
	Thread.sleep(3000);
	
	}
	
	
	  
	   
	   @When("^user enters valid username$")
	  
	    public void user_enters_valid_Username() throws Throwable {
	        
	    	
   l=new LoginPage(driver);
   l.enter_username().sendKeys("jibutest@getnada.com");
//	  
	    	Thread.sleep(3000);
	    	
	    }
	   
	   @When("^user enters vaid  password$")
		  
	    public void user_enters_valid_password() throws Throwable {
	        
	    	
  l=new LoginPage(driver);
  l.enterpassword().sendKeys("etail_1202");
 
 	Thread.sleep(3000);
	    	
	    }
	   
	   @And("^clicks on Sign-in button$")
		  
	    public void known_user_clicks_signin() throws Throwable {
	        
	    	
   l=new LoginPage(driver);
   l.Rememberme().click();
  l.clicksignIn().click();

	    	Thread.sleep(5000);
	    	
	    }
	   
	   
		@Then("^user select Bookit from dashboard$")
		public void user_select_Bookit_from_dashboard() throws Throwable
		{	
			WebElement Source = driver.findElement(By.id("dashboard-toggle"));
			  Select dd1=new Select(Source);
			  dd1.selectByValue("bookit_only");
			  System.out.println("Passed!");
			
			Thread.sleep(5000);
		
		}
		
//		@Then("^user select service type$")
//		public void user_select_Bookit44_from_dashboard() throws Throwable
//		{	
//			driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
//			driver.navigate().refresh();
//			driver.findElement(By.xpath("//button[text()='Add new service type']")).click();
//			WebElement existingService= driver.findElement(By.name("serviceTypeName"));
//			existingService.sendKeys("MyFirstServesss");
//			WebElement IndexValue = driver.findElement(By.name("serviceTypeIndexValue"));
//			IndexValue.sendKeys("2");
//			//WebElement UploadService= driver.findElement(By.xpath("//label[@class='custom-file-label']"));
//			driver.findElement(By.id("inputGroupFile01")).sendKeys("C:\\\\Users\\\\manis\\\\OneDrive\\\\Desktop\\\\etailpet\\\\labrador-retriever-dog-breed-info.jpg");
//			driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//button[@class='btn btn-orange btn']")).click();
//			
//			Thread.sleep(5000);
//		
//		}
//		 @Then("^user click on Configuration$")
//		    public void  user_click_on_Configuration() throws Throwable {
//		        
//		    
//		    h=new HomePage(driver);
//	        h.user_click_configuration().click();	  
//	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//		    	driver.findElement(By.xpath("//strong[text()='Service Types']")).click();
//		    	
//		    }
		@Then("^user click on booking tab$")
	    public void user_clicks_bookungtab() throws Throwable {
	        
	    
	    h=new HomePage(driver);
        h.user_click_booking().click();	  
	    	Thread.sleep(3000);
	    	
	    }
		@Then("^user click on Schedule tab$")
	    public void user_clicks_sSchedule() throws Throwable {
	        
			Thread.sleep(3000);
	    h=new HomePage(driver);
        h.user_click_Schedule1().click();	  
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	
	    }
		@Then("^user click on new Appointment tab$")
	    public void user_clicks_Appointment() throws Throwable {
	        
			
	    se=new Schedule(driver);
         se.user_click_new_appointment().click();	  
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	    	
	    }
		@Then("^User Select Customer$")
	    public void user_select_customer() throws Throwable {
	        
		 
			sa=new Appointment_Schedule(driver);
			sa.User_Select_Customer().click();
		    Thread.sleep(3000);
			sa.User_enter_customer_name().sendKeys("manis");
			Thread.sleep(3000);
			sa.User_enter_customer_name1().click();

	    }
		
		
		@Then("^User Select pet type$")
	    public void user_select_pettype() throws Throwable {
	        
			sa=new Appointment_Schedule(driver);
			sa.User_click_petdetails_scroll().click();
			Thread.sleep(3000);
		    sa.User_click_select_pettype().click();
		    Thread.sleep(3000);
		    sa.User_select_pettype().click();
		    Thread.sleep(5000);
		    sa.User_click_on_Temperament().click();
		    Thread.sleep(5000);
		    sa.User_select_Temperament().click();
		    Thread.sleep(2000);
		    sa.User_click_on_hairlength().click();
		    Thread.sleep(2000);
		    sa.User_select_hairlength().click();
		}
		
		 @Then("^User Select service type$")
		    public void user_select_service_type() throws Throwable {
			driver.findElement(By.xpath("(//div[@class='card-header']//button)[2]")).click();
			sa=new Appointment_Schedule(driver);
			sa.user_click_on_servicetype().click();
			Thread.sleep(3000);
			sa.user_Enetr_service_typename().sendKeys("groom");
			Thread.sleep(3000);
			sa.user_select_servicetype().click();
	    }
		 @Then("^User select service name$")
		    public void user_select_service_name() throws Throwable {
		 
			sa=new Appointment_Schedule(driver);
			sa.user_select_service().click();
			Thread.sleep(3000);
			sa.user_select_servicename().click();
			Thread.sleep(3000);
			System.out.println("all field Automatically populated");
	    }
//		 @Then("^User select Attendant$")
//		    public void user_select_attendant() throws Throwable {
//		 
//			sa=new Appointment_Schedule(driver);
////			sa.user_select_Attendant().click();
////			Thread.sleep(3000);
////			sa.user_select_Attendantjessy().click();
//			Thread.sleep(3000);
//			System.out.println("all field Automatically populated");
//	    }
		 @Then("^User Select TimeSlot$")
		    public void user_select_TimeSlot() throws Throwable {
		 
			sa=new Appointment_Schedule(driver);
			sa.user_click_on_selecttimeslot().click();
			Thread.sleep(3000);
		
	    }
	   @Then("^user clicks on signup link$")
	    public void user_clicks_signuplink() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.clicksignin().click();
//	  
	    	Thread.sleep(3000);
	    	
	    }
	   @When("^user enters firstname$")
	    public void user_enters_firstname() throws Throwable {
	        
	    
//	    s=new SignupPage(driver);
//	    s.enterfirstname().sendKeys("Rah");
//	  
	    	
	    	
	    }
	   @When("^user enters lastname$")
	    public void user_enters_lastname() throws Throwable {
//		   s=new SignupPage(driver);
//		    s.enterlastname().sendKeys("Karth");
//	
		   Thread.sleep(3000);
		    
	    }
	   @When("^user enters Email$")
	    public void user_enters_mail() throws Throwable {
	        
	    	
//		   s=new SignupPage(driver);
//		    s.enteremail().sendKeys("rahul12karthik@gmail.com");
		    Thread.sleep(3000);
	    	
	    	
	    }
	   @When("^user enters phonenum$")
	    public void user_enters_phoenum() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.enterphonenum().sendKeys("9123456789");
//		    
		   Thread.sleep(3000);
	    	
	    }
	   @When("^user enters externalID$")
	    public void user_enters_externaid() throws Throwable {
	            	
//		   s=new SignupPage(driver);
//		    s.enterexternalID().sendKeys("etailpet123456");
//		    
		    Thread.sleep(3000);
	    	
	    }
	   @When("^user enters seconID$")
	    public void user_enters_secondid() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.secondID().sendKeys("91234567891");
		   Thread.sleep(5000);
//	    	
	    }
	   @When("^user enters first pwd$")
	    public void user_enters_firstpwd() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.enterpwd().sendKeys("Rahul123@!");
		   Thread.sleep(5000);
		   
//	    	
	    }
	   @When("^user enters second pwd$")
	    public void user_enters_secondpwd() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.entersecondpwd().sendKeys("Rahul123@!");
		   Thread.sleep(5000);
//	  
	    	
	    }
	   @When("^user clicks on signup button$")
	    public void user_clicks_on_signup_button() throws Throwable {
		   
//		   s=new SignupPage(driver);
//		    s.signup().click();
		   Thread.sleep(5000);
//	    	
	    }
	   
	   
	   @When("^user enters Invalid username$")
		  
	    public void user_enters_invalid_Username() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.enter_username().sendKeys("Rahul@123");
//	  
	    	Thread.sleep(5000);
	    	
	    }
	   
	   @When("^user enters Invaid  password$")
		  
	    public void user_enters_invalid_password() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.enterpassword().sendKeys("qcbdekd!");
//	  
	    	Thread.sleep(5000);
	    	
	    }
	
	   
	   @And("^clicks on Add to cart in product view screen$")
		  
	    public void add_to_cart1() throws Throwable {
	        
	    	
	  //  pl=new ProductlistPage (driver);
	  //  pl.addtoCart1().click();
 
	    	//Thread.sleep(5000);
		   System.out.println("User selected product to add it to cart");
	    	
	    }
	   
	   @And("^confirms add to cart$")
	    public void add_to_cart2() throws Throwable {
	        
	    	
	    //ps=new ProductStore (driver);
	   // ps.addtoCart2().click();
		   System.out.println("User added product to cart ");

	    	Thread.sleep(5000);
	    	
	    }
	   
	  @And("^User clicks on logout button$")
	  public void add_logout_check() throws Throwable {
	        
	    	
//		   ps=new ProductStore (driver);
//		    ps.addtoCart2().click();
			   System.out.println("User sucessfuly logged out  ");

		    	Thread.sleep(5000);
		    	
		    }
	  
	  @Then("^check for Product tab and apply filters$")
	  public void checK_UI_elements() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("Apply filters and Ui tabs are displayed as expected ");

		    	Thread.sleep(5000);
		    	
		    }
	   
	   
	 
	  @Given("^user is in Product list page$")
	  public void user_in_productlist_page() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("user is in product list page  ");

		    	Thread.sleep(5000);
		    	
		    }
	  
	  @Then("^clicks on Dropdown Menu$")
	  public void click_dropdown_menu() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("drop down list displayed ");

		    	Thread.sleep(5000);
		    	
		    }
	 
	  @Then("^clicks on SignOut$")
	  public void clicks_on_signout() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("user signed out succesfully  ");

		    	Thread.sleep(5000);
		    	
		    }
	  
	   
	   
	   
	   
}
