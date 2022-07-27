package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Temperament {
   
public WebDriver driver;
	
	public pet_Temperament(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, please display the following selections for temperament']");
	By click_on_addnew=By.xpath("//button[text()='Add new']");
	By enter_temperament=By.xpath("//label[text()='Your progress on pet configuration']/following::input");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_addnew()
	{
		return driver.findElement(click_on_addnew);
	}
	public WebElement user_enter_temperament()
	{
		return driver.findElement(enter_temperament);
	}
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add);
	}
	public WebElement user_click_on_next()
	{
		return driver.findElement(click_on_next);
	}
}
