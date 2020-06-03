package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;

	
	// Webdriver as global
	// propoerties class to connet with config file 
	// apachi poi - to read data from congig file- Fileinputstreem class
	// initialize driver
	// Write method to launch url
	
	public TestBase() {
		 pro = new Properties();
		  
		
			FileInputStream fle;
			try {
				fle = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\test\\config\\config.properties");
			
				pro.load(fle);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
				 
	
	public void initialize() {
		String browserName = pro.getProperty("browser");
		if(browserName.equals("CC")) {
			
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Webdriver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Util.page_Load_Timeout,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Util.implicitly_Wait, TimeUnit.SECONDS);
		 }
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");
			driver= new FirefoxDriver();
			
			}
	}
	
	//Method for launching url
	
	public static void geturl(String URL) {
		
		driver.get(pro.getProperty("urlqa"));
		
		
		
	}
	
	

}
