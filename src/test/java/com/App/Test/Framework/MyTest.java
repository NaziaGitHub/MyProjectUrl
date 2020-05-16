package com.App.Test.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class MyTest extends TestCase {

	public void testing()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}

}
