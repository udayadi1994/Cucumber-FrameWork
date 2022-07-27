package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductStore {

public WebDriver driver;
	
	public ProductStore(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By AddtoCart2=By.xpath("//*[@id='content_inner']/section/div/div[1]/div[2]/div[6]/button[1]");
	
	

	public WebElement addtoCart2()
	{
		return driver.findElement(AddtoCart2);
		
	}
	
	
}
