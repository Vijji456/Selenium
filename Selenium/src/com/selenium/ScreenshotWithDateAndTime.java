package com.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithDateAndTime {
public static String Projectpath=System.getProperty("user.dir");
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Projectpath+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		Date dt=new Date();
		System.out.println(dt);
		//String dateFormat=dt.toString().replace(" ", "_").replace(":", "_");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(screenshot, new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\"+dateFormat+".jpeg"));
		FileHandler.copy(screenshot, new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\"+dateFormat.format(dt)+".jpeg"));
		
	}

}
