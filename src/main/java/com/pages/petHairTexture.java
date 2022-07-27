package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class petHairTexture {
	
public WebDriver driver;
	
	public petHairTexture(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_add_new_texture=By.xpath("//button[text()='Add new hair texture']");
	By enter_add_new_texture=By.xpath("//input[@placeholder='Add a new hair texture']");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	
	public WebElement user__click_add_new_texture()
	{
		return driver.findElement(click_add_new_texture);
	}
	public WebElement user__Enter_add_new_texture()
	{
		return driver.findElement(enter_add_new_texture);
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
