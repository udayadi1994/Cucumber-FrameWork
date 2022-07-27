package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Vaccination_Records {
	
public WebDriver driver;
	
	public pet_Vaccination_Records(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, I may need the following vaccination records']/following-sibling::div");
	By click_on_add_new_vaccine=By.xpath("//button[text()='Add new vaccine']");
	By enter_vaccination_type=By.xpath("//input[@placeholder='Enter vaccination type']");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_add_new_vaccine()
	{
		return driver.findElement(click_on_add_new_vaccine);
	}
	public WebElement user_enter_vaccination_type()
	{
		return driver.findElement(enter_vaccination_type);
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
