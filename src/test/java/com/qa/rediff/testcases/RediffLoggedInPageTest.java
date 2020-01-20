package com.qa.rediff.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.rediff.base.TestBase;
import com.qa.rediff.pages.RediffLoggedInPage;
import com.qa.rediff.pages.RediffLoginPage;

public class RediffLoggedInPageTest extends TestBase
{
	RediffLoginPage loginPage;
	RediffLoggedInPage rediffLoggedInPage;
	public RediffLoggedInPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new RediffLoginPage();
		Object page = loginPage.loginPage(prop.getProperty("un"), prop.getProperty("pwd"));
		rediffLoggedInPage = (RediffLoggedInPage)page;
	}
	
	@Test
	public void verifyUserNameTest()
	{
		boolean flag = rediffLoggedInPage.userNameDisplay();
		Assert.assertTrue(flag, "Username is not display");
		System.out.println("Username is display");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
