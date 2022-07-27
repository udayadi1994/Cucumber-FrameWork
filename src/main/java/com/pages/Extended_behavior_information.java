package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Extended_behavior_information {

	
public WebDriver driver;
	
	public Extended_behavior_information(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By click_on_no=By.xpath("//div[text()='No, I don’t need to display this for any of my services']");
	By click_on_yes=By.xpath("//div[text()='Yes, I want to ask about this on the website']");
	By click_on_allselect = By.xpath("//label[text()='Select all']");
	By select_by_touchingtail=By.xpath("//label[text()='Touching Tail']");
	By feels_threatened_selectall=By.xpath("(//label[text()='Select all'])[3]");
	By select_never_bitten=By.xpath("//label[text()='Never Bitten']");
	By click_on_save=By.xpath("//button[contains(@class,'btn btn-orange')]");
	
	

	
	public WebElement click_on_yes()
	{
		return driver.findElement(click_on_yes);
		
	}
	public WebElement user_sclick_on_allselect()
	{
		return driver.findElement(click_on_allselect);
		
	}
	public WebElement user_select_by_touchingtail()
	{
		return driver.findElement(select_by_touchingtail);
		
	}
	public WebElement user_feels_threatened_selectall()
	{
		return driver.findElement(feels_threatened_selectall);
		
	}
	public WebElement user_select_never_bitten()
	{
		return driver.findElement(select_never_bitten);
		
	}
	public WebElement click_on_no()
	{
		return driver.findElement(click_on_no);
		
	}
	public WebElement click_on_save()
	{
		return driver.findElement(click_on_save);
		
	}
}
