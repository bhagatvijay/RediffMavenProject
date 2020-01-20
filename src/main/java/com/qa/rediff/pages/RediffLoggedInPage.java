package com.qa.rediff.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rediff.base.TestBase;

public class RediffLoggedInPage extends TestBase
{
	public RediffLoggedInPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='rd_logout']")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//a[text()='neha chandrakant rane']")
	public WebElement nameLabel;
	
	public boolean userNameDisplay()
	{
		return nameLabel.isDisplayed();
	}
	
	
	
	
	public void logout()
	{
		logoutBtn.click();
	}
	
	

}
