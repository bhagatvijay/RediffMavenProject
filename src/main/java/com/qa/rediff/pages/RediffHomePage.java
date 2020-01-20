package com.qa.rediff.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rediff.base.TestBase;

public class RediffHomePage extends TestBase
{
	public RediffHomePage() 
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//div[@class='cell topicons']/a[1]")
	public WebElement rediffmailIcon;
	
	@FindBy(xpath="//a[@class='moneyicon relative']")
	public WebElement moneyIcon;
	
	@FindBy(xpath="//div[@class='cell topicons']/a[text()='Shopping']")
	public WebElement shoppingIcon;
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
}
