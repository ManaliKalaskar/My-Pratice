package com.io.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.io.base.Base;

public class ConfirmationPage extends Base{

	@FindBy(id="skip")
	WebElement SkipButton;
	
	@FindBy(xpath="/html/body/div[4]/img")
	WebElement ZohoLogo;
	
	
	public ConfirmationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean ValidateZohoLogo() {
		return ZohoLogo.isDisplayed();
		
	}
	
	public HomePage HomePage() throws IOException {
		SkipButton.click();
		return new HomePage();	
	
	}
}
