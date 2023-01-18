package com.io.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.io.base.Base;

public class LoginPage extends Base{

	@FindBy(name="LOGIN_ID")
	WebElement username;
	
	@FindBy(id="nextbtn")
	WebElement Button;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="nextbtn")
	WebElement SignUpButton;
	
	@FindBy(xpath ="//*[@id=\"signin_flow\"]/div[1]")
	WebElement CrmLogo;
	
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	//Actions
	public String ValidatePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean Crmlogo() {
		return CrmLogo.isDisplayed() ;
		
	}
	
	public ConfirmationPage ConfirmationPageLogin(String un, String pass) throws IOException  {
		username.sendKeys(un);
		Button.click();
		password.sendKeys(pass);
		SignUpButton.click();
		return new ConfirmationPage();
		
		
	}




	
}
