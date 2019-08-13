package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class BaseTest2 {
public static String datapath=System.getProperty("user.dir")+"//data.properties";
public static Properties dataload=null;
public static WebDriver driver;

public static String amazonorpath=System.getProperty("user.dir")+"//amazonor.properties";
public static Properties amazonorload=null;
public static void init() throws Exception
{
	FileInputStream fis=new FileInputStream(datapath);
	dataload=new Properties();
	dataload.load(fis);
	System.out.println("data Properties is loaded...........");
	
	
	FileInputStream fis1=new FileInputStream(amazonorpath);
	amazonorload=new Properties();
	amazonorload.load(fis1);
	System.out.println("Amazon Properties file is loaded......");
}
public static void navigate(String url) {
	driver.get(dataload.getProperty(url));
}

public static void launch(String browser) {
	if(dataload.get(browser).equals("chrome"))
	{
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "null");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\Logs\\log.txt");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(dataload.get(browser).equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	}
}

public static void clickButton(String LocatorKey) throws InterruptedException {
	//driver.findElement(By.xpath(amazonorload.getProperty(LocatorKey))).click();
	getElement(LocatorKey).click();
	Thread.sleep(3000);
	driver.quit();
}

public static void searchText(String LocatorKey, String value) {
	//driver.findElement(By.id(amazonorload.getProperty(LocatorKey))).sendKeys(value);
	getElement(LocatorKey).sendKeys(value);
}

public static void selectDropDown(String LocatorKey, String option) {
	//driver.findElement(By.id(amazonorload.getProperty(LocatorKey))).sendKeys(option);
	getElement(LocatorKey).sendKeys(option);
}
public static WebElement getElement(String LocatorKey)
{
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
}
