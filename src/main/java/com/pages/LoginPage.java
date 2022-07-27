package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//By signup=By.linkText("SIGN UP");
	By Username= By.name("username");
	By Password = By.id("signin-password");
	By Rememberme= By.xpath("//span[text()='Remember me']");
	
	By SIGNINN1=By.xpath("//input[@value='Sign In']");

	public WebElement Rememberme()
	{
		return driver.findElement(Rememberme);
	}
	
	public WebElement enter_username()
	{
		return driver.findElement(Username);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(Password);
	}

	public WebElement clicksignIn()
	{
		return driver.findElement(SIGNINN1);
	}
}
