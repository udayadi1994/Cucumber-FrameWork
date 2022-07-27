package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Decease_date {
	
public WebDriver driver;
	
	public pet_Decease_date(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, please enable the field internally, and archive the pet if the field is updated']");
	By click_on_save=By.xpath("//button[text()='Save']");
	By click_next=By.xpath("//button[text()='Next']");
	
	
	public WebElement user_click_on_save()
	{
		return driver.findElement(click_on_save);
	}
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	
	
	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}

}
