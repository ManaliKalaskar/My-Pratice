package com.io.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.io.base.Base;
import com.io.page.ConfirmationPage;
import com.io.page.ContactPage;
import com.io.page.HomePage;
import com.io.page.LoginPage;

public class HomePageTest extends Base {
	
	ConfirmationPage confirmationPage;
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod()
	public void SetUp() throws InterruptedException, IOException {
		Initalization();
		loginpage= new LoginPage();
		contactpage= new ContactPage();
		confirmationPage=loginpage.ConfirmationPageLogin(prop.getProperty("username"), prop.getProperty("password"));
		confirmationPage= new ConfirmationPage();
		confirmationPage.HomePage();
	}
	
	@Test()
	public void ValidateHomePageTitleTest() {
		String HomePageTitle=homepage.ValidateHomePageTitle();
		Assert.assertEquals(HomePageTitle, "All Deals");
	}
	
	
	@Test()
	public void VeriftContactLinkTest() {
		contactpage=homepage.ClickOnContactLink();
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
