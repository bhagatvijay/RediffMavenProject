package com.qa.rediff.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.rediff.util.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() //throws IOException
	{
		prop = new Properties();
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//qa//rediff//config//config.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("Firefox"))
		{
			driver = new FirefoxDriver();	
		}
		else if(browserName.equals("Chrome"))
		{	
			driver = new ChromeDriver();	
		}
		else if(browserName.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
