package com.qa.rediff.pages;

import java.io.IOException;

import com.qa.rediff.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rediff.base.TestBase;

public class RediffLoginPage extends TestBase
{
	public RediffLoginPage() 
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="login1")
	public WebElement username;
	
	@FindBy(name="passwd")
	public WebElement password;
	
	@FindBy(name="proceed")
	public WebElement loginBtn;
	
	@FindBy(linkText="Home")
	public WebElement homeLink;
	
	@FindBy(xpath="//a[@class='rd_logout']")
	public WebElement logoutBtn;

	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public Object loginPage(String un, String pwd) 
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		if(TestUtil.isElementPresent(logoutBtn))
		{
			return new RediffLoggedInPage();
		}
		else
		{
			return new RediffLoginPage();
		}
		
	}
	
}
