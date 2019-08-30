package com.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4withDateTime {

	public static String Projectpath=System.getProperty("user.dir");
	public static WebDriver driver;
		public static void main(String[] args) throws IOException {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Projectpath+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("http://www.newtours.demoaut.com/");
			Date dt=new Date();
			System.out.println(dt);
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			
			List<WebElement> linklist = driver.findElements(By.tagName("a"));
			for(int i=0;i<linklist.size();i++) {
				if(!linklist.get(i).getText().isEmpty()) {
					String linkname = linklist.get(i).getText();
					linklist.get(i).click();
					File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileHandler.copy(screenshot, new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Screenshots\\"+linkname+"_"+dateFormat.format(dt)+".jpeg"));
					linklist=driver.findElements(By.tagName("a"));
				}
			}
	
	}

}
