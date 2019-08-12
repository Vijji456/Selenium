package com.selenium;

import org.openqa.selenium.By;

public class TC002 extends BaseTest1{

	public static void main(String[] args) throws Exception {
		init1();
		//launch("firefoxbrowser");
		launch("chromebrowser");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		navigate("amazonurl");
		Thread.sleep(3000);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Philphs");
		//driver.findElement(By.name("field-keywords")).sendKeys("Sony");
		//driver.findElement(By.className("nav-input")).sendKeys("Sony");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sony");
		Thread.sleep(3000);
		//driver.quit();
		
		
	}

}
