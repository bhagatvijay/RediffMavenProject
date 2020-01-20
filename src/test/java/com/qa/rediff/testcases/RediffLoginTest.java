package com.qa.rediff.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.rediff.base.TestBase;
import com.qa.rediff.pages.RediffHomePage;
import com.qa.rediff.pages.RediffLoggedInPage;
import com.qa.rediff.pages.RediffLoginPage;

import junit.framework.Assert;

public class RediffLoginTest extends TestBase
{
	RediffLoginPage loginPage;
	RediffLoggedInPage rediffLoggedInPage;
	
	public RediffLoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		TestBase.initialization();
		System.out.println(driver);
		loginPage = new RediffLoginPage();
		System.out.println(loginPage);
		System.out.println(driver);
	}
	
	@Test
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Rediffmail");
	}
	
	@Test
	public void loginPageTest()
	{
		Object page = loginPage.loginPage(prop.getProperty("un"), prop.getProperty("pwd"));
		
		if(page instanceof RediffLoggedInPage)
		{
			System.out.println("Login is Successful");
			rediffLoggedInPage = (RediffLoggedInPage)page;
		}
		else
		{
		    Assert.fail("Login is Unsuccessful");
		}
		
	}
	
	@Test
	public void logoutPageTest() throws IOException
	{
        Object page = loginPage.loginPage(prop.getProperty("un"), prop.getProperty("pwd"));
		
		if(page instanceof RediffLoggedInPage)
		{
			rediffLoggedInPage = (RediffLoggedInPage)page;
			rediffLoggedInPage.logout();
		}
		else
		{
		    Assert.fail();
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
