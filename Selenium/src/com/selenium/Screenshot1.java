package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public static String projectpath=System.getProperty("user.dir");
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, projectpath+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\img1.jpeg"));
		
	}

}
