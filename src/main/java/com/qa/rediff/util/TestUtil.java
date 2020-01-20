package com.qa.rediff.util;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.qa.rediff.base.TestBase;

public class TestUtil
{
	public TestUtil()
    {
		super();
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static boolean isElementPresent(WebElement element)
	{
		if(element.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
