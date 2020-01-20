package com.qa.rediff.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.rediff.base.TestBase;
import com.qa.rediff.pages.RediffHomePage;
import com.qa.rediff.pages.RediffLoginPage;

public class RediffHomePageTest extends TestBase
{
	RediffLoginPage loginPage;
	RediffHomePage homePage;
	
	public RediffHomePageTest()
	{
		super();
	}
    
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		loginPage = new RediffLoginPage();
		loginPage.homeLink.click();
	}
	
	@Test
	public void homePageTitleTest()
	{
		homePage = new RediffHomePage();
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
