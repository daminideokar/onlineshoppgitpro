package com.gitprodemo.Mavengitproautomate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTestgit {
	
	WebDriver driver;
	
  @Test
  public void Regimethod() 
  {
	  
	  Signupmethod ref2 = new Signupmethod(driver);
	  ref2.signup();
	  
	  Registrationmethodtest ref1 = new Registrationmethodtest(driver);
	  ref1.registermethod();
		
		
	  
  }
  @BeforeTest
  public void setup() 
  {
	  System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
		 driver = new ChromeDriver();
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php?controller=order");

  }

  @AfterTest
  public void afterTest()
  
  {
	  
	  
  }
  

}
