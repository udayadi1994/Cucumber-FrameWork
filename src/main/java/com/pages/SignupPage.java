package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

public WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}  
	

	By firstname=By.xpath("//*[@id='id_first_name']");
	By lastname=By.xpath("//*[@id='id_last_name']");
	By email=By.xpath("//*[@id='id_email']");
	By phonenum=By.xpath("//*[@id='id_phone']");
	By externalID=By.xpath("//*[@id='id_custom_rewards_id']");
	By secondID=By.xpath("//*[@id='id_custom_rewards_id_2']");
	By firstpwd=By.xpath("//*[@id='id_password1']");
	By secondpwd=By.xpath("//*[@id='id_password2']");
	By signupbutton=By.xpath("//*[@id='content_inner']/section/div/div/form/div[9]/button");

	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	public WebElement enterlastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}
	public WebElement enterphonenum()
	{
		return driver.findElement(phonenum);
	}
	public WebElement enterexternalID()
	{
		return driver.findElement(externalID);
	}
	public WebElement secondID()
	{
		return driver.findElement(secondID);
	}
	public WebElement enterpwd()
	{
		return driver.findElement(firstpwd);
	}
	public WebElement entersecondpwd()
	{
		return driver.findElement(secondpwd);
	}
	public WebElement signup()
	{
		return driver.findElement(signupbutton);
	}	
	
	
	
}
