package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pettype_Desired_Hair_Length {
	
public WebDriver driver;
	
	public pettype_Desired_Hair_Length(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, please display an open text field for pet parent to enter and describe desired hair length for:']");
	By click_on_add_new=By.xpath("//button[text()='Add new']");
	By enter_desired_hair_length=By.xpath("//label[text()='Your progress on pet configuration']/following::input");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_add_new()
	{
		return driver.findElement(click_on_add_new);
	}
	public WebElement user_enter_desired_hair_length()
	{
		return driver.findElement(enter_desired_hair_length);
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
