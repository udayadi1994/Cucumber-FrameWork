package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Allergies {
	
public WebDriver driver;
	
	public pet_Allergies(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, I may need to know about allergies, ask for it in a blank field']");
	By click_on_yes1=By.xpath("//div[text()='Yes, I may need to know about allergies, if I do, please ask about it in a dropdown list that contains the following:']");
	By enter_allergies=By.xpath("//label[text()='Your progress on pet configuration']/following::input");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_yes1()
	{
		return driver.findElement(click_on_yes1);
	}
	public WebElement user_enter_allergies()
	{
		return driver.findElement(enter_allergies);
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
