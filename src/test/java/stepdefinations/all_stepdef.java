//package stepdefinations;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import com.pages.Add_on_service;
//import com.pages.CologneSelection;
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
//public class all_stepdef {
//
//	public WebDriver driver;
//	
//	HomePage h;
//	LoginPage l;
//	SignupPage s;
//	ProductlistPage pl;
//	ProductStore ps;
//	Add_on_service ADD;
//	CologneSelection c;
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
//			Thread.sleep(5000);
//			 System.out.println("Passed!");
//		
//		}
//		 @Then("^user click on booking tab$")
//		    public void user_clicks_signinlink() throws Throwable {
//		        
//		    
//		    h=new HomePage(driver);
//	        h.user_click_booking().click();	  
//		    	Thread.sleep(3000);
//		    	
//		    }
//		 @Then("^user click on Configuration$")
//		    public void  user_click_on_Configuration() throws Throwable {
//		        
//		    
//		    h=new HomePage(driver);
//	        h.user_click_configuration().click();	  
//		    	Thread.sleep(3000);
//		    	
//		    }
//		 @Then("^user click on add-on-service$")
//		    public void  user_click_on_add_on_service() throws Throwable {
//		        
//		    
//		    h=new HomePage(driver);
//		    Thread.sleep(3000);
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,350)", "");
//			Thread.sleep(3000);
//	        h.user_click_Add_on_service().click();	  
//		    	Thread.sleep(3000);
//		    	
//		    }
//		 @Then("^Verify whether user is able to delete the Add-on-service$")
//		    public void  Verify_whether_user_is_able_to_delete_the_Add_on_service() throws Throwable {
//		        
//		    
//		    ADD=new Add_on_service(driver);
//	        ADD.user_click_delete().click();
//	    	Thread.sleep(3000);
//	        ADD.user_click_on_Yes().click();
//	        Thread.sleep(3000);
//	       //driver.findElement(By.xpath("//span[text()='×']")).click();
//		    	Thread.sleep(3000);
//		    	 try { 
//			         if(
//			         driver.findElement(By.xpath("//div[text()='Service removed successfully!']"))!= null){
//
//			          System.out.println("Service removed successfully!");  
//			          System.out.println("Passed!");
//			                }
//			         }
//
//			         catch (Exception e) {
//			          if(driver.findElement(By.xpath("//div[text()='Add-on Service is currently used by Services']"))!= null){
//
//			                  System.out.println("Failed"); 
//			     
//			              }
//			         }
//			    	
//			    }
//		 @Then("^Verify whether user is able to delete the Add-on-service with  appointment or service$")
//		    public void verify_whether_user_is_able_to_delete_the_addonservice_with_appointment()throws Throwable {
//		        
//     	    ADD=new Add_on_service(driver);
//     	   ADD.user_click_delete().click();
//	    	Thread.sleep(3000);
//	        ADD.user_click_on_Yes().click();
//	    	Thread.sleep(3000);
//	    	  driver.findElement(By.xpath("//span[text()='×']")).click();
//	    	  Thread.sleep(3000);
//	        try { 
//		         if(
//		         driver.findElement(By.xpath("//div[text()='Service removed successfully!']"))!= null){
//
//		          System.out.println("Service removed successfully!");  
//		                }
//		         }
//
//		         catch (Exception e) {
//		          if(driver.findElement(By.xpath("//div[text()='Add-on Service is currently used by Services']"))!= null){
//
//		                  System.out.println("Add-on Service is currently used by Services");  
//		              }
//		         }
//		    	
//		    }
//		 @Then("^Verify whether retailer is able to create  Add-on-service$")
//		    public void verify_whether_retailer_is_able_to_create_addonservice()throws Throwable {
//		     
//			  
//			   Thread.sleep(3000);
//  	        ADD=new Add_on_service(driver);
//	        ADD.user_add_new_on_click_Add_on_service().click();
//	    	Thread.sleep(3000);
//	        ADD.user_enter_service_name().sendKeys("Grooming for fish");
//	        Thread.sleep(3000);
//	        ADD.user_enter_service_index().sendKeys("20");
//	        Thread.sleep(3000);
//	        ADD.user_click_on_add().click();
//	        Thread.sleep(3000);
//	        try { 
//		         if(
//		         driver.findElement(By.xpath("//div[text()='Service created successfully!']"))!= null){
//
//		          System.out.println("Service created successfully!");  
//		                }
//		         }
//
//		         catch (Exception e) {
//		          if(driver.findElement(By.xpath("//div[text()='Add-on service already exist with label ::Grooming for fish']"))!= null){
//
//		                  System.out.println("Add-on service already exist with label ::Grooming for fish");  
//		              }
//		         }
//		    	
//		    }
//		 @Then("^Verify whether retailer is able to create Add-on-service  with Existing name$")
//		 public void verify_whether_retailer_is_able_to_create_addonservice_with_existing_name()throws Throwable {
//		        
//		    ADD=new Add_on_service(driver);
//	        ADD.user_add_new_on_click_Add_on_service().click();
//	    	Thread.sleep(3000);
//	        ADD.user_enter_service_name().sendKeys("Grooming for fish");
//	        Thread.sleep(3000);
//	        ADD.user_enter_service_index().sendKeys("20");
//	        Thread.sleep(3000);
//	        ADD.user_click_on_add().click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//*[@id=\"Group_53\"]")).click();
//	        Thread.sleep(3000);
//	        try { 
//		         if(
//		         driver.findElement(By.xpath("//div[text()='Service created successfully!']"))!= null){
//
//		          System.out.println("Service created successfully!");  
//		                }
//		         }
//
//		         catch (Exception e) {
//		          if(driver.findElement(By.xpath("//div[text()='Add-on service already exist with label ::Grooming for fish']"))!= null){
//
//		                  System.out.println("Add-on service already exist with label ::Grooming for fish");  
//		              }
//		         }
//		    	
//		    }
//		 @Then("^Verify whether Add-on-service is able to active from the Add-on-service listing page$")
//		 public void verify_whether_addonservice_is_able_to_active_from_the_addonservice_listing_page()throws Throwable {
//		        
//		    ADD=new Add_on_service(driver);
//		    ADD.user_click_on_edit().click();
//		    Thread.sleep(3000);
//	        ADD.user_click_on_active().click();
//	        Thread.sleep(3000);
//	        ADD.user_click_on_save().click();
//	        Thread.sleep(3000);
//	        try { 
//		         if(
//		         driver.findElement(By.xpath("//div[text()='Service updated successfully!']"))!= null){
//
//		          System.out.println("Service updated successfully!");  
//		                }
//		         }
//
//		         catch (Exception e) {
//		          if(driver.findElement(By.xpath("//div[text()='Please update some value and try again.']"))!= null){
//
//		                  System.out.println("Please update some value and try again.");  
//		              }
//		         }
//		    	
//		    }
//		 @Then("^Verify whether Add-on-service is able to inactive from the Add-on-service listing page$")
//		 public void verify_whether_addonservice_is_able_to_inactive_from_the_addonservice_listing_page()throws Throwable {
//		        
//		    ADD=new Add_on_service(driver);
//		    ADD.user_click_on_edit().click();
//		    Thread.sleep(3000);
//	        ADD.user_click_on_inactive().click();
//	        Thread.sleep(3000);
//	        ADD.user_click_on_save().click();
//	        Thread.sleep(3000);
//	        try { 
//		         if(
//		         driver.findElement(By.xpath("//div[text()='Service updated successfully!']"))!= null){
//
//		          System.out.println("Service updated successfully!");  
//		                }
//		         }
//
//		         catch (Exception e) {
//		          if(driver.findElement(By.xpath("//div[text()='Please update some value and try again.']"))!= null){
//
//		                  System.out.println("Please update some value and try again.");  
//		              }
//		         }
//		    }
//		 @Then("^user clicks on cologne selection$")
//			public void user_clicks_on_cologne_selection() throws Throwable {
//			 
//			 driver.findElement(By.xpath("//*[@id=\"Group_53\"]")).click();
//				
//				System.out.println("User clicks on the link Cologne Selection");
//				Thread.sleep(3000);
//				c = new  CologneSelection(driver);
//				c.selectCologne().click();
//				Thread.sleep(3000);
//				
//			}
//				
//
//			@Then("^verify user can create new cologne selection$")
//			public void verify_user_can_create_new_cologne_selection() throws Throwable {
//				
//				System.out.println("Verify whether user can create a new cologne selection");
//				c = new CologneSelection(driver);
//				c.createNew().click();
//				Thread.sleep(1000);
//				c.enterCologneName().sendKeys("PetLogix AUT 48");
//				c.enterIndex().sendKeys("1");
//				c.addCologne().click();
//				Thread.sleep(3000);
//				if(c.popupMessage().getText().equalsIgnoreCase("Cologne added successfully")) {
//					System.out.println("Cologne added successfully");
//					System.out.println("Passed!");
//				}
//				else {
//					System.out.println("Cologne already exist with name PetLogix AUT_48");
//					System.out.println("Failed!");
//				}
//				
//				Thread.sleep(3000);
//			}
//			
//
//			@Then("^verify user can create cologne selection with existing name$")
//			public void verify_user_can_create_cologne_selection_with_existing_name() throws Throwable {
//				
//				
//				System.out.println("Verify whether user can create cologne selection with existing name");
//				String name="PetLogix AUT 48";
//				String msg="Cologne already exist with name "+name;
//				c = new CologneSelection(driver);
//				c.createNew().click();
//				Thread.sleep(1000);
//				c.enterCologneName().sendKeys(name);
//				c.enterIndex().sendKeys("1");
//				c.addCologne().click();
//				Thread.sleep(3000);
//				if(c.popupMessage().getText().equalsIgnoreCase("Cologne already exist with name "+name)){
//					System.out.println("Cologne already exist with name "+name);
//					System.out.println("Passed!");
//				}
//				else {
//					System.out.println("Cologne added successfully");
//					System.out.println("Failed!");
//				}
//				Thread.sleep(3000);
//			
//			}
//			
//			@Then("^verfiy user can serach from cologne selection page$")
//			public void user_searche_the_cologne_selection() {
//				
//				System.out.println("Verify whether user can serach from the cologne selection listing page");
//				c = new CologneSelection(driver);
//				String name="PetLogix AUT 48";
//				c.searchCologne().sendKeys(name);
//				c.enterSubmit().click();
//				
//				if(driver.findElement(By.xpath("//input[@placeholder='Enter cologne name']")).getText().equalsIgnoreCase(name)) {
//					System.out.println("Element found");
//				}
//				
//			}
//			
//			@Then("^verify user can inactive from cologne selection$")
//			public void verify_user_can_inactive_from_cologne_selection() throws Throwable {
//				
//				System.out.println("Verify whether user is able to inactive from the cologne selections listing page");
//				c = new CologneSelection(driver);
//				String msg ="Cologne updated successfully";
//				Thread.sleep(1000);
//				if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Active")) {
//					c.clickToggle().click();
//					c.clickSave().click();
//					WebDriverWait w = new WebDriverWait(driver,5);
//					String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//					Assert.assertEquals(actualmsg, msg);
//				}
//				else {
//					System.out.println("Failed!");
//				}
//				Thread.sleep(3000);
//			}
//			
//			@Then("^verify user can active from cologne selection$")
//			public void verify_user_can_active_from_cologne_selection() throws Throwable {
//				
//				System.out.println("Verify whether user is able to active from the cologne selections listing page");
//				c = new CologneSelection(driver);
//				String msg ="Cologne updated successfully";
//				
//				c.selectCologne().click();
//				c.searchCologne().sendKeys("PetLogix AUT 48");
//				c.enterSubmit().click();
//				Thread.sleep(1000);
//				if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Inactive")) {
//					c.clickToggle().click();
//					c.clickSave().click();
//					WebDriverWait w = new WebDriverWait(driver,5);
//					String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//					Assert.assertEquals(actualmsg, msg);
//				}
//				else {
//					System.out.println("Failed!");
//				}
//				Thread.sleep(3000);
//				
//				
//			}
//			
//			@Then("^verify user can delete a cologne selection$")
//			public void verify_user_can_delete_a_cologne_selection() throws Throwable {
//				
//				System.out.println("Verify whether user can delete a cologne selection");
//				c = new CologneSelection(driver);
//				
//				c.selectCologne().click();
//				Thread.sleep(1000);
//				c.searchCologne().sendKeys("PetLogix AUT_48");
//				c.enterSubmit().click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[text()='Delete']")).click();
//				
//				driver.findElement(By.xpath("//button[text()='Yes']")).click();
//				
//				Thread.sleep(3000);
//				if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Cologne removed successfully")){
//					System.out.println("Cologne removed successfully");
//					System.out.println("Passed!");
//				}
//				else {
//					System.out.println("Cologne is used in an appointment");
//					System.out.println("Failed!");
//				}	
//				Thread.sleep(1000);
//				c.resetFilters().click();
//				Thread.sleep(3000);
//			}
//			
//			
//			@Then("^verify user can delete a cologne selection with appointment$")
//			public void verify_user_can_delete_a_cologne_selection_with_appointment() throws Throwable {
//				
//				System.out.println("Verify whether user can delete a cologne selection with appointment");
//				c = new CologneSelection(driver);
//				
//				c.searchCologne().sendKeys("NEW COLGNE");
//				c.enterSubmit().click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[text()='Delete']")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[text()='Yes']")).click();
//			
//				
//				Thread.sleep(3000);
//				if(driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText().equalsIgnoreCase("Cologne is used in an appointment")){
//					System.out.println("Cologne is used in an appointment");
//					System.out.println("Passed!");
//				}
//				else {
//					System.out.println("Cologne removed successfully");
//					System.out.println("Failed!");
//				}
//			
//				Thread.sleep(1000);
//				c.closeAlert().click();
//				c.resetFilters().click();
//				Thread.sleep(3000);
//				
//				driver.close();
//			}
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
