package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMozillaBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}

}
