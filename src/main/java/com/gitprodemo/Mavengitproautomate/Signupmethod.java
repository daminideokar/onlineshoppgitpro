package com.gitprodemo.Mavengitproautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupmethod {

		WebDriver driver;
	
		@FindBy (xpath="//a[contains(text(),'Sign in')]")
		WebElement signinbtn;
		
		
		@FindBy (id="email_create")
		WebElement emailcreatetextbox;
		
		@FindBy (id="SubmitCreate")
		WebElement submitbtn;
		
		
		
	public Signupmethod(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		driver= driver2;
		PageFactory.initElements(driver, this);
		
	}


	public void signup(){
		
		
		signinbtn.click();
		
		
		
		emailcreatetextbox.sendKeys("damu143ddeokar2@gmail.com");
		
		
		
		submitbtn.click();
	}
	
	
}
