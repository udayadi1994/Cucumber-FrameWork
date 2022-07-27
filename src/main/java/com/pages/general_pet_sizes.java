package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class general_pet_sizes {
	
public WebDriver driver;
	
	public general_pet_sizes(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By Enter_size= By.xpath("//input[@placeholder='Enter size']");
	By Enter_size1 = By.xpath("(//input[@placeholder='Enter size'])[2]");
	By Enter_size2= By.xpath("(//input[@placeholder='Enter size'])[3]");
	
	By SIGNINN1=By.xpath("//input[contains(@class,'btn btn-primary')]");

	public WebElement user_enter_size()
	{
		return driver.findElement(Enter_size);
	}
	
	public WebElement user_enter_size1()
	{
		return driver.findElement(Enter_size1);
	}
	
	public WebElement user_enter_size2()
	{
		return driver.findElement(Enter_size2);
	}

	public WebElement clicksignIn()
	{
		return driver.findElement(SIGNINN1);
	}
}
