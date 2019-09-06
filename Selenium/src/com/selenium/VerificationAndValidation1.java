package com.selenium;

import org.openqa.selenium.By;

public class VerificationAndValidation1 extends BaseTest2 {
	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		 
		String actualValue=driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).getText();
		String expectedValue="Customer service";
		System.out.println("ActualLink: "+actualValue);
		System.out.println("ExpectedLink: "+expectedValue);
		
		//if(expectedValue.equals(actualValue))
		//if(expectedValue.contentEquals(actualValue))
		//if(expectedValue.equalsIgnoreCase(actualValue))
		if(expectedValue.contains(actualValue))
				System.out.println("Both are equal");
		
			else
				System.out.println("Both are not equal");
		
		Thread.sleep(30);
		driver.quit();
		}
		
	}
	


