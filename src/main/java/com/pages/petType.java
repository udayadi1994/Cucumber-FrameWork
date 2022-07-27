package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class petType {
  
public WebDriver driver;
	
	public petType(WebDriver driver)
	{
		this.driver=driver;
	}
	By enter_petname=By.className("form-control");
	By enter_petimage=By.className("custom-file-input");
	By click_next=By.xpath("//button[text()='Next']");
	By click_on_switch=By.xpath("//div[@class='react-switch-bg'][1]");
	By click_on_switch1=By.xpath("//div[@class='react-switch-handle'][1]");
	By search_pet_type= By.xpath("(//input[@class='form-control'])[2]");
	By click_on_submit= By.xpath("//button[text()='Submit']"); 
	By delete_pet_type =  By.xpath("(//button[text()='Delete'])[4]");
	By click_on_yes =  By.xpath("//button[text()='Yes']");
	
   
	public WebElement user_enter_petname()
	{
		return driver.findElement(enter_petname);
	}
	public WebElement user_enter_petimage()
	{
		return driver.findElement(enter_petimage);
	}
	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}
	public WebElement user_click_on_switch()
	{
		return driver.findElement(click_on_switch);
	}
	public WebElement user_click_on_switch1()
	{
		return driver.findElement(click_on_switch1);
	}

  public WebElement user_search_pet_type()
	{
		return driver.findElement(search_pet_type);
	}
  public WebElement user_click_on_submit()
 	{
 		return driver.findElement(click_on_submit);
 	}
  public WebElement user_delete_pet_type()
	{
		return driver.findElement(delete_pet_type);
	}
  public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}


}
