package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_on_service {
	
public WebDriver driver;
	
	public Add_on_service(WebDriver driver)
	{
		this.driver=driver;
	}

	//By click_dashboard= By.id("dashboard-toggle");
	By click_delete=By.xpath("(//button[text()='Delete'])[1]");
    By click_on_Yes=By.xpath("//button[text()='Yes']");
    By click_delete_appointment=By.xpath("//div[@id='root']/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[6]/table[1]/tbody[1]/tr[1]/td[2]/button[1]");
    By add_new_on_click_Add_on_service=By.xpath("//button[contains(@class,'btn btn-orange')]");
	By enter_service_name=By.xpath("//input[@class='form-control mr-3']");
	By enter_service_index=By.xpath("(//input[@class='form-control mr-3'])[2]");
	By click_on_add=By.xpath("//button[@type='submit']");
	By click_on_edit=By.xpath("(//button[text()='Edit'])[2]");
	By click_on_active= By.xpath("(//div[@class='react-switch-handle'])[2]");
	By click_on_inactive= By.xpath("(//div[@class='react-switch-handle'])[2]");
	By click_on_save=By.xpath("//button[text()='Save']");


	public WebElement user_click_delete()
	{
		return driver.findElement(click_delete);
	}
	public WebElement user_click_on_Yes()
	{
		return driver.findElement(click_on_Yes);
	}
	public WebElement user_click_delete_appointment()
	{
		return driver.findElement(click_delete_appointment);
	}
	public WebElement user_add_new_on_click_Add_on_service()
	{
		return driver.findElement(add_new_on_click_Add_on_service);
	}
	public WebElement user_enter_service_name()
	{
		return driver.findElement(enter_service_name);
	}
	public WebElement user_enter_service_index()
	{
		return driver.findElement(enter_service_index);
	}
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add);
	}
	public WebElement user_click_on_edit()
	{
		return driver.findElement(click_on_edit);
	}
	public WebElement user_click_on_active()
	{
		return driver.findElement(click_on_active);
	}
	public WebElement user_click_on_inactive()
	{
		return driver.findElement(click_on_inactive);
	}
	public WebElement user_click_on_save()
	{
		return driver.findElement(click_on_save);
	}
}
