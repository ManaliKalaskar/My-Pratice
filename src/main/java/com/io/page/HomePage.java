package com.io.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.io.base.Base;

public class HomePage extends Base {
	
		@FindBy(xpath="//*[@id=\"navcontacts\"]/link-to/a/ux-svg")
		WebElement ContactPageLink;
		
		
		@FindBy(xpath="//*[@id=\"navcompanies\"]/link-to/a/span")
		WebElement CompanyPageLink;
		
		@FindBy(xpath="//*[@id=\"navproducts\"]/link-to/a/span")
		WebElement ProductPageLink;
		
		@FindBy(xpath="//*[@id=\"navactivities\"]/link-to/a/span")
		WebElement ActivityPageLink;
		
		public HomePage() throws IOException {
			PageFactory.initElements(driver, this);
		}
		
		public String ValidateHomePageTitle() {
		String str=driver.getTitle();
		return str;
		}
		
		public ContactPage ClickOnContactLink() {
			ContactPageLink.click();
			 return new ContactPage();
		}
		
		public CompanyPage ClickOnCompanyLink() {
			CompanyPageLink.click();
			 return new CompanyPage();
		}
		
		public ActivityPage ClickOnActivityLink() {
			CompanyPageLink.click();
			 return new ActivityPage();
		}
		
}
