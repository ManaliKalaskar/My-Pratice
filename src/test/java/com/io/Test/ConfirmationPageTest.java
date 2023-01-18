package com.io.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.io.base.Base;
import com.io.page.ConfirmationPage;
import com.io.page.LoginPage;

public class ConfirmationPageTest extends Base{

	public ConfirmationPageTest() throws IOException {
		super();
	}
	
		ConfirmationPage confirmationPage;
	
	LoginPage loginpage;
	
	
	@BeforeMethod()
	public void Setup() throws InterruptedException, IOException {
		Initalization();
		loginpage= new LoginPage();
		confirmationPage=loginpage.ConfirmationPageLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public Boolean ZohoLogoTest() {
		Boolean Flag=confirmationPage.ValidateZohoLogo();
		return Flag;
	}
	
	@Test
	public void HomePageTest() throws IOException {
		confirmationPage.HomePage();
	}
	
	@AfterMethod()
	public void ShutDown() {
		driver.quit();
	}
	
	}
