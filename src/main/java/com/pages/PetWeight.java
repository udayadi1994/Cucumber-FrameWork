package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetWeight {
	
public WebDriver driver;
	
	public PetWeight(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_next=By.xpath("//button[text()='Next']");
	By click_on_weight=By.xpath("//strong[text()='Weight']");
	By click_on_yes=By.xpath("//div[text()='Yes, please display the following weight ranges for this pet type in']");
	By click_on_addnewrange=By.xpath("//button[text()='Add new range']");
	By enter_min_weight=By.xpath("//input[@placeholder='Enter min weight']");
	By enter_max_weight=By.xpath("//input[@placeholder='Enter max weight']");
	By enter_max_weight1=By.xpath("(//input[@placeholder='Enter max weight'])[2]");
	By enter_max_weight2=By.xpath("(//input[@placeholder='Enter max weight'])[3]");
	By click_on_save=By.xpath("//button[text()='Save']");
	
	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}
	public WebElement user_click_on_weight()
	{
		return driver.findElement(click_on_weight);
	}
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_addnewrange()
	{
		return driver.findElement(click_on_addnewrange);
	}
	public WebElement user_enter_min_weight()
	{
		return driver.findElement(enter_min_weight);
	}

	public WebElement user_enter_max_weight()
	{
		return driver.findElement(enter_max_weight);
	}
	public WebElement user_enter_max_weight1()
	{
		return driver.findElement(enter_max_weight1);
	}
	public WebElement user_enter_max_weight2()
	{
		return driver.findElement(enter_max_weight2);
	}
	public WebElement user_click_on_save()
	{
		return driver.findElement(click_on_save);
	}
}
