//package stepdefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import com.pages.Extended_behavior_information;
//import com.pages.HomePage;
//import com.pages.LoginPage;
//import com.pages.PetWeight;
//import com.pages.SignupPage;
//import com.pages.general_pet_sizes;
//import com.pages.petHairLength;
//import com.pages.petHairTexture;
//import com.pages.petType;
//import com.pages.pet_Allergies;
//import com.pages.pet_Combs_blades;
//import com.pages.pet_Decease_date;
//import com.pages.pet_Docs;
//import com.pages.pet_Emergency_contact;
//import com.pages.pet_Temperament;
//import com.pages.pet_Vaccination_Records;
//import com.pages.pet_Vet;
//import com.pages.pettype_Desired_Hair_Length;
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
//public class BKI_Pettype {
//
//	public WebDriver driver;
//	
//	HomePage h;
//	LoginPage l;
//	SignupPage s;
//	Extended_behavior_information EBI;
//	petType PT;
//	PetWeight PW;
//	petHairLength PHL;
//	general_pet_sizes GPS;
//	petHairTexture PHT;
//	pettype_Desired_Hair_Length PDHL;
//	pet_Combs_blades PCB;
//	pet_Temperament PTP;
//	pet_Vaccination_Records PVR;
//	pet_Allergies PA;
//	pet_Vet PV;
//	pet_Docs PD;
//	pet_Emergency_contact PEC;
//	pet_Decease_date PDD;
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
//			  System.out.println("Switch to bookit");
//	
//			Thread.sleep(5000);
//		
//		}
//		@Then("^user click on booking tab$")
//	    public void user_clicks_signinlink() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//        h.user_click_booking().click();	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	 @Then("^user click on Configuration$")
//	    public void  user_click_on_Configuration() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//        h.user_click_configuration().click();
//	     Thread.sleep(7000);
//	    h.user_click_Pet_Types().click();
//	    Thread.sleep(7000);
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//		  js.executeScript("window.scrollBy(0,450)", "");
//	    }
//	 @Then("^Verify whether user is able to delete the Pet Type$")
//	    public void verify_whether_user_is_able_to_delete_the_pet_type() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_delete_pet_type().click();
//			   Thread.sleep(3000);
//		  PT.user_click_on_yes().click();
//			   System.out.println("pet type deleted ");
//			
//			   Thread.sleep(3000);
//			   try { 
//			         if(
//			         driver.findElement(By.xpath("//div[text()='Pet type deleted successfully']"))!= null){
//
//			          System.out.println("Pet type deleted successfully");  
//			                }
//			         }
//
//			         catch (Exception e) {
//			          if(driver.findElement(By.xpath("//div[text()='Pet Type is currently used by Venues']"))!= null){
//
//			                  System.out.println("Pet Type is currently used by Venues");  
//			              }
//			         }
//			   Thread.sleep(3000);
//			    }
//	 @Then("^user enter pet name$")
//	  public void user_enter_petname() throws Throwable {
//		 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		  js.executeScript("window.scrollBy(0,-250)", ""); 
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_enter_petname().sendKeys("abc");
//			   Thread.sleep(3000);
//			   System.out.println("user Enter petname");
//		    	
//		    }
//	 @Then("^user insert image$")
//	  public void user_insert_image() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_enter_petimage().sendKeys("C:\\Users\\manis\\OneDrive\\Desktop\\etailpet\\labrador-retriever-dog-breed-info.jpg");
//		  PT.user_click_next().click();
//		  System.out.println("user Enter Pet image");
//		  Thread.sleep(3000);	
//		    }
//	  @Then("^Check retailer is able to select the weight range option as no / exact weight and weight ranges$")
//	  public void user_click_on_nextbutton_weightpage() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  
//		  PW=new PetWeight(driver);
//		  Thread.sleep(3000);
//		  PW.user_click_on_yes().click();
//		  Thread.sleep(4000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  PW.user_enter_min_weight().sendKeys("10");
//		  Thread.sleep(3000);
//		  PW.user_enter_max_weight().sendKeys("20");
//		  Thread.sleep(3000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
// 		  js.executeScript("window.scrollBy(0,350)", "");
// 		 Thread.sleep(4000);
//		  PW.user_enter_max_weight1().sendKeys("30");
//		  Thread.sleep(3000);
//		  PW.user_click_on_addnewrange().click();
//		  Thread.sleep(4000);
//		  PW.user_enter_max_weight2().sendKeys("40");
//		  Thread.sleep(3000);
//		  PT.user_click_next().click();
//		  Thread.sleep(4000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Configure the given ranges to standardize some things in your system for the genernal sizing of the pet type, any weight that is entered that is larger than the large pet type will be considered as extra large']"));
//		  String text1 = title.getText();
//		  String text2 = "Configure the given ranges to standardize some things in your system for the genernal sizing of the pet type, any weight that is entered that is larger than the large pet type will be considered as extra large";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text1, text2);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	  }
//	  @Then("^Check retailer is able to enter the size$")
//	  public void Check_retailer_is_able_to_enter_the_size() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//	  
//		  GPS=new general_pet_sizes(driver);
//		  GPS.user_enter_size().sendKeys("10");
//		  Thread.sleep(3000);
//		  GPS.user_enter_size1().sendKeys("20");
//		  Thread.sleep(3000);
//		  GPS.user_enter_size2().sendKeys("30");
//		  Thread.sleep(4000);
//		  PT.user_click_next().click();
//		  Thread.sleep(4000);
////		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"));
////		  String text1 = title.getText();
////		  String text2 = "Set the Hair Lengths options you wish to offer for Pet Parents to describe this ";
////		  //Assert.assertEquals(text1, text2);		
////		  try{
////	          Assert.assertEquals(text1, text2);
////	          System.out.println( " - passed");
////	     }catch(AssertionError e){
////	          System.out.println( " - failed");
////
////	        throw e;
////	     }
//	  }
//	  @Then("^check retailer by clicking on the add new hair length option will open a text box and add button were retailer can able to give data.$")
//	  public void user_verify_retailer_directedtohair_lengthpage() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHL=new petHairLength(driver);
//		  PHL.user_click_add_new_hair_lenght().click();
//		  Thread.sleep(3000);
//		  PHL.user_add_new_hair_lenght().sendKeys("medium");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("20");
//		  Thread.sleep(3000);
//		  PHL.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_active().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_deactive().click();
//		  Thread.sleep(3000);
//		  PT.user_click_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"));
//		  String text3 = title.getText();
//		  String text4 = "Set the Hair Texture options you wish to offer for Pet Parents to describe this abc";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verfiy able add new hair texture by clicking on the add new hair texture link$")
//	    public void verfiy_add_new_hair_texture_by_clicking_on_the_add_new_hair_texture_link() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHT=new petHairTexture(driver);
//		  PHT.user__click_add_new_texture().click();
//		  Thread.sleep(3000);
////		  PHL.user_add_hair_index().sendKeys("20");
//		 Thread.sleep(3000);
//		 
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"));
//		  String text3 = title.getText();
//		  String text4 = "Set the Hair Texture options you wish to offer for Pet Parents to describe this abc";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//		  		    	
//  }
//	  @Then("^Check retailer is able to give hair texture with new option by clicking on the add new texture. check retailer is able to activate  and deactivate the hair Texture options and check Retailer is able to delete the Hair texture option$")
//	    public void verfiy_add_new_hair_texture_by_clicking_on_the_add_new_hair_textures_link() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHT=new petHairTexture(driver);
//		  PHT.user__Enter_add_new_texture().sendKeys("curly");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("30");
//		  Thread.sleep(3000);
//		  PHT.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_active().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_deactive().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Texture options you wish to offer for Pet Parents to describe this ']"));
//		  String text3 = title.getText();
//		  String text4 = "Set the Hair Texture options you wish to offer for Pet Parents to describe this abc";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//		  		    	
//}
//	  
//	  @Then("^Check retailer is able to give hair texture without name and click on save button$")
//	    public void verify_retailer_is_able_to_give_hair_texture_wthout_name_and_click_on_save_button() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHT=new petHairTexture(driver);
//		  PHT.user__click_add_new_texture().click();
//		  Thread.sleep(3000);
////		  PHT.user__Enter_add_new_texture().sendKeys("");
//		  Thread.sleep(3000);
////		  PHL.user_add_hair_index().sendKeys("");
//		  Thread.sleep(3000);
//		  PHT.user_click_on_add().click();
//		 Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.className("Toastify__toast-body"));
//		  String text5 = title.getText();
//		  String text6 = "Please Enter hair texture options like Curly/Straight etc.";
//		  Thread.sleep(3000);
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text5, text6);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//		  		    	
//  }
//	  
//	  @Then("^Check retailer by clicking on the next button will directing to deisred hair length page$")
//	    public void verify_retailer_by_clicking_on_the_next_button_will_directing_to_deisred_hair_length_page() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PHT=new petHairTexture(driver);
//		  PHT.user_click_on_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//h6[text()='Pet Type: ']"));
//		  String text3 = title.getText();
//		  String text4 = "Pet Type: abc - Desired Hair Length";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is able to select any option from the desired hair length option$")
//	    public void verify_retailer_is_able_to_seelct_any_option_from_the_deired_hair_length_option() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PDHL=new pettype_Desired_Hair_Length(driver);
//		  PDHL.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about desired hair lengths for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about desired hair lengths for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer while clicking on the Add new link will open a new filed to enter the hair texture and able to activate and deactivate the hair texture$")
//	    public void verify_retailer_while_clicking_the_addnewlink_will_open_new_filed_enter_the_hair_texture_and_by_clicking_on_the_add_button_will_able_to_save_the_hair_texture() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PDHL=new pettype_Desired_Hair_Length(driver);
//		  PDHL.user_click_on_add_new().click();
//		  Thread.sleep(3000);
//		  PDHL.user_enter_desired_hair_length().sendKeys("long");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("15");
//		  Thread.sleep(3000);
//		  PDHL.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_active().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_deactive().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about desired hair lengths for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about desired hair lengths for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify after clciking on the next button user is direting to combs and blades section$")
//	    public void verify_after_clciking_on_the_next_button_user_is_direting_to_combs_and_blades_section() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PDHL=new pettype_Desired_Hair_Length(driver);
//		  PDHL.user_click_on_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to maintain internal notes on combs and blades available to use for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify user is able to select any option from the combs and blades$")
//	    public void verify_user_is_able_to_select_any_option_from_the_combs_and_blades() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PCB=new pet_Combs_blades(driver);
//		  PCB.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to maintain internal notes on combs and blades available to use for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer by clicking on add new option inside the combs will able to give data$")
//	    public void verify_retailer_by_clicking_on_add_new_option_inside_the_combs_will_able_to_give_data() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PCB=new pet_Combs_blades(driver);
//		  PCB.user_click_add_combs().click();
//		  Thread.sleep(3000);
//		  PCB.user_enter_value_on_combs().sendKeys("12");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("15");
//		  Thread.sleep(3000);
//		  PCB.user_click_on_add().click();
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to maintain internal notes on combs and blades available to use for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is able to give blades options$")
//	    public void verify_retailer_is_able_to_give_blades_options() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PCB=new pet_Combs_blades(driver);
//		  PCB.user_click_add_blades().click();
//		  Thread.sleep(3000);
//		  PCB.user_enter_value_on_blades().sendKeys("20");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index1().sendKeys("10");;
//		  Thread.sleep(3000);
//		  PCB.user_click_on_add_blades().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to maintain internal notes on combs and blades available to use for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to maintain internal notes on combs and blades available to use for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer by clicking on the next button will directing to Temperament$")
//	    public void verify_retailer_by_clicking_on_the_next_button_will_directing_to_temperament() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PCB=new pet_Combs_blades(driver);
//		  PCB.user_click_on_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about temperament for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is able to select option no/yes$")
//	    public void verify_retailer_is_able_to_select_option_noyes() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PTP=new pet_Temperament(driver);
//		  PTP.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about temperament for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is able to add temperment by clicking on the add new link- click add button$")
//	    public void verify_retailer_is_able_to_add_temperment_by_clicking_on_the_add_new_link_click_add_button() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PTP=new pet_Temperament(driver);
//		  PTP.user_click_on_addnew().click();
//		  Thread.sleep(3000);
//		  PTP.user_enter_temperament().sendKeys("Assertive");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("15");
//		  Thread.sleep(3000);
//		  PTP.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about temperament for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is able to activate or deactivate the Temperament and delete the Temperament$")
//	    public void verify_retailer_is_able_to_add_temperment_by_clicking_on_the_add_new_link_click_add_buttons() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PTP=new pet_Temperament(driver);
//		  PHL.user_click_on_active().click();
//		  Thread.sleep(3000);
//		  PHL.user_click_on_deactive().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you wish to ask about temperament for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you wish to ask about temperament for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by clicking on next button it will directing to next section$")
//	    public void check_by_clicking_on_next_button_it_will_directing_to_next_section() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PTP=new pet_Temperament(driver);
//		  PTP.user_click_on_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you need to have vaccination records for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to have vaccination records for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify user is able to select any option$")
//	    public void verify_user_is_able_to_select_any_option() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PVR=new pet_Vaccination_Records(driver);
//		  PVR.user_click_on_yes().click();
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you need to have vaccination records for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to have vaccination records for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify user is able to click on addnewvaccine link by clicking newtable will open to addvaccination details$")
//	    public void verify_user_is_able_to_click_on_addnewvaccine_link_by_clicking_newtable_will_open_to_addvaccination_details() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PVR=new pet_Vaccination_Records(driver);
//		  PVR.user_click_on_add_new_vaccine().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you need to have vaccination records for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to have vaccination records for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify user enter vaccine name clickanadd create vaccine option adminstration,expiry and document uploadcheckboxes  based retailer wish ableto configureit$")
//	    public void verify_user_enter_vaccine_name_clickanadd_create_vaccine_option_adminstrationexpiry_and_document_uploadcheckboxes_based_retailer_wish_ableto_configureit() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PVR=new pet_Vaccination_Records(driver);
//		  PVR.user_enter_vaccination_type().sendKeys("Rabies");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("15");
//		  Thread.sleep(3000);
//		  PVR.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='Do you need to have vaccination records for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to have vaccination records for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by clicking on the next buttom it will  directing to next page$")
//	    public void verify_by_clicking_on_the_next_buttom_it_will_directing_to_next_page() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PVR=new pet_Vaccination_Records(driver);
//		  PVR.user_click_on_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//div[@class='mb-4']//p[1]"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to ask about allergies for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by selecting the option as -yes and click on next will directing to exit page$")
//	    public void verify_by_selecting_the_option_as_yes_and_click_on_next_will_directing_to_ext_page() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PA=new pet_Allergies(driver);
//		  PA.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//div[@class='mb-4']//p[1]"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to ask about allergies for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by seelcting the third  option - input filed will generated for giving the data$")
//	    public void verify_by_seelcting_the_third_option_input_filed_will_generated_for_giving_the_data() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PA=new pet_Allergies(driver);
//		  PA.user_click_on_yes1().click();
//		  Thread.sleep(3000);
//		  PA.user_enter_allergies().sendKeys("potato");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("10");
//		  Thread.sleep(3000);
//		  PA.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PA.user_click_on_next().click();
//		  Thread.sleep(3000);
//		 WebElement title = driver.findElement(By.xpath("//div[@class='mb-4']//p[1]"));
//		  String text3 = title.getText();
//		  String text4 = "Do you need to know who the vet is for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by add vet information by select yes$")
//	    public void verify_by_add_vet_information_by_select_yes() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PV=new pet_Vet(driver);
//		  PV.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  PV.user_enter_vet().sendKeys("Vet info");
//		  Thread.sleep(3000);
//		  PHL.user_add_hair_index().sendKeys("10");
//		  Thread.sleep(3000);
//		  PV.user_click_on_add().click();
//		  Thread.sleep(3000);
//		  PV.user_click_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I also need to get the following other docs for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I also need to get the following other docs for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify retailer is selected the option as yes -able to document upload$")
//      public void verify_retailer_is_selected_the_option_as_yes_able_to_document_upload() throws Throwable {
//        
//	  Thread.sleep(3000);
//	    //ps=new ProductStore (driver);
//	   // ps.addtoCart2().click();
//	  PD=new pet_Docs(driver);
//	  PD.user_click_on_yes().click();
//	  Thread.sleep(3000);
//      PD.user_click_on_reacthandle().click();
//    Thread.sleep(3000);
//      Thread.sleep(3000);
//	  WebElement title = driver.findElement(By.xpath("//p[text()='I also need to get the following other docs for this pet type']"));
//	  String text3 = title.getText();
//	  String text4 = "I also need to get the following other docs for this pet type";
//	  //Assert.assertEquals(text1, text2);		
//	  try{
//          Assert.assertEquals(text3, text4);
//          System.out.println( " - passed");
//     }catch(AssertionError e){
//          System.out.println( " - failed");
//
//        throw e;
//     }
//    	
//    }
//	  @Then("^Verify by clicking on next button it will directing to Emergency Contact$")
//	  public void verify_by_clicking_on_next_button_it_will_directing_to_emergency_contact() throws Throwable {
//        
//	  Thread.sleep(3000);
//	    //ps=new ProductStore (driver);
//	   // ps.addtoCart2().click();
//	  PD=new pet_Docs(driver);
//	      JavascriptExecutor js = (JavascriptExecutor) driver;
//	  	js.executeScript("window.scrollBy(0,650)", "");
//	  PD.user_click_next().click();
//	  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to get an emergency contact for this pet type?']"));
//	  String text3 = title.getText();
//	  String text4 = "I would like to get an emergency contact for this pet type?";
//	  //Assert.assertEquals(text1, text2);		
//	  try{
//          Assert.assertEquals(text3, text4);
//          System.out.println( " - passed");
//     }catch(AssertionError e){
//          System.out.println( " - failed");
//
//        throw e;
//     }
//    	
//    }
//	  @Then("^Verify by  selectng as -yes - able to add emergency conatct info$")
//		 public void verify_by_selectng_as_yes_able_to_add_emergency_conatct_info() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		 PEC=new pet_Emergency_contact(driver);
//		 PEC.user_click_on_yes().click();
//		 Thread.sleep(3000);
//		 PEC.user_click_on_add_new().click();
//		 Thread.sleep(3000);
//		 PEC.user_enter_emergency_contact().sendKeys("contact");
//		 Thread.sleep(3000);
//		 PHL.user_add_hair_index().sendKeys("15");
//		 Thread.sleep(3000);
//		 PEC.user_click_on_add().click();
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to get an emergency contact for this pet type?']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to get an emergency contact for this pet type?";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by clicking on the next is directing to Decease Date$")
//	  public void verify_by_clicking_on_the_next_is_directing_to_decease_date() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PEC=new pet_Emergency_contact(driver);
//		  PEC.user_click_next().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to record decease date for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to record decease date for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by  selectng as yes click on save buton, pet creation is competed or not$")
//	  public void verify_by_selectng_as_yes_click_on_save_buton_pet_creation_is_competed_or_not() throws Throwable {
//	        
//		  Thread.sleep(3000);
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PDD=new pet_Decease_date(driver);
//		  PDD.user_click_on_yes().click();
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//p[text()='I would like to record decease date for this pet type']"));
//		  String text3 = title.getText();
//		  String text4 = "I would like to record decease date for this pet type";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//	    	
//	    }
//	  @Then("^Verify by pet created is successfully or not$")
//	    public void verify_by_pet_created_is_successfully_or_not() throws Throwable {
//		
//		  PDD=new pet_Decease_date(driver);
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		  PDD.user_click_on_save().click();  
//		  Thread.sleep(3000);
//		  WebElement title = driver.findElement(By.xpath("//div[text()='Pet type added successfully!']"));
//		  String text3 = title.getText();
//		  String text4 = "Pet type added successfully!";
//		  //Assert.assertEquals(text1, text2);		
//		  try{
//	          Assert.assertEquals(text3, text4);
//	          System.out.println( " - passed");
//	     }catch(AssertionError e){
//	          System.out.println( " - failed");
//
//	        throw e;
//	     }
//		    Thread.sleep(5000);
//		    driver.navigate().refresh();
//		    Thread.sleep(7000);
//	}
//	  
//	  @Then("^Verify whether retailer is able to create   Pet Type with Existing name$")
//	  public void user_enter_petnames() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_enter_petname().sendKeys("abc");
//			   Thread.sleep(3000);
//			   PT.user_enter_petimage().sendKeys("C:\\Users\\manis\\OneDrive\\Desktop\\etailpet\\labrador-retriever-dog-breed-info.jpg");
//			    PT.user_click_next().click();
//			   System.out.println("pet type exist with same name ");
//			   Thread.sleep(3000);
//				  WebElement title = driver.findElement(By.xpath("//div[text()='Pet type already exist with name abc']"));
//				  String text3 = title.getText();
//				  String text4 = "Pet type already exist with name abc";
//				  //Assert.assertEquals(text1, text2);		
//				  try{
//			          Assert.assertEquals(text3, text4);
//			          System.out.println( " - passed");
//			     }catch(AssertionError e){
//			          System.out.println( " - failed");
//
//			        throw e;
//			     }
//				  Thread.sleep(3000);	
//			    }
//	  @Then("^Verify whether Pet Type is able to inactive from the Pet Type listing page$")
//	  public void verify_whether_pet_type_is_able_to_inactive_from_the_pet_type_listing_page() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_click_on_switch().click();
//		  Thread.sleep(4000);
//			   System.out.println("Pet type inactive successfully ");
//				  WebElement title = driver.findElement(By.xpath("//div[text()='Pet type updated successfully']"));
//				  String text3 = title.getText();
//				  String text4 = "Pet type updated successfully";
//				  //Assert.assertEquals(text1, text2);		
//				  try{
//			          Assert.assertEquals(text3, text4);
//			          System.out.println( " - passed");
//			     }catch(AssertionError e){
//			          System.out.println( " - failed");
//
//			        throw e;
//			     }
//				  Thread.sleep(3000);	
//			    }
//	  @Then("^Verify whether Pet Type is able to active from the Pet Type listing page$")
//	  public void verify_whether_pet_type_is_able_to_active_from_the_pet_type_listing_page() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_click_on_switch1().click();
//		  Thread.sleep(4000);
//		  System.out.println("Pet type active successfully");
//				  WebElement title = driver.findElement(By.xpath("//div[text()='Pet type updated successfully']"));
//				  String text3 = title.getText();
//				  String text4 = "Pet type updated successfully";
//				  //Assert.assertEquals(text1, text2);		
//				  try{
//			          Assert.assertEquals(text3, text4);
//			          System.out.println( " - passed");
//			     }catch(AssertionError e){
//			          System.out.println( " - failed");
//
//			        throw e;
//			     }
//				  Thread.sleep(3000);	
//			    }
//	  @Then("^Verify whether Pet Type is able to search  from the Pet Type name in listing page$")
//	    public void verify_whether_pet_type_is_able_to_search_from_the_pet_type_name_in_listing_page() throws Throwable {
//	        
//		    //ps=new ProductStore (driver);
//		   // ps.addtoCart2().click();
//		  PT=new petType(driver);
//		  PT.user_search_pet_type().sendKeys("Rabbit");
//		  Thread.sleep(3000);
//		  PT.user_click_on_submit().click();
//			   System.out.println("Pet type found successfully");
//				
//				  Thread.sleep(3000);
//				  driver.close();
//			    }
//		   
////	  @Then(^verify retailer is able to next hair lenght by clicking on the add new hair length option$")
////      public void user_verify_retailer_clicking_addnew() throws Throwable {
////	        
////		  Thread.sleep(3000);
////		    //ps=new ProductStore (driver);
////		   // ps.addtoCart2().click();
////		  PHL=new petHaiLength(driver);
////		  PHL.user_add_new_hair_lenght().sendKeys("medium");
////		  Thread.sleep(3000);
////		  PHL.user_click_on_add().click();
////		  WebElement title = driver.findElement(By.xpath("//p[text()='Set the Hair Lengths options you wish to offer for Pet Parents to describe this ']"));
////		  String text9 = title.getText();
////		  String text8 = "Set the Hair Lengths options you wish to offer for Pet Parents to describe this labsdogs";
////		  //Assert.assertEquals(text1, text2);		
////		  try{
////	          Assert.assertEquals(text9, text8);
////	          System.out.println( " - passed");
////	     }catch(AssertionError e){
////	          System.out.println( " - failed");
////
////	        throw e;
////	        
////	     }
////		  		    	
////	    }
//	   
//////	 @Then("^Verify the changes When user selects “NO”$")
//////	    public void  Verify_the_changes_When_user_selects_NO() throws Throwable {
//////	        
//////	    
//////	    EBI=new Extended_behavior_information (driver);
//////        EBI.click_on_no().click();
//////	    	Thread.sleep(5000);
//////	    EBI.click_on_save().click();
//////	    Thread.sleep(3000);
//////    	WebElement title = driver.findElement(By.xpath("//div[text()='Extended behavior information updated successfully!']"));
//////		  String text5 = title.getText();
//////		  Thread.sleep(3000);
//////		  String text6 = "Extended behavior information updated successfully!";
//////		 Assert.assertEquals(text5, text6);		
//////		  try{
//////	          Assert.assertEquals(text5, text6);
//////	          System.out.println( " - passed");
//////	     }catch(AssertionError e){
//////	          System.out.println( " - failed");
//////	
//////	        throw e;
//////	     }
//////	    	
//////	    }
//////		
//////	 @Then("^Verify the changes When user selects “Yes”$")
//////	    public void  Verify_the_changes_When_user_selects_Yes() throws Throwable {
//////	        
//////	    h.user_click_extended_behavior().click();
//////	    Thread.sleep(3000);
//////	    EBI=new Extended_behavior_information (driver);
//////        EBI.click_on_yes().click();
//////	    	Thread.sleep(5000);
//////	    EBI.user_sclick_on_allselect().click();
//////	        Thread.sleep(3000);
//////	    EBI.user_select_by_touchingtail().click();
//////        JavascriptExecutor js = (JavascriptExecutor) driver;
//////		js.executeScript("window.scrollBy(0,350)", "");
//////		EBI.user_feels_threatened_selectall().click();
//////		Thread.sleep(3000);
//////		EBI.user_select_never_bitten().click();
//////		Thread.sleep(3000);
//////	    EBI.click_on_save().click();
//////	    Thread.sleep(3000);
////	    try { 
////	         if(
////	         driver.findElement(By.xpath("//div[text()='Extended behavior information updated successfully!']"))!= null){
////
////	          System.out.println("Extended behavior information updated successfully!");  
////	          System.out.println("Passed!");
////	                }
////	         }
////
////	         catch (Exception e) {
////	          if(driver.findElement(By.xpath("//div[text()='At least one behavior out of each section should be selected!']"))!= null){
////	        	  System.out.println("At least one behavior out of each section should be selected!");  
////	                  System.out.println("Failed"); 
////	     
////	             
////	         }
//////		  driver.quit();
//////	    	
//////	    }
////		
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
