package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseTest3 {
	public static String projectpath=System.getProperty("user.dir");
	public static String datapath=projectpath+"//data.properties";
	public static Properties dataload;
	public static String amazonorpath=projectpath+"//amazonor.properties";
	public static Properties amazonorload;
	public static String log4jpath=projectpath+"//log4j.properties";
	public static WebDriver driver;
	
	//Extent report intilizer
	public static ExtentReports report=ExtentManager.getInstance();
	public static ExtentTest test;
	
	public static void init() throws Exception {
		FileInputStream fis=new FileInputStream(datapath);
		dataload=new Properties();
		dataload.load(fis);
		System.out.println("the data properties file got loaded.........");
		
		
		FileInputStream fis1=new FileInputStream(amazonorpath);
		amazonorload=new Properties();
		amazonorload.load(fis1);
		System.out.println("The amzonor properties file got loaded........");
		
		FileInputStream fis2=new FileInputStream(log4jpath);
		PropertyConfigurator.configure(fis2);
		System.out.println("log 4j file is configured..........");
	}
	public static void launch(String browser) {
		if(dataload.getProperty(browser).equals("chrome"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(dataload.getProperty(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("The given browser is not matched...........");
		}
	}
	public static void navigate(String url) {
		driver.get(dataload.getProperty(url));
	}
	
	public static WebElement getElement(String LocatorKey) {
		WebElement element=null;
		if(LocatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_className")) {
			element=driver.findElement(By.className(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_cssSelector")) {
			element=driver.findElement(By.cssSelector(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_linkText")) {
			element=driver.findElement(By.linkText(amazonorload.getProperty(LocatorKey)));
		}
		else if(LocatorKey.endsWith("_PartialLinkTeaxt")) {
			element=driver.findElement(By.partialLinkText(amazonorload.getProperty(LocatorKey)));
		}
		return element;
		
	}
	public static void selectDropDown(String LocatorKey,String option) {
		getElement(LocatorKey).sendKeys(option);

	}
	public static void typeText(String LocatorKey,String value) {
		getElement(LocatorKey).sendKeys(value);
	}
	public static void clcikSearchButton(String LocatorKey) {
		getElement(LocatorKey).click();
	}

}
