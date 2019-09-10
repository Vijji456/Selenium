package com.mavenproject.SampleMavenProj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HDFCUsingTestNg extends BaseTest3 {
	@BeforeMethod
	 public void startProcess() throws Exception
	  {
		    test=report.startTest("TC04");		
			
			init();
			test.log(LogStatus.INFO, "the configiration file got loaded..................");
			
			launch("chromebrowser");
			test.log(LogStatus.INFO, "The browser is launched: "+dataload.getProperty("chromebrowser"));
			
			
	  }
	@Test
	public void HDFC(){
		navigate("hdfcurl");
		test.log(LogStatus.INFO, "Navgated to the url:       "+dataload.getProperty("hdfcurl"));	

	}
	
	
	  @AfterMethod
	  public void endProcess()
	  {
		 driver.close();
		 report.endTest(test);
		 report.flush();

	  }
	

}
