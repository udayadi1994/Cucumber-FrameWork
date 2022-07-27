package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Schedule {
	
public WebDriver driver;
	
	public Schedule(WebDriver driver)
	{
		this.driver=driver;
	}

	//By click_dashboard= By.id("dashboard-toggle");
	By click_new_appointment=By.xpath("//button[text()='New Appointment']");
	By click_Schedule1=By.xpath("//a[text()='Schedule']");
	By click_schedule=By.xpath("//a[@class='bookit-redirect']");
	By click_configuration=By.linkText("Configuration");
	By click_Add_on_service=By.xpath("//strong[text()='Add-On Services']");
	By click_customers=By.linkText("Customers");
	By click_on_date=By.xpath("//*[@id=\"fc-dom-50\"]");
	By click_extended_behavior=By.xpath("//strong[text()='Extended Behavior Information']");
	By click_Pet_Types=By.xpath("//strong[text()='Pet Types']");
   


	public WebElement user_click_new_appointment()
	{
		return driver.findElement(click_new_appointment);
	}
	public WebElement user_click_Schedule1()
	{
		return driver.findElement(click_Schedule1);
	}
	public WebElement user_click_configuration()
	{
		return driver.findElement(click_configuration);
	}
	public WebElement user_click_Add_on_service()
	{
		return driver.findElement(click_Add_on_service);
	}
	public WebElement user_click_schedule()
	{
		return driver.findElement(click_schedule);
	}
	public WebElement user_click_customers()
	{
		return driver.findElement(click_customers);
	}
	public WebElement user_click_on_date()
	{
		return driver.findElement(click_on_date);
	}
	public WebElement user_click_extended_behavior()
	{
		return driver.findElement(click_extended_behavior);
	}
	public WebElement user_click_Pet_Types()
	{
		return driver.findElement(click_Pet_Types);
	}
}
