package com.mavenproject.SampleMavenProj;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AmzonUsingTestNg extends BaseTest3 {
  @BeforeMethod
  public void startProcess() throws Exception
  {
	    test=report.startTest("TC04");		
		
		init();
		test.log(LogStatus.INFO, "the configiration file got loaded..................");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "The browser is launched: "+dataload.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "Navgated to the url:       "+dataload.getProperty("amazonurl"));	

  }
  
  @Test
  public void amazon()
  {
	    selectDropDown("amzondropdown_id","Books");
		test.log(LogStatus.INFO, "Selected the drop down books by using the locator:  "+amazonorload.getProperty("amzondropdown_id"));
		
		typeText("amazonTextBox_name","HarryPotter");
		test.log(LogStatus.INFO, "Searched for the Harrypotter using the locator:  "+amazonorload.getProperty("amazonTextBox_name"));
		
		clcikSearchButton("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "clicked on search button using the locator:  "+amazonorload.getProperty("amazonsearchbutton_xpath"));
		
  }
  
  @AfterMethod
  public void endProcess()
  {
	 driver.close();
	 report.endTest(test);
	 report.flush();

  }

}
