package com.io.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public Base() throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\MANALI\\eclipse-workspace\\PomNaveenTest\\src\\main\\java\\com\\io\\config\\config.properties");
		prop=new Properties();
		prop.load(file);	
	}
		
	public void Initalization() throws InterruptedException {
		String browername=prop.getProperty("brower");
		if(browername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
	}
	
}


