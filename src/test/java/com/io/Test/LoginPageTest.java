package com.io.Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.io.base.Base;
import com.io.page.ConfirmationPage;
import com.io.page.HomePage;
import com.io.page.LoginPage;

public class LoginPageTest extends Base{
	LoginPage loginpage;
	ConfirmationPage ConfirmationPage;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod()
	public void setup() throws InterruptedException, IOException {
		Initalization();
		 loginpage= new LoginPage();	 
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String str=loginpage.ValidatePageTitle();
		Assert.assertEquals(str, "Zoho Accounts");
	}
	
	
	@Test(priority=2)
	public Boolean CRMLogoTest() {
		Boolean flag=loginpage.Crmlogo();
		return flag;
	}
	
	@Test(priority=3)
	public void ConfirmationPageTest() throws InterruptedException, IOException {
	ConfirmationPage= loginpage.ConfirmationPageLogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	}
	
	
	@AfterMethod()
	public void shutdown() {
		driver.quit();
	}
	
}
