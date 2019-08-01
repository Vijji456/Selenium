package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://www.amazon.in/");
		 driver.quit();
	}

}
