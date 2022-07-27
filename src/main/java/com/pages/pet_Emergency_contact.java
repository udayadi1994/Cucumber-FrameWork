package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Emergency_contact {
public WebDriver driver;
	
	public pet_Emergency_contact(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, for certain services I need to maintain emergency contact information for pets']");
	By click_on_add_new=By.xpath("//button[text()='Add new']");
	By enter_emergency_contact=By.xpath("//input[@placeholder='Add a new emergency contact']");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_next=By.xpath("//button[text()='Next']");
	
	
	
	
	public WebElement user_click_on_add_new()
	{
		return driver.findElement(click_on_add_new);
	}
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_enter_emergency_contact()
	{
		return driver.findElement(enter_emergency_contact);
	}
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add);
	}

	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}

}
