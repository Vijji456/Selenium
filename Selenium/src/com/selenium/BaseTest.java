package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	public static String datapath=System.getProperty("user.dir")+"//data.properties";//
	public static Properties dataload=null;
	
	
	public static void init() throws Exception {
		FileInputStream fis=new FileInputStream(datapath);
		dataload=new Properties();
		dataload.load(fis);
		System.out.println("Data file got loaded");
		
			}
	
	public static void launch(String browser) {
		if(dataload.get(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
	}
		else if(dataload.get(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Given browser is not matched");
		}
	}
	public static void navigate(String url) {
		
		//driver.navigate().to(dataload.getProperty(url));
		driver.get(dataload.getProperty(url));
	}

}
