package com.selenium;

import org.openqa.selenium.safari.SafariDriver;

public class OpenSafariBrowser {

	public static void main(String[] args) {
		SafariDriver driver=new SafariDriver();
		driver.get("https://www.google.com/");
		
	}

}
