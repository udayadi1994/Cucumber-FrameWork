package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductlistPage {

	
public WebDriver driver;
	
	public ProductlistPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By AddtoCart1=By.xpath("//*[@id='carousel']/div[1]/div[1]/div[1]/div/div[2]/a");
	
	

	public WebElement addtoCart1()
	{
		return driver.findElement(AddtoCart1);
		
	}
}
