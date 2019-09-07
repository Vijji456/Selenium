package com.mavenproject.SampleMavenProj;


import com.relevantcodes.extentreports.LogStatus;

public class TC04 extends BaseTest3{
	
	public static void main(String[] args) throws Exception {
		test=report.startTest("TC04");		
				
		init();
		test.log(LogStatus.INFO, "the configiration file got loaded..................");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "The browser is launched: "+dataload.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "Navgated to the url:       "+dataload.getProperty("amazonurl"));
				
		selectDropDown("amzondropdown_id","Books");
		test.log(LogStatus.INFO, "Selected the drop down books by using the locator:  "+amazonorload.getProperty("amzondropdown_id"));
		
		typeText("amazonTextBox_name","HarryPotter");
		test.log(LogStatus.INFO, "Searched for the Harrypotter using the locator:  "+amazonorload.getProperty("amazonTextBox_name"));
		
		clcikSearchButton("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "clicked on search button using the locator:  "+amazonorload.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();

	}

}
