package com.App.Test.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest 
{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver","D:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
  }
}
