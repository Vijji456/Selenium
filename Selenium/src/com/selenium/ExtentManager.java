package com.selenium;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest3{
	public static ExtentReports extent;
	
	public static ExtentReports getInstance() 
	{
		if(extent==null) {
			Date dt=new Date();
			String filepath=dt.toString().replace(" ", "_").replace(":", "_")+".html";
			extent=new ExtentReports(projectpath+"//HTMLReports//"+filepath);
			extent.loadConfig(new File(projectpath+"//extentreportconfig.xml"));
			extent.addSystemInfo("SeleniumLanguage","4.12.1").addSystemInfo("Environment","Production");
		}
		return extent;
	}

}
