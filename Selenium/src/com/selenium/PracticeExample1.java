package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeExample1 {
public static String flipkartpath=System.getProperty("user.dir")+"//flipkart.properties";
public static Properties flipProp=null;
public static WebDriver driver;
public static void init() throws Exception
{
	FileInputStream fis=new FileInputStream(flipkartpath);
	flipProp=new Properties();
	flipProp.load(fis);
	System.out.println("The flipkart Properties file is loaded......");
}
public static void navigate(String url) {
	driver.get(flipProp.getProperty(url));
}

public static void launch(String browser) {
	if(flipProp.get(browser).equals("chrome")) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		driver=new ChromeDriver(options);
	}
	else if(flipProp.get(browser).equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	}
	else {
		System.out.println("Browser is not matched......");
	}
}
public static void clickSearchButton(String button) {
	driver.findElement(By.xpath(flipProp.getProperty(button))).click();
	
}

public static void typeText(String entertext, String value) throws InterruptedException {
	driver.findElement(By.xpath(flipProp.getProperty(entertext))).sendKeys(value);
	Thread.sleep(3000);
}


}
