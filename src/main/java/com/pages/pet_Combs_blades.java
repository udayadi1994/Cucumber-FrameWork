package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Combs_blades {

	
public WebDriver driver;
	
	public pet_Combs_blades(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, please display the following lengths:']");
	By click_add_combs=By.xpath("(//div[@class='p-4']//button)[1]");
	By enter_value_on_combs=By.xpath("//input[@class='form-control mr-3']");
	By click_on_add_combs=By.xpath("//button[text()='Add']");
	By click_add_blades=By.xpath("(//div[@class='p-4']//button)[2]");
	By enter_value_on_blades=By.xpath("//input[@placeholder='Enter blade length']");
	By click_on_add_blades=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
			
	
	
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	
	public WebElement user_click_add_combs()
	{
		return driver.findElement(click_add_combs);
	}
	public WebElement user_enter_value_on_combs()
	{
		return driver.findElement(enter_value_on_combs);
	}
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add_combs);
	}
	public WebElement user_click_add_blades()
	{
		return driver.findElement(click_add_blades);
	}
	public WebElement user_enter_value_on_blades()
	{
		return driver.findElement(enter_value_on_blades);
	}
	public WebElement user_click_on_add_blades()
	{
		return driver.findElement(click_on_add_blades);
	}
	public WebElement user_click_on_next()
	{
		return driver.findElement(click_on_next);
	}
}
