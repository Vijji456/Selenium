package com.selenium;

import org.apache.log4j.Logger;

public class TC04 extends BaseTest3{
	private static final Logger log=Logger.getLogger(TC04.class.getName());

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		init();
		log.info("the configiration file got loaded..................");
		launch("chromebrowser");
		log.info("The browser is launched:   "+dataload.getProperty("chromebrowser"));
		navigate("amazonurl");
		log.info("Navgated to the url:       "+dataload.getProperty("amazonurl"));
		
		
		selectDropDown("amzondropdown_id","Books");
		log.info("Selected the drop down books by using the locator:  "+amazonorload.getProperty("amzondropdown_id"));
		typeText("amazonTextBox_name","HarryPotter");
		log.info("Searched for the Harrypotter using the locator:  "+amazonorload.getProperty("amazonTextBox_name"));
		clcikSearchButton("amazonsearchbutton_xpath");
		log.info("clicked on search button using the loacator:  "+amazonorload.getProperty("amazonsearchbutton_xpath"));
		
		

	}

}
