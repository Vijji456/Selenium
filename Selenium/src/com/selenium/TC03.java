package com.selenium;

import org.apache.log4j.Logger;

public class TC03 extends BaseTest2 {
private static final Logger log=Logger.getLogger(TC03.class.getName());

	public static void main(String[] args) throws Exception {
		init();
		log.info("The Properties files got loaded");
		
		launch("chromebrowser");
		log.info("launching the browser:   "+dataload.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to the URL:    "+dataload.getProperty("amazonurl"));
		
		
		selectDropDown("amzondropdown_id","Books");
		log.info("Selected the drop down books by using the locator:  "+amazonorload.getProperty("amzondropdown_id"));
		
		searchText("amazonTextBox_name","Harrypotter");
		log.info("Searched for the Harrypotter using the locator:  "+amazonorload.getProperty("amazonTextBox_name"));
		
		clickButton("amazonsearchbutton_xpath");
		log.info("clicked on search button using the loacator:  "+amazonorload.getProperty("amazonsearchbutton_xpath"));
	}


}
