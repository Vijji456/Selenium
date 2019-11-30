package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExmp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.facebook.com/");
		
		js.executeScript("document.getElementById('email').value='vijji'");
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		//js.executeScript("document.getElementById('u_0_b')[0].click()");

		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
