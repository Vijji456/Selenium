package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BaseTest1 {
public static WebDriver driver;
public static String datapath=System.getProperty("user.dir")+"//data.properties";
public static Properties dataload=null;

public static void init1() throws Exception {
	FileInputStream fis1=new FileInputStream(datapath);
	dataload=new Properties();
	dataload.load(fis1);
	System.out.println("Data file got loaded..........");
}

public static void launch(String browser) {
if(dataload.get(browser).equals("chrome"))
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	//System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disablenotification");
	option.addArguments("--start maximized");
	driver=new ChromeDriver(option);
}

else if(dataload.get(browser).equals("firefox"))
{
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	
	//logs removing from console
	//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\Logs\\log.txt");
	
	//add user defined fire fox
	FirefoxOptions option=new FirefoxOptions();
    org.openqa.selenium.firefox.ProfilesIni p=new org.openqa.selenium.firefox.ProfilesIni();
    FirefoxProfile profile=p.getProfile("P1");
    option.setProfile(profile);
    
    profile.setPreference("dom.webnotifications.enabled", false);
    
	driver=new FirefoxDriver(option);

}
else 
{
	System.out.println("The give driver is not matched......");
}
}

public static void navigate(String url)
{
	driver.get(dataload.getProperty(url));
}
}
