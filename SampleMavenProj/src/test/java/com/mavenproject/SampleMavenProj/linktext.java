package com.mavenproject.SampleMavenProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class linktext extends BaseTest3{
	@BeforeMethod
	 public void beforeMethod() throws Exception 
	 {
			init();		
			launch("chromebrowser");		
			navigate("likTextUrl");	
	 }

	  @Test
	  public void linktexttest() {
		  List<WebElement> list = driver.findElements(By.tagName("a"));
		  for(int i=0;i<list.size();i++)
		 {
			  String linkName=list.get(i).getText();
			  System.out.println(linkName);
			  list=driver.findElements(By.tagName("a"));
			  
		  }
		  
	  }
	  

	  @AfterMethod
	  public void afterMethod() {
		  closeBrowser();
	  }

	}