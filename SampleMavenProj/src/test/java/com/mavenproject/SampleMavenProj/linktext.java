package com.mavenproject.SampleMavenProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class linktext extends BaseTest3{
	@BeforeMethod(groups= {"smoke","sanity"})
	@Parameters("browser")
	 public void beforeMethod(String browserType) throws Exception 
	 {
			init();		
			launch(browserType);		
			navigate("likTextUrl");	
	 }

	  @Test(groups= {"smoke","sanity"})
	  public void linktexttest() {
		  List<WebElement> list = driver.findElements(By.tagName("a"));
		  for(int i=0;i<list.size();i++)
		 {
			  String linkName=list.get(i).getText();
			  System.out.println(linkName);
			  list=driver.findElements(By.tagName("a"));
			  
		  }
		  
	  }
	  

	  @AfterMethod(groups= {"smoke","sanity"})
	  public void afterMethod() {
		  closeBrowser();
	  }

	}