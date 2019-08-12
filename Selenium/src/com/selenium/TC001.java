package com.selenium;

public class TC001 extends BaseTest {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigate("hdfcurl");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentURL);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.quit();// It closes all opened browsers
		
		//driver.close();   //----- It closes only active browser, back end 
	}

}
