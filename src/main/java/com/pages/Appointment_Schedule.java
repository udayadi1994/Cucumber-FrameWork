package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Appointment_Schedule {
	
public WebDriver driver;
	
	public Appointment_Schedule(WebDriver driver)
	{
		this.driver=driver;
	}

	//By signup=By.linkText("SIGN UP");
	By Select_Customer= By.xpath("//div[text()='Select...']");
	By enter_customer_name = By.id("react-select-8-input");
	By  enter_customer_name1 = By.xpath("//div[text()='Manisha Sharma']");
	By click_petdetails_scroll = By.xpath("//button[contains(@class,'collapsed btn')]");
	By click_select_pettype = By.xpath("(//input[@autocapitalize='none'])[4]");
	By select_pettype = By.xpath("//div[contains(text(),'rabbit')]");
	By click_on_Temperament = By.xpath("(//input[@autocapitalize='none'])[5]");
	By select_Temperament = By.xpath("(//div[text()='aggressive'])[1]");
	By click_on_hairlength = By.xpath("(//input[@autocapitalize='none'])[6]");
	By select_hairlength = By.xpath("//div[text()='Medium']");
	By click_on_servicetype= By.xpath("//div[@id='root']/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By Enetr_service_typename=By.xpath("(//input[@autocapitalize='none'])[7]");
	By select_servicetype=By.xpath("//div[text()='Grooming']");
	By select_service=By.xpath("(//input[@autocapitalize='none'])[8]");
	By select_servicename=By.xpath("//div[text()='rabbit services']");
//	By select_Attendant=By.xpath("(//input[@autocapitalize='none'])[9]");
//	By select_Attendantjessy=By.xpath("//div[text()='rabbit Attendant']");
	By click_on_selecttimeslot= By.xpath("//button[@class='link-btn btn']");
	

	public WebElement User_Select_Customer()
	{
		return driver.findElement(Select_Customer);
	}
	
	public WebElement User_enter_customer_name()
	{
		return driver.findElement(enter_customer_name);
	}
	
	public WebElement User_enter_customer_name1()
	{
		return driver.findElement(enter_customer_name1);
	}
	public WebElement User_click_petdetails_scroll()
	{
		return driver.findElement(click_petdetails_scroll);
	}
	public WebElement User_click_select_pettype()
	{
		return driver.findElement(click_select_pettype);
	}
	public WebElement User_select_pettype()
	{
		return driver.findElement(select_pettype);
	}
	public WebElement User_click_on_Temperament()
	{
		return driver.findElement(click_on_Temperament);
	}
	public WebElement User_select_Temperament()
	{
		return driver.findElement(select_Temperament);
	}
	public WebElement User_click_on_hairlength()
	{
		return driver.findElement(click_on_hairlength);
	}
	public WebElement User_select_hairlength()
	{
		return driver.findElement(select_hairlength);
	}
	public WebElement user_click_on_servicetype()
	{
		return driver.findElement(click_on_servicetype);
	}
	public WebElement user_Enetr_service_typename()
	{
		return driver.findElement(Enetr_service_typename);
	}
	public WebElement user_select_servicetype()
	{
		return driver.findElement(select_servicetype);
	}
	public WebElement user_select_service()
	{
		return driver.findElement(select_service);
	}

	public WebElement user_select_servicename()
	{
		return driver.findElement(select_servicename);
	}
//	public WebElement user_select_Attendant()
//	{
//		return driver.findElement(select_Attendant);
//	}
//	public WebElement user_select_Attendantjessy()
//	{
//		return driver.findElement(select_Attendantjessy);
//	}
	public WebElement user_click_on_selecttimeslot()
	{
		return driver.findElement(click_on_selecttimeslot);
	}
}
