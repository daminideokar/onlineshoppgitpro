package com.gitprodemo.Mavengitproautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationmethodtest {

	WebDriver driver ;
	
	@FindBy (name="id_gender")
	WebElement radibtn;
	
	
	@FindBy (name="customer_firstname")
	WebElement firsttextbox;
	
	
	@FindBy (name="customer_lastname")
	WebElement lasttextbox;
	
	
	@FindBy (id="passwd")
	WebElement Pwdtextbox;
	
	
	@FindBy (id="days")
	WebElement SElectboxdays1;
	

	@FindBy (id="months")
	WebElement selectoxmonths;
	

	@FindBy (id="years")
	WebElement SElectyears;
	
	

	@FindBy (id="newsletter")
	WebElement Checkbox;
	
	
	
	
	
	public Registrationmethodtest(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


	public void registermethod(){
		
		radibtn.click();
		
		
		firsttextbox.sendKeys("damu");
		
		
		lasttextbox.sendKeys("deokar");
		
		
		Pwdtextbox.sendKeys("damu123");
		
		
		Select se = new Select(SElectboxdays1);
		se.selectByValue("27");
		
		
		
		Select se2 = new Select(selectoxmonths);
		se2.selectByValue("1");
		
		Select se3 = new Select(SElectyears);
		se3.selectByValue("1994");
		
		
		Checkbox.click();
		
		
		WebElement Checkbox2=driver.findElement(By.id("optin"));
		Checkbox2.click();
		
		WebElement firsttext1box=driver.findElement(By.name("firstname"));
		firsttext1box.sendKeys("damini");
		
		
		WebElement lasttext1box=driver.findElement(By.id("lastname"));
		lasttext1box.sendKeys("deokar");
		
		
		WebElement Companynametext=driver.findElement(By.id("company"));
		Companynametext.sendKeys("abc");
		
		WebElement addresstextbox=driver.findElement(By.id("address1"));
		addresstextbox.sendKeys("five star");
		
		
		WebElement addrestextbox2=driver.findElement(By.id("address2"));
		addrestextbox2.sendKeys("pune");
		
		
		WebElement citytextbox=driver.findElement(By.id("city"));
		citytextbox.sendKeys("pune2");
		
		
		WebElement selectboxstate=driver.findElement(By.id("id_state"));
		Select select2=new Select(selectboxstate);
		select2.selectByValue("5");
		
		WebElement postalcodetextbox=driver.findElement(By.name("postcode"));
		postalcodetextbox.sendKeys("00000");
		
		WebElement selectboxcountry=driver.findElement(By.id("id_country"));
		Select selectcountry  = new Select(selectboxcountry);
		selectcountry.selectByValue("21");
		
		
		WebElement textboxotheraddinfo1=driver.findElement(By.id("other"));
		textboxotheraddinfo1.sendKeys("hello please take something special");
		
		
		WebElement Textboxph=driver.findElement(By.id("phone"));
		Textboxph.sendKeys("1234567891");
		
		WebElement mobiletextbox=driver.findElement(By.id("phone_mobile"));
		mobiletextbox.sendKeys("9123456789");
		
		WebElement addresstextrefe=driver.findElement(By.id("alias"));
		addresstextrefe.sendKeys("kataraj");
		
		
	    WebElement sumbitaccuntbtn=	driver.findElement(By.xpath("//button[@id='submitAccount']"));
  	sumbitaccuntbtn.click();
  	
	  
	}
	
}
