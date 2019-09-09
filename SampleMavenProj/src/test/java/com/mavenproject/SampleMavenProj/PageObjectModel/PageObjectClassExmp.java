package com.mavenproject.SampleMavenProj.PageObjectModel;

import org.testng.annotations.Test;

import com.mavenproject.SampleMavenProj.BaseTest3;


import org.testng.annotations.BeforeMethod;

public class PageObjectClassExmp extends BaseTest3{
 
	PageObjectClass page;
  @BeforeMethod
  public void satrtProcess() throws Exception {
	    init();		
	  	launch("chromebrowser");
		navigate("automationurl");
		
  }
  @Test
  public void Registraion() throws InterruptedException {
	 page=new PageObjectClass(driver);
	 page.customerRegistration();
  }

}
